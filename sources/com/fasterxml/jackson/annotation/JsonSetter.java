package com.fasterxml.jackson.annotation;

import X.C269224em;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSetter {
    C269224em contentNulls() default C269224em.DEFAULT;

    C269224em nulls() default C269224em.DEFAULT;

    String value() default "";
}
