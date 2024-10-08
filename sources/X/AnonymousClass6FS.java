package X;

/* renamed from: X.6FS  reason: invalid class name */
public final class AnonymousClass6FS extends C267794cD implements AnonymousClass5VC, AnonymousClass5SO, C267824cH {
    public C56877IFy A00;
    public 0sP A01;
    public boolean A02;
    public final AnonymousClass6GH A03;

    public final void A0F() {
        C56877IFy iFy = this.A00;
        if (iFy != null) {
            iFy.A00();
        }
    }

    public final void AQM(AnonymousClass5Q4 r4) {
        if (!this.A02) {
            AnonymousClass6GH r2 = this.A03;
            r2.A01 = null;
            r2.A02 = r4;
            AnonymousClass6GW.A00(this, new AnonymousClass9M0(3, r2, this));
            if (r2.A01 != null) {
                this.A02 = true;
            } else {
                I2E.A02("DrawResult not defined, did you forget to call onDraw?");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        AnonymousClass64W r0 = this.A03.A01;
        0qQ.A0A(r0);
        r0.A00.invoke(r4);
    }

    public final long Bwg() {
        return C289155d7.A01(AnonymousClass5WH.A04(this, 128).A03);
    }

    public final void CNm() {
        C56877IFy iFy = this.A00;
        if (iFy != null) {
            iFy.A00();
        }
        this.A02 = false;
        this.A03.A01 = null;
        C288785cT.A00(this);
    }

    public AnonymousClass6FS(AnonymousClass6GH r3, 0sP r4) {
        this.A03 = r3;
        this.A01 = r4;
        r3.A00 = this;
        r3.A03 = new AnonymousClass9L8(this, 21);
    }

    public final void DPk() {
        CNm();
    }

    public final void DUu() {
        CNm();
    }

    public final C268024cd getDensity() {
        return AnonymousClass5WH.A02(this).A0C;
    }

    public final AnonymousClass5Q8 getLayoutDirection() {
        return AnonymousClass5WH.A02(this).A0D;
    }
}
