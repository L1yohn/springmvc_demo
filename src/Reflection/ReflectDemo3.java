package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
//反射的基本作用
//1.类的全部成分获取
//2.破坏封装性
//3.绕过泛型约束
//4.最重要的用途是做java框架
public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<String> list=new ArrayList<>();
        list.add("牛");
        list.add("吴");
    Class c1=list.getClass();
    //获取ArrayList 类的add方法
        Method add= c1.getDeclaredMethod("add",Object.class);
        //触发list集合对象的add方法执行
        add.invoke(list,9.9);//翻墙
        add.invoke(list,true);//翻墙
        System.out.println(list);
    }
}
