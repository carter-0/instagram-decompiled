package X;

/* renamed from: X.Vp1  reason: case insensitive filesystem */
public abstract class C18281Vp1 {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r1 == '+') goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C360308eN A00(java.lang.String r11) {
        /*
            r8 = 10
            r0 = 0
            int r7 = r11.length()
            r10 = 0
            if (r7 == 0) goto L_0x001e
            r9 = 0
            char r1 = r11.charAt(r0)
            r0 = 48
            int r0 = X.0qQ.A00(r1, r0)
            r6 = 1
            if (r0 >= 0) goto L_0x001f
            if (r7 == r6) goto L_0x001e
            r0 = 43
            if (r1 == r0) goto L_0x0020
        L_0x001e:
            return r10
        L_0x001f:
            r6 = 0
        L_0x0020:
            r5 = 119304647(0x71c71c7, float:1.1769572E-34)
            r4 = 119304647(0x71c71c7, float:1.1769572E-34)
        L_0x0026:
            if (r6 >= r7) goto L_0x0059
            char r0 = r11.charAt(r6)
            int r3 = java.lang.Character.digit(r0, r8)
            if (r3 < 0) goto L_0x001e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r9 ^ r2
            r0 = r4 ^ r2
            if (r1 == r0) goto L_0x004a
            if (r1 < r0) goto L_0x004a
            if (r4 != r5) goto L_0x001e
            r4 = 429496729(0x19999999, float:1.5881867E-23)
            r1 = r9 ^ r2
            r0 = -1717986919(0xffffffff99999999, float:-1.5881867E-23)
            if (r1 == r0) goto L_0x004a
            if (r1 >= r0) goto L_0x001e
        L_0x004a:
            int r1 = r9 * 10
            int r3 = r3 + r1
            r0 = r3 ^ r2
            r1 = r1 ^ r2
            if (r0 == r1) goto L_0x0055
            if (r0 >= r1) goto L_0x0055
            return r10
        L_0x0055:
            int r6 = r6 + 1
            r9 = r3
            goto L_0x0026
        L_0x0059:
            X.8eN r0 = new X.8eN
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18281Vp1.A00(java.lang.String):X.8eN");
    }

    public static final C360238eG A01(String str) {
        String str2 = str;
        int length = str2.length();
        if (length != 0) {
            int i = 0;
            char charAt = str2.charAt(0);
            if (0qQ.A00(charAt, 48) < 0) {
                if (length != 1 && charAt == '+') {
                    i = 1;
                }
            }
            long j = 0;
            long j2 = 512409557603043100L;
            while (i < length) {
                int digit = Character.digit(str2.charAt(i), 10);
                if (digit >= 0) {
                    if ((j ^ Long.MIN_VALUE) > (j2 ^ Long.MIN_VALUE)) {
                        if (j2 == 512409557603043100L) {
                            int i2 = 1;
                            long j3 = ((-1 >>> 1) / 10) << 1;
                            if (((-1 - (j3 * 10)) ^ Long.MIN_VALUE) < -9223372036854775798L) {
                                i2 = 0;
                            }
                            j2 = j3 + ((long) i2);
                            if ((j ^ Long.MIN_VALUE) > (j2 ^ Long.MIN_VALUE)) {
                            }
                        }
                    }
                    long j4 = j * 10;
                    long j5 = (((long) digit) & 4294967295L) + j4;
                    if ((j5 ^ Long.MIN_VALUE) >= (j4 ^ Long.MIN_VALUE)) {
                        i++;
                        j = j5;
                    }
                }
            }
            return new C360238eG(j);
        }
        return null;
    }
}
