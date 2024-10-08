package X;

public final class WRG implements AnonymousClass1FD {
    public static final WRG A00 = new WRG();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r18) {
        /*
            r17 = this;
            r14 = 0
            r2 = r18
            X.0qQ.A0B(r2, r14)
            r5 = 0
            r16 = 1023(0x3ff, float:1.434E-42)
            X.UOS r4 = new X.UOS
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r15 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0027
            java.lang.String r1 = "JSON string for MediaLyricsSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0027:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x013e
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x0139
            int r0 = r1.hashCode()
            switch(r0) {
                case -2115337775: goto L_0x0129;
                case -2030994180: goto L_0x0109;
                case -1985806860: goto L_0x00f9;
                case -1203619573: goto L_0x00e5;
                case -898186784: goto L_0x00ce;
                case -859682253: goto L_0x00aa;
                case 3601339: goto L_0x0091;
                case 374680573: goto L_0x0067;
                case 1260322998: goto L_0x0058;
                case 1776071171: goto L_0x0049;
                default: goto L_0x003c;
            }
        L_0x003c:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaLyricsStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0045:
            r2.A0z()
            goto L_0x0027
        L_0x0049:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r4.A03 = r0
            goto L_0x0045
        L_0x0058:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r4.A02 = r0
            goto L_0x0045
        L_0x0067:
            r0 = 345(0x159, float:4.83E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x008e
        L_0x0080:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x008e
            X.WR3 r0 = X.WR3.A00
            X.C13988Tno.A1I(r2, r0, r3)
            goto L_0x0080
        L_0x008e:
            r4.A09 = r3
            goto L_0x0045
        L_0x0091:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0045
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0045
            r4.A08 = r0
            goto L_0x0045
        L_0x00aa:
            java.lang.String r0 = "music_sticker_display_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0045
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x0045
            java.util.Map r0 = X.C16585Uxf.A01
            java.lang.Object r0 = r0.get(r1)
            X.Uxf r0 = (X.C16585Uxf) r0
            if (r0 == 0) goto L_0x0045
            r4.A06 = r0
            goto L_0x0045
        L_0x00ce:
            java.lang.String r0 = "music_overlay_model"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.WRX r0 = X.WRX.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.ULm r0 = (X.ULm) r0
            X.0qQ.A0B(r0, r14)
            r4.A05 = r0
            goto L_0x0045
        L_0x00e5:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r4.A04 = r0
            goto L_0x0045
        L_0x00f9:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            int r0 = r2.A1D()
            r4.A00 = r0
            goto L_0x0045
        L_0x0109:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0045
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0045
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0045
            r4.A07 = r0
            goto L_0x0045
        L_0x0129:
            java.lang.String r0 = "text_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003c
            int r0 = r2.A1D()
            r4.A01 = r0
            goto L_0x0045
        L_0x0139:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x013e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRG.invoke(X.16F):java.lang.Object");
    }
}
