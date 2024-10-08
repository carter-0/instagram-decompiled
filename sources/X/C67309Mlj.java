package X;

/* renamed from: X.Mlj  reason: case insensitive filesystem */
public final class C67309Mlj extends AnonymousClass7BP {
    public C67310Mlk A00;
    public final boolean A01;
    public final boolean A02;
    public final long A03;
    public final 2EM A04;
    public final C2611948q A05;
    public final String A06;
    public final /* synthetic */ 1bO A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r9 != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67309Mlj(X.2EM r3, X.C74340PtG r4, X.1bO r5, X.C2611948q r6, java.lang.String r7, boolean r8, boolean r9) {
        /*
            r2 = this;
            r2.A07 = r5
            r2.<init>(r4, r5)
            r2.A05 = r6
            r2.A02 = r9
            if (r8 != 0) goto L_0x000e
            r0 = 0
            if (r9 == 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r2.A01 = r0
            r2.A06 = r7
            r2.A04 = r3
            java.nio.charset.Charset r0 = X.1bO.A0w
            long r0 = r5.A01
            r2.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67309Mlj.<init>(X.2EM, X.PtG, X.1bO, X.48q, java.lang.String, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        if (X.1bO.A01(r0).booleanValue() != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if ("secondary_snapshot".equals(r5) != false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r12 = this;
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x0054
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x000d
            X.1bO r0 = r12.A07
            r0.A0B()
        L_0x000d:
            java.lang.String r5 = r12.A06
            X.1bO r0 = r12.A07
            java.nio.charset.Charset r1 = X.1bO.A0w
            long r2 = r0.A01
            r6 = -1
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = "secondary_snapshot"
            boolean r2 = r1.equals(r5)
            r1 = 0
            if (r2 == 0) goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            if (r1 == 0) goto L_0x004a
            java.lang.Boolean r1 = X.1bO.A01(r0)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0040
            X.43N r1 = r0.A0N
            X.2EM r2 = r12.A04
            X.48q r3 = r12.A05
            long r8 = r12.A03
            r4 = 0
            X.Mlk r1 = r1.A03(r2, r3, r4, r5, r6, r8)
        L_0x003e:
            r12.A00 = r1
        L_0x0040:
            X.Mlk r1 = r12.A00
            if (r1 == 0) goto L_0x008f
            java.util.List r0 = r1.A06
            r0.add(r12)
            return
        L_0x004a:
            X.43N r3 = r0.A0N
            X.2EM r2 = r12.A04
            r1 = 0
            X.Mlk r1 = r3.A04(r2, r1)
            goto L_0x003e
        L_0x0054:
            X.1bO r0 = r12.A07
            java.nio.charset.Charset r1 = X.1bO.A0w
            X.0eM r2 = r0.A0h
            X.2Dm r1 = X.C66580MXl.A0e(r2)
            X.2Dr r1 = (X.2Dr) r1
            X.2ED r1 = r1.A0C
            X.2EM r4 = r12.A04
            X.48q r5 = r12.A05
            boolean r1 = r1.A0V(r4, r5)
            if (r1 == 0) goto L_0x0040
            java.lang.Boolean r1 = X.1bO.A01(r0)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0040
            X.43N r3 = r0.A0N
            long r8 = r0.A01
            long r10 = r12.A03
            X.2Dm r1 = X.C66580MXl.A0e(r2)
            X.2Dr r1 = (X.2Dr) r1
            X.2ED r1 = r1.A0C
            java.lang.String r6 = r1.A0C(r4, r5)
            java.lang.String r7 = r12.A06
            X.Mlk r1 = r3.A03(r4, r5, r6, r7, r8, r10)
            goto L_0x003e
        L_0x008f:
            long r4 = r0.A01
            r2 = -1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x00a2
            java.lang.Boolean r1 = X.1bO.A01(r0)
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto L_0x00a3
        L_0x00a2:
            r2 = 1
        L_0x00a3:
            android.os.Handler r1 = r0.A0I
            X.PZC r0 = new X.PZC
            r0.<init>(r12, r2)
            r1.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67309Mlj.A00():void");
    }

    public final void A01() {
        C67310Mlk mlk = this.A00;
        if (mlk != null) {
            mlk.A06(this);
            this.A00 = null;
        }
    }
}
