package X;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.LeadGenEntryPoint;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

public final class WYX implements XB6 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;
    public final long A03;

    public WYX(PromoteData promoteData, AnonymousClass0iw r4) {
        String str;
        long j;
        Long A10;
        0qQ.A0B(r4, 2);
        this.A00 = r4;
        UserSession userSession = promoteData.A0y;
        this.A01 = userSession;
        if (promoteData.A2i) {
            str = promoteData.A1E;
        } else {
            str = null;
        }
        this.A02 = str;
        0qQ.A06(userSession);
        String A0h = C13991Tnr.A0h(userSession);
        if (A0h == null || (A10 = AnonymousClass7TE.A10(A0h)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        this.A03 = j;
    }

    public static final 1Ln A00(WYX wyx, Long l, String str, String str2, String str3) {
        UserSession userSession = wyx.A01;
        0qQ.A06(userSession);
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(wyx.A00, userSession), "ig_lead_gen_ads_business"), 221);
        C13992Tns.A0p(r2, str, str2, str3);
        C13992Tns.A0k(r2, userSession, AnonymousClass7TF.A0j(LeadGenEntryPoint.PROMOTE.A00));
        r2.A0O("is_from_organic", AnonymousClass7TE.A0u());
        r2.A0Q("business_ig_user_fbidv2", Long.valueOf(DbY.A04(l)));
        r2.A0O("has_continue", (Boolean) null);
        r2.A0O("has_seen_warning_msg", (Boolean) null);
        r2.A0Q("total_budget_of_warning", (Long) null);
        r2.A0Q("duration_in_days_of_warning_budget", (Long) null);
        r2.A0Q("total_budget_of_submit", (Long) null);
        r2.A0Q("duration_in_days_of_submit_budget", (Long) null);
        r2.A0Q("default_recommended_daily_budget", (Long) null);
        r2.A0Q("default_recommended_duration_in_days", (Long) null);
        r2.A0R("aymt_channel", wyx.A02);
        return r2;
    }

    public final void Cgq(Bundle bundle, String str, String str2, String str3, String str4) {
        Boolean bool;
        Boolean bool2;
        Long l;
        Long l2;
        Long l3;
        UserSession userSession = this.A01;
        0qQ.A06(userSession);
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A00, userSession), "ig_lead_gen_ads_business"), 221);
        C13992Tns.A0p(r2, str2, str3, str4);
        C13992Tns.A0k(r2, userSession, str);
        r2.A0O("is_from_organic", false);
        r2.A0Q("business_ig_user_fbidv2", Long.valueOf(this.A03));
        Long l4 = null;
        if (bundle != null) {
            bool = DbU.A0g(bundle, "has_user_continue");
        } else {
            bool = null;
        }
        r2.A0O("has_continue", bool);
        if (bundle != null) {
            bool2 = DbU.A0g(bundle, "has_seen_warning");
        } else {
            bool2 = null;
        }
        r2.A0O("has_seen_warning_msg", bool2);
        if (bundle != null) {
            l = C13988Tno.A0T(bundle, "total_budget_of_warning");
        } else {
            l = null;
        }
        r2.A0Q("total_budget_of_warning", l);
        if (bundle != null) {
            l2 = C13988Tno.A0T(bundle, "duration_of_warning");
        } else {
            l2 = null;
        }
        r2.A0Q("duration_in_days_of_warning_budget", l2);
        if (bundle != null) {
            l3 = C13988Tno.A0T(bundle, "total_budget");
        } else {
            l3 = null;
        }
        r2.A0Q("total_budget_of_submit", l3);
        if (bundle != null) {
            l4 = C13988Tno.A0T(bundle, TraceFieldType.Duration);
        }
        r2.A0Q("duration_in_days_of_submit_budget", l4);
        r2.A0R("aymt_channel", this.A02);
        r2.Cgf();
    }

    public static void A01(WYX wyx, Long l, String str, String str2) {
        A00(wyx, l, str, str2, "click").Cgf();
    }

    public static void A02(WYX wyx, Long l, String str, String str2) {
        A00(wyx, l, str, str2, "impression").Cgf();
    }
}
