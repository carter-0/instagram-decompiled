package X;

/* renamed from: X.Ix6  reason: case insensitive filesystem */
public final class C58759Ix6 extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ C284945Oz A03;
    public final /* synthetic */ 0sP A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58759Ix6(C284945Oz r2, 0sP r3, float f, float f2, float f3) {
        super(1);
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A04 = r3;
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A042 = AnonymousClass7TE.A04(obj);
        float f = this.A02;
        float f2 = this.A01;
        float f3 = this.A00;
        float A012 = C229632nm.A01(((f - f2) / (f3 - f2)) + (A042 / ((float) C51971G9r.A0B(this.A03))));
        C51967G9n.A1Q(this.A04, ((1.0f - A012) * f2) + (A012 * f3));
        return C60340gF.A00;
    }
}
