package X;

/* renamed from: X.IZz  reason: case insensitive filesystem */
public final class C57394IZz implements C332277Ui {
    public final int A00;
    public final Object A01;

    public C57394IZz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D9V() {
        switch (this.A00) {
            case 0:
                ((C53040GhW) ((C54154H0y) this.A01).A06.getValue()).A06(false);
                return;
            case 1:
                C55612HkX hkX = (C55612HkX) this.A01;
                C52302GMs.A00(hkX.A00, hkX.A01);
                return;
            case 2:
                C54115Gzk gzk = (C54115Gzk) this.A01;
                JOF jof = gzk.A00;
                if (jof != null) {
                    jof.Cyi(gzk.A03, gzk.A01);
                    return;
                }
                return;
            case 3:
                H0H h0h = (H0H) this.A01;
                JQH jqh = h0h.A04;
                if (jqh != null) {
                    C54696HPb hPb = h0h.A03;
                    if (hPb != null) {
                        jqh.Cyh(hPb);
                        return;
                    } else {
                        0qQ.A0F("dismissReason");
                        throw AnonymousClass00P.createAndThrow();
                    }
                } else {
                    return;
                }
            case 4:
                ((C52031GCd) this.A01).A0A.Ctu();
                return;
            case 5:
                C61358K4a.A01((C61358K4a) this.A01);
                return;
            case 6:
                ((C55818Hny) this.A01).A02.invoke();
                return;
            default:
                ((C57382IZn) this.A01).Cyc();
                return;
        }
    }

    public final void D9a() {
    }
}
