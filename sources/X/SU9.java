package X;

import com.google.common.collect.Multisets$ImmutableEntry;
import java.util.Comparator;

public final class SU9 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public SU9 A04;
    public SU9 A05;
    public SU9 A06;
    public SU9 A07;
    public final Object A08;

    private SU9 A00() {
        SU9 su9;
        int i = this.A01;
        this.A01 = 0;
        SU9 su92 = this.A05;
        su92.getClass();
        SU9 su93 = this.A07;
        su93.getClass();
        su92.A07 = su93;
        su93.A05 = su92;
        SU9 su94 = this.A04;
        SU9 su95 = this.A06;
        if (su94 == null) {
            return su95;
        }
        if (su95 == null) {
            return su94;
        }
        if (su94.A02 >= su95.A02) {
            su9 = this.A05;
            su9.getClass();
            su9.A04 = this.A04.A02(su9);
            su9.A06 = this.A06;
        } else {
            su9 = this.A07;
            su9.getClass();
            su9.A06 = this.A06.A03(su9);
            su9.A04 = this.A04;
        }
        su9.A00 = this.A00 - 1;
        su9.A03 = this.A03 - ((long) i);
        return su9.A01();
    }

    private SU9 A01() {
        int i;
        int i2;
        SU9 su9;
        int i3;
        int i4;
        int i5;
        int i6;
        SU9 su92 = this.A04;
        if (su92 == null) {
            i = 0;
        } else {
            i = su92.A02;
        }
        SU9 su93 = this.A06;
        if (su93 == null) {
            i2 = 0;
        } else {
            i2 = su93.A02;
        }
        int i7 = i - i2;
        if (i7 == -2) {
            su93.getClass();
            SU9 su94 = this.A06;
            SU9 su95 = su94.A04;
            if (su95 == null) {
                i3 = 0;
            } else {
                i3 = su95.A02;
            }
            SU9 su96 = su94.A06;
            if (su96 == null) {
                i4 = 0;
            } else {
                i4 = su96.A02;
            }
            if (i3 - i4 > 0) {
                17k.A0F(AnonymousClass7TF.A1V(su95));
                su94.A04 = su95.A06;
                su95.A06 = su94;
                su95.A03 = su94.A03;
                su95.A00 = su94.A00;
                su94.A06();
                su95.A07();
                this.A06 = su95;
                su94 = su95;
            }
            17k.A0F(AnonymousClass7TF.A1V(su9));
            this.A06 = su9.A04;
            su9.A04 = this;
        } else if (i7 != 2) {
            A07();
            return this;
        } else {
            su92.getClass();
            su9 = this.A04;
            SU9 su97 = su9.A04;
            if (su97 == null) {
                i5 = 0;
            } else {
                i5 = su97.A02;
            }
            SU9 su98 = su9.A06;
            if (su98 == null) {
                i6 = 0;
            } else {
                i6 = su98.A02;
            }
            if (i5 - i6 < 0) {
                17k.A0F(AnonymousClass7TF.A1V(su98));
                su9.A06 = su98.A04;
                su98.A04 = su9;
                su98.A03 = su9.A03;
                su98.A00 = su9.A00;
                su9.A06();
                su98.A07();
                this.A04 = su98;
                su9 = su98;
            }
            17k.A0F(AnonymousClass7TF.A1V(su9));
            this.A04 = su9.A06;
            su9.A06 = this;
        }
        su9.A03 = this.A03;
        su9.A00 = this.A00;
        A06();
        su9.A07();
        return su9;
    }

    private SU9 A02(SU9 su9) {
        SU9 su92 = this.A06;
        if (su92 == null) {
            return this.A04;
        }
        this.A06 = su92.A02(su9);
        this.A00--;
        this.A03 -= (long) su9.A01;
        return A01();
    }

    private SU9 A03(SU9 su9) {
        SU9 su92 = this.A04;
        if (su92 == null) {
            return this.A06;
        }
        this.A04 = su92.A03(su9);
        this.A00--;
        this.A03 -= (long) su9.A01;
        return A01();
    }

    public static SU9 A04(SU9 su9, Object obj, Comparator comparator) {
        SU9 A042;
        int compare = comparator.compare(obj, su9.A08);
        if (compare < 0) {
            SU9 su92 = su9.A04;
            if (su92 == null || (A042 = A04(su92, obj, comparator)) == null) {
                return su9;
            }
            return A042;
        } else if (compare != 0) {
            SU9 su93 = su9.A06;
            if (su93 == null) {
                return null;
            }
            return A04(su93, obj, comparator);
        }
        return su9;
    }

    public static SU9 A05(SU9 su9, Object obj, Comparator comparator) {
        SU9 A052;
        int compare = comparator.compare(obj, su9.A08);
        if (compare > 0) {
            SU9 su92 = su9.A06;
            if (su92 == null || (A052 = A05(su92, obj, comparator)) == null) {
                return su9;
            }
            return A052;
        } else if (compare != 0) {
            SU9 su93 = su9.A04;
            if (su93 == null) {
                return null;
            }
            return A05(su93, obj, comparator);
        }
        return su9;
    }

    private void A06() {
        int i;
        int i2;
        long j;
        long j2;
        SU9 su9 = this.A04;
        if (su9 == null) {
            i = 0;
        } else {
            i = su9.A00;
        }
        int i3 = i + 1;
        SU9 su92 = this.A06;
        if (su92 == null) {
            i2 = 0;
        } else {
            i2 = su92.A00;
        }
        this.A00 = i3 + i2;
        long j3 = (long) this.A01;
        if (su9 == null) {
            j = 0;
        } else {
            j = su9.A03;
        }
        long j4 = j3 + j;
        if (su92 == null) {
            j2 = 0;
        } else {
            j2 = su92.A03;
        }
        this.A03 = j4 + j2;
        A07();
    }

    private void A07() {
        int i;
        int i2;
        SU9 su9 = this.A04;
        if (su9 == null) {
            i = 0;
        } else {
            i = su9.A02;
        }
        SU9 su92 = this.A06;
        if (su92 == null) {
            i2 = 0;
        } else {
            i2 = su92.A02;
        }
        this.A02 = Math.max(i, i2) + 1;
    }

    public final int A08(Object obj, Comparator comparator) {
        SU9 su9;
        int compare = comparator.compare(obj, this.A08);
        if (compare < 0) {
            su9 = this.A04;
        } else if (compare <= 0) {
            return this.A01;
        } else {
            su9 = this.A06;
        }
        if (su9 != null) {
            return su9.A08(obj, comparator);
        }
        return 0;
    }

    public final SU9 A09(Object obj, Comparator comparator, int[] iArr) {
        int compare = comparator.compare(obj, this.A08);
        if (compare < 0) {
            SU9 su9 = this.A04;
            if (su9 != null) {
                this.A04 = su9.A09(obj, comparator, iArr);
            }
            iArr[0] = 0;
            return this;
        } else if (compare > 0) {
            SU9 su92 = this.A06;
            if (su92 != null) {
                this.A06 = su92.A09(obj, comparator, iArr);
            }
            iArr[0] = 0;
            return this;
        } else {
            iArr[0] = this.A01;
            return A00();
        }
        int i = iArr[0];
        if (i != 0) {
            this.A00--;
        }
        this.A03 += (long) (-i);
        return A01();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.SU9 A0A(java.lang.Object r10, java.util.Comparator r11, int[] r12, int r13) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.A08
            int r0 = r11.compare(r10, r0)
            r8 = 1
            r1 = 0
            if (r0 >= 0) goto L_0x003c
            X.SU9 r0 = r9.A04
            if (r0 != 0) goto L_0x0062
            r12[r1] = r1
            X.SU9 r0 = new X.SU9
            r0.<init>(r10, r13)
            r9.A04 = r0
            X.SU9 r1 = r9.A05
            r1.getClass()
            X.SU9 r0 = r9.A04
            r1.A07 = r0
            r0.A05 = r1
            r0.A07 = r9
            r9.A05 = r0
        L_0x0026:
            int r1 = r9.A02
            r0 = 2
            int r0 = java.lang.Math.max(r0, r1)
            r9.A02 = r0
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
            long r2 = r9.A03
            long r0 = (long) r13
            long r2 = r2 + r0
            r9.A03 = r2
        L_0x003b:
            return r9
        L_0x003c:
            if (r0 <= 0) goto L_0x0083
            X.SU9 r0 = r9.A06
            if (r0 != 0) goto L_0x0059
            r12[r1] = r1
            X.SU9 r1 = new X.SU9
            r1.<init>(r10, r13)
            r9.A06 = r1
            X.SU9 r0 = r9.A07
            r0.getClass()
            r9.A07 = r1
            r1.A05 = r9
            r1.A07 = r0
            r0.A05 = r1
            goto L_0x0026
        L_0x0059:
            int r5 = r0.A02
            X.SU9 r4 = r0.A0A(r10, r11, r12, r13)
            r9.A06 = r4
            goto L_0x006a
        L_0x0062:
            int r5 = r0.A02
            X.SU9 r4 = r0.A0A(r10, r11, r12, r13)
            r9.A04 = r4
        L_0x006a:
            r0 = r12[r1]
            if (r0 != 0) goto L_0x0074
            int r0 = r9.A00
            int r0 = r0 + 1
            r9.A00 = r0
        L_0x0074:
            long r2 = r9.A03
            long r0 = (long) r13
            long r2 = r2 + r0
            r9.A03 = r2
            int r0 = r4.A02
            if (r0 == r5) goto L_0x003b
            X.SU9 r0 = r9.A01()
            return r0
        L_0x0083:
            int r0 = r9.A01
            r12[r1] = r0
            long r6 = (long) r0
            long r2 = (long) r13
            long r6 = r6 + r2
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0092
            r8 = 0
        L_0x0092:
            X.17k.A0E(r8)
            int r0 = r9.A01
            int r0 = r0 + r13
            r9.A01 = r0
            long r0 = r9.A03
            long r0 = r0 + r2
            r9.A03 = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SU9.A0A(java.lang.Object, java.util.Comparator, int[], int):X.SU9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r1 > 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.SU9 A0B(java.lang.Object r5, java.util.Comparator r6, int[] r7, int r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.A08
            int r0 = r6.compare(r5, r0)
            r1 = 0
            if (r0 >= 0) goto L_0x001a
            X.SU9 r0 = r4.A04
            if (r0 == 0) goto L_0x0041
            X.SU9 r0 = r0.A0B(r5, r6, r7, r8)
            r4.A04 = r0
            r1 = r7[r1]
            if (r1 > 0) goto L_0x002a
            if (r1 != 0) goto L_0x0038
            return r4
        L_0x001a:
            if (r0 <= 0) goto L_0x0044
            X.SU9 r0 = r4.A06
            if (r0 == 0) goto L_0x0041
            X.SU9 r0 = r0.A0B(r5, r6, r7, r8)
            r4.A06 = r0
            r1 = r7[r1]
            if (r1 <= 0) goto L_0x0038
        L_0x002a:
            if (r8 < r1) goto L_0x003d
            int r0 = r4.A00
            int r0 = r0 + -1
            r4.A00 = r0
            long r2 = r4.A03
            long r0 = (long) r1
        L_0x0035:
            long r2 = r2 - r0
            r4.A03 = r2
        L_0x0038:
            X.SU9 r0 = r4.A01()
            return r0
        L_0x003d:
            long r2 = r4.A03
            long r0 = (long) r8
            goto L_0x0035
        L_0x0041:
            r7[r1] = r1
            return r4
        L_0x0044:
            int r0 = r4.A01
            r7[r1] = r0
            if (r8 < r0) goto L_0x004f
            X.SU9 r0 = r4.A00()
            return r0
        L_0x004f:
            int r0 = r0 - r8
            r4.A01 = r0
            long r2 = r4.A03
            long r0 = (long) r8
            long r2 = r2 - r0
            r4.A03 = r2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SU9.A0B(java.lang.Object, java.util.Comparator, int[], int):X.SU9");
    }

    public final SU9 A0C(Object obj, Comparator comparator, int[] iArr, int i) {
        int compare = comparator.compare(obj, this.A08);
        if (compare < 0) {
            SU9 su9 = this.A04;
            if (su9 != null) {
                this.A04 = su9.A0C(obj, comparator, iArr, i);
                int i2 = iArr[0];
                if (i2 == i) {
                    this.A00--;
                    this.A03 += (long) (-i2);
                }
            }
            iArr[0] = 0;
            return this;
        } else if (compare > 0) {
            SU9 su92 = this.A06;
            if (su92 != null) {
                this.A06 = su92.A0C(obj, comparator, iArr, i);
                int i3 = iArr[0];
                if (i3 == i) {
                    this.A00--;
                    this.A03 += (long) (-i3);
                }
            }
            iArr[0] = 0;
            return this;
        } else {
            int i4 = this.A01;
            iArr[0] = i4;
            if (i == i4) {
                return A00();
            }
            return this;
        }
        return A01();
    }

    public final String toString() {
        return new Multisets$ImmutableEntry(this.A08, this.A01).toString();
    }

    public SU9(Object obj, int i) {
        17k.A0E(AnonymousClass7TF.A1R(i));
        this.A08 = obj;
        this.A01 = i;
        this.A03 = (long) i;
        this.A00 = 1;
        this.A02 = 1;
        this.A04 = null;
        this.A06 = null;
    }

    public SU9() {
        this.A08 = null;
        this.A01 = 1;
    }
}
