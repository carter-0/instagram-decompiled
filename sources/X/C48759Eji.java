package X;

import java.util.Map;

/* renamed from: X.Eji  reason: case insensitive filesystem */
public abstract class C48759Eji {
    public static void A00(0lg r7, Integer num, String str, String str2, String str3, String str4, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "caa_account_recovery_client_events_ig");
        if (A0e.isSampled()) {
            Integer A00 = C48761Ejk.A00(r7, num, "CAAAccountRecoveryIgNativeLogger");
            0tS A0h = DbT.A0h();
            0bb r4 = new 0bb();
            DbZ.A1K(r4, str, "account_recovery", str2, "start_account_recovery");
            r4.A06("access_flow_version", C48298EcH.A00(A00));
            r4.A06("logged_out_identifier", str3);
            r4.A06("waterfall_id", A0h.A08());
            r4.A06("event_request_id", str4);
            r4.A08("extra_client_data", map);
            A0e.AAK(r4, "core");
            0bb r1 = new 0bb();
            r1.A06("event_source", "reset_password_link");
            A0e.AAK(r1, "account_recovery_params");
            A0e.Cgf();
        }
    }
}
