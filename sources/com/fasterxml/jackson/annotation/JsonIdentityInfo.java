package com.fasterxml.jackson.annotation;

import X.C12436SuR;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonIdentityInfo {
    Class generator();

    String property() default "@id";

    Class resolver() default C12436SuR.class;

    Class scope() default Object.class;
}
