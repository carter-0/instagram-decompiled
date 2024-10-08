package X;

public final class LNo {
    public static LNo A01;
    public C64844Lj6 A00;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.LNo, java.lang.Object] */
    public static synchronized LNo A00() {
        LNo lNo;
        synchronized (LNo.class) {
            LNo lNo2 = A01;
            lNo = lNo2;
            if (lNo2 == null) {
                ? obj = new Object();
                A01 = obj;
                lNo = obj;
            }
        }
        return lNo;
    }

    public final void A01(MTO mto, 1P0 r5) {
        C64844Lj6 lj6 = this.A00;
        if (lj6 == null) {
            mto.onFinish();
            return;
        }
        C64496Lcx lcx = new C64496Lcx(this, mto);
        if (lj6.A05) {
            C64844Lj6.A00(lcx, lj6, r5);
            return;
        }
        lj6.A01 = lcx;
        lj6.A02 = r5;
    }
}
