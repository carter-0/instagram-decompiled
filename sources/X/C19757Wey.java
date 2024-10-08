package X;

/* renamed from: X.Wey  reason: case insensitive filesystem */
public final class C19757Wey implements X5F {
    public final /* synthetic */ C15658UgO A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ C277014uI A03;

    public C19757Wey(C15658UgO ugO, C307786Rm r2, C276544tV r3, C277014uI r4) {
        this.A00 = ugO;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final void DbS(float f, float f2, float f3, float f4) {
        C276544tV r4 = this.A02;
        float A022 = r4.A02(36, 0.0f);
        float A04 = A022 * ((float) JTO.A04(f, A022));
        float A023 = r4.A02(36, 0.0f);
        float A042 = A023 * ((float) JTO.A04(f2, A023));
        C277014uI r3 = this.A03;
        C308276Tl r2 = new C308276Tl();
        r2.A01(Q0A.A00((double) A04));
        r2.A02(Q0A.A00((double) A042));
        C307886Rw.A03(this.A01, r4, r2.A00(), r3);
    }
}
