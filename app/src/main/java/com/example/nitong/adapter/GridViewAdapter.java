package com.example.nitong.adapter;

import android.content.Context;
import android.support.v4.view.LayoutInflaterFactory;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.*;
import android.view.LayoutInflater;
import android.widget.ImageView;

import com.example.nitong.activity.R;

/**
 * Created by Nitong on 2016/12/5.
 */

public class GridViewAdapter extends BaseAdapter {

    private Context context;
    private List<Integer> list;
    LayoutInflater layoutInflater;
    private ImageView mImageView;

    public GridViewAdapter(Context context, List<Integer> list){
        this.context = context;
        this.list = list;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size() + 1;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.grid_item,null);
        mImageView = (ImageView)convertView.findViewById(R.id.img);

        if (position < list.size()){
            mImageView.setBackgroundResource(list.get(position));
        }else {
            mImageView.setBackgroundResource(R.drawable.about);
        }
        return convertView;
    }


}
