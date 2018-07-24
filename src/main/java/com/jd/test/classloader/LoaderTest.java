package com.jd.test.classloader;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * =========================================================
 * 京东 - 技术拓展研发部 - 智能研发组
 * 类说明：
 *
 * @author kangyongjie E-mail: kangyongjie@jd.com
 * @version Created ：2018/7/24 17:52
 */
public class LoaderTest {
    public static void main(String[] args) throws Exception {

        String rootDir="D:\\test_dir\\guice-test-1.0-SNAPSHOT.jar";
        File file = new File(rootDir);
        URI uri=file.toURI();
        URL[] urls={uri.toURL()};

        ClazzLoader cl1 = new ClazzLoader(urls, ClassLoader.getSystemClassLoader());//ClassLoader.getSystemClassLoader()
        Class c1 = cl1.loadClass("com.jd.test.classloader.Test");
        System.out.println(c1.getClassLoader());

        String rootDir1="D:\\test_dir\\guice-test-1.0-SNAPSHOT1.jar";
        File file1 = new File(rootDir1);
        URI uri1=file1.toURI();
        URL[] urls1={uri1.toURL()};
        ClazzLoader cl2 = new ClazzLoader(urls1, ClassLoader.getSystemClassLoader());
        Class c2 = cl2.loadClass("com.jd.test.classloader.Test1");
        System.out.println(c2.getClassLoader());

        Method method = c2.getMethod("print",Test.class);
        method.invoke(c2.newInstance(),Test.class.newInstance())

        ;

    }



    public static class ClazzLoader extends URLClassLoader{
        public ClazzLoader(URL[] urls, ClassLoader parent) {
            super(urls, parent);
        }
    }
}
