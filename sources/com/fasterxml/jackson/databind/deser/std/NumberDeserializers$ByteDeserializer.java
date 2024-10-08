package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass05K;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class NumberDeserializers$ByteDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$ByteDeserializer A00;
    public static final NumberDeserializers$ByteDeserializer A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARNING: type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Byte.TYPE;
        Integer num = AnonymousClass05K.A0j;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, (byte) 0, (byte) 0);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Byte.class, num, (Object) null, (byte) 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0059, code lost:
        if (r2 > 255) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if (r1 == X.AnonymousClass05K.A0N) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object A0D(X.16F r6, X.C269674fV r7) {
        /*
            r5 = this;
            boolean r0 = r6.A15()
            if (r0 != 0) goto L_0x0080
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0013
            byte r0 = r5.A0N(r6, r7)
        L_0x000e:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        L_0x0013:
            int r1 = r6.A0x()
            r0 = 1
            if (r1 == r0) goto L_0x0069
            r0 = 3
            if (r1 == r0) goto L_0x0099
            r0 = 11
            if (r1 == r0) goto L_0x0094
            r0 = 6
            if (r1 == r0) goto L_0x0033
            r0 = 7
            if (r1 == r0) goto L_0x0080
            r0 = 8
            if (r1 == r0) goto L_0x0071
            X.Pxf.A1G(r6, r7, r5)
        L_0x002e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0033:
            java.lang.String r2 = r6.A1P()
            java.lang.Integer r1 = r5.A0f(r7, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0094
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x007d
            java.lang.String r4 = r2.trim()
            boolean r0 = r5.A0x(r7, r4)
            if (r0 != 0) goto L_0x0094
            r3 = 0
            int r2 = X.16T.A02(r4)     // Catch:{ IllegalArgumentException -> 0x0085 }
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r2 < r0) goto L_0x005b
            r1 = 255(0xff, float:3.57E-43)
            r0 = 0
            if (r2 <= r1) goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            if (r0 == 0) goto L_0x006f
            java.lang.Class r2 = r5.A00
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "overflow, value cannot be represented as 8-bit value"
            r7.A0e(r2, r4, r0, r1)
            goto L_0x002e
        L_0x0069:
            java.lang.Class r0 = r5.A00
            r7.A0T(r6, r0)
            goto L_0x002e
        L_0x006f:
            byte r0 = (byte) r2
            goto L_0x000e
        L_0x0071:
            java.lang.Integer r1 = r5.A0c(r6, r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0094
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0080
        L_0x007d:
            java.lang.Object r0 = r5.A01
            return r0
        L_0x0080:
            byte r0 = r6.A0T()
            goto L_0x000e
        L_0x0085:
            java.lang.Class r2 = r5.A00
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "not a valid Byte value"
            r7.A0e(r2, r4, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0094:
            java.lang.Object r0 = r5.BWm(r7)
            return r0
        L_0x0099:
            java.lang.Object r0 = r5.A0h(r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ByteDeserializer.A0D(X.16F, X.4fV):java.lang.Object");
    }
}
