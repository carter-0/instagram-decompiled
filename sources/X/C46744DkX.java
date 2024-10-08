package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DkX  reason: case insensitive filesystem */
public final class C46744DkX extends 2YL {
    public final UserSession A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;

    public C46744DkX(UserSession userSession) {
        Integer num;
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        if (AnonymousClass3WP.A07(userSession)) {
            num = AnonymousClass05K.A00;
        } else if (AnonymousClass3WS.A06(userSession)) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A0C;
        }
        02z A10 = DbS.A10(new C61080JwI(23, num));
        this.A01 = A10;
        this.A02 = 10b.A03(A10);
    }
}
