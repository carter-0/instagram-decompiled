package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4y9  reason: invalid class name and case insensitive filesystem */
public final class C279144y9 implements C279134y8 {
    public final UserSession A00;
    public final C279134y8 A01;
    public final AnonymousClass311 A02;
    public final C228302lG A03;

    public C279144y9(UserSession userSession, C279134y8 r3, AnonymousClass311 r4, C228302lG r5) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r5, 4);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = userSession;
        this.A03 = r5;
    }

    public final void Dl8(1Xj r8, GQ0 gq0, AnonymousClass3V3 r10, AnonymousClass3W1 r11, int i, int i2) {
        0qQ.A0B(r8, 0);
        0qQ.A0B(r11, 1);
        this.A01.Dl8(r8, gq0, r10, r11, i, i2);
    }

    public final JOE BQ4() {
        return this.A02.BQ4();
    }

    public final void DA2(C279064y1 r7, 1Xj r8, GQ0 gq0, AnonymousClass3W1 r10, int i) {
        1Xj r2 = r8;
        if (!0q2.A00(this.A00).A0N(r8)) {
            this.A03.A00("LIKE");
        }
        this.A01.DA2(r7, r2, gq0, r10, i);
    }
}
