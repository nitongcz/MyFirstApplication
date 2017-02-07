package com.example.nitong.service;

import android.os.Build;

import com.example.nitong.utils.StreamTool;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Nitong on 16/7/11.
 */
public class PageService {
    public static String getHtml(String path) throws Exception{
        //创建URL对象
        URL url = new URL(path);
        //创建HTTP连接对象
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        //解决返回code=-1的问题?
        if (Integer.parseInt(Build.VERSION.SDK) < Build.VERSION_CODES.FROYO){
            System.setProperty("http.keepAlive","false");
        }

        //设置连接超时时间
        conn.setConnectTimeout(10000);
        //设置请求方式
        conn.setRequestMethod("GET");


        //判断http返回状态,然后开始获取网页源码的二进制数据
        if (conn.getResponseCode() == 200){
            //先获取输入流对象
            InputStream inStream = conn.getInputStream();
            //获取输入流中的二进制数据
            byte[] data = StreamTool.read(inStream);
            //把二进制数据转换成字符串
            String html = new String(data,"utf-8");
            //返回网页数据
            return html;
        }
        return null;
    }
}
