package com.example.nitong.activity;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.nitong.adapter.GridViewAdapter;
import com.example.nitong.adapter.GridViewAdapter2Del;

import java.util.HashMap;
import android.view.View.OnClickListener;

//import static android.R.style.Animation;


public class MainActivity extends Activity {

//    private EditText summaryText;
//    private EditText titleText;
//    private EditText contentText;

//    private Spinner spinner, spinnerCountry;
//    private TextView textView;
//    private List<CharSequence> data = null;
//    private ArrayAdapter<CharSequence> adapter;

//    private String[] arrays = {"Sunday","Monday","Tuesday",
//            "Wednesday","Tuesday","Friday","Saturday",};

//    private ListView listView;
//
//    private List<Fruit> fruitList = new ArrayList<>();
//    FruitAdapter adapter;

    //11.15
//    private TextView mych = null;
//    private TextView mytext = null;
//    private Button mybut = null;
//    private String fruitData[] = new String[]{"苹果","水蜜桃","西瓜"};
//    private String fruitDesc[] = new String[]{
//            "苹果，植物类水果，多次花果，具有丰富的营养成分，有食疗、辅助治疗等功能。",
//            "西瓜（学名：Citrullus Lanatus，英文：Watermelon），属葫芦科，原产于非洲。",
//            "水蜜桃，在植物分类学上属于蔷薇科，梅属，桃亚属，为落叶小乔木。"};
//
//    private int chNum = 0;  //保存选项

    //11.16
//    private Button btn;
//    String string_userString;
//    String string_userPasswd;

    //11.17
//    private Button btn;
//    private TextView textView;

    //11.23
//    private Button mTimeButton;
//    private TimeCount timeCount;

    //11.28
//    private ImageView imageView1;
//    private ImageView imageView2;
//    Bitmap bitmap;

    //11.29
//    private int[] imgs = {R.drawable.about_logo,R.drawable.about_logo,R.drawable.about_logo};
//    private GestureDetector gestureDetector;
//    private ViewFlipper viewFlipper;
//    private Activity mActivity;


    //12.01
//    private List list = new ArrayList();
//    private ListView listView;

    //12.05
//    private List<Integer> mDatas;
//    private GridView mGridView;
//    private GridViewAdapter adapter;

    //12.06
//    private GridView mGridView;
//    private GridViewAdapter2Del mAdapter;
//    private boolean isShowDelete = false;
//    private ArrayList<HashMap<String,Object>> mList;
//    final String[] name = new String[]{"test","testa","testb","testc","testd","teste",
//            "testf","testg",};
//    final int[] pic = new int[]{R.drawable.account,
//            R.drawable.account,R.drawable.account,
//            R.drawable.account,R.drawable.account,
//            R.drawable.account,R.drawable.account};

    //12.07
//    private static final int IMAGE_REQUEST_CODE = 0;
//    private static final int CAMERA_REQUEST_CODE = 1;
//    private static final int RESIZE_REQUEST_CODE = 2;
//    private static final String IMAGE_FILE_NAME = "head.jpg";
//    private ImageView mImageHeader;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Log.d("MainActivity", this.toString()); //打印日志


//        //需要导入：android.view.Window
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//
        //加载布局文件,通过xml文件形式实现UI
        setContentView(R.layout.main);

//        setupViews(); //实例化控件

//        mGridView=(GridView)findViewById(R.id.gridView);
//        mGridView.setOnItemLongClickListener(this);  //长按事件监听
//        mList=getMenuAdapter(pic,name);
//        mAdapter=new GridViewAdapter2Del(MainActivity.this,mList);
//        mGridView.setAdapter(mAdapter);


//        mGridView = (GridView)findViewById(R.id.gv_test);
//        initDatas();
//
//        adapter=new GridViewAdapter(MainActivity.this,mDatas);
//        mGridView.setAdapter(adapter);
//        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (position==parent.getChildCount()-1){
//                    mDatas.add(R.drawable.about);
//                    Toast.makeText(MainActivity.this,"您点击了添加",Toast.LENGTH_SHORT).show();
//                    adapter=new GridViewAdapter(MainActivity.this,mDatas);
//                    mGridView.setAdapter(adapter);
//                    adapter.notifyDataSetChanged();
//                }
//            }
//        });

//        listView = (ListView)findViewById(R.id.list);
//
//        for (int i=0;i<20;i++){
//            list.add("测试条目"+i);
//        }
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
//                android.R.layout.simple_list_item_1,list);
//
//        listView.setAdapter(adapter);
//
//        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(
//                AnimationUtils.loadAnimation(this,R.anim.zoom_in));
//        layoutAnimationController.setOrder(layoutAnimationController.ORDER_NORMAL);
//
//        listView.setLayoutAnimation(layoutAnimationController);
//
//        listView.startLayoutAnimation();
    }

//    private void setupViews() {
//        mImageHeader = (ImageView)findViewById(R.id.image_header);
//        final Button selectBtn1 = (Button)findViewById(R.id.btn_selectImage);
//        final Button selectBtn2 = (Button)findViewById(R.id.btn_takephoto);
//        selectBtn1.setOnClickListener(this);
//        selectBtn2.setOnClickListener(this);
//    }
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.btn_selectImage:
//                Intent galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
//                galleryIntent.addCategory(Intent.CATEGORY_OPENABLE);
//                galleryIntent.setType("image/*");
//                startActivityForResult(galleryIntent,IMAGE_REQUEST_CODE);
//                break;
//            case R.id.btn_takephoto:
//                if (isSdCardExisting()){
//                    Intent cameraIntent = new Intent("android.media.action.IMAGE_CAPTURE"); //拍照
//                    cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT,getImageUri());
//                    cameraIntent.putExtra(MediaStore.EXTRA_VIDEO_QUALITY,0);
//                    startActivityForResult(cameraIntent,CAMERA_REQUEST_CODE);
//                }else {
//                    Toast.makeText(v.getContext(),"请插入SD卡",Toast.LENGTH_SHORT).show();
//                }
//                break;
//        }
//    }
//
//    @Override
//    public void onActivityResult(int requestCode,int resultCode,Intent data){
//        if (resultCode != RESULT_OK){
//            return;
//        }else {
//            switch (requestCode){
//                case IMAGE_REQUEST_CODE:
//                    resizeImage(data.getData());
//                    break;
//                case CAMERA_REQUEST_CODE:
//                    if (isSdCardExisting()){
//                        resizeImage(getImageUri());
//                    }else {
//                        Toast.makeText(MainActivity.this,"未找到sd卡，无法存储照片",Toast.LENGTH_SHORT).show();
//                    }
//                    break;
//                case RESIZE_REQUEST_CODE:
//                    if (data != null){
//                        showResizeImage(data);
//                    }
//                    break;
//            }
//        }
//        super.onActivityResult(requestCode,resultCode,data);
//    }
//
//    private void showResizeImage(Intent data) {
//        Bundle extras = data.getExtras();
//        if (extras != null){
//            Bitmap photo = extras.getParcelable("data");
//            Drawable drawable = new BitmapDrawable(photo);
//            mImageHeader.setImageDrawable(drawable);
//        }
//    }
//
//    private void resizeImage(Uri uri) {
//        Intent intent = new Intent("com.android.camera.CROP");
//        intent.setDataAndType(uri,"image/*");
//        intent.putExtra("crop","true");
//        intent.putExtra("aspectX",1);
//        intent.putExtra("aspectY",1);
//        intent.putExtra("outputX",150);
//        intent.putExtra("outputY",150);
//        intent.putExtra("return-data",true);
//        startActivityForResult(intent,RESIZE_REQUEST_CODE);
//    }
//
//    private Uri getImageUri() {
//        return Uri.fromFile(new File(Environment.getExternalStorageDirectory(),IMAGE_FILE_NAME));
//    }
//
//    private boolean isSdCardExisting() { //判断sd卡是否存在
//        final String state = Environment.getExternalStorageState();
//        if (state.equals(Environment.MEDIA_MOUNTED)){
//            return true;
//        }else {
//            return false;
//        }
//    }

    //将数据装入list
//    private ArrayList<HashMap<String,Object>> getMenuAdapter(int[] menuImageArray, String[] menuNameArray) {
//
//        ArrayList<HashMap<String,Object>> data = new ArrayList<>();
//        for (int i=0;i<menuImageArray.length;i++){
//            HashMap<String,Object> map = new HashMap<>();
//            map.put("image",menuImageArray[i]);
//            map.put("name",menuNameArray[i]);
//            data.add(map);
//        }
//        return data;
//    }
//
//    @Override
//    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//        if (isShowDelete){
//            isShowDelete=false;
//        }else {
//            isShowDelete=true;
//            mAdapter.setIsShowDelete(isShowDelete);
//            mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                    delete(position); //删除选中项
//                    Log.i("---------->","进来了么");
//                    mAdapter=new GridViewAdapter2Del(MainActivity.this,mList); //重新绑定一次adapter
//                    mGridView.setAdapter(mAdapter);
//                    mAdapter.notifyDataSetChanged(); //刷新GridView
//                }
//            });
//        }
//        Log.i("---------->","进来了没");
//        mAdapter.setIsShowDelete(isShowDelete); //setIsShowDelete()用于传递isShowDelete值
//        return true;
//    }
//
//    //删除选中项方法
//    private void delete(int position){
//        ArrayList<HashMap<String,Object>> newList = new ArrayList<>();
//        if (isShowDelete){
//            mList.remove(position);
//            isShowDelete=false;
//
//        }
//        newList.addAll(mList);
//        mList.clear();
//        mList.addAll(newList);
//    }



//    private void initDatas() {
//        mDatas=new ArrayList<>();
//        mDatas.add(R.drawable.about);
//        mDatas.add(R.drawable.about);
//        mDatas.add(R.drawable.about);
//        mDatas.add(R.drawable.about);
//        mDatas.add(R.drawable.about);
//    }
}
//        mActivity=this;
//
//        viewFlipper = (ViewFlipper)findViewById(R.id.viewflipper);
//        gestureDetector = new GestureDetector(this); //手势监听
//        for (int i=0;i<imgs.length;i++){  //添加图片资源
//            ImageView iv = new ImageView(this);
//            iv.setImageResource(imgs[i]);
//            iv.setScaleType(ImageView.ScaleType.FIT_XY);
//            viewFlipper.addView(iv,new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
//        }
//        viewFlipper.setAutoStart(true);
//        viewFlipper.setFlipInterval(3000);
//        if (viewFlipper.isAutoStart() && !viewFlipper.isFlipping()){
//            viewFlipper.startFlipping();
//        }
//
//        initView();



//        mTimeButton = (Button)findViewById(R.id.btn_time);
//
//        timeCount = new TimeCount(60000,1000);
//
//        mTimeButton.setOnClickListener(new OnClickListener() {
//            @Override
//                public void onClick(View v) {
////                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
////                    startActivity(intent);
//
//                    timeCount.start();
//            }
//        });



//
//    @Override
//    public boolean onTouchEvent(MotionEvent event){
//        viewFlipper.stopFlipping();
//        viewFlipper.setAutoStart(false);
//        return gestureDetector.onTouchEvent(event); //注册手势事件
//    }
//
//    public boolean onDown(MotionEvent arg0){
//        return false;
//    }
//
//    public boolean onFling(MotionEvent e1,MotionEvent e2,float arg2,float arg3){
//        if (e2.getX() - e1.getX() > 120){
//            Animation rInAnim = AnimationUtils.loadAnimation(mActivity, 0);
//            Animation rOutAnim = AnimationUtils.loadAnimation(mActivity,0);
//
//            viewFlipper.setInAnimation(rInAnim);
//            viewFlipper.setOutAnimation(rOutAnim);
//            viewFlipper.showPrevious();
//            return true;
//        }else if (e2.getX() - e1.getX() < -120){
//            Animation lInAnim = AnimationUtils.loadAnimation(mActivity,0);
//            Animation lOutAnim = AnimationUtils.loadAnimation(mActivity,0);
//
//            viewFlipper.setInAnimation(lInAnim);
//            viewFlipper.setOutAnimation(lOutAnim);
//            viewFlipper.showNext();
//            return true;
//        }
//
//        return true;
//    }
//
//    public void onLongPress(MotionEvent arg0){}
//
//    public boolean onScroll(MotionEvent arg0,MotionEvent arg1,float arg2,float arg3){
//        return false;
//    }
//
//    public void onShowPress(MotionEvent arg0){}
//
//    public boolean onSingleTapUp(MotionEvent arg0){
//        return false;
//    }

//    private void initView() {
//        imageView1 = (ImageView)findViewById(R.id.imageview1);
//        imageView2 = (ImageView)findViewById(R.id.imageview2);
//        //读取图片资源
//        bitmap = readBitMap();
//        //对图片进行压缩
//        imageView2.setImageBitmap(zoomBitmap(bitmap, bitmap.getWidth()/4, bitmap.getHeight()/4));
//    }
//
//    /**
//     * 压缩图片
//     * @param bitmap
//     * @param w
//     * @param h
//     * @return
//     */
//    private Bitmap zoomBitmap(Bitmap bitmap, int w, int h) {
//        int width = bitmap.getWidth();
//        int heigh = bitmap.getHeight();
//
//        Matrix matrix = new Matrix();
//        float scaleWidth = ((float) w/width);
//        float scaleHeigh = ((float) h/heigh);
//
//        /**
//         * 通过Matrix的postScale方法进行缩放
//         */
//        matrix.postScale(scaleWidth,scaleHeigh);
//        Bitmap newbwp = Bitmap.createBitmap(bitmap,0,0,width,heigh,matrix,true);
//
//        return newbwp;
//    }
//
//
//    /**
//     * 读取图片资源
//     * @return
//     */
//    private Bitmap readBitMap() {
//        BitmapFactory.Options opt = new BitmapFactory.Options();
//        //设置最佳解码方式
//        opt.inPreferredConfig = Bitmap.Config.RGB_565;
//        //下面2个字段需要组合使用
//        opt.inPurgeable=true;
//        opt.inInputShareable= true;
//
//        //获取图片资源
//        InputStream is = this.getResources().openRawResource(R.drawable.about);
//
//        return BitmapFactory.decodeStream(is,null,opt);
//    }


////        textView = (TextView) findViewById(R.id.mytext);
//
//        btn.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                final ProgressDialog dialog =
//                        ProgressDialog.show(MainActivity.this,"搜索网络...","请耐心等待...");
//                dialog.setProgressStyle(1);
//                dialog.incrementProgressBy(2);
//                new Thread(){
//                   public void run(){
//                       try {
//                           Thread.sleep(3000);
//                       }catch (InterruptedException e){
//                           e.printStackTrace();
//                       }finally {
//                           dialog.dismiss();
//                       }
//                   }
//                }.start();
//            }
//        });

//        btn.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);  //获得layoutInflater对象
//                View view = layoutInflater.from(MainActivity.this).inflate(R.layout.login,null); //获取view对象
//
//                EditText edit_user = (EditText)findViewById(R.id.edit_user);
//                EditText edit_passwd = (EditText)findViewById(R.id.edit_passwd);
//                string_userString = edit_user.getText().toString();
//                string_userPasswd = edit_passwd.getText().toString();
//
//                Dialog dialog = new AlertDialog.Builder(MainActivity.this).setTitle("用户登录")
//                        .setView(view)
//                        .setPositiveButton("登录", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                if (string_userString.equals("yayun")&&string_userPasswd.equals("123456")){
//                                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
//                                }else {
//                                    Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
//                                }
//                            }
//                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                //取消按钮事件
//                                MainActivity.this.finish();
//                            }
//                        }).create();
//                dialog.show();
//            }
//        });

//        btn.setOnClickListener(new OnClickListenerImpl());
//    }
//    private class OnClickListenerImpl implements OnClickListener{
//        @Override
//        public void onClick(View v) {
//            LayoutInflater layoutInflater=LayoutInflater.from(MainActivity.this);//获得layoutInflater对象
//            View view=layoutInflater.from(MainActivity.this).inflate(R.layout.login, null);//获得view对象
//            EditText edit_user=(EditText)view.findViewById(R.id.edit_user);//获取控件
//            EditText edit_passwd=(EditText)view.findViewById(R.id.edit_passwd);
//            string_userString=edit_user.getText().toString();
//            string_userPasswd=edit_passwd.getText().toString();
//            Dialog dialog=new AlertDialog.Builder(MainActivity.this).setTitle("用户登录").setView(view).setPositiveButton("登录", new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialog, int which) {
//                    if(string_userString.equals("yayun")&&string_userPasswd.equals("123456")){
//                        Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
//                    }else{
//                        Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int which) {
//                    // 取消按钮事件
//                }
//            }).create();
//            dialog.show();
//        }
//    }


//        this.mych = (TextView)findViewById(R.id.mych);
//        this.mytext = (TextView)findViewById(R.id.mytext);
//        this.mybut = (Button)findViewById(R.id.mybut);
//
//        this.mybut.setOnClickListener(new OnClickListenerImpl());


//        mybut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Dialog dialog = new AlertDialog.Builder(MainActivity.this)
//                        .setIcon(R.drawable.icon_about_black)
//                        .setTitle("请选择你喜欢吃的水果：")
//                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                MainActivity.this.mych.setText(MainActivity.this.fruitData[MainActivity.this.chNum]);  //设置选项的名称
//                            }
//                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                MainActivity.this.mytext.setText(MainActivity.this.fruitDesc[which]);
//                                MainActivity.this.chNum = which;  //保存选项的索引
////                                MainActivity.this.finish();
//                            }
//                        }).create();
//                dialog.show();
//            }
//        });


//    private class OnClickListenerImpl implements OnClickListener {
//        @Override
//        public void onClick(View v){
//                Dialog dialog = new AlertDialog.Builder(MainActivity.this)
//                        .setIcon(R.drawable.icon_about_black)
//                        .setTitle("请选择你喜欢吃的水果：")
//                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                MainActivity.this.mych.setText(MainActivity.this.fruitData[MainActivity.this.chNum]);  //设置选项的名称
//                            }
//                        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
////                                MainActivity.this.finish();
//                            }
//                        }).setSingleChoiceItems(MainActivity.this.fruitData, 0, new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                MainActivity.this.mytext.setText(MainActivity.this.fruitDesc[which]);
//                                MainActivity.this.chNum = which;  //保存选项的索引
//                            }
//                        }).create();
//                dialog.show();
//        }


//    @Override
//    protected void onRestart(){
//        super.onRestart();
//        Log.d("MainActivity","onRestart");
//    }
//
//    class TimeCount extends CountDownTimer{
//
//        /**
//         * @param millisInFuture    The number of millis in the future from the call
//         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
//         *                          is called.
//         * @param countDownInterval The interval along the way to receive
//         *                          {@link #onTick(long)} callbacks.
//         */
//        public TimeCount(long millisInFuture, long countDownInterval) {
//            super(millisInFuture, countDownInterval);
//        }
//
//        @Override
//        public void onTick(long millisUntilFinished) {
//            mTimeButton.setEnabled(false);
//            mTimeButton.setText(millisUntilFinished / 1000 + "s");
//
//        }
//
//        @Override
//        public void onFinish() {
//            mTimeButton.setEnabled(true);
//            mTimeButton.setText("重新获取");
//        }
//    }

