package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Vrg  reason: case insensitive filesystem */
public final class C18437Vrg {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = C20703Wxa.A01(this, 30);

    public C18437Vrg(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(C18437Vrg vrg, String str, String str2, String str3, String str4, String str5) {
        0Aj A0e = AnonymousClass7TE.A0e((0wc) vrg.A01.getValue(), "ipi_cache_event");
        A0e.AAJ("event", str);
        DbS.A1N(A0e, str3);
        DbS.A1H(A0e, str2);
        A0e.AAJ("flow_id", str4);
        A0e.AAJ("error_identifier", str5);
        A0e.Cgf();
    }
}
