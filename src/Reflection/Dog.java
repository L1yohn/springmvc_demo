package Reflection;

public class Dog {
    private String name;
    private int age;
    private String hobby;
    private Dog(){
        System.out.println("无参数构造器run");
    }
    private Dog(String name){
        System.out.println("1参数构造器run");
    this.name=name;
    }
    public Dog(String name,int age){
        System.out.println("2参数构造器run");
        this.name=name;
        this.age=age;
    }
    private void eat(){
        System.out.println("狗吃骨头");
    }
    private String eat(String name){
        System.out.println("狗吃骨头"+name);
        return "谢谢";
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
