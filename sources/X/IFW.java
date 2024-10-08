package X;

public final class IFW implements C59629JQx {
    public final /* synthetic */ C52693Gb5 A00;
    public final /* synthetic */ boolean A01;

    public final void DmN(long j) {
    }

    public final void onCancel() {
    }

    public IFW(C52693Gb5 gb5, boolean z) {
        this.A00 = gb5;
        this.A01 = z;
    }

    public final void DAB(long j) {
        HL1 hl1;
        C56553I1h A002;
        C268064ch r1;
        C52693Gb5 gb5 = this.A00;
        boolean z = this.A01;
        if (z) {
            hl1 = HL1.SelectionStart;
        } else {
            hl1 = HL1.SelectionEnd;
        }
        gb5.A0H.Epw(hl1);
        long A06 = gb5.A06(z);
        long A003 = C289325dP.A00(C289295dM.A01(A06), C289295dM.A02(A06) - 1.0f);
        C52754Gc7 gc7 = gb5.A03;
        if (gc7 != null && (A002 = C52754Gc7.A00(gc7)) != null) {
            C268064ch r4 = A002.A01;
            if (r4 != null && r4.COx() && (r1 = A002.A00) != null && r1.COx()) {
                A003 = r1.CgW(r4, A003);
            }
            C52693Gb5.A03(gb5, A003);
            gb5.A00 = -1;
            C52754Gc7 gc72 = gb5.A03;
            if (gc72 != null) {
                C51967G9n.A16(gc72.A0B, true);
            }
            C52693Gb5.A05(gb5, false);
        }
    }

    public final void DAT(long j) {
        C52693Gb5 gb5 = this.A00;
        long A07 = C289295dM.A07(gb5.A02, j);
        gb5.A02 = A07;
        C289295dM A0M = C51965G9l.A0M(C289295dM.A07(gb5.A01, A07));
        C284945Oz r1 = gb5.A0G;
        r1.Epw(A0M);
        C52693Gb5.A00(C56491HzN.A00, gb5, C51966G9m.A0i(gb5.A0K), C51975G9x.A09(r1), false, this.A01, true);
        C52693Gb5.A05(gb5, false);
    }

    public final void Dv9() {
        C52693Gb5 gb5 = this.A00;
        C52693Gb5.A02(gb5);
        C52693Gb5.A05(gb5, true);
    }

    public final void onStop() {
        C52693Gb5 gb5 = this.A00;
        C52693Gb5.A02(gb5);
        C52693Gb5.A05(gb5, true);
    }
}
