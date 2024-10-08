package X;

/* renamed from: X.JAc  reason: case insensitive filesystem */
public final class C59198JAc extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59198JAc(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, int i4, boolean z) {
        super(2);
        this.A00 = i4;
        this.A06 = obj;
        this.A02 = i;
        this.A03 = i2;
        this.A08 = z;
        this.A07 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        if (i != 0) {
            int i2 = this.A03;
            C15050ULg uLg = (C15050ULg) this.A07;
            boolean z = this.A08;
            C55135Hcj.A00(A0R, uLg, (C62320sa) this.A05, (0sL) this.A06, (AnonymousClass62P) this.A04, i2, C51966G9m.A01(this.A01), this.A02, z);
        } else {
            int i3 = this.A02;
            int i4 = this.A03;
            boolean z2 = this.A08;
            INA ina = (INA) this.A04;
            C55131Hcf.A00(A0R, (C54672HOd) this.A05, ina, (C62320sa) this.A06, (C62320sa) this.A07, i3, i4, C51966G9m.A01(this.A01), z2);
        }
        return C60340gF.A00;
    }
}
