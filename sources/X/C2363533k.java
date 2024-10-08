package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.33k  reason: invalid class name and case insensitive filesystem */
public final class C2363533k implements C2361132m {
    public final UserSession A00;
    public final C2361132m A01;
    public final C234172xD A02;

    public C2363533k(UserSession userSession, C2361132m r3, C234172xD r4) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(r4, 3);
        this.A01 = r3;
        this.A00 = userSession;
        this.A02 = r4;
    }

    public final void DF7(AnonymousClass1Xn r4) {
        Object iTg;
        boolean z = r4 instanceof 1Xj;
        C234172xD r2 = this.A02;
        if (z) {
            r2.A01((1Xj) r4);
            iTg = new C57218ITf(r4, this);
        } else {
            r2.A00 = true;
            int intValue = r4.CBd().intValue();
            if (intValue == 2 || intValue == 3) {
                iTg = new C57219ITg(r4, this);
            }
            r2.A00();
        }
        r2.A06.put(r4, iTg);
        r2.A00();
    }

    public final void DYo() {
        this.A01.DYo();
    }

    public final void Ds6() {
        this.A01.Ds6();
    }
}
