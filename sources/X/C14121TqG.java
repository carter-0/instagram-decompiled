package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.TqG  reason: case insensitive filesystem */
public final class C14121TqG {
    public static final Comparator A05 = new C20373WqD(0);
    public final List A00;
    public final float[] A01 = new float[3];
    public final int[] A02;
    public final int[] A03;
    public final X04[] A04;

    public static void A00(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    private boolean A01(float[] fArr) {
        int length;
        X04[] x04Arr = this.A04;
        if (x04Arr == null || (length = x04Arr.length) <= 0) {
            return false;
        }
        int i = 0;
        do {
            float f = fArr[2];
            if (f < 0.95f && f > 0.05f) {
                float f2 = fArr[0];
                if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    i++;
                }
            }
            return true;
        } while (i < length);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0141, code lost:
        if (r6 < r1) goto L_0x0143;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14121TqG(int[] r15, X.X04[] r16, int r17) {
        /*
            r14 = this;
            r14.<init>()
            r5 = 3
            float[] r0 = new float[r5]
            r14.A01 = r0
            r0 = r16
            r14.A04 = r0
            r4 = 32768(0x8000, float:4.5918E-41)
            int[] r7 = new int[r4]
            r14.A03 = r7
            r3 = 0
            r6 = 0
        L_0x0015:
            int r0 = r15.length
            if (r6 >= r0) goto L_0x0042
            r2 = r15[r6]
            int r8 = android.graphics.Color.red(r2)
            r1 = 5
            int r8 = r8 >> r5
            r0 = 1
            int r1 = r0 << r1
            int r1 = r1 - r0
            r8 = r8 & r1
            int r0 = android.graphics.Color.green(r2)
            int r0 = r0 >> r5
            r0 = r0 & r1
            int r2 = android.graphics.Color.blue(r2)
            int r2 = r2 >> r5
            r2 = r2 & r1
            int r1 = r8 << 10
            int r0 = r0 << 5
            r1 = r1 | r0
            r2 = r2 | r1
            r15[r6] = r2
            r0 = r7[r2]
            int r0 = r0 + 1
            r7[r2] = r0
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0042:
            r9 = 0
            r8 = 0
        L_0x0044:
            r0 = r7[r9]
            if (r0 <= 0) goto L_0x006f
            int r0 = r9 >> 10
            r10 = r0 & 31
            int r0 = r9 >> 5
            r6 = r0 & 31
            r2 = r9 & 31
            r0 = 8
            int r10 = r10 << r5
            r1 = 1
            int r0 = r1 << r0
            int r0 = r0 - r1
            r10 = r10 & r0
            int r6 = r6 << r5
            r6 = r6 & r0
            int r2 = r2 << r5
            r2 = r2 & r0
            int r1 = android.graphics.Color.rgb(r10, r6, r2)
            float[] r0 = r14.A01
            X.2eL.A09(r1, r0)
            boolean r0 = r14.A01(r0)
            if (r0 == 0) goto L_0x006f
            r7[r9] = r3
        L_0x006f:
            r0 = r7[r9]
            if (r0 <= 0) goto L_0x0075
            int r8 = r8 + 1
        L_0x0075:
            int r9 = r9 + 1
            if (r9 < r4) goto L_0x0044
            int[] r6 = new int[r8]
            r14.A02 = r6
            r2 = 0
            r1 = 0
        L_0x007f:
            r0 = r7[r2]
            if (r0 <= 0) goto L_0x0088
            int r0 = r1 + 1
            r6[r1] = r2
            r1 = r0
        L_0x0088:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x007f
            r9 = r17
            if (r8 > r9) goto L_0x00c4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A00 = r0
        L_0x0097:
            if (r3 >= r8) goto L_0x01b9
            r11 = r6[r3]
            java.util.List r9 = r14.A00
            int r0 = r11 >> 10
            r10 = r0 & 31
            int r0 = r11 >> 5
            r4 = r0 & 31
            r2 = r11 & 31
            r0 = 8
            int r10 = r10 << r5
            r1 = 1
            int r0 = r1 << r0
            int r0 = r0 - r1
            r10 = r10 & r0
            int r4 = r4 << r5
            r4 = r4 & r0
            int r2 = r2 << r5
            r2 = r2 & r0
            int r2 = android.graphics.Color.rgb(r10, r4, r2)
            r1 = r7[r11]
            X.TqH r0 = new X.TqH
            r0.<init>(r2, r1)
            r9.add(r0)
            int r3 = r3 + 1
            goto L_0x0097
        L_0x00c4:
            java.util.Comparator r0 = A05
            java.util.PriorityQueue r8 = new java.util.PriorityQueue
            r8.<init>(r9, r0)
            int[] r0 = r14.A02
            int r0 = r0.length
            int r0 = r0 + -1
            X.TqJ r7 = new X.TqJ
            r7.<init>(r14, r3, r0)
        L_0x00d5:
            r8.offer(r7)
            int r0 = r8.size()
            if (r0 >= r9) goto L_0x0145
            java.lang.Object r7 = r8.poll()
            X.TqJ r7 = (X.C14124TqJ) r7
            if (r7 == 0) goto L_0x0145
            int r4 = r7.A08
            int r3 = r4 + 1
            int r2 = r7.A00
            int r1 = r3 - r2
            r0 = 1
            if (r1 <= r0) goto L_0x0145
            int r10 = r7.A03
            int r0 = r7.A06
            int r10 = r10 - r0
            int r6 = r7.A02
            int r0 = r7.A05
            int r6 = r6 - r0
            int r1 = r7.A01
            int r0 = r7.A04
            int r1 = r1 - r0
            if (r10 < r6) goto L_0x013e
            if (r10 < r1) goto L_0x013e
            r0 = -3
        L_0x0105:
            X.TqG r6 = r7.A09
            int[] r12 = r6.A02
            int[] r11 = r6.A03
            r10 = r2
            A00(r12, r0, r2, r4)
            java.util.Arrays.sort(r12, r2, r3)
            int r4 = r7.A08
            A00(r12, r0, r2, r4)
            int r0 = r7.A07
            int r3 = r0 / 2
            r1 = 0
        L_0x011c:
            if (r10 > r4) goto L_0x012b
            r0 = r12[r10]
            r0 = r11[r0]
            int r1 = r1 + r0
            if (r1 < r3) goto L_0x013b
            int r0 = r4 + -1
            int r2 = java.lang.Math.min(r0, r10)
        L_0x012b:
            int r1 = r2 + 1
            X.TqJ r0 = new X.TqJ
            r0.<init>(r6, r1, r4)
            r7.A08 = r2
            r7.A00()
            r8.offer(r0)
            goto L_0x00d5
        L_0x013b:
            int r10 = r10 + 1
            goto L_0x011c
        L_0x013e:
            if (r6 < r10) goto L_0x0143
            r0 = -2
            if (r6 >= r1) goto L_0x0105
        L_0x0143:
            r0 = -1
            goto L_0x0105
        L_0x0145:
            java.util.ArrayList r6 = X.Pxg.A14(r8)
            java.util.Iterator r13 = r8.iterator()
        L_0x014d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01b7
            java.lang.Object r10 = r13.next()
            X.TqJ r10 = (X.C14124TqJ) r10
            X.TqG r0 = r10.A09
            int[] r9 = r0.A02
            int[] r8 = r0.A03
            int r4 = r10.A00
            r1 = 0
            r7 = 0
            r3 = 0
            r2 = 0
        L_0x0165:
            int r0 = r10.A08
            if (r4 > r0) goto L_0x0181
            r12 = r9[r4]
            r11 = r8[r12]
            int r7 = r7 + r11
            int r0 = r12 >> 10
            r0 = r0 & 31
            int r0 = r0 * r11
            int r1 = r1 + r0
            int r0 = r12 >> 5
            r0 = r0 & 31
            int r0 = r0 * r11
            int r3 = r3 + r0
            r0 = r12 & 31
            int r11 = r11 * r0
            int r2 = r2 + r11
            int r4 = r4 + 1
            goto L_0x0165
        L_0x0181:
            float r0 = (float) r1
            float r1 = (float) r7
            float r0 = r0 / r1
            int r4 = java.lang.Math.round(r0)
            float r0 = (float) r3
            float r0 = r0 / r1
            int r3 = java.lang.Math.round(r0)
            float r0 = (float) r2
            float r0 = r0 / r1
            int r2 = java.lang.Math.round(r0)
            r0 = 8
            int r4 = r4 << r5
            r1 = 1
            int r0 = r1 << r0
            int r0 = r0 - r1
            r4 = r4 & r0
            int r3 = r3 << r5
            r3 = r3 & r0
            int r2 = r2 << r5
            r2 = r2 & r0
            int r0 = android.graphics.Color.rgb(r4, r3, r2)
            X.TqH r1 = new X.TqH
            r1.<init>(r0, r7)
            float[] r0 = r1.A01()
            boolean r0 = r14.A01(r0)
            if (r0 != 0) goto L_0x014d
            r6.add(r1)
            goto L_0x014d
        L_0x01b7:
            r14.A00 = r6
        L_0x01b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14121TqG.<init>(int[], X.X04[], int):void");
    }
}
