package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3KB  reason: invalid class name */
public final class AnonymousClass3KB implements C70992Zi {
    public final UserSession A00;
    public final AnonymousClass332 A01;
    public final AnonymousClass2lI A02;
    public final C62320sa A03;
    public final C62320sa A04;
    public final C62320sa A05;

    public AnonymousClass3KB(UserSession userSession, AnonymousClass332 r3, AnonymousClass2lI r4, C62320sa r5, C62320sa r6, C62320sa r7) {
        0qQ.A0B(r4, 2);
        this.A00 = userSession;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A04 = r7;
        this.A01 = r3;
    }

    public final void DV0(C71162bE r4) {
        int A032 = AnonymousClass0fD.A03(1934572272);
        AnonymousClass2lI r1 = this.A02;
        if (r1.A00()) {
            if (((Boolean) this.A03.invoke()).booleanValue()) {
                this.A05.invoke();
                C2372236u.A00(this.A00).A06(AnonymousClass05K.A0C);
            }
        } else if (r1.A01()) {
            this.A04.invoke();
        } else {
            AnonymousClass332 r0 = this.A01;
            if (r0 != null) {
                r0.A00.onPause();
            }
        }
        AnonymousClass0fD.A0A(44588494, A032);
    }
}
