package X;

public final class J7I extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J7I(int i, int i2, int i3, int i4) {
        super(2);
        this.A00 = i4;
        if (i4 != 0) {
            this.A02 = i;
            this.A03 = i2;
            this.A01 = i3;
        } else {
            this.A03 = i;
            this.A01 = i2;
            this.A02 = i3;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            C56582I2m.A02(A0R, this.A02, this.A03, C51966G9m.A01(this.A01));
        } else {
            C56257HvR.A00(A0R, this.A03, C51966G9m.A01(this.A01), this.A02);
        }
        return C60340gF.A00;
    }
}
