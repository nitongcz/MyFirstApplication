package com.example.nitong.service;

import android.content.Context;
import android.support.v4.view.LayoutInflaterCompat;
import android.widget.ArrayAdapter;

import java.util.List;
import android.view.*;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nitong.activity.R;

import static android.R.attr.resource;

/**
 * Created by Nitong on 2016/11/14.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceID;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit> objects) {
        super(context, textViewResourceId, objects);
        resourceID = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Fruit fruit = getItem(position);
        View view;
        ViewHolder viewHolder;

        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceID,null);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);

            view.setTag(viewHolder);

        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        return view;
    }

    class ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
    }
}
