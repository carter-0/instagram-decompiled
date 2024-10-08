package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.30V  reason: invalid class name */
public final class AnonymousClass30V implements C250603lj {
    public final UserSession A00;

    public final void ATF(AnonymousClass30Y r4, C252093oY r5) {
        1Xl r1;
        Integer num = null;
        if (r4 != null) {
            r1 = (1Xl) r4.A03;
        } else {
            r1 = null;
        }
        if (r1 instanceof AnonymousClass3OA) {
            if (r5 != null) {
                num = r5.CEk(r4);
            }
            if (num == AnonymousClass05K.A00) {
                1wN.A00(this.A00).A01((AnonymousClass3OA) r1);
            }
        }
    }

    public AnonymousClass30V(UserSession userSession) {
        this.A00 = userSession;
    }
}
