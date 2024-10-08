package X;

/* renamed from: X.WRa  reason: case insensitive filesystem */
public final class C19241WRa implements AnonymousClass1FD {
    public static final C19241WRa A00 = new C19241WRa();

    /* JADX WARNING: type inference failed for: r3v0, types: [X.UKb, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r2 = 0
            java.lang.String r1 = ""
            r0 = 0
            X.UKb r3 = new X.UKb
            r3.<init>()
            r3.A05 = r2
            r3.A02 = r0
            r3.A03 = r0
            r3.A00 = r0
            r3.A01 = r0
            r3.A06 = r2
            r3.A04 = r1
            X.16L r1 = r6.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x002b
            java.lang.String r1 = "JSON string for RingSpec should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x002b:
            X.16L r1 = r6.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00fa
            java.lang.String r1 = X.AnonymousClass7TE.A17(r6)
            if (r1 == 0) goto L_0x00f5
            int r0 = r1.hashCode()
            switch(r0) {
                case -1354842768: goto L_0x00d0;
                case -1197189282: goto L_0x00a6;
                case 3373707: goto L_0x008d;
                case 355688997: goto L_0x007d;
                case 355688998: goto L_0x006d;
                case 2020091564: goto L_0x005d;
                case 2020091565: goto L_0x004d;
                default: goto L_0x0040;
            }
        L_0x0040:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "RingSpecJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0049:
            r6.A0z()
            goto L_0x002b
        L_0x004d:
            java.lang.String r0 = "start_point_y"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0040
            double r1 = r6.A0U()
            float r0 = (float) r1
            r3.A03 = r0
            goto L_0x0049
        L_0x005d:
            java.lang.String r0 = "start_point_x"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0040
            double r1 = r6.A0U()
            float r0 = (float) r1
            r3.A02 = r0
            goto L_0x0049
        L_0x006d:
            java.lang.String r0 = "end_point_y"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0040
            double r1 = r6.A0U()
            float r0 = (float) r1
            r3.A01 = r0
            goto L_0x0049
        L_0x007d:
            java.lang.String r0 = "end_point_x"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0040
            double r1 = r6.A0U()
            float r0 = (float) r1
            r3.A00 = r0
            goto L_0x0049
        L_0x008d:
            java.lang.String r0 = "name"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0040
            X.16L r1 = r6.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0049
            java.lang.String r0 = r6.A1P()
            if (r0 == 0) goto L_0x0049
            r3.A04 = r0
            goto L_0x0049
        L_0x00a6:
            java.lang.String r0 = "locations"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.16L r1 = r6.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00cc
        L_0x00bb:
            X.16L r1 = r6.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00cc
            double r1 = r6.A0U()
            float r0 = (float) r1
            X.JTP.A1V(r4, r0)
            goto L_0x00bb
        L_0x00cc:
            r3.A06 = r4
            goto L_0x0049
        L_0x00d0:
            java.lang.String r0 = "colors"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0040
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.16L r1 = r6.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00f1
        L_0x00e5:
            X.16L r1 = r6.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00f1
            X.C13990Tnq.A19(r6, r2)
            goto L_0x00e5
        L_0x00f1:
            r3.A05 = r2
            goto L_0x0049
        L_0x00f5:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x00fa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19241WRa.invoke(X.16F):java.lang.Object");
    }
}
