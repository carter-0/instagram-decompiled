package X;

import android.view.View;

/* renamed from: X.7zZ  reason: invalid class name and case insensitive filesystem */
public class C349087zZ extends C228432lf {
    public AnonymousClass3BB A00;
    public AnonymousClass3BB A01;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = r5 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(X.C252553pI r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C252563pJ
            r6 = -1
            if (r0 == 0) goto L_0x0079
            int r5 = r11.A0U()
            if (r5 == 0) goto L_0x0079
            android.view.View r0 = r10.A03(r11)
            if (r0 == 0) goto L_0x0079
            int r4 = X.C252553pI.A06(r0)
            if (r4 == r6) goto L_0x0079
            r0 = r11
            X.3pJ r0 = (X.C252563pJ) r0
            int r3 = r5 + -1
            android.graphics.PointF r8 = r0.AIp(r3)
            if (r8 == 0) goto L_0x0079
            boolean r0 = r11.A1X()
            r9 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0076
            X.3BB r1 = r10.A00
            if (r1 == 0) goto L_0x0032
            X.3pI r0 = r1.A02
            if (r0 == r11) goto L_0x0039
        L_0x0032:
            X.3BC r1 = new X.3BC
            r1.<init>(r11)
            r10.A00 = r1
        L_0x0039:
            int r7 = r10.A00(r1, r11, r12, r2)
            float r0 = r8.x
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
            int r7 = -r7
        L_0x0044:
            boolean r0 = r11.A1Y()
            if (r0 == 0) goto L_0x0074
            X.3BB r1 = r10.A01
            if (r1 == 0) goto L_0x0052
            X.3pI r0 = r1.A02
            if (r0 == r11) goto L_0x0059
        L_0x0052:
            X.3Cy r1 = new X.3Cy
            r1.<init>(r11)
            r10.A01 = r1
        L_0x0059:
            int r1 = r10.A00(r1, r11, r2, r13)
            float r0 = r8.y
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0064
            int r1 = -r1
        L_0x0064:
            boolean r0 = r11.A1Y()
            if (r0 == 0) goto L_0x006b
            r7 = r1
        L_0x006b:
            if (r7 == 0) goto L_0x0079
            int r4 = r4 + r7
            if (r4 < 0) goto L_0x0071
            r2 = r4
        L_0x0071:
            if (r2 >= r5) goto L_0x0078
            return r2
        L_0x0074:
            r1 = 0
            goto L_0x0064
        L_0x0076:
            r7 = 0
            goto L_0x0044
        L_0x0078:
            return r3
        L_0x0079:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C349087zZ.A02(X.3pI, int, int):int");
    }

    public final int[] A09(View view, C252553pI r9) {
        if (this instanceof AnonymousClass9YK) {
            return ((AnonymousClass9YK) this).A00.A03(view, r9);
        }
        int[] iArr = new int[2];
        if (r9.A1X()) {
            AnonymousClass3BB r3 = this.A00;
            if (r3 == null || r3.A02 != r9) {
                r3 = new AnonymousClass3BC(r9);
                this.A00 = r3;
            }
            iArr[0] = (r3.A0D(view) + (r3.A0B(view) / 2)) - (r3.A06() + (r3.A07() / 2));
        } else {
            iArr[0] = 0;
        }
        if (r9.A1Y()) {
            AnonymousClass3BB r32 = this.A01;
            if (r32 == null || r32.A02 != r9) {
                r32 = new C238673Cy(r9);
                this.A01 = r32;
            }
            iArr[1] = (r32.A0D(view) + (r32.A0B(view) / 2)) - (r32.A06() + (r32.A07() / 2));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A00(X.AnonymousClass3BB r12, X.C252553pI r13, int r14, int r15) {
        /*
            r11 = this;
            int[] r10 = r11.A08(r14, r15)
            int r9 = r13.A0T()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x002c
            r7 = 0
            r6 = 0
            r4 = r6
            r5 = 2147483647(0x7fffffff, float:NaN)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0014:
            if (r7 >= r9) goto L_0x002f
            android.view.View r2 = r13.A0X(r7)
            int r1 = X.C252553pI.A06(r2)
            r0 = -1
            if (r1 == r0) goto L_0x0029
            if (r1 >= r5) goto L_0x0025
            r6 = r2
            r5 = r1
        L_0x0025:
            if (r1 <= r3) goto L_0x0029
            r4 = r2
            r3 = r1
        L_0x0029:
            int r7 = r7 + 1
            goto L_0x0014
        L_0x002c:
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0055
        L_0x002f:
            if (r6 == 0) goto L_0x002c
            if (r4 == 0) goto L_0x002c
            int r1 = r12.A0D(r6)
            int r0 = r12.A0D(r4)
            int r2 = java.lang.Math.min(r1, r0)
            int r1 = r12.A08(r6)
            int r0 = r12.A08(r4)
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = r0 - r2
            if (r0 == 0) goto L_0x002c
            float r4 = (float) r0
            float r4 = r4 * r8
            int r3 = r3 - r5
            int r0 = r3 + 1
            float r0 = (float) r0
            float r4 = r4 / r0
        L_0x0055:
            r1 = 0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x005c
            return r1
        L_0x005c:
            r3 = r10[r1]
            int r2 = java.lang.Math.abs(r3)
            r0 = 1
            r1 = r10[r0]
            int r0 = java.lang.Math.abs(r1)
            if (r2 <= r0) goto L_0x006c
            r1 = r3
        L_0x006c:
            float r0 = (float) r1
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C349087zZ.A00(X.3BB, X.3pI, int, int):int");
    }

    public View A03(C252553pI r10) {
        AnonymousClass3BB r8;
        if (r10.A1Y()) {
            r8 = this.A01;
            if (r8 == null || r8.A02 != r10) {
                r8 = new C238673Cy(r10);
                this.A01 = r8;
            }
        } else if (!r10.A1X()) {
            return null;
        } else {
            r8 = this.A00;
            if (r8 == null || r8.A02 != r10) {
                r8 = new AnonymousClass3BC(r10);
                this.A00 = r8;
            }
        }
        int A0T = r10.A0T();
        View view = null;
        if (A0T == 0) {
            return null;
        }
        int A06 = r8.A06() + (r8.A07() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A0T; i2++) {
            View A0X = r10.A0X(i2);
            int abs = Math.abs((r8.A0D(A0X) + (r8.A0B(A0X) / 2)) - A06);
            if (abs < i) {
                view = A0X;
                i = abs;
            }
        }
        return view;
    }
}
