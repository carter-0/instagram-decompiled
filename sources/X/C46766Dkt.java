package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dkt  reason: case insensitive filesystem */
public final class C46766Dkt extends 2YL {
    public final 2Fk A00;
    public final EQ4 A01;
    public final UserSession A02;
    public final AnonymousClass0r6 A03;
    public final 05G A04;

    public final void onCleared() {
        EQ4 eq4 = this.A01;
        AnonymousClass1EO r0 = eq4.A00;
        if (r0 != null) {
            r0.cancel();
        }
        eq4.A00 = null;
        eq4.A01.AI3((Throwable) null);
    }

    public /* synthetic */ C46766Dkt(UserSession userSession) {
        EQ4 eq4 = new EQ4(1Au.A00(userSession), userSession);
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = eq4;
        AnonymousClass0YX A042 = 0u9.A04(eq4.A01);
        this.A03 = !(A042 instanceof C62210rv) ? new AnonymousClass0YX(A042) : A042;
        02z A012 = 106.A01(DxQ.A00);
        this.A04 = A012;
        19B r3 = 19B.A00;
        this.A00 = C226292g8.A00(r3, A012);
        if (!DbT.A1a(eq4.A03.A01, "pokes_impression_v2")) {
            1Eo.A05(r3, new MFS(this, (AnonymousClass4D7) null, 18), C318116oQ.A00(this));
        }
    }
}
