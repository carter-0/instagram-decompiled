package X;

/* renamed from: X.5cS  reason: invalid class name and case insensitive filesystem */
public final class C288775cS extends C267794cD implements C267814cG {
    public final float A00;
    public final AnonymousClass5b4 A01 = C287705ad.A00(1.0f);
    public final C287965b7 A02;
    public final C287965b7 A03;
    public final C287615aU A04;

    public final void AQM(AnonymousClass5Q4 r10) {
        0qQ.A0B(r10, 0);
        float floatValue = ((Number) this.A01.A04.A05.getValue()).floatValue();
        long AmQ = r10.AmQ();
        AnonymousClass5QD Ayw = r10.Ayw();
        AnonymousClass5QC r1 = (AnonymousClass5QC) Ayw;
        AnonymousClass5QB r6 = r1.A02.A02;
        long j = r6.A00;
        r6.A01.EJt();
        try {
            r1.A01.EKJ(AmQ, floatValue, floatValue);
            r10.AQW();
        } finally {
            r6.A01.EIm();
            Ayw.ElR(j);
        }
    }

    public final /* synthetic */ void DPk() {
    }

    public C288775cS(C287615aU r4, float f, float f2, float f3) {
        this.A04 = r4;
        this.A00 = f;
        this.A02 = new C287965b7((Object) null, 0.5f, f2);
        this.A03 = new C287965b7((Object) null, 0.5f, f3);
    }

    public final void A0E() {
        C262224Cq A05 = A05();
        C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 15);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A05);
    }
}
