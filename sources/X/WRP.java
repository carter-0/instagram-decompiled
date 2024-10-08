package X;

public final class WRP implements AnonymousClass1FD {
    public static final WRP A00 = new WRP();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r27) {
        /*
            r26 = this;
            r0 = 0
            r2 = r27
            X.0qQ.A0B(r2, r0)
            r5 = 0
            r25 = 524287(0x7ffff, float:7.34683E-40)
            X.UOe r4 = new X.UOe
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r5
            r16 = r5
            r17 = r5
            r18 = r5
            r19 = r5
            r20 = r5
            r21 = r5
            r22 = r5
            r23 = r5
            r24 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x003b
            java.lang.String r1 = "JSON string for MediaQuizSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x003b:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x01d7
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x01d2
            int r0 = r1.hashCode()
            switch(r0) {
                case -2115337775: goto L_0x01c2;
                case -2100963494: goto L_0x01b2;
                case -2030994180: goto L_0x0192;
                case -1985806860: goto L_0x0182;
                case -1791284941: goto L_0x0172;
                case -1543665910: goto L_0x014b;
                case -1249474914: goto L_0x0124;
                case -1203619573: goto L_0x0110;
                case -1165870106: goto L_0x0100;
                case -673660814: goto L_0x00f0;
                case -209971210: goto L_0x00e0;
                case -132220081: goto L_0x00d0;
                case 3355: goto L_0x00c1;
                case 3601339: goto L_0x00a8;
                case 659010373: goto L_0x0099;
                case 1260322998: goto L_0x008a;
                case 1776071171: goto L_0x007b;
                case 1931473547: goto L_0x006c;
                case 2068129058: goto L_0x005d;
                default: goto L_0x0050;
            }
        L_0x0050:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaQuizStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0059:
            r2.A0z()
            goto L_0x003b
        L_0x005d:
            java.lang.String r0 = "default_prompt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A09 = r0
            goto L_0x0059
        L_0x006c:
            java.lang.String r0 = "viewer_answer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r2)
            r4.A08 = r0
            goto L_0x0059
        L_0x007b:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r4.A02 = r0
            goto L_0x0059
        L_0x008a:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r4.A01 = r0
            goto L_0x0059
        L_0x0099:
            java.lang.String r0 = "quiz_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0D = r0
            goto L_0x0059
        L_0x00a8:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0059
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0059
            r4.A0G = r0
            goto L_0x0059
        L_0x00c1:
            java.lang.String r0 = "id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0B = r0
            goto L_0x0059
        L_0x00d0:
            java.lang.String r0 = "start_background_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0E = r0
            goto L_0x0059
        L_0x00e0:
            java.lang.String r0 = "end_background_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0A = r0
            goto L_0x0059
        L_0x00f0:
            java.lang.String r0 = "finished"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A05 = r0
            goto L_0x0059
        L_0x0100:
            java.lang.String r0 = "question"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0C = r0
            goto L_0x0059
        L_0x0110:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r4.A03 = r0
            goto L_0x0059
        L_0x0124:
            java.lang.String r0 = "options"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0147
        L_0x0139:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0147
            X.WRQ r0 = X.WRQ.A00
            X.C13988Tno.A1I(r2, r0, r3)
            goto L_0x0139
        L_0x0147:
            r4.A0H = r3
            goto L_0x0059
        L_0x014b:
            java.lang.String r0 = "tallies"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x016e
        L_0x0160:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x016e
            X.WRQ r0 = X.WRQ.A00
            X.C13988Tno.A1I(r2, r0, r3)
            goto L_0x0160
        L_0x016e:
            r4.A0I = r3
            goto L_0x0059
        L_0x0172:
            java.lang.String r0 = "correct_answer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r2)
            r4.A07 = r0
            goto L_0x0059
        L_0x0182:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            int r0 = r2.A1D()
            r4.A00 = r0
            goto L_0x0059
        L_0x0192:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0059
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0059
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0059
            r4.A04 = r0
            goto L_0x0059
        L_0x01b2:
            java.lang.String r0 = "viewer_can_answer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A06 = r0
            goto L_0x0059
        L_0x01c2:
            java.lang.String r0 = "text_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0F = r0
            goto L_0x0059
        L_0x01d2:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x01d7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRP.invoke(X.16F):java.lang.Object");
    }
}
