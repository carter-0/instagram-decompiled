package X;

/* renamed from: X.IGw  reason: case insensitive filesystem */
public final class C56901IGw implements JS3 {
    public final int A00;
    public final int A01;
    public final JS3 A02;

    public final int E1S(int i) {
        int E1S = this.A02.E1S(i);
        if (i >= 0 && i <= this.A00) {
            I5K.A01(E1S, this.A01, i);
        }
        return E1S;
    }

    public final int FHr(int i) {
        int FHr = this.A02.FHr(i);
        if (i >= 0 && i <= this.A01) {
            I5K.A02(FHr, this.A00, i);
        }
        return FHr;
    }

    public C56901IGw(JS3 js3, int i, int i2) {
        this.A02 = js3;
        this.A00 = i;
        this.A01 = i2;
    }
}
