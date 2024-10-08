package X;

/* renamed from: X.GQt  reason: case insensitive filesystem */
public final class C52394GQt extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52394GQt(float f, float f2, float f3) {
        super(1);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass5Q4 r7 = (AnonymousClass5Q4) obj;
        0qQ.A0B(r7, 0);
        AnonymousClass5QA A0r = G9t.A0r(r7);
        AnonymousClass5VN A002 = C289285dL.A00(C51969G9p.A01(r7), 0);
        AnonymousClass5S8 r0 = new AnonymousClass5S8();
        float f = this.A00;
        float f2 = this.A01;
        float f3 = this.A02;
        try {
            A0r.EK4(A002, r0);
            r7.AQW();
            float A012 = C51969G9p.A01(r7);
            long j = AnonymousClass5RW.A07;
            float A003 = C51966G9m.A00(r7, f, A012 / 2.0f);
            long AmQ = r7.AmQ();
            if (f2 >= 0.0f) {
                A012 = -A012;
            }
            r7.AQV((C288195bW) null, C289635dw.A00, A003, 1.0f, 5, j, C289295dM.A07(AmQ, C289325dP.A00(C51966G9m.A00(r7, f2, A012), r7.F06(f3))));
            A0r.EIm();
            return C60340gF.A00;
        } catch (Throwable th) {
            A0r.EIm();
            throw th;
        }
    }
}
