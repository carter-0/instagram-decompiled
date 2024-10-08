package X;

/* renamed from: X.Io8  reason: case insensitive filesystem */
public final class C58204Io8 extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58204Io8(C46539Dgg dgg, 0sL r3, int i, int i2, boolean z) {
        super(0);
        this.A00 = i2;
        this.A04 = z;
        this.A02 = r3;
        this.A01 = i;
        this.A03 = dgg;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 == 0 ? !this.A04 : this.A04) {
            ((0sL) this.A02).invoke(Integer.valueOf(this.A01), this.A03);
        }
        return C60340gF.A00;
    }
}
