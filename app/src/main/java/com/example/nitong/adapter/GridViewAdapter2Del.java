package com.example.nitong.adapter;

import android.content.Context;
import android.support.v4.view.LayoutInflaterCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.*;
import android.view.LayoutInflater;

import com.example.nitong.activity.R;

/**
 * Created by Nitong on 2016/12/6.
 */

public class GridViewAdapter2Del extends BaseAdapter {

    private ArrayList<HashMap<String,Object>> myList;
    private Context mContex;
    private TextView name_tv;
    private ImageView img;
    private View deleteView;
    private boolean isShowDelete=false; //根据这个变量来判断是否显示删除按钮，true显示，false不显示

    public GridViewAdapter2Del(Context mContex,ArrayList<HashMap<String,Object>> myList){
        this.mContex=mContex;
        this.myList=myList;
    }

    public void setIsShowDelete(boolean isShowDelelte){
        this.isShowDelete=isShowDelelte;
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Object getItem(int position) {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(mContex).inflate(R.layout.grid_item,null);
        img=(ImageView)convertView.findViewById(R.id.img);
        name_tv=(TextView)convertView.findViewById(R.id.name_tv);
        deleteView=convertView.findViewById(R.id.delete_markView);
        deleteView.setVisibility(isShowDelete?View.VISIBLE:View.GONE); //设置删除按钮是否显示
        img.setBackgroundResource(myList.get(position).get("image").hashCode());
        name_tv.setText(myList.get(position).get("name").toString());

        return convertView;
    }
}
