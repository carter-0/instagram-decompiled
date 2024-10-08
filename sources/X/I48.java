package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

public final class I48 {
    public Object A00;
    public boolean A01;
    public int[] A02;
    public int[] A03;
    public final C305176Gv A04;
    public final C289495dh A05;
    public final C289495dh A06;
    public final 0sL A07;

    public static final int A00(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        while (true) {
            if (i < length) {
                int i3 = iArr[i];
                if (i3 <= 0) {
                    break;
                }
                if (i2 > i3) {
                    i2 = i3;
                }
                i++;
            } else if (i2 != Integer.MAX_VALUE) {
                return i2;
            }
        }
        return 0;
    }

    public I48(0sL r5, int[] iArr, int[] iArr2) {
        int i;
        this.A07 = r5;
        this.A02 = iArr;
        int A002 = A00(iArr);
        AnonymousClass0eM r0 = C284905Ot.A01;
        this.A05 = new ParcelableSnapshotMutableIntState(A002);
        this.A03 = iArr2;
        this.A06 = new ParcelableSnapshotMutableIntState(A01(iArr, iArr2));
        0qQ.A0B(iArr, 0);
        int length = iArr.length;
        int i2 = 1;
        if (length != 0) {
            int i3 = iArr[0];
            int i4 = length - 1;
            if (1 <= i4) {
                while (true) {
                    int i5 = iArr[i2];
                    i3 = i3 > i5 ? i5 : i3;
                    if (i2 == i4) {
                        break;
                    }
                    i2++;
                }
            }
            Integer valueOf = Integer.valueOf(i3);
            if (valueOf != null) {
                i = valueOf.intValue();
                this.A04 = new C305176Gv(i, 90, 200);
            }
        }
        i = 0;
        this.A04 = new C305176Gv(i, 90, 200);
    }

    public static final int A01(int[] iArr, int[] iArr2) {
        int A002 = A00(iArr);
        int length = iArr2.length;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArr[i2] == A002) {
                i = Math.min(i, iArr2[i2]);
            }
        }
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        return 0;
    }
}
