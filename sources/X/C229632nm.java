package X;

import java.util.NoSuchElementException;

/* renamed from: X.2nm  reason: invalid class name and case insensitive filesystem */
public abstract class C229632nm extends C229642nn {
    public static final float A01(float f) {
        return A02(f, 0.0f, 1.0f);
    }

    public static final int A04(2SP r1, 2HY r2) {
        0qQ.A0B(r1, 1);
        try {
            return C346807vm.A00(r1, r2);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final long A06(long j, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (j2 > j3) {
            throw new IllegalArgumentException(002.A0Y("Cannot coerce value to an empty range: maximum ", " is less than minimum ", '.', j5, j4));
        } else if (j < j2) {
            return j2;
        } else {
            if (j > j3) {
                return j3;
            }
            return j;
        }
    }

    public static final Comparable A09(Comparable comparable, C74589Pxc pxc) {
        0qQ.A0B(pxc, 1);
        if (!pxc.isEmpty()) {
            Comparable Byc = pxc.Byc();
            if (pxc.Cfv(comparable, Byc) && !pxc.Cfv(Byc, comparable)) {
                return Byc;
            }
            Comparable B1S = pxc.B1S();
            if (!pxc.Cfv(B1S, comparable) || pxc.Cfv(comparable, B1S)) {
                return comparable;
            }
            return B1S;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(pxc);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final 2HZ A0B(2HZ r3, int i) {
        boolean z = false;
        if (i > 0) {
            z = true;
        }
        Integer valueOf = Integer.valueOf(i);
        if (z) {
            int i2 = r3.A00;
            int i3 = r3.A01;
            if (r3.A02 <= 0) {
                i = -i;
            }
            return new 2HZ(i2, i3, i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Step must be positive, was: ");
        sb.append(valueOf);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final double A00(double d, double d2, double d3) {
        if (d2 > d3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(d3);
            sb.append(" is less than minimum ");
            sb.append(d2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (d < d2) {
            return d2;
        } else {
            if (d > d3) {
                return d3;
            }
            return d;
        }
    }

    public static final float A02(float f, float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException(002.A0U("Cannot coerce value to an empty range: maximum ", " is less than minimum ", '.', f3, f2));
        } else if (f < f2) {
            return f2;
        } else {
            if (f > f3) {
                return f3;
            }
            return f;
        }
    }

    public static final int A03(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException(002.A0X("Cannot coerce value to an empty range: maximum ", " is less than minimum ", '.', i3, i2));
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }

    public static final int A05(AnonymousClass2Ha r2, int i) {
        Comparable Byc;
        if (r2 instanceof C74589Pxc) {
            Byc = A09(Integer.valueOf(i), (C74589Pxc) r2);
        } else if (!r2.isEmpty()) {
            Byc = r2.Byc();
            if (i >= ((Number) Byc).intValue()) {
                Byc = r2.B1S();
                if (i <= ((Number) Byc).intValue()) {
                    return i;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: ");
            sb.append(r2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        return ((Number) Byc).intValue();
    }

    public static final long A07(AnonymousClass2Ha r4, long j) {
        Comparable Byc;
        if (r4 instanceof C74589Pxc) {
            Byc = A09(Long.valueOf(j), (C74589Pxc) r4);
        } else if (!r4.isEmpty()) {
            Byc = r4.Byc();
            if (j >= ((Number) Byc).longValue()) {
                Byc = r4.B1S();
                if (j <= ((Number) Byc).longValue()) {
                    return j;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: ");
            sb.append(r4);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        return ((Number) Byc).longValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r3 != null) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Comparable A08(java.lang.Comparable r1, java.lang.Comparable r2, java.lang.Comparable r3) {
        /*
            if (r2 == 0) goto L_0x003c
            if (r3 == 0) goto L_0x0035
            int r0 = r2.compareTo(r3)
            if (r0 > 0) goto L_0x0011
            int r0 = r1.compareTo(r2)
            if (r0 >= 0) goto L_0x003e
            return r2
        L_0x0011:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " is less than minimum "
            r1.append(r0)
            r1.append(r2)
            r0 = 46
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0035:
            int r0 = r1.compareTo(r2)
            if (r0 >= 0) goto L_0x0045
            return r2
        L_0x003c:
            if (r3 == 0) goto L_0x0045
        L_0x003e:
            int r0 = r1.compareTo(r3)
            if (r0 <= 0) goto L_0x0045
            return r3
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C229632nm.A08(java.lang.Comparable, java.lang.Comparable, java.lang.Comparable):java.lang.Comparable");
    }

    public static final 2HZ A0A(2HZ r4) {
        return new 2HZ(r4.A01, r4.A00, -r4.A02);
    }

    public static final 2HY A0C(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return 2HY.A00;
        }
        return new 2HY(i, i2 - 1);
    }
}
