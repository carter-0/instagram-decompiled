package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dkc  reason: case insensitive filesystem */
public final class C46749Dkc extends 2YL {
    public 05G A00;
    public final 2Fk A01;
    public final UserSession A02;

    public C46749Dkc(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        02z A10 = DbS.A10(EWN.RECIPROCAL_FOLLOWS);
        this.A00 = A10;
        this.A01 = DbT.A0G(A10);
    }
}
