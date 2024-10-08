package X;

public final class J7P extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J7P(String str, boolean z, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = str;
        this.A03 = z;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                C56637I5s.A00(A0R, this.A02, C51966G9m.A01(this.A01), this.A03);
                break;
            case 1:
                C56637I5s.A01(A0R, this.A02, C51966G9m.A01(this.A01), this.A03);
                break;
            case 2:
                C56621I4x.A02(A0R, this.A02, C51966G9m.A01(this.A01), this.A03);
                break;
            default:
                I62.A02(A0R, this.A02, C51966G9m.A01(this.A01), this.A03);
                break;
        }
        return C60340gF.A00;
    }
}
