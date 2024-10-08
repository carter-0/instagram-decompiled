package X;

/* renamed from: X.WQr  reason: case insensitive filesystem */
public final class C19232WQr implements AnonymousClass1FD {
    public static final C19232WQr A00 = new C19232WQr();

    /* JADX WARNING: type inference failed for: r3v0, types: [X.UKk, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r5) {
        /*
            r4 = this;
            r2 = 0
            X.0qQ.A0B(r5, r2)
            r1 = 0
            r0 = 0
            X.UKk r3 = new X.UKk
            r3.<init>()
            r3.A08 = r1
            r3.A00 = r0
            r3.A01 = r0
            r3.A04 = r0
            r3.A05 = r0
            r3.A06 = r2
            r3.A02 = r0
            r3.A03 = r0
            r3.A07 = r1
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x002d
            java.lang.String r1 = "JSON string for MediaDrawableBoundsSpec should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x002d:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00ef
            java.lang.String r1 = X.AnonymousClass7TE.A17(r5)
            if (r1 == 0) goto L_0x00ea
            int r0 = r1.hashCode()
            switch(r0) {
                case -1389337486: goto L_0x00d9;
                case -1389337485: goto L_0x00c8;
                case 3496420: goto L_0x00b5;
                case 280523342: goto L_0x00a6;
                case 746438708: goto L_0x008f;
                case 962465437: goto L_0x007f;
                case 962465438: goto L_0x006f;
                case 1658006358: goto L_0x005f;
                case 1658006359: goto L_0x004f;
                default: goto L_0x0042;
            }
        L_0x0042:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaDrawableBoundsSpecJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x004b:
            r5.A0z()
            goto L_0x002d
        L_0x004f:
            java.lang.String r0 = "normalized_center_y"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0042
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A05 = r0
            goto L_0x004b
        L_0x005f:
            java.lang.String r0 = "normalized_center_x"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0042
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A04 = r0
            goto L_0x004b
        L_0x006f:
            java.lang.String r0 = "gravity_offset_y"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0042
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A03 = r0
            goto L_0x004b
        L_0x007f:
            java.lang.String r0 = "gravity_offset_x"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0042
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A02 = r0
            goto L_0x004b
        L_0x008f:
            java.lang.String r0 = "bounds_spec_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0042
            int r1 = r5.A1D()
            java.util.Map r0 = X.C16567UxK.A01
            java.lang.Object r0 = X.C51968G9o.A10(r0, r1)
            X.UxK r0 = (X.C16567UxK) r0
            r3.A08 = r0
            goto L_0x004b
        L_0x00a6:
            java.lang.String r0 = "gravity"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0042
            int r0 = r5.A1D()
            r3.A06 = r0
            goto L_0x004b
        L_0x00b5:
            java.lang.String r0 = "rect"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0042
            X.WQt r0 = X.C19234WQt.A00
            java.lang.Object r0 = X.16P.A01(r5, r0)
            X.ULb r0 = (X.C15048ULb) r0
            r3.A07 = r0
            goto L_0x004b
        L_0x00c8:
            java.lang.String r0 = "bias_y"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0042
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A01 = r0
            goto L_0x004b
        L_0x00d9:
            java.lang.String r0 = "bias_x"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0042
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A00 = r0
            goto L_0x004b
        L_0x00ea:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x00ef:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19232WQr.invoke(X.16F):java.lang.Object");
    }
}
