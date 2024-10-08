package X;

public final class WR6 implements AnonymousClass1FD {
    public static final WR6 A00 = new WR6();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r14) {
        /*
            r13 = this;
            r9 = 0
            X.0qQ.A0B(r14, r9)
            r3 = 0
            r11 = 0
            r10 = 127(0x7f, float:1.78E-43)
            X.UOM r2 = new X.UOM
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.16L r1 = r14.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0023
            java.lang.String r1 = "JSON string for MediaDateTimeSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0023:
            X.16L r1 = r14.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00d2
            java.lang.String r1 = X.AnonymousClass7TE.A17(r14)
            if (r1 == 0) goto L_0x00cd
            int r0 = r1.hashCode()
            switch(r0) {
                case -2030994180: goto L_0x00ad;
                case -1985806860: goto L_0x009e;
                case -1203619573: goto L_0x008b;
                case 3601339: goto L_0x0072;
                case 1260322998: goto L_0x0063;
                case 1590012271: goto L_0x0054;
                case 1776071171: goto L_0x0045;
                default: goto L_0x0038;
            }
        L_0x0038:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaDateTimeStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0041:
            r14.A0z()
            goto L_0x0023
        L_0x0045:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            X.ULH r0 = X.C13988Tno.A0N(r14)
            r2.A03 = r0
            goto L_0x0041
        L_0x0054:
            java.lang.String r0 = "timestamp_ms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            long r0 = r14.A0y()
            r2.A01 = r0
            goto L_0x0041
        L_0x0063:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            X.ULw r0 = X.C13988Tno.A0H(r14)
            r2.A02 = r0
            goto L_0x0041
        L_0x0072:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            X.16L r1 = r14.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0041
            java.lang.String r0 = r14.A1P()
            if (r0 == 0) goto L_0x0041
            r2.A06 = r0
            goto L_0x0041
        L_0x008b:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r14, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r2.A04 = r0
            goto L_0x0041
        L_0x009e:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            int r0 = r14.A1D()
            r2.A00 = r0
            goto L_0x0041
        L_0x00ad:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            X.16L r1 = r14.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0041
            java.lang.String r0 = r14.A1P()
            if (r0 == 0) goto L_0x0041
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0041
            r2.A05 = r0
            goto L_0x0041
        L_0x00cd:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x00d2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WR6.invoke(X.16F):java.lang.Object");
    }
}
