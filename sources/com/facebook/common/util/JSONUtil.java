package com.facebook.common.util;

public abstract class JSONUtil {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.5E9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.4cw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.5E9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.5E9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.5E9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C252503pD A00(java.lang.Object r4) {
        /*
            if (r4 != 0) goto L_0x0005
            X.9gL r2 = X.C383839gL.A00
            return r2
        L_0x0005:
            boolean r0 = r4 instanceof java.lang.CharSequence
            if (r0 == 0) goto L_0x0013
            java.lang.String r1 = r4.toString()
            X.5Dv r0 = new X.5Dv
            r0.<init>(r1)
            return r0
        L_0x0013:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0023
            boolean r0 = X.AnonymousClass7TE.A1a(r4)
            if (r0 == 0) goto L_0x0020
            X.8gK r2 = X.C361498gK.A02
            return r2
        L_0x0020:
            X.8gK r2 = X.C361498gK.A01
            return r2
        L_0x0023:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0031
            float r0 = X.AnonymousClass7TE.A04(r4)
            X.9gH r2 = new X.9gH
            r2.<init>(r0)
            return r2
        L_0x0031:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0041
            java.lang.Number r4 = (java.lang.Number) r4
            double r0 = r4.doubleValue()
            X.9gG r2 = new X.9gG
            r2.<init>(r0)
            return r2
        L_0x0041:
            boolean r0 = r4 instanceof java.lang.Short
            if (r0 == 0) goto L_0x0051
            java.lang.Number r4 = (java.lang.Number) r4
            short r0 = r4.shortValue()
            X.9gI r2 = new X.9gI
            r2.<init>(r0)
            return r2
        L_0x0051:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x005e
            int r0 = X.AnonymousClass7TE.A0M(r4)
            X.5E0 r2 = X.AnonymousClass5E0.A00(r0)
            return r2
        L_0x005e:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L_0x006c
            long r0 = X.AnonymousClass7TE.A0R(r4)
            X.5Dx r2 = new X.5Dx
            r2.<init>(r0)
            return r2
        L_0x006c:
            boolean r0 = r4 instanceof java.math.BigDecimal
            if (r0 == 0) goto L_0x0078
            java.math.BigDecimal r4 = (java.math.BigDecimal) r4
            X.9gK r2 = new X.9gK
            r2.<init>(r4)
            return r2
        L_0x0078:
            boolean r0 = r4 instanceof java.math.BigInteger
            if (r0 == 0) goto L_0x0084
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            X.9gJ r2 = new X.9gJ
            r2.<init>(r4)
            return r2
        L_0x0084:
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L_0x00b3
            X.4fB r0 = X.C269474fB.A00
            X.4cw r3 = new X.4cw
            r3.<init>(r0)
            java.util.Map r4 = (java.util.Map) r4
            java.util.Iterator r4 = X.AnonymousClass7TF.A0u(r4)
        L_0x0095:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r4)
            java.lang.Object r0 = r2.getKey()
            java.lang.String r1 = r0.toString()
            java.lang.Object r0 = r2.getValue()
            X.3pD r0 = A00(r0)
            r3.A0B(r0, r1)
            goto L_0x0095
        L_0x00b3:
            boolean r0 = r4 instanceof java.lang.Iterable
            if (r0 == 0) goto L_0x00d6
            X.4fB r0 = X.C269474fB.A00
            X.5E9 r3 = new X.5E9
            r3.<init>(r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r1 = r4.iterator()
        L_0x00c4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r1.next()
            X.3pD r0 = A00(r0)
            r3.A0B(r0)
            goto L_0x00c4
        L_0x00d6:
            boolean r0 = r4 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x00f4
            X.4fB r0 = X.C269474fB.A00
            X.5E9 r3 = new X.5E9
            r3.<init>(r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r2 = r4.length
            r1 = 0
        L_0x00e5:
            if (r1 >= r2) goto L_0x00f3
            r0 = r4[r1]
            X.3pD r0 = A00(r0)
            r3.A0B(r0)
            int r1 = r1 + 1
            goto L_0x00e5
        L_0x00f3:
            return r3
        L_0x00f4:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonSerialize> r0 = com.fasterxml.jackson.databind.annotation.JsonSerialize.class
            java.lang.annotation.Annotation r0 = r2.getAnnotation(r0)
            if (r0 == 0) goto L_0x0106
            X.Qkj r0 = new X.Qkj
            r0.<init>(r4)
            return r0
        L_0x0106:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Can't convert to json: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", of type: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.util.JSONUtil.A00(java.lang.Object):X.3pD");
    }
}
