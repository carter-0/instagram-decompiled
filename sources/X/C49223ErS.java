package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.ErS  reason: case insensitive filesystem */
public abstract class C49223ErS {
    public static final void A00(0lg r9, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Long l;
        Long l2;
        String str9 = str;
        DbY.A1S(r9, str9);
        double A01 = DbS.A01();
        double A00 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r9), "register_account_failed");
        DbY.A1D(A0e, A01, A00);
        Dbc.A0c(A0e, "containermodule", "waterfall_log_in", A00);
        DbS.A1G(A0e, str9);
        DbS.A1H(A0e, "done");
        FH8.A07(A0e, A01);
        A0e.AAJ("retry_strategy", str5);
        Long l3 = null;
        if (num != null) {
            l = DbS.A0j(num.intValue());
        } else {
            l = null;
        }
        A0e.A9F("attempt_count", l);
        A0e.AAJ("types", str2);
        A0e.AAJ(DialogModule.KEY_MESSAGE, str3);
        if (str8 != null) {
            l2 = AnonymousClass7TE.A10(str8);
        } else {
            l2 = null;
        }
        A0e.A9F("actor_id", l2);
        A0e.A7p("has_server_response", bool);
        A0e.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str4);
        A0e.A7p("checkpointed", bool2);
        A0e.A7p("is_consent_required", bool3);
        A0e.A7p("is_feedback_required", bool4);
        A0e.A7p("is_login_required", bool5);
        A0e.A7p("is_no_content", bool6);
        A0e.A7p("is_violating_branded_content_policy", bool7);
        if (num2 != null) {
            l3 = DbS.A0j(num2.intValue());
        }
        A0e.A9F(TraceFieldType.StatusCode, l3);
        A0e.AAJ("error_type", str6);
        A0e.AAJ("error_message", str7);
        A0e.A7p("is_existing_user", bool8);
        A0e.Cgf();
    }
}
