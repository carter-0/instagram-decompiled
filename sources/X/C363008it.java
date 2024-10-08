package X;

import com.facebook.common.callercontext.CallerContextable;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8it  reason: invalid class name and case insensitive filesystem */
public final class C363008it implements CallerContextable {
    public static final C363018iu A05 = new Object();
    public static final String __redex_internal_original_name = "StoryShareToFBController";
    public C358118aO A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final UserSession A04;

    public static final void A00(C363008it r8, Integer num, String str, String str2, boolean z) {
        String str3;
        UserSession userSession = r8.A04;
        boolean A002 = C363018iu.A00(userSession);
        boolean z2 = r8.A02;
        String A012 = C378169Ot.A01(num);
        0wc A022 = AnonymousClass0kN.A02(userSession);
        0Aj A003 = A022.A00(A022.A00, "ig_auto_xposting_to_fb_setting");
        A003.AAJ("flow_name", "ig_story_share_to_fb");
        if (z) {
            str3 = "server_setting_updated_success";
        } else {
            str3 = "server_setting_updated_failed";
        }
        A003.AAJ(TraceFieldType.AdhocEventName, str3);
        A003.AAJ("xposting_setting_location", str);
        A003.A7p("client_setting", Boolean.valueOf(A002));
        A003.AAJ("server_setting", str2);
        A003.A7p("user_interaction", true);
        A003.AAJ("account_type", AnonymousClass0eD.A01(userSession).name());
        A003.A7p("user_attempted_client_setting", Boolean.valueOf(z2));
        A003.AAJ("destination_account_linkage_type", A012);
        A003.Cgf();
    }

    public static final void A01(C363008it r6, Integer num, String str, boolean z, boolean z2) {
        String str2;
        A05.A01(r6.A04, num, str, z, true);
        C358118aO r0 = r6.A00;
        if (r0 != null) {
            r0.Dk9();
        }
        if (!z2 || !z) {
            str2 = "OFF";
        } else {
            str2 = "ON";
        }
        A00(r6, num, str, str2, true);
    }

    public final void A03(C295915p7 r13, Integer num, String str) {
        String str2;
        boolean coercedBooleanField = r13.getCoercedBooleanField(1, "is_auto_crosspost_enabled");
        UserSession userSession = this.A04;
        1Av A002 = 1Au.A00(userSession);
        int coercedIntField = r13.getCoercedIntField(2, "auto_crosspost_setting_timestamp");
        0xY AR4 = A002.A01.AR4();
        AR4.E5Z("xpost_to_facebook_story_server_mtime_in_second", coercedIntField);
        AR4.apply();
        C358118aO r0 = this.A00;
        if (r0 != null) {
            r0.Dk9();
        }
        boolean A003 = C363018iu.A00(userSession);
        if (coercedBooleanField) {
            str2 = "ON";
        } else {
            str2 = "OFF";
        }
        AnonymousClass9Q7.A04(userSession, str, "server_setting_fetch_success_not_null", str2, "CAL", A003);
        A05.A01(userSession, num, str, coercedBooleanField, false);
    }

    public final void A02() {
        this.A02 = C363018iu.A00(this.A04);
        C358118aO r0 = this.A00;
        if (r0 != null) {
            r0.Dk9();
        }
    }

    public final void A04(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            C358118aO r0 = this.A00;
            if (r0 != null) {
                r0.Dk9();
            }
        }
    }

    public final void A05(boolean z, String str) {
        String str2;
        int intValue;
        UserSession userSession = this.A04;
        Integer A002 = C363038ix.A00(userSession);
        boolean A003 = C363018iu.A00(userSession);
        String A012 = C378169Ot.A01(A002);
        0wc A022 = AnonymousClass0kN.A02(userSession);
        0Aj A004 = A022.A00(A022.A00, "ig_auto_xposting_to_fb_setting");
        A004.AAJ("flow_name", "ig_story_share_to_fb");
        A004.AAJ(TraceFieldType.AdhocEventName, "user_update_setting_attempt");
        String str3 = str;
        A004.AAJ("xposting_setting_location", str3);
        A004.A7p("client_setting", Boolean.valueOf(A003));
        A004.A7p("user_interaction", true);
        boolean z2 = z;
        Boolean valueOf = Boolean.valueOf(z2);
        A004.A7p("user_attempted_client_setting", valueOf);
        A004.AAJ("account_type", AnonymousClass0eD.A01(userSession).name());
        A004.AAJ("destination_account_linkage_type", A012);
        A004.Cgf();
        this.A02 = z2;
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5Z(C273654mx.A00(3299), Integer.MAX_VALUE);
        AR4.apply();
        FbAutoCrossPostingSettingManager A005 = C363028iv.A00(userSession);
        if (A005.isCrossPostingSettingsPlatformizationWriteEnabled()) {
            A005.updateAutoCrossPostingSetting(new N4R(0se.A0M(new 0eP(C390849rw.STORY, valueOf))), (AnonymousClass8k0) null);
            return;
        }
        if (A002 != null) {
            str2 = C378169Ot.A01(A002);
        } else {
            str2 = null;
        }
        0wc A023 = AnonymousClass0kN.A02(userSession);
        0Aj A006 = A023.A00(A023.A00, "ig_auto_xposting_to_fb_setting");
        A006.AAJ("flow_name", "ig_story_share_to_fb");
        A006.AAJ(TraceFieldType.AdhocEventName, "server_setting_update_attempt");
        A006.AAJ("xposting_setting_location", str3);
        A006.A7p("user_interaction", true);
        A006.A7p("user_attempted_client_setting", valueOf);
        A006.AAJ("account_type", AnonymousClass0eD.A01(userSession).name());
        A006.AAJ("destination_account_linkage_type", str2);
        A006.Cgf();
        if (A002 == null || (intValue = A002.intValue()) == 0 || intValue != 1) {
            C59780JXz jXz = C59780JXz.A00;
            List singletonList = Collections.singletonList(new C39876ACx("STORY", this.A02));
            0qQ.A07(singletonList);
            jXz.A01(userSession, new AfM(this, str3), singletonList);
            return;
        }
        C64105LNd lNd = C64105LNd.A00;
        boolean z3 = z2;
        List singletonList2 = Collections.singletonList(new C39876ACx("STORY", z3));
        0qQ.A07(singletonList2);
        lNd.A00(userSession, new AfK(this, str3, z3), singletonList2);
    }

    public final boolean A06() {
        if (!this.A02 || this.A01 || !AnonymousClass8PU.A07(this.A04)) {
            return false;
        }
        return true;
    }

    public C363008it(UserSession userSession, C358118aO r8) {
        this.A04 = userSession;
        this.A00 = r8;
        this.A02 = C363018iu.A00(userSession);
        this.A03 = C363018iu.A00(userSession);
        0xa r1 = 1Au.A00(userSession).A01;
        if (!r1.contains("story_last_server_xposting_turn_on_time_in_second")) {
            0xY AR4 = r1.AR4();
            AR4.E5Z("story_last_server_xposting_turn_on_time_in_second", (int) (System.currentTimeMillis() / 1000));
            AR4.apply();
        }
    }
}
