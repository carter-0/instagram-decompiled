package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.8jv  reason: invalid class name and case insensitive filesystem */
public final class C363558jv {
    public static final boolean A00(UserSession userSession) {
        0xa r1;
        String str;
        0qQ.A0B(userSession, 0);
        if (C363028iv.A00(userSession).isCrossPostingSettingsPlatformizationReadEnabled()) {
            return C363028iv.A00(userSession).getDataProvider().B56();
        }
        if (C363038ix.A02(userSession)) {
            r1 = 2D5.A00(userSession).A04;
            str = "PREFERENCE_CREATOR_FEED_BPL_AUTO_XPOSTING";
        } else {
            r1 = 1Au.A00(userSession).A01;
            str = "auto_cross_post_to_facebook_feed";
        }
        return r1.getBoolean(str, false);
    }

    public final void A01(UserSession userSession, Integer num, String str, boolean z, boolean z2) {
        String str2;
        boolean z3;
        boolean z4;
        0xa r0;
        String str3;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 2);
        C299935wF A00 = C363388je.A00(userSession).A00(C363548ju.A02);
        if (num == null) {
            num = A00.A01;
        }
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2) {
            str2 = "PREFERENCE_CREATOR_FEED_BPL_AUTO_XPOSTING";
            z3 = false;
            z4 = 2D5.A00(userSession).A04.getBoolean(str2, false);
            r0 = 2D5.A00(userSession).A04;
        } else {
            str2 = "auto_cross_post_to_facebook_feed";
            z3 = false;
            z4 = 1Au.A00(userSession).A01.getBoolean(str2, false);
            r0 = 1Au.A00(userSession).A01;
        }
        0xY AR4 = r0.AR4();
        AR4.E5T(str2, z);
        AR4.apply();
        if (z4 != z) {
            2D5.A00(userSession).A04(z);
            if (2D5.A00(userSession).A04.getBoolean("PREFERENCE_SETTINGS_AUTO_XPOSTING_DEBUG_TOAST_ENABLED", z3)) {
                if (z) {
                    str3 = "enable";
                } else {
                    str3 = "disable";
                }
                C59689JTv.A0G(002.A0g("[DEBUG ONLY] Attempting to ", str3, " feed auto-crossposting"));
            }
        }
        if (A00.A01 == num2 || C363388je.A03(A00)) {
            String A01 = C378169Ot.A01(num);
            0wc A02 = AnonymousClass0kN.A02(userSession);
            0Aj A002 = A02.A00(A02.A00, "ig_auto_xposting_to_fb_setting");
            A002.AAJ("flow_name", "ig_feed_share_to_fb");
            A002.AAJ(TraceFieldType.AdhocEventName, "client_setting_updated");
            A002.AAJ("xposting_setting_location", str);
            A002.A7p("client_setting", Boolean.valueOf(z));
            A002.A7p("user_interaction", Boolean.valueOf(z2));
            A002.AAJ("account_type", AnonymousClass0eD.A01(userSession).name());
            A002.AAJ("destination_account_linkage_type", A01);
            A002.Cgf();
        }
    }
}
