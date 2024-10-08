package X;

import java.util.Arrays;

public final class SRM {
    public static final SRM A04;
    public int A00 = 0;
    public boolean A01 = true;
    public int[] A02 = new int[8];
    public Object[] A03 = new Object[8];

    /* JADX WARNING: type inference failed for: r0v0, types: [X.SRM, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.A00 = 0;
        obj.A02 = new int[0];
        obj.A03 = new Object[0];
        obj.A01 = false;
        A04 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof SRM)) {
                SRM srm = (SRM) obj;
                int i = this.A00;
                if (i == srm.A00) {
                    int[] iArr = this.A02;
                    int[] iArr2 = srm.A02;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.A03;
                            Object[] objArr2 = srm.A03;
                            int i3 = 0;
                            while (i3 < i) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                    i3++;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.SRM, java.lang.Object] */
    public static SRM A00() {
        ? obj = new Object();
        obj.A00 = 0;
        obj.A02 = new int[8];
        obj.A03 = new Object[8];
        obj.A01 = true;
        return obj;
    }

    public static final void A01(SRM srm, int i) {
        int[] iArr = srm.A02;
        if (i > iArr.length) {
            int i2 = srm.A00;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            srm.A02 = Arrays.copyOf(iArr, i);
            srm.A03 = Arrays.copyOf(srm.A03, i);
        }
    }

    public final void A02(int i, Object obj) {
        if (this.A01) {
            A01(this, this.A00 + 1);
            int[] iArr = this.A02;
            int i2 = this.A00;
            iArr[i2] = i;
            this.A03[i2] = obj;
            this.A00 = i2 + 1;
            return;
        }
        throw C66580MXl.A11();
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = i + 527;
        int[] iArr = this.A02;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.A03;
        for (int i7 = 0; i7 < i; i7++) {
            i3 = AnonymousClass7TE.A0N(objArr[i7], i3 * 31);
        }
        return i6 + i3;
    }
}
