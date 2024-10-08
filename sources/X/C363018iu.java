package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.8iu  reason: invalid class name and case insensitive filesystem */
public final class C363018iu {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (C363028iv.A00(userSession).isCrossPostingSettingsPlatformizationReadEnabled()) {
            return C363028iv.A00(userSession).getDataProvider().C0A();
        }
        if (C363038ix.A02(userSession)) {
            return 2D5.A00(userSession).A04.getBoolean("PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING", false);
        }
        1Av A00 = 1Au.A00(userSession);
        return ((Boolean) A00.A1B.CDM(A00, 1Av.A8a[132])).booleanValue();
    }

    public final void A01(UserSession userSession, Integer num, String str, boolean z, boolean z2) {
        boolean A00;
        String str2;
        String str3;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 3);
        if (C363038ix.A02(userSession)) {
            A00 = 2D5.A00(userSession).A04.getBoolean("PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING", false);
            0xY AR4 = 2D5.A00(userSession).A04.AR4();
            AR4.E5T("PREFERENCE_CREATOR_STORY_BPL_AUTO_XPOSTING", z);
            AR4.apply();
        } else {
            A00 = A00(userSession);
            1Au.A00(userSession).A1L(z);
            if (A00 != z) {
                2D5.A00(userSession).A05(z);
            }
        }
        if (A00 != z && 2D5.A00(userSession).A04.getBoolean("PREFERENCE_SETTINGS_AUTO_XPOSTING_DEBUG_TOAST_ENABLED", false)) {
            if (z) {
                str3 = "enable";
            } else {
                str3 = "disable";
            }
            C59689JTv.A0G(002.A0g("[DEBUG ONLY] Attempting to ", str3, " story auto-crossposting"));
        }
        if (num != null) {
            str2 = C378169Ot.A01(num);
        } else {
            str2 = null;
        }
        0wc A02 = AnonymousClass0kN.A02(userSession);
        0Aj A002 = A02.A00(A02.A00, "ig_auto_xposting_to_fb_setting");
        A002.AAJ("flow_name", "ig_story_share_to_fb");
        A002.AAJ(TraceFieldType.AdhocEventName, "client_setting_updated");
        A002.AAJ("xposting_setting_location", str);
        A002.A7p("client_setting", Boolean.valueOf(z));
        A002.A7p("user_interaction", Boolean.valueOf(z2));
        A002.AAJ("account_type", AnonymousClass0eD.A01(userSession).name());
        A002.AAJ("destination_account_linkage_type", str2);
        A002.Cgf();
    }
}
