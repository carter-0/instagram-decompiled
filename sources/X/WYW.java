package X;

import android.os.Bundle;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public final class WYW implements XB6 {
    public int A00 = -1;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final String A0D;

    public static final 1Ln A00(WYW wyw, String str, String str2, String str3) {
        long j;
        long j2;
        Long A10;
        Long A102;
        UserSession userSession = wyw.A02;
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(wyw.A01, userSession), "ig_lead_gen_ads_consumer"), 222);
        C13992Tns.A0p(r2, str, str2, str3);
        C13992Tns.A0k(r2, userSession, wyw.A05);
        String A0h = C13991Tnr.A0h(userSession);
        long j3 = 0;
        if (A0h == null || (A102 = AnonymousClass7TE.A10(A0h)) == null) {
            j = 0;
        } else {
            j = A102.longValue();
        }
        r2.A0Q("consumer_ig_user_fbidv2", Long.valueOf(j));
        r2.A0O("has_qualifying_question", Boolean.valueOf(wyw.A0B));
        r2.A0O("has_gated_content", Boolean.valueOf(wyw.A0A));
        r2.A0O("has_creatives", Boolean.valueOf(wyw.A09));
        r2.A0O("is_form_extension", Boolean.valueOf(wyw.A0C));
        String str4 = wyw.A07;
        if (str4 == null || (A10 = AnonymousClass7TE.A10(str4)) == null) {
            j2 = 0;
        } else {
            j2 = A10.longValue();
        }
        r2.A0Q("lead_form_id", Long.valueOf(j2));
        String str5 = wyw.A04;
        if (str5 != null) {
            j3 = JTR.A0M(str5);
        }
        r2.A0Q("ad_id", Long.valueOf(j3));
        r2.A0R("ad_tracking_token", wyw.A08);
        r2.A0R("ad_creation_source", wyw.A03);
        r2.A0Q("multi_submit_ad_index", Long.valueOf((long) wyw.A00));
        r2.A0O("is_dark_mode", Boolean.valueOf(AnonymousClass1GD.A03()));
        r2.A0R("first_question_sticker_question_type", wyw.A06);
        return r2;
    }

    public final void Cgq(Bundle bundle, String str, String str2, String str3, String str4) {
        long j;
        Long A10;
        UserSession userSession = this.A02;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A01, userSession), "ig_lead_gen_ads_consumer");
        A0e.AAJ("flow_name", str2);
        A0e.AAJ("flow_step", str3);
        A0e.AAJ(TraceFieldType.AdhocEventName, str4);
        A0e.AAJ("event_type", DexOptimization.OPT_KEY_CLIENT);
        DbS.A1N(A0e, str);
        A0e.A7p("is_employee", Boolean.valueOf(1CI.A00(userSession)));
        String A0h = C13991Tnr.A0h(userSession);
        if (A0h == null || (A10 = AnonymousClass7TE.A10(A0h)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        A0e.A9F("consumer_ig_user_fbidv2", Long.valueOf(j));
        A0e.A7p("has_qualifying_question", Boolean.valueOf(this.A0B));
        A0e.A7p("has_gated_content", Boolean.valueOf(this.A0A));
        A0e.A7p("has_creatives", Boolean.valueOf(this.A09));
        A0e.A7p("is_form_extension", Boolean.valueOf(this.A0C));
        A0e.A9F("lead_form_id", C51972G9s.A0j(this.A07));
        A0e.AAJ("ad_creation_source", this.A03);
        C51965G9l.A1D(A0e, C51972G9s.A0j(this.A04));
        A0e.AAJ("ad_tracking_token", this.A08);
        C13991Tnr.A10(A0e);
        A0e.A9F("business_ig_user_fbidv2", C51972G9s.A0i(this.A0D));
        if (bundle != null) {
            String string = bundle.getString("question_type");
            if (string != null) {
                A0e.AAJ("question_type", string);
            }
            String string2 = bundle.getString("pii_question_type");
            if (string2 != null) {
                A0e.AAJ("pii_question_type", string2);
            }
            String string3 = bundle.getString("submission_session_id");
            if (string3 != null) {
                A0e.AAJ("submission_session_id", string3);
            }
        }
        String str5 = this.A06;
        if (!(str5 == null || str5.length() == 0)) {
            A0e.AAJ("first_question_sticker_question_type", str5);
        }
        A0e.AAJ(AnonymousClass000.A00(2768), C298095ss.A00);
        DbX.A1L(A0e);
    }

    public WYW(AnonymousClass0iw r2, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass7TG.A1O(userSession, r2);
        C51972G9s.A1E(str4, str5);
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A03 = str4;
        this.A05 = str5;
        this.A0B = z;
        this.A0A = z2;
        this.A09 = z3;
        this.A0C = z4;
        this.A0D = str6;
        this.A06 = str7;
    }
}
