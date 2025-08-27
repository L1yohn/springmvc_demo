package Reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo1 {

    @Test
    public void testgetClass() {
        //1.获取类的对象(类.class)
        Class c1 = Student.class;
        System.out.println(c1.getName());//全类名
        System.out.println(c1.getSimpleName());//简类名
    }
    //2.获取类的构造器对象
    @Test
    public void testgetConstructor() throws Exception {
        Class c1= Dog.class;
        //获取构造器对象
        Constructor[] cons=c1.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con.getName()+"("+con.getParameterCount()+")");
        }
        //获取单个构造器
        Constructor con=c1.getDeclaredConstructor();
        System.out.println(con.getName()+"("+con.getParameterCount()+")");

        Constructor con2=c1.getDeclaredConstructor(String.class,int.class);//两个有参构造器
        System.out.println(con2.getName()+"("+con2.getParameterCount()+")");
        //获取构造器的作用是创建对象
        //暴力反射
        con.setAccessible(true);
        Dog d1=(Dog) con.newInstance();
        System.out.println(d1);

        Dog d2=(Dog) con2.newInstance("xiaohei",3);
        System.out.println(d2);
    }
    //获取类的成员变量对象
    @Test
            public void testgetField() throws Exception {
        //第一步获取类对象
        Class c1= Student.class;
        //第二步获取成员变量对象
        Field[] fields=c1.getDeclaredFields();
        for(Field field:fields){
            System.out.println(field.getName()+"("+field.getType().getName()+")");
        }
        //获取单个成员变量
        Field field=c1.getDeclaredField("age");
            System.out.println(field.getName()+"("+field.getType().getName()+")");
            //获取成员变量的目的依旧是取值和赋值
//        Dog d=new Dog("taidi",3);
//        field.setAccessible(true);//暴力反射
//        field.set(d,"sejiao");
//        System.out.println(d);
    }
//获取类的成员方法对象
    @Test
    public void getMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class c1= Dog.class;
        Method[] methods= c1.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()+"("+method.getParameterCount()+")");
        }
        Method m1 = c1.getDeclaredMethod("eat");
        Method m2 = c1.getDeclaredMethod("eat",String.class);
        System.out.println(m1.getName()+"("+m1.getParameterCount()+")");
        System.out.println(m2.getName()+"("+m2.getParameterCount()+")");
//获取成员方法的目的依然是调用方法
        Dog d=new Dog("taiji",3);
        m1.setAccessible(true);
        Object rs1= m1.invoke(d);
        System.out.println(rs1);

        Object rs2=m2.invoke(d,"niurou");
        System.out.println(rs2);
    }

}

