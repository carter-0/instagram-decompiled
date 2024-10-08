package X;

public final class WR7 implements AnonymousClass1FD {
    public static final WR7 A00 = new WR7();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r15) {
        /*
            r14 = this;
            r10 = 0
            X.0qQ.A0B(r15, r10)
            r3 = 0
            r13 = 511(0x1ff, float:7.16E-43)
            X.UOO r2 = new X.UOO
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r11 = r10
            r12 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.16L r1 = r15.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0024
            java.lang.String r1 = "JSON string for MediaGallerySticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0024:
            X.16L r1 = r15.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00fa
            java.lang.String r1 = X.AnonymousClass7TE.A17(r15)
            if (r1 == 0) goto L_0x00f5
            int r0 = r1.hashCode()
            switch(r0) {
                case -2030994180: goto L_0x00d5;
                case -1985806860: goto L_0x00c5;
                case -1203619573: goto L_0x00b1;
                case -1078030475: goto L_0x009b;
                case -230974677: goto L_0x008c;
                case 3601339: goto L_0x0073;
                case 996724834: goto L_0x0064;
                case 1260322998: goto L_0x0055;
                case 1776071171: goto L_0x0046;
                default: goto L_0x0039;
            }
        L_0x0039:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaGalleryStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0042:
            r15.A0z()
            goto L_0x0024
        L_0x0046:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            X.ULH r0 = X.C13988Tno.A0N(r15)
            r2.A04 = r0
            goto L_0x0042
        L_0x0055:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            X.ULw r0 = X.C13988Tno.A0H(r15)
            r2.A03 = r0
            goto L_0x0042
        L_0x0064:
            java.lang.String r0 = "max_height"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            int r0 = r15.A1D()
            r2.A00 = r0
            goto L_0x0042
        L_0x0073:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            X.16L r1 = r15.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0042
            java.lang.String r0 = r15.A1P()
            if (r0 == 0) goto L_0x0042
            r2.A08 = r0
            goto L_0x0042
        L_0x008c:
            java.lang.String r0 = "max_width"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            int r0 = r15.A1D()
            r2.A01 = r0
            goto L_0x0042
        L_0x009b:
            java.lang.String r0 = "medium"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            X.WRH r0 = X.WRH.A00
            java.lang.Object r0 = X.16P.A01(r15, r0)
            X.ULz r0 = (X.C15056ULz) r0
            X.0qQ.A0B(r0, r10)
            r2.A06 = r0
            goto L_0x0042
        L_0x00b1:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r15, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r2.A05 = r0
            goto L_0x0042
        L_0x00c5:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            int r0 = r15.A1D()
            r2.A02 = r0
            goto L_0x0042
        L_0x00d5:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0039
            X.16L r1 = r15.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0042
            java.lang.String r0 = r15.A1P()
            if (r0 == 0) goto L_0x0042
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0042
            r2.A07 = r0
            goto L_0x0042
        L_0x00f5:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x00fa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WR7.invoke(X.16F):java.lang.Object");
    }
}
