//package com.example.nitong.activity;
//
//import android.app.Activity;
//import android.media.MediaPlayer;
//import android.os.Bundle;
//import android.os.Environment;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import java.io.File;
//import java.io.IOException;
//
//
//public class AudioPlayActivity extends Activity {
//
//    private EditText editText;
//    private String path;
//    //创建媒体播放的类
//    private MediaPlayer mediaPlayer;
//    //暂停标识
//    private boolean pause;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //加载布局文件
//        setContentView(R.layout.main);
//
//        //找到文本输入框中的内容
//        editText = (EditText) findViewById(R.id.filename);
//
//        //实例化媒体播放对象
//        mediaPlayer = new MediaPlayer();
//
//    }
//
//    //创建onDestroy()方法,用来销毁mediaPlayer
//    @Override
//    protected void onDestroy() {
//        mediaPlayer.release();
//        mediaPlayer = null;
//        super.onDestroy();
//    }
//
//    //创建播放音乐的方法
//    public void mediaPlay(View v) {
//        //判断用户点击的是哪个按钮
//        switch (v.getId()) {
//            case R.id.play:
//                //拿到输入框中的内容
//                String filename = editText.getText().toString();
//                //创建音频对象
//                File audio = new File(Environment.getExternalStorageDirectory(), filename);
//                //判断文件是否存在,健壮性
//                if (audio.exists()) {
//                    //获得音频文件的绝对路径
//                    path = audio.getAbsolutePath();
//                    //调用播放方法
//                    play();
//                } else {
//                    //告知用户没有发现文件
//                    Toast.makeText(getApplicationContext(), R.string.filenoexits, 1);
//                }
//                break;
//
//            //点击暂停按钮
//            case R.id.pause:
//                if (mediaPlayer.isPlaying()){
//                    //如果正在播放,调用暂停方法
//                    mediaPlayer.pause();
//                    //改变按钮文案
//                    ((Button)v).setText(R.string.continues);
//                }else {
//                    //判断如果是在暂停中
//                    if (pause){
//                        //点击暂停按钮应该继续开始播放音乐
//                        mediaPlayer.start();
//                        //设置暂停标识为true
//                        pause = true;
//                        ((Button)v).setText(R.string.pause);
//                    }
//                }
//                break;
//
//            //点击重播按钮
//            case R.id.replay:
//                if (mediaPlayer.isPlaying()){
//                    //回到时间刻度是0的位置,音频文件以时间刻度来衡量,回到0的位置,就是重头开始播放
//                    mediaPlayer.seekTo(0);
//                }else {
//                    //判断文件是否存在
//                    if (path != null){
//                        //文件存在,调用play方法播放
//                        play();
//                    }
//                }
//                break;
//
//            //点击停止按钮
//            case R.id.stop:
//                if (mediaPlayer.isPlaying()) mediaPlayer.stop();
//                break;
//        }
//    }
//
//    private void play() {
//        try {
//            //因为有重播按钮,所以需要再次进行各项参数的初始化操作
//            mediaPlayer.reset();
//            //设置音频文件路径
//            mediaPlayer.setDataSource(path);
//            //缓冲数据
//            mediaPlayer.prepare();
//            //使用setOnPreparedListener监听缓冲完毕,然后调用start()就可以播放了
//            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                @Override
//                public void onPrepared(MediaPlayer mp) {
//                    //开始播放
//                    mediaPlayer.start();
//                }
//            });
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
////    @Override
////    public boolean onCreateOptionsMenu(Menu menu) {
////        // Inflate the menu; this adds items to the action bar if it is present.
////        getMenuInflater().inflate(R.menu.menu_main, menu);
////        return true;
////    }
////
////    @Override
////    public boolean onOptionsItemSelected(MenuItem item) {
////        // Handle action bar item clicks here. The action bar will
////        // automatically handle clicks on the Home/Up button, so long
////        // as you specify a parent activity in AndroidManifest.xml.
////        int id = item.getItemId();
////
////        //noinspection SimplifiableIfStatement
////        if (id == R.id.action_settings) {
////            return true;
////        }
////
////        return super.onOptionsItemSelected(item);
////    }
//}
