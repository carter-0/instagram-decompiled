package X;

public final class WR9 implements AnonymousClass1FD {
    public static final WR9 A00 = new WR9();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r18) {
        /*
            r17 = this;
            r14 = 0
            r2 = r18
            X.0qQ.A0B(r2, r14)
            r6 = 0
            r13 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            X.UOP r5 = new X.UOP
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r15 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0026
            java.lang.String r1 = "JSON string for MediaHashtagSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0026:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0100
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x00fb
            int r0 = r1.hashCode()
            switch(r0) {
                case -2030994180: goto L_0x00db;
                case -1985806860: goto L_0x00cb;
                case -1203619573: goto L_0x00b7;
                case -1037596717: goto L_0x00a7;
                case -230974677: goto L_0x0098;
                case 3556653: goto L_0x007f;
                case 3601339: goto L_0x0066;
                case 1260322998: goto L_0x0057;
                case 1776071171: goto L_0x0048;
                default: goto L_0x003b;
            }
        L_0x003b:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaHashtagStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0044:
            r2.A0z()
            goto L_0x0026
        L_0x0048:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r5.A04 = r0
            goto L_0x0044
        L_0x0057:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r5.A03 = r0
            goto L_0x0044
        L_0x0066:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0044
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0044
            r5.A08 = r0
            goto L_0x0044
        L_0x007f:
            java.lang.String r0 = "text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0044
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0044
            r5.A07 = r0
            goto L_0x0044
        L_0x0098:
            java.lang.String r0 = "max_width"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            int r0 = r2.A1D()
            r5.A01 = r0
            goto L_0x0044
        L_0x00a7:
            java.lang.String r0 = "text_size"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A00 = r0
            goto L_0x0044
        L_0x00b7:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r5.A05 = r0
            goto L_0x0044
        L_0x00cb:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            int r0 = r2.A1D()
            r5.A02 = r0
            goto L_0x0044
        L_0x00db:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003b
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0044
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0044
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0044
            r5.A06 = r0
            goto L_0x0044
        L_0x00fb:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0100:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WR9.invoke(X.16F):java.lang.Object");
    }
}
