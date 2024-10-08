package X;

import java.util.Arrays;

/* renamed from: X.Xc3  reason: case insensitive filesystem */
public final class C21471Xc3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int[] A05;
    public long[] A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final C13900TjN A0B;

    public final S5O A00(long j) {
        int i;
        SJ4 sj4;
        long j2 = this.A0A / ((long) this.A09);
        int i2 = (int) (j / j2);
        int[] iArr = this.A05;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || iArr[binarySearch] != i2) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (iArr[binarySearch] != i2);
            i = binarySearch + 1;
        }
        int max = Math.max(0, i);
        int[] iArr2 = this.A05;
        int i3 = iArr2[max];
        long j3 = ((long) i3) * j2;
        if (i3 == i2) {
            sj4 = new SJ4(j3, this.A06[max]);
        } else {
            long[] jArr = this.A06;
            sj4 = new SJ4(j3, jArr[max]);
            int i4 = max + 1;
            if (i4 < jArr.length) {
                return new S5O(sj4, new SJ4(((long) iArr2[i4]) * j2, jArr[i4]));
            }
        }
        return new S5O(sj4, sj4);
    }

    public C21471Xc3(C13900TjN tjN, int i, int i2, int i3, long j) {
        this.A0A = j;
        this.A09 = i3;
        this.A0B = tjN;
        int i4 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.A08 = i4 | (i2 == 2 ? 1667497984 : 1651965952);
        this.A07 = i2 == 2 ? i4 | 1650720768 : -1;
        this.A06 = new long[512];
        this.A05 = new int[512];
    }
}
