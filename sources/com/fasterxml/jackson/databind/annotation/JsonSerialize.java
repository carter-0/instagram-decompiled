package com.fasterxml.jackson.databind.annotation;

import X.C12448Suf;
import X.RDB;
import X.RDM;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSerialize {
    Class as() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default C12448Suf.class;

    Class contentUsing() default JsonSerializer.None.class;

    Class converter() default C12448Suf.class;

    @Deprecated
    RDM include() default RDM.DEFAULT_INCLUSION;

    Class keyAs() default Void.class;

    Class keyUsing() default JsonSerializer.None.class;

    Class nullsUsing() default JsonSerializer.None.class;

    RDB typing() default RDB.DEFAULT_TYPING;

    Class using() default JsonSerializer.None.class;
}
