package X;

import java.util.ArrayList;

/* renamed from: X.5X6  reason: invalid class name */
public abstract class AnonymousClass5X6 {
    public static final int A00(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r5 >= 67108863) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(int[] r3, int r4, int r5) {
        /*
            if (r5 < 0) goto L_0x0008
            r1 = 67108863(0x3ffffff, float:1.5046327E-36)
            r0 = 1
            if (r5 < r1) goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            X.AnonymousClass5XN.A06(r0)
            int r0 = r4 * 5
            int r2 = r0 + 1
            r1 = r3[r2]
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r1 = r1 & r0
            r5 = r5 | r1
            r3[r2] = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5X6.A02(int[], int, int):void");
    }

    public static final boolean A03(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & SN3.MAX_SIGNED_POWER_OF_TWO) == 0) {
            return false;
        }
        return true;
    }

    public static final int A01(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((AnonymousClass5X7) arrayList.get(i4)).A00;
            if (i5 < 0) {
                i5 += i2;
            }
            int A00 = 0qQ.A00(i5, i);
            if (A00 < 0) {
                i3 = i4 + 1;
            } else if (A00 <= 0) {
                return i4;
            } else {
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }
}
