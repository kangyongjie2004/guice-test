package com.jd.test.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;

/**
 * =========================================================
 * 京东 - 技术拓展研发部 - 智能研发组
 * 类说明：
 *
 * @author kangyongjie E-mail: kangyongjie@jd.com
 * @version Created ：2018/7/5 10:30
 */
public class Exe {
    public static void main(String args[]){
        Injector i = Guice.createInjector(Stage.DEVELOPMENT,new MyAppModule());
        Application chef = i.getInstance(Application.class);
        chef.work();
    }

}
