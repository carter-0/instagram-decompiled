package X;

public abstract class PyY extends C11618SdM {
    public C283985Kk A00;
    public boolean A01 = false;
    public final C283985Kk A02;

    public final C283985Kk A00() {
        if (!this.A01) {
            C283985Kk r2 = this.A00;
            C284075Kw.A02.A00(r2.getClass()).ClW(r2);
            this.A01 = true;
        }
        return this.A00;
    }

    public final void A01() {
        if (this.A01) {
            C283985Kk r3 = (C283985Kk) this.A00.A03(AnonymousClass05K.A0N);
            C284075Kw.A02.A00(r3.getClass()).Co5(r3, this.A00);
            this.A00 = r3;
            this.A01 = false;
        }
    }

    public final /* bridge */ /* synthetic */ C283985Kk Avr() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        PyY pyY = (PyY) this.A02.A03(AnonymousClass05K.A0Y);
        pyY.A02(A00());
        return pyY;
    }

    public PyY(C283985Kk r2) {
        this.A02 = r2;
        this.A00 = (C283985Kk) r2.A03(AnonymousClass05K.A0N);
    }

    public final void A02(C283985Kk r4) {
        A01();
        C283985Kk r2 = this.A00;
        C284075Kw.A02.A00(r2.getClass()).Co5(r2, r4);
    }
}
