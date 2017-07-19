package org.anowls.utils;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Objects;


/**
 * Created by Administrator on 2017/1/18.
 */
public class HttpUtils {

    private static final Logger logger = LoggerFactory.getLogger(HttpUtils.class);

    public static String post(String url, Object objParam) {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        if (Objects.nonNull(objParam)) {
            String jsonStr = JSON.toJSONString(objParam);
            httpPost.setEntity(new StringEntity(jsonStr, ContentType.create("application/json", "UTF-8")));
        }

        String strResult = null;
        CloseableHttpResponse response = null;
        try {
            response = client.execute(httpPost);
            HttpEntity entity = response.getEntity();
            strResult = EntityUtils.toString(entity);
        } catch (IOException e) {
            logger.error("请求地址[{}]出错了，错误信息：", url, e.getMessage());
        } finally {
            httpPost.releaseConnection();
            try {
                response.close();
            } catch (IOException e) {
                logger.error("关闭响应流出错了，错误信息：", e.getMessage());
            }
        }
        return strResult;
    }
}
