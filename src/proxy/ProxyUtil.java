package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    //创建一个明星对象的代理对象
    public static StarService createProxy(Star s){
        //
        StarService proxy=(StarService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), s.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                if(methodName.equals("sing")){
                    System.out.println("准备话筒 收20w");
                } else if ("dance".equals(methodName)) {
                    System.out.println("准备场地 收20w");
                }
                Object result = method.invoke(s,args);
                return result;
            }
        });
        return proxy;
        }
    }

