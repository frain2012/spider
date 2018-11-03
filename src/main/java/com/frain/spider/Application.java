/**
 * @Title: Application
 * @Package com.frain.spider
 */
package com.frain.spider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: TODO(入口启动方法)
 * @author frain.gui
 * @create 2018/9/3 17:51
 * @version v1.0
 */
public class Application {
    public static void main(String[] args){
        try {
            ClassPathXmlApplicationContext application =new ClassPathXmlApplicationContext("applicationContext.xml");
            System.out.println("初始化Bean:"+application.getBeanDefinitionCount()+"个");
            application.start();
            while (true){
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
