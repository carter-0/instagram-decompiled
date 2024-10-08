package X;

import java.util.Arrays;

public class SK2 {
    public transient float A00;
    public transient int A01;
    public transient int A02;
    public transient int A03;
    public transient int[] A04;
    public transient int[] A05;
    public transient Object[] A06;
    public transient long[] entries;

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.R16
            if (r0 == 0) goto L_0x000e
            r0 = r2
            X.R16 r0 = (X.R16) r0
            int r1 = r0.A00
            r0 = -2
            if (r1 != r0) goto L_0x000d
        L_0x000c:
            r1 = -1
        L_0x000d:
            return r1
        L_0x000e:
            int r0 = r2.A02
            r1 = 0
            if (r0 != 0) goto L_0x000d
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SK2.A02():int");
    }

    public final int A03(int i) {
        if (this instanceof R16) {
            int i2 = (int) ((R16) this).links[i];
            if (i2 == -2) {
                return -1;
            }
            return i2;
        }
        int i3 = i + 1;
        if (i3 < this.A02) {
            return i3;
        }
        return -1;
    }

    public final int A04(int i) {
        Object obj = this.A06[i];
        long[] jArr = this.entries;
        int i2 = (int) (jArr[i] >>> 32);
        int[] iArr = this.A04;
        int length = (iArr.length - 1) & i2;
        int i3 = iArr[length];
        if (i3 == -1) {
            return 0;
        }
        int i4 = -1;
        while (true) {
            if (((int) (jArr[i3] >>> 32)) != i2 || !2PP.A00(obj, this.A06[i3])) {
                jArr = this.entries;
                int i5 = (int) jArr[i3];
                if (i5 == -1) {
                    return 0;
                }
                i4 = i3;
                i3 = i5;
            } else {
                int i6 = this.A05[i3];
                if (i4 == -1) {
                    this.A04[length] = (int) this.entries[i3];
                } else {
                    long[] jArr2 = this.entries;
                    A01(jArr2, (int) jArr2[i3], i4, jArr2[i4]);
                }
                A07(i3);
                this.A02--;
                this.A01++;
                return i6;
            }
        }
    }

    public void A06() {
        this.A01++;
        Arrays.fill(this.A06, 0, this.A02, (Object) null);
        Arrays.fill(this.A05, 0, this.A02, 0);
        Arrays.fill(this.A04, -1);
        Arrays.fill(this.entries, -1);
        this.A02 = 0;
    }

    public void A07(int i) {
        int i2 = this.A02 - 1;
        Object[] objArr = this.A06;
        if (i < i2) {
            objArr[i] = objArr[i2];
            int[] iArr = this.A05;
            iArr[i] = iArr[i2];
            objArr[i2] = null;
            iArr[i2] = 0;
            long[] jArr = this.entries;
            long j = jArr[i2];
            jArr[i] = j;
            jArr[i2] = -1;
            int[] iArr2 = this.A04;
            int length = ((int) (j >>> 32)) & (iArr2.length - 1);
            int i3 = iArr2[length];
            if (i3 == i2) {
                iArr2[length] = i;
                return;
            }
            while (true) {
                long j2 = jArr[i3];
                int i4 = (int) j2;
                if (i4 == i2) {
                    A01(jArr, i, i3, j2);
                    return;
                }
                i3 = i4;
            }
        } else {
            objArr[i] = null;
            this.A05[i] = 0;
            this.entries[i] = -1;
        }
    }

    public void A08(int i) {
        this.A06 = Arrays.copyOf(this.A06, i);
        this.A05 = Arrays.copyOf(this.A05, i);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.entries = copyOf;
    }

    public void A09(int i, float f) {
        17k.A0G(Pxf.A1R(i), "Initial capacity must be non-negative");
        int A002 = 1J7.A00(i);
        int[] iArr = new int[A002];
        Arrays.fill(iArr, -1);
        this.A04 = iArr;
        this.A00 = 1.0f;
        this.A06 = new Object[i];
        this.A05 = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.entries = jArr;
        this.A03 = Math.max(1, (int) (((float) A002) * 1.0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r0 != r2) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.lang.Object r13, int r14) {
        /*
            r12 = this;
            java.lang.String r1 = "count"
            if (r14 <= 0) goto L_0x00b1
            long[] r11 = r12.entries
            java.lang.Object[] r10 = r12.A06
            int[] r9 = r12.A05
            int r8 = X.1J7.A02(r13)
            int[] r1 = r12.A04
            int r0 = r1.length
            int r0 = r0 + -1
            r0 = r0 & r8
            int r7 = r12.A02
            r6 = r1[r0]
            r5 = -1
            if (r6 != r5) goto L_0x008c
            r1[r0] = r7
        L_0x001d:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r7 == r3) goto L_0x00aa
            int r4 = r7 + 1
            long[] r0 = r12.entries
            int r2 = r0.length
            if (r4 <= r2) goto L_0x0039
            int r1 = r2 >>> 1
            r0 = 1
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = r0 + r2
            if (r0 >= 0) goto L_0x0089
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0036:
            r12.A08(r0)
        L_0x0039:
            r12.A0B(r13, r7, r14, r8)
            r12.A02 = r4
            int r0 = r12.A03
            if (r7 < r0) goto L_0x004d
            int[] r0 = r12.A04
            int r1 = r0.length
            int r2 = r1 * 2
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 < r0) goto L_0x0054
            r12.A03 = r3
        L_0x004d:
            int r0 = r12.A01
            int r0 = r0 + 1
            r12.A01 = r0
            return
        L_0x0054:
            float r1 = (float) r2
            float r0 = r12.A00
            float r1 = r1 * r0
            int r0 = (int) r1
            int r8 = r0 + 1
            int[] r7 = new int[r2]
            java.util.Arrays.fill(r7, r5)
            long[] r9 = r12.entries
            int r10 = r2 + -1
            r6 = 0
        L_0x0065:
            int r0 = r12.A02
            if (r6 >= r0) goto L_0x0084
            r0 = r9[r6]
            r3 = 32
            long r0 = r0 >>> r3
            int r2 = (int) r0
            r1 = r2 & r10
            r0 = r7[r1]
            r7[r1] = r6
            long r4 = (long) r2
            long r4 = r4 << r3
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = (long) r0
            long r2 = r2 & r0
            long r4 = r4 | r2
            r9[r6] = r4
            int r6 = r6 + 1
            goto L_0x0065
        L_0x0084:
            r12.A03 = r8
            r12.A04 = r7
            goto L_0x004d
        L_0x0089:
            if (r0 == r2) goto L_0x0039
            goto L_0x0036
        L_0x008c:
            r1 = r11[r6]
            r0 = 32
            long r3 = r1 >>> r0
            int r0 = (int) r3
            if (r0 != r8) goto L_0x00a0
            r0 = r10[r6]
            boolean r0 = X.2PP.A00(r13, r0)
            if (r0 == 0) goto L_0x00a0
            r9[r6] = r14
            return
        L_0x00a0:
            int r0 = (int) r1
            if (r0 != r5) goto L_0x00a8
            A01(r11, r7, r6, r1)
            goto L_0x001d
        L_0x00a8:
            r6 = r0
            goto L_0x008c
        L_0x00aa:
            java.lang.String r0 = "Cannot contain more than Integer.MAX_VALUE elements!"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00b1:
            java.lang.String r0 = " must be positive but was: "
            java.lang.String r0 = X.002.A0b(r1, r0, r14)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SK2.A0A(java.lang.Object, int):void");
    }

    public void A0B(Object obj, int i, int i2, int i3) {
        this.entries[i] = (((long) i3) << 32) | 4294967295L;
        this.A06[i] = obj;
        this.A05[i] = i2;
    }

    public SK2() {
        A09(3, 1.0f);
    }

    public final int A05(Object obj) {
        int A022 = 1J7.A02(obj);
        int[] iArr = this.A04;
        int i = iArr[(iArr.length - 1) & A022];
        while (i != -1) {
            long j = this.entries[i];
            if (((int) (j >>> 32)) == A022 && 2PP.A00(obj, this.A06[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public static void A01(long[] jArr, int i, int i2, long j) {
        jArr[i2] = (j & -4294967296L) | (((long) i) & 4294967295L);
    }
}
