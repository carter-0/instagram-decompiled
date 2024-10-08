package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.C269674fV;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.util.Date;

@JacksonStdImpl
public class DateDeserializers$DateDeserializer extends DateDeserializers$DateBasedDeserializer {
    public static final DateDeserializers$DateDeserializer A00 = new DateDeserializers$DateDeserializer();

    public DateDeserializers$DateDeserializer() {
        super(Date.class);
    }

    public final Object A0K(C269674fV r4) {
        return new Date(0);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r2, C269674fV r3) {
        return A0m(r2, r3);
    }
}
