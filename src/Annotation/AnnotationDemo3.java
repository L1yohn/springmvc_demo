package Annotation;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationDemo3 {
    //解析注解
    @Test
    public void parseClass() {
        //获取类对象
        Class c1 = Demo.class;
        //判断这个类上是否陈列了注解MyTest2
        if(c1.isAnnotationPresent(MyTest2.class)){
        //获取注解对象
        MyTest2 myTest2=(MyTest2) c1.getAnnotation(MyTest2.class);
        //获取注解属性值
            String[] address= myTest2.address();
            double height= myTest2.height();
            String value=myTest2.value();
            //打印注解属性值
            System.out.println(value);
            System.out.println(height);
            System.out.println(Arrays.toString(address));
        }
    }
    @Test
    public void parseMethod() throws Exception {
        //获取方法对象
        Class c1 = Demo.class;
        //获取方法对象
        // 获取类c1中的"go"方法
        Method method= c1.getMethod("go");
        // 检查方法是否包含MyTest2注解
        if(method.isAnnotationPresent(MyTest2.class)){
        }
        // 获取方法上的MyTest2注解实例
        MyTest2 myTest2=(MyTest2) method.getDeclaredAnnotation(MyTest2.class);
        // 从注解中获取值
        String[] address= myTest2.address();
        double height= myTest2.height();
        String value=myTest2.value();
        // 输出注解中值
        System.out.println(value);
        System.out.println(height);
        System.out.println(Arrays.toString(address));
    }
}
