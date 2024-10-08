package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4nr  reason: invalid class name and case insensitive filesystem */
public final class C274194nr implements C274184nq {
    public final UserSession A00;
    public final C274184nq A01;
    public final C228302lG A02;

    public C274194nr(UserSession userSession, C274184nq r3, C228302lG r4) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        this.A01 = r3;
        this.A00 = userSession;
        this.A02 = r4;
    }

    public final void Dl4(C262804Gb r8, 1Xj r9, GQ0 gq0, AnonymousClass3W1 r11, int i, int i2) {
        0qQ.A0B(r9, 0);
        this.A01.Dl4(r8, r9, gq0, r11, i, i2);
    }

    public final JOE BQ4() {
        return this.A01.BQ4();
    }

    public final void D9z(C262804Gb r7, 1Xj r8, GQ0 gq0, AnonymousClass3W1 r10, int i) {
        1Xj r2 = r8;
        if (!0q2.A00(this.A00).A0N(r8)) {
            this.A02.A00("LIKE");
        }
        this.A01.D9z(r7, r2, gq0, r10, i);
    }
}
