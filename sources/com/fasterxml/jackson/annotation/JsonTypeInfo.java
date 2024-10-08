package com.fasterxml.jackson.annotation;

import X.REQ;
import X.RFD;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonTypeInfo {
    Class defaultImpl() default JsonTypeInfo.class;

    REQ include() default REQ.PROPERTY;

    String property() default "";

    RFD use();

    boolean visible() default false;
}
