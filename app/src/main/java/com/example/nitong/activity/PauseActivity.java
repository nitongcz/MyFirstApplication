package com.example.nitong.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class PauseActivity extends Activity {

//    private static String TAG = "MainActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载布局文件
        setContentView(R.layout.pauseactivity);
//        Log.i(TAG,"onCreate");

    }

    @Override
    protected void onStop() {
//        Log.i(TAG,"onStop");
        super.onStop();
    }

    @Override
    protected void onStart() {
//        Log.i(TAG,"onCreate");
        super.onStart();
    }

    @Override
    protected void onPause() {
//        Log.i(TAG,"onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
//        Log.i(TAG,"onResume");
        super.onResume();
    }

    @Override
    protected void onRestart() {
//        Log.i(TAG,"onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
//        Log.i(TAG,"onDestroy");
        super.onDestroy();
    }






//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
