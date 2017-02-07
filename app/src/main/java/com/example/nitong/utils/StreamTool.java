package com.example.nitong.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Nitong on 16/7/4.
 */
public class StreamTool {
    public static byte[] read(InputStream inStream) throws IOException {
        //创建输出流对象,向内存写数据
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        //从输入流中读取字节数组数据,定义字节数组对象
        byte[] buffer = new byte[2048];
        //定义标识位,如果数据长度=-1就结束
        int len = 0;
        //读取到-1就结束
        while ((inStream.read(buffer)) != -1){
            outStream.write(buffer,0,len);
        }
        inStream.close();
        return outStream.toByteArray();
    }
}
