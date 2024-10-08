package X;

import com.instagram.common.session.UserSession;

public final class KOI extends LSR {
    public final C62462KgC A00;
    public final LRK A01;
    public final boolean A02;
    public final boolean A03;
    public final UserSession A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOI(UserSession userSession, C62462KgC kgC, LRK lrk, boolean z) {
        super(lrk);
        AnonymousClass7TG.A1O(userSession, lrk);
        this.A04 = userSession;
        this.A01 = lrk;
        this.A00 = kgC;
        this.A02 = z;
        this.A03 = new C227072ib(userSession).A00();
    }
}
