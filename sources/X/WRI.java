package X;

public final class WRI implements AnonymousClass1FD {
    public static final WRI A00 = new WRI();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r19) {
        /*
            r18 = this;
            r15 = 0
            r2 = r19
            X.0qQ.A0B(r2, r15)
            r6 = 0
            r14 = 0
            r17 = 1023(0x3ff, float:1.434E-42)
            X.UOT r5 = new X.UOT
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r16 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0028
            java.lang.String r1 = "JSON string for MediaMentionSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0028:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0116
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x0111
            int r0 = r1.hashCode()
            switch(r0) {
                case -2030994180: goto L_0x00f1;
                case -1985806860: goto L_0x00e1;
                case -1203619573: goto L_0x00cd;
                case -1037596717: goto L_0x00bc;
                case -230974677: goto L_0x00ad;
                case 3556653: goto L_0x0094;
                case 3599307: goto L_0x0081;
                case 3601339: goto L_0x0068;
                case 1260322998: goto L_0x0059;
                case 1776071171: goto L_0x004a;
                default: goto L_0x003d;
            }
        L_0x003d:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaMentionStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0046:
            r2.A0z()
            goto L_0x0028
        L_0x004a:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r5.A04 = r0
            goto L_0x0046
        L_0x0059:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r5.A03 = r0
            goto L_0x0046
        L_0x0068:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0046
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0046
            r5.A09 = r0
            goto L_0x0046
        L_0x0081:
            java.lang.String r0 = "user"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.WQw r0 = X.C19237WQw.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKp r0 = (X.C15036UKp) r0
            r5.A06 = r0
            goto L_0x0046
        L_0x0094:
            java.lang.String r0 = "text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0046
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0046
            r5.A08 = r0
            goto L_0x0046
        L_0x00ad:
            java.lang.String r0 = "max_width"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            int r0 = r2.A1D()
            r5.A01 = r0
            goto L_0x0046
        L_0x00bc:
            java.lang.String r0 = "text_size"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            double r3 = r2.A0U()
            float r0 = (float) r3
            r5.A00 = r0
            goto L_0x0046
        L_0x00cd:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r5.A05 = r0
            goto L_0x0046
        L_0x00e1:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            int r0 = r2.A1D()
            r5.A02 = r0
            goto L_0x0046
        L_0x00f1:
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
            r5.A07 = r0
            goto L_0x0046
        L_0x0111:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0116:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRI.invoke(X.16F):java.lang.Object");
    }
}
