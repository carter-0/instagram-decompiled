package X;

public final class J7S extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J7S(String str, String str2, int i, int i2) {
        super(2);
        this.A00 = i2;
        switch (i2) {
            case 0:
            case 2:
                this.A03 = str;
                this.A02 = str2;
                break;
            default:
                this.A02 = str;
                this.A03 = str2;
                break;
        }
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                C56576I2g.A02(this.A03, this.A02, A0R, C51966G9m.A01(this.A01));
                break;
            case 1:
                C56289Hw2.A01(this.A02, this.A03, A0R, C51966G9m.A01(this.A01));
                break;
            case 2:
                C55064HbZ.A00(this.A03, this.A02, A0R, C51966G9m.A01(this.A01));
                break;
            default:
                I7V.A0J(this.A02, this.A03, A0R, C51966G9m.A01(this.A01));
                break;
        }
        return C60340gF.A00;
    }
}
