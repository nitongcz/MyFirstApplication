package com.example.nitong.views;

//import static com.example.nitong.activity.R.styleable.View;

//import static android.support.v7.appcompat.R.styleable.View;

//import android.support.v7.widget.FitWindowsViewGroup;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewGroupCompat;
import android.util.AttributeSet;

import android.view.MotionEvent;
import  android.view.View;
import java.util.*;

/**
 * Created by Nitong on 2016/11/11.
 */

public class MyPointView extends View {

    private List<Point> allPoints = new ArrayList<>(); //保持坐标

    public MyPointView(Context context, AttributeSet attrs){
        super(context,attrs);
        super.setBackgroundColor(Color.WHITE);

        super.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Point point = new Point((int)event.getX(),(int)event.getY());

                if (event.getAction() == MotionEvent.ACTION_DOWN){
                    allPoints = new ArrayList<>();  //开始新记录
                    allPoints.add(point);
                }else if (event.getAction() == MotionEvent.ACTION_UP){
                    allPoints.add(point);
                }else if (event.getAction() == MotionEvent.ACTION_MOVE){
                    allPoints.add(point);
                    MyPointView.this.postInvalidate();  //重绘图
                }

                return true;  //表示下面的不再执行了
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        if (allPoints.size() > 1){
            Iterator<Point> iterator = allPoints.iterator();

            Point firstPoint = null;  //开始点
            Point lastPoint = null;   //结束点

            while (iterator.hasNext()){
                if (firstPoint!=null) {  //找到开始点
                    firstPoint = (Point) iterator.next();
                }else {
                    if (lastPoint!=null){
                        firstPoint=lastPoint;
                    }

                    lastPoint=(Point)iterator.next();
                    canvas.drawLine(firstPoint.x,firstPoint.y,lastPoint.x,lastPoint.y,paint);  //画线
                }
            }
        }

        super.onDraw(canvas);
    }

}
