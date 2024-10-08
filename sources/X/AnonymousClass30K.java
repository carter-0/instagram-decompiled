package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.30K  reason: invalid class name */
public abstract class AnonymousClass30K {
    public static final long A00(long j) {
        long j2 = j;
        if (-4611686018426L > j || j >= 4611686018427L) {
            return (C229632nm.A06(j2, -4611686018427387903L, 4611686018427387903L) << 1) + 1;
        }
        return (j * 1000000) << 1;
    }

    public static final long A02(AnonymousClass30J r6, double d) {
        double A00 = AnonymousClass30L.A00(r6, AnonymousClass30J.NANOSECONDS, d);
        if (!Double.isNaN(A00)) {
            long A02 = AnonymousClass1GB.A02(A00);
            if (-4611686018426999999L > A02 || A02 >= 4611686018427000000L) {
                return A00(AnonymousClass1GB.A02(AnonymousClass30L.A00(r6, AnonymousClass30J.MILLISECONDS, d)));
            }
            return A02 << 1;
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }

    public static final long A04(AnonymousClass30J r7, long j) {
        0qQ.A0B(r7, 1);
        AnonymousClass30J r0 = AnonymousClass30J.NANOSECONDS;
        TimeUnit timeUnit = r7.A00;
        TimeUnit timeUnit2 = r0.A00;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) > j || j > convert) {
            return (C229632nm.A06(AnonymousClass30J.MILLISECONDS.A00.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L) << 1) + 1;
        }
        return timeUnit2.convert(j, timeUnit) << 1;
    }

    public static final long A03(AnonymousClass30J r4, int i) {
        long j = (long) i;
        if (r4.compareTo(AnonymousClass30J.SECONDS) <= 0) {
            return AnonymousClass30J.NANOSECONDS.A00.convert(j, r4.A00) << 1;
        }
        return A04(r4, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.00l.A0X("+-", r6.charAt(0)) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A01(java.lang.String r6) {
        /*
            int r5 = r6.length()
            r3 = 1
            r4 = 0
            if (r5 <= 0) goto L_0x0015
            java.lang.String r1 = "+-"
            char r0 = r6.charAt(r4)
            boolean r0 = X.00l.A0X(r1, r0)
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            int r1 = r5 - r2
            r0 = 16
            if (r1 <= r0) goto L_0x005f
            int r0 = r5 + -1
            X.2HY r1 = new X.2HY
            r1.<init>(r2, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x003b
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003b
        L_0x0030:
            char r1 = r6.charAt(r4)
            r0 = 45
            if (r1 != r0) goto L_0x0059
            r0 = -9223372036854775808
            return r0
        L_0x003b:
            java.util.Iterator r2 = r1.iterator()
        L_0x003f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            r0 = r2
            X.0sh r0 = (X.0sh) r0
            int r0 = r0.A00()
            char r1 = r6.charAt(r0)
            r0 = 48
            if (r0 > r1) goto L_0x005f
            r0 = 58
            if (r1 >= r0) goto L_0x005f
            goto L_0x003f
        L_0x0059:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        L_0x005f:
            java.lang.String r0 = "+"
            boolean r0 = X.00p.A0k(r6, r0, r4)
            if (r0 == 0) goto L_0x006b
            java.lang.String r6 = X.00R.A02(r6, r3)
        L_0x006b:
            long r0 = java.lang.Long.parseLong(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30K.A01(java.lang.String):long");
    }
}
