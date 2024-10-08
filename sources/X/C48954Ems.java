package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ems  reason: case insensitive filesystem */
public abstract class C48954Ems {
    public static final void A00(UserSession userSession, String str, String str2, String str3, String str4) {
        1Ln A0F = 1Ln.A0F(AnonymousClass0kN.A02(userSession));
        if (DbT.A1Y(A0F)) {
            Dbb.A1G(A0F, userSession);
            A0F.A0l(str2);
            A0F.A0k(str3);
            A0F.A0p(str4);
            Dba.A1E(A0F, "thread_view");
            A0F.A0s(str);
            A0F.Cgf();
        }
    }
}
