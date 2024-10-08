package com.fasterxml.jackson.databind.annotation;

import X.C12448Suf;
import X.C8162QiN;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonDeserialize {
    Class as() default Void.class;

    Class builder() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default C12448Suf.class;

    Class contentUsing() default JsonDeserializer.None.class;

    Class converter() default C12448Suf.class;

    Class keyAs() default Void.class;

    Class keyUsing() default C8162QiN.class;

    Class using() default JsonDeserializer.None.class;
}
