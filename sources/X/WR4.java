package X;

public final class WR4 implements AnonymousClass1FD {
    public static final WR4 A00 = new WR4();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r18) {
        /*
            r17 = this;
            r11 = 0
            r2 = r18
            X.0qQ.A0B(r2, r11)
            r4 = 0
            r16 = 2047(0x7ff, float:2.868E-42)
            X.UOU r3 = new X.UOU
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0028
            java.lang.String r1 = "JSON string for MediaBitmapSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0028:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0120
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x011b
            int r0 = r1.hashCode()
            switch(r0) {
                case -2030994180: goto L_0x00fb;
                case -1985806860: goto L_0x00eb;
                case -1785650396: goto L_0x00d1;
                case -1203619573: goto L_0x00bd;
                case -795166598: goto L_0x00ae;
                case 3601339: goto L_0x0095;
                case 347046913: goto L_0x0086;
                case 1119391106: goto L_0x0077;
                case 1260322998: goto L_0x0068;
                case 1716393190: goto L_0x0059;
                case 1776071171: goto L_0x004a;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaBitmapStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0046:
            r2.A0z()
            goto L_0x0028
        L_0x004a:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r3.A06 = r0
            goto L_0x0046
        L_0x0059:
            java.lang.String r0 = "rect_bottom"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            int r0 = r2.A1D()
            r3.A00 = r0
            goto L_0x0046
        L_0x0068:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r3.A05 = r0
            goto L_0x0046
        L_0x0077:
            java.lang.String r0 = "rect_left"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            int r0 = r2.A1D()
            r3.A01 = r0
            goto L_0x0046
        L_0x0086:
            java.lang.String r0 = "rect_right"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            int r0 = r2.A1D()
            r3.A02 = r0
            goto L_0x0046
        L_0x0095:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0046
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0046
            r3.A0A = r0
            goto L_0x0046
        L_0x00ae:
            java.lang.String r0 = "rect_top"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            int r0 = r2.A1D()
            r3.A03 = r0
            goto L_0x0046
        L_0x00bd:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r3.A07 = r0
            goto L_0x0046
        L_0x00d1:
            java.lang.String r0 = "image_file_path"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0046
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0046
            r3.A09 = r0
            goto L_0x0046
        L_0x00eb:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            int r0 = r2.A1D()
            r3.A04 = r0
            goto L_0x0046
        L_0x00fb:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0046
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0046
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0046
            r3.A08 = r0
            goto L_0x0046
        L_0x011b:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0120:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WR4.invoke(X.16F):java.lang.Object");
    }
}
