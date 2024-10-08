package X;

/* renamed from: X.5th  reason: invalid class name and case insensitive filesystem */
public final class C298585th extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ C304786Ff A05;
    public final /* synthetic */ C298575tg A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C298585th(C304786Ff r2, C298575tg r3, float f, float f2, long j, long j2, long j3, boolean z) {
        super(1);
        this.A07 = z;
        this.A05 = r2;
        this.A03 = j;
        this.A00 = f;
        this.A01 = f2;
        this.A04 = j2;
        this.A02 = j3;
        this.A06 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C304786Ff r9;
        long j;
        long A002;
        C289645dx r11;
        C288195bW r10;
        float f;
        int i;
        long j2;
        AnonymousClass5Q4 r8 = (AnonymousClass5Q4) obj;
        r8.AQW();
        if (this.A07) {
            r9 = this.A05;
            long j3 = this.A03;
            r10 = null;
            j = 0;
            j2 = C298565tf.A00(r8.Bwg(), 0);
            f = 1.0f;
            r11 = C289635dw.A00;
            i = 3;
            A002 = j3;
        } else {
            long j4 = this.A03;
            long j5 = AnonymousClass6GS.A00;
            float intBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
            float f2 = this.A00;
            if (intBitsToFloat < f2) {
                float f3 = this.A01;
                long Bwg = r8.Bwg();
                float A022 = C288025bF.A02(Bwg) - f3;
                float A003 = C288025bF.A00(Bwg) - f3;
                C304786Ff r92 = this.A05;
                AnonymousClass5QD Ayw = r8.Ayw();
                AnonymousClass5QC r1 = (AnonymousClass5QC) Ayw;
                AnonymousClass5QB r2 = r1.A02.A02;
                long j6 = r2.A00;
                r2.A01.EJt();
                try {
                    r1.A01.AHx(0, f3, f3, A022, A003);
                    r8.AQu(r92, (C288195bW) null, C289635dw.A00, 1.0f, 3, 0, C298565tf.A00(r8.Bwg(), 0), j4);
                    return C60340gF.A00;
                } finally {
                    r2.A01.EIm();
                    Ayw.ElR(j6);
                }
            } else {
                r9 = this.A05;
                j = this.A04;
                long j7 = this.A02;
                A002 = C304816Fi.A00(f2, j4);
                r11 = this.A06;
                r10 = null;
                f = 1.0f;
                i = 3;
                j2 = j7;
            }
        }
        r8.AQu(r9, r10, r11, f, i, j, j2, A002);
        return C60340gF.A00;
    }
}
