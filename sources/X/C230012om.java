package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;

/* renamed from: X.2om  reason: invalid class name and case insensitive filesystem */
public final class C230012om {
    public L7A A00;
    public final 0wc A01;
    public final String A02;

    public C230012om(AnonymousClass0iw r6, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r6, 2);
        this.A01 = AnonymousClass0kN.A01(r6, userSession);
        this.A02 = r6.getModuleName();
        1AA A022 = 182.A02(userSession, 36327713857878662L);
        if (A022 != null) {
            0Tu A002 = 0Tu.A00(new 0Tu());
            A002.A01 = true;
            0Tu A003 = 0Tu.A00(A002);
            A003.A03 = true;
            if (A022.Ah0(A003, 36327713857878662L)) {
                this.A00 = new L7A(userSession);
            }
        }
    }

    public static final String A00(User user) {
        EWA ewa;
        if (user == null) {
            return null;
        }
        int ordinal = user.B6o().ordinal();
        if (ordinal == 4 || ordinal == 5 || ordinal == 2) {
            ewa = EWA.UserActionFollow;
        } else if (ordinal != 3) {
            return null;
        } else {
            ewa = EWA.UserActionUnfollow;
        }
        return ewa.A00;
    }

    public static void A01(C230012om r8, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2) {
        0wc r2 = r8.A01;
        0Aj A002 = r2.A00(r2.A00, "recommended_user_impression");
        String str12 = str10;
        A002.AAJ("target_id", str12);
        A002.A8k("position", Integer.valueOf(i));
        A002.AAJ("view_module", str11);
        A002.AAJ("algorithm", str);
        A002.A8k("view_state_item_type", Integer.valueOf(i2));
        A002.AAJ("container_module", str2);
        A002.AAJ("follow_impression_id", str5);
        A002.A9F("follow_impression_length", l);
        A002.AAJ("ranking_algorithm", str8);
        A002.AAJ("social_context", str9);
        A002.AAJ("insertion_context", str6);
        A002.AAJ("display_format", str4);
        A002.AAJ("netego_unit_id", str7);
        A002.AAJ("context_type", str3);
        A002.A8k("num_facepiles", num);
        A002.AAJ("topic_name", (String) null);
        A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, (String) null);
        0bb r22 = new 0bb();
        r22.A06("search_session_id", (String) null);
        r22.A06("serp_session_id", (String) null);
        r22.A06("query_text", (String) null);
        r22.A06("rank_token", (String) null);
        A002.AAK(r22, "search_context");
        A002.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A002.Cgf();
        L7A l7a = r8.A00;
        if (l7a != null) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            C262224Cq r23 = l7a.A02;
            MFe mFe = new MFe((Object) l7a, valueOf, str12, (AnonymousClass4D7) null, 19);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, mFe, r23);
        }
    }

    public static void A03(C230012om r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2) {
        0wc r32 = r3.A01;
        0Aj A002 = r32.A00(r32.A00, "recommended_username_tapped");
        A002.AAJ("target_id", str10);
        A002.A8k("position", Integer.valueOf(i));
        A002.AAJ("view_module", str11);
        A002.AAJ("algorithm", str);
        A002.A8k("view_state_item_type", Integer.valueOf(i2));
        A002.AAJ("container_module", str2);
        A002.AAJ("follow_impression_id", str5);
        A002.AAJ("ranking_algorithm", str8);
        A002.AAJ("netego_unit_id", str7);
        A002.A9F("follow_impression_length", (Long) null);
        A002.AAJ("social_context", str9);
        A002.AAJ("context_type", str3);
        A002.AAJ("insertion_context", str6);
        A002.AAJ("display_format", str4);
        A002.AAJ("topic_name", (String) null);
        0bb r33 = new 0bb();
        r33.A06("search_session_id", (String) null);
        r33.A06("serp_session_id", (String) null);
        r33.A06("query_text", (String) null);
        r33.A06("rank_token", (String) null);
        A002.AAK(r33, "search_context");
        A002.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A002.Cgf();
    }

    public static void A04(C230012om r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2) {
        0wc r32 = r3.A01;
        0Aj A002 = r32.A00(r32.A00, "recommended_username_tapped");
        A002.AAJ("target_id", str10);
        A002.A8k("position", Integer.valueOf(i));
        A002.AAJ("view_module", str11);
        A002.AAJ("algorithm", str);
        A002.A8k("view_state_item_type", Integer.valueOf(i2));
        A002.AAJ("container_module", str2);
        A002.AAJ("follow_impression_id", str5);
        A002.AAJ("ranking_algorithm", str8);
        A002.AAJ("netego_unit_id", str7);
        A002.A9F("follow_impression_length", (Long) null);
        A002.AAJ("social_context", str9);
        A002.AAJ("context_type", str3);
        A002.AAJ("insertion_context", str6);
        A002.AAJ("display_format", str4);
        A002.AAJ("topic_name", (String) null);
        0bb r33 = new 0bb();
        r33.A06("search_session_id", (String) null);
        r33.A06("serp_session_id", (String) null);
        r33.A06("query_text", (String) null);
        r33.A06("rank_token", (String) null);
        A002.AAK(r33, "search_context");
        A002.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A002.Cgf();
    }

    public static void A05(C230012om r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, int i2) {
        0wc r32 = r3.A01;
        0Aj A002 = r32.A00(r32.A00, "recommended_follow_button_tapped");
        A002.AAJ("target_id", str12);
        A002.A8k("position", Integer.valueOf(i));
        A002.AAJ("view_module", str13);
        A002.AAJ("algorithm", str);
        A002.A8k("view_state_item_type", Integer.valueOf(i2));
        A002.AAJ("container_module", str2);
        A002.AAJ("request_type", str10);
        A002.AAJ("follow_status", str5);
        A002.AAJ("follow_impression_id", str6);
        A002.AAJ("ranking_algorithm", str9);
        A002.AAJ("social_context", str11);
        A002.AAJ("insertion_context", str7);
        A002.AAJ("display_format", str4);
        A002.AAJ("netego_unit_id", str8);
        A002.AAJ("topic_name", (String) null);
        A002.AAJ("context_type", str3);
        0bb r33 = new 0bb();
        r33.A06("search_session_id", (String) null);
        r33.A06("serp_session_id", (String) null);
        r33.A06("query_text", (String) null);
        r33.A06("rank_token", (String) null);
        A002.AAK(r33, "search_context");
        A002.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A002.Cgf();
    }

    public static void A02(C230012om r6, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        0wc r4 = r6.A01;
        0Aj A002 = r4.A00(r4.A00, "recommended_user_dismissed");
        A002.AAJ("target_id", str4);
        A002.A8k("position", Integer.valueOf(i));
        A002.AAJ("view_module", str5);
        A002.AAJ("algorithm", "");
        A002.A8k("view_state_item_type", Integer.valueOf(i2));
        A002.AAJ("container_module", str);
        A002.AAJ("follow_impression_id", "");
        A002.AAJ("ranking_algorithm", (String) null);
        A002.AAJ("social_context", (String) null);
        A002.AAJ("insertion_context", str2);
        A002.AAJ("display_format", "preview");
        A002.AAJ("netego_unit_id", str3);
        A002.AAJ("topic_name", (String) null);
        0bb r1 = new 0bb();
        r1.A06("search_session_id", (String) null);
        r1.A06("serp_session_id", (String) null);
        r1.A06("query_text", (String) null);
        r1.A06("rank_token", (String) null);
        A002.AAK(r1, "search_context");
        A002.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A002.Cgf();
    }

    public static void A06(C230012om r2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, int i2) {
        0wc r22 = r2.A01;
        0Aj A002 = r22.A00(r22.A00, "recommended_follow_button_tapped");
        A002.AAJ("target_id", str13);
        A002.A8k("position", Integer.valueOf(i));
        A002.AAJ("view_module", str14);
        A002.AAJ("algorithm", str);
        A002.A8k("view_state_item_type", Integer.valueOf(i2));
        A002.AAJ("container_module", str2);
        A002.AAJ("request_type", str10);
        A002.AAJ("follow_status", str5);
        A002.AAJ("follow_impression_id", str6);
        A002.AAJ("ranking_algorithm", str9);
        A002.AAJ("social_context", str11);
        A002.AAJ("insertion_context", str7);
        A002.AAJ("display_format", str4);
        A002.AAJ("netego_unit_id", str8);
        A002.AAJ("topic_name", str12);
        A002.AAJ("context_type", str3);
        0bb r3 = new 0bb();
        r3.A06("search_session_id", (String) null);
        r3.A06("serp_session_id", (String) null);
        r3.A06("query_text", (String) null);
        r3.A06("rank_token", (String) null);
        A002.AAK(r3, "search_context");
        A002.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A002.Cgf();
    }

    public final void A07(AnonymousClass6KN r5) {
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "recommended_user_dismissed");
        A002.AAJ("target_id", r5.A0E);
        A002.A8k("position", Integer.valueOf(r5.A00));
        A002.AAJ("view_module", r5.A0F);
        A002.AAJ("algorithm", r5.A04);
        A002.A8k("view_state_item_type", -1);
        A002.AAJ("container_module", r5.A05);
        A002.AAJ("follow_impression_id", r5.A08);
        A002.AAJ("ranking_algorithm", r5.A0A);
        A002.AAJ("social_context", r5.A0C);
        A002.AAJ("insertion_context", (String) null);
        A002.AAJ("display_format", (String) null);
        A002.AAJ("netego_unit_id", r5.A09);
        A002.AAJ("topic_name", r5.A0D);
        0bb r22 = new 0bb();
        r22.A06("search_session_id", (String) null);
        r22.A06("serp_session_id", (String) null);
        r22.A06("query_text", (String) null);
        r22.A06("rank_token", (String) null);
        A002.AAK(r22, "search_context");
        A002.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A002.Cgf();
    }

    public final void A08(AnonymousClass6KN r5) {
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "recommended_follow_button_tapped");
        A002.AAJ("target_id", r5.A0E);
        A002.A8k("position", Integer.valueOf(r5.A00));
        A002.AAJ("view_module", r5.A0F);
        A002.AAJ("algorithm", r5.A04);
        A002.A8k("view_state_item_type", -1);
        A002.AAJ("container_module", r5.A05);
        A002.AAJ("request_type", r5.A0B);
        A002.AAJ("follow_status", r5.A07);
        A002.AAJ("follow_impression_id", r5.A08);
        A002.AAJ("ranking_algorithm", r5.A0A);
        A002.AAJ("social_context", r5.A0C);
        A002.AAJ("insertion_context", (String) null);
        A002.AAJ("display_format", (String) null);
        A002.AAJ("netego_unit_id", r5.A09);
        A002.AAJ("topic_name", r5.A0D);
        A002.AAJ("context_type", (String) null);
        0bb r1 = new 0bb();
        r1.A06("search_session_id", (String) null);
        r1.A06("serp_session_id", (String) null);
        r1.A06("query_text", (String) null);
        r1.A06("rank_token", (String) null);
        A002.AAK(r1, "search_context");
        A002.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A002.Cgf();
    }

    public final void A09(AnonymousClass6KN r10) {
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "recommended_user_impression");
        String str = r10.A0E;
        A002.AAJ("target_id", str);
        A002.A8k("position", Integer.valueOf(r10.A00));
        A002.AAJ("view_module", r10.A0F);
        A002.AAJ("algorithm", r10.A04);
        A002.A8k("view_state_item_type", -1);
        A002.AAJ("container_module", r10.A05);
        A002.AAJ("follow_impression_id", r10.A08);
        A002.A9F("follow_impression_length", r10.A03);
        A002.AAJ("ranking_algorithm", r10.A0A);
        A002.AAJ("social_context", r10.A0C);
        A002.AAJ("insertion_context", (String) null);
        A002.AAJ("display_format", (String) null);
        A002.AAJ("netego_unit_id", r10.A09);
        A002.AAJ("context_type", (String) null);
        A002.A8k("num_facepiles", r10.A02);
        A002.AAJ("topic_name", r10.A0D);
        A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
        A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r10.A06);
        0bb r1 = new 0bb();
        r1.A06("search_session_id", (String) null);
        r1.A06("serp_session_id", (String) null);
        r1.A06("query_text", (String) null);
        r1.A06("rank_token", (String) null);
        A002.AAK(r1, "search_context");
        A002.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A002.Cgf();
        L7A l7a = this.A00;
        if (l7a != null) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            C262224Cq r22 = l7a.A02;
            MFe mFe = new MFe((Object) l7a, valueOf, str, (AnonymousClass4D7) null, 19);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, mFe, r22);
        }
    }

    public final void A0A(AnonymousClass6KN r4) {
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, C273654mx.A00(913));
        A002.AAJ("view_module", r4.A0F);
        A002.A8k("view_state_item_type", -1);
        A002.AAJ("ranking_algorithm", r4.A0A);
        A002.AAJ("netego_unit_id", r4.A09);
        A002.AAJ("module", this.A02);
        A002.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A002.Cgf();
    }

    public final void A0B(AnonymousClass6KN r5) {
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "recommended_username_tapped");
        A002.AAJ("target_id", r5.A0E);
        A002.A8k("position", Integer.valueOf(r5.A00));
        A002.AAJ("view_module", r5.A0F);
        A002.AAJ("algorithm", r5.A04);
        A002.A8k("view_state_item_type", -1);
        A002.AAJ("container_module", r5.A05);
        A002.AAJ("follow_impression_id", r5.A08);
        A002.AAJ("ranking_algorithm", r5.A0A);
        A002.AAJ("netego_unit_id", r5.A09);
        A002.A9F("follow_impression_length", r5.A03);
        A002.AAJ("social_context", r5.A0C);
        A002.AAJ("context_type", (String) null);
        A002.AAJ("insertion_context", (String) null);
        A002.AAJ("display_format", (String) null);
        A002.AAJ("topic_name", r5.A0D);
        0bb r22 = new 0bb();
        r22.A06("search_session_id", (String) null);
        r22.A06("serp_session_id", (String) null);
        r22.A06("query_text", (String) null);
        r22.A06("rank_token", (String) null);
        A002.AAK(r22, "search_context");
        A002.A8M((AnonymousClass0Ac) null, "text_app_aysf_vertical_type");
        A002.Cgf();
    }
}
