package org.oursight.demo.javase.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by DellPC on 2017/2/15.
 */
public class SubjectProxy implements InvocationHandler {

    private Object proxied;

    public SubjectProxy(Object obj) {
        this.proxied = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("proxy = [" + proxied + "], method = [" + method + "], args = [" + Arrays.toString(args) + "]");
        return method.invoke(proxied, args);
    }
}
