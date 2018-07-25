package com.jd.clazzloader.test;

import com.jd.test.classloader.ITest;

/**
 * =========================================================
 * 京东 - 技术拓展研发部 - 智能研发组
 * 类说明：
 *
 * @author kangyongjie E-mail: kangyongjie@jd.com
 * @version Created ：2018/7/24 16:52
 */
public class Test implements ITest {
    private String name = "--- kyj";

    @Override
    public String getName(){
        return this.name;
    }
//    public static void main(String[] args) {
//        System.out.println(ClassLoader.getSystemClassLoader());
//    }
}
