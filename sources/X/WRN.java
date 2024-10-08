package X;

public final class WRN implements AnonymousClass1FD {
    public static final WRN A00 = new WRN();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r39) {
        /*
            r38 = this;
            r0 = 0
            r2 = r39
            X.0qQ.A0B(r2, r0)
            r5 = 0
            r37 = 2147483647(0x7fffffff, float:NaN)
            X.UOi r4 = new X.UOi
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
            r33 = r5
            r34 = r5
            r35 = r0
            r36 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0053
            java.lang.String r1 = "JSON string for MediaPromptSticker should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0053:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x02df
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)
            if (r1 == 0) goto L_0x02da
            int r3 = r1.hashCode()
            r0 = 0
            switch(r3) {
                case -2030994180: goto L_0x02ba;
                case -1996772183: goto L_0x02aa;
                case -1985806860: goto L_0x029a;
                case -1911580874: goto L_0x028a;
                case -1475936846: goto L_0x027a;
                case -1203619573: goto L_0x0266;
                case -1167125638: goto L_0x023f;
                case -1114680033: goto L_0x022f;
                case -1061345759: goto L_0x021f;
                case -1025303767: goto L_0x020f;
                case -900774058: goto L_0x01ff;
                case -885136013: goto L_0x01eb;
                case -871809258: goto L_0x01db;
                case -821815367: goto L_0x01c7;
                case 3355: goto L_0x01ad;
                case 3556653: goto L_0x0193;
                case 3601339: goto L_0x0179;
                case 186507096: goto L_0x0155;
                case 405415469: goto L_0x0145;
                case 464576065: goto L_0x0135;
                case 493270317: goto L_0x0125;
                case 849767883: goto L_0x0115;
                case 917294641: goto L_0x0101;
                case 1233798655: goto L_0x00f1;
                case 1260322998: goto L_0x00e2;
                case 1324364035: goto L_0x00d3;
                case 1356750754: goto L_0x00c4;
                case 1597787285: goto L_0x00b5;
                case 1634479413: goto L_0x0094;
                case 1776071171: goto L_0x0085;
                case 2036780306: goto L_0x0076;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaPromptStickerJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0072:
            r2.A0z()
            goto L_0x0053
        L_0x0076:
            java.lang.String r0 = "background_color"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0N = r0
            goto L_0x0072
        L_0x0085:
            java.lang.String r0 = "drawable_config"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.ULH r0 = X.C13988Tno.A0N(r2)
            r4.A05 = r0
            goto L_0x0072
        L_0x0094:
            java.lang.String r3 = "prompt_type"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0069
            X.16L r3 = r2.A11()
            X.16L r1 = X.16L.A0G
            if (r3 == r1) goto L_0x00b2
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x00b2
            java.util.Map r0 = X.C16587Uxh.A01
            java.lang.Object r0 = r0.get(r1)
            X.Uxh r0 = (X.C16587Uxh) r0
        L_0x00b2:
            r4.A09 = r0
            goto L_0x0072
        L_0x00b5:
            java.lang.String r0 = "is_from_add_yours_camera_tool"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0F = r0
            goto L_0x0072
        L_0x00c4:
            java.lang.String r0 = "is_original_prompt_media"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0H = r0
            goto L_0x0072
        L_0x00d3:
            java.lang.String r0 = "participant_count"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            int r0 = r2.A1D()
            r4.A00 = r0
            goto L_0x0072
        L_0x00e2:
            java.lang.String r0 = "timed_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.ULw r0 = X.C13988Tno.A0H(r2)
            r4.A04 = r0
            goto L_0x0072
        L_0x00f1:
            java.lang.String r0 = "is_speakeasy"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0J = r0
            goto L_0x0072
        L_0x0101:
            java.lang.String r0 = "election_add_yours_info"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.WQy r0 = X.C19239WQy.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.Jw8 r0 = (X.C61070Jw8) r0
            r4.A02 = r0
            goto L_0x0072
        L_0x0115:
            java.lang.String r0 = "has_participated"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0B = r0
            goto L_0x0072
        L_0x0125:
            java.lang.String r0 = "is_icon_disabled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0G = r0
            goto L_0x0072
        L_0x0135:
            java.lang.String r0 = "is_viewer_original_author"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0M = r0
            goto L_0x0072
        L_0x0145:
            java.lang.String r0 = "is_created_from_add_yours_browsing"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0E = r0
            goto L_0x0072
        L_0x0155:
            java.lang.String r0 = "disablement_state"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0072
            java.lang.String r1 = r2.A1P()
            if (r1 == 0) goto L_0x0072
            java.util.Map r0 = X.C16555Ux2.A01
            java.lang.Object r0 = r0.get(r1)
            X.Ux2 r0 = (X.C16555Ux2) r0
            if (r0 == 0) goto L_0x0072
            r4.A08 = r0
            goto L_0x0072
        L_0x0179:
            java.lang.String r0 = "uuid"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0072
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0072
            r4.A0T = r0
            goto L_0x0072
        L_0x0193:
            java.lang.String r0 = "text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0072
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0072
            r4.A0S = r0
            goto L_0x0072
        L_0x01ad:
            java.lang.String r0 = "id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0072
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0072
            r4.A0O = r0
            goto L_0x0072
        L_0x01c7:
            java.lang.String r0 = "original_author"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.WQw r0 = X.C19237WQw.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKp r0 = (X.C15036UKp) r0
            r4.A07 = r0
            goto L_0x0072
        L_0x01db:
            java.lang.String r0 = "prompt_style"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0Q = r0
            goto L_0x0072
        L_0x01eb:
            java.lang.String r0 = "prompt_failure_tooltip"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.WRb r0 = X.C19242WRb.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.ULg r0 = (X.C15050ULg) r0
            r4.A03 = r0
            goto L_0x0072
        L_0x01ff:
            java.lang.String r0 = "media_id"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0P = r0
            goto L_0x0072
        L_0x020f:
            java.lang.String r0 = "is_before_and_after"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0C = r0
            goto L_0x0072
        L_0x021f:
            java.lang.String r0 = "sticker_style_str"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = X.C13989Tnp.A0o(r2)
            r4.A0R = r0
            goto L_0x0072
        L_0x022f:
            java.lang.String r0 = "is_story_trending_prompt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0K = r0
            goto L_0x0072
        L_0x023f:
            java.lang.String r0 = "facepile_top_participants"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0262
        L_0x0254:
            X.16L r1 = r2.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0262
            X.WQw r0 = X.C19237WQw.A00
            X.C13988Tno.A1I(r2, r0, r3)
            goto L_0x0254
        L_0x0262:
            r4.A0U = r3
            goto L_0x0072
        L_0x0266:
            java.lang.String r0 = "drawable_transform"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.WQu r0 = X.C19235WQu.A00
            java.lang.Object r0 = X.16P.A01(r2, r0)
            X.UKv r0 = (X.C15042UKv) r0
            r4.A06 = r0
            goto L_0x0072
        L_0x027a:
            java.lang.String r0 = "is_clips_v2_media"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0D = r0
            goto L_0x0072
        L_0x028a:
            java.lang.String r0 = "is_pinned_by_creator"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0I = r0
            goto L_0x0072
        L_0x029a:
            java.lang.String r0 = "selected_variant_index"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            int r0 = r2.A1D()
            r4.A01 = r0
            goto L_0x0072
        L_0x02aa:
            java.lang.String r0 = "is_trending_prompt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r2)
            r4.A0L = r0
            goto L_0x0072
        L_0x02ba:
            java.lang.String r0 = "sticker_type"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            X.16L r1 = r2.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0072
            java.lang.String r0 = r2.A1P()
            if (r0 == 0) goto L_0x0072
            X.Uxr r0 = X.C13988Tno.A0O(r0)
            if (r0 == 0) goto L_0x0072
            r4.A0A = r0
            goto L_0x0072
        L_0x02da:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x02df:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRN.invoke(X.16F):java.lang.Object");
    }
}
