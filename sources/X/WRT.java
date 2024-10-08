package X;

public final class WRT implements AnonymousClass1FD {
    public static final WRT A00 = new WRT();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r39) {
        /*
            r38 = this;
            r0 = 0
            r2 = r39
            X.0qQ.A0B(r2, r0)
            r5 = 0
            r34 = 2147483647(0x7fffffff, float:NaN)
            X.UOj r4 = new X.UOj
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
            r24 = r5
            r25 = r5
            r26 = r5
            r27 = r5
            r28 = r5
            r29 = r5
            r30 = r5
            r31 = r5
            r32 = r5
            r33 = r0
            r35 = r0
            r36 = r0
            r37 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0053
            java.lang.String r1 = "JSON string for MediaStaticSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0053:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x033b
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x0336
            int r0 = r1.hashCode()
            switch(r0) {
                case -2078428843: goto L_0x0326;
                case -2030994180: goto L_0x0306;
                case -1985806860: goto L_0x02f6;
                case -1715022168: goto L_0x02e6;
                case -1413596711: goto L_0x02d6;
                case -1237961642: goto L_0x02af;
                case -1203619573: goto L_0x029b;
                case -1170385640: goto L_0x028b;
                case -979805852: goto L_0x027b;
                case -947928398: goto L_0x0267;
                case -873453285: goto L_0x0242;
                case -309210225: goto L_0x021d;
                case 3355: goto L_0x0203;
                case 3601339: goto L_0x01e9;
                case 58485338: goto L_0x01d9;
                case 110621003: goto L_0x01c5;
                case 301343850: goto L_0x01b1;
                case 523149226: goto L_0x018c;
                case 661869171: goto L_0x0163;
                case 740543069: goto L_0x014f;
                case 823889785: goto L_0x013b;
                case 1035840149: goto L_0x012b;
                case 1059064427: goto L_0x011b;
                case 1260322998: goto L_0x010b;
                case 1292844441: goto L_0x00e6;
                case 1297387371: goto L_0x00d7;
                case 1359982558: goto L_0x00c8;
                case 1531715286: goto L_0x00a2;
                case 1670245022: goto L_0x0093;
                case 1776071171: goto L_0x0084;
                case 2068129058: goto L_0x0075;
                default: goto L_0x0068;
            }
        L_0x0068:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaStaticStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0071:
            r2.A0z()
            goto L_0x0053
        L_0x0075:
            java.lang.String r0 = "default_prompt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0E = r0
            goto L_0x0071
        L_0x0084:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r4.A03 = r0
            goto L_0x0071
        L_0x0093:
            java.lang.String r0 = "has_avatar"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A09 = r0
            goto L_0x0071
        L_0x00a2:
            java.lang.String r0 = "stickers"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00c5
        L_0x00b7:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00c5
            X.WRS r0 = X.WRS.A00
            X.C13988Tno.A1I(r2, r0, r3)
            goto L_0x00b7
        L_0x00c5:
            r4.A0P = r3
            goto L_0x0071
        L_0x00c8:
            java.lang.String r0 = "include_in_recent"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            boolean r0 = r2.A0d()
            r4.A0T = r0
            goto L_0x0071
        L_0x00d7:
            java.lang.String r0 = "help_text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0F = r0
            goto L_0x0071
        L_0x00e6:
            java.lang.String r0 = "button_texts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0107
        L_0x00fb:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0107
            X.C13990Tnq.A19(r2, r3)
            goto L_0x00fb
        L_0x0107:
            r4.A0L = r3
            goto L_0x0071
        L_0x010b:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r4.A02 = r0
            goto L_0x0071
        L_0x011b:
            java.lang.String r0 = "maximum_scale"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Float r0 = X.AnonymousClass7TF.A0V(r2)
            r4.A0B = r0
            goto L_0x0071
        L_0x012b:
            java.lang.String r0 = "render_framework"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0I = r0
            goto L_0x0071
        L_0x013b:
            r0 = 3856(0xf10, float:5.403E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r2)
            r4.A0D = r0
            goto L_0x0071
        L_0x014f:
            java.lang.String r0 = "ring_glyph"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            X.WRZ r0 = X.WRZ.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.Jvb r0 = (X.C61037Jvb) r0
            r4.A01 = r0
            goto L_0x0071
        L_0x0163:
            r0 = 42
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0188
        L_0x017c:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0188
            X.C13990Tnq.A19(r2, r3)
            goto L_0x017c
        L_0x0188:
            r4.A0Q = r3
            goto L_0x0071
        L_0x018c:
            java.lang.String r0 = "keywords"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x01ad
        L_0x01a1:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x01ad
            X.C13990Tnq.A19(r2, r3)
            goto L_0x01a1
        L_0x01ad:
            r4.A0M = r3
            goto L_0x0071
        L_0x01b1:
            java.lang.String r0 = "ring_spec"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            X.WRa r0 = X.C19241WRa.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKb r0 = (X.C15022UKb) r0
            r4.A05 = r0
            goto L_0x0071
        L_0x01c5:
            java.lang.String r0 = "track"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            X.WRe r0 = X.C19245WRe.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.ULG r0 = (X.ULG) r0
            r4.A07 = r0
            goto L_0x0071
        L_0x01d9:
            java.lang.String r0 = "has_attribution"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            boolean r0 = r2.A0d()
            r4.A0S = r0
            goto L_0x0071
        L_0x01e9:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0071
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0071
            r4.A0K = r0
            goto L_0x0071
        L_0x0203:
            java.lang.String r0 = "id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0071
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0071
            r4.A0G = r0
            goto L_0x0071
        L_0x021d:
            java.lang.String r0 = "prompts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x023e
        L_0x0232:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x023e
            X.C13990Tnq.A19(r2, r3)
            goto L_0x0232
        L_0x023e:
            r4.A0O = r3
            goto L_0x0071
        L_0x0242:
            java.lang.String r0 = "titles"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0263
        L_0x0257:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0263
            X.C13990Tnq.A19(r2, r3)
            goto L_0x0257
        L_0x0263:
            r4.A0R = r3
            goto L_0x0071
        L_0x0267:
            r0 = 2719(0xa9f, float:3.81E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A08 = r0
            goto L_0x0071
        L_0x027b:
            java.lang.String r0 = "prompt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0H = r0
            goto L_0x0071
        L_0x028b:
            java.lang.String r0 = "secondary_text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0J = r0
            goto L_0x0071
        L_0x029b:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r4.A04 = r0
            goto L_0x0071
        L_0x02af:
            java.lang.String r0 = "prompt_titles"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x02d2
        L_0x02c4:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x02d2
            X.WRY r0 = X.WRY.A00
            X.C13988Tno.A1I(r2, r0, r3)
            goto L_0x02c4
        L_0x02d2:
            r4.A0N = r3
            goto L_0x0071
        L_0x02d6:
            java.lang.String r0 = "minimum_scale"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Float r0 = X.AnonymousClass7TF.A0V(r2)
            r4.A0C = r0
            goto L_0x0071
        L_0x02e6:
            java.lang.String r0 = "is_boost_eligible"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0A = r0
            goto L_0x0071
        L_0x02f6:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            int r0 = r2.A1D()
            r4.A00 = r0
            goto L_0x0071
        L_0x0306:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0071
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0071
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0071
            r4.A06 = r0
            goto L_0x0071
        L_0x0326:
            java.lang.String r0 = "partnered_account"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0068
            boolean r0 = r2.A0d()
            r4.A0U = r0
            goto L_0x0071
        L_0x0336:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x033b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRT.invoke(X.16F):java.lang.Object");
    }
}
