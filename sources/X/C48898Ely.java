package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ely  reason: case insensitive filesystem */
public abstract class C48898Ely {
    public static final void A00(UserSession userSession, AnonymousClass4D6 r3, G73 g73, String str) {
        AnonymousClass7TG.A1N(str, userSession);
        0qQ.A0B(r3, 3);
        1Xj A0U = DbV.A0U(userSession, str);
        if (A0U != null) {
            g73.DoN(A0U);
            return;
        }
        1OC A04 = C3724090s.A04(userSession, str);
        EDV.A00(A04, g73, userSession, 15);
        r3.schedule(A04);
    }
}
