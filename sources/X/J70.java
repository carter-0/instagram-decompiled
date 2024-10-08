package X;

public final class J70 extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J70(boolean z, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = z;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                I6M.A05(this.A02, C51966G9m.A0R(obj, obj2), C51966G9m.A01(this.A01));
                break;
            case 1:
                HYZ.A00(this.A02, C51966G9m.A0R(obj, obj2), C51966G9m.A01(this.A01));
                break;
            default:
                C56637I5s.A04(this.A02, C51966G9m.A0R(obj, obj2), C51966G9m.A01(this.A01));
                break;
        }
        return C60340gF.A00;
    }
}
