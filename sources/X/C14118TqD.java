package X;

/* renamed from: X.TqD  reason: case insensitive filesystem */
public final class C14118TqD implements 2UA {
    public AnonymousClass6NZ A00;
    public C245663dH A01;
    public boolean A02;
    public final 2UL A03;
    public final C70682Ty A04;

    public final void A00(C245663dH r2) {
        if (!0qQ.A0K(this.A01, r2)) {
            if (r2 == null) {
                this.A03.A0C();
            }
            this.A01 = r2;
            this.A04.requestLayout();
        }
    }

    public final void CsJ() {
        C245863db.A00(this.A04, this.A03);
    }

    public final void Dct(Long l) {
        C245863db.A02(this.A03, l);
    }

    public final void Dv5() {
        C245863db.A01(this.A03);
    }

    public final void setRenderTreeUpdateListener(C232612u4 r2) {
        this.A03.A0G(r2);
    }

    public C14118TqD(C70682Ty r3) {
        this.A04 = r3;
        this.A03 = new 2UL(r3, 1KZ.A01);
    }
}
