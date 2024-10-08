package X;

import com.instagram.common.session.UserSession;

public final class F05 {
    public boolean A00 = true;
    public final C14221Ts1 A01;
    public final C14221Ts1 A02;
    public final AnonymousClass7g1 A03;
    public final AnonymousClass7g1 A04;

    public F05(UserSession userSession, C337267fz r17) {
        UserSession userSession2 = userSession;
        C337267fz r2 = r17;
        AnonymousClass7TF.A1B(r2, 1, userSession2);
        AnonymousClass7g1 r7 = new AnonymousClass7g1();
        this.A03 = r7;
        this.A01 = C14225Ts5.A00(userSession2, (AnonymousClass4D6) null, new AfC(r2, this, true), (G9d) null, r7, AnonymousClass05K.A0C, 0, 200, false, false);
        AnonymousClass7g1 r72 = new AnonymousClass7g1();
        this.A04 = r72;
        this.A02 = C14225Ts5.A00(userSession2, (AnonymousClass4D6) null, new AfC(r2, this, false), (G9d) null, r72, AnonymousClass05K.A00, 0, 200, false, false);
    }
}
