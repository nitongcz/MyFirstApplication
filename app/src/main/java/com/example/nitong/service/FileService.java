package com.example.nitong.service;

import android.content.Context;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Nitong on 16/6/28.
 *
 */

public class FileService {
    //创建Android里的context对象,利用这个对象的方法快速创建io读写对象
    private Context context;

    public FileService(Context context) {
        this.context = context;
    }

    public void save(String fileName, String fileContent) throws Exception{

        //创建io对象
        //MODE_PRIVATE,读写文件会覆盖掉原文件的内容
        FileOutputStream outputStream = context.openFileOutput(fileName,Context.MODE_PRIVATE);

        //保存文件
        outputStream.write(fileContent.getBytes());

        //关闭输出流
        outputStream.close();
    }

    public String read(String fileName) throws Exception {
        //创建文件读取对象in,打开读取相应文件名的文件
        FileInputStream in = context.openFileInput(fileName);

        //创建写入内存的对象,将一次读取不完的内容写入内存中
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        //创建读取单位
        byte[] buff = new byte[1024];

        //定义起始值
        int len = 0;

        //使用while循环,当len!=-1时,就一直读取文件内容
        while ((len = in.read(buff)) != -1){
            //往内存中写入数据,从下标0开始
            out.write(buff,0,len);
        }

        //创建读取文件内容的对象data,返回的是字节数组
        byte[] data = out.toByteArray();
        return new String(data);
    }
}
