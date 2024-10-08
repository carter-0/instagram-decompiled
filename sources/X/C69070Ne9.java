package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ne9  reason: case insensitive filesystem */
public final class C69070Ne9 extends C252733pa implements C66514MUs {
    public final int A00;
    public final UserSession A01;
    public final OLO A02;
    public final 05G A03;
    public final 05G A04;
    public final AnonymousClass0Ud A05;
    public final C66594MYg A06;
    public final AnonymousClass0Ud A07;

    public C69070Ne9(UserSession userSession) {
        super("search_interop", AnonymousClass43D.A00(359266386));
        this.A01 = userSession;
        02z A1J = JTO.A1J();
        this.A04 = A1J;
        this.A05 = A1J;
        02z A10 = C51970G9q.A10(false);
        this.A03 = A10;
        this.A07 = A10;
        this.A00 = DbS.A04(0Tu.A05, userSession, 36595328975112311L);
        C66594MYg A012 = MYc.A01(userSession, "OptionalE2eeRepository");
        this.A06 = A012;
        this.A02 = new OLO(A012);
    }

    public final AnonymousClass0Ud BqH() {
        return this.A05;
    }

    public final AnonymousClass0Ud CWW() {
        return this.A07;
    }

    public final void FLH(String str) {
        AnonymousClass7TE.A1Z(new C66187MGy(this, str, (AnonymousClass4D7) null, 23), this.A01);
    }
}
