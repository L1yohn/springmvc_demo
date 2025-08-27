package Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo4 {
    //注解的应用场景 模拟junit框架的测试
    public static void main(String[] args) throws Exception {
        AnnotationDemo4 ad=new AnnotationDemo4();
        //获取类对象
        //获取所有方法
        Class c = AnnotationDemo4.class;
        Method[] methods = c.getDeclaredMethods();
    //遍历所有方法
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
            //获取到方法的注解
                MyTest myTest = method.getDeclaredAnnotation(MyTest.class);
                int count = myTest.count();
                for (int i = 0; i < count; i++) {
                    method.invoke(ad);
                }
            }
        }
    }


    //测试方法 public 无参 无返回值
    @MyTest
    public void test1() {
        System.out.println("test1 run");
    }

    public void test2() {
        System.out.println("test2 run");
    }

    @MyTest(count = 3)
    public void test3() {
        System.out.println("test3 run");
    }

    public void test4() {
        System.out.println("test4 run");
    }
}
