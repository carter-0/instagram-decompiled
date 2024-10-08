package X;

import com.instagram.common.session.UserSession;

public final class KOS extends LSR {
    public Integer A00 = AnonymousClass05K.A00;
    public final UserSession A01;
    public final LRK A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOS(UserSession userSession, LRK lrk, boolean z, boolean z2, boolean z3) {
        super(lrk);
        0qQ.A0B(userSession, 2);
        this.A02 = lrk;
        this.A01 = userSession;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        02z A10 = DbS.A10(new JV5(7));
        this.A03 = A10;
        this.A04 = A10;
    }
}
