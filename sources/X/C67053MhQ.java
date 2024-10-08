package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MhQ  reason: case insensitive filesystem */
public final class C67053MhQ implements C74504Pvz {
    public final UserSession A00;
    public final C74504Pvz A01;
    public final C74504Pvz A02;
    public final C74565PxE A03;
    public final C74566PxF A04;

    public C67053MhQ(UserSession userSession, C74504Pvz pvz, C74504Pvz pvz2) {
        0qQ.A0B(pvz2, 2);
        this.A01 = pvz;
        this.A02 = pvz2;
        this.A00 = userSession;
        this.A03 = pvz.B6g();
        this.A04 = new C66936MfV(userSession, pvz.C6W(), pvz2.C6W());
    }

    public final void EoV(C2611948q r2) {
        0qQ.A0B(r2, 0);
        this.A01.EoV(r2);
        this.A02.EoV(r2);
    }

    public final 1aU AE3() {
        return 1aU.A01(C67085Mi0.A00, this.A01.AE3(), this.A02.AE3());
    }

    public final 1aU AV8() {
        return this.A01.AV8();
    }

    public final 1aU AW9() {
        return this.A01.AW9();
    }

    public final C74565PxE B6g() {
        return this.A03;
    }

    public final C74566PxF C6W() {
        return this.A04;
    }

    public final 1aU E2O() {
        return 1aU.A01(C67268Ml2.A00, this.A01.E2O(), this.A02.E2O());
    }

    public final void EWx(N4R n4r) {
        this.A01.EWx(n4r);
        this.A02.EWx(n4r);
    }

    public final void EfW(int i) {
        this.A01.EfW(i);
        this.A02.EfW(i);
    }

    public final 1aU Ezk() {
        return C66789Mca.A00(1aU.A01(new OuU((Object) this, 2), this.A01.Ezk(), this.A02.Ezk()), C67270Ml4.A00, 7).A0L(C67271Ml5.A00);
    }
}
