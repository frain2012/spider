/**
 * @Title: HttpClientUtil
 * @Package com.frain.spider.utils
 */
package com.frain.spider.utils;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
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

    /***
     * 执行get请求
     * @param url   -请求url
     * @param charset - 编码集 "UTF-8"
     * @return
     */
    public static String get(final String url,final String charset){
        CloseableHttpClient httpclient = null;
        CloseableHttpResponse response=null;
        String body = null;
        try{
            httpclient = createClient(url);
            HttpGet httpget = new HttpGet(url);
            response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            body = EntityUtils.toString(entity,charset);
        }catch (Exception e){
            e.printStackTrace();
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
        return body;
    }

    /**
     * 执行post请求
     * @param url   --url
     * @param params--参数
     * @param charset--编码 "UTF-8"
     * @return
     */
    public static String post(final String url,Map<String,String> headers, Map<String,String>params,String charset){
        CloseableHttpClient httpclient=null;
        CloseableHttpResponse response=null;
        String body=null;
        try{
            httpclient = createClient(url);
            HttpPost httppost = new HttpPost(url);
            if (headers!=null && !headers.isEmpty()){
                //
            }
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
            body = EntityUtils.toString(entity, charset);
        }catch (Exception e){
            e.printStackTrace();
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
        return body;
    }


    private static CloseableHttpClient createClient(String url){
        if (url.indexOf("https")>-1){
            try{
                SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                    public boolean isTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
                        return true;
                    }
                }).build();
                SSLConnectionSocketFactory sslcsf = new SSLConnectionSocketFactory(sslContext,
                        SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
                return HttpClients.custom().setSSLSocketFactory(sslcsf).build();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return HttpClients.createDefault();
    }
}
