package X;

public final class IFV implements C59629JQx {
    public final /* synthetic */ C52693Gb5 A00;

    public final void DAB(long j) {
    }

    public final void onCancel() {
    }

    public IFV(C52693Gb5 gb5) {
        this.A00 = gb5;
    }

    public final void DAT(long j) {
        C56553I1h A002;
        AnonymousClass5V6 r0;
        C52693Gb5 gb5 = this.A00;
        gb5.A02 = C289295dM.A07(gb5.A02, j);
        C52754Gc7 gc7 = gb5.A03;
        if (gc7 != null && (A002 = C52754Gc7.A00(gc7)) != null) {
            C289295dM A0M = C51965G9l.A0M(C289295dM.A07(gb5.A01, gb5.A02));
            C284945Oz r02 = gb5.A0G;
            r02.Epw(A0M);
            int FHr = gb5.A08.FHr(A002.A01(C51975G9x.A09(r02), true));
            long A003 = C3026964x.A00(FHr, FHr);
            C284945Oz r6 = gb5.A0K;
            if (A003 != C51968G9o.A0G(r6)) {
                C52754Gc7 gc72 = gb5.A03;
                if ((gc72 == null || C51971G9r.A1W(gc72.A0B)) && (r0 = gb5.A05) != null) {
                    ((AnonymousClass5V5) r0).A00.performHapticFeedback(9);
                }
                gb5.A0C.invoke(new C285975Tl(C51966G9m.A0i(r6).A01, (C285965Tk) null, A003));
            }
        }
    }

    public final void DmN(long j) {
        C56553I1h A002;
        C268064ch r1;
        C52693Gb5 gb5 = this.A00;
        long A06 = gb5.A06(true);
        long A003 = C289325dP.A00(C289295dM.A01(A06), C289295dM.A02(A06) - 1.0f);
        C52754Gc7 gc7 = gb5.A03;
        if (gc7 != null && (A002 = C52754Gc7.A00(gc7)) != null) {
            C268064ch r4 = A002.A01;
            if (r4 != null && r4.COx() && (r1 = A002.A00) != null && r1.COx()) {
                A003 = r1.CgW(r4, A003);
            }
            C52693Gb5.A03(gb5, A003);
            gb5.A0H.Epw(HL1.Cursor);
            C52693Gb5.A05(gb5, false);
        }
    }

    public final void Dv9() {
        C52693Gb5.A02(this.A00);
    }

    public final void onStop() {
        C52693Gb5.A02(this.A00);
    }
}
