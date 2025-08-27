package Annotation;
//自定义注解
public @interface Mybook {
    String name();
    int age() default 18;
    String[] address();
}
