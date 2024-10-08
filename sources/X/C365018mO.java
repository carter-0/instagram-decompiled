package X;

/* renamed from: X.8mO  reason: invalid class name and case insensitive filesystem */
public final class C365018mO implements C344747sM {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C365328mu A03;
    public final /* synthetic */ C364988mL A04;

    public final void CMa(C344567s4 r1) {
    }

    public C365018mO(C365328mu r1, C364988mL r2) {
        this.A04 = r2;
        this.A03 = r1;
    }

    public final void ACn(C345897uG r2) {
        if (!this.A00) {
            this.A00 = true;
        }
    }

    public final void detach() {
        if (this.A00) {
            this.A00 = false;
            if (this.A03 != null && this.A01) {
                this.A01 = false;
            }
        }
    }

    public final void release() {
        if (this.A03 != null && this.A02) {
            this.A02 = false;
        }
    }
}
