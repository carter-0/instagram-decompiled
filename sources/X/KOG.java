package X;

import com.instagram.common.session.UserSession;

public final class KOG extends LSR {
    public boolean A00;
    public final UserSession A01;
    public final LRK A02;
    public final AnonymousClass0r6 A03;
    public final 05G A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOG(UserSession userSession, LRK lrk) {
        super(lrk);
        0qQ.A0B(userSession, 2);
        this.A02 = lrk;
        this.A01 = userSession;
        02z A10 = DbS.A10(new C61060Jvy(3));
        this.A04 = A10;
        this.A03 = A10;
    }
}
