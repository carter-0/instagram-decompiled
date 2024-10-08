package X;

/* renamed from: X.Htw  reason: case insensitive filesystem */
public abstract class C56167Htw {
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r5 != X.C51968G9o.A02(r3)) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C56100Hsn A01(X.C56033Hrg r13, X.C56100Hsn r14, X.JNW r15) {
        /*
            r12 = r15
            r0 = r12
            X.IFi r0 = (X.C56861IFi) r0
            boolean r2 = r0.A02
            r11 = r13
            if (r2 == 0) goto L_0x0034
            int r8 = r13.A02
        L_0x000b:
            X.0eO r1 = X.0eO.A02
            r10 = 0
            X.MJ3 r0 = new X.MJ3
            r0.<init>(r8, r10, r13)
            X.0eM r13 = X.AnonymousClass0eN.A00(r1, r0)
            if (r2 == 0) goto L_0x0031
            int r9 = r11.A00
        L_0x001b:
            X.IoL r7 = new X.IoL
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.0eM r7 = X.AnonymousClass0eN.A00(r1, r7)
            r4 = 1
            long r0 = r14.A01
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x006d
            int r6 = r11.A01
            if (r8 != r6) goto L_0x0037
            return r14
        L_0x0031:
            int r9 = r11.A02
            goto L_0x001b
        L_0x0034:
            int r8 = r13.A00
            goto L_0x000b
        L_0x0037:
            X.62f r3 = r11.A03
            X.62d r0 = r3.A03
            int r1 = r0.A06(r6)
            int r0 = X.DbX.A07(r13)
            if (r0 != r1) goto L_0x006d
            int r5 = r14.A00
            long r3 = r3.A04(r5)
            r0 = -1
            if (r6 == r0) goto L_0x0061
            int r1 = r11.A02
            int r0 = r11.A00
            if (r1 >= r0) goto L_0x0077
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x0056:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0074
            if (r8 >= r6) goto L_0x007f
        L_0x0061:
            int r0 = X.C51965G9l.A04(r3)
            if (r5 == r0) goto L_0x006d
            int r0 = X.C51968G9o.A02(r3)
            if (r5 != r0) goto L_0x007f
        L_0x006d:
            java.lang.Object r0 = r7.getValue()
            X.Hsn r0 = (X.C56100Hsn) r0
            return r0
        L_0x0074:
            if (r8 <= r6) goto L_0x007f
            goto L_0x0061
        L_0x0077:
            if (r1 <= r0) goto L_0x007c
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x0056
        L_0x007c:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x0056
        L_0x007f:
            X.Hsn r0 = r11.A00(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56167Htw.A01(X.Hrg, X.Hsn, X.JNW):X.Hsn");
    }

    public static final C56100Hsn A00(C56033Hrg hrg, C56100Hsn hsn, int i) {
        return new C56100Hsn(hrg.A03.A08(i), i, hsn.A01);
    }
}
