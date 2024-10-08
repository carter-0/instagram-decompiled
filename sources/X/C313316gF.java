package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6gF  reason: invalid class name and case insensitive filesystem */
public final class C313316gF {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final UserSession A03;
    public final C313326gG A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final boolean A07;
    public final boolean A08;

    public C313316gF(UserSession userSession) {
        C313326gG r0;
        this.A03 = userSession;
        if (182.A06(0Tu.A05, userSession, 36320541263995479L)) {
            r0 = (C313326gG) userSession.A01(C313326gG.class, new C20695WxR(userSession, 14));
        } else {
            r0 = new C313326gG(userSession);
        }
        this.A04 = r0;
        this.A05 = AnonymousClass0eN.A01(C313336gH.A00);
        this.A06 = AnonymousClass0eN.A01(C313346gI.A00);
        0Tu r2 = 0Tu.A06;
        this.A08 = 182.A06(r2, userSession, 36320541263667796L);
        this.A07 = 182.A06(r2, userSession, 36320541263798869L);
        this.A02 = 182.A01(r2, userSession, 36602016240570795L);
    }
}
