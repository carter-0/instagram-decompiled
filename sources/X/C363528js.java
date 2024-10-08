package X;

import com.facebook.common.callercontext.CallerContextable;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.8js  reason: invalid class name and case insensitive filesystem */
public final class C363528js implements CallerContextable {
    public static final C363538jt A04 = new Object();
    public static final String __redex_internal_original_name = "FacebookCrosspostingSettingFetcher";
    public C49422EvO A00;
    public final UserSession A01;
    public final C363548ju A02;
    public final C363008it A03;

    public C363528js(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = new C363548ju(userSession);
        this.A03 = new C363008it(userSession, (C358118aO) null);
    }

    public final void A06(String str, boolean z) {
        if (z) {
            C363538jt.A00(this.A01);
        }
        UserSession userSession = this.A01;
        if (C363028iv.A00(userSession).isCrossPostingSettingsPlatformizationReadEnabled()) {
            C363028iv.A00(userSession).refreshAutoCrossPostingSettings((AnonymousClass8k0) null);
            return;
        }
        16V A012 = AnonymousClass0eD.A01(userSession);
        16V r1 = 16V.A05;
        if (A012 != r1 && !AnonymousClass8PU.A07(userSession)) {
            C363558jv r3 = C363548ju.A03;
            if (C363558jv.A00(userSession) || C363018iu.A00(userSession)) {
                0wc A022 = AnonymousClass0kN.A02(userSession);
                0Aj A002 = A022.A00(A022.A00, "ig_auto_xposting_to_fb_setting");
                A002.AAJ("flow_name", "not_cal_flow");
                A002.AAJ(TraceFieldType.AdhocEventName, "server_setting_fetch_attempt");
                A002.AAJ("xposting_setting_location", str);
                A002.A7p("client_setting", false);
                A002.A7p("user_interaction", false);
                A002.AAJ("account_type", AnonymousClass0eD.A01(userSession).name());
                A002.Cgf();
                r3.A01(userSession, (Integer) null, 002.A0R(str, ":linking_reset"), false, false);
                C363008it.A05.A01(userSession, (Integer) null, 002.A0R(str, ":linking_reset"), false, false);
            }
        } else if (AnonymousClass8PU.A07(userSession)) {
            if (A012 == 16V.A06) {
                A04(AnonymousClass05K.A00, str);
                C59780JXz.A00(A00(), userSession, new C378779Re(this, str));
            } else if (A012 == r1) {
                A04(AnonymousClass05K.A00, str);
                C59780JXz.A00(A00(), userSession, new C378779Re(this, str));
                return;
            }
            A04(AnonymousClass05K.A01, str);
            C363618k4.A00(A00(), userSession, new C378419Ps(this, str));
        }
    }

    public static final 2IV A00() {
        2IV r8 = new 2IV();
        ImmutableList.Builder builder = ImmutableList.builder();
        2IV r6 = new 2IV();
        r6.A09("FB", "destination_app");
        r6.A09("STORY", "destination_surface");
        r6.A09("STORY", "source_surface");
        2IV r1 = new 2IV();
        r1.A09("FB", "destination_app");
        r1.A09("FEED", "destination_surface");
        r1.A09("FEED", "source_surface");
        builder.add(r6);
        builder.add(r1);
        2IV r12 = new 2IV();
        r12.A09("FB", "destination_app");
        r12.A09("REELS", "destination_surface");
        r12.A09("REELS", "source_surface");
        builder.add(r12);
        r8.A05("crosspost_app_surface_list", builder.build());
        r8.A09("IG", "source_app");
        return r8;
    }

    public static final C295915p7 A01(C295905p6 r5, C295875p3 r6) {
        if (r6 == null) {
            return null;
        }
        C249803kO it = r6.getRequiredCompactedTreeListField(0, "crosspost_settings", C295885p4.class, -2037360975).iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            C295915p7 r2 = (C295915p7) ((C250663lr) it.next()).reinterpretRequired(0, C295915p7.class, -986182339);
            0qQ.A07(r2);
            if (r2.getOptionalEnumField(0, "source_surface", C295905p6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == r5) {
                return r2;
            }
        }
        return null;
    }

    public static final void A02(C363528js r5, Integer num, String str) {
        UserSession userSession = r5.A01;
        String str2 = str;
        AnonymousClass9Q7.A02(userSession, str2, "server_setting_fetch_failed", (String) null, C378169Ot.A01(num), C363558jv.A00(userSession));
        AnonymousClass9Q7.A04(userSession, str2, "server_setting_fetch_failed", (String) null, C378169Ot.A01(num), C363018iu.A00(userSession));
        AnonymousClass9Q7.A04(userSession, str2, "server_setting_fetch_failed", (String) null, C378169Ot.A01(num), C363018iu.A00(userSession));
        AnonymousClass9Q7.A03(userSession, str2, "server_setting_fetch_failed", (String) null, C378169Ot.A01(num), C367288qV.A06(userSession));
    }

    public static final void A03(C363528js r5, Integer num, String str) {
        UserSession userSession = r5.A01;
        String str2 = str;
        AnonymousClass9Q7.A04(userSession, str2, "server_setting_fetch_success", (String) null, C378169Ot.A01(num), C363018iu.A00(userSession));
        AnonymousClass9Q7.A04(userSession, str2, "server_setting_fetch_success", (String) null, C378169Ot.A01(num), C363018iu.A00(userSession));
        AnonymousClass9Q7.A02(userSession, str2, "server_setting_fetch_success", (String) null, C378169Ot.A01(num), C363558jv.A00(userSession));
        AnonymousClass9Q7.A03(userSession, str2, "server_setting_fetch_success", (String) null, C378169Ot.A01(num), C367288qV.A06(userSession));
    }

    private final void A04(Integer num, String str) {
        UserSession userSession = this.A01;
        boolean A002 = C363558jv.A00(userSession);
        String A012 = C378169Ot.A01(num);
        0wc A022 = AnonymousClass0kN.A02(userSession);
        0Aj A003 = A022.A00(A022.A00, "ig_auto_xposting_to_fb_setting");
        A003.AAJ("flow_name", "ig_feed_share_to_fb");
        A003.AAJ(TraceFieldType.AdhocEventName, "server_setting_fetch_attempt");
        String str2 = str;
        A003.AAJ("xposting_setting_location", str2);
        A003.A7p("client_setting", Boolean.valueOf(A002));
        A003.A7p("user_interaction", false);
        A003.AAJ("account_type", AnonymousClass0eD.A01(userSession).name());
        A003.AAJ("destination_account_linkage_type", A012);
        A003.Cgf();
        boolean A004 = C363018iu.A00(userSession);
        boolean z = 2D5.A00(userSession).A04.getBoolean("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_STORY_CLOSE_FRIENDS", false);
        String A013 = C378169Ot.A01(num);
        0wc A023 = AnonymousClass0kN.A02(userSession);
        0Aj A005 = A023.A00(A023.A00, "ig_auto_xposting_to_fb_setting");
        A005.AAJ("flow_name", "ig_story_share_to_fb");
        A005.AAJ(TraceFieldType.AdhocEventName, "server_setting_fetch_attempt");
        A005.AAJ("xposting_setting_location", str2);
        A005.A7p("client_setting", Boolean.valueOf(A004));
        A005.A7p("user_interaction", false);
        A005.AAJ("account_type", AnonymousClass0eD.A01(userSession).name());
        A005.AAJ("destination_account_linkage_type", A013);
        A005.Cgf();
        0wc A024 = AnonymousClass0kN.A02(userSession);
        0Aj A006 = A024.A00(A024.A00, "ig_auto_xposting_to_fb_setting");
        A006.AAJ("flow_name", "ig_cf_story_share_to_fb");
        A006.AAJ(TraceFieldType.AdhocEventName, "server_setting_fetch_attempt");
        A006.AAJ("xposting_setting_location", str2);
        A006.A7p("client_setting", Boolean.valueOf(z));
        A006.A7p("user_interaction", false);
        A006.AAJ("destination_account_linkage_type", A013);
        A006.Cgf();
        boolean A06 = C367288qV.A06(userSession);
        String A014 = C378169Ot.A01(num);
        0wc A025 = AnonymousClass0kN.A02(userSession);
        0Aj A007 = A025.A00(A025.A00, "ig_auto_xposting_to_fb_setting");
        A007.AAJ("flow_name", "ig_reels_share_to_fb");
        A007.AAJ(TraceFieldType.AdhocEventName, "server_setting_fetch_attempt");
        A007.AAJ("xposting_setting_location", str2);
        A007.A7p("client_setting", Boolean.valueOf(A06));
        A007.A7p("user_interaction", false);
        A007.AAJ("account_type", AnonymousClass0eD.A01(userSession).name());
        A007.AAJ("destination_account_linkage_type", A014);
        A007.Cgf();
    }

    public static final boolean A05(C295905p6 r5, AnonymousClass9R1 r6) {
        ImmutableList immutableList;
        C250663lr optionalTreeField;
        if (r6 == null || (optionalTreeField = r6.getOptionalTreeField(0, "xcxp_bpl_auto_crosspost_settings_root(configs_request:$configs_request)", AnonymousClass9R2.class, -1047456758)) == null) {
            immutableList = null;
        } else {
            immutableList = optionalTreeField.getRequiredCompactedTreeListField(0, "auto_xpost_setting", AnonymousClass9UQ.class, 304935101);
        }
        if (immutableList != null && (!(immutableList instanceof Collection) || !immutableList.isEmpty())) {
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                C250663lr r2 = (C250663lr) it.next();
                if (r2.getOptionalEnumField(0, "source_surface", C295905p6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == r5 && r2.getCoercedBooleanField(1, "is_auto_crosspost_enabled")) {
                    return true;
                }
            }
        }
        return false;
    }
}
