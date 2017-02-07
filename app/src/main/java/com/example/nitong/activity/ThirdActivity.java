package com.example.nitong.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Nitong on 2016/11/23.
 */
public class ThirdActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceStates) {
        super.onCreate(savedInstanceStates);

        Log.d("SecondActivity", "The task ID is " + getTaskId());
        super.setContentView(R.layout.main);
    }
}
