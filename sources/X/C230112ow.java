package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2ow  reason: invalid class name and case insensitive filesystem */
public final class C230112ow implements C250603lj {
    public final 1Ng A00;

    public C230112ow(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        1Ng r2;
        AnonymousClass1qK r1;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        Object obj = r5.A03;
        0qQ.A06(obj);
        AnonymousClass1Xn r3 = (AnonymousClass1Xn) obj;
        if (r6.CEk(r5) == AnonymousClass05K.A00) {
            r2 = this.A00;
            r1 = new AnonymousClass64Y(r3.getId());
        } else if (r6.CEk(r5) == AnonymousClass05K.A0C) {
            r2 = this.A00;
            r1 = new AnonymousClass64Z(r3.getId());
        } else {
            return;
        }
        r2.A00(r1);
    }
}
