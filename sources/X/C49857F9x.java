package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F9x  reason: case insensitive filesystem */
public final class C49857F9x {
    public final 0wc A00;

    public static final void A00(C49857F9x f9x, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(f9x.A00, C66579MXk.A00(808));
        if (A0e.isSampled()) {
            DbS.A1J(A0e, str);
            A0e.A7p(C66579MXk.A00(816), bool);
            A0e.A7p("has_emoji", bool3);
            A0e.A7p("has_message_content", bool2);
            A0e.AAJ("error_message", str3);
            DbS.A1L(A0e, str2);
            A0e.A7p("is_default_content", bool4);
            A0e.Cgf();
        }
    }

    public C49857F9x(AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}
