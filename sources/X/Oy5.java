package X;

import com.instagram.common.session.UserSession;

public final class Oy5 implements AnonymousClass0lh {
    public boolean A00;
    public final 1aU A01;
    public final 1a8 A02 = C66581MXm.A0P();
    public final UserSession A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(MYO.A01(this, 16));
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(MYO.A01(this, 17));
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(MYO.A01(this, 18));

    public Oy5(1aU r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = r2;
    }

    public final void onSessionWillEnd() {
        this.A02.A01();
    }
}
