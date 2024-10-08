package com.fasterxml.jackson.annotation;

import X.C269204ek;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonInclude {
    C269204ek content() default C269204ek.ALWAYS;

    Class contentFilter() default Void.class;

    C269204ek value() default C269204ek.ALWAYS;

    Class valueFilter() default Void.class;
}
