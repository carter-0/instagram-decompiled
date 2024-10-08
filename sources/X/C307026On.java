package X;

import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.6On  reason: invalid class name and case insensitive filesystem */
public final class C307026On implements View.OnTouchListener {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03 = false;
    public final GestureDetector A04;
    public final ScaleGestureDetector A05;
    public final C307016Om A06;
    public final boolean A07;

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0179, code lost:
        if (r2.A01(r0) != null) goto L_0x017b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0182 A[Catch:{ all -> 0x02ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x018a A[Catch:{ all -> 0x02ce }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r16, android.view.MotionEvent r17) {
        /*
            r15 = this;
            android.graphics.Matrix r0 = X.C18396Vqw.A00
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r17)
            android.graphics.Matrix r0 = r16.getMatrix()
            r9.transform(r0)
            int r0 = r16.getLeft()
            float r1 = (float) r0
            int r0 = r16.getTop()
            float r0 = (float) r0
            r9.offsetLocation(r1, r0)
            android.view.ScaleGestureDetector r0 = r15.A05     // Catch:{ all -> 0x02ce }
            r0.onTouchEvent(r9)     // Catch:{ all -> 0x02ce }
            android.view.ViewParent r10 = r16.getParent()     // Catch:{ all -> 0x02ce }
            boolean r0 = r0.isInProgress()     // Catch:{ all -> 0x02ce }
            r8 = 1
            if (r0 == 0) goto L_0x003d
            X.6Om r1 = r15.A06     // Catch:{ all -> 0x02ce }
            r0 = 44
            X.4uI r0 = r1.A01(r0)     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x003d
            if (r10 == 0) goto L_0x003b
            r10.requestDisallowInterceptTouchEvent(r8)     // Catch:{ all -> 0x02ce }
            r15.A02 = r8     // Catch:{ all -> 0x02ce }
        L_0x003b:
            r4 = 1
            goto L_0x0043
        L_0x003d:
            android.view.GestureDetector r0 = r15.A04     // Catch:{ all -> 0x02ce }
            boolean r4 = r0.onTouchEvent(r9)     // Catch:{ all -> 0x02ce }
        L_0x0043:
            int r0 = r9.getActionMasked()     // Catch:{ all -> 0x02ce }
            if (r10 == 0) goto L_0x0203
            if (r0 == 0) goto L_0x01f0
            r7 = 0
            if (r0 == r8) goto L_0x0192
            r12 = 2
            if (r0 == r12) goto L_0x0113
            r11 = 3
            if (r0 != r11) goto L_0x0203
            X.6Om r5 = r15.A06     // Catch:{ all -> 0x02ce }
            r0 = 61
            X.4uI r4 = r5.A01(r0)     // Catch:{ all -> 0x02ce }
            boolean r0 = r5.A02     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x00af
            if (r4 == 0) goto L_0x00af
            android.view.View r0 = r5.A01     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x00af
            X.4tV r3 = r5.A07     // Catch:{ all -> 0x02ce }
            X.6Tl r6 = new X.6Tl     // Catch:{ all -> 0x02ce }
            r6.<init>()     // Catch:{ all -> 0x02ce }
            X.4tV r0 = r5.A06     // Catch:{ all -> 0x02ce }
            r6.A03(r0, r7)     // Catch:{ all -> 0x02ce }
            X.6Rm r2 = r5.A05     // Catch:{ all -> 0x02ce }
            r6.A03(r2, r8)     // Catch:{ all -> 0x02ce }
            r6.A03(r3, r12)     // Catch:{ all -> 0x02ce }
            java.lang.String r0 = "cancelled"
            r6.A03(r0, r11)     // Catch:{ all -> 0x02ce }
            r1 = 4
            float r13 = r9.getX()     // Catch:{ all -> 0x02ce }
            android.view.View r0 = r5.A01     // Catch:{ all -> 0x02ce }
            float r0 = r0.getX()     // Catch:{ all -> 0x02ce }
            float r13 = r13 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x02ce }
            r6.A03(r0, r1)     // Catch:{ all -> 0x02ce }
            r1 = 5
            float r13 = r9.getY()     // Catch:{ all -> 0x02ce }
            android.view.View r0 = r5.A01     // Catch:{ all -> 0x02ce }
            float r0 = r0.getY()     // Catch:{ all -> 0x02ce }
            float r13 = r13 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x02ce }
            r6.A03(r0, r1)     // Catch:{ all -> 0x02ce }
            java.util.List r1 = r6.A00     // Catch:{ all -> 0x02ce }
            X.6Tm r0 = new X.6Tm     // Catch:{ all -> 0x02ce }
            r0.<init>(r1)     // Catch:{ all -> 0x02ce }
            X.C307886Rw.A03(r2, r3, r0, r4)     // Catch:{ all -> 0x02ce }
        L_0x00af:
            r0 = 66
            X.4uI r4 = r5.A01(r0)     // Catch:{ all -> 0x02ce }
            if (r4 == 0) goto L_0x010f
            android.view.View r0 = r5.A01     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x010f
            float r2 = r9.getX()     // Catch:{ all -> 0x02ce }
            float r0 = r9.getY()     // Catch:{ all -> 0x02ce }
            android.graphics.PointF r1 = new android.graphics.PointF     // Catch:{ all -> 0x02ce }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02ce }
            android.view.View r0 = r5.A01     // Catch:{ all -> 0x02ce }
            android.graphics.PointF r1 = X.C18396Vqw.A00(r1, r0)     // Catch:{ all -> 0x02ce }
            X.4tV r3 = r5.A07     // Catch:{ all -> 0x02ce }
            X.6Tl r6 = new X.6Tl     // Catch:{ all -> 0x02ce }
            r6.<init>()     // Catch:{ all -> 0x02ce }
            X.4tV r0 = r5.A06     // Catch:{ all -> 0x02ce }
            r6.A03(r0, r7)     // Catch:{ all -> 0x02ce }
            X.6Rm r2 = r5.A05     // Catch:{ all -> 0x02ce }
            r6.A03(r2, r8)     // Catch:{ all -> 0x02ce }
            float r13 = r1.x     // Catch:{ all -> 0x02ce }
            r14 = 1120403456(0x42c80000, float:100.0)
            float r13 = r13 * r14
            android.view.View r0 = r5.A01     // Catch:{ all -> 0x02ce }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x02ce }
            float r0 = (float) r0     // Catch:{ all -> 0x02ce }
            float r13 = r13 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x02ce }
            r6.A03(r0, r12)     // Catch:{ all -> 0x02ce }
            float r1 = r1.y     // Catch:{ all -> 0x02ce }
            float r1 = r1 * r14
            android.view.View r0 = r5.A01     // Catch:{ all -> 0x02ce }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x02ce }
            float r0 = (float) r0     // Catch:{ all -> 0x02ce }
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x02ce }
            r6.A03(r0, r11)     // Catch:{ all -> 0x02ce }
            java.util.List r1 = r6.A00     // Catch:{ all -> 0x02ce }
            X.6Tm r0 = new X.6Tm     // Catch:{ all -> 0x02ce }
            r0.<init>(r1)     // Catch:{ all -> 0x02ce }
            X.C307886Rw.A03(r2, r3, r0, r4)     // Catch:{ all -> 0x02ce }
        L_0x010f:
            r5.A02 = r7     // Catch:{ all -> 0x02ce }
            goto L_0x02b3
        L_0x0113:
            float r0 = r15.A00     // Catch:{ all -> 0x02ce }
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x017d
            float r0 = r15.A01     // Catch:{ all -> 0x02ce }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x017d
            int r0 = r9.getPointerCount()     // Catch:{ all -> 0x02ce }
            if (r0 <= r8) goto L_0x0133
            X.6Om r1 = r15.A06     // Catch:{ all -> 0x02ce }
            r0 = 44
            X.4uI r0 = r1.A01(r0)     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x0133
            goto L_0x017b
        L_0x0133:
            X.6Om r2 = r15.A06     // Catch:{ all -> 0x02ce }
            boolean r0 = r2.A04     // Catch:{ all -> 0x02ce }
            if (r0 != 0) goto L_0x013d
            boolean r0 = r2.A03     // Catch:{ all -> 0x02ce }
            if (r0 != 0) goto L_0x0146
        L_0x013d:
            r0 = 48
            X.4uI r0 = r2.A01(r0)     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x0146
            goto L_0x017b
        L_0x0146:
            float r3 = r9.getX()     // Catch:{ all -> 0x02ce }
            float r0 = r15.A00     // Catch:{ all -> 0x02ce }
            float r3 = r3 - r0
            float r1 = r9.getY()     // Catch:{ all -> 0x02ce }
            float r0 = r15.A01     // Catch:{ all -> 0x02ce }
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)     // Catch:{ all -> 0x02ce }
            float r0 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x02ce }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x016b
            r0 = 38
            X.4uI r0 = r2.A01(r0)     // Catch:{ all -> 0x02ce }
            if (r0 != 0) goto L_0x017b
            r0 = 42
            goto L_0x0175
        L_0x016b:
            r0 = 40
            X.4uI r0 = r2.A01(r0)     // Catch:{ all -> 0x02ce }
            if (r0 != 0) goto L_0x017b
            r0 = 41
        L_0x0175:
            X.4uI r0 = r2.A01(r0)     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x017d
        L_0x017b:
            r1 = 1
            goto L_0x017e
        L_0x017d:
            r1 = 0
        L_0x017e:
            boolean r0 = r15.A02     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x018a
            if (r1 != 0) goto L_0x0203
            r10.requestDisallowInterceptTouchEvent(r7)     // Catch:{ all -> 0x02ce }
            r15.A02 = r7     // Catch:{ all -> 0x02ce }
            goto L_0x0203
        L_0x018a:
            if (r1 == 0) goto L_0x0203
            r10.requestDisallowInterceptTouchEvent(r8)     // Catch:{ all -> 0x02ce }
            r15.A02 = r8     // Catch:{ all -> 0x02ce }
            goto L_0x0203
        L_0x0192:
            X.6Om r6 = r15.A06     // Catch:{ all -> 0x02ce }
            r6.A04 = r7     // Catch:{ all -> 0x02ce }
            boolean r0 = r6.A02     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x0251
            android.view.View r0 = r6.A01     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x024f
            r0 = 53
            X.4uI r11 = r6.A01(r0)     // Catch:{ all -> 0x02ce }
            r0 = 61
            X.4uI r5 = r6.A01(r0)     // Catch:{ all -> 0x02ce }
            r2 = 3
            r12 = 2
            if (r11 == 0) goto L_0x01ed
            X.4tV r4 = r6.A07     // Catch:{ all -> 0x02ce }
            X.6Tl r1 = new X.6Tl     // Catch:{ all -> 0x02ce }
            r1.<init>()     // Catch:{ all -> 0x02ce }
            X.4tV r0 = r6.A06     // Catch:{ all -> 0x02ce }
            r1.A03(r0, r7)     // Catch:{ all -> 0x02ce }
            X.6Rm r3 = r6.A05     // Catch:{ all -> 0x02ce }
            r1.A03(r3, r8)     // Catch:{ all -> 0x02ce }
            float r13 = r9.getX()     // Catch:{ all -> 0x02ce }
            android.view.View r0 = r6.A01     // Catch:{ all -> 0x02ce }
            float r0 = r0.getX()     // Catch:{ all -> 0x02ce }
            float r13 = r13 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x02ce }
            r1.A03(r0, r12)     // Catch:{ all -> 0x02ce }
            float r13 = r9.getY()     // Catch:{ all -> 0x02ce }
            android.view.View r0 = r6.A01     // Catch:{ all -> 0x02ce }
            float r0 = r0.getY()     // Catch:{ all -> 0x02ce }
            float r13 = r13 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r13)     // Catch:{ all -> 0x02ce }
            r1.A03(r0, r2)     // Catch:{ all -> 0x02ce }
            java.util.List r1 = r1.A00     // Catch:{ all -> 0x02ce }
            X.6Tm r0 = new X.6Tm     // Catch:{ all -> 0x02ce }
            r0.<init>(r1)     // Catch:{ all -> 0x02ce }
            X.C307886Rw.A03(r3, r4, r0, r11)     // Catch:{ all -> 0x02ce }
        L_0x01ed:
            if (r5 == 0) goto L_0x024f
            goto L_0x0206
        L_0x01f0:
            float r0 = r9.getX()     // Catch:{ all -> 0x02ce }
            r15.A00 = r0     // Catch:{ all -> 0x02ce }
            float r0 = r9.getY()     // Catch:{ all -> 0x02ce }
            r15.A01 = r0     // Catch:{ all -> 0x02ce }
            r10.requestDisallowInterceptTouchEvent(r8)     // Catch:{ all -> 0x02ce }
            r15.A02 = r8     // Catch:{ all -> 0x02ce }
            r15.A03 = r8     // Catch:{ all -> 0x02ce }
        L_0x0203:
            r8 = r4
            goto L_0x02c5
        L_0x0206:
            X.4tV r4 = r6.A07     // Catch:{ all -> 0x02ce }
            X.6Tl r11 = new X.6Tl     // Catch:{ all -> 0x02ce }
            r11.<init>()     // Catch:{ all -> 0x02ce }
            X.4tV r0 = r6.A06     // Catch:{ all -> 0x02ce }
            r11.A03(r0, r7)     // Catch:{ all -> 0x02ce }
            X.6Rm r3 = r6.A05     // Catch:{ all -> 0x02ce }
            r11.A03(r3, r8)     // Catch:{ all -> 0x02ce }
            r11.A03(r4, r12)     // Catch:{ all -> 0x02ce }
            java.lang.String r0 = "released"
            r11.A03(r0, r2)     // Catch:{ all -> 0x02ce }
            r2 = 4
            float r1 = r9.getX()     // Catch:{ all -> 0x02ce }
            android.view.View r0 = r6.A01     // Catch:{ all -> 0x02ce }
            float r0 = r0.getX()     // Catch:{ all -> 0x02ce }
            float r1 = r1 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x02ce }
            r11.A03(r0, r2)     // Catch:{ all -> 0x02ce }
            r2 = 5
            float r1 = r9.getY()     // Catch:{ all -> 0x02ce }
            android.view.View r0 = r6.A01     // Catch:{ all -> 0x02ce }
            float r0 = r0.getY()     // Catch:{ all -> 0x02ce }
            float r1 = r1 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x02ce }
            r11.A03(r0, r2)     // Catch:{ all -> 0x02ce }
            java.util.List r1 = r11.A00     // Catch:{ all -> 0x02ce }
            X.6Tm r0 = new X.6Tm     // Catch:{ all -> 0x02ce }
            r0.<init>(r1)     // Catch:{ all -> 0x02ce }
            X.C307886Rw.A03(r3, r4, r0, r5)     // Catch:{ all -> 0x02ce }
        L_0x024f:
            r6.A02 = r7     // Catch:{ all -> 0x02ce }
        L_0x0251:
            r0 = 50
            X.4uI r4 = r6.A01(r0)     // Catch:{ all -> 0x02ce }
            if (r4 == 0) goto L_0x02b3
            android.view.View r0 = r6.A01     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x02b3
            float r2 = r9.getX()     // Catch:{ all -> 0x02ce }
            float r0 = r9.getY()     // Catch:{ all -> 0x02ce }
            android.graphics.PointF r1 = new android.graphics.PointF     // Catch:{ all -> 0x02ce }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02ce }
            android.view.View r0 = r6.A01     // Catch:{ all -> 0x02ce }
            android.graphics.PointF r1 = X.C18396Vqw.A00(r1, r0)     // Catch:{ all -> 0x02ce }
            X.4tV r3 = r6.A07     // Catch:{ all -> 0x02ce }
            X.6Tl r11 = new X.6Tl     // Catch:{ all -> 0x02ce }
            r11.<init>()     // Catch:{ all -> 0x02ce }
            X.4tV r0 = r6.A06     // Catch:{ all -> 0x02ce }
            r11.A03(r0, r7)     // Catch:{ all -> 0x02ce }
            X.6Rm r2 = r6.A05     // Catch:{ all -> 0x02ce }
            r11.A03(r2, r8)     // Catch:{ all -> 0x02ce }
            r5 = 2
            float r12 = r1.x     // Catch:{ all -> 0x02ce }
            r13 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 * r13
            android.view.View r0 = r6.A01     // Catch:{ all -> 0x02ce }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x02ce }
            float r0 = (float) r0     // Catch:{ all -> 0x02ce }
            float r12 = r12 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r12)     // Catch:{ all -> 0x02ce }
            r11.A03(r0, r5)     // Catch:{ all -> 0x02ce }
            r5 = 3
            float r1 = r1.y     // Catch:{ all -> 0x02ce }
            float r1 = r1 * r13
            android.view.View r0 = r6.A01     // Catch:{ all -> 0x02ce }
            int r0 = r0.getHeight()     // Catch:{ all -> 0x02ce }
            float r0 = (float) r0     // Catch:{ all -> 0x02ce }
            float r1 = r1 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x02ce }
            r11.A03(r0, r5)     // Catch:{ all -> 0x02ce }
            java.util.List r1 = r11.A00     // Catch:{ all -> 0x02ce }
            X.6Tm r0 = new X.6Tm     // Catch:{ all -> 0x02ce }
            r0.<init>(r1)     // Catch:{ all -> 0x02ce }
            X.C307886Rw.A03(r2, r3, r0, r4)     // Catch:{ all -> 0x02ce }
        L_0x02b3:
            boolean r0 = r15.A02     // Catch:{ all -> 0x02ce }
            if (r0 == 0) goto L_0x02bc
            r10.requestDisallowInterceptTouchEvent(r7)     // Catch:{ all -> 0x02ce }
            r15.A02 = r7     // Catch:{ all -> 0x02ce }
        L_0x02bc:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r15.A01 = r0     // Catch:{ all -> 0x02ce }
            r15.A00 = r0     // Catch:{ all -> 0x02ce }
            r15.A03 = r7     // Catch:{ all -> 0x02ce }
        L_0x02c5:
            X.6Om r1 = r15.A06     // Catch:{ all -> 0x02ce }
            r0 = 0
            r1.A03 = r0     // Catch:{ all -> 0x02ce }
            r9.recycle()
            return r8
        L_0x02ce:
            r0 = move-exception
            r9.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C307026On.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C307026On(GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector, C307016Om r4, boolean z) {
        this.A06 = r4;
        this.A04 = gestureDetector;
        this.A05 = scaleGestureDetector;
        this.A07 = z;
        this.A02 = false;
        this.A00 = Float.MAX_VALUE;
        this.A01 = Float.MAX_VALUE;
    }
}
