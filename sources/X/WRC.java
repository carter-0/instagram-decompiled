package X;

public final class WRC implements AnonymousClass1FD {
    public static final WRC A00 = new WRC();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.UxS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.UxL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.UxY} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r33) {
        /*
            r32 = this;
            r0 = 0
            r2 = r33
            X.0qQ.A0B(r2, r0)
            r5 = 0
            r31 = 33554431(0x1ffffff, float:9.403954E-38)
            X.UOf r4 = new X.UOf
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
            r30 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0047
            java.lang.String r1 = "JSON string for MediaJoinChatSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0047:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0264
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x025f
            int r0 = r1.hashCode()
            r3 = 0
            switch(r0) {
                case -2056597344: goto L_0x024f;
                case -2030994180: goto L_0x022f;
                case -2015362923: goto L_0x021f;
                case -1985806860: goto L_0x020f;
                case -1766928858: goto L_0x01e8;
                case -1562235024: goto L_0x01d8;
                case -1377763017: goto L_0x01b6;
                case -1203619573: goto L_0x01a2;
                case -970008040: goto L_0x0192;
                case -799136893: goto L_0x0182;
                case -277885525: goto L_0x0172;
                case -270906245: goto L_0x0162;
                case -59350230: goto L_0x0152;
                case 3601339: goto L_0x0138;
                case 110371416: goto L_0x0128;
                case 176121795: goto L_0x0118;
                case 1085391444: goto L_0x0108;
                case 1107859144: goto L_0x00f8;
                case 1126597251: goto L_0x00d6;
                case 1169975446: goto L_0x00c7;
                case 1231504520: goto L_0x00b8;
                case 1260322998: goto L_0x00a9;
                case 1620118465: goto L_0x0088;
                case 1776071171: goto L_0x0079;
                case 1832509061: goto L_0x006a;
                default: goto L_0x005d;
            }
        L_0x005d:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaJoinChatStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0066:
            r2.A0z()
            goto L_0x0047
        L_0x006a:
            java.lang.String r0 = "is_editing_enabled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A09 = r0
            goto L_0x0066
        L_0x0079:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r4.A02 = r0
            goto L_0x0066
        L_0x0088:
            java.lang.String r0 = "chat_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x00a6
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x00a6
            java.util.Map r0 = X.C16579UxY.A01
            java.lang.Object r3 = r0.get(r1)
            X.UxY r3 = (X.C16579UxY) r3
        L_0x00a6:
            r4.A04 = r3
            goto L_0x0066
        L_0x00a9:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r4.A01 = r0
            goto L_0x0066
        L_0x00b8:
            java.lang.String r0 = "duration_s"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.Long r0 = X.AnonymousClass7TF.A0Z(r2)
            r4.A0E = r0
            goto L_0x0066
        L_0x00c7:
            java.lang.String r0 = "deeplink_url"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0F = r0
            goto L_0x0066
        L_0x00d6:
            java.lang.String r0 = "chat_sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x00f4
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x00f4
            java.util.Map r0 = X.C16568UxL.A01
            java.lang.Object r3 = r0.get(r1)
            X.UxL r3 = (X.C16568UxL) r3
        L_0x00f4:
            r4.A06 = r3
            goto L_0x0066
        L_0x00f8:
            java.lang.String r0 = "group_image_uri"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0H = r0
            goto L_0x0066
        L_0x0108:
            java.lang.String r0 = "is_creation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A08 = r0
            goto L_0x0066
        L_0x0118:
            java.lang.String r0 = "active_member_count"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r2)
            r4.A0A = r0
            goto L_0x0066
        L_0x0128:
            java.lang.String r0 = "title"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0M = r0
            goto L_0x0066
        L_0x0138:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0066
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0066
            r4.A0N = r0
            goto L_0x0066
        L_0x0152:
            java.lang.String r0 = "member_count"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r2)
            r4.A0D = r0
            goto L_0x0066
        L_0x0162:
            java.lang.String r0 = "share_source"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0I = r0
            goto L_0x0066
        L_0x0172:
            java.lang.String r0 = "thread_id_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0L = r0
            goto L_0x0066
        L_0x0182:
            java.lang.String r0 = "entry_point"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0G = r0
            goto L_0x0066
        L_0x0192:
            java.lang.String r0 = "story_chat_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0J = r0
            goto L_0x0066
        L_0x01a2:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r4.A03 = r0
            goto L_0x0066
        L_0x01b6:
            java.lang.String r0 = "member_status"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x01d4
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x01d4
            java.util.Map r0 = X.C16575UxS.A01
            java.lang.Object r3 = r0.get(r1)
            X.UxS r3 = (X.C16575UxS) r3
        L_0x01d4:
            r4.A05 = r3
            goto L_0x0066
        L_0x01d8:
            java.lang.String r0 = "thread_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0K = r0
            goto L_0x0066
        L_0x01e8:
            java.lang.String r0 = "social_context_users"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x020b
        L_0x01fd:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x020b
            X.WQw r0 = X.C19237WQw.A00
            X.C13988Tno.A1I(r2, r0, r3)
            goto L_0x01fd
        L_0x020b:
            r4.A0O = r3
            goto L_0x0066
        L_0x020f:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            int r0 = r2.A1D()
            r4.A00 = r0
            goto L_0x0066
        L_0x021f:
            java.lang.String r0 = "audience_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r2)
            r4.A0B = r0
            goto L_0x0066
        L_0x022f:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0066
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0066
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0066
            r4.A07 = r0
            goto L_0x0066
        L_0x024f:
            java.lang.String r0 = "connected_member_count"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r2)
            r4.A0C = r0
            goto L_0x0066
        L_0x025f:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0264:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRC.invoke(X.16F):java.lang.Object");
    }
}
