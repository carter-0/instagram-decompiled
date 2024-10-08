package X;

public final class J9L extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9L(AnonymousClass5Z4 r2, String str, int i, int i2, int i3, long j, boolean z) {
        super(2);
        this.A05 = str;
        this.A06 = z;
        this.A03 = j;
        this.A02 = i;
        this.A04 = r2;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        String str = this.A05;
        boolean z = this.A06;
        long j = this.A03;
        HT0.A00(A0R, (AnonymousClass5Z4) this.A04, str, this.A02, C51966G9m.A01(this.A00), this.A01, j, z);
        return C60340gF.A00;
    }
}
