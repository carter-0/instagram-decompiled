package X;

import java.util.Arrays;

public final class I24 {
    public int A00;
    public int[] A01 = new int[16];
    public final 01W A02 = new 01W();

    private final void A00(int i, int i2) {
        if (i <= 131072) {
            int[] iArr = this.A01;
            int length = iArr.length;
            if (length < i) {
                int i3 = length;
                while (i3 < i) {
                    i3 *= 2;
                }
                int[] iArr2 = new int[i3];
                0Yw.A0T(iArr, iArr2, i2, 0, length);
                this.A01 = iArr2;
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0w(002.A0c("Requested item capacity ", " is larger than max supported: 131072!", i));
    }

    public final int A01(int i) {
        int i2 = this.A00;
        if (i < i2) {
            return -1;
        }
        int[] iArr = this.A01;
        if (i < iArr.length + i2) {
            return iArr[i - i2] - 1;
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r3 
      PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:0:0x0000, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(int r3, int r4) {
        /*
            r2 = this;
        L_0x0000:
            int r3 = r3 + -1
            r0 = -1
            if (r0 >= r3) goto L_0x0011
            int r1 = r2.A01(r3)
            if (r1 == r4) goto L_0x0010
            if (r1 == r0) goto L_0x0010
            r0 = -2
            if (r1 != r0) goto L_0x0000
        L_0x0010:
            return r3
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I24.A02(int, int):int");
    }

    public final void A03() {
        int[] iArr = this.A01;
        Arrays.fill(iArr, 0, iArr.length, 0);
        this.A02.clear();
    }

    public final void A04(int i) {
        01W r3;
        int i2 = this.A00;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int[] iArr = this.A01;
            int length = iArr.length;
            int max = Math.max(i - (length / 2), 0);
            this.A00 = max;
            int i4 = max - i2;
            if (i4 >= 0) {
                if (i4 < length) {
                    System.arraycopy(iArr, i4, iArr, 0, length - i4);
                }
                int[] iArr2 = this.A01;
                int length2 = iArr2.length;
                Arrays.fill(iArr2, Math.max(0, length2 - i4), length2, 0);
            } else {
                int i5 = -i4;
                int i6 = length + i5;
                if (i6 < 131072) {
                    A00(i6 + 1, i5);
                } else {
                    if (i5 < length) {
                        System.arraycopy(iArr, 0, iArr, i5, length - i5);
                    }
                    int[] iArr3 = this.A01;
                    Arrays.fill(iArr3, 0, Math.min(iArr3.length, i5), 0);
                }
            }
        } else {
            A00(i3 + 1, 0);
        }
        while (true) {
            r3 = this.A02;
            if (DbT.A1b(r3) && ((C55579Hjz) r3.A0O()).A01 < this.A00) {
                r3.removeFirst();
            }
        }
        while (DbT.A1b(r3) && ((C55579Hjz) r3.A0Q()).A01 > this.A00 + this.A01.length) {
            r3.removeLast();
        }
    }

    public final void A05(int i, int i2) {
        if (i >= 0) {
            A04(i);
            this.A01[i - this.A00] = i2 + 1;
            return;
        }
        throw AnonymousClass7TE.A0w("Negative lanes are not supported");
    }

    public final int[] A06(int i) {
        01W r3 = this.A02;
        Integer valueOf = Integer.valueOf(i);
        C55579Hjz hjz = (C55579Hjz) 00k.A0O(r3, 0sr.A1K(r3, J6G.A00(valueOf, 46), r3.size()));
        if (hjz != null) {
            return hjz.A00;
        }
        return null;
    }
}
