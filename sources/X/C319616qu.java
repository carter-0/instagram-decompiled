package X;

import java.util.HashMap;

/* renamed from: X.6qu  reason: invalid class name and case insensitive filesystem */
public final class C319616qu {
    public static final void A00(0lg r5, Integer num, String str, String str2, String str3, String str4, String str5, HashMap hashMap) {
        0wc A02 = AnonymousClass0kN.A02(r5);
        0Aj A00 = A02.A00(A02.A00, "caa_login_client_events_ig");
        if (A00.isSampled()) {
            Integer A002 = C48761Ejk.A00(r5, num, "CAALoginIgNativeLogger");
            0tS A003 = 0tS.A4E.A00();
            0bb r3 = new 0bb();
            r3.A06("event", str);
            r3.A06("event_flow", str2);
            if (str4 == null || str4.length() == 0) {
                str4 = "home_page";
            }
            r3.A06(C66579MXk.A00(314), str4);
            r3.A06(AnonymousClass000.A00(3070), str3);
            r3.A06("access_flow_version", C48298EcH.A00(A002));
            r3.A08("extra_client_data", hashMap);
            r3.A05("exception_code", (Long) null);
            r3.A06(AnonymousClass000.A00(3074), str5);
            r3.A06("waterfall_id", A003.A08());
            A00.AAK(r3, "core");
            A00.AAK(new 0bb(), "login_params");
            A00.Cgf();
        }
    }

    public static final void A01(0lg r7, String str, String str2, String str3, String str4) {
        A00(r7, AnonymousClass05K.A01, str, str2, str3, str4, (String) null, (HashMap) null);
    }
}
