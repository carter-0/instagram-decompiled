package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Gem  reason: case insensitive filesystem */
public final class C52912Gem extends C267794cD implements C268434dO {
    public float A00;
    public boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r7 == r5) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C289145d6 Cny(X.C268074ci r10, X.C268004cb r11, long r12) {
        /*
            r9 = this;
            boolean r0 = r9.A01
            r4 = 0
            if (r0 != 0) goto L_0x005b
            r1 = 1
            long r7 = r9.A01(r12, r1)
            r5 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A00(r12, r1)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A03(r12, r1)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A02(r12, r1)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A01(r12, r4)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A00(r12, r4)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A03(r12, r4)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A02(r12, r4)
        L_0x0044:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
        L_0x0048:
            X.4cY r3 = r10.Cnz(r12)
            int r2 = r3.A01
            int r1 = r3.A00
            r0 = 25
            X.J6G r0 = X.J6G.A00(r3, r0)
            X.5d6 r0 = X.C51969G9p.A0a(r11, r0, r2, r1)
            return r0
        L_0x005b:
            r3 = 1
            long r7 = r9.A00(r12, r3)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A01(r12, r3)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A02(r12, r3)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A03(r12, r3)
            r5 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A00(r12, r4)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A01(r12, r4)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A02(r12, r4)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r7 = r9.A03(r12, r4)
            goto L_0x0044
        L_0x009d:
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0048
            int r1 = X.C51965G9l.A04(r7)
            int r0 = X.C289005cr.A00(r7)
            long r12 = X.C288985co.A02(r1, r0)
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52912Gem.Cny(X.4ci, X.4cb, long):X.5d6");
    }

    private final long A00(long j, boolean z) {
        int A05;
        int A002 = Constraints.A00(j);
        if (A002 == Integer.MAX_VALUE || (A05 = AnonymousClass7TE.A05((float) A002, this.A00)) <= 0) {
            return 0;
        }
        long A003 = C289155d7.A00(A05, A002);
        if (!z || AnonymousClass5SF.A09(j, A003)) {
            return A003;
        }
        return 0;
    }

    private final long A01(long j, boolean z) {
        int round;
        int A012 = Constraints.A01(j);
        if (A012 == Integer.MAX_VALUE || (round = Math.round(((float) A012) / this.A00)) <= 0) {
            return 0;
        }
        long A002 = C289155d7.A00(A012, round);
        if (!z || AnonymousClass5SF.A09(j, A002)) {
            return A002;
        }
        return 0;
    }

    private final long A02(long j, boolean z) {
        int A02 = Constraints.A02(j);
        int A05 = AnonymousClass7TE.A05((float) A02, this.A00);
        if (A05 <= 0) {
            return 0;
        }
        long A002 = C289155d7.A00(A05, A02);
        if (!z || AnonymousClass5SF.A09(j, A002)) {
            return A002;
        }
        return 0;
    }

    private final long A03(long j, boolean z) {
        int A03 = Constraints.A03(j);
        int round = Math.round(((float) A03) / this.A00);
        if (round <= 0) {
            return 0;
        }
        long A002 = C289155d7.A00(A03, round);
        if (!z || AnonymousClass5SF.A09(j, A002)) {
            return A002;
        }
        return 0;
    }

    public final int CmX(C268084cj r3, C268014cc r4, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(((float) i) / this.A00);
        }
        return r3.CmV(i);
    }

    public final int Cma(C268084cj r3, C268014cc r4, int i) {
        if (i != Integer.MAX_VALUE) {
            return AnonymousClass7TE.A05((float) i, this.A00);
        }
        return r3.CmY(i);
    }

    public final int CoQ(C268084cj r3, C268014cc r4, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(((float) i) / this.A00);
        }
        return r3.CoO(i);
    }

    public final int CoT(C268084cj r3, C268014cc r4, int i) {
        if (i != Integer.MAX_VALUE) {
            return AnonymousClass7TE.A05((float) i, this.A00);
        }
        return r3.CoR(i);
    }
}
