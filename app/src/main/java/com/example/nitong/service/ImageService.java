package com.example.nitong.service;

import com.example.nitong.utils.StreamTool;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Nitong on 16/7/4.
 */
public class ImageService {
    public static byte[] getImage(String path) throws IOException {
        //把path包装成Url对象
        URL url = new URL(path);
        //创建httpurlconnection对象
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置超时时间和http请求方法
        conn.setConnectTimeout(5000);
        conn.setRequestMethod("GET");
        //读取数据,应该使用输入流
        if (conn.getResponseCode() == 200){
            //判断网络请求返回,获取输入流对象
            InputStream inStream = conn.getInputStream();
            //返回输入流中的二进制数据
            return StreamTool.read(inStream);
        }
        return null;
    }
}
