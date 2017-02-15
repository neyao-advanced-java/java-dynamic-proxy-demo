package org.oursight.demo.javase.proxy;

/**
 * Created by DellPC on 2017/2/15.
 */
public class SubjectImpl implements Subject {
    @Override
    public void doSomething() {
        System.out.println("SubjectImpl.doSomething");
    }
}
