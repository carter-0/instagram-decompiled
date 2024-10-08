package X;

public final class J9F extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9F(Object obj, Object obj2, Object obj3, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A00 = i2;
        this.A04 = obj;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            boolean z = this.A06;
            boolean z2 = this.A05;
            0sP r3 = (0sP) this.A03;
            I6R.A04(A0R, (C62320sa) this.A02, r3, (AnonymousClass62P) this.A04, C51966G9m.A01(this.A01), z, z2);
        } else {
            C56651I6g.A05(A0R, (C54617HLa) this.A02, (C62320sa) this.A03, (0sP) this.A04, C51966G9m.A01(this.A01), this.A06, this.A05);
        }
        return C60340gF.A00;
    }
}
