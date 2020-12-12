package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *������AlipayConfig
 *���ܣ�����������
 *��ϸ�������ʻ��й���Ϣ������·��
 *�޸����ڣ�2017-04-05
 *˵����
 *���´���ֻ��Ϊ�˷����̻����Զ��ṩ���������룬�̻����Ը����Լ���վ����Ҫ�����ռ����ĵ���д,����һ��Ҫʹ�øô��롣
 *�ô������ѧϰ���о�֧�����ӿ�ʹ�ã�ֻ���ṩһ���ο���
 */

public class AlipayConfig {
	
//�����������������������������������Ļ�����Ϣ������������������������������

	// Ӧ��ID,����APPID���տ��˺ż�������APPID��Ӧ֧�����˺�
	public static String app_id = "2021000116667941";
	
	// �̻�˽Կ������PKCS8��ʽRSA2˽Կ
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCAuurgwjqeXTubEwGeCUS4dVzP3/kf1uKC1EjFWwdQEhAWCtrE5URZ1tipr2BqBa9Lk9kAnjHxjjG3J6ZRD47Bfpls5aONrIUExAIGiN+VsZTrgcC73BSE6QqnsZAAsmF9pp20OndYJ/NCq4I4HRHj/HGJjl5b02t+hnEo4neOEXfppEa6GDusXN3wOLUZPuKYYcyrSMGhnuAkpjaI66a6jUnhwI5bSTtiPRrvcCvD/PGYgHB+UHQQYLjrCrXqx+cU6AIIh5rOjTW2NyNkTLhTSOZG4HslmYaEMnW+g/3HdsfVoIOd+9dCaAVHcqP9oRekfqdW/78QNcQnErhHUH2hAgMBAAECggEAYDxcjz5k2DNW9i2VTfIb39JNWlJUScs5dxkAdhoBM4jtYa0ns366RHdrbh9f8qLhU5zp455gM/dbj1Mi8QKydFESnehnBujsYI2v/fahP6WMcSuFTGvRIzOc9ZS21O6GF4tR5oS2576mCzdwmEaTM19r+avnOrqpZ+NWAXycaCXjmNzNdpaNoa3t/5ZYPTLutHJkxIuXYu7QXOtmBhi/OJ/c7aOHPaGmIvq9AKRy141EV+hUEZu/qC99v+MES1bI5usXPmkbhBlI8BdP5xNRtCh/2af0NNdeUaO6RUEKWE65dEzjvwNtewMGQTGhW5XoVfSxtvBcjR57UKhiBMXoYQKBgQD/baiseCPGh1XfCJtxXqkg9das3eytZqhVJfCM7abJo7zLWhx76joiCFOF5DYlXf/xiFrpABH2C7e35cNI/SWfU5I7GO7cV3x/ikBKn6lIfnrYufDeO7Bw9m5xUArcfgrGNWgKnKz+XxPj+ADrH/BgfJuJSBPhczL4PYhIacm4lQKBgQCBBKuNSBbRIGkdaVzpq7/8g9MMCSzSxGSz62jDvBwx3Wp7LYv9c5Kl6hRi9YDhZN6Z2nh2cEtBgEfegbTMBhT1zksd8ogGIxqM4tJSuHp3vq4+B0nkuUb2mEdF5bQqZyBbsPh277wng3Hixlu7XiC4xA+Ybsf7bj2ZDiumS3FR3QKBgQCJ5nQoGPyHlE1CCm2ReV+qEc+CqJW80C2VOtRx4WQofKPSzaWPKNeVxBUDtj+dUPB7P/iEzqrjwVPAjuUtpK4JJJ9QFJfwkbL/UG6BW02Te+Vq2Ig4EtWhRwo9Vs9mVw4OEItJH2kuM7qTWzNzvVyTWvLF3QoOr5kW+HF5VtO3OQKBgDV51hFtO+faYzdJoLVJ9v2XNjba5rVFqefZP0dCBP22JJiBvHCFIteaOnD6CT1jLdDfeOa+jLLNlPxpDqMyMiXgJ8p16GOC0VJsAXk/9aMEafxT0RD4qq0zWPdjylV5ATSAGbxSic5m8SFpzkPPNAjhWwV3hXR1sRprgTQgOQwRAoGBANkGE/BaIU4VmBFTyo2q1J128ipa3t1bhimcoU+gbZDI8unHUCjd0lPiWe9ZF/WjRPsRnPIvNeyXLEkGnBxmTG7xg12jhP8Fd8BbXdC9Je7r/3bBA9ptE1e+b9pzhqifoWWEZZbAfpjO8bWbXOHaVdsPEKQSovQuDTZZLkGwRxQT";
	
	// ֧������Կ,�鿴��ַ��https://openhome.alipay.com/platform/keyManage.htm ��ӦAPPID�µ�֧������Կ��
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAopbQfqE2B4z/cmuKTWiP4FA50RuCGjZslkUCMuRQfOitTf7FPzoWqyYaxvR046byEhxjIIrLePvzj/4VJjRA2zYMrSIrsxG8/LQTHAg3nG4pWY7rzxm+PxqDgddRqd93yJPYf66uWibkbHPGuzqmqbtd2TMKnBpDOU2W5EeEVq1CB33WzTvqlOhALI80RmVE5PsS6bxR1EatltgkCcAxwX0XiRXQqtMdehXgW026keypgmtUPEchLKkafqCXTkJKgzh/IoEmTmkDeUOAbyLgR+TRf5JcG4sbfMTvg0by30T66yGjXup0ou4+eD77/JXLLZ4xR8fosE/dnHPkmZPyCQIDAQAB";

	// �������첽֪ͨҳ��·��  ��http://��ʽ������·�������ܼ�?id=123�����Զ����������������������������
	public static String notify_url = "http://127.0.0.1:8080/notify_url.jsp";

	// ҳ����תͬ��֪ͨҳ��·�� ��http://��ʽ������·�������ܼ�?id=123�����Զ����������������������������
	public static String return_url = "http://127.0.0.1:8080/return_url.jsp";

	// ǩ����ʽ
	public static String sign_type = "RSA2";
	
	// �ַ������ʽ
	public static String charset = "utf-8";
	
	// ֧��������
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// ��־·��
	public static String log_path = "C:\\";


//�����������������������������������Ļ�����Ϣ������������������������������

    /** 
     * д��־��������ԣ�����վ����Ҳ���ԸĳɰѼ�¼�������ݿ⣩
     * @param sWord Ҫд����־����ı�����
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

