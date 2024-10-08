package X;

import com.instagram.common.session.UserSession;

public final class PD4 implements AnonymousClass1cH {
    public final UserSession A00;
    public final 1OZ A01;

    public final boolean CeE(1OS r2, C74248Prc prc) {
        return true;
    }

    public final void EM9(0xF r4, C74551Pwk pwk, 1OS r6) {
        1OZ r0 = this.A01;
        UserSession userSession = this.A00;
        1OC AEI = r0.AEI(userSession, r6);
        AEI.A00 = new C68418NHd(userSession, pwk);
        1ES.A03(AEI);
    }

    public PD4(UserSession userSession, 1OZ r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
