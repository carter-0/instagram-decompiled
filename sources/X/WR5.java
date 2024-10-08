package X;

public final class WR5 implements AnonymousClass1FD {
    public static final WR5 A00 = new WR5();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r26) {
        /*
            r25 = this;
            r0 = 0
            r2 = r26
            X.0qQ.A0B(r2, r0)
            r4 = 0
            r24 = 524287(0x7ffff, float:7.34683E-40)
            X.UOd r3 = new X.UOd
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r15 = r4
            r16 = r4
            r17 = r4
            r18 = r4
            r19 = r4
            r20 = r4
            r21 = r4
            r22 = r4
            r23 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x003a
            java.lang.String r1 = "JSON string for MediaCountdownSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x003a:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x01b4
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x01af
            int r0 = r1.hashCode()
            switch(r0) {
                case -2115337775: goto L_0x019f;
                case -2069450039: goto L_0x018f;
                case -2030994180: goto L_0x016f;
                case -1985806860: goto L_0x015f;
                case -1549938746: goto L_0x014f;
                case -1298761629: goto L_0x013f;
                case -1203619573: goto L_0x012b;
                case -309882753: goto L_0x0117;
                case -209971210: goto L_0x0107;
                case -168253766: goto L_0x00f3;
                case -132220081: goto L_0x00e3;
                case -588909: goto L_0x00d3;
                case 3556653: goto L_0x00c4;
                case 3601339: goto L_0x00ab;
                case 121133918: goto L_0x009c;
                case 1047508433: goto L_0x008d;
                case 1260322998: goto L_0x007e;
                case 1677107689: goto L_0x006b;
                case 1776071171: goto L_0x005c;
                default: goto L_0x004f;
            }
        L_0x004f:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaCountdownStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0058:
            r2.A0z()
            goto L_0x003a
        L_0x005c:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r3.A02 = r0
            goto L_0x0058
        L_0x006b:
            r0 = 261(0x105, float:3.66E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0B = r0
            goto L_0x0058
        L_0x007e:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r3.A01 = r0
            goto L_0x0058
        L_0x008d:
            java.lang.String r0 = "digit_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0D = r0
            goto L_0x0058
        L_0x009c:
            java.lang.String r0 = "is_owner"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r3.A07 = r0
            goto L_0x0058
        L_0x00ab:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0058
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0058
            r3.A0I = r0
            goto L_0x0058
        L_0x00c4:
            java.lang.String r0 = "text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0G = r0
            goto L_0x0058
        L_0x00d3:
            java.lang.String r0 = "following_enabled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r3.A06 = r0
            goto L_0x0058
        L_0x00e3:
            java.lang.String r0 = "start_background_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0F = r0
            goto L_0x0058
        L_0x00f3:
            r0 = 1128(0x468, float:1.58E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0A = r0
            goto L_0x0058
        L_0x0107:
            java.lang.String r0 = "end_background_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0E = r0
            goto L_0x0058
        L_0x0117:
            java.lang.String r0 = "attribution"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            X.WQw r0 = X.C19237WQw.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKp r0 = (X.C15036UKp) r0
            r3.A04 = r0
            goto L_0x0058
        L_0x012b:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r3.A03 = r0
            goto L_0x0058
        L_0x013f:
            java.lang.String r0 = "end_ts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Long r0 = X.AnonymousClass7TF.A0Z(r2)
            r3.A09 = r0
            goto L_0x0058
        L_0x014f:
            java.lang.String r0 = "digit_card_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0C = r0
            goto L_0x0058
        L_0x015f:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            int r0 = r2.A1D()
            r3.A00 = r0
            goto L_0x0058
        L_0x016f:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0058
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0058
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0058
            r3.A05 = r0
            goto L_0x0058
        L_0x018f:
            java.lang.String r0 = "viewer_is_following"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r3.A08 = r0
            goto L_0x0058
        L_0x019f:
            java.lang.String r0 = "text_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0H = r0
            goto L_0x0058
        L_0x01af:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x01b4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WR5.invoke(X.16F):java.lang.Object");
    }
}
