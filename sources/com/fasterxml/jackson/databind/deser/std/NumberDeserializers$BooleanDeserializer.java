package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.AnonymousClass05K;
import X.C269674fV;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$BooleanDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$BooleanDeserializer A00;
    public static final NumberDeserializers$BooleanDeserializer A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Boolean.TYPE;
        Boolean bool = Boolean.FALSE;
        Integer num = AnonymousClass05K.A15;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, bool, bool);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Boolean.class, num, (Object) null, bool);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r3, C269674fV r4) {
        16L A10 = r3.A10();
        if (A10 == 16L.A0K) {
            return Boolean.TRUE;
        }
        if (A10 == 16L.A0F) {
            return Boolean.FALSE;
        }
        if (this.A03) {
            return Boolean.valueOf(A0w(r3, r4));
        }
        return A0Z(r3, r4, this.A00);
    }
}
