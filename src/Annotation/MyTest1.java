package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD})//声明注解范围 方法 成员变量
@Retention(RetentionPolicy.RUNTIME)//一直在
public @interface MyTest1 {
}
