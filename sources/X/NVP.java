package X;

import com.instagram.common.session.UserSession;

public final class NVP extends NVR {
    public final 05G A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NVP(UserSession userSession, C69263NiP niP) {
        super(userSession, niP);
        0qQ.A0B(userSession, 1);
        0sn r5 = 0sn.A00;
        02z A012 = 106.A01(r5);
        this.A00 = A012;
        02z A013 = 106.A01(r5);
        this.A01 = A013;
        0pt A002 = AnonymousClass10H.A00(new C73577PgB(this, 1), this.A07, A012, A013);
        this.A02 = 10b.A02(new OBR(C62510Kh0.INITIAL_LOAD, r5), C318116oQ.A00(this), A002, AnonymousClass10A.A01);
        C66583MXo.A1O(this, C318116oQ.A00(this), 42);
    }

    public final void A0F(C69374NkE nkE) {
        0qQ.A0B(nkE, 0);
        05G r0 = this.A00;
        0sn r1 = 0sn.A00;
        r0.Epw(r1);
        this.A01.Epw(r1);
        this.A01 = AnonymousClass7TF.A1W(nkE, C69374NkE.A06);
        super.A0F(nkE);
    }
}
