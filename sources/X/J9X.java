package X;

public final class J9X extends 0Yg implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ C284945Oz A04;
    public final /* synthetic */ C284945Oz A05;
    public final /* synthetic */ C284945Oz A06;
    public final /* synthetic */ AnonymousClass6FR A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9X(C284945Oz r2, C284945Oz r3, C284945Oz r4, AnonymousClass6FR r5, float f, float f2, float f3, float f4) {
        super(2);
        this.A07 = r5;
        this.A03 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A02 = f4;
        this.A05 = r2;
        this.A04 = r3;
        this.A06 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        GPU gpu = (GPU) obj;
        long j = ((C289295dM) obj2).A00;
        0qQ.A0B(gpu, 0);
        gpu.A01();
        C284945Oz r5 = this.A05;
        C51967G9n.A14(r5, C51971G9r.A02(r5) + C289295dM.A02(j));
        float A022 = C51971G9r.A02(r5);
        AnonymousClass6FR r4 = this.A07;
        C51967G9n.A14(r5, C229632nm.A02(A022, r4.F06(this.A03), this.A01));
        C284945Oz r2 = this.A04;
        float A023 = C51971G9r.A02(r5);
        float f = this.A00;
        C51967G9n.A14(r2, A023 - r4.F06(f));
        C51967G9n.A14(this.A06, C51966G9m.A00(r4, this.A02 + f, C51971G9r.A02(r5)));
        return C60340gF.A00;
    }
}
