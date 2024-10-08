package X;

import android.view.Choreographer;

/* renamed from: X.7Nm  reason: invalid class name and case insensitive filesystem */
public abstract class C330607Nm {
    public Choreographer.FrameCallback A00;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(long r18) {
        /*
            r17 = this;
            r0 = r17
            X.7Nl r0 = (X.C330597Nl) r0
            r16 = r0
            X.7Nj r7 = r0.A00
            long r3 = r7.A01
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r0 = r18
            if (r2 != 0) goto L_0x0014
            r7.A01 = r0
        L_0x0014:
            java.util.List r15 = r7.A09
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L_0x007f
            long r3 = r7.A01
            int r2 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x007f
            r2 = 0
            java.lang.Object r6 = r15.remove(r2)
            r6.getClass()
            X.VRx r6 = (X.C17344VRx) r6
            java.util.List r4 = r7.A07
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x0079
            int r2 = r4.size()
            int r2 = r2 + -1
            java.lang.Object r9 = r4.remove(r2)
            r9.getClass()
            X.Vcl r9 = (X.C17716Vcl) r9
            r2 = 0
            r9.A08 = r2
            r2 = 0
            r9.A00 = r2
        L_0x004a:
            java.util.List r5 = r7.A08
            r5.add(r9)
            X.X3m r8 = r6.A01
            android.graphics.Rect r2 = r7.A01
            int r10 = r2.width()
            int r11 = r2.height()
            long r12 = r7.A01
            r8.AJ6(r9, r10, r11, r12)
            long r2 = r7.A01
            r9.A08 = r2
            android.graphics.Bitmap r2 = r9.A09
            if (r2 != 0) goto L_0x0071
            r2 = 0
            r9.A09 = r2
            r5.remove(r9)
            r4.add(r9)
        L_0x0071:
            long r4 = r7.A01
            long r2 = r6.A00
            long r4 = r4 + r2
            r7.A01 = r4
            goto L_0x0014
        L_0x0079:
            X.Vcl r9 = new X.Vcl
            r9.<init>()
            goto L_0x004a
        L_0x007f:
            java.util.List r10 = r7.A08
            int r9 = r10.size()
        L_0x0085:
            int r9 = r9 + -1
            if (r9 < 0) goto L_0x016e
            java.lang.Object r8 = r10.get(r9)
            X.Vcl r8 = (X.C17716Vcl) r8
            long r4 = r8.A08
            long r2 = r18 - r4
            float r12 = (float) r2
            r2 = 814313567(0x3089705f, float:1.0E-9)
            float r12 = r12 * r2
            android.graphics.PointF r5 = r8.A0D
            float r3 = r5.y
            r14 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0164
            float r2 = r8.A04
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0164
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            float r2 = r2.floatValue()
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            r4 = 1
            if (r2 >= 0) goto L_0x00b7
            r4 = -1
        L_0x00b7:
            float r2 = r8.A04
            int r3 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            r2 = 1
            if (r3 >= 0) goto L_0x00bf
            r2 = -1
        L_0x00bf:
            if (r4 == r2) goto L_0x0164
            float r6 = r8.A04
            r11 = 1084227584(0x40a00000, float:5.0)
            r4 = 1097859072(0x41700000, float:15.0)
            float r3 = r5.y
            float r2 = -r3
            float r2 = r2 * r4
            float r2 = r2 / r6
            float r2 = r2 + r11
            float r6 = r6 * r2
            float r6 = r6 * r12
            float r3 = r3 + r6
            r5.y = r3
            float r4 = r5.x
            r2 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 * r12
            float r2 = r14 - r2
            float r2 = java.lang.Math.max(r13, r2)
            float r4 = r4 * r2
            r5.x = r4
        L_0x00e0:
            android.graphics.PointF r4 = r8.A0C
            float r11 = r4.x
            float r2 = r5.x
            float r2 = r2 * r12
            float r11 = r11 + r2
            r4.x = r11
            float r6 = r4.y
            float r3 = r3 * r12
            float r6 = r6 + r3
            r4.y = r6
            android.graphics.PointF r5 = r8.A0B
            android.graphics.PointF r4 = r8.A0A
            float r3 = r4.x
            float r2 = r8.A00
            float r11 = r11 - r3
            float r11 = r11 * r2
            float r3 = r3 + r11
            r5.x = r3
            float r3 = r4.y
            float r6 = r6 - r3
            float r6 = r6 * r2
            float r3 = r3 + r6
            r5.y = r3
            float r3 = r8.A06
            float r3 = r3 * r2
            r8.A02 = r3
            float r4 = r8.A07
            float r3 = r8.A03
            android.view.animation.AccelerateInterpolator r6 = r7.A05
            float r2 = r6.getInterpolation(r2)
            float r3 = r3 - r4
            float r3 = r3 * r2
            float r4 = r4 + r3
            r8.A01 = r4
            float r3 = r8.A00
            r2 = 1077936128(0x40400000, float:3.0)
            float r12 = r12 * r2
            float r2 = r14 - r3
            float r2 = r2 * r12
            float r3 = r3 + r2
            float r2 = java.lang.Math.min(r14, r3)
            r8.A00 = r2
            r8.A08 = r0
            float r2 = r8.A04
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            float r3 = r5.y
            android.graphics.Bitmap r2 = r8.A09
            if (r4 >= 0) goto L_0x014e
            if (r2 != 0) goto L_0x0149
            r2 = 0
        L_0x0136:
            float r2 = (float) r2
            float r3 = r3 + r2
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0085
        L_0x013c:
            r2 = 0
            r8.A09 = r2
            r10.remove(r8)
            java.util.List r2 = r7.A07
            r2.add(r8)
            goto L_0x0085
        L_0x0149:
            int r2 = r2.getHeight()
            goto L_0x0136
        L_0x014e:
            if (r2 != 0) goto L_0x015f
            r2 = 0
        L_0x0151:
            float r2 = (float) r2
            float r3 = r3 - r2
            android.graphics.Rect r2 = r7.A01
            int r2 = r2.height()
            float r2 = (float) r2
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0085
            goto L_0x013c
        L_0x015f:
            int r2 = r2.getHeight()
            goto L_0x0151
        L_0x0164:
            float r3 = r5.y
            float r2 = r8.A04
            float r2 = r2 * r12
            float r3 = r3 + r2
            r5.y = r3
            goto L_0x00e0
        L_0x016e:
            X.7No r2 = r7.A00
            if (r2 == 0) goto L_0x017b
            X.7Nn r3 = r2.A00
            X.7Nk r2 = r3.A00
            if (r7 != r2) goto L_0x017b
            r3.invalidate()
        L_0x017b:
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x018b
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L_0x018b
            r7.A00()
            return
        L_0x018b:
            X.Tpc r3 = X.C14086Tpc.A01
            r2 = r16
            r3.A00(r2)
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C330607Nm.A00(long):void");
    }
}
