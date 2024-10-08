package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5cF  reason: invalid class name and case insensitive filesystem */
public final class C288645cF extends C267794cD implements C268434dO {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r2 != Integer.MAX_VALUE) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        if (r0 != Integer.MAX_VALUE) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long A00(X.C268024cd r9) {
        /*
            r8 = this;
            float r1 = r8.A01
            r7 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = X.C289095d0.A01(r1, r7)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = 0
            if (r0 != 0) goto L_0x0059
            int r4 = r9.EJS(r1)
            if (r4 >= r5) goto L_0x0015
            r4 = 0
        L_0x0015:
            float r1 = r8.A00
            boolean r0 = X.C289095d0.A01(r1, r7)
            if (r0 != 0) goto L_0x0055
            int r3 = r9.EJS(r1)
            if (r3 >= r5) goto L_0x0024
            r3 = 0
        L_0x0024:
            float r1 = r8.A03
            boolean r0 = X.C289095d0.A01(r1, r7)
            if (r0 != 0) goto L_0x0053
            int r2 = r9.EJS(r1)
            if (r2 <= r4) goto L_0x0033
            r2 = r4
        L_0x0033:
            if (r2 >= r5) goto L_0x0036
            r2 = 0
        L_0x0036:
            if (r2 == r6) goto L_0x0053
        L_0x0038:
            float r1 = r8.A02
            boolean r0 = X.C289095d0.A01(r1, r7)
            if (r0 != 0) goto L_0x004b
            int r0 = r9.EJS(r1)
            if (r0 <= r3) goto L_0x0047
            r0 = r3
        L_0x0047:
            if (r0 >= r5) goto L_0x0050
            r0 = 0
        L_0x004a:
            r5 = r0
        L_0x004b:
            long r0 = X.AnonymousClass5SF.A04(r2, r4, r5, r3)
            return r0
        L_0x0050:
            if (r0 == r6) goto L_0x004b
            goto L_0x004a
        L_0x0053:
            r2 = 0
            goto L_0x0038
        L_0x0055:
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0024
        L_0x0059:
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C288645cF.A00(X.4cd):long");
    }

    public final int CmX(C268084cj r4, C268014cc r5, int i) {
        long A002 = A00(r5);
        if (Constraints.A08(A002)) {
            return Constraints.A00(A002);
        }
        return AnonymousClass5SF.A02(A002, r4.CmV(i));
    }

    public final int Cma(C268084cj r4, C268014cc r5, int i) {
        long A002 = A00(r5);
        if (Constraints.A09(A002)) {
            return Constraints.A01(A002);
        }
        return AnonymousClass5SF.A03(A002, r4.CmY(i));
    }

    public final C289145d6 Cny(C268074ci r8, C268004cb r9, long j) {
        int A032;
        int A012;
        int A022;
        int A002;
        long A042;
        long A003 = A00(r9);
        if (this.A04) {
            A042 = AnonymousClass5SF.A08(j, A003);
        } else {
            if (!C289095d0.A01(this.A03, Float.NaN)) {
                A032 = Constraints.A03(A003);
            } else {
                A032 = Constraints.A03(j);
                int A013 = Constraints.A01(A003);
                if (A032 > A013) {
                    A032 = A013;
                }
            }
            if (!C289095d0.A01(this.A01, Float.NaN)) {
                A012 = Constraints.A01(A003);
            } else {
                A012 = Constraints.A01(j);
                int A033 = Constraints.A03(A003);
                if (A012 < A033) {
                    A012 = A033;
                }
            }
            if (!C289095d0.A01(this.A02, Float.NaN)) {
                A022 = Constraints.A02(A003);
            } else {
                A022 = Constraints.A02(j);
                int A004 = Constraints.A00(A003);
                if (A022 > A004) {
                    A022 = A004;
                }
            }
            if (!C289095d0.A01(this.A00, Float.NaN)) {
                A002 = Constraints.A00(A003);
            } else {
                A002 = Constraints.A00(j);
                int A023 = Constraints.A02(A003);
                if (A002 < A023) {
                    A002 = A023;
                }
            }
            A042 = AnonymousClass5SF.A04(A032, A012, A022, A002);
        }
        C267974cY Cnz = r8.Cnz(A042);
        int i = Cnz.A01;
        int i2 = Cnz.A00;
        return r9.Cfi(0Yt.A0E(), new AnonymousClass9L6(Cnz, 14), i, i2);
    }

    public final int CoQ(C268084cj r4, C268014cc r5, int i) {
        long A002 = A00(r5);
        if (Constraints.A08(A002)) {
            return Constraints.A00(A002);
        }
        return AnonymousClass5SF.A02(A002, r4.CoO(i));
    }

    public final int CoT(C268084cj r4, C268014cc r5, int i) {
        long A002 = A00(r5);
        if (Constraints.A09(A002)) {
            return Constraints.A01(A002);
        }
        return AnonymousClass5SF.A03(A002, r4.CoR(i));
    }
}
