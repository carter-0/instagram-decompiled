package X;

import java.util.Map;

public final class SGW {
    public static final SGW A00 = new Object();
    public static final AnonymousClass0Gt A01;

    public final void A00(C58840Ae r8, Integer num, String str, String str2, String str3, Map map, long j) {
        Integer num2;
        C8953RIs rIs;
        RIh rIh;
        0qQ.A0B(str, 2);
        if (r8 != null) {
            0Aj A0d = C51969G9p.A0d(r8, "fx_third_party_account_linking");
            long A0I = AnonymousClass7TG.A0I();
            if (j == 0) {
                num2 = AnonymousClass05K.A00;
            } else if (j <= A0I) {
                num2 = AnonymousClass05K.A0C;
            } else {
                num2 = AnonymousClass05K.A01;
            }
            if (A0d.isSampled()) {
                switch (num.intValue()) {
                    case 3:
                        rIs = C8953RIs.END_AUTH_FLOW;
                        break;
                    case 4:
                        rIs = C8953RIs.END_CODE_EXCHANGE;
                        break;
                    case 5:
                        rIs = C8953RIs.END_GET_AUTH_URL;
                        break;
                    case 6:
                        rIs = C8953RIs.END_REFRESH_TOKEN;
                        break;
                    case 7:
                        rIs = C8953RIs.SDK_INIT;
                        break;
                    case 8:
                        rIs = C8953RIs.START_AUTH_FLOW;
                        break;
                    case 9:
                        rIs = C8953RIs.START_CODE_EXCHANGE;
                        break;
                    case 10:
                        rIs = C8953RIs.START_GET_AUTH_URL;
                        break;
                    default:
                        rIs = C8953RIs.START_REFRESH_TOKEN;
                        break;
                }
                A0d.A8M(rIs, "event");
                A0d.A9F("partner_integration_id", DbV.A0q(str));
                A0d.A8M(RIU.OAUTH, "auth_mechanism");
                int intValue = num2.intValue();
                if (intValue == 0) {
                    rIh = RIh.UNAUTHENTICATED;
                } else if (intValue != 1) {
                    rIh = RIh.AUTHENTICATED_EXPIRED;
                } else {
                    rIh = RIh.AUTHENTICATED_ACTIVE;
                }
                A0d.A8M(rIh, "authentication_state");
                A0d.A9H("extra_data", map);
                A0d.AAJ("error_message", str2);
                A0d.AAJ("error_stacktrace", str3);
                A0d.Cgf();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.SGW, java.lang.Object] */
    static {
        AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
        0qQ.A07(r0);
        A01 = r0;
    }
}
