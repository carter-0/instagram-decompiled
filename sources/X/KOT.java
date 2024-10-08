package X;

import com.instagram.common.session.UserSession;

public final class KOT extends LSR {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final LRK A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(C66296MMf.A00(this, 29));
    public final 05G A04;
    public final AnonymousClass0Ud A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KOT(AnonymousClass0iw r5, UserSession userSession, LRK lrk, boolean z, boolean z2, boolean z3) {
        super(lrk);
        int A032 = DbW.A03(2, userSession, r5);
        this.A02 = lrk;
        this.A01 = userSession;
        this.A00 = r5;
        this.A06 = z;
        this.A07 = z2;
        this.A08 = z3;
        02z A10 = DbS.A10(new C61042Jvg(A032, 9, false));
        this.A04 = A10;
        this.A05 = A10;
    }
}
