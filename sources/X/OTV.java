package X;

import com.instagram.common.session.UserSession;

public final class OTV {
    public final 02m A00;
    public final 14i A01;
    public final C61110lV A02;
    public final UserSession A03;

    public static final void A00(OTV otv, short s) {
        otv.A00.markerEnd(31786177, s);
        14i.A06(otv.A02);
    }

    public OTV(02m r3, 14i r4, UserSession userSession) {
        AnonymousClass7TG.A1P(userSession, r4);
        this.A03 = userSession;
        this.A00 = r3;
        this.A01 = r4;
        C71941OtR otR = new C71941OtR(this, 0);
        this.A02 = otR;
        14i.A05(otR);
    }
}
