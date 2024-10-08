package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.SJq  reason: case insensitive filesystem */
public final class C11290SJq {
    public final C10860RzL A00;
    public final 1yd A01;

    public final void A02(Bundle bundle, C53388GnK gnK, Integer num, String str) {
        String str2;
        0qQ.A0B(num, 1);
        switch (num.intValue()) {
            case 0:
                str2 = "CONTACT_AUTOFILL";
                break;
            case 1:
                str2 = "PAYMENT_AUTOFILL";
                break;
            default:
                str2 = "CONTACT_AND_PAYMENT_AUTOFILL";
                break;
        }
        A00(bundle, this, gnK, str, str2);
    }

    public final void A03(Bundle bundle, Integer num, String str, String str2) {
        String str3;
        String A0R = 002.A0R("BLOKS_REQUEST_PROMPT_", str);
        if (num.intValue() != 0) {
            str3 = "PAYMENT_AUTOFILL";
        } else {
            str3 = "CONTACT_AUTOFILL";
        }
        A00(bundle, this, new C53388GnK((Integer) null, (Integer) 0, (Long) null, (Long) null, (String) null, (String) null, (String) null, (Map) DbY.A0p("prompt_session_id", str2, AnonymousClass7TE.A1L("is_bloks_screen", "true")), false), A0R, str3);
    }

    public final void A04(Bundle bundle, String str, String str2, String str3, String str4, Map map, Map map2, Set set, boolean z) {
        Map map3 = map;
        0qQ.A0B(map3, 3);
        String str5 = str4;
        Set set2 = set;
        C51972G9s.A1E(set2, str5);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        A1H.putAll(0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("is_bloks_screen", "true"), AnonymousClass7TE.A1L("prompt_session_id", str5), AnonymousClass7TE.A1L("prompt_type", str2), AnonymousClass7TE.A1L("fields_rendered_in_bottomsheet", 00k.A0P(", ", "", "", 00k.A0Z(map3.keySet()), (0sP) null)), AnonymousClass7TE.A1L("has_cached_screen", String.valueOf(C66580MXl.A1b(set2))), AnonymousClass7TE.A1L("cache_layers", 002.A0E(00k.A0P(",", "", "", set2, (0sP) null), '[', ']'))}));
        A1H.putAll(map2);
        A00(bundle, this, new C53388GnK((Integer) null, (Integer) 0, (Long) null, (Long) null, (String) null, (String) null, (String) null, (Map) A1H, z), str, str3);
    }

    public final void A06(String str, Bundle bundle) {
        A00(bundle, this, new C53388GnK((Long) null, (Map) null, 510), str, "PAYMENT_AUTOFILL");
    }

    public final void A05(Bundle bundle, String str, Map map) {
        A00(bundle, this, new C53388GnK((Long) null, map, 510), str, "PAYMENT_AUTOFILL");
    }

    public C11290SJq(C10860RzL rzL, 1yd r2) {
        this.A00 = rzL;
        this.A01 = r2;
    }

    public static final void A00(Bundle bundle, C11290SJq sJq, C53388GnK gnK, String str, String str2) {
        SRY A002 = SRY.A00();
        String str3 = str;
        0qQ.A0B(str3, 0);
        String str4 = str2;
        0qQ.A0B(str4, 1);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        0eP A1L = AnonymousClass7TE.A1L("used_logger_v2", "true");
        boolean z = false;
        C11290SJq sJq2 = sJq;
        C10860RzL rzL = sJq2.A00;
        0qQ.A0B(rzL, 0);
        A1H.putAll(DbY.A0p("family_device_id", C11234SGu.A00(rzL.A0Q), A1L));
        C53388GnK gnK2 = gnK;
        Map map = (Map) gnK2.A01;
        if (map != null) {
            A1H.putAll(map);
        }
        0eP A1L2 = AnonymousClass7TE.A1L("action", "BrowserLiteIntent.IAB_AUTOFILL_INTERACTION");
        0eP A1L3 = AnonymousClass7TE.A1L("user_action", str3);
        0eP A1L4 = AnonymousClass7TE.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
        0eP A1L5 = AnonymousClass7TE.A1L("payment_credential_ids", gnK2.A06);
        0eP A1L6 = AnonymousClass7TE.A1L("with_ads_disclosure", String.valueOf(gnK2.A09));
        0eP A1L7 = AnonymousClass7TE.A1L("form_completion_duration", String.valueOf(gnK2.A02));
        0eP A1L8 = AnonymousClass7TE.A1L("event_times", String.valueOf(gnK2.A05));
        0eP A1L9 = AnonymousClass7TE.A1L("time_spend", String.valueOf(gnK2.A04));
        0eP A1L10 = AnonymousClass7TE.A1L("index", String.valueOf(gnK2.A03));
        0eP A1L11 = AnonymousClass7TE.A1L("enhanced_regex_new_fields_metadata", JTQ.A0c(A1H));
        JV5 jv5 = rzL.A0J;
        Object obj = jv5.A00;
        RF6 rf6 = RF6.OPT_IN;
        if (obj == rf6) {
            z = true;
        }
        0eP A1L12 = AnonymousClass7TE.A1L("is_payment_opt_in", String.valueOf(z));
        0eP A1L13 = AnonymousClass7TE.A1L("is_contact_opt_in", String.valueOf(AnonymousClass7TF.A1W(jv5.A03, rf6)));
        C61038Jvc jvc = rzL.A0P;
        0eP A1L14 = AnonymousClass7TE.A1L("ad_id", jvc.A01);
        String str5 = jvc.A02;
        0eP A1L15 = AnonymousClass7TE.A1L("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID", str5);
        0eP A1L16 = AnonymousClass7TE.A1L("iab_session_id", str5);
        QP6 qp6 = rzL.A06;
        A002.A07(bundle, 0Yt.A06(new 0eP[]{A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, AnonymousClass7TE.A1L("selected_field_tag", qp6.A05), AnonymousClass7TE.A1L("current_url", jvc.A03), AnonymousClass7TE.A1L("form_session_id", rzL.A05.A05), AnonymousClass7TE.A1L("experiments", JTQ.A0c(SPo.A00(rzL, sJq2.A01))), AnonymousClass7TE.A1L("user_credentials_status", Pxk.A0H(rzL.A0D)), AnonymousClass7TE.A1L("has_helium", String.valueOf(AnonymousClass7TF.A1V(C249113j9.A01))), AnonymousClass7TE.A1L("all_fields", RUN.A00((Set) qp6.A00))}));
    }

    public final void A01(Bundle bundle, C53388GnK gnK, Integer num, String str) {
        String str2;
        AnonymousClass7TG.A1N(str, num);
        switch (num.intValue()) {
            case 0:
                str2 = "CONTACT_AUTOFILL";
                break;
            case 1:
                str2 = "PAYMENT_AUTOFILL";
                break;
            case 4:
                str2 = "SYSTEM_AUTOFILL";
                break;
            case 5:
                str2 = "LOGIN_AUTOFILL";
                break;
            default:
                str2 = "CONTACT_AND_PAYMENT_AUTOFILL";
                break;
        }
        A00(bundle, this, gnK, str, str2);
    }
}
