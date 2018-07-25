package com.jd.clazzloader.test;

import com.jd.test.classloader.ITest;

/**
 * =========================================================
 * 京东 - 技术拓展研发部 - 智能研发组
 * 类说明：
 *
 * @author kangyongjie E-mail: kangyongjie@jd.com
 * @version Created ：2018/7/24 17:48
 */
public class Test1 {
    public void print(ITest test){
        System.out.println("hello,world!"+test.getName());
    }
}
