package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4JY  reason: invalid class name */
public final class AnonymousClass4JY implements AnonymousClass4JX {
    public final UserSession A00;
    public final AnonymousClass311 A01;
    public final AnonymousClass4JX A02;
    public final C228302lG A03;

    public AnonymousClass4JY(UserSession userSession, AnonymousClass311 r3, AnonymousClass4JX r4, C228302lG r5) {
        0qQ.A0B(r4, 1);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r5, 4);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = userSession;
        this.A03 = r5;
    }

    public final void Dl3(1Xj r8, GQ0 gq0, AnonymousClass4EA r10, AnonymousClass3W1 r11, int i) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r11, 1);
        this.A03.A00("SINGLE_TAP");
        this.A02.Dl3(r8, gq0, r10, r11, i);
    }

    public final JOE BQ4() {
        return this.A01.BQ4();
    }

    public final void D9y(1Xj r8, GQ0 gq0, AnonymousClass4EA r10, AnonymousClass3W1 r11, int i) {
        1Xj r2 = r8;
        if (!0q2.A00(this.A00).A0N(r8)) {
            this.A03.A00("LIKE");
        }
        this.A02.D9y(r2, gq0, r10, r11, i);
    }
}
