package me.landmesser.rest;

import java.lang.reflect.Proxy;

public abstract class RestProxy {

    private RestProxy() {
    }

    @SuppressWarnings("unchecked")
    public static <T> T getProxy(Class<? extends T> clazz) {
        return (T) Proxy.newProxyInstance(RestProxy.class.getClassLoader(), clazz.getInterfaces(),
                (proxy, method, args) -> null);
    }
}
