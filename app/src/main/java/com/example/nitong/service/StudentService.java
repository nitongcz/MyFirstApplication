package com.example.nitong.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import com.example.nitong.activity.IStudent;
//import android.support.annotation.Nullable;

/**
 * Created by Nitong on 16/8/27.
 */

public class StudentService extends Service {

    //定义一个字符数组,作为数据源
    private String[] names = {"张三","李四","王二麻子"};
    //创建Binder对象
    private IBinder binder = new StudentBinder();

    //创建查询姓名的方法
    public String query(int no) {
        if (no > 0 && no < 4) {
            return names[no - 1];
        }
        return null;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    private class StudentBinder extends Binder implements IStudent {

        @Override
        public String queryStudent(int no) {
            return query(no);
        }
    }
}
