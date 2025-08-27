package Annotation;

public @interface A {
    String value();//特殊属性，在使用时只有一个value属性名称可以不写
    String hobby() default "swim";
    //2asda
    //42345
}
