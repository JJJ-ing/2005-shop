package com.baidu.shop.config;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @ClassName AlipayConfig
 * @Description: TODO
 * @Author wangjing
 * @Date 2021/3/16
 * @Version V1.0
 **/

public class AlipayConfig {
    //↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000117622336";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCrYzsBgye412zLvHozhbxvkNiWD6lqHbqb0vAiJXRenzK7HK95IszX9awH+o0+7VfhXRe5eOFTMn/bgUeAD5LPrfVfS4hjbPaihtjz/HPQuGvQAXsH6/w8F19iMTkkl1PxKjz2Fhz41GYJgF6hc1YaYuE2J4JfYBeQAQH1YzyNl52kPYcxPSrJzgt8E2Y9veWjWKBiN+zh55vdKlxFxSh525LSHqyQ7IOZB1RMQUx4OYXV50CpswHGohtr6j97JY9WEvJwtlBuB981e89TNe/kW2R6PA4MQvjlXYPtTsuH/zd/a+nmz6D0EW1JA+jedZZJPE34jx3HEYRIPRcXRINFAgMBAAECggEBAIgH9cCIihGjIt4+lbupLVxb2hyZB72LJR8i+KgRlGC5+PkcloYOQgozGz0l98/3cCYWzorO0AFJ9sORw993/O3LxBLED9fil4t+flqBiKckiaYKVs1917EWWAXGzfUmC2FCRiqIeKxjYS2vbuy0b6X3z4s9JrRuv6Tzt8s93cT/PC7WMMldj3CXEOR8Qe1wgPd7JfjBFQUM9ssYs7C3qdh0RrEYmMRzLfUvVSmZP010ObTJMq1VoSm8iiHQ1Q+2/+v0sJtZW+BpEUH32HlU3IfRKkZf316cLOBjb0qxmAyFOX2DzRRWQ6N7AOVJxL5ljSBVVwxlB0qBiUU/ctd5R00CgYEA/olNaVqYajRnrMJ2zcybpzUczpv+2VV7pCDXbIM6sbKezjRkHkL8ACQWCHue1g1P7leQcsvByqXlILHcVz5ntaLhkmeO9fp402kSBdBtRBmbw3m3oqgoGQsTXjbojNQD0yof7Fv+YWjZ7lIYCfAHiVDngL4xiuijKj5pPtcmTpsCgYEArF+G0FKVh/ihAwkO54WFcuYAf64GGdUkNWQ46vWdN4grDM6r2yru8QlSyenFfnr/hqWzklHKxrb/O5wSqrYYSL5HJl2lSaQLnC3ufgtRiasJPmhYQWiV8/lLGUZ7GTSxGjFLfEi9dEYP5BvutdnfGB4j/lw9VvKGuVLxNe+Xo58CgYEA0R1YXd+yLD7VlhdFp5obnumBuzRp0X/rTlI06c9+XxMSaPKd9kat5ie/ekSln9HcA0IpSEah9a0Jayz0izCX35/rlm5CA1A+B+HgjqpHupUXZScQeS+RkdGJnfOaZmigo9GN3I9PlBOiR6tmWHO8nVG8gAbBiQ/LTR9tM9VqgVUCgYATv03eh9eBoEYx5tPCSlWjeB4Ogo1IYFaplzW+FS1Rs1PbP8IIdb6x9nN5lkJ93vFvJ4SO+rfUVBqhZZvt2ralfsb/6jKJYTXDSq/L2NgagXGpqKKTu7uSG7kyyBRKKvMvIP6Y2mx56ZzgcSLDypX4WVueREryrw4oJQxlNXGV2QKBgQCcN0II+jJBjfXNP/3UuH+y8T5RUZn8ThqQPAFJbEei5/K1rK3BZtK6g4AoMvkF8SYMGzSKWYCM+9VpJxHaoCcAN99BaupD7TcrckynC+6WE1PLsSO4Ii3UY5ts3RO12HQtkfA7AMNnmw8qHnGa6AtFjI7D3UxoOlPIxJAQ9693Iw==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAiUNih8rixFn0uj1Ste9wznvS+om3r8/4VHJSu25ajIcueNIEA5jjtqSokM1hY/JCFsDtL38YU0qiqqZHQyRqfYLZmlp4hkOYbYuprWwEvc1mt5U2AIPhYk9NpnJhKOXY1he/2dJVrg3M5kIFeRfhpUhVhhrcqGSpEHQzY6PgWKsF6qA9ZV4+WscFoHHdwJCVdWLkSlaGrbUGL7e/tYNL1lZPTKIKWmaIGOlxGlm/FJxf8O2IzG2abLDWqP3Bj3vwlB/hR6QFyrZTbqJ/cpU5Y9t5Be8R9znrubm12FnrHd+wHPfG+XvnmYpSIKNRGLWSgfYN+ZiBFk2vXgqENjzdjwIDAQAB/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB/6FTFY99uhpiq0qadD/uSzQsefWo0aTvP/65zi3eof7TcZ32oWpwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8900/pay/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8900/pay/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "E:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
