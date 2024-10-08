package X;

/* renamed from: X.5cK  reason: invalid class name and case insensitive filesystem */
public final class C288695cK extends C267944cV implements C267954cW, AnonymousClass5VE, AnonymousClass5VH, AnonymousClass5VJ {
    public C288915ch A00;
    public final C288705cL A01;
    public final C288715cM A02;
    public final C288725cN A03;

    public final boolean A0G() {
        return false;
    }

    public final void A0J(C287605aT r5) {
        C56841IEo iEo;
        C288705cL r3 = this.A01;
        if (!0qQ.A0K(r3.A01, r5)) {
            C287605aT r2 = r3.A01;
            if (!(r2 == null || (iEo = r3.A00) == null)) {
                ((AnonymousClass5aS) r2).A00.FIA(new C56844IEr(iEo));
            }
            r3.A00 = null;
            r3.A01 = r5;
        }
    }

    public final void AC5(AnonymousClass5SW r5) {
        C288915ch r0 = this.A00;
        boolean z = false;
        if (r0 != null && r0.CTr()) {
            z = true;
        }
        r5.ENH(AnonymousClass5SZ.A06, Boolean.valueOf(z));
        r5.ENH(C290125en.A0I, new C290145ep((String) null, new AnonymousClass9L8(this, 4)));
    }

    public final /* synthetic */ boolean Bu0() {
        return false;
    }

    public final /* synthetic */ boolean BuF() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.0rm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.JL5, java.lang.Object] */
    public final void DGD(C288915ch r7) {
        C305476Ie r1;
        if (!0qQ.A0K(this.A00, r7)) {
            boolean CTr = r7.CTr();
            if (CTr) {
                C262224Cq A05 = A05();
                C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 0);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A05);
            }
            if (this.A08) {
                AnonymousClass5WH.A02(this).A0M();
            }
            C288705cL r4 = this.A01;
            C287605aT r3 = r4.A01;
            if (r3 != null) {
                C56841IEo iEo = null;
                C56841IEo iEo2 = r4.A00;
                if (CTr) {
                    if (iEo2 != null) {
                        C288705cL.A00(r4, new C56844IEr(iEo2), r3);
                        r4.A00 = null;
                    }
                    ? obj = new Object();
                    C288705cL.A00(r4, obj, r3);
                    iEo = obj;
                } else if (iEo2 != null) {
                    C288705cL.A00(r4, new C56844IEr(iEo2), r3);
                }
                r4.A00 = iEo;
            }
            C288725cN r22 = this.A03;
            if (CTr != r22.A00) {
                if (CTr) {
                    C288725cN.A00(r22);
                } else if (r22.A08) {
                    AnonymousClass5Qr A002 = GQ7.A00(r22, C305476Ie.A02);
                    if ((A002 instanceof C305476Ie) && (r1 = (C305476Ie) A002) != null) {
                        r1.A0H((C268064ch) null);
                    }
                }
                r22.A00 = CTr;
            }
            C288715cM r42 = this.A02;
            AnonymousClass6JE r32 = null;
            if (CTr) {
                ? obj2 = new Object();
                AnonymousClass6GW.A00(r42, new AnonymousClass9M0(0, obj2, r42));
                AnonymousClass6JG r0 = (AnonymousClass6JG) obj2.A00;
                if (r0 != null) {
                    r32 = r0.E2i();
                }
            } else {
                AnonymousClass6JF r02 = r42.A00;
                if (r02 != null) {
                    r02.release();
                }
            }
            r42.A00 = r32;
            r42.A01 = CTr;
            this.A00 = r7;
        }
    }

    public final void DIA(C268064ch r2) {
        this.A03.DIA(r2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4cD, X.5cL, X.4cE] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.4cD, X.5cM, X.4cE] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.4cD, X.5cN, X.4cE] */
    public C288695cK(C287605aT r2) {
        ? r0 = new C267794cD();
        r0.A01 = r2;
        A0H(r0);
        this.A01 = r0;
        ? r02 = new C267794cD();
        A0H(r02);
        this.A02 = r02;
        ? r03 = new C267794cD();
        A0H(r03);
        this.A03 = r03;
        A0H(new C267794cD());
    }
}
