package org.oursight.demo.javase.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by DellPC on 2017/2/15.
 */
public class DynamicProxyUsage {

    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();

        Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{Subject.class}, new SubjectProxy(subject));
        proxySubject.doSomething();
    }
}
