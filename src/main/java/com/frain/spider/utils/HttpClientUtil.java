/**
 * @Title: HttpClientUtil
 * @Package com.frain.spider.utils
 */
package com.frain.spider.utils;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description: TODO(http工具类)
 * @author frain.gui
 * @create 2018/8/29 11:05
 * @version v1.0
 */
public class HttpClientUtil {

    /**
     * 执行get请求
     * @param url
     */
    public static String get(final String url){
        CloseableHttpClient httpclient = null;
        CloseableHttpResponse response=null;
        try{
            httpclient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet(url);
            response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            if (entity==null){
                return null;
            }
            String body = EntityUtils.toString(entity,"UTF-8");
//            System.out.println("--------------------------------------");
//            System.out.println(response.getStatusLine());
//            if (entity != null) {
//                System.out.println("Response content length: " + entity.getContentLength());
//                System.out.println("Response content: " + body);
//            }
//            System.out.println("------------------------------------");
            return body;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            if (response!=null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpclient !=null){
                try {
                    httpclient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static String post(String url, Map<String,String>params){
        CloseableHttpClient httpclient=null;
        CloseableHttpResponse response=null;
        try{
            httpclient = HttpClients.createDefault();
            HttpPost httppost = new HttpPost(url);
            if (params!=null && !params.isEmpty()){
                List<NameValuePair> formparams = new ArrayList<NameValuePair>();
                for (Map.Entry<String,String> item:params.entrySet()) {
                    formparams.add(new BasicNameValuePair(item.getKey(), item.getValue()));
                }
                UrlEncodedFormEntity uefEntity = new UrlEncodedFormEntity(formparams, "UTF-8");
                httppost.setEntity(uefEntity);
            }
            response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            if (entity==null){
                return null;
            }
            String body = EntityUtils.toString(entity, "UTF-8");
            if (entity != null) {
                System.out.println("--------------------------------------");
                System.out.println("Response content: " + body);
                System.out.println("--------------------------------------");
            }
            return body;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            if (response!=null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpclient !=null){
                try {
                    httpclient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
