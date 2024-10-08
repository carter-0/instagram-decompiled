package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.crossposting.setting.manager.FbAutoCrossPostingSettingManager;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8ju  reason: invalid class name and case insensitive filesystem */
public final class C363548ju implements CallerContextable {
    public static final CallerContext A02 = CallerContext.A01(__redex_internal_original_name);
    public static final C363558jv A03 = new Object();
    public static final String __redex_internal_original_name = "FeedShareToFBController";
    public C39689A5f A00;
    public final UserSession A01;

    public static final void A00(C363548ju r8, Integer num, String str, boolean z, boolean z2) {
        Integer num2;
        String str2;
        boolean z3 = z;
        if (!z2 || !z) {
            num2 = AnonymousClass05K.A0C;
        } else {
            num2 = AnonymousClass05K.A01;
        }
        if (1 - num2.intValue() != 0) {
            str2 = "OFF";
        } else {
            str2 = "ON";
        }
        UserSession userSession = r8.A01;
        AnonymousClass9Q7.A05(userSession, str, "server_setting_updated_success", str2, (String) null, C363558jv.A00(userSession), z3);
        A03.A01(userSession, num, str, z3, true);
        C39689A5f a5f = r8.A00;
        if (a5f != null) {
            a5f.A01.A01 = true;
        }
    }

    public final void A02(Integer num, String str, boolean z) {
        C363558jv r0 = A03;
        UserSession userSession = this.A01;
        String str2 = str;
        r0.A01(userSession, num, str2, z, false);
        UserSession userSession2 = userSession;
        AnonymousClass9Q7.A02(userSession2, str2, "server_setting_fetch_success_not_null", String.valueOf(z), C378169Ot.A01(num), C363558jv.A00(userSession));
    }

    public final void A01(UserSession userSession, String str, boolean z) {
        int intValue;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        C299935wF A002 = C363388je.A00(userSession2).A00(A02);
        Integer num = A002.A01;
        Integer num2 = num;
        C363558jv r9 = A03;
        String str2 = str;
        boolean z2 = z;
        if (num == AnonymousClass05K.A00 || C363388je.A03(A002)) {
            UserSession userSession3 = this.A01;
            boolean A003 = C363558jv.A00(userSession3);
            String A012 = C378169Ot.A01(num2);
            0wc A022 = AnonymousClass0kN.A02(userSession3);
            0Aj A004 = A022.A00(A022.A00, "ig_auto_xposting_to_fb_setting");
            A004.AAJ("flow_name", "ig_feed_share_to_fb");
            A004.AAJ(TraceFieldType.AdhocEventName, "user_update_setting_attempt");
            A004.AAJ("xposting_setting_location", str2);
            A004.A7p("client_setting", Boolean.valueOf(A003));
            A004.A7p("user_interaction", true);
            Boolean valueOf = Boolean.valueOf(z2);
            A004.A7p("user_attempted_client_setting", valueOf);
            A004.AAJ("account_type", AnonymousClass0eD.A01(userSession3).name());
            A004.AAJ("destination_account_linkage_type", A012);
            A004.Cgf();
            FbAutoCrossPostingSettingManager A005 = C363028iv.A00(userSession2);
            if (A005.isCrossPostingSettingsPlatformizationWriteEnabled()) {
                A005.updateAutoCrossPostingSetting(new N4R(0se.A0M(new 0eP(C390849rw.FEED, valueOf))), (AnonymousClass8k0) null);
                return;
            }
            0wc A023 = AnonymousClass0kN.A02(userSession3);
            0Aj A006 = A023.A00(A023.A00, "ig_auto_xposting_to_fb_setting");
            A006.AAJ("flow_name", "ig_feed_share_to_fb");
            A006.AAJ(TraceFieldType.AdhocEventName, "server_setting_update_attempt");
            A006.AAJ("xposting_setting_location", str2);
            A006.A7p("user_interaction", true);
            A006.A7p("user_attempted_client_setting", valueOf);
            A006.AAJ("account_type", AnonymousClass0eD.A01(userSession3).name());
            A006.AAJ("destination_account_linkage_type", (String) null);
            A006.Cgf();
            if (num2 == null || (intValue = num2.intValue()) == 0 || intValue != 1) {
                C59780JXz jXz = C59780JXz.A00;
                List singletonList = Collections.singletonList(new C39876ACx("FEED", z2));
                0qQ.A07(singletonList);
                jXz.A01(userSession3, new AfO(this, str2, z2), singletonList);
                return;
            }
            C64105LNd lNd = C64105LNd.A00;
            List singletonList2 = Collections.singletonList(new C39876ACx("FEED", z2));
            0qQ.A07(singletonList2);
            lNd.A00(userSession3, new AfJ(this, str2, z2), singletonList2);
            return;
        }
        r9.A01(userSession2, (Integer) null, str2, z2, true);
    }

    public C363548ju(UserSession userSession) {
        this.A01 = userSession;
        0xa r1 = 1Au.A00(userSession).A01;
        if (!r1.contains("feed_last_server_xposting_turn_on_time_in_second")) {
            0xY AR4 = r1.AR4();
            AR4.E5Z("feed_last_server_xposting_turn_on_time_in_second", (int) (System.currentTimeMillis() / 1000));
            AR4.apply();
        }
    }
}
