package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public final class LRI {
    public static final LRI A00 = new Object();
    public static final int[][] A01 = {new int[]{-1, 0}, new int[]{1, 0}, new int[]{0, -1}, new int[]{0, 1}};

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float[] A01(float[] r18, int r19, int r20) {
        /*
            r17 = this;
            r9 = 0
            r12 = r18
            int r8 = r12.length
            float[] r7 = new float[r8]
            r1 = 0
        L_0x0007:
            if (r1 >= r8) goto L_0x0010
            r0 = 1065353216(0x3f800000, float:1.0)
            r7[r1] = r0
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0010:
            boolean[] r6 = new boolean[r8]
            java.util.Stack r5 = new java.util.Stack
            r5.<init>()
            r10 = r20
            X.2HY r0 = X.C229632nm.A0C(r9, r10)
            r4 = 10
            X.2HZ r0 = X.C229632nm.A0B(r0, r4)
            int r3 = r0.A00
            int r2 = r0.A01
            int r1 = r0.A02
            r16 = 0
            r15 = 1
            r11 = r19
            if (r1 <= 0) goto L_0x00b4
            if (r3 <= r2) goto L_0x00b8
        L_0x0032:
            X.2HY r0 = X.C229632nm.A0C(r9, r11)
            X.2HZ r0 = X.C229632nm.A0B(r0, r4)
            int r4 = r0.A00
            int r3 = r0.A01
            int r2 = r0.A02
            if (r2 <= 0) goto L_0x0085
            if (r4 <= r3) goto L_0x0089
        L_0x0044:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r0 = r5.pop()
            int r13 = X.AnonymousClass7TE.A0M(r0)
            if (r13 < 0) goto L_0x0044
            if (r13 >= r8) goto L_0x0044
            boolean r0 = r6[r13]
            if (r0 != 0) goto L_0x0044
            r0 = r18[r13]
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0044
            r6[r13] = r15
            r7[r13] = r16
            int[][] r14 = A01
            r10 = 4
            r4 = 0
        L_0x006a:
            r3 = r14[r4]
            int r2 = r13 / r19
            r0 = r3[r9]
            int r2 = r2 + r0
            int r1 = r13 % r19
            r0 = r3[r15]
            int r1 = r1 + r0
            int r2 = r2 * r19
            int r2 = r2 + r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.push(r0)
            int r4 = r4 + 1
            if (r4 >= r10) goto L_0x0044
            goto L_0x006a
        L_0x0085:
            if (r2 >= 0) goto L_0x0044
            if (r3 > r4) goto L_0x0044
        L_0x0089:
            boolean r0 = r6[r4]
            if (r0 != 0) goto L_0x009a
            r0 = r18[r4]
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x009a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r5.push(r0)
        L_0x009a:
            int r1 = r20 + -1
            int r1 = r1 * r19
            int r1 = r1 + r4
            boolean r0 = r6[r1]
            if (r0 != 0) goto L_0x00b0
            r0 = r18[r1]
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00b0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r5.push(r0)
        L_0x00b0:
            if (r4 == r3) goto L_0x0044
            int r4 = r4 + r2
            goto L_0x0089
        L_0x00b4:
            if (r1 >= 0) goto L_0x0032
            if (r2 > r3) goto L_0x0032
        L_0x00b8:
            int r13 = r3 * r19
            boolean r0 = r6[r13]
            if (r0 != 0) goto L_0x00cb
            r0 = r18[r13]
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00cb
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r5.push(r0)
        L_0x00cb:
            int r0 = r19 + -1
            int r13 = r13 + r0
            boolean r0 = r6[r13]
            if (r0 != 0) goto L_0x00df
            r0 = r18[r13]
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00df
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r5.push(r0)
        L_0x00df:
            if (r3 == r2) goto L_0x0032
            int r3 = r3 + r1
            goto L_0x00b8
        L_0x00e3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LRI.A01(float[], int, int):float[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r8[(r1 * r21) + r0] < r14[r13 + 1][r12 + 1]) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float[] A02(float[] r20, int r21, int r22) {
        /*
            r19 = this;
            r9 = 5
            r13 = r20
            int r12 = r13.length
            float[] r8 = new float[r12]
            r5 = 3
            float[] r2 = new float[r5]
            r2 = {1065353216, 1065353216, 1065353216} // fill-array
            float[] r1 = new float[r5]
            r1 = {1065353216, 1065353216, 1065353216} // fill-array
            float[] r0 = new float[r5]
            r0 = {1065353216, 1065353216, 1065353216} // fill-array
            r7 = 2
            float[][] r18 = new float[][]{r2, r1, r0}
            r6 = 0
        L_0x001c:
            r4 = 0
        L_0x001d:
            r11 = r21
            r10 = r22
            if (r4 >= r10) goto L_0x005b
            r3 = 0
        L_0x0024:
            if (r3 >= r11) goto L_0x0058
            r2 = 0
            r14 = -1
        L_0x0028:
            r1 = -1
        L_0x0029:
            int r15 = r4 + r14
            int r0 = r3 + r1
            if (r15 < 0) goto L_0x0048
            if (r15 >= r10) goto L_0x0048
            if (r0 < 0) goto L_0x0048
            if (r0 >= r11) goto L_0x0048
            int r16 = r14 + 1
            r17 = r18[r16]
            int r16 = r1 + 1
            r16 = r17[r16]
            int r15 = r15 * r21
            int r15 = r15 + r0
            r0 = r20[r15]
            float r0 = r0 * r16
            float r2 = java.lang.Math.max(r2, r0)
        L_0x0048:
            int r1 = r1 + 1
            if (r1 < r7) goto L_0x0029
            int r14 = r14 + 1
            if (r14 < r7) goto L_0x0028
            int r0 = r4 * r21
            int r0 = r0 + r3
            r8[r0] = r2
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0058:
            int r4 = r4 + 1
            goto L_0x001d
        L_0x005b:
            int r6 = r6 + 1
            if (r6 < r9) goto L_0x001c
            float[] r6 = new float[r12]
            float[] r2 = new float[r5]
            r2 = {1065353216, 1065353216, 1065353216} // fill-array
            float[] r1 = new float[r5]
            r1 = {1065353216, 1065353216, 1065353216} // fill-array
            float[] r0 = new float[r5]
            r0 = {1065353216, 1065353216, 1065353216} // fill-array
            float[][] r14 = new float[][]{r2, r1, r0}
            r5 = 0
        L_0x0075:
            r4 = 0
        L_0x0076:
            if (r4 >= r10) goto L_0x00b7
            r3 = 0
        L_0x0079:
            if (r3 >= r11) goto L_0x00b4
            r13 = -1
            r2 = 1
        L_0x007d:
            r12 = -1
        L_0x007e:
            int r1 = r4 + r13
            int r0 = r3 + r12
            if (r1 < 0) goto L_0x009e
            if (r1 >= r10) goto L_0x009e
            if (r0 < 0) goto L_0x009e
            if (r0 >= r11) goto L_0x009e
            if (r2 == 0) goto L_0x009e
            int r1 = r1 * r21
            int r1 = r1 + r0
            r2 = r8[r1]
            int r0 = r13 + 1
            r1 = r14[r0]
            int r0 = r12 + 1
            r0 = r1[r0]
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r2 = 1
            if (r0 >= 0) goto L_0x009f
        L_0x009e:
            r2 = 0
        L_0x009f:
            int r12 = r12 + 1
            if (r12 < r7) goto L_0x007e
            int r13 = r13 + 1
            if (r13 < r7) goto L_0x007d
            int r1 = r4 * r21
            int r1 = r1 + r3
            r0 = 0
            if (r2 == 0) goto L_0x00af
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x00af:
            r6[r1] = r0
            int r3 = r3 + 1
            goto L_0x0079
        L_0x00b4:
            int r4 = r4 + 1
            goto L_0x0076
        L_0x00b7:
            int r5 = r5 + 1
            if (r5 < r9) goto L_0x0075
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LRI.A02(float[], int, int):float[]");
    }

    public static final float[] A00(float[] fArr, int i, int i2) {
        int i3;
        int i4;
        Object next;
        Number number;
        float[] fArr2 = fArr;
        HashMap A1E = AnonymousClass7TE.A1E();
        int length = fArr2.length;
        int[] iArr = new int[length];
        boolean[] zArr = new boolean[length];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i3 = i;
            i4 = i2;
            if (i5 >= i4) {
                break;
            }
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = (i5 * i) + i7;
                if (!zArr[i8] && fArr2[i8] != 0.0f) {
                    Stack stack = new Stack();
                    AnonymousClass7TF.A1M(stack, i8);
                    i6++;
                    while (!stack.isEmpty()) {
                        int A0M = AnonymousClass7TE.A0M(stack.pop());
                        if (A0M >= 0 && A0M < length && !zArr[A0M] && fArr2[A0M] != 0.0f) {
                            zArr[A0M] = true;
                            iArr[A0M] = i6;
                            Integer valueOf = Integer.valueOf(i6);
                            A1E.put(valueOf, Integer.valueOf(AnonymousClass7TG.A0A(JTO.A0z(valueOf, A1E)) + 1));
                            int[][] iArr2 = A01;
                            int i9 = 0;
                            do {
                                int[] iArr3 = iArr2[i9];
                                stack.push(Integer.valueOf((((A0M / i) + iArr3[0]) * i) + (A0M % i) + iArr3[1]));
                                i9++;
                            } while (i9 < 4);
                        }
                    }
                }
            }
            i5++;
        }
        Set entrySet = A1E.entrySet();
        0qQ.A07(entrySet);
        Iterator it = entrySet.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                Integer num = (Integer) ((Map.Entry) next).getValue();
                do {
                    Object next2 = it.next();
                    Integer num2 = (Integer) ((Map.Entry) next2).getValue();
                    if (num.compareTo(num2) < 0) {
                        next = next2;
                        num = num2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (!(entry == null || (number = (Number) entry.getKey()) == null)) {
            int intValue = number.intValue();
            fArr2 = new float[length];
            for (int i10 = 0; i10 < i4; i10++) {
                for (int i11 = 0; i11 < i3; i11++) {
                    int i12 = (i10 * i) + i11;
                    if (iArr[i12] == intValue) {
                        fArr2[i12] = 1.0f;
                    }
                }
            }
        }
        return fArr2;
    }
}
