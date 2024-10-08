package X;

/* renamed from: X.4P6  reason: invalid class name */
public final class AnonymousClass4P6 {
    public static final AnonymousClass4P6 A02 = new AnonymousClass4P6(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final AnonymousClass4P6 A03;
    public static final AnonymousClass4P6 A04;
    public static final AnonymousClass4P6 A05 = new AnonymousClass4P6(0, Long.MAX_VALUE);
    public static final AnonymousClass4P6 A06 = new AnonymousClass4P6(Long.MAX_VALUE, 0);
    public final long A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4P6 r7 = (AnonymousClass4P6) obj;
            if (!(this.A01 == r7.A01 && this.A00 == r7.A00)) {
                return false;
            }
        }
        return true;
    }

    static {
        AnonymousClass4P6 r5 = new AnonymousClass4P6(0, 0);
        A04 = r5;
        A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r14 > r5) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(long r12, long r14, long r16) {
        /*
            r11 = this;
            long r3 = r11.A01
            r9 = 0
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x000f
            long r0 = r11.A00
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x000f
            return r12
        L_0x000f:
            long r7 = r12 - r3
            long r3 = r3 ^ r12
            long r1 = r12 ^ r7
            long r1 = r1 & r3
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x001b
            r7 = -9223372036854775808
        L_0x001b:
            long r3 = r11.A00
            long r5 = r12 + r3
            long r1 = r12 ^ r5
            long r3 = r3 ^ r5
            long r1 = r1 & r3
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x002c:
            r2 = 1
            int r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0036
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
        L_0x003f:
            if (r1 == 0) goto L_0x0056
            if (r2 == 0) goto L_0x0053
            long r0 = r14 - r12
            long r3 = java.lang.Math.abs(r0)
            long r0 = r16 - r12
            long r1 = java.lang.Math.abs(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0059
        L_0x0053:
            return r14
        L_0x0054:
            r2 = 0
            goto L_0x003f
        L_0x0056:
            if (r2 != 0) goto L_0x0059
            return r7
        L_0x0059:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4P6.A00(long, long, long):long");
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }

    public AnonymousClass4P6(long j, long j2) {
        boolean z = true;
        C256703wD.A03(j >= 0);
        C256703wD.A03(j2 < 0 ? false : z);
        this.A01 = j;
        this.A00 = j2;
    }
}
