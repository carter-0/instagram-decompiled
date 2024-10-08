package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Hoc  reason: case insensitive filesystem */
public final class C55855Hoc {
    public String A00;
    public final UserSession A01;
    public final G5K A02;
    public final 05G A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0Ud A06;

    public C55855Hoc(UserSession userSession) {
        this.A01 = userSession;
        02z A10 = DbS.A10(new C56514Hzl(false, true, false));
        this.A04 = A10;
        this.A06 = 10b.A03(A10);
        02z A012 = 106.A01(0sn.A00);
        this.A03 = A012;
        this.A05 = 10b.A03(A012);
        this.A02 = new C46323Dbr(userSession.A06);
    }
}
