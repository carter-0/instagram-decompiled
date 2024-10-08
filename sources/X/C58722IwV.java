package X;

/* renamed from: X.IwV  reason: case insensitive filesystem */
public final class C58722IwV extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58722IwV(long j, boolean z) {
        super(1);
        this.A01 = z;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        AnonymousClass5Q3 A0T = C51968G9o.A0T(obj);
        float F06 = A0T.F06(5.0f);
        boolean z = this.A01;
        if (z) {
            f = 0.0f;
        } else {
            f = ((-A0T.F06(24.0f)) + F06) / 2.0f;
        }
        long A002 = C289325dP.A00(f, (A0T.F06(24.0f) - F06) / 2.0f);
        long j = this.A00;
        float f2 = F06 * 2.0f;
        long A003 = C288015bE.A00(f2, f2);
        C289635dw r8 = C289635dw.A00;
        A0T.AQR((C288195bW) null, r8, -10.0f, 200.0f, 1.0f, 3, j, A002, A003, true);
        float F062 = A0T.F06(2.0f);
        float A012 = C289295dM.A01(A002);
        if (!z) {
            A012 = A012 + F06 + (2.0f * F062);
        }
        A0T.AQV((C288195bW) null, r8, F062, 1.0f, 3, j, C289325dP.A00(A012, C289295dM.A02(A002) + f2 + F062));
        return C60340gF.A00;
    }
}
