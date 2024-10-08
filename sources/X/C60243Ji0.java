package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ji0  reason: case insensitive filesystem */
public final class C60243Ji0 extends 2YL {
    public final C63756L5o A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02;
    public final 05G A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06 = 106.A01((Object) null);
    public final AnonymousClass0Ud A07;
    public final boolean A08;
    public final boolean A09;

    public final void A00(String str) {
        JTR.A1W(this.A04);
        C318136oS A002 = C318116oQ.A00(this);
        MGE mge = new MGE(this, str, (AnonymousClass4D7) null, 3);
        19B r3 = 19B.A00;
        1Eo.A05(r3, new MHA(this, (AnonymousClass4D7) null, 19), C51967G9n.A0M(this, r3, mge, A002));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.109, java.lang.Object] */
    public C60243Ji0(C63756L5o l5o, UserSession userSession) {
        boolean A1Y = DbW.A1Y(userSession);
        this.A00 = l5o;
        this.A01 = userSession;
        02z A012 = 106.A01((Object) null);
        this.A05 = A012;
        02z A0q = JTQ.A0q();
        this.A03 = A0q;
        02z A10 = C51970G9q.A10(A1Y);
        this.A04 = A10;
        this.A02 = MM7.A00(this, 43);
        0Tu r2 = 0Tu.A05;
        this.A08 = 182.A06(r2, userSession, 36325145469596308L);
        this.A09 = 182.A06(r2, userSession, 36330479817212563L);
        0pt A002 = AnonymousClass10H.A00(new MHr(this, (AnonymousClass4D7) null, 0), A012, A10, A0q);
        this.A07 = 10b.A02(new C53382GnE(), C318116oQ.A00(this), A002, new Object());
    }
}
