package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4GK  reason: invalid class name */
public final class AnonymousClass4GK implements AnonymousClass4GI {
    public final UserSession A00;
    public final AnonymousClass4GI A01;
    public final AnonymousClass311 A02;
    public final C228302lG A03;

    public AnonymousClass4GK(UserSession userSession, AnonymousClass4GI r3, AnonymousClass311 r4, C228302lG r5) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r5, 4);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = userSession;
        this.A03 = r5;
    }

    public final void DA0(C55778HnD hnD, 1Xj r8, GQ0 gq0, AnonymousClass3W1 r10, int i) {
        1Xj r2 = r8;
        0qQ.A0B(r8, 0);
        AnonymousClass3W1 r4 = r10;
        0qQ.A0B(r10, 1);
        if (!0q2.A00(this.A00).A0N(r8)) {
            this.A03.A00("LIKE");
        }
        this.A01.DA0(hnD, r2, gq0, r4, i);
    }

    public final void Dl6(C55778HnD hnD, 1Xj r8, GQ0 gq0, AnonymousClass3W1 r10, int i) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r10, 1);
        this.A01.Dl6(hnD, r8, gq0, r10, i);
    }

    public final JOE BQ4() {
        return this.A02.BQ4();
    }
}
