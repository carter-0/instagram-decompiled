package X;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* renamed from: X.SMu  reason: case insensitive filesystem */
public abstract class C11320SMu {
    public static SNH A00 = SNH.A00("x", "y");
    public static SNH A01 = SNH.A01("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final Interpolator A02 = new LinearInterpolator();

    public static BaseInterpolator A00(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        PointF pointF3 = SQL.A00;
        pointF.x = Pxi.A01(1.0f, f, -1.0f);
        pointF.y = Pxi.A01(100.0f, pointF.y, -100.0f);
        float A012 = Pxi.A01(1.0f, pointF2.x, -1.0f);
        pointF2.x = A012;
        float A013 = Pxi.A01(100.0f, pointF2.y, -100.0f);
        pointF2.y = A013;
        try {
            return new PathInterpolator(pointF.x, pointF.y, A012, A013);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                return new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0130, code lost:
        r5.A0L();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.ST4 A01(X.S7N r16, X.C13520Tbp r17, X.C12828T8z r18, float r19, boolean r20, boolean r21) {
        /*
            r6 = r17
            r5 = r18
            r4 = r19
            if (r20 == 0) goto L_0x01ef
            r17 = r16
            if (r21 == 0) goto L_0x017e
            r5.A0J()
            r14 = 0
            r15 = 0
            r11 = 0
            r10 = 0
            r8 = 0
            r19 = 0
            r7 = 0
            r1 = 0
            r0 = 0
            r21 = 0
            r13 = 0
            r20 = 0
        L_0x001e:
            boolean r2 = r5.A0Q()
            if (r2 == 0) goto L_0x0151
            X.SNH r2 = A01
            int r2 = r5.A0D(r2)
            r9 = 1
            switch(r2) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0037;
                case 2: goto L_0x003c;
                case 3: goto L_0x0041;
                case 4: goto L_0x00bc;
                case 5: goto L_0x013b;
                case 6: goto L_0x0145;
                case 7: goto L_0x014b;
                default: goto L_0x002e;
            }
        L_0x002e:
            r5.A0N()
            goto L_0x001e
        L_0x0032:
            float r21 = X.Pxh.A02(r5)
            goto L_0x001e
        L_0x0037:
            java.lang.Object r19 = r6.E1k(r5, r4)
            goto L_0x001e
        L_0x003c:
            java.lang.Object r20 = r6.E1k(r5, r4)
            goto L_0x001e
        L_0x0041:
            java.lang.Integer r3 = r5.A0E()
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r3 != r2) goto L_0x00b6
            r5.A0J()
            r12 = 0
            r7 = 0
            r3 = 0
            r2 = 0
        L_0x0050:
            boolean r8 = r5.A0Q()
            if (r8 == 0) goto L_0x00ab
            X.SNH r8 = A00
            int r8 = r5.A0D(r8)
            if (r8 == 0) goto L_0x0086
            if (r8 == r9) goto L_0x0064
            r5.A0N()
            goto L_0x0050
        L_0x0064:
            java.lang.Integer r2 = r5.A0E()
            java.lang.Integer r8 = X.AnonymousClass05K.A0u
            if (r2 != r8) goto L_0x0072
            float r2 = X.Pxh.A02(r5)
            r7 = r2
            goto L_0x0050
        L_0x0072:
            r5.A0I()
            float r7 = X.Pxh.A02(r5)
            java.lang.Integer r2 = r5.A0E()
            if (r2 != r8) goto L_0x0084
            float r2 = X.Pxh.A02(r5)
            goto L_0x00a5
        L_0x0084:
            r2 = r7
            goto L_0x00a5
        L_0x0086:
            java.lang.Integer r3 = r5.A0E()
            java.lang.Integer r8 = X.AnonymousClass05K.A0u
            if (r3 != r8) goto L_0x0094
            float r3 = X.Pxh.A02(r5)
            r12 = r3
            goto L_0x0050
        L_0x0094:
            r5.A0I()
            float r12 = X.Pxh.A02(r5)
            java.lang.Integer r3 = r5.A0E()
            if (r3 != r8) goto L_0x00a9
            float r3 = X.Pxh.A02(r5)
        L_0x00a5:
            r5.A0K()
            goto L_0x0050
        L_0x00a9:
            r3 = r12
            goto L_0x00a5
        L_0x00ab:
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>(r12, r7)
            android.graphics.PointF r7 = new android.graphics.PointF
            r7.<init>(r3, r2)
            goto L_0x0130
        L_0x00b6:
            android.graphics.PointF r11 = X.C11400SRv.A02(r5, r4)
            goto L_0x001e
        L_0x00bc:
            java.lang.Integer r3 = r5.A0E()
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r3 != r2) goto L_0x0135
            r5.A0J()
            r12 = 0
            r0 = 0
            r3 = 0
            r2 = 0
        L_0x00cb:
            boolean r1 = r5.A0Q()
            if (r1 == 0) goto L_0x0126
            X.SNH r1 = A00
            int r1 = r5.A0D(r1)
            if (r1 == 0) goto L_0x00ed
            if (r1 == r9) goto L_0x00df
            r5.A0N()
            goto L_0x00cb
        L_0x00df:
            java.lang.Integer r0 = r5.A0E()
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            if (r0 != r2) goto L_0x010f
            float r2 = X.Pxh.A02(r5)
            r0 = r2
            goto L_0x00cb
        L_0x00ed:
            java.lang.Integer r1 = r5.A0E()
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            if (r1 != r3) goto L_0x00fb
            float r3 = X.Pxh.A02(r5)
            r12 = r3
            goto L_0x00cb
        L_0x00fb:
            r5.A0I()
            float r12 = X.Pxh.A02(r5)
            java.lang.Integer r1 = r5.A0E()
            if (r1 != r3) goto L_0x010d
            float r3 = X.Pxh.A02(r5)
            goto L_0x0120
        L_0x010d:
            r3 = r12
            goto L_0x0120
        L_0x010f:
            r5.A0I()
            float r0 = X.Pxh.A02(r5)
            java.lang.Integer r1 = r5.A0E()
            if (r1 != r2) goto L_0x0124
            float r2 = X.Pxh.A02(r5)
        L_0x0120:
            r5.A0K()
            goto L_0x00cb
        L_0x0124:
            r2 = r0
            goto L_0x0120
        L_0x0126:
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r12, r0)
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r3, r2)
        L_0x0130:
            r5.A0L()
            goto L_0x001e
        L_0x0135:
            android.graphics.PointF r10 = X.C11400SRv.A02(r5, r4)
            goto L_0x001e
        L_0x013b:
            int r2 = r5.A0C()
            boolean r15 = X.AnonymousClass7TF.A1S(r2, r9)
            goto L_0x001e
        L_0x0145:
            android.graphics.PointF r13 = X.C11400SRv.A02(r5, r4)
            goto L_0x001e
        L_0x014b:
            android.graphics.PointF r14 = X.C11400SRv.A02(r5, r4)
            goto L_0x001e
        L_0x0151:
            r5.A0L()
            if (r15 != 0) goto L_0x01ea
            if (r11 == 0) goto L_0x015f
            if (r10 == 0) goto L_0x015f
            android.view.animation.BaseInterpolator r16 = A00(r11, r10)
            goto L_0x01db
        L_0x015f:
            if (r8 == 0) goto L_0x01e7
            if (r7 == 0) goto L_0x01e7
            if (r1 == 0) goto L_0x01e7
            if (r0 == 0) goto L_0x01e7
            android.view.animation.BaseInterpolator r1 = A00(r8, r1)
            android.view.animation.BaseInterpolator r2 = A00(r7, r0)
            X.ST4 r15 = new X.ST4
            r0 = r15
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r0.<init>((android.view.animation.Interpolator) r1, (android.view.animation.Interpolator) r2, (X.S7N) r3, (java.lang.Object) r4, (java.lang.Object) r5, (float) r6)
            goto L_0x01e2
        L_0x017e:
            r5.A0J()
            r3 = 0
            r2 = r3
            r20 = r3
            r19 = r3
            r13 = r3
            r14 = r3
            r7 = 0
            r21 = 0
        L_0x018c:
            boolean r0 = r5.A0Q()
            if (r0 == 0) goto L_0x01ce
            X.SNH r0 = A01
            int r1 = r5.A0D(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r1) {
                case 0: goto L_0x01a1;
                case 1: goto L_0x01a6;
                case 2: goto L_0x01ab;
                case 3: goto L_0x01b0;
                case 4: goto L_0x01b5;
                case 5: goto L_0x01ba;
                case 6: goto L_0x01c4;
                case 7: goto L_0x01c9;
                default: goto L_0x019d;
            }
        L_0x019d:
            r5.A0N()
            goto L_0x018c
        L_0x01a1:
            float r21 = X.Pxh.A02(r5)
            goto L_0x018c
        L_0x01a6:
            java.lang.Object r19 = r6.E1k(r5, r4)
            goto L_0x018c
        L_0x01ab:
            java.lang.Object r20 = r6.E1k(r5, r4)
            goto L_0x018c
        L_0x01b0:
            android.graphics.PointF r3 = X.C11400SRv.A02(r5, r0)
            goto L_0x018c
        L_0x01b5:
            android.graphics.PointF r2 = X.C11400SRv.A02(r5, r0)
            goto L_0x018c
        L_0x01ba:
            int r1 = r5.A0C()
            r0 = 1
            boolean r7 = X.AnonymousClass7TF.A1S(r1, r0)
            goto L_0x018c
        L_0x01c4:
            android.graphics.PointF r13 = X.C11400SRv.A02(r5, r4)
            goto L_0x018c
        L_0x01c9:
            android.graphics.PointF r14 = X.C11400SRv.A02(r5, r4)
            goto L_0x018c
        L_0x01ce:
            r5.A0L()
            if (r7 != 0) goto L_0x01ea
            if (r3 == 0) goto L_0x01e7
            if (r2 == 0) goto L_0x01e7
            android.view.animation.BaseInterpolator r16 = A00(r3, r2)
        L_0x01db:
            r18 = 0
            X.ST4 r15 = new X.ST4
            r15.<init>((android.view.animation.Interpolator) r16, (X.S7N) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
        L_0x01e2:
            r15.A05 = r13
            r15.A06 = r14
            return r15
        L_0x01e7:
            android.view.animation.Interpolator r16 = A02
            goto L_0x01db
        L_0x01ea:
            android.view.animation.Interpolator r16 = A02
            r20 = r19
            goto L_0x01db
        L_0x01ef:
            java.lang.Object r0 = r6.E1k(r5, r4)
            X.ST4 r15 = new X.ST4
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11320SMu.A01(X.S7N, X.Tbp, X.T8z, float, boolean, boolean):X.ST4");
    }
}
