package X;

/* renamed from: X.J6c  reason: case insensitive filesystem */
public final class C59095J6c extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ AnonymousClass5b4 A06;
    public final /* synthetic */ C284945Oz A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59095J6c(AnonymousClass5b4 r2, C284945Oz r3, float f, float f2, float f3, float f4, float f5, long j) {
        super(1);
        this.A06 = r2;
        this.A05 = j;
        this.A00 = f;
        this.A02 = f2;
        this.A03 = f3;
        this.A01 = f4;
        this.A04 = f5;
        this.A07 = r3;
    }

    public static float A00(float f, int i) {
        return (float) ((Number) C229632nm.A09(Double.valueOf(((double) f) - (((double) Math.abs(i)) * 0.2d)), new C58024IkH(0.0d))).doubleValue();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A002;
        AnonymousClass5Q3 A0T = C51968G9o.A0T(obj);
        C54701HPg hPg = (C54701HPg) this.A07.getValue();
        if (0qQ.A0K(hPg, C54444HDy.A00)) {
            float A003 = C51975G9x.A00(this.A06);
            long j = this.A05;
            float f = this.A00;
            float f2 = this.A02;
            float f3 = this.A03;
            int i = 0;
            do {
                int i2 = i - 2;
                float A004 = A00(A003, i2);
                A0T.AQV((C288195bW) null, C289635dw.A00, C56340Hwr.A00(A004) * f, 1.0f, 3, j, C289325dP.A00(C289295dM.A01(A0T.AmQ()) + (((float) i2) * f2), f3 - (A004 * f3)));
                i++;
            } while (i < 5);
        } else {
            if (0qQ.A0K(hPg, HE1.A00)) {
                A002 = C51975G9x.A00(this.A06);
            } else if (0qQ.A0K(hPg, HE2.A00)) {
                A002 = 2.0f - C51975G9x.A00(this.A06);
            } else if (0qQ.A0K(hPg, C54445HDz.A00)) {
                float A005 = C51975G9x.A00(this.A06);
                long j2 = this.A05;
                float f4 = this.A00;
                float f5 = this.A02;
                float f6 = this.A03;
                int i3 = 0;
                do {
                    int i4 = i3 - 2;
                    float A006 = A00(A005, i4);
                    A0T.AQV((C288195bW) null, C289635dw.A00, C56340Hwr.A00(1.0f - A006) * f4, 1.0f, 3, j2, C289325dP.A00(C289295dM.A01(A0T.AmQ()) + (((float) i4) * f5), -(A006 * f6)));
                    i3++;
                } while (i3 < 5);
            } else if (hPg instanceof KXJ) {
                if (((KXJ) hPg).A01) {
                    long j3 = this.A05;
                    float f7 = this.A00;
                    float f8 = this.A02;
                    int i5 = 0;
                    do {
                        A0T.AQV((C288195bW) null, C289635dw.A00, f7, 1.0f, 3, j3, C289325dP.A00(C289295dM.A01(A0T.AmQ()) + (((float) (i5 - 2)) * f8), 0.0f));
                        i5++;
                    } while (i5 < 5);
                }
            } else if (!0qQ.A0K(hPg, HE0.A00)) {
                throw AnonymousClass7TE.A1K();
            }
            long j4 = this.A05;
            float f9 = this.A01;
            float f10 = this.A00;
            float f11 = this.A04;
            float f12 = this.A02;
            int i6 = 0;
            do {
                float cos = (float) ((Math.cos(((double) (((float) C229632nm.A00(((double) A002) - (((double) i6) * 0.25d), 0.0d, 1.0d)) * 2.0f)) * 3.141592653589793d) * -0.5d) + 0.5d);
                float f13 = ((float) (i6 - 2)) * f12;
                float f14 = -(cos * f9);
                long A007 = C289325dP.A00(C289295dM.A01(A0T.AmQ()) + f13, f14);
                C289635dw r17 = C289635dw.A00;
                A0T.AQV((C288195bW) null, r17, f10 * (1.0f - cos), 1.0f, 3, j4, A007);
                A0T.AQn((C288195bW) null, C55107HcG.A00(cos * f11, C289325dP.A00(C289295dM.A01(A0T.AmQ()) + f13, f14)), r17, 1.0f, 3, j4);
                i6++;
            } while (i6 < 5);
        }
        return C60340gF.A00;
    }
}
