package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass05K;
import X.C269674fV;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$IntegerDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$IntegerDeserializer A00;
    public static final NumberDeserializers$IntegerDeserializer A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Integer.TYPE;
        Integer num = AnonymousClass05K.A0j;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, 0, 0);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Integer.class, num, (Object) null, 0);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r2, C269674fV r3) {
        int A0Q;
        if (r2.A15()) {
            A0Q = r2.A0i();
        } else if (!this.A03) {
            return A0d(r2, r3, Integer.class);
        } else {
            A0Q = A0Q(r2, r3);
        }
        return Integer.valueOf(A0Q);
    }
}
