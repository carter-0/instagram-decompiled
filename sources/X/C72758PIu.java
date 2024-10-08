package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PIu  reason: case insensitive filesystem */
public final class C72758PIu implements AnonymousClass5IX {
    public final UserSession A00;
    public final C61410nE A01;
    public final Integer A02;

    public C72758PIu(UserSession userSession, C61410nE r3, Integer num) {
        0qQ.A0B(r3, 3);
        this.A00 = userSession;
        this.A02 = num;
        this.A01 = r3;
    }

    public final boolean E1z(AnonymousClass5IY r6) {
        long A0P = AnonymousClass7TE.A0P(C51966G9m.A07(DbW.A06(AnonymousClass7TE.A0q(this.A00), "last_interop_interstitial_presentation_timestamp")));
        Integer num = this.A02;
        0qQ.A0A(num);
        return AnonymousClass7TF.A1R((A0P > ((long) num.intValue()) ? 1 : (A0P == ((long) num.intValue()) ? 0 : -1)));
    }
}
