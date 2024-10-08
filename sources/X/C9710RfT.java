package X;

/* renamed from: X.RfT  reason: case insensitive filesystem */
public abstract class C9710RfT {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r1 <= 126) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.TAO r6) {
        /*
            int r4 = r6.A02()
            java.lang.StringBuilder r3 = X.Pxe.A14(r4)
            r2 = 0
        L_0x0009:
            if (r2 >= r4) goto L_0x007c
            r5 = r6
            X.QvC r5 = (X.C8467QvC) r5
            boolean r0 = r5 instanceof X.C8466QvB
            if (r0 == 0) goto L_0x002c
            X.QvB r5 = (X.C8466QvB) r5
            int r1 = r5.A01
            int r0 = r2 + 1
            int r0 = r1 - r0
            r0 = r0 | r2
            if (r0 >= 0) goto L_0x0024
            if (r2 >= 0) goto L_0x0077
            java.lang.ArrayIndexOutOfBoundsException r0 = X.Pxj.A0c(r2)
            throw r0
        L_0x0024:
            byte[] r1 = r5.A00
            int r0 = r5.A00
            int r0 = r0 + r2
            byte r1 = r1[r0]
            goto L_0x0030
        L_0x002c:
            byte[] r0 = r5.A00
            byte r1 = r0[r2]
        L_0x0030:
            r0 = 34
            if (r1 == r0) goto L_0x006e
            r0 = 39
            if (r1 == r0) goto L_0x006b
            r0 = 92
            if (r1 == r0) goto L_0x0068
            switch(r1) {
                case 7: goto L_0x0065;
                case 8: goto L_0x0062;
                case 9: goto L_0x005f;
                case 10: goto L_0x005c;
                case 11: goto L_0x0059;
                case 12: goto L_0x0056;
                case 13: goto L_0x0071;
                default: goto L_0x003f;
            }
        L_0x003f:
            r0 = 32
            if (r1 < r0) goto L_0x004e
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 > r0) goto L_0x004e
        L_0x0047:
            char r0 = (char) r1
            r3.append(r0)
        L_0x004b:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x004e:
            X.Pxk.A0b(r3, r1)
            r0 = r1 & 7
            int r1 = r0 + 48
            goto L_0x0047
        L_0x0056:
            java.lang.String r0 = "\\f"
            goto L_0x0073
        L_0x0059:
            java.lang.String r0 = "\\v"
            goto L_0x0073
        L_0x005c:
            java.lang.String r0 = "\\n"
            goto L_0x0073
        L_0x005f:
            java.lang.String r0 = "\\t"
            goto L_0x0073
        L_0x0062:
            java.lang.String r0 = "\\b"
            goto L_0x0073
        L_0x0065:
            java.lang.String r0 = "\\a"
            goto L_0x0073
        L_0x0068:
            java.lang.String r0 = "\\\\"
            goto L_0x0073
        L_0x006b:
            java.lang.String r0 = "\\'"
            goto L_0x0073
        L_0x006e:
            java.lang.String r0 = "\\\""
            goto L_0x0073
        L_0x0071:
            java.lang.String r0 = "\\r"
        L_0x0073:
            r3.append(r0)
            goto L_0x004b
        L_0x0077:
            java.lang.ArrayIndexOutOfBoundsException r0 = X.Pxj.A0d(r2, r1)
            throw r0
        L_0x007c:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9710RfT.A00(X.TAO):java.lang.String");
    }
}
