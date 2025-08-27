package Reflection;

import java.io.FileNotFoundException;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("xiaohei", 3);
        SaveObjectFrameWork.saveObject(dog);

        Student stu = new Student("li", 23, "dayouxi");
        SaveObjectFrameWork.saveObject(stu);

        Teachar tea = new Teachar("wu", 24, "xuexi", 3000, "2", '1', "124124135245");
        SaveObjectFrameWork.saveObject(tea);

    }
}
