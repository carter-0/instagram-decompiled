package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass05K;
import X.C269674fV;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$LongDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$LongDeserializer A00;
    public static final NumberDeserializers$LongDeserializer A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Long.TYPE;
        Integer num = AnonymousClass05K.A0j;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, 0L, 0L);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Long.class, num, (Object) null, 0L);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r3, C269674fV r4) {
        long A0S;
        if (r3.A15()) {
            A0S = r3.A0j();
        } else if (!this.A03) {
            return A0g(r3, r4, Long.class);
        } else {
            A0S = A0S(r3, r4);
        }
        return Long.valueOf(A0S);
    }
}
