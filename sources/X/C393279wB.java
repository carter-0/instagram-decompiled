package X;

/* renamed from: X.9wB  reason: invalid class name and case insensitive filesystem */
public abstract class C393279wB {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r5 <= 126) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.AnonymousClass97R r6) {
        /*
            int r3 = r6.A02()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r2 = 0
        L_0x000a:
            if (r2 >= r3) goto L_0x00a1
            r5 = r6
            X.97V r5 = (X.AnonymousClass97V) r5
            boolean r0 = r5 instanceof X.AnonymousClass9CJ
            if (r0 == 0) goto L_0x0034
            X.9CJ r5 = (X.AnonymousClass9CJ) r5
            int r4 = r5.A00
            int r0 = r2 + 1
            int r0 = r4 - r0
            r0 = r0 | r2
            if (r0 >= 0) goto L_0x002c
            if (r2 >= 0) goto L_0x0093
            java.lang.String r0 = "Index < 0: "
            java.lang.String r1 = X.002.A0O(r0, r2)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x002c:
            byte[] r4 = r5.A00
            int r0 = r5.A01
            int r0 = r0 + r2
            byte r5 = r4[r0]
            goto L_0x0038
        L_0x0034:
            byte[] r0 = r5.A00
            byte r5 = r0[r2]
        L_0x0038:
            r0 = 34
            if (r5 == r0) goto L_0x008a
            r0 = 39
            if (r5 == r0) goto L_0x0087
            r4 = 92
            if (r5 == r4) goto L_0x0084
            switch(r5) {
                case 7: goto L_0x008d;
                case 8: goto L_0x0072;
                case 9: goto L_0x0075;
                case 10: goto L_0x0078;
                case 11: goto L_0x007b;
                case 12: goto L_0x007e;
                case 13: goto L_0x0081;
                default: goto L_0x0047;
            }
        L_0x0047:
            r0 = 32
            if (r5 < r0) goto L_0x0056
            r0 = 126(0x7e, float:1.77E-43)
            if (r5 > r0) goto L_0x0056
        L_0x004f:
            char r0 = (char) r5
            r1.append(r0)
        L_0x0053:
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0056:
            r1.append(r4)
            int r0 = r5 >>> 6
            r0 = r0 & 3
            int r0 = r0 + 48
            char r0 = (char) r0
            r1.append(r0)
            int r0 = r5 >>> 3
            r0 = r0 & 7
            int r0 = r0 + 48
            char r0 = (char) r0
            r1.append(r0)
            r0 = r5 & 7
            int r5 = r0 + 48
            goto L_0x004f
        L_0x0072:
            java.lang.String r0 = "\\b"
            goto L_0x008f
        L_0x0075:
            java.lang.String r0 = "\\t"
            goto L_0x008f
        L_0x0078:
            java.lang.String r0 = "\\n"
            goto L_0x008f
        L_0x007b:
            java.lang.String r0 = "\\v"
            goto L_0x008f
        L_0x007e:
            java.lang.String r0 = "\\f"
            goto L_0x008f
        L_0x0081:
            java.lang.String r0 = "\\r"
            goto L_0x008f
        L_0x0084:
            java.lang.String r0 = "\\\\"
            goto L_0x008f
        L_0x0087:
            java.lang.String r0 = "\\'"
            goto L_0x008f
        L_0x008a:
            java.lang.String r0 = "\\\""
            goto L_0x008f
        L_0x008d:
            java.lang.String r0 = "\\a"
        L_0x008f:
            r1.append(r0)
            goto L_0x0053
        L_0x0093:
            java.lang.String r1 = "Index > length: "
            java.lang.String r0 = ", "
            java.lang.String r1 = X.002.A02(r2, r4, r1, r0)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x00a1:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C393279wB.A00(X.97R):java.lang.String");
    }
}
