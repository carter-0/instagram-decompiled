package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EcT  reason: case insensitive filesystem */
public abstract class C48310EcT {
    public static final void A00(0xI r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        r2.A0C("account_linking_session_id", String.valueOf(((EtA) userSession.A01(EtA.class, G1F.A00)).A00));
        DbU.A1R(r2, userSession);
    }
}
