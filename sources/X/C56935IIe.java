package X;

/* renamed from: X.IIe  reason: case insensitive filesystem */
public final class C56935IIe implements JQ9 {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public final void A7Y(C338367hq r4, int i, int i2) {
        if (this.A01 == 0) {
            int i3 = this.A00;
            if (this.A03 == 1) {
                i = i2;
            }
            this.A00 = i3 + i;
        }
        if (!r4.CU5()) {
            int By5 = this.A01 + r4.By5();
            this.A01 = By5;
            if (By5 != this.A04) {
                return;
            }
        }
        this.A01 = 0;
    }

    public final int B5m() {
        return this.A00;
    }

    public final boolean FNI() {
        int i;
        if (this.A03 == 1) {
            i = this.A02;
        } else {
            i = this.A05;
        }
        if (this.A00 >= i) {
            return false;
        }
        return true;
    }

    public C56935IIe(int i, int i2, int i3, int i4) {
        this.A05 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = i4;
    }
}
