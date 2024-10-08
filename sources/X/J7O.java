package X;

public final class J7O extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J7O(int i, String str, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A02 = i;
        this.A03 = str;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            C56594I2y.A02(A0R, this.A03, this.A02, C51966G9m.A01(this.A01));
        } else {
            HXV.A00(A0R, this.A03, C51966G9m.A01(this.A01), this.A02);
        }
        return C60340gF.A00;
    }
}
