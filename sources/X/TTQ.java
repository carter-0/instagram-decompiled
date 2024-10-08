package X;

public final class TTQ extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTQ(Object obj, String str, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        Object obj = this.A02;
        switch (i) {
            case 2:
                E26.A04((E26) obj, this.A03, this.A01);
                break;
            case 3:
                TTQ.super.A0m(this.A03, this.A01);
                break;
            default:
                ((0sL) obj).invoke(Integer.valueOf(this.A01), this.A03);
                break;
        }
        return C60340gF.A00;
    }
}
