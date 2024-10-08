package X;

/* renamed from: X.Ma3  reason: case insensitive filesystem */
public final class C66634Ma3 implements 27S {
    public final /* synthetic */ C66736Mbh A00;
    public final /* synthetic */ C66633Ma2 A01;
    public final /* synthetic */ C74566PxF A02;

    public C66634Ma3(C66736Mbh mbh, C66633Ma2 ma2, C74566PxF pxF) {
        this.A01 = ma2;
        this.A00 = mbh;
        this.A02 = pxF;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        2Cy r5 = (2Cy) obj;
        0qQ.A0B(r5, 0);
        C66633Ma2 ma2 = this.A01;
        if (ma2.A1J.getContext() == null || !r5.A00.equals(AnonymousClass0t1.A01.A01(ma2.A0p()))) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        2dZ r0;
        int A03 = AnonymousClass0fD.A03(-1583928908);
        int A032 = AnonymousClass0fD.A03(583385506);
        C66633Ma2 ma2 = this.A01;
        C66736Mbh mbh = this.A00;
        C74566PxF pxF = this.A02;
        boolean A0f = C66633Ma2.A0f(mbh, ma2, pxF);
        boolean A0g = C66633Ma2.A0g(mbh, ma2, pxF);
        pxF.EaE(2El.A0A(ma2.A0p()));
        mbh.A0B(A0f);
        if (2El.A0G(ma2.A0p())) {
            i = 0;
        } else {
            i = 1;
            if (A0g) {
                i = 2;
            }
        }
        ma2.A01 = i;
        ma2.A16((Integer) null);
        C67088Mi6 mi6 = ma2.A1M;
        if (mi6 != null) {
            C273624mt r2 = mi6.A00;
            C66934MfT mfT = r2.A02;
            if (!(mfT == null || !mfT.A04.isResumed() || (r0 = mfT.A00) == null)) {
                r0.A0T();
            }
            MeY meY = r2.A04;
            if (meY != null) {
                MeY.A01(meY);
            }
        }
        AnonymousClass0fD.A0A(-780800601, A032);
        AnonymousClass0fD.A0A(326072738, A03);
    }
}
