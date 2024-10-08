package X;

/* renamed from: X.JXj  reason: case insensitive filesystem */
public final class C59768JXj implements Runnable {
    public final /* synthetic */ C59767JXi A00;

    public C59768JXj(C59767JXi jXi) {
        this.A00 = jXi;
    }

    public final void run() {
        C66567MWv mWv;
        int A01;
        Integer num;
        C59767JXi jXi = this.A00;
        if (jXi.A0H && (mWv = jXi.A0B) != null) {
            int A012 = C59767JXi.A01(jXi, mWv);
            if (A012 >= jXi.A01 && !jXi.A0G) {
                C66567MWv mWv2 = jXi.A0B;
                if (mWv2 != null) {
                    mWv2.seekTo(jXi.A02);
                }
            } else if (A012 != -1) {
                int i = A012;
                AnonymousClass8Q3 r0 = jXi.A0A;
                AnonymousClass8Q2 r6 = jXi.A0X;
                if (r0 == r6) {
                    int BrU = jXi.A0V.BrU(jXi.A05);
                    i = 0mi.A03((A012 + BrU) - jXi.A02, BrU, jXi.A03);
                }
                int A002 = C59767JXi.A00(jXi, i);
                if (jXi.A0A == r6 && ((num = r6.A02) == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N)) {
                    A01 = 1;
                } else {
                    C353498Hw r2 = jXi.A0U.A00;
                    A01 = DbT.A01(r2.A1o.A07, JTO.A08(r2.A0J));
                }
                C59767JXi.A08(jXi, i, A002, A01);
                AnonymousClass8Q3 r1 = jXi.A0A;
                if (r1 != r6 || !jXi.A0G) {
                    r1.Dxd(A012, A002, JTO.A08(jXi.A0D));
                }
            }
            jXi.A0N.postOnAnimation(jXi.A0g);
        }
    }
}
