package com.bawei.chenshuaishuai20191203.utils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetUtils {
    private static NetUtils netUtils=new NetUtils();

    private NetUtils() {
    }

    public static NetUtils getInstance() {
        return netUtils;
    }

    //获取json
    @SuppressLint("StaticFieldLeak")
    public void getjson(final String jsonurl, final MyCallBack myCallBack){
        new AsyncTask<Void, Void, String>() {
            @Override
            protected void onPostExecute(String s) {
                myCallBack.getjson(s);
            }
            @Override
            protected String doInBackground(Void... voids) {
                String json="";
                InputStream inputStream=null;
                try {
                    URL url = new URL(jsonurl);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode()==200){
                        inputStream=httpURLConnection.getInputStream();
                        json=io2string(inputStream);
                    }else {
                        Log.e("TAG","获取失败");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return json;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    //获取图片
    @SuppressLint("StaticFieldLeak")
    public void getphoto(final String photourl, final ImageView imageView){
        new AsyncTask<Void, Void, Bitmap>() {
            @Override
            protected void onPostExecute(Bitmap bitmap) {
                imageView.setImageBitmap(bitmap);
            }
            @Override
            protected Bitmap doInBackground(Void... voids) {
                Bitmap bitmap=null;
                InputStream inputStream=null;
                try {
                    URL url = new URL(photourl);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.connect();
                    if (httpURLConnection.getResponseCode()==200){
                        inputStream=httpURLConnection.getInputStream();
                        bitmap=io2Bitmap(inputStream);
                    }else {
                        Log.e("TAG","获取失败");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                return bitmap;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    private Bitmap io2Bitmap(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    private String io2string(InputStream inputStream) throws IOException {
        byte[] bytes = new byte[1024];
        int len=-1;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        while ((len=inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
        byte[] bytes1 = outputStream.toByteArray();
        String json = new String(bytes1);
        return json;
    }

    public interface MyCallBack{
        void getjson(String json);
}
}
