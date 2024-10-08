package X;

import com.instagram.common.session.UserSession;

public final class KOW extends LSR {
    public final LRK A00;
    public final AnonymousClass0Ud A01;
    public final UserSession A02;
    public final C60187Jh6 A03;

    public final void A0A() {
        05G r2 = this.A03.A04;
        r2.getValue();
        do {
        } while (!r2.AIY(r2.getValue(), KP5.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOW(UserSession userSession, LRK lrk, C60187Jh6 jh6) {
        super(lrk);
        AnonymousClass7TG.A1Q(userSession, jh6);
        this.A00 = lrk;
        this.A02 = userSession;
        this.A03 = jh6;
        this.A01 = jh6.A05;
    }
}
