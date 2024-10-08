package com.fasterxml.jackson.annotation;

import X.C269254ep;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAutoDetect {
    C269254ep creatorVisibility() default C269254ep.DEFAULT;

    C269254ep fieldVisibility() default C269254ep.DEFAULT;

    C269254ep getterVisibility() default C269254ep.DEFAULT;

    C269254ep isGetterVisibility() default C269254ep.DEFAULT;

    C269254ep setterVisibility() default C269254ep.DEFAULT;
}
