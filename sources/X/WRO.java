package X;

public final class WRO implements AnonymousClass1FD {
    public static final WRO A00 = new WRO();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r25) {
        /*
            r24 = this;
            r0 = 0
            r2 = r25
            X.0qQ.A0B(r2, r0)
            r5 = 0
            r23 = 131071(0x1ffff, float:1.8367E-40)
            X.UOc r4 = new X.UOc
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
            r22 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0037
            java.lang.String r1 = "JSON string for MediaQuestionSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0037:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x01bd
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x01b8
            int r3 = r1.hashCode()
            r0 = 0
            switch(r3) {
                case -2115337775: goto L_0x01a8;
                case -2030994180: goto L_0x0188;
                case -1985806860: goto L_0x0178;
                case -1475936846: goto L_0x0168;
                case -1203619573: goto L_0x0154;
                case -1165870106: goto L_0x0144;
                case -1030321165: goto L_0x0122;
                case -900774058: goto L_0x0112;
                case 3601339: goto L_0x00f8;
                case 440720123: goto L_0x00c3;
                case 678672082: goto L_0x00b4;
                case 964289556: goto L_0x00a5;
                case 1260322998: goto L_0x0096;
                case 1776071171: goto L_0x0087;
                case 1781202186: goto L_0x0078;
                case 1782139044: goto L_0x0069;
                case 2036780306: goto L_0x005a;
                default: goto L_0x004d;
            }
        L_0x004d:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaQuestionStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0056:
            r2.A0z()
            goto L_0x0037
        L_0x005a:
            java.lang.String r0 = "background_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A09 = r0
            goto L_0x0056
        L_0x0069:
            java.lang.String r0 = "profile_pic_url"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0B = r0
            goto L_0x0056
        L_0x0078:
            java.lang.String r0 = "question_response_count"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.Long r0 = X.AnonymousClass7TF.A0Z(r2)
            r4.A08 = r0
            goto L_0x0056
        L_0x0087:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r4.A02 = r0
            goto L_0x0056
        L_0x0096:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r4.A01 = r0
            goto L_0x0056
        L_0x00a5:
            java.lang.String r0 = "question_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0D = r0
            goto L_0x0056
        L_0x00b4:
            java.lang.String r0 = "viewer_can_interact"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A07 = r0
            goto L_0x0056
        L_0x00c3:
            java.lang.String r0 = "response_types"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x00f4
        L_0x00d8:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x00f4
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x00d8
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x00d8
            java.util.Map r0 = X.C16570UxN.A01
            X.C13989Tnp.A1R(r1, r3, r0)
            goto L_0x00d8
        L_0x00f4:
            r4.A0G = r3
            goto L_0x0056
        L_0x00f8:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0056
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0056
            r4.A0F = r0
            goto L_0x0056
        L_0x0112:
            java.lang.String r0 = "media_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0A = r0
            goto L_0x0056
        L_0x0122:
            java.lang.String r3 = "question_type"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x004d
            X.16L r3 = r2.A11()
            X.16L r1 = X.16L.A0G
            if (r3 == r1) goto L_0x0140
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x0140
            java.util.Map r0 = X.C16571UxO.A01
            java.lang.Object r0 = r0.get(r1)
            X.UxO r0 = (X.C16571UxO) r0
        L_0x0140:
            r4.A04 = r0
            goto L_0x0056
        L_0x0144:
            java.lang.String r0 = "question"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0C = r0
            goto L_0x0056
        L_0x0154:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r4.A03 = r0
            goto L_0x0056
        L_0x0168:
            java.lang.String r0 = "is_clips_v2_media"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A06 = r0
            goto L_0x0056
        L_0x0178:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            int r0 = r2.A1D()
            r4.A00 = r0
            goto L_0x0056
        L_0x0188:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0056
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0056
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0056
            r4.A05 = r0
            goto L_0x0056
        L_0x01a8:
            java.lang.String r0 = "text_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0E = r0
            goto L_0x0056
        L_0x01b8:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x01bd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRO.invoke(X.16F):java.lang.Object");
    }
}
