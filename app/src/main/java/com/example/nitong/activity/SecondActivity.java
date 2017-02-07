//package com.example.nitong.activity;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//
///**
// * Created by Nitong on 2016/11/17.
// */
//
//public class SecondActivity extends Activity {
//    private Button button;
//
//    @Override
//    public void onCreate(Bundle savedInstanceStates){
//        super.onCreate(savedInstanceStates);
//
//        Log.d("SecondActivity",this.toString());
//        super.setContentView(R.layout.main);
//
//        button = (Button)findViewById(R.id.second);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//    @Override
//    protected void onDestroy(){
//        super.onDestroy();
//        Log.d("SecondActivity","onDestroy");
//    }
//}
