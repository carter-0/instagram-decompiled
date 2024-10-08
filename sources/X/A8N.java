package X;

import com.instagram.common.session.UserSession;

public final class A8N {
    public final UserSession A00;

    public A8N(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final 0eP A00(C390809rs r6) {
        UserSession userSession;
        0Tu r3;
        String A04;
        long j;
        0qQ.A0B(r6, 0);
        int ordinal = r6.ordinal();
        if (ordinal == 0) {
            userSession = this.A00;
            r3 = 0Tu.A05;
            A04 = 182.A04(r3, userSession, 36887648744375040L);
            j = 36887648744637188L;
        } else if (ordinal == 1) {
            userSession = this.A00;
            r3 = 0Tu.A05;
            A04 = 182.A04(r3, userSession, 36887648744506114L);
            j = 36887648744702725L;
        } else if (ordinal == 2) {
            userSession = this.A00;
            r3 = 0Tu.A05;
            A04 = 182.A04(r3, userSession, 36887648744440577L);
            j = 36887648744768262L;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return AnonymousClass7TE.A1L(A04, 182.A04(r3, userSession, j));
    }
}
