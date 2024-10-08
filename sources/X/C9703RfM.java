package X;

/* renamed from: X.RfM  reason: case insensitive filesystem */
public abstract class C9703RfM {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r1 <= 126) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.TAN r6) {
        /*
            int r4 = r6.A01()
            java.lang.StringBuilder r3 = X.Pxe.A14(r4)
            r2 = 0
        L_0x0009:
            if (r2 >= r4) goto L_0x0074
            r5 = r6
            X.QuH r5 = (X.C8426QuH) r5
            boolean r0 = r5 instanceof X.C8425QuG
            if (r0 == 0) goto L_0x0024
            X.QuG r5 = (X.C8425QuG) r5
            int r1 = r5.A00
            int r0 = r2 + 1
            int r0 = r1 - r0
            r0 = r0 | r2
            if (r0 >= 0) goto L_0x0024
            if (r2 >= 0) goto L_0x006f
            java.lang.ArrayIndexOutOfBoundsException r0 = X.Pxj.A0c(r2)
            throw r0
        L_0x0024:
            byte[] r0 = r5.A00
            byte r1 = r0[r2]
            r0 = 34
            if (r1 == r0) goto L_0x0066
            r0 = 39
            if (r1 == r0) goto L_0x0063
            r0 = 92
            if (r1 == r0) goto L_0x0060
            switch(r1) {
                case 7: goto L_0x005d;
                case 8: goto L_0x005a;
                case 9: goto L_0x0057;
                case 10: goto L_0x0054;
                case 11: goto L_0x0051;
                case 12: goto L_0x004e;
                case 13: goto L_0x0069;
                default: goto L_0x0037;
            }
        L_0x0037:
            r0 = 32
            if (r1 < r0) goto L_0x0046
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 > r0) goto L_0x0046
        L_0x003f:
            char r0 = (char) r1
            r3.append(r0)
        L_0x0043:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0046:
            X.Pxk.A0b(r3, r1)
            r0 = r1 & 7
            int r1 = r0 + 48
            goto L_0x003f
        L_0x004e:
            java.lang.String r0 = "\\f"
            goto L_0x006b
        L_0x0051:
            java.lang.String r0 = "\\v"
            goto L_0x006b
        L_0x0054:
            java.lang.String r0 = "\\n"
            goto L_0x006b
        L_0x0057:
            java.lang.String r0 = "\\t"
            goto L_0x006b
        L_0x005a:
            java.lang.String r0 = "\\b"
            goto L_0x006b
        L_0x005d:
            java.lang.String r0 = "\\a"
            goto L_0x006b
        L_0x0060:
            java.lang.String r0 = "\\\\"
            goto L_0x006b
        L_0x0063:
            java.lang.String r0 = "\\'"
            goto L_0x006b
        L_0x0066:
            java.lang.String r0 = "\\\""
            goto L_0x006b
        L_0x0069:
            java.lang.String r0 = "\\r"
        L_0x006b:
            r3.append(r0)
            goto L_0x0043
        L_0x006f:
            java.lang.ArrayIndexOutOfBoundsException r0 = X.Pxj.A0d(r2, r1)
            throw r0
        L_0x0074:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9703RfM.A00(X.TAN):java.lang.String");
    }
}
