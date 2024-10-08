package X;

public final class WRR implements AnonymousClass1FD {
    public static final WRR A00 = new WRR();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r23) {
        /*
            r22 = this;
            r0 = 0
            r2 = r23
            X.0qQ.A0B(r2, r0)
            r4 = 0
            r21 = 65535(0xffff, float:9.1834E-41)
            X.UOa r3 = new X.UOa
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
            r20 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0034
            java.lang.String r1 = "JSON string for MediaSliderSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0034:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0176
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x0171
            int r0 = r1.hashCode()
            switch(r0) {
                case -2115337775: goto L_0x0161;
                case -2030994180: goto L_0x0141;
                case -1985806860: goto L_0x0131;
                case -1203619573: goto L_0x011d;
                case -1165870106: goto L_0x010d;
                case -1085479528: goto L_0x00fd;
                case -1058048922: goto L_0x00ed;
                case -795590343: goto L_0x00dd;
                case 3601339: goto L_0x00c3;
                case 96632902: goto L_0x00b4;
                case 1093411206: goto L_0x00a5;
                case 1124422903: goto L_0x0096;
                case 1260322998: goto L_0x0087;
                case 1323957169: goto L_0x0074;
                case 1776071171: goto L_0x0065;
                case 2036780306: goto L_0x0056;
                default: goto L_0x0049;
            }
        L_0x0049:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaSliderStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0052:
            r2.A0z()
            goto L_0x0034
        L_0x0056:
            java.lang.String r0 = "background_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0A = r0
            goto L_0x0052
        L_0x0065:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r3.A02 = r0
            goto L_0x0052
        L_0x0074:
            r0 = 3439(0xd6f, float:4.819E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r3.A05 = r0
            goto L_0x0052
        L_0x0087:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r3.A01 = r0
            goto L_0x0052
        L_0x0096:
            java.lang.String r0 = "viewer_vote"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.Float r0 = X.AnonymousClass7TF.A0V(r2)
            r3.A08 = r0
            goto L_0x0052
        L_0x00a5:
            java.lang.String r0 = "viewer_can_vote"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r3.A06 = r0
            goto L_0x0052
        L_0x00b4:
            java.lang.String r0 = "emoji"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0B = r0
            goto L_0x0052
        L_0x00c3:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0052
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0052
            r3.A0F = r0
            goto L_0x0052
        L_0x00dd:
            java.lang.String r0 = "slider_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0D = r0
            goto L_0x0052
        L_0x00ed:
            java.lang.String r0 = "slider_vote_average"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.Float r0 = X.AnonymousClass7TF.A0V(r2)
            r3.A07 = r0
            goto L_0x0052
        L_0x00fd:
            java.lang.String r0 = "slider_vote_count"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r2)
            r3.A09 = r0
            goto L_0x0052
        L_0x010d:
            java.lang.String r0 = "question"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0C = r0
            goto L_0x0052
        L_0x011d:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r3.A03 = r0
            goto L_0x0052
        L_0x0131:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            int r0 = r2.A1D()
            r3.A00 = r0
            goto L_0x0052
        L_0x0141:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0052
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0052
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0052
            r3.A04 = r0
            goto L_0x0052
        L_0x0161:
            java.lang.String r0 = "text_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r3.A0E = r0
            goto L_0x0052
        L_0x0171:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0176:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRR.invoke(X.16F):java.lang.Object");
    }
}
