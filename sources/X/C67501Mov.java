package X;

import com.instagram.common.session.UserSession;
import com.instagram.copresence.repository.persistence.RankedUserDatabase;

/* renamed from: X.Mov  reason: case insensitive filesystem */
public final class C67501Mov implements AnonymousClass0lh {
    public final C67502Mow A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C67507Mp2.A00);

    public C67501Mov(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = new C67502Mow(userSession);
    }

    public final void onSessionWillEnd() {
        C67502Mow mow = this.A00;
        0ng r1 = mow.A00;
        if (r1 != null) {
            JTO.A0E(mow.A09).removeCallbacks(r1);
        }
        mow.A00 = null;
        UserSession userSession = mow.A03;
        1V8.A01(userSession, RankedUserDatabase.A00);
        0xY A0p = AnonymousClass7TE.A0p(1Au.A00(userSession));
        A0p.E5c("copresence_model_expiration", 0);
        A0p.apply();
    }
}
