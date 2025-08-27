package Reflection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class SaveObjectFrameWork {
    public static void saveObject(Object obj) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("D:\\jacode\\javatext\\Advanced\\src\\Reflection\\a.txt",true));
        Class c1 = obj.getClass();
        String simpleName = c1.getSimpleName();
        ps.println("===="+simpleName+"====");
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            field.setAccessible(true);
           Object fieldValue = field.get(obj)+"";
           ps.println(fieldName + "=" + fieldValue);
        }
        ps.close();
    }

}
