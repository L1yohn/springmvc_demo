package proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //准备明星对象
    Star star=new Star("章若楠");
    //创建代理对象
    StarService proxy= ProxyUtil.createProxy( star);
    proxy.sing("唯一");
    System.out.println(proxy.dance());

    }
}
