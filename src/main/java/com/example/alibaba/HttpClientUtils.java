package com.example.alibaba;

import java.nio.charset.Charset;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Liq
 * @date 2020/1/3
 */

public class HttpClientUtils {

    private static Logger log = LoggerFactory.getLogger(HttpClientUtils.class);


    private static CloseableHttpClient httpClient = HttpClients.createDefault();

    public static String videoPost(String url, String cookie, String json) {
        System.out.println(url);
        System.out.println(json);
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.toString());
        httpPost.addHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
        httpPost.addHeader("companyId", cookie);
        httpPost.setEntity(new StringEntity(json, Charset.forName("utf-8")));
        try {
            CloseableHttpResponse response = httpClient.execute(httpPost);
            String s = EntityUtils.toString(response.getEntity());
            System.out.println(s);
            return s;
        } catch (Exception e) {
            System.out.println("xxxxxx");
        }
        return "";

    }

}
