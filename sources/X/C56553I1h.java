package X;

/* renamed from: X.I1h  reason: case insensitive filesystem */
public final class C56553I1h {
    public C268064ch A00;
    public C268064ch A01 = null;
    public final C3022462f A02;

    public C56553I1h(C268064ch r2, C3022462f r3) {
        this.A02 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r3 > r1) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r2 > r1) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long A00(long r6) {
        /*
            r5 = this;
            X.4ch r2 = r5.A01
            if (r2 == 0) goto L_0x003a
            boolean r0 = r2.COx()
            if (r0 == 0) goto L_0x003a
            X.4ch r1 = r5.A00
            if (r1 == 0) goto L_0x003a
            r0 = 1
            X.5VN r4 = r1.CgV(r2, r0)
        L_0x0013:
            float r3 = X.C289295dM.A01(r6)
            float r1 = r4.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0023
            float r1 = r4.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            float r2 = X.C289295dM.A02(r6)
            float r1 = r4.A03
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            float r1 = r4.A00
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0035
        L_0x0034:
            r2 = r1
        L_0x0035:
            long r0 = X.C289325dP.A00(r3, r2)
            return r0
        L_0x003a:
            X.5VN r4 = X.AnonymousClass5VN.A04
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56553I1h.A00(long):long");
    }

    public final int A01(long j, boolean z) {
        if (z) {
            j = A00(j);
        }
        return this.A02.A03.A08(A02(j));
    }

    public final long A02(long j) {
        C268064ch r1;
        C268064ch r2 = this.A01;
        if (r2 == null || !r2.COx() || (r1 = this.A00) == null || !r1.COx()) {
            return j;
        }
        return r2.CgW(r1, j);
    }

    public final boolean A03(long j) {
        long A022 = A02(A00(j));
        C3022462f r3 = this.A02;
        int A05 = r3.A03.A05(C289295dM.A02(A022));
        float A012 = C289295dM.A01(A022);
        if (A012 < r3.A00(A05) || A012 > r3.A01(A05)) {
            return false;
        }
        return true;
    }
}
