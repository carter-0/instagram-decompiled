package X;

public final class IK5 implements AnonymousClass2WK {
    public final C244843bq A00;

    public IK5(C244843bq r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final 2WL Cfk(2WI r12, long j) {
        C244843bq r0;
        0qQ.A0B(r12, 0);
        long A002 = C244913bx.A00.A00(0, C245083cI.A00((int) (j >>> 32)).A02(j), 0, C245083cI.A00((int) j).A01(j));
        C244843bq r5 = this.A00;
        2T4 r4 = (2T4) r12.A01;
        2Tf r3 = null;
        if (r4 != null) {
            r0 = r4.A0H;
        } else {
            r0 = null;
        }
        if (!r5.equals(r0) || A002 != r4.A0D) {
            AnonymousClass3XH r02 = r5.A02.A03;
            if (r02 != null) {
                int i = r02.A00;
                if (r4 != null) {
                    r3 = r4.A0F;
                }
                r4 = C244923by.A00(r3, r4, r5, (C243063Xg) null, -1, i, A002);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        r4.A01();
        int max = Math.max(C245073cH.A03(j), r4.A0C);
        int max2 = Math.max(C245073cH.A02(j), r4.A09);
        r4.A01();
        return new 2WL(r4, max, max2);
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }
}
