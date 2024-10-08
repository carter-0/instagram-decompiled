package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.api.schemas.DestinationRecommendationReason;
import com.instagram.api.schemas.Estimate;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.SpecialRequirementCategory;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class WGU implements CallerContextable {
    public static final CallerContext A07 = CallerContext.A00(WGU.class);
    public static final AnonymousClass0iw A08 = new WPN();
    public static final String __redex_internal_original_name = "PromotedPostsLogger";
    public LinkingAuthState A00;
    public String A01 = "entry_point_unknown";
    public String A02;
    public String A03 = 1Q9.A01("boost_posts").A05();
    public boolean A04;
    public final 0wc A05;
    public final UserSession A06;

    public static void A01(DestinationRecommendationReason destinationRecommendationReason, XIGIGBoostDestination xIGIGBoostDestination, WGU wgu, Long l, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3) {
        0Aj A0H = C13990Tnq.A0H(wgu, wgu.A05, "promoted_posts_finish_step");
        DbS.A1H(A0H, str);
        A0H.AAJ("m_pk", wgu.A02);
        A0H.AAJ("bfa_platform", "native_android");
        0bb r4 = new 0bb();
        if (str2 != null) {
            r4.A06("destination", str2);
        }
        String str6 = str5;
        if (str5 != null && !str6.isEmpty()) {
            r4.A06("aymt_channel", str6);
        }
        if (xIGIGBoostDestination != null) {
            r4.A06("recommended_destination", xIGIGBoostDestination.toString());
        }
        if (destinationRecommendationReason != null) {
            r4.A06("destination_recommendation_reason", destinationRecommendationReason.toString());
        }
        0bb r7 = null;
        List list4 = list;
        if (!AnonymousClass4KJ.A00(list4)) {
            List list5 = list2;
            if (!AnonymousClass4KJ.A00(list5)) {
                List list6 = list3;
                if (list3 != null) {
                    r7 = new 0bb();
                    r7.A07("selected_set", list4);
                    r7.A07("predicted_set", list5);
                    r7.A07("intersection_set", list6);
                    r7.A05("selected_count", Long.valueOf((long) list4.size()));
                    r7.A05("predicted_count", Long.valueOf((long) list5.size()));
                    r7.A05("intersection_count", Long.valueOf((long) list6.size()));
                    r7.A04("precision", Double.valueOf(((double) list6.size()) / ((double) list4.size())));
                    r7.A04("recall", Double.valueOf(((double) list6.size()) / ((double) list5.size())));
                }
            }
        }
        A0H.AAK(r4, "selected_values");
        0bb r1 = new 0bb();
        C13990Tnq.A18(r1, wgu);
        r1.A06("m_pk", wgu.A02);
        r1.A06("media_grid_type", str3);
        r1.A05("media_index", l);
        r1.A03("dark_post_media_contains_edit", (Boolean) null);
        r1.A03("dark_post_media_contains_caption", (Boolean) null);
        r1.A03("dark_post_media_contains_hashtag", (Boolean) null);
        r1.A03("dark_post_media_contains_location", (Boolean) null);
        r1.A02(r7, "recommendation_precision_recall_values");
        r1.A06(AnonymousClass000.A00(766), str4);
        C13988Tno.A18(A0H, r1);
    }

    public final void A0F(C16678UzE uzE, String str) {
        A03(uzE, this, (Boolean) null, str);
    }

    public final void A0R(String str, String str2) {
        A05(this, str, str2, (String) null);
    }

    public final void A0S(String str, String str2) {
        A06(this, str, str2, (String) null);
    }

    public final void A0U(String str, String str2, String str3) {
        A07(this, str, str2, str3, (String) null, (String) null);
    }

    public static WGU A00(UserSession userSession) {
        return (WGU) C20405Wqp.A00(userSession, WGU.class, 2);
    }

    public static void A02(C16678UzE uzE, WGU wgu, SpecialRequirementCategory specialRequirementCategory, C16616UyC uyC, Boolean bool, Boolean bool2, Boolean bool3, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(wgu.A05, "promoted_posts_tap_component");
        if (A0e.isSampled()) {
            0bb r2 = new 0bb();
            C13990Tnq.A18(r2, wgu);
            if (bool != null) {
                r2.A03("is_story_placement_eligible", bool);
            }
            if (specialRequirementCategory != null) {
                r2.A06("regulated_category_type", specialRequirementCategory.A01);
            }
            if (bool2 != null) {
                r2.A03("is_fb_placement_toggle_on", bool2);
            }
            if (bool3 != null) {
                r2.A03("is_default_welcome_message_enabled", bool3);
            }
            if (uyC != null) {
                r2.A06("media_boosted_status", uyC.toString());
            }
            A0e.AAJ("component", str);
            C13990Tnq.A10(A0e, wgu, uzE);
            C13988Tno.A18(A0e, r2);
        }
    }

    public static void A03(C16678UzE uzE, WGU wgu, Boolean bool, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(wgu.A05, "promoted_posts_tap_component");
        if (A0e.isSampled()) {
            0bb r1 = new 0bb();
            C13990Tnq.A18(r1, wgu);
            if (bool != null) {
                r1.A03("run_continuously", bool);
            }
            A0e.AAJ("component", str);
            C13990Tnq.A10(A0e, wgu, uzE);
            C13988Tno.A18(A0e, r1);
        }
    }

    public static void A04(WGU wgu) {
        1Q9.A01("boost_posts").A08();
        wgu.A03 = 1Q9.A01("boost_posts").A05();
        0Aj A0H = C13990Tnq.A0H(wgu, wgu.A05, "promoted_posts_tap_entry_point");
        C51965G9l.A1I(A0H, wgu.A02);
        0bb r0 = new 0bb();
        C13990Tnq.A18(r0, wgu);
        C13988Tno.A18(A0H, r0);
    }

    public static void A05(WGU wgu, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(wgu.A05, "promoted_posts_action");
        if (A0e.isSampled()) {
            A0e.AAJ("waterfall_id", wgu.A03);
            DbS.A1J(A0e, str2);
            DbS.A1N(A0e, wgu.A01);
            C13989Tnp.A1G(A0e, wgu, "step", str);
            0bb r1 = new 0bb();
            C13990Tnq.A18(r1, wgu);
            r1.A06("last_promote_flow_step", str3);
            C13988Tno.A18(A0e, r1);
        }
    }

    public static void A06(WGU wgu, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(wgu.A05, "promoted_posts_start_step");
        DbS.A1N(A0e, str);
        A0e.AAJ("waterfall_id", wgu.A03);
        C13989Tnp.A1G(A0e, wgu, "step", str2);
        0bb r1 = new 0bb();
        C13990Tnq.A18(r1, wgu);
        r1.A06(AnonymousClass000.A00(766), str3);
        C13989Tnp.A1D(A0e, r1);
    }

    public static void A07(WGU wgu, String str, String str2, String str3, String str4, String str5) {
        0Aj A0e = AnonymousClass7TE.A0e(wgu.A05, "promoted_posts_action_error");
        if (A0e.isSampled()) {
            A0e.AAJ("waterfall_id", wgu.A03);
            DbS.A1J(A0e, str2);
            DbS.A1N(A0e, wgu.A01);
            DbS.A1H(A0e, str);
            A0e.AAJ("error_message", str3);
            A0e.AAJ("error_identifier", str4);
            0bb r1 = new 0bb();
            C13990Tnq.A18(r1, wgu);
            r1.A06("last_promote_flow_step", str5);
            C13988Tno.A18(A0e, r1);
        }
    }

    public final void A08(DestinationRecommendationReason destinationRecommendationReason, XIGIGBoostDestination xIGIGBoostDestination, XIGIGBoostDestination xIGIGBoostDestination2, C16678UzE uzE, String str) {
        String str2;
        String str3;
        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "ig_ctd_default_messaging_intent_regex_match");
        boolean equals = C16678UzE.OBJECTIVE.equals(uzE);
        StringBuilder A0n = AnonymousClass7TF.A0n("ig_ctd_default_");
        if (equals) {
            A0n.append(destinationRecommendationReason);
            str2 = "_objective_screen";
        } else {
            A0n.append(destinationRecommendationReason);
            str2 = "_summary_screen";
        }
        String A0l = AnonymousClass7TF.A0l(str2, A0n);
        boolean A1W = AnonymousClass7TF.A1W(xIGIGBoostDestination, xIGIGBoostDestination2);
        if (XIGIGBoostDestination.DIRECT_MESSAGE.equals(xIGIGBoostDestination) && A0e.isSampled()) {
            A0e.AAE(C263944Ny.A00(this.A06.A06), "ig_userid");
            A0e.A9F("ad_account_id", C51971G9r.A0m());
            StringBuilder sb = new StringBuilder();
            if (A1W) {
                sb.append(A0l);
                str3 = "_opt_in";
            } else {
                sb.append(A0l);
                str3 = "_opt_out";
            }
            A0e.AAJ("event", AnonymousClass7TF.A0l(str3, sb));
            G9t.A1J(A0e, str);
            A0e.AAJ("media_caption", "");
            A0e.Cgf();
        }
    }

    public final void A09(Estimate estimate, XIGIGBoostDestination xIGIGBoostDestination, C16678UzE uzE, Boolean bool, String str, String str2, String str3, int i, int i2, int i3) {
        String obj;
        Long valueOf;
        Long valueOf2;
        if (xIGIGBoostDestination == null) {
            obj = "";
        } else {
            obj = xIGIGBoostDestination.toString();
        }
        if (estimate == null) {
            valueOf = null;
            valueOf2 = null;
        } else {
            valueOf = Long.valueOf((long) estimate.A00);
            valueOf2 = Long.valueOf((long) estimate.A01);
        }
        0bb r4 = new 0bb();
        r4.A06("destination", obj);
        r4.A06("audience_code", str);
        r4.A05("selected_budget_w_offset", Long.valueOf((long) i));
        r4.A05(AnonymousClass000.A00(3945), Long.valueOf((long) i2));
        r4.A06("currency", str2);
        0bb r1 = new 0bb();
        r1.A05("lower_bound", valueOf);
        r1.A05("upper_bound", valueOf2);
        r4.A02(r1, "reach_estimate");
        0bb r12 = new 0bb();
        r12.A05("lower_bound", (Long) null);
        r12.A05("upper_bound", (Long) null);
        r4.A02(r12, "outcome_estimate");
        if (i3 >= 0) {
            0bb r2 = new 0bb();
            r2.A05("position", C51971G9r.A0m());
            r4.A02(r2, "selected_boost_packages");
        }
        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "promoted_posts_submit");
        C13990Tnq.A10(A0e, this, uzE);
        0bb r13 = new 0bb();
        C13990Tnq.A18(r13, this);
        r13.A06("promote_flow_type", str3);
        r13.A03("is_default_welcome_message_enabled", bool);
        A0e.AAK(r13, "configurations");
        A0e.AAK(r4, "selected_values");
        A0e.A8M(V1P.IG_ANDROID, "creation_platform_id");
        A0e.AAJ("bfa_platform", "native_android");
        A0e.Cgf();
    }

    public final void A0C(C16678UzE uzE, Boolean bool) {
        A02(uzE, this, (SpecialRequirementCategory) null, (C16616UyC) null, bool, (Boolean) null, (Boolean) null, "ad_preview");
    }

    public final void A0E(C16678UzE uzE, String str) {
        0Aj A0H = C13990Tnq.A0H(this, this.A05, "promoted_posts_finish_step_error");
        DbS.A1H(A0H, uzE.toString());
        0bb r1 = new 0bb();
        A0H.AAJ("error_message", "User didn't complete billing required wizard");
        A0H.AAK(r1, "selected_values");
        A0H.AAJ("component", (String) null);
        0bb r12 = new 0bb();
        r12.A06(AnonymousClass000.A00(766), str);
        C13988Tno.A18(A0H, r12);
    }

    public final void A0G(C16678UzE uzE, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "promoted_posts_tap_component");
        if (A0e.isSampled()) {
            0bb r1 = new 0bb();
            r1.A06("messaging_app", str);
            A0e.AAJ("component", "messaging_app_radio_button");
            C13990Tnq.A10(A0e, this, uzE);
            C13988Tno.A18(A0e, r1);
        }
    }

    public final void A0H(C16678UzE uzE, String str) {
        0bb r2 = new 0bb();
        C13990Tnq.A18(r2, this);
        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "promoted_posts_view_component");
        A0e.AAJ("component", str);
        C13990Tnq.A10(A0e, this, uzE);
        C13988Tno.A18(A0e, r2);
    }

    public final void A0J(C16678UzE uzE, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "promoted_posts_submit_error");
        C13990Tnq.A10(A0e, this, uzE);
        0bb r1 = new 0bb();
        C13990Tnq.A18(r1, this);
        r1.A06("promote_flow_type", str2);
        A0e.AAK(r1, "configurations");
        A0e.AAJ("error_message", str);
        A0e.AAJ("bfa_platform", "native_android");
        A0e.Cgf();
    }

    public final void A0K(C16678UzE uzE, String str, String str2, String str3) {
        0bb r2 = new 0bb();
        C13990Tnq.A18(r2, this);
        if (str2 != null) {
            r2.A06("recommended_destination", str2);
        }
        if (str3 != null) {
            r2.A06("destination_recommendation_reason", str3);
        }
        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "promoted_posts_view_component");
        A0e.AAJ("component", str);
        C13990Tnq.A10(A0e, this, uzE);
        C13988Tno.A18(A0e, r2);
    }

    public final void A0L(C16678UzE uzE, String str, Throwable th) {
        String str2;
        if (th == null || th.getMessage() == null) {
            str2 = "";
        } else {
            str2 = th.getMessage();
        }
        A0I(uzE, str, str2);
    }

    public final void A0M(C16678UzE uzE, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "promoted_posts_tap_component");
        if (A0e.isSampled()) {
            0bb r2 = new 0bb();
            r2.A03("is_advantage_audience_toggle_on", Boolean.valueOf(z));
            A0e.AAJ("component", "adv_audience_toggle");
            C13990Tnq.A10(A0e, this, uzE);
            C13988Tno.A18(A0e, r2);
        }
    }

    public final void A0N(C16678UzE uzE, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A05, "promoted_posts_tap_component");
        if (A0e.isSampled()) {
            0bb r2 = new 0bb();
            r2.A03("is_advantage_audience_optional_section_open", Boolean.valueOf(z));
            A0e.AAJ("component", "optional_suggestions");
            C13990Tnq.A10(A0e, this, uzE);
            C13988Tno.A18(A0e, r2);
        }
    }

    public final void A0O(UserSession userSession, String str, String str2, String str3) {
        this.A01 = str2;
        this.A04 = AnonymousClass7TF.A1V(C16905VAi.A00(userSession).A00);
        A0W(str, str3, (String) null);
    }

    public final void A0P(C16616UyC uyC, String str, String str2, String str3, String str4) {
        this.A02 = str;
        0bb r2 = new 0bb();
        C13990Tnq.A18(r2, this);
        LinkingAuthState linkingAuthState = this.A00;
        if (linkingAuthState == null) {
            linkingAuthState = LinkingAuthState.BUSINESS_TOKEN_OR_UNKNOWN;
        }
        r2.A06("token_auth_state", linkingAuthState.toString());
        if (uyC != null) {
            r2.A06("media_boosted_status", uyC.toString());
        }
        0Aj A0H = C13990Tnq.A0H(this, this.A05, "promoted_posts_enter_error");
        C51965G9l.A1I(A0H, this.A02);
        DbS.A1H(A0H, str2);
        A0H.AAJ("error_identifier", str3);
        A0H.AAJ("error_message", str4);
        C13989Tnp.A1D(A0H, r2);
    }

    public final void A0Q(String str) {
        A06(this, this.A01, str, (String) null);
    }

    public final void A0T(String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        A04(this);
    }

    public final void A0V(String str, String str2, String str3) {
        0Aj A0H = C13990Tnq.A0H(this, this.A05, "promoted_posts_fetch_data_error");
        C13989Tnp.A1G(A0H, this, "action", str2);
        DbS.A1H(A0H, str);
        A0H.AAJ("error_message", str3);
        0bb r0 = new 0bb();
        C13990Tnq.A18(r0, this);
        C13988Tno.A18(A0H, r0);
    }

    public final void A0W(String str, String str2, String str3) {
        0bb r2 = new 0bb();
        C13990Tnq.A18(r2, this);
        if (str3 != null) {
            r2.A06("audience_identifiers", str3);
        }
        0Aj A0H = C13990Tnq.A0H(this, this.A05, "promoted_posts_fetch_data");
        C13989Tnp.A1G(A0H, this, "action", str2);
        DbS.A1H(A0H, str);
        C13988Tno.A18(A0H, r2);
    }

    public final void A0X(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        0Aj A0H = C13990Tnq.A0H(this, this.A05, "promoted_posts_start_step");
        C13989Tnp.A1G(A0H, this, "step", str);
        0bb r1 = new 0bb();
        C13990Tnq.A18(r1, this);
        r1.A06("prefill_destination", str2);
        r1.A06("prefill_website", str3);
        r1.A06("prefill_website_cta", str4);
        r1.A06("aymt_channel", str5);
        r1.A06("recommended_destination", str6);
        r1.A06("destination_recommendation_reason", str7);
        C13989Tnp.A1D(A0H, r1);
    }

    public final void A0Y(String str, String str2, Throwable th) {
        String str3;
        if (th == null || th.getMessage() == null) {
            str3 = "";
        } else {
            str3 = th.getMessage();
        }
        A07(this, str, str2, str3, (String) null, (String) null);
    }

    public WGU(UserSession userSession) {
        this.A05 = AnonymousClass0kN.A01(A08, userSession);
        this.A06 = userSession;
        this.A04 = AnonymousClass7TF.A1V(C16905VAi.A00(userSession).A00);
    }

    public final void A0A(C16678UzE uzE) {
        A01((DestinationRecommendationReason) null, (XIGIGBoostDestination) null, this, (Long) null, uzE.toString(), (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null);
    }

    public final void A0B(C16678UzE uzE, PromoteData promoteData) {
        String obj = uzE.toString();
        String A0t = DbX.A0t(promoteData.A0i);
        String str = promoteData.A1E;
        A01(promoteData.A0S, promoteData.A0h, this, (Long) null, obj, A0t, (String) null, (String) null, str, (List) null, (List) null, (List) null);
    }

    public final void A0D(C16678UzE uzE, String str) {
        A0W(uzE.toString(), str, (String) null);
    }

    public final void A0I(C16678UzE uzE, String str, String str2) {
        A0V(uzE.toString(), str, str2);
    }
}
