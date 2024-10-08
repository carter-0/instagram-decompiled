package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MnN  reason: case insensitive filesystem */
public final class C67406MnN implements C250603lj {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C67405MnM A03;

    public C67406MnN(AnonymousClass0iw r1, UserSession userSession, C67405MnM mnM) {
        this.A03 = mnM;
        this.A02 = userSession;
        this.A01 = r1;
    }

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        AnonymousClass7TG.A1N(r7, r8);
        if (r8.CEk(r7) != AnonymousClass05K.A0C && this.A00) {
            String A012 = ((C66974Mg7) r7.A03).A00.A01();
            if (this.A03.AH0(A012)) {
                UserSession userSession = this.A02;
                AnonymousClass0iw r1 = this.A01;
                C230012om r4 = new C230012om(r1, userSession);
                int i = ((C66967Mg0) r7.A04).A00;
                AnonymousClass6KM r12 = new AnonymousClass6KM("su_in_search_null_state", A012, r1.getModuleName());
                r12.A00 = i;
                r4.A09(new AnonymousClass6KN(r12));
            }
        }
    }
}
