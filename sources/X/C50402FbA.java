package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FbA  reason: case insensitive filesystem */
public final class C50402FbA implements AnonymousClass7YP {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass0eK A02;

    public final void ARZ() {
        C51075Fo5 fo5 = new C51075Fo5(this, 0);
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A01;
        r0.A01(userSession).A1D(true);
        AnonymousClass3FW r3 = new AnonymousClass3FW(userSession);
        AnonymousClass7TE.A1Z(new MHI(r3, fo5, this, (AnonymousClass4D7) null, 42), DbV.A0J(this.A00));
    }

    public C50402FbA(AnonymousClass4DH r1, UserSession userSession, AnonymousClass0eK r3) {
        AnonymousClass7TG.A1P(r1, r3);
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = r3;
    }
}
