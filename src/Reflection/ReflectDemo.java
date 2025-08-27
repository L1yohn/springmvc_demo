package Reflection;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //获取类的对象(类.class)
        Class c1= Student.class;
        System.out.println(c1);
        //获取类的对象("类的全类名")
        Class c2=Class.forName("Reflection.Student");
        System.out.println(c2);
        //获取类的对象（ 对象.getClass() ）
        Student s=new Student();
        Class c3=s.getClass();
        System.out.println(c3);
    }
}
