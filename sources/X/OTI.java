package X;

import com.instagram.common.session.UserSession;

public final class OTI {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;

    public OTI(AnonymousClass0iw r2, UserSession userSession, String str) {
        0qQ.A0B(r2, 3);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = r2;
    }

    public static final void A00(OTI oti, String str, String str2, String str3, String str4, int i) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(oti.A00, oti.A01), "direct_request_filter");
        DbS.A1J(A0e, str);
        A0e.A9O("e_counter_channel", "");
        A0e.A9F("total_requests", DbS.A0j(i));
        if (str2 != null) {
            A0e.AAJ("from_filter", str2);
        }
        if (str3 != null) {
            A0e.AAJ("to_filter", str3);
        }
        if (str4 != null) {
            A0e.AAJ("sort_and_filter_options", str4);
        }
        A0e.Cgf();
    }
}
