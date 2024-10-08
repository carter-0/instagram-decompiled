package X;

/* renamed from: X.Ivp  reason: case insensitive filesystem */
public final class C58680Ivp extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58680Ivp(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C58680Ivp A00(C286575Wy r1, Object obj, int i) {
        C58680Ivp ivp = new C58680Ivp(obj, i);
        r1.FLL(ivp);
        return ivp;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (((X.C317746nl) r3.A04.getValue()).A01() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r0 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0090, code lost:
        r0 = (X.C62320sa) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        X.C51967G9n.A16(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r51 = this;
            r1 = r51
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0385;
                case 1: goto L_0x0373;
                case 2: goto L_0x007a;
                case 3: goto L_0x0007;
                case 4: goto L_0x0007;
                case 5: goto L_0x008a;
                case 6: goto L_0x0087;
                case 7: goto L_0x007a;
                case 8: goto L_0x0007;
                case 9: goto L_0x0087;
                case 10: goto L_0x0087;
                case 11: goto L_0x0087;
                case 12: goto L_0x0080;
                case 13: goto L_0x007a;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x0007;
                case 17: goto L_0x0007;
                case 18: goto L_0x0087;
                case 19: goto L_0x0363;
                case 20: goto L_0x0353;
                case 21: goto L_0x034c;
                case 22: goto L_0x034c;
                case 23: goto L_0x0342;
                case 24: goto L_0x0339;
                case 25: goto L_0x0392;
                case 26: goto L_0x0332;
                case 27: goto L_0x032b;
                case 28: goto L_0x0321;
                case 29: goto L_0x0392;
                case 30: goto L_0x0332;
                case 31: goto L_0x032b;
                case 32: goto L_0x034c;
                case 33: goto L_0x0342;
                case 34: goto L_0x0198;
                case 35: goto L_0x0184;
                case 36: goto L_0x0173;
                case 37: goto L_0x0163;
                case 38: goto L_0x0150;
                case 39: goto L_0x0142;
                case 40: goto L_0x0392;
                case 41: goto L_0x0332;
                case 42: goto L_0x032b;
                case 43: goto L_0x0114;
                case 44: goto L_0x00fa;
                case 45: goto L_0x0039;
                case 46: goto L_0x0012;
                case 47: goto L_0x00c6;
                case 48: goto L_0x00bf;
                case 49: goto L_0x0097;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r1.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 0
        L_0x000c:
            X.C51967G9n.A16(r1, r0)
        L_0x000f:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0012:
            java.lang.Object r1 = r1.A01
            X.GT9 r1 = (X.GT9) r1
            X.GmL r0 = r1.A03()
            boolean r0 = r0.A0d
            if (r0 != 0) goto L_0x000f
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            if (r0 == 0) goto L_0x000f
            X.37D r4 = X.DbT.A0i(r0)
            if (r4 == 0) goto L_0x000f
            X.0xx r3 = X.DbW.A0E(r1)
            r2 = 0
            r1 = 2
            X.MG0 r0 = new X.MG0
            r0.<init>(r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x000f
        L_0x0039:
            java.lang.Object r3 = r1.A01
            X.H3n r3 = (X.C54218H3n) r3
            X.GmL r0 = r3.A03()
            boolean r0 = r0.A0d
            r2 = 1
            if (r0 == 0) goto L_0x0055
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.6nl r0 = (X.C317746nl) r0
            boolean r0 = r0.A01()
            r1 = 1
            if (r0 != 0) goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            X.GmL r0 = r3.A03()
            boolean r0 = r0.A0V
            if (r0 == 0) goto L_0x0078
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.6nl r0 = (X.C317746nl) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0078
        L_0x006c:
            if (r1 != 0) goto L_0x0070
            if (r2 == 0) goto L_0x000f
        L_0x0070:
            X.0sP r1 = r3.A0B
            r0 = 1065353216(0x3f800000, float:1.0)
            X.C51967G9n.A1Q(r1, r0)
            goto L_0x000f
        L_0x0078:
            r2 = 0
            goto L_0x006c
        L_0x007a:
            java.lang.Object r1 = r1.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 1
            goto L_0x000c
        L_0x0080:
            java.lang.Object r0 = r1.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x000f
            goto L_0x0092
        L_0x0087:
            java.lang.Object r0 = r1.A01
            goto L_0x0090
        L_0x008a:
            java.lang.Object r0 = r1.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
        L_0x0090:
            X.0sa r0 = (X.C62320sa) r0
        L_0x0092:
            r0.invoke()
            goto L_0x000f
        L_0x0097:
            java.lang.Object r4 = r1.A01
            X.GT9 r4 = (X.GT9) r4
            X.0eM r0 = r4.A0A
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.GmL r5 = r4.A03()
            X.0eM r0 = r4.A09
            X.4DU r7 = X.I03.A00(r0)
            r0 = 48
            X.Ivp r8 = new X.Ivp
            r8.<init>(r4, r0)
            r0 = 32
            X.Imy r9 = new X.Imy
            r9.<init>(r4, r0)
            X.7bg r3 = new X.7bg
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x00bf:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.FragmentActivity r3 = X.DbZ.A0E(r0)
            return r3
        L_0x00c6:
            java.lang.Object r4 = r1.A01
            X.GT9 r4 = (X.GT9) r4
            X.0eM r0 = r4.A0A
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            X.GmL r5 = r4.A03()
            X.0eM r0 = r4.A09
            X.4DU r8 = X.I03.A00(r0)
            X.GgO r6 = r4.A04()
            java.lang.Object r0 = r0.getValue()
            X.I03 r0 = (X.I03) r0
            X.1L1 r9 = r0.A01
            r0 = 45
            X.Ivp r10 = new X.Ivp
            r10.<init>(r4, r0)
            r0 = 46
            X.Ivp r11 = new X.Ivp
            r11.<init>(r4, r0)
            X.IPR r3 = new X.IPR
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r3
        L_0x00fa:
            java.lang.Object r1 = r1.A01
            X.GT9 r1 = (X.GT9) r1
            X.0eM r0 = r1.A0A
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A09
            X.4DU r1 = X.I03.A00(r0)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.7bA r3 = new X.7bA
            r3.<init>(r1, r2)
            return r3
        L_0x0114:
            java.lang.Object r1 = r1.A01
            X.GT9 r1 = (X.GT9) r1
            X.GmL r6 = r1.A03()
            android.app.Application r4 = X.DbY.A05(r1)
            X.0eM r0 = r1.A09
            X.4DU r8 = X.I03.A00(r0)
            java.lang.Object r0 = r0.getValue()
            X.I03 r0 = (X.I03) r0
            X.1L1 r9 = r0.A01
            X.0eM r0 = r1.A0A
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r1.A07
            java.lang.Object r5 = r0.getValue()
            X.GyO r5 = (X.C54039GyO) r5
            X.7Zz r3 = new X.7Zz
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x0142:
            java.lang.Object r0 = r1.A01
            X.GT9 r0 = (X.GT9) r0
            X.GmL r0 = r0.A03()
            X.I03 r3 = new X.I03
            r3.<init>(r0)
            return r3
        L_0x0150:
            java.lang.Object r2 = r1.A01
            X.GT9 r2 = (X.GT9) r2
            X.0eM r0 = r2.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.content.Context r0 = r2.requireContext()
            X.3KG r3 = X.AnonymousClass3KF.A00(r0, r1)
            return r3
        L_0x0163:
            java.lang.Object r0 = r1.A01
            X.GT9 r0 = (X.GT9) r0
            X.0eM r0 = r0.A0A
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.GyO r3 = new X.GyO
            r3.<init>(r0)
            return r3
        L_0x0173:
            java.lang.Object r0 = r1.A01
            X.GT9 r0 = (X.GT9) r0
            X.0eM r0 = r0.A09
            X.4DU r2 = X.I03.A00(r0)
            r1 = 1
            r0 = 0
            X.3E5 r3 = X.AnonymousClass3E4.A01(r2, r0, r1)
            return r3
        L_0x0184:
            java.lang.Object r2 = r1.A01
            X.GT9 r2 = (X.GT9) r2
            X.0eM r0 = r2.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.GgO r0 = r2.A04()
            X.7be r3 = new X.7be
            r3.<init>(r0, r1)
            return r3
        L_0x0198:
            java.lang.Object r0 = r1.A01
            android.os.Bundle r0 = X.DbS.A0B(r0)
            r1 = 0
            java.lang.String r2 = "media_id"
            java.lang.String r3 = ""
            java.lang.String r11 = r0.getString(r2, r3)
            X.0qQ.A07(r11)
            java.lang.String r2 = "poll_id"
            r5 = 0
            java.lang.String r15 = r0.getString(r2, r5)
            java.lang.String r2 = "parent_media_id"
            java.lang.String r12 = r0.getString(r2, r5)
            java.lang.String r2 = "source_module_name"
            java.lang.String r13 = r0.getString(r2, r3)
            X.0qQ.A07(r13)
            r2 = 376(0x178, float:5.27E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r14 = r0.getString(r2, r5)
            java.lang.String r2 = "ad_retrieval_key"
            java.lang.String r16 = r0.getString(r2, r5)
            java.lang.String r2 = "is_viewer_owner_of_source_media"
            boolean r25 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "is_organic_eligible"
            boolean r26 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "is_sponsored_eligible"
            boolean r27 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "comment_sheet_entrypoint"
            java.io.Serializable r4 = r0.getSerializable(r2)
            boolean r2 = r4 instanceof X.AnonymousClass5OB
            if (r2 == 0) goto L_0x031e
            X.5OB r4 = (X.AnonymousClass5OB) r4
        L_0x01ee:
            java.lang.String r2 = "auto_open_keyboard"
            boolean r28 = r0.getBoolean(r2)
            java.lang.String r2 = "show_single_media_title"
            boolean r29 = r0.getBoolean(r2)
            java.lang.String r2 = "previous_session_id"
            java.lang.String r17 = r0.getString(r2)
            java.lang.String r2 = "chaining_session_id"
            java.lang.String r18 = r0.getString(r2)
            java.lang.String r2 = "carousel_index"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x031b
            java.lang.Integer r6 = X.DbV.A0o(r0, r2)
        L_0x0212:
            java.lang.String r2 = "media_position_in_feed"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x0318
            java.lang.Integer r7 = X.DbV.A0o(r0, r2)
        L_0x021e:
            java.lang.String r2 = "media_position_in_clips_viewer"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x0315
            java.lang.Integer r8 = X.DbV.A0o(r0, r2)
        L_0x022a:
            java.lang.String r2 = "is_carousel_bumped_post"
            boolean r30 = r0.getBoolean(r2)
            java.lang.String r2 = "recs_position_in_feed"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x0312
            java.lang.Integer r9 = X.DbV.A0o(r0, r2)
        L_0x023c:
            java.lang.String r2 = "carousel_comment_mention_parent_media_id"
            java.lang.String r19 = r0.getString(r2, r5)
            java.lang.String r2 = "carousel_comment_mention_parent_child_index"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x030f
            java.lang.Integer r10 = X.DbV.A0o(r0, r2)
        L_0x024e:
            java.lang.String r2 = "is_slide_thread"
            boolean r31 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "is_from_preview_comment"
            boolean r32 = r0.getBoolean(r2, r1)
            r2 = 1524(0x5f4, float:2.136E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r33 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "is_reels_viewer"
            boolean r34 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "is_story_comments"
            boolean r35 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "is_campfire_media"
            boolean r36 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "hide_comment_reply"
            boolean r37 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "hide_timestamp"
            boolean r38 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "remove_highlight"
            boolean r39 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "show_caption_as_comment"
            boolean r40 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "comment_thread_fragment_intent_extra_is_appreciation_enabled"
            boolean r41 = r0.getBoolean(r2, r1)
            r2 = 140(0x8c, float:1.96E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            int r24 = r0.getInt(r2)
            java.lang.String r2 = "has_hidden_comments"
            boolean r42 = r0.getBoolean(r2)
            java.lang.String r2 = "CommentThreadFragment.HIDE_EMOJI_BAR"
            boolean r43 = r0.getBoolean(r2)
            java.lang.String r2 = "CommentThreadFragment.INTENT_EXTRA_PREVIEW_COMMENT_IMPRESSIONS"
            long[] r2 = r0.getLongArray(r2)
            if (r2 == 0) goto L_0x030c
            java.util.List r23 = X.03t.A0H(r2)
        L_0x02b6:
            java.lang.String r2 = "starting_clips_media_id"
            java.lang.String r20 = r0.getString(r2)
            java.lang.String r2 = "starting_clips_ranking_info_token"
            java.lang.String r21 = r0.getString(r2)
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            boolean r44 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "hide_comment_composer"
            boolean r45 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "hide_comment_universal_cta"
            boolean r46 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "commentPromptParentCommentId"
            java.lang.String r22 = r0.getString(r2, r5)
            java.lang.String r2 = "autoOpenCommentPromptReply"
            boolean r47 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "close_on_keyboard_dismiss"
            boolean r48 = r0.getBoolean(r2)
            java.lang.String r2 = "initial_opening_height_ratio"
            boolean r3 = r0.containsKey(r2)
            if (r3 == 0) goto L_0x02fa
            float r2 = r0.getFloat(r2)
            java.lang.Float r5 = java.lang.Float.valueOf(r2)
        L_0x02fa:
            java.lang.String r2 = "show_caption_as_top_comment"
            boolean r49 = r0.getBoolean(r2, r1)
            java.lang.String r2 = "show_more_info"
            boolean r50 = r0.getBoolean(r2, r1)
            X.GmL r3 = new X.GmL
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            return r3
        L_0x030c:
            r23 = r5
            goto L_0x02b6
        L_0x030f:
            r10 = r5
            goto L_0x024e
        L_0x0312:
            r9 = r5
            goto L_0x023c
        L_0x0315:
            r8 = r5
            goto L_0x022a
        L_0x0318:
            r7 = r5
            goto L_0x021e
        L_0x031b:
            r6 = r5
            goto L_0x0212
        L_0x031e:
            r4 = r5
            goto L_0x01ee
        L_0x0321:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.KBR r3 = new X.KBR
            r3.<init>(r0)
            return r3
        L_0x032b:
            java.lang.Object r0 = r1.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x0332:
            java.lang.Object r0 = r1.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x0339:
            java.lang.Object r0 = r1.A01
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            X.07f r3 = r0.getViewModelStore()
            return r3
        L_0x0342:
            java.lang.Object r0 = r1.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.7cS r3 = new X.7cS
            r3.<init>(r0)
            return r3
        L_0x034c:
            java.lang.Object r0 = r1.A01
            X.07f r3 = X.C51971G9r.A0U(r0)
            return r3
        L_0x0353:
            java.lang.Object r0 = r1.A01
            X.K3M r0 = (X.K3M) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.7cS r3 = new X.7cS
            r3.<init>(r0)
            return r3
        L_0x0363:
            java.lang.Object r0 = r1.A01
            X.K3M r0 = (X.K3M) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBR r3 = new X.KBR
            r3.<init>(r0)
            return r3
        L_0x0373:
            java.lang.Object r0 = r1.A01
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            boolean r1 = r0.AkV()
            boolean r0 = r0.AkW()
            r1 = r1 ^ r0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L_0x0385:
            java.lang.Object r0 = r1.A01
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            boolean r0 = r0.AkW()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0392:
            java.lang.Object r3 = r1.A01
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58680Ivp.invoke():java.lang.Object");
    }
}
