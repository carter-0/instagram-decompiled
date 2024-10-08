package X;

import com.instagram.common.session.UserSession;

public final class P3Z implements C74510Pw5 {
    public boolean A00;
    public final 2Dm A01;
    public final OO9 A02;

    public final void AUu(2EM r4, C2611948q r5, String str) {
        0qQ.A0B(r5, 2);
        this.A02.A03(C69375NkF.A06, r5, false);
    }

    public final void CgP(2EM r3, C2611948q r4) {
        0qQ.A0B(r4, 1);
        this.A02.A02(C69375NkF.A06, r4);
    }

    public final boolean Cmi() {
        return true;
    }

    public final void EIx() {
    }

    public final void Eji(2EM r1) {
    }

    public final boolean EsC() {
        return true;
    }

    public final void pause() {
    }

    public final void start() {
    }

    public final void stop() {
    }

    public final boolean AFZ(2EM r2, C2611948q r3) {
        AnonymousClass43G r0 = this.A02.A04;
        if (r0 != null) {
            return r0.A03;
        }
        0qQ.A0F("directCurrentSource");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CKO() {
        return this.A02.A06();
    }

    public final boolean CT5() {
        AnonymousClass43G r0 = this.A02.A04;
        if (r0 != null) {
            return r0.A04;
        }
        0qQ.A0F("directCurrentSource");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean isLoading() {
        return this.A02.A06();
    }

    public P3Z(UserSession userSession, C74321Psx psx, 2Dm r6) {
        this.A01 = r6;
        OO9 oo9 = new OO9(userSession);
        this.A02 = oo9;
        oo9.A05(2Eo.A04);
        oo9.A01(new C68439NHz(userSession, this, psx, 3));
    }
}
