package X;

/* renamed from: X.M0d  reason: case insensitive filesystem */
public final class C65811M0d implements X84 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65811M0d(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void CtD() {
        2YL r4;
        C318136oS A002;
        int i;
        int i2 = this.A00;
        C60437JlV jlV = (C60437JlV) this.A02;
        switch (i2) {
            case 0:
                jlV.A05.Dyo((M0U) this.A01);
                return;
            case 1:
                MVX mvx = jlV.A05;
                MVW mvw = (MVW) this.A01;
                C62247Kch kch = (C62247Kch) mvx;
                if (kch instanceof C62245Kcf) {
                    r4 = ((C62245Kcf) kch).A03;
                } else {
                    r4 = kch.A03;
                }
                if (r4 instanceof C62289KdN) {
                    C62584KiH BNP = mvw.BNP();
                    if (BNP == C62584KiH.A0D) {
                        A002 = C318116oQ.A00(r4);
                        i = 23;
                    } else if (BNP == C62584KiH.A0J) {
                        A002 = C318116oQ.A00(r4);
                        i = 24;
                    } else {
                        return;
                    }
                    C66184MGv.A02(r4, A002, i);
                    return;
                }
                AnonymousClass7TE.A1Z(new MGD(mvw, r4, (AnonymousClass4D7) null, 42), C318116oQ.A00(r4));
                return;
            default:
                jlV.A05.CuA();
                int indexOf = jlV.A07.indexOf((MVW) this.A01);
                if (indexOf >= 0) {
                    jlV.notifyItemChanged(C60437JlV.A00(jlV, indexOf));
                    return;
                }
                return;
        }
    }

    public final void D4i() {
    }

    public final void DBo() {
    }
}
