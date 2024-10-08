package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.FBe  reason: case insensitive filesystem */
public final class C49880FBe {
    public static final void A00(0lg r6, Integer num, String str, String str2, String str3, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "caa_aymh_client_events_ig");
        if (A0e.isSampled()) {
            Integer A00 = C48761Ejk.A00(r6, num, "CAALoginAymhIgNativeLogger");
            0tS A0h = DbT.A0h();
            0bb r2 = new 0bb();
            DbZ.A1K(r2, str, "aymh", str2, str3);
            r2.A06("access_flow_version", C48298EcH.A00(A00));
            r2.A06("waterfall_id", A0h.A08());
            r2.A08("extra_client_data", map);
            A0e.AAK(r2, "core");
            A0e.AAK(new 0bb(), "aymh_params");
            A0e.Cgf();
        }
    }

    public final void A02(0lg r7, String str, String str2) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("credential_type", str);
        A1E.put("error", str2);
        A00(r7, AnonymousClass05K.A00, AnonymousClass000.A00(3283), "home_page", "prefill_login_signal", A1E);
    }

    public final void A01(0lg r7, String str) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("credential_type", str);
        A00(r7, AnonymousClass05K.A00, "ig_aymh_load_account_attempted", "home_page", "prefill_login_signal", A1E);
    }

    public final void A03(0lg r7, String str, List list) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("profile_uid", list.toString());
        A1E.put("credential_type", str);
        A00(r7, AnonymousClass05K.A00, AnonymousClass000.A00(3284), "home_page", "prefill_login_signal", A1E);
    }
}
