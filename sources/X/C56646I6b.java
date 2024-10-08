package X;

/* renamed from: X.I6b  reason: case insensitive filesystem */
public abstract class C56646I6b {
    public static final int A01(AnonymousClass5RG r4, C3022262d r5, long j) {
        float f;
        if (r4 != null) {
            f = r4.BAO();
        } else {
            f = 0.0f;
        }
        float A02 = C289295dM.A02(j);
        int A05 = r5.A05(A02);
        if (A02 >= r5.A04(A05) - f && A02 <= r5.A03(A05) + f) {
            float A01 = C289295dM.A01(j);
            if (A01 < (-f) || A01 > r5.A01 + f) {
                return -1;
            }
            return A05;
        }
        return -1;
    }

    public static final boolean A06(C3022462f r4, int i) {
        C52430GSi A09;
        C3022262d r3 = r4.A03;
        int A06 = r3.A06(i);
        if (i == r4.A03(A06) || i == r3.A07(A06, false)) {
            A09 = r4.A09(i);
        } else {
            A09 = r4.A08(i);
            i--;
        }
        if (A09 == r4.A08(i)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r1 = r0.EKS(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C52754Gc7 r5, X.AnonymousClass5RG r6, long r7) {
        /*
            X.I1h r0 = X.C52754Gc7.A00(r5)
            if (r0 == 0) goto L_0x0033
            X.62f r0 = r0.A02
            X.62d r4 = r0.A03
            if (r4 == 0) goto L_0x0033
            X.4ch r0 = r5.A02()
            r3 = -1
            if (r0 == 0) goto L_0x0032
            long r1 = r0.EKS(r7)
            int r0 = A01(r6, r4, r1)
            if (r0 == r3) goto L_0x0032
            float r3 = r4.A04(r0)
            float r0 = r4.A03(r0)
            float r3 = r3 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r0
            r0 = 1
            long r0 = X.C289295dM.A03(r3, r0, r1)
            int r3 = r4.A08(r0)
        L_0x0032:
            return r3
        L_0x0033:
            r3 = -1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56646I6b.A00(X.Gc7, X.5RG, long):int");
    }

    public static final long A02(C52754Gc7 gc7, AnonymousClass5VN r7, AnonymousClass5VN r8, C59647JRp jRp, int i) {
        long A03 = A03(gc7, r7, jRp, i);
        if (!C285965Tk.A03(A03)) {
            long A032 = A03(gc7, r8, jRp, i);
            if (!C285965Tk.A03(A032)) {
                int A04 = C51965G9l.A04(A03);
                int min = Math.min(A04, A04);
                int A02 = C51968G9o.A02(A032);
                return C3026964x.A00(min, Math.max(A02, A02));
            }
        }
        return C285965Tk.A01;
    }

    public static final long A03(C52754Gc7 gc7, AnonymousClass5VN r5, C59647JRp jRp, int i) {
        C3022262d r3;
        C56553I1h A00 = C52754Gc7.A00(gc7);
        if (A00 != null) {
            r3 = A00.A02.A03;
        } else {
            r3 = null;
        }
        C268064ch A02 = gc7.A02();
        if (r3 == null || A02 == null) {
            return C285965Tk.A01;
        }
        return r3.A09(r5.A03(A02.EKS(0)), jRp, i);
    }

    public static final boolean A04(int i) {
        int type = Character.getType(i);
        if (type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21) {
            return true;
        }
        return false;
    }

    public static final boolean A05(int i) {
        int type;
        if ((!Character.isWhitespace(i) && i != 160) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) {
            return false;
        }
        return true;
    }
}
