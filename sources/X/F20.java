package X;

import com.instagram.common.session.UserSession;

public final class F20 {
    public final AnonymousClass0iw A00;
    public final 0wc A01;

    public F20(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0xG A0O = DbS.A0O("CreatorMonetizationSupportInboxLogger");
        this.A00 = A0O;
        this.A01 = AnonymousClass0kN.A01(A0O, userSession);
    }

    public final void A00(String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "ig_creator_monetization_support_inbox");
        DbS.A1H(A0e, str);
        DbS.A1J(A0e, str2);
        A0e.AAJ("client_extra", str3);
        A0e.Cgf();
    }
}
