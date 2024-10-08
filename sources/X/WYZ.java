package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

public final class WYZ implements XB6 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final long A02;

    public final void A04(Long l, String str, String str2, boolean z) {
        String str3;
        String str4 = str2;
        0qQ.A0B(str2, 2);
        if (z) {
            str3 = RealtimeConstants.SEND_SUCCESS;
        } else {
            str3 = RealtimeConstants.SEND_FAIL;
        }
        1Ln A002 = A00(this, l, "lead_gen_manage_lead_forms_and_cta", "update_selection_mutation", str3, str4);
        A002.A0Q("lead_form_id", DbZ.A0d(str));
        A002.Cgf();
    }

    public final void A05(Long l, String str, String str2, boolean z, boolean z2) {
        0qQ.A0B(str2, 2);
        Long l2 = l;
        1Ln A002 = A00(this, l2, "lead_gen_manage_lead_forms_and_cta", A01("cancel", z, z2), "click", str2);
        A002.A0Q("lead_form_id", DbZ.A0d(str));
        A002.Cgf();
    }

    public final void A06(Long l, String str, String str2, boolean z, boolean z2) {
        0qQ.A0B(str2, 2);
        Long l2 = l;
        1Ln A002 = A00(this, l2, "lead_gen_manage_lead_forms_and_cta", A01("update", z, z2), "click", str2);
        A002.A0Q("lead_form_id", DbZ.A0d(str));
        A002.Cgf();
    }

    public final void A07(Long l, String str, boolean z) {
        String str2;
        String str3 = str;
        0qQ.A0B(str, 1);
        if (z) {
            str2 = RealtimeConstants.SEND_SUCCESS;
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        A00(this, l, "lead_gen_create_form", "create_form_mutation", str2, str3).Cgf();
    }

    public final void A08(Long l, String str, boolean z) {
        String str2;
        0qQ.A0B(str, 1);
        if (z) {
            str2 = "no_top_post_new_user";
        } else {
            str2 = "no_top_post_return_user";
        }
        A03(this, l, AnonymousClass000.A00(259), str2, str);
    }

    public final void A09(Long l, String str, boolean z) {
        String str2;
        String str3 = str;
        0qQ.A0B(str, 1);
        if (z) {
            str2 = RealtimeConstants.SEND_SUCCESS;
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        A00(this, l, "lead_gen_preview_form", "preview_lead_gen_form_tos_query", str2, str3).Cgf();
    }

    public final void A0A(Long l, String str, boolean z) {
        String str2;
        String str3 = str;
        0qQ.A0B(str, 1);
        if (z) {
            str2 = RealtimeConstants.SEND_SUCCESS;
        } else {
            str2 = RealtimeConstants.SEND_FAIL;
        }
        A00(this, l, "lead_gen_review_form", "review_lead_gen_form_tos_query", str2, str3).Cgf();
    }

    public final void Cgq(Bundle bundle, String str, String str2, String str3, String str4) {
        String str5;
        if (bundle != null) {
            str5 = bundle.getString("form_id");
        } else {
            str5 = null;
        }
        UserSession userSession = this.A01;
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A00, userSession), "ig_lead_gen_organic_business"), 224);
        C13992Tns.A0p(r2, str2, str3, str4);
        C13992Tns.A0k(r2, userSession, str);
        r2.A0O("is_from_organic", true);
        r2.A0Q("business_ig_user_fbidv2", Long.valueOf(this.A02));
        if (str5 != null) {
            r2.A0Q("lead_form_id", AnonymousClass7TE.A10(str5));
        }
        r2.Cgf();
    }

    public static final 1Ln A00(WYZ wyz, Long l, String str, String str2, String str3, String str4) {
        UserSession userSession = wyz.A01;
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A01(wyz.A00, userSession), "ig_lead_gen_organic_business"), 224);
        C13992Tns.A0p(r2, str, str2, str3);
        C13992Tns.A0k(r2, userSession, str4);
        r2.A0O("is_from_organic", AnonymousClass7TE.A0v());
        r2.A0Q("business_ig_user_fbidv2", Long.valueOf(DbY.A04(l)));
        return r2;
    }

    public static final String A01(String str, boolean z, boolean z2) {
        StringBuilder sb;
        String str2;
        if (z) {
            if (z2) {
                str2 = "update_cta_and_form_selection_dialog_";
            } else {
                sb = new StringBuilder();
                str2 = "update_form_selection_dialog_";
            }
        } else if (!z2) {
            return AnonymousClass000.A00(1910);
        } else {
            sb = new StringBuilder();
            str2 = "update_cta_selection_dialog_";
        }
        return Pxg.A0s(str2, str, sb);
    }

    public static void A02(WYZ wyz, Long l, String str, String str2, String str3) {
        A00(wyz, l, str, str2, "click", str3).Cgf();
    }

    public static void A03(WYZ wyz, Long l, String str, String str2, String str3) {
        A00(wyz, l, str, str2, "impression", str3).Cgf();
    }

    public WYZ(AnonymousClass0iw r3, UserSession userSession) {
        long j;
        Long A10;
        AnonymousClass7TG.A1O(userSession, r3);
        this.A01 = userSession;
        this.A00 = r3;
        String A0h = C13991Tnr.A0h(userSession);
        if (A0h == null || (A10 = AnonymousClass7TE.A10(A0h)) == null) {
            j = 0;
        } else {
            j = A10.longValue();
        }
        this.A02 = j;
    }
}
