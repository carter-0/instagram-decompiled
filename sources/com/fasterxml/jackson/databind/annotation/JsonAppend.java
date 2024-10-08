package com.fasterxml.jackson.databind.annotation;

import X.C269204ek;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAppend {

    public @interface Attr {
        C269204ek include() default C269204ek.NON_NULL;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    public @interface Prop {
        String name() default "";

        String namespace() default "";

        Class type() default Object.class;

        Class value();
    }

    Attr[] attrs() default {};

    boolean prepend() default false;

    Prop[] props() default {};
}
