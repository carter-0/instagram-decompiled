package X;

public final class J8S extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8S(Object obj, Object obj2, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = z;
        this.A05 = z2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            C56347Hwy.A00(A0R, (0sP) this.A02, (AnonymousClass62P) this.A03, C51966G9m.A01(this.A01), this.A04, this.A05);
        } else {
            boolean z = this.A05;
            boolean z2 = this.A04;
            I6R.A05(A0R, (C62320sa) this.A03, (0sL) this.A02, C51966G9m.A01(this.A01), z, z2);
        }
        return C60340gF.A00;
    }
}
