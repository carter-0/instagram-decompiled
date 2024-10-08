package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6bh  reason: invalid class name and case insensitive filesystem */
public final class C310836bh extends C230372pW {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C310666bQ A03;

    public C310836bh(1Bk r4, C310666bQ r5) {
        super(r4, new C310846bi());
        AnonymousClass4DU r2 = r5.A02;
        this.A02 = r2;
        UserSession userSession = r5.A01;
        this.A01 = userSession;
        this.A03 = r5;
        this.A00 = AnonymousClass0kN.A00(r2, 0kJ.A03, userSession);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C46300DUd Bmy;
        String Bmx;
        C255773uh r9 = (C255773uh) obj;
        AnonymousClass6YY r10 = (AnonymousClass6YY) obj2;
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        UserSession userSession = this.A01;
        Boolean valueOf = Boolean.valueOf(182.A06(0Tu.A05, userSession, 36311998572659543L));
        AnonymousClass4DU r2 = this.A02;
        C310666bQ r6 = this.A03;
        AnonymousClass6KG A002 = AnonymousClass6KF.A00(r2, r10.A00.A0H, r6.A03);
        0wc r22 = this.A00;
        0Aj A003 = r22.A00(r22.A00, "instagram_organic_impression");
        if (A003.isSampled()) {
            C254523sc A022 = GTA.A02(userSession, A002, r9, "impression");
            A022.A02();
            A022.A1f = Boolean.valueOf(182.A06(0Tu.A06, userSession, 36313437386639328L));
            A022.A1u = valueOf;
            AnonymousClass3PI.A08(A022, r9, r10, r6);
            0jB A012 = A022.A01();
            A003.A7p("is_from_merlin_infra", false);
            A003.AAJ("reel_id", (String) A012.A01(C271774jZ.A7T));
            A003.A9F("session_reel_counter", (Long) A012.A01(C271774jZ.A7y));
            A003.A9F("reel_size", (Long) A012.A01(C271774jZ.A7V));
            A003.A9F("reel_start_position", (Long) A012.A01(C271774jZ.A7W));
            A003.A9F("reel_position", (Long) A012.A01(C271774jZ.A7U));
            A003.AAJ("reel_type", (String) A012.A01(C271774jZ.A7Y));
            A003.A9F("reel_viewer_position", (Long) A012.A01(C271774jZ.A7b));
            A003.A9F("carousel_opt_in_position", (Long) A012.A01(C271774jZ.A14));
            A003.A7p("is_video_to_carousel", (Boolean) A012.A01(C271774jZ.A4z));
            A003.A9F("tray_position", (Long) A012.A01(C271774jZ.A9P));
            A003.AAJ("tray_session_id", (String) A012.A01(C271774jZ.A7X));
            A003.AAJ("viewer_session_id", (String) A012.A01(C271774jZ.A9i));
            A003.AAJ("story_ranking_token", (String) A012.A01(C271774jZ.A8O));
            A003.A9F("is_dark_mode", (Long) A012.A01(C271774jZ.A4B));
            A003.AAJ("shopping_session_id", (String) A012.A01(C271774jZ.A80));
            A003.A9F("a_pk", (Long) A012.A01(C271774jZ.A0Z));
            A003.AAJ("m_pk", r9.A0j);
            A003.A9F("m_t", (Long) A012.A01(C271774jZ.A5a));
            A003.A8D("time_elapsed", (Double) A012.A01(C271774jZ.A8z));
            A003.A7p("has_stories_reshare_view_shop_cta", (Boolean) A012.A01(C271774jZ.A3S));
            Number number = (Number) A012.A01(C271774jZ.A1z);
            if (number != null) {
                A003.A9F("dark_mode_state", Long.valueOf((long) number.intValue()));
            }
            Long l = (Long) A012.A01(C271774jZ.A2O);
            if (l != null) {
                A003.A9F("effect_id", l);
            }
            if (valueOf != null) {
                A003.A7p("is_second_channel_enabled", valueOf);
            }
            1Xj r0 = r9.A0b;
            if (!(r0 == null || (Bmy = r0.A0C.Bmy()) == null || (Bmx = Bmy.Bmx()) == null)) {
                A003.A9F("repost_id", 00y.A0n(10, Bmx));
            }
            String str = (String) A012.A01(C271774jZ.A7j);
            if (str != null && str.length() > 0) {
                A003.A9F("merchant_id", Long.valueOf(Long.parseLong(str)));
            }
            A003.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A003.AAJ("device_aspect_ratio_category", C254473sX.A00);
            A003.AAJ("device_fold_orientation", C254483sY.A00);
            A003.AAJ("device_fold_state", C254493sZ.A00);
            A003.A7p("device_is_in_multi_window_mode", C254503sa.A00);
            A003.Cgf();
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C46300DUd Bmy;
        String Bmx;
        C255773uh r9 = (C255773uh) obj;
        AnonymousClass6YY r10 = (AnonymousClass6YY) obj2;
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        AnonymousClass4DU r2 = this.A02;
        C310666bQ r7 = this.A03;
        AnonymousClass6KG A002 = AnonymousClass6KF.A00(r2, r10.A00.A0H, r7.A03);
        0wc r22 = this.A00;
        0Aj A003 = r22.A00(r22.A00, "instagram_organic_sub_impression");
        if (A003.isSampled()) {
            UserSession userSession = this.A01;
            C254523sc A022 = GTA.A02(userSession, A002, r9, "sub_impression");
            A022.A02();
            A022.A1f = Boolean.valueOf(182.A06(0Tu.A06, userSession, 36313437386639328L));
            A022.A1u = null;
            AnonymousClass3PI.A08(A022, r9, r10, r7);
            0jB A012 = A022.A01();
            A003.AAJ("reel_id", (String) A012.A01(C271774jZ.A7T));
            A003.A9F("session_reel_counter", (Long) A012.A01(C271774jZ.A7y));
            A003.A9F("reel_size", (Long) A012.A01(C271774jZ.A7V));
            A003.A9F("reel_start_position", (Long) A012.A01(C271774jZ.A7W));
            A003.A9F("reel_position", (Long) A012.A01(C271774jZ.A7U));
            A003.AAJ("reel_type", (String) A012.A01(C271774jZ.A7Y));
            A003.A9F("reel_viewer_position", (Long) A012.A01(C271774jZ.A7b));
            A003.A9F("carousel_opt_in_position", (Long) A012.A01(C271774jZ.A14));
            A003.A7p("is_video_to_carousel", (Boolean) A012.A01(C271774jZ.A4z));
            A003.A9F("tray_position", (Long) A012.A01(C271774jZ.A9P));
            A003.AAJ("tray_session_id", (String) A012.A01(C271774jZ.A7X));
            A003.AAJ("viewer_session_id", (String) A012.A01(C271774jZ.A9i));
            A003.AAJ("story_ranking_token", (String) A012.A01(C271774jZ.A8O));
            A003.A9F("is_dark_mode", (Long) A012.A01(C271774jZ.A4B));
            A003.AAJ("shopping_session_id", (String) A012.A01(C271774jZ.A80));
            A003.A9F("a_pk", (Long) A012.A01(C271774jZ.A0Z));
            A003.AAJ("m_pk", r9.A0j);
            A003.A9F("m_t", (Long) A012.A01(C271774jZ.A5a));
            A003.A8D("time_elapsed", (Double) A012.A01(C271774jZ.A8z));
            A003.A7p("has_stories_reshare_view_shop_cta", (Boolean) A012.A01(C271774jZ.A3S));
            Number number = (Number) A012.A01(C271774jZ.A1z);
            if (number != null) {
                A003.A9F("dark_mode_state", Long.valueOf((long) number.intValue()));
            }
            Long l = (Long) A012.A01(C271774jZ.A2O);
            if (l != null) {
                A003.A9F("effect_id", l);
            }
            1Xj r0 = r9.A0b;
            if (!(r0 == null || (Bmy = r0.A0C.Bmy()) == null || (Bmx = Bmy.Bmx()) == null)) {
                A003.A9F("repost_id", 00y.A0n(10, Bmx));
            }
            String str = (String) A012.A01(C271774jZ.A7j);
            if (str != null && str.length() > 0) {
                A003.AAE(C263944Ny.A00(str), "merchant_id");
            }
            A003.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A003.AAJ("device_aspect_ratio_category", C254473sX.A00);
            A003.AAJ("device_fold_orientation", C254483sY.A00);
            A003.AAJ("device_fold_state", C254493sZ.A00);
            A003.A7p("device_is_in_multi_window_mode", C254503sa.A00);
            A003.Cgf();
        }
    }
}
