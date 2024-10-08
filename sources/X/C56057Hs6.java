package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Hs6  reason: case insensitive filesystem */
public final class C56057Hs6 {
    public long A00;

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x02b2, code lost:
        if (X.182.A06(r2, r14, 36326154784749117L) == false) goto L_0x027d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.app.Activity r11, X.C59544JNq r12, X.C53335GmL r13, com.instagram.common.session.UserSession r14, X.C273414mX r15, X.C62320sa r16, boolean r17, boolean r18, boolean r19) {
        /*
            r10 = this;
            r5 = 0
            boolean r6 = X.AnonymousClass7TF.A1U(r5, r14, r11)
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r10.A00
            long r7 = r0 - r2
            r3 = 250(0xfa, double:1.235E-321)
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x029c
            r10.A00 = r0
            if (r17 == 0) goto L_0x02c5
            X.H3n r3 = new X.H3n
            r3.<init>()
        L_0x001c:
            X.GT9 r3 = (X.GT9) r3
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            X.C227642jf.A04(r4, r14)
            java.lang.String r7 = r13.A0E
            java.lang.String r0 = "media_id"
            r4.putString(r0, r7)
            java.lang.String r8 = r13.A0G
            java.lang.String r0 = "poll_id"
            r4.putString(r0, r8)
            java.lang.String r1 = r13.A0C
            java.lang.String r0 = "parent_media_id"
            r4.putString(r0, r1)
            java.lang.String r1 = r13.A0F
            java.lang.String r0 = "source_module_name"
            r4.putString(r0, r1)
            java.lang.String r1 = r13.A0J
            r0 = 376(0x178, float:5.27E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putString(r0, r1)
            java.lang.String r1 = r13.A08
            java.lang.String r0 = "ad_retrieval_key"
            r4.putString(r0, r1)
            boolean r1 = r13.A0e
            java.lang.String r0 = "is_viewer_owner_of_source_media"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0Y
            java.lang.String r0 = "is_organic_eligible"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0c
            java.lang.String r0 = "is_sponsored_eligible"
            r4.putBoolean(r0, r1)
            X.5OB r1 = r13.A01
            java.lang.String r0 = "comment_sheet_entrypoint"
            r4.putSerializable(r0, r1)
            boolean r1 = r13.A0M
            java.lang.String r0 = "auto_open_keyboard"
            r4.putBoolean(r0, r1)
            java.lang.String r0 = "show_single_media_title"
            r4.putBoolean(r0, r5)
            java.lang.String r1 = r13.A0D
            java.lang.String r0 = "previous_session_id"
            r4.putString(r0, r1)
            java.lang.String r1 = r13.A0A
            java.lang.String r0 = "chaining_session_id"
            r4.putString(r0, r1)
            java.lang.Integer r0 = r13.A04
            if (r0 == 0) goto L_0x0096
            int r1 = r0.intValue()
            java.lang.String r0 = "carousel_index"
            r4.putInt(r0, r1)
        L_0x0096:
            java.lang.Integer r0 = r13.A06
            if (r0 == 0) goto L_0x00a3
            int r1 = r0.intValue()
            java.lang.String r0 = "media_position_in_feed"
            r4.putInt(r0, r1)
        L_0x00a3:
            java.lang.Integer r0 = r13.A05
            if (r0 == 0) goto L_0x00b0
            int r1 = r0.intValue()
            java.lang.String r0 = "media_position_in_clips_viewer"
            r4.putInt(r0, r1)
        L_0x00b0:
            boolean r1 = r13.A0W
            java.lang.String r0 = "is_carousel_bumped_post"
            r4.putBoolean(r0, r1)
            java.lang.Integer r0 = r13.A07
            if (r0 == 0) goto L_0x00c4
            int r1 = r0.intValue()
            java.lang.String r0 = "recs_position_in_feed"
            r4.putInt(r0, r1)
        L_0x00c4:
            java.lang.String r1 = r13.A09
            java.lang.String r0 = "carousel_comment_mention_parent_media_id"
            r4.putString(r0, r1)
            java.lang.Integer r0 = r13.A03
            if (r0 == 0) goto L_0x00d8
            int r1 = r0.intValue()
            java.lang.String r0 = "carousel_comment_mention_parent_child_index"
            r4.putInt(r0, r1)
        L_0x00d8:
            boolean r1 = r13.A0b
            java.lang.String r0 = "is_slide_thread"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0X
            java.lang.String r0 = "is_from_preview_comment"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0Z
            r0 = 1524(0x5f4, float:2.136E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0a
            java.lang.String r0 = "is_reels_viewer"
            r4.putBoolean(r0, r1)
            boolean r9 = r13.A0d
            java.lang.String r0 = "is_story_comments"
            r4.putBoolean(r0, r9)
            boolean r1 = r13.A0V
            java.lang.String r0 = "is_campfire_media"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0Q
            java.lang.String r0 = "hide_comment_reply"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0T
            java.lang.String r0 = "hide_timestamp"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0f
            java.lang.String r0 = "remove_highlight"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0g
            java.lang.String r0 = "show_caption_as_comment"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0U
            java.lang.String r0 = "comment_thread_fragment_intent_extra_is_appreciation_enabled"
            r4.putBoolean(r0, r1)
            int r1 = r13.A00
            r0 = 140(0x8c, float:1.96E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putInt(r0, r1)
            boolean r1 = r13.A0O
            java.lang.String r0 = "has_hidden_comments"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0S
            java.lang.String r0 = "CommentThreadFragment.HIDE_EMOJI_BAR"
            r4.putBoolean(r0, r1)
            java.util.List r0 = r13.A0K
            if (r0 == 0) goto L_0x02c2
            long[] r1 = X.00k.A0y(r0)
        L_0x014a:
            java.lang.String r0 = "CommentThreadFragment.INTENT_EXTRA_PREVIEW_COMMENT_IMPRESSIONS"
            r4.putLongArray(r0, r1)
            java.lang.String r1 = r13.A0H
            java.lang.String r0 = "starting_clips_media_id"
            r4.putString(r0, r1)
            java.lang.String r1 = r13.A0I
            java.lang.String r0 = "starting_clips_ranking_info_token"
            r4.putString(r0, r1)
            boolean r1 = r13.A0i
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0P
            java.lang.String r0 = "hide_comment_composer"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0R
            java.lang.String r0 = "hide_comment_universal_cta"
            r4.putBoolean(r0, r1)
            java.lang.String r1 = r13.A0B
            java.lang.String r0 = "commentPromptParentCommentId"
            r4.putString(r0, r1)
            boolean r1 = r13.A0L
            java.lang.String r0 = "autoOpenCommentPromptReply"
            r4.putBoolean(r0, r1)
            java.lang.String r0 = "close_on_keyboard_dismiss"
            r4.putBoolean(r0, r5)
            java.lang.Float r2 = r13.A02
            if (r2 == 0) goto L_0x0196
            float r1 = r2.floatValue()
            java.lang.String r0 = "initial_opening_height_ratio"
            r4.putFloat(r0, r1)
        L_0x0196:
            boolean r1 = r13.A0h
            java.lang.String r0 = "show_caption_as_top_comment"
            r4.putBoolean(r0, r1)
            boolean r1 = r13.A0j
            java.lang.String r0 = "show_more_info"
            r4.putBoolean(r0, r1)
            r3.setArguments(r4)
            r3.A01 = r12
            r0 = r16
            r3.A02 = r0
            X.7Pr r4 = X.DbS.A0W(r14)
            r0 = 2131964352(0x7f1331c0, float:1.9565483E38)
            java.lang.String r1 = r11.getString(r0)
            r0 = 2132017856(0x7f1402c0, float:1.9674002E38)
            r4.A0d = r1
            r4.A0D = r0
            r4.A1O = r6
            r4.A0T = r3
            r4.A1I = r6
            X.DbS.A1S(r4, r6)
            if (r18 == 0) goto L_0x02b5
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x01cc:
            r4.A03 = r0
            r4.A0U = r15
            r4.A1P = r6
            if (r18 == 0) goto L_0x01ed
            X.7Ps r2 = X.C51971G9r.A0h(r5)
            r0 = 2131237906(0x7f081c12, float:1.8092076E38)
            r2.A02 = r0
            r1 = 15
            X.ICx r0 = new X.ICx
            r0.<init>(r11, r1)
            r2.A05 = r0
            X.7Pt r0 = r2.A00()
            r4.A06(r0)
        L_0x01ed:
            X.1Xj r2 = X.DbV.A0U(r14, r7)
            if (r2 == 0) goto L_0x0223
            r1 = 0
            X.3de r0 = new X.3de
            r0.<init>(r2, r1)
            boolean r0 = X.C245953dk.A00(r14, r0)
            if (r0 == 0) goto L_0x0223
            boolean r0 = X.C249223jK.A02(r14)
            if (r0 == 0) goto L_0x0223
            android.graphics.drawable.ColorDrawable r0 = X.C51965G9l.A0D(r5)
            r4.A0I = r0
            r0 = 2130970208(0x7f040660, float:1.754912E38)
            int r0 = X.AnonymousClass7TF.A03(r11, r0)
            android.graphics.drawable.ColorDrawable r0 = X.C51965G9l.A0D(r0)
            r4.A0J = r0
            r0 = 2131237763(0x7f081b83, float:1.8091786E38)
            android.graphics.drawable.Drawable r0 = r11.getDrawable(r0)
            r4.A0H = r0
            r4.A07 = r6
        L_0x0223:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323032343653113(0x810b9b00022af9, double:3.0341701430131874E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x0232
            r4.A1R = r6
        L_0x0232:
            r0 = 36323032344308482(0x810b9b000c2b02, double:3.0341701434276454E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x023f
            r4.A07 = r6
        L_0x023f:
            r0 = 36323032344242945(0x810b9b000b2b01, double:3.0341701433861996E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x025e
            r4.A1C = r5
            r0 = 2130970306(0x7f0406c2, float:1.7549318E38)
            int r6 = X.AnonymousClass7TF.A03(r11, r0)
            int r1 = X.AnonymousClass7TF.A03(r11, r0)
            X.Hky r0 = new X.Hky
            r0.<init>(r6, r1)
            r4.A0P = r0
        L_0x025e:
            if (r9 == 0) goto L_0x0270
            r0 = 2130970332(0x7f0406dc, float:1.7549371E38)
            int r0 = X.AnonymousClass7TF.A03(r11, r0)
            r4.A06 = r0
            r0 = 0
            r4.A0d = r0
            r4.A0c = r0
            r4.A1C = r5
        L_0x0270:
            if (r19 == 0) goto L_0x029d
            r0 = 36326154784880191(0x810e720002363f, double:3.036144787418253E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 != 0) goto L_0x02a8
        L_0x027d:
            r1 = 0
        L_0x027e:
            r4.A0z = r1
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()
            X.Iiw r0 = new X.Iiw
            r0.<init>(r11, r13, r3, r4)
            r1.post(r0)
            if (r8 == 0) goto L_0x029c
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.Iix r2 = new X.Iix
            r2.<init>(r11, r13, r14, r8)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
        L_0x029c:
            return
        L_0x029d:
            r0 = 36326154784945728(0x810e7200033640, double:3.036144787459699E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x027d
        L_0x02a8:
            r0 = 36326154784749117(0x810e720000363d, double:3.0361447873353615E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            r1 = 1
            if (r0 != 0) goto L_0x027e
            goto L_0x027d
        L_0x02b5:
            if (r2 == 0) goto L_0x02bd
            float r0 = r2.floatValue()
            goto L_0x01cc
        L_0x02bd:
            r0 = 1060320051(0x3f333333, float:0.7)
            goto L_0x01cc
        L_0x02c2:
            r1 = 0
            goto L_0x014a
        L_0x02c5:
            X.H3o r3 = new X.H3o
            r3.<init>()
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56057Hs6.A00(android.app.Activity, X.JNq, X.GmL, com.instagram.common.session.UserSession, X.4mX, X.0sa, boolean, boolean, boolean):void");
    }

    public final void A01(Activity activity, C53335GmL gmL, UserSession userSession, boolean z, boolean z2) {
        A00(activity, (C59544JNq) null, gmL, userSession, (C273414mX) null, (C62320sa) null, z, true, z2);
    }

    public final void A02(FragmentActivity fragmentActivity, AnonymousClass5OB r57, UserSession userSession, AnonymousClass4DU r59, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        0qQ.A0B(fragmentActivity2, 0);
        UserSession userSession2 = userSession;
        AnonymousClass4DU r7 = r59;
        String str4 = str;
        DbZ.A0t(1, userSession2, r7, str4);
        String str5 = str2;
        boolean z7 = z;
        boolean z8 = z5;
        if (z2) {
            C309516Yo A0Q = DbU.A0Q(fragmentActivity2, userSession2);
            F3W A0k = C51971G9r.A0k(str4);
            A0k.A0E = r7.getModuleName();
            A0k.A02 = 1sy.A0U;
            A0k.A0N = true;
            A0k.A09 = str5;
            A0k.A0G = str5;
            A0k.A0H = str3;
            A0k.A0T = z4;
            A0k.A0S = z7;
            A0k.A0V = z8;
            A0Q.A0D(A0k.A01());
            A0Q.A04();
            return;
        }
        boolean z9 = z7;
        String str6 = str5;
        FragmentActivity fragmentActivity3 = fragmentActivity2;
        UserSession userSession3 = userSession2;
        A01(fragmentActivity3, new C53335GmL(r57, (Float) null, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str4, (String) null, r7.getModuleName(), str6, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 0, z9, r7.isOrganicEligible(), r7.isSponsoredEligible(), false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, z3, z8, false, false, false, false, false, false), userSession3, 182.A06(0Tu.A05, userSession2, 36318771736287670L), z6);
    }
}
