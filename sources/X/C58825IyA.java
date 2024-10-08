package X;

/* renamed from: X.IyA  reason: case insensitive filesystem */
public final class C58825IyA extends 0Yg implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ float A05;
    public final /* synthetic */ long A06;
    public final /* synthetic */ C284945Oz A07;
    public final /* synthetic */ C304786Ff A08;
    public final /* synthetic */ C53303Glp A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58825IyA(C284945Oz r2, C304786Ff r3, C53303Glp glp, float f, float f2, float f3, float f4, float f5, float f6, long j) {
        super(1);
        this.A06 = j;
        this.A01 = f;
        this.A05 = f2;
        this.A09 = glp;
        this.A00 = f3;
        this.A04 = f4;
        this.A02 = f5;
        this.A03 = f6;
        this.A08 = r3;
        this.A07 = r2;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        int i;
        float f2;
        AnonymousClass5Q3 A0T = C51968G9o.A0T(obj);
        long j = this.A06;
        float f3 = this.A01;
        float f4 = this.A05;
        C53303Glp glp = this.A09;
        float f5 = this.A00;
        float f6 = this.A04;
        float f7 = this.A02;
        float f8 = this.A03;
        C304786Ff r15 = this.A08;
        C284945Oz r39 = this.A07;
        AnonymousClass5QA A0r = G9t.A0r(A0T);
        try {
            A0r.EK4(C289285dL.A01(0, A0T.Bwg()), new AnonymousClass5S8());
            long A0H = C51968G9o.A0H(A0T);
            C289635dw r29 = C289635dw.A00;
            A0T.AQs((C288195bW) null, r29, 1.0f - f3, 3, j, 0, A0H);
            float f9 = 1.0f - f4;
            int i2 = glp.A05;
            loop0:
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = glp.A06;
                for (int i5 = 0; i5 < i4; i5++) {
                    C53276GlO glO = glp.A07[i3][i5];
                    if (glO == null) {
                        break loop0;
                    }
                    int i6 = 1;
                    if (glO.A02) {
                        i6 = 5;
                    }
                    boolean A1W = C51971G9r.A1W(r39);
                    boolean z = glO.A02;
                    float f10 = f5;
                    if (!z && f5 > 1.0f) {
                        f10 = 0.0f;
                    } else if (f5 > 1.0f) {
                        if (!A1W) {
                            f10 = ((f5 - 1.0f) * 0.8f) + 0.2f;
                        } else {
                            f10 = f5 - 1.0f;
                        }
                    } else if (z) {
                        f10 = (f5 * 1.0f) / 5.0f;
                    }
                    float f11 = glO.A00;
                    float f12 = glp.A02;
                    float f13 = ((float) i6) * 2.0f * f12;
                    boolean z2 = glO.A03;
                    if (z2) {
                        f = f12 * 0.1f;
                    } else {
                        f = 0.0f;
                    }
                    float f14 = f11 - f;
                    int i7 = (int) (f13 / ((2.0f * f14) + f));
                    float f15 = (f10 * f13) - f;
                    float f16 = 0.0f;
                    if (f15 < 0.0f) {
                        i = 0;
                    } else {
                        i = (int) (f15 / f14);
                    }
                    if (i <= (i7 * 2) - 1) {
                        float f17 = f15 % f14;
                        if (i % 2 == 0) {
                            f16 = f + f17;
                        } else {
                            f16 = f11 - f17;
                        }
                    }
                    if (z) {
                        if (f10 > 0.05f) {
                            f16 = C229632nm.A02(f16, f12 * 0.1f, f11);
                        }
                        f2 = (f6 - f16) * f7;
                    } else {
                        f2 = (f6 / 2.0f) * f8;
                    }
                    if (z2) {
                        A0T.AQm(r15, (C288195bW) null, C55107HcG.A00(f16 + f2, glO.A01), r29, f9, 1);
                    } else {
                        A0T.AQU(r15, (C288195bW) null, r29, f2 + f16, f9, 1, glO.A01);
                    }
                }
            }
            A0r.EIm();
            return C60340gF.A00;
        } catch (Throwable th) {
            A0r.EIm();
            throw th;
        }
    }
}
