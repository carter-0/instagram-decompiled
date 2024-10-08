package X;

/* renamed from: X.Iwp  reason: case insensitive filesystem */
public final class C58742Iwp extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C55842HoP A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58742Iwp(C55842HoP hoP, int i, int i2, int i3) {
        super(1);
        this.A03 = hoP;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        AnonymousClass5Q3 A0T = C51968G9o.A0T(obj);
        C55842HoP hoP = this.A03;
        float A002 = C51975G9x.A00(hoP.A02);
        float A003 = C51975G9x.A00(hoP.A05);
        if (!AnonymousClass7TF.A1Q((A002 > 0.0f ? 1 : (A002 == 0.0f ? 0 : -1)))) {
            int i = this.A00;
            int i2 = 0;
            do {
                double d = ((((double) i2) * 3.141592653589793d) / 3.0d) + 0.5235987755982988d;
                long A08 = C51965G9l.A08((long) i);
                float F06 = A0T.F06(C51975G9x.A00(hoP.A03));
                long Bwg = A0T.Bwg();
                AnonymousClass5Q3 r20 = A0T;
                r20.AQV((C288195bW) null, C289635dw.A00, F06, 1.0f, 3, A08, C289325dP.A00((C288025bF.A02(Bwg) / 2.0f) + (A0T.F06(A002) * ((float) Math.cos(d))), (C288025bF.A00(Bwg) / 2.0f) + (A0T.F06(A002) * ((float) Math.sin(d)))));
                i2++;
            } while (i2 < 6);
        }
        if (A003 != 0.0f) {
            int i3 = this.A01;
            int i4 = this.A02;
            int i5 = 0;
            do {
                double d2 = ((((double) i5) * 3.141592653589793d) / 3.0d) + 0.8726646259971648d;
                if (i5 % 2 == 0) {
                    j = (long) i3;
                } else {
                    j = (long) i4;
                }
                long A082 = C51965G9l.A08(j);
                float F062 = A0T.F06(C51975G9x.A00(hoP.A06));
                long Bwg2 = A0T.Bwg();
                AnonymousClass5Q3 r19 = A0T;
                r19.AQV((C288195bW) null, C289635dw.A00, F062, 1.0f, 3, A082, C289325dP.A00((C288025bF.A02(Bwg2) / 2.0f) - (A0T.F06(A003) * ((float) Math.cos(d2))), (C288025bF.A00(Bwg2) / 2.0f) - (A0T.F06(A003) * ((float) Math.sin(d2)))));
                i5++;
            } while (i5 < 6);
        }
        return C60340gF.A00;
    }
}
