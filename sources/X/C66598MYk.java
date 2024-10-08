package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MYk  reason: case insensitive filesystem */
public final class C66598MYk implements AnonymousClass0lh {
    public boolean A00;
    public final AnonymousClass1aS A01 = 1aF.A00();
    public final 1a8 A02 = C66581MXm.A0P();
    public final UserSession A03;
    public final C62320sa A04;
    public final 0sP A05 = new C74193PqZ(this, 16);
    public final 0sP A06;

    public C66598MYk(UserSession userSession, C62320sa r4, 0sP r5) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = r4;
        this.A06 = r5;
    }

    public static final 1aU A00(C66598MYk mYk, MYb mYb) {
        return C72120Owf.A01(mYb.A09, mYb, 50).A0N(new C66623MZk(C66622MZj.A00)).A0K(new C66624MZl(new C74191PqX(25, (Object) mYb, (Object) mYk)));
    }

    public final void onSessionWillEnd() {
        this.A02.A01();
    }
}
