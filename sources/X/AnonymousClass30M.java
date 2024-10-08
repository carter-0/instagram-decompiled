package X;

/* renamed from: X.30M  reason: invalid class name */
public final class AnonymousClass30M implements Comparable {
    public static final long A01 = ((4611686018427387903L << 1) + 1);
    public static final long A02 = ((-4611686018427387903L << 1) + 1);
    public final long A00;

    public static final long A03(long j) {
        if ((((int) j) & 1) != 1 || !(!A09(j))) {
            return A06(AnonymousClass30J.MILLISECONDS, j);
        }
        return j >> 1;
    }

    public static final long A04(long j, long j2) {
        return A05(j, ((-(j2 >> 1)) << 1) + ((long) (((int) j2) & 1)));
    }

    public static final double A00(AnonymousClass30J r5, long j) {
        AnonymousClass30J r0;
        if (j == A01) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == A02) {
            return Double.NEGATIVE_INFINITY;
        }
        double d = (double) (j >> 1);
        if ((((int) j) & 1) == 0) {
            r0 = AnonymousClass30J.NANOSECONDS;
        } else {
            r0 = AnonymousClass30J.MILLISECONDS;
        }
        return AnonymousClass30L.A00(r0, r5, d);
    }

    public static int A02(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return 0qQ.A01(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        if (j < 0) {
            return -i;
        }
        return i;
    }

    public static final long A06(AnonymousClass30J r4, long j) {
        AnonymousClass30J r0;
        if (j == A01) {
            return Long.MAX_VALUE;
        }
        if (j == A02) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            r0 = AnonymousClass30J.NANOSECONDS;
        } else {
            r0 = AnonymousClass30J.MILLISECONDS;
        }
        return r4.A00.convert(j2, r0.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006c, code lost:
        if (r4 != 0) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        if (r5 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009a, code lost:
        if (r10 == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ac, code lost:
        if (r5 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ae, code lost:
        r2 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b0, code lost:
        if (r0 <= 0) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b2, code lost:
        r14.append(' ');
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b5, code lost:
        if (r15 != 0) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b7, code lost:
        if (r10 != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b9, code lost:
        if (r7 != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00bb, code lost:
        if (r6 != false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c0, code lost:
        if (r4 < 1000000) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c2, code lost:
        r15 = r4 / 1000000;
        r4 = r4 % 1000000;
        r17 = 6;
        r18 = false;
        r13 = "ms";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00cb, code lost:
        A08(r13, r14, r15, r4, r17, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d0, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e9, code lost:
        if (r4 < 1000) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00eb, code lost:
        r15 = r4 / com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage.MAX_ENTRIES;
        r4 = r4 % com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage.MAX_ENTRIES;
        r17 = 3;
        r18 = false;
        r13 = "us";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00f6, code lost:
        r14.append(r4);
        r14.append("ns");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ff, code lost:
        r17 = 9;
        r13 = "s";
        r18 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A07(long r17) {
        /*
            r4 = r17
            r12 = 0
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "0s"
            return r0
        L_0x000b:
            long r1 = A01
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "Infinity"
            return r0
        L_0x0014:
            long r1 = A02
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0021
            r0 = 2058(0x80a, float:2.884E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            return r0
        L_0x0021:
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            r11 = 0
            if (r0 >= 0) goto L_0x0027
            r11 = 1
        L_0x0027:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            if (r11 == 0) goto L_0x0033
            r0 = 45
            r14.append(r0)
        L_0x0033:
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            r6 = 1
            long r0 = r17 >> r6
            long r2 = -r0
            int r0 = (int) r4
            r0 = r0 & 1
            long r2 = r2 << r6
            long r0 = (long) r0
            long r2 = r2 + r0
            r4 = r2
        L_0x0042:
            X.30J r0 = X.AnonymousClass30J.DAYS
            long r2 = A06(r0, r4)
            boolean r10 = A09(r4)
            if (r10 == 0) goto L_0x011e
            r8 = 0
        L_0x004f:
            if (r10 == 0) goto L_0x0112
            r9 = 0
        L_0x0052:
            if (r10 == 0) goto L_0x0106
            r15 = 0
        L_0x0055:
            int r4 = A01(r4)
            r0 = 0
            r1 = 1
            int r5 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            r10 = 0
            if (r5 == 0) goto L_0x0061
            r10 = 1
        L_0x0061:
            r7 = 0
            if (r8 == 0) goto L_0x0065
            r7 = 1
        L_0x0065:
            r6 = 0
            if (r9 == 0) goto L_0x0069
            r6 = 1
        L_0x0069:
            if (r15 != 0) goto L_0x006e
            r5 = 0
            if (r4 == 0) goto L_0x006f
        L_0x006e:
            r5 = 1
        L_0x006f:
            if (r10 == 0) goto L_0x007a
            r14.append(r2)
            r0 = 100
            r14.append(r0)
            r0 = 1
        L_0x007a:
            r3 = 32
            if (r7 != 0) goto L_0x0084
            if (r10 == 0) goto L_0x0094
            if (r6 != 0) goto L_0x0084
            if (r5 == 0) goto L_0x00d1
        L_0x0084:
            int r2 = r0 + 1
            if (r0 <= 0) goto L_0x008b
            r14.append(r3)
        L_0x008b:
            r14.append(r8)
            r0 = 104(0x68, float:1.46E-43)
            r14.append(r0)
            r0 = r2
        L_0x0094:
            if (r6 != 0) goto L_0x009c
            if (r5 == 0) goto L_0x00d1
            if (r7 != 0) goto L_0x009c
            if (r10 == 0) goto L_0x00ae
        L_0x009c:
            int r2 = r0 + 1
            if (r0 <= 0) goto L_0x00a3
            r14.append(r3)
        L_0x00a3:
            r14.append(r9)
            r0 = 109(0x6d, float:1.53E-43)
            r14.append(r0)
            r0 = r2
            if (r5 == 0) goto L_0x00d1
        L_0x00ae:
            int r2 = r0 + 1
            if (r0 <= 0) goto L_0x00b5
            r14.append(r3)
        L_0x00b5:
            if (r15 != 0) goto L_0x00ff
            if (r10 != 0) goto L_0x00ff
            if (r7 != 0) goto L_0x00ff
            if (r6 != 0) goto L_0x00ff
            r0 = 1000000(0xf4240, float:1.401298E-39)
            if (r4 < r0) goto L_0x00e7
            int r15 = r4 / r0
            int r4 = r4 % r0
            r17 = 6
            r18 = 0
            java.lang.String r13 = "ms"
        L_0x00cb:
            r16 = r4
            A08(r13, r14, r15, r16, r17, r18)
        L_0x00d0:
            r0 = r2
        L_0x00d1:
            if (r11 == 0) goto L_0x00df
            if (r0 <= r1) goto L_0x00df
            r0 = 40
            r14.insert(r1, r0)
            r0 = 41
            r14.append(r0)
        L_0x00df:
            java.lang.String r0 = r14.toString()
            X.0qQ.A07(r0)
            return r0
        L_0x00e7:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r4 < r0) goto L_0x00f6
            int r15 = r4 / 1000
            int r4 = r4 % 1000
            r17 = 3
            r18 = 0
            java.lang.String r13 = "us"
            goto L_0x00cb
        L_0x00f6:
            r14.append(r4)
            java.lang.String r0 = "ns"
            r14.append(r0)
            goto L_0x00d0
        L_0x00ff:
            r17 = 9
            java.lang.String r13 = "s"
            r18 = 0
            goto L_0x00cb
        L_0x0106:
            X.30J r0 = X.AnonymousClass30J.SECONDS
            long r0 = A06(r0, r4)
            r6 = 60
            long r0 = r0 % r6
            int r15 = (int) r0
            goto L_0x0055
        L_0x0112:
            X.30J r0 = X.AnonymousClass30J.MINUTES
            long r6 = A06(r0, r4)
            r0 = 60
            long r6 = r6 % r0
            int r9 = (int) r6
            goto L_0x0052
        L_0x011e:
            X.30J r0 = X.AnonymousClass30J.HOURS
            long r6 = A06(r0, r4)
            r0 = 24
            long r6 = r6 % r0
            int r8 = (int) r6
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30M.A07(long):java.lang.String");
    }

    public static final boolean A09(long j) {
        if (j == A01 || j == A02) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return A02(this.A00, ((AnonymousClass30M) obj).A00);
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass30M) || j != ((AnonymousClass30M) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return A07(this.A00);
    }

    public /* synthetic */ AnonymousClass30M(long j) {
        this.A00 = j;
    }

    public static final int A01(long j) {
        long j2;
        if (A09(j)) {
            return 0;
        }
        boolean z = true;
        if ((((int) j) & 1) != 1) {
            z = false;
        }
        long j3 = j >> 1;
        if (z) {
            j2 = (j3 % 1000) * 1000000;
        } else {
            j2 = j3 % 1000000000;
        }
        return (int) j2;
    }

    public static final long A05(long j, long j2) {
        long j3;
        long j4;
        long j5;
        if (A09(j)) {
            if ((!A09(j2)) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (A09(j2)) {
            return j2;
        } else {
            int i = ((int) j) & 1;
            if (i == (((int) j2) & 1)) {
                long j6 = (j >> 1) + (j2 >> 1);
                if (i != 0) {
                    return AnonymousClass30K.A00(j6);
                }
                if (-4611686018426999999L <= j6 && j6 < 4611686018427000000L) {
                    return j6 << 1;
                }
                j3 = j6 / 1000000;
            } else {
                if (i == 1) {
                    j4 = j >> 1;
                    j5 = j2 >> 1;
                } else {
                    j4 = j2 >> 1;
                    j5 = j >> 1;
                }
                long j7 = j5 / 1000000;
                long j8 = j4 + j7;
                if (-4611686018426L > j8 || j8 >= 4611686018427L) {
                    j3 = C229632nm.A06(j8, -4611686018427387903L, 4611686018427387903L);
                } else {
                    return ((j8 * 1000000) + (j5 - (j7 * 1000000))) << 1;
                }
            }
            return (j3 << 1) + 1;
        }
    }

    public static final void A08(String str, StringBuilder sb, int i, int i2, int i3, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String A0H = 00l.A0H(String.valueOf(i2), i3);
            int i4 = -1;
            int length = A0H.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (A0H.charAt(length) == '0') {
                        if (i5 < 0) {
                            break;
                        }
                        length = i5;
                    } else {
                        i4 = length;
                        break;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                i6 = ((i6 + 2) / 3) * 3;
            }
            sb.append(A0H, 0, i6);
        }
        sb.append(str);
    }
}
