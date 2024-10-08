package X;

public final class GRL extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C270284gU A02;
    public final /* synthetic */ C270284gU A03;
    public final /* synthetic */ C270284gU A04;
    public final /* synthetic */ C270284gU A05;
    public final /* synthetic */ C298575tg A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GRL(C270284gU r2, C270284gU r3, C270284gU r4, C270284gU r5, C298575tg r6, float f, long j) {
        super(1);
        this.A00 = f;
        this.A01 = j;
        this.A06 = r6;
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A02 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5Q3 A0T = C51968G9o.A0T(obj);
        C270284gU r1 = this.A03;
        C7227Pzw pzw = C52378GQd.A04;
        float A032 = C51971G9r.A03(this.A04);
        C270284gU r12 = this.A05;
        float A002 = AnonymousClass7TE.A00(A032, C51971G9r.A03(r12));
        float A033 = C51971G9r.A03(r12);
        float f = this.A00;
        C52378GQd.A02(A0T, this.A06, A033 + (((((float) AnonymousClass7TE.A0M(r1.getValue())) * 216.0f) % 360.0f) - 0.049804688f) + C51971G9r.A03(this.A02) + (((f / (40.0f / 2.0f)) * 57.29578f) / 2.0f), Math.max(A002, 0.1f), this.A01);
        return C60340gF.A00;
    }
}
