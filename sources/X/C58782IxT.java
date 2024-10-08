package X;

/* renamed from: X.IxT  reason: case insensitive filesystem */
public final class C58782IxT extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ 0rk A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58782IxT(C62320sa r2, 0rk r3, float f, float f2, float f3, float f4) {
        super(1);
        this.A05 = r3;
        this.A01 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A04 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        0rk r2 = this.A05;
        int i = r2.A00 - 1;
        r2.A00 = i;
        if (i <= 1 && (i == 0 || this.A01 == this.A00 || this.A03 == this.A02)) {
            this.A04.invoke();
        }
        return C60340gF.A00;
    }
}
