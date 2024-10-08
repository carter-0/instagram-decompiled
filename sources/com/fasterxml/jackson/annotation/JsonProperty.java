package com.fasterxml.jackson.annotation;

import X.C48072EUq;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonProperty {
    C48072EUq access() default C48072EUq.AUTO;

    String defaultValue() default "";

    int index() default -1;

    String namespace() default "";

    boolean required() default false;

    String value() default "";
}
