package com.example.nitong.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Nitong on 2016/12/8.
 */

public class DeletableEditText extends EditText {

    private Drawable mRightDrawable;
    private boolean isHasFocus;

    public DeletableEditText(Context context) {
        super(context);
        init();
    }

    public DeletableEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DeletableEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Drawable[] drawables = this.getCompoundDrawables();

        //取得right位置的drawable，即在布局文件中设置的android：drawableRight
        mRightDrawable = drawables[2];

        //设置焦点变化的监听
        this.setOnFocusChangeListener(new FocusChangeListenerImpl());

        //设置EditText文字变化的监听
        this.addTextChangedListener(new TextWatcherImpl());

        //初始化时让右边clean图标不可见
        setClearDrawableVisible(true);
    }

    protected void setClearDrawableVisible(boolean isVisible) {
        Drawable rightDrawable;
        if (isVisible){
            rightDrawable=mRightDrawable;
        }else {
            rightDrawable=null;
        }

        //使用代码设置该控件上个方向的图标
        setCompoundDrawables(getCompoundDrawables()[0],getCompoundDrawables()[1],
                rightDrawable,getCompoundDrawables()[3]);
    }

    private class FocusChangeListenerImpl implements OnFocusChangeListener {
        @Override
        public void onFocusChange(View v, boolean hasFocus) {
            isHasFocus=hasFocus;
            if (isHasFocus){
                boolean isVisible = getText().toString().length() >= 1;
                setClearDrawableVisible(isVisible);
            }else {
                setClearDrawableVisible(false);
            }
        }
    }

    /**
     * 当手指抬起的位置在clean的图标区域，将被视为清除操作getWidth()：得到控件的宽度
     * event.getX():抬起时的坐标(改坐标是相对于控件本身而言)
     * getTotalPaddingRight():clean的图标左边缘至控件右边缘的距离
     * getPaddingRight():clean的图标右边缘至控件右边缘的距离 于是: getWidth() -
     * getTotalPaddingRight()表示: 控件左边到clean的图标左边缘的区域 getWidth() -
     * getPaddingRight()表示: 控件左边到clean的图标右边缘的区域
     *
     */
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event){
////        switch (event.getAction()){
////            case
//        }
    }

    //当输入结束后，判断是否显示右边的clean图标
    class TextWatcherImpl implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
//            boolean isVisible = getText().toString().length() >= 1;
//            setClearDrawableVisible(isVisible);
        }
    }
