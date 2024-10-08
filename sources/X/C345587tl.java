package X;

/* renamed from: X.7tl  reason: invalid class name and case insensitive filesystem */
public final class C345587tl extends C345597tm {
    public C70666OFn A00;
    public C340607lX A01;
    public C340547lR A02;
    public final C41789B0s A03;
    public final C340507lN A04 = new AVC(this);

    public final void A9Z(A3C a3c) {
    }

    public final boolean CY8() {
        return false;
    }

    public final boolean Ce8() {
        return false;
    }

    public final void EUU(boolean z) {
    }

    public final void Eew(boolean z) {
    }

    public final void Efh(int i) {
    }

    public final void Efj(boolean z) {
        this.A00.A03 = false;
    }

    public final void Ega(int i) {
    }

    public final void ElP(boolean z) {
    }

    public final void EqJ(int i) {
    }

    public final void EzY(C364018kj r1, C363988kg r2) {
    }

    public final void enable(boolean z) {
    }

    public final C340607lX Ajm() {
        return this.A01;
    }

    public final C343717qg BJt() {
        return C345607tn.A00;
    }

    public final boolean Ccx() {
        return this.A01.Ccx();
    }

    public final void ElS(C340147km r3) {
        this.A03.Alc().ESb(C340437lG.A02, r3);
    }

    public final void EzJ() {
        this.A02.A0B(new C382529dq(this));
    }

    public final void setInitialCameraFacing(int i) {
        C340607lX r1 = this.A01;
        int i2 = 1;
        if (i == 0) {
            i2 = 0;
        } else if (i != 1) {
            throw new RuntimeException(002.A0O("Could not convert camera facing to optic: ", i));
        }
        if (r1.CJf(i2)) {
            this.A00 = i;
            B30 Alc = this.A03.Alc();
            C342927pO r12 = C340437lG.A00;
            int i3 = 1;
            if (i == 0) {
                i3 = 0;
            }
            Alc.ESb(r12, Integer.valueOf(i3));
        }
    }

    public C345587tl(C41789B0s b0s, C343837qt r3) {
        super(r3);
        this.A03 = b0s;
    }
}
