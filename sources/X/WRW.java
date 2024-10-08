package X;

public final class WRW implements AnonymousClass1FD {
    public static final WRW A00 = new WRW();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r24) {
        /*
            r23 = this;
            r2 = 0
            r3 = r24
            X.0qQ.A0B(r3, r2)
            r5 = 0
            r21 = 65535(0xffff, float:9.1834E-41)
            X.UOb r4 = new X.UOb
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
            r20 = r2
            r22 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.16L r1 = r3.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0035
            java.lang.String r1 = "JSON string for MediaVisualCommentReplySticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0035:
            X.16L r1 = r3.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x01a9
            java.lang.String r1 = X.AnonymousClass7TE.A17(r3)
            if (r1 == 0) goto L_0x01a4
            int r0 = r1.hashCode()
            switch(r0) {
                case -2115337775: goto L_0x0194;
                case -2048029722: goto L_0x0180;
                case -2030994180: goto L_0x0160;
                case -1985806860: goto L_0x0150;
                case -1970527703: goto L_0x0132;
                case -1824429564: goto L_0x0118;
                case -1203619573: goto L_0x0104;
                case -557632268: goto L_0x00f4;
                case -209971210: goto L_0x00e4;
                case -132220081: goto L_0x00d4;
                case 3601339: goto L_0x00bb;
                case 403787451: goto L_0x009e;
                case 963379097: goto L_0x0084;
                case 1106770299: goto L_0x0075;
                case 1260322998: goto L_0x0066;
                case 1776071171: goto L_0x0057;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaVisualCommentReplyStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0053:
            r3.A0z()
            goto L_0x0035
        L_0x0057:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.ULH r0 = X.C13988Tno.A0N(r3)
            r4.A02 = r0
            goto L_0x0053
        L_0x0066:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.ULw r0 = X.C13988Tno.A0H(r3)
            r4.A01 = r0
            goto L_0x0053
        L_0x0075:
            java.lang.String r0 = "start_time_ms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            java.lang.Float r0 = X.AnonymousClass7TF.A0V(r3)
            r4.A07 = r0
            goto L_0x0053
        L_0x0084:
            r0 = 1657(0x679, float:2.322E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.WQw r0 = X.C19237WQw.A00
            java.lang.Object r0 = X.16P.A01(r3, r0)
            X.UKp r0 = (X.C15036UKp) r0
            X.0qQ.A0B(r0, r2)
            r4.A04 = r0
            goto L_0x0053
        L_0x009e:
            r0 = 1659(0x67b, float:2.325E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.16L r1 = r3.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0053
            java.lang.String r0 = r3.A1P()
            if (r0 == 0) goto L_0x0053
            r4.A0A = r0
            goto L_0x0053
        L_0x00bb:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.16L r1 = r3.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0053
            java.lang.String r0 = r3.A1P()
            if (r0 == 0) goto L_0x0053
            r4.A0E = r0
            goto L_0x0053
        L_0x00d4:
            java.lang.String r0 = "start_background_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = X.C13989Tnp.A0o(r3)
            r4.A0C = r0
            goto L_0x0053
        L_0x00e4:
            java.lang.String r0 = "end_background_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = X.C13989Tnp.A0o(r3)
            r4.A08 = r0
            goto L_0x0053
        L_0x00f4:
            java.lang.String r0 = "end_time_ms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            java.lang.Float r0 = X.AnonymousClass7TF.A0V(r3)
            r4.A06 = r0
            goto L_0x0053
        L_0x0104:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r3, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r4.A03 = r0
            goto L_0x0053
        L_0x0118:
            java.lang.String r0 = "original_media_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.16L r1 = r3.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0053
            java.lang.String r0 = r3.A1P()
            if (r0 == 0) goto L_0x0053
            r4.A0B = r0
            goto L_0x0053
        L_0x0132:
            r0 = 1658(0x67a, float:2.323E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.16L r1 = r3.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0053
            java.lang.String r0 = r3.A1P()
            if (r0 == 0) goto L_0x0053
            r4.A09 = r0
            goto L_0x0053
        L_0x0150:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            int r0 = r3.A1D()
            r4.A00 = r0
            goto L_0x0053
        L_0x0160:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            X.16L r1 = r3.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0053
            java.lang.String r0 = r3.A1P()
            if (r0 == 0) goto L_0x0053
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0053
            r4.A05 = r0
            goto L_0x0053
        L_0x0180:
            r0 = 2766(0xace, float:3.876E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            boolean r0 = r3.A0d()
            r4.A0F = r0
            goto L_0x0053
        L_0x0194:
            java.lang.String r0 = "text_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = X.C13989Tnp.A0o(r3)
            r4.A0D = r0
            goto L_0x0053
        L_0x01a4:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x01a9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRW.invoke(X.16F):java.lang.Object");
    }
}
