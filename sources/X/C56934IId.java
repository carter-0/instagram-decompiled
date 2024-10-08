package X;

/* renamed from: X.IId  reason: case insensitive filesystem */
public final class C56934IId implements JQ9 {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final void A7Y(C338367hq r4, int i, int i2) {
        int i3 = this.A00;
        if (this.A02 == 1) {
            i = i2;
        }
        this.A00 = i3 + i;
    }

    public final int B5m() {
        return this.A00;
    }

    public final boolean FNI() {
        int i;
        if (this.A02 == 1) {
            i = this.A01;
        } else {
            i = this.A03;
        }
        if (this.A00 >= i) {
            return false;
        }
        return true;
    }

    public C56934IId(int i, int i2, int i3) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
    }
}
