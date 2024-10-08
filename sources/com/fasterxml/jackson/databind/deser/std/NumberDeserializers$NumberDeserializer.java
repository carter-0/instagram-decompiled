package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass05K;
import X.C11287SJg;
import X.C269674fV;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class NumberDeserializers$NumberDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$NumberDeserializer A00 = new NumberDeserializers$NumberDeserializer();

    public NumberDeserializers$NumberDeserializer() {
        super(Number.class);
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        if ("INF".equals(r5) != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        if ("-INF".equals(r5) != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.16F r7, X.C269674fV r8) {
        /*
            r6 = this;
            int r1 = r7.A0x()
            r0 = 1
            if (r1 == r0) goto L_0x0141
            r0 = 3
            if (r1 == r0) goto L_0x013c
            r0 = 6
            if (r1 == r0) goto L_0x0044
            r0 = 7
            if (r1 == r0) goto L_0x002f
            r0 = 8
            if (r1 == r0) goto L_0x001c
            X.Pxf.A1G(r7, r8, r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            X.4fA r0 = X.C269464fA.USE_BIG_DECIMAL_FOR_FLOATS
            boolean r0 = r8.A0j(r0)
            if (r0 == 0) goto L_0x003f
            boolean r0 = r7.A0v()
            if (r0 != 0) goto L_0x003f
            java.math.BigDecimal r0 = r7.A0r()
            return r0
        L_0x002f:
            int r1 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A02
            int r0 = r8.A01
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass7TF.A1P(r1)
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = com.fasterxml.jackson.databind.deser.std.StdDeserializer.A07(r7, r8)
            return r0
        L_0x003f:
            java.lang.Number r0 = r7.A0p()
            return r0
        L_0x0044:
            java.lang.String r2 = r7.A1P()
            java.lang.Integer r1 = r6.A0f(r8, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0137
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0059
            java.lang.Object r0 = r6.A0K(r8)
            return r0
        L_0x0059:
            java.lang.String r5 = r2.trim()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0137
            java.lang.String r0 = "Infinity"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0077
            java.lang.String r0 = "INF"
            boolean r1 = r0.equals(r5)
            r0 = 0
            if (r1 == 0) goto L_0x0078
        L_0x0077:
            r0 = 1
        L_0x0078:
            if (r0 == 0) goto L_0x0081
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L_0x0081:
            r0 = 2058(0x80a, float:2.884E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0096
            java.lang.String r0 = "-INF"
            boolean r1 = r0.equals(r5)
            r0 = 0
            if (r1 == 0) goto L_0x0097
        L_0x0096:
            r0 = 1
        L_0x0097:
            if (r0 == 0) goto L_0x00a0
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L_0x00a0:
            java.lang.String r0 = "NaN"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x00af
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L_0x00af:
            int r3 = r5.length()     // Catch:{ IllegalArgumentException -> 0x0126 }
            r0 = 0
            if (r3 <= 0) goto L_0x00c9
            char r2 = r5.charAt(r0)     // Catch:{ IllegalArgumentException -> 0x0126 }
            r0 = 45
            r1 = 1
            if (r2 == r0) goto L_0x00c5
            r0 = 43
            if (r2 == r0) goto L_0x00c5
            r2 = 0
            goto L_0x00d7
        L_0x00c5:
            if (r3 == r1) goto L_0x00c9
            r2 = 1
            goto L_0x00d7
        L_0x00c9:
            r0 = 0
            goto L_0x00d4
        L_0x00cb:
            r0 = 48
            if (r1 < r0) goto L_0x00c9
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x00d7
            r0 = 1
        L_0x00d4:
            if (r0 != 0) goto L_0x00f3
            goto L_0x00e0
        L_0x00d7:
            char r1 = r5.charAt(r2)     // Catch:{ IllegalArgumentException -> 0x0126 }
            r0 = 57
            if (r1 > r0) goto L_0x00c9
            goto L_0x00cb
        L_0x00e0:
            X.4fA r0 = X.C269464fA.USE_BIG_DECIMAL_FOR_FLOATS     // Catch:{ IllegalArgumentException -> 0x0126 }
            boolean r0 = r8.A0j(r0)     // Catch:{ IllegalArgumentException -> 0x0126 }
            if (r0 == 0) goto L_0x00ee
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ IllegalArgumentException -> 0x0126 }
            r0.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x0126 }
            return r0
        L_0x00ee:
            java.lang.Double r0 = java.lang.Double.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x0126 }
            return r0
        L_0x00f3:
            X.4fA r0 = X.C269464fA.USE_BIG_INTEGER_FOR_INTS     // Catch:{ IllegalArgumentException -> 0x0126 }
            boolean r0 = r8.A0j(r0)     // Catch:{ IllegalArgumentException -> 0x0126 }
            if (r0 == 0) goto L_0x0101
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ IllegalArgumentException -> 0x0126 }
            r0.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x0126 }
            return r0
        L_0x0101:
            long r3 = java.lang.Long.parseLong(r5)     // Catch:{ IllegalArgumentException -> 0x0126 }
            X.4fA r0 = X.C269464fA.USE_LONG_FOR_INTS     // Catch:{ IllegalArgumentException -> 0x0126 }
            boolean r0 = r8.A0j(r0)     // Catch:{ IllegalArgumentException -> 0x0126 }
            if (r0 != 0) goto L_0x0121
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0121
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0121
            int r0 = (int) r3     // Catch:{ IllegalArgumentException -> 0x0126 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0126 }
            return r0
        L_0x0121:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0126 }
            return r0
        L_0x0126:
            java.lang.Class r2 = r6.A00
            java.lang.Object[] r1 = X.Pxe.A1b()
            java.lang.String r0 = "not a valid number"
            r8.A0e(r2, r5, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0137:
            java.lang.Object r0 = r6.BWm(r8)
            return r0
        L_0x013c:
            java.lang.Object r0 = r6.A0h(r7, r8)
            return r0
        L_0x0141:
            java.lang.Class r0 = r6.A00
            r8.A0T(r7, r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer.A0D(X.16F, X.4fV):java.lang.Object");
    }

    public final Object A0J(16F r3, C269674fV r4, C11287SJg sJg) {
        int A0x = r3.A0x();
        if (A0x == 6 || A0x == 7 || A0x == 8) {
            return A0D(r3, r4);
        }
        return sJg.A06(r3, r4);
    }
}
