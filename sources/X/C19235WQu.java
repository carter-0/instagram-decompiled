package X;

/* renamed from: X.WQu  reason: case insensitive filesystem */
public final class C19235WQu implements AnonymousClass1FD {
    public static final C19235WQu A00 = new C19235WQu();

    /* JADX WARNING: type inference failed for: r3v0, types: [X.UKv, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r5) {
        /*
            r4 = this;
            r2 = 0
            X.0qQ.A0B(r5, r2)
            java.lang.String r1 = X.AnonymousClass7TG.A0j()
            r0 = 0
            X.UKv r3 = new X.UKv
            r3.<init>()
            r3.A08 = r2
            r3.A0C = r1
            r3.A0A = r2
            r3.A07 = r2
            r3.A09 = r2
            r3.A0B = r2
            r3.A03 = r0
            r3.A04 = r0
            r3.A01 = r0
            r3.A02 = r0
            r3.A05 = r0
            r3.A06 = r0
            r3.A00 = r0
            r3.A0D = r2
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0039
            java.lang.String r0 = "JSON string for MediaDrawableTransform should start with a left brace"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0039:
            X.16L r1 = r5.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0152
            java.lang.String r1 = X.AnonymousClass7TE.A17(r5)
            if (r1 == 0) goto L_0x014b
            int r0 = r1.hashCode()
            switch(r0) {
                case -1221029593: goto L_0x013b;
                case -755984436: goto L_0x012a;
                case -755984435: goto L_0x0119;
                case -560345157: goto L_0x0108;
                case -560345156: goto L_0x00f7;
                case -415894406: goto L_0x00e3;
                case -40300674: goto L_0x00d2;
                case 122: goto L_0x00c3;
                case 3355: goto L_0x00b4;
                case 3601339: goto L_0x009b;
                case 102749521: goto L_0x008c;
                case 109250890: goto L_0x007c;
                case 113126854: goto L_0x006d;
                case 1017591248: goto L_0x005d;
                default: goto L_0x004e;
            }
        L_0x004e:
            java.lang.String r0 = "Unexpected key found: "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "MediaDrawableTransformJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0059:
            r5.A0z()
            goto L_0x0039
        L_0x005d:
            java.lang.String r0 = "bouncing_scale"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A00 = r0
            goto L_0x0059
        L_0x006d:
            java.lang.String r0 = "width"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            int r0 = r5.A1D()
            r3.A0A = r0
            goto L_0x0059
        L_0x007c:
            java.lang.String r0 = "scale"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A06 = r0
            goto L_0x0059
        L_0x008c:
            java.lang.String r0 = "layer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            int r0 = r5.A1D()
            r3.A09 = r0
            goto L_0x0059
        L_0x009b:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            X.16L r1 = r5.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0059
            java.lang.String r0 = r5.A1P()
            if (r0 == 0) goto L_0x0059
            r3.A0C = r0
            goto L_0x0059
        L_0x00b4:
            java.lang.String r0 = "id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            int r0 = r5.A1D()
            r3.A08 = r0
            goto L_0x0059
        L_0x00c3:
            java.lang.String r0 = "z"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            int r0 = r5.A1D()
            r3.A0B = r0
            goto L_0x0059
        L_0x00d2:
            java.lang.String r0 = "rotation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A05 = r0
            goto L_0x0059
        L_0x00e3:
            r0 = 323(0x143, float:4.53E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            boolean r0 = r5.A0d()
            r3.A0D = r0
            goto L_0x0059
        L_0x00f7:
            java.lang.String r0 = "pivot_y"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A04 = r0
            goto L_0x0059
        L_0x0108:
            java.lang.String r0 = "pivot_x"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A03 = r0
            goto L_0x0059
        L_0x0119:
            java.lang.String r0 = "offset_y"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A02 = r0
            goto L_0x0059
        L_0x012a:
            java.lang.String r0 = "offset_x"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            double r1 = r5.A0U()
            float r0 = (float) r1
            r3.A01 = r0
            goto L_0x0059
        L_0x013b:
            java.lang.String r0 = "height"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004e
            int r0 = r5.A1D()
            r3.A07 = r0
            goto L_0x0059
        L_0x014b:
            java.lang.String r0 = "Field name should not be null"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0152:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19235WQu.invoke(X.16F):java.lang.Object");
    }
}
