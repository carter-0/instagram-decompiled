package X;

/* renamed from: X.Mbm  reason: case insensitive filesystem */
public final class C66741Mbm implements C74510Pw5 {
    public C67309Mlj A00;
    public final C74340PtG A01;
    public final 1bO A02;
    public final 2Dm A03;

    public final void AUu(2EM r9, C2611948q r10, String str) {
        2EM r1 = r9;
        C2611948q r4 = r10;
        AnonymousClass7TF.A1B(r9, 1, r10);
        C67309Mlj mlj = this.A00;
        if (mlj != null) {
            mlj.A02();
        }
        C67309Mlj mlj2 = new C67309Mlj(r1, this.A01, this.A02, r4, str, true, true);
        mlj2.A03();
        this.A00 = mlj2;
    }

    public final void CgP(2EM r9, C2611948q r10) {
        AnonymousClass7TF.A1H(r9, r10);
        1bO r3 = this.A02;
        C67309Mlj mlj = new C67309Mlj(r9, this.A01, r3, r10, "page_scroll", false, false);
        mlj.A03();
        this.A00 = mlj;
    }

    public final void EIx() {
    }

    public final void Eji(2EM r1) {
    }

    public final void pause() {
    }

    public final void start() {
    }

    public final void stop() {
    }

    public final boolean CKO() {
        C67309Mlj mlj = this.A00;
        if (mlj == null || mlj.A01) {
            return false;
        }
        return true;
    }

    public final boolean CT5() {
        C67309Mlj mlj = this.A00;
        if (mlj == null || !mlj.A01 || mlj.A03) {
            return false;
        }
        return true;
    }

    public final boolean Cmi() {
        C67309Mlj mlj = this.A00;
        if (mlj == null) {
            return false;
        }
        mlj.A02();
        this.A00 = null;
        return true;
    }

    public final boolean EsC() {
        C67309Mlj mlj = this.A00;
        boolean z = false;
        if (mlj != null && mlj.A02) {
            z = true;
        }
        return !z;
    }

    public C66741Mbm(C74321Psx psx, 1bO r4, 2Dm r5) {
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = new C72642PDv(0, this, psx);
    }

    public final boolean AFZ(2EM r3, C2611948q r4) {
        AnonymousClass7TG.A1N(r3, r4);
        2Dr r1 = this.A03;
        if (!r1.A0H.A0F || !r1.A0C.A0V(r3, r4)) {
            return false;
        }
        return true;
    }

    public final boolean isLoading() {
        return CKO();
    }
}
