package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Q7  reason: invalid class name */
public abstract class AnonymousClass9Q7 {
    public static final void A02(UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_auto_xposting_to_fb_setting");
        A0e.AAJ("flow_name", "ig_feed_share_to_fb");
        A01(A0e, str2, str, str3, z);
        A00(A0e, userSession, false, "user_interaction", str4);
    }

    public static final void A03(UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_auto_xposting_to_fb_setting");
        A0e.AAJ("flow_name", "ig_reels_share_to_fb");
        A01(A0e, str2, str, str3, z);
        A00(A0e, userSession, false, "user_interaction", str4);
    }

    public static final void A04(UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_auto_xposting_to_fb_setting");
        A0e.AAJ("flow_name", "ig_story_share_to_fb");
        A01(A0e, str2, str, str3, z);
        A00(A0e, userSession, false, "user_interaction", str4);
    }

    public static final void A05(UserSession userSession, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_auto_xposting_to_fb_setting");
        A0e.AAJ("flow_name", "ig_feed_share_to_fb");
        A01(A0e, str2, str, str3, z);
        A0e.A7p("user_interaction", true);
        A00(A0e, userSession, Boolean.valueOf(z2), "user_attempted_client_setting", str4);
    }

    public static void A01(0Aj r2, String str, String str2, String str3, boolean z) {
        r2.AAJ(TraceFieldType.AdhocEventName, str);
        r2.AAJ("xposting_setting_location", str2);
        r2.A7p("client_setting", Boolean.valueOf(z));
        r2.AAJ("server_setting", str3);
    }

    public static final void A06(UserSession userSession, String str, String str2, String str3, boolean z, boolean z2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_auto_xposting_to_fb_setting");
        A0e.AAJ("flow_name", "ig_reels_share_to_fb");
        A01(A0e, str, "reels", str2, z);
        A0e.AAJ("account_type", AnonymousClass0eD.A01(userSession).name());
        A0e.A7p("user_attempted_client_setting", Boolean.valueOf(z2));
        A0e.AAJ("destination_account_linkage_type", str3);
        A0e.Cgf();
    }

    public static void A00(0Aj r2, 0lg r3, Boolean bool, String str, String str2) {
        r2.A7p(str, bool);
        r2.AAJ("account_type", AnonymousClass0eD.A01(r3).name());
        r2.AAJ("destination_account_linkage_type", str2);
        r2.Cgf();
    }
}
