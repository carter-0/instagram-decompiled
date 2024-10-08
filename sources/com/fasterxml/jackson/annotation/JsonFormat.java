package com.fasterxml.jackson.annotation;

import X.C269324ew;
import X.RDA;
import X.RDC;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFormat {
    RDA lenient() default RDA.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    C269324ew shape() default C269324ew.ANY;

    String timezone() default "##default";

    RDC[] with() default {};

    RDC[] without() default {};
}
