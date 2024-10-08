package X;

import android.view.View;

/* renamed from: X.6tw  reason: invalid class name and case insensitive filesystem */
public final class C321326tw implements View.OnTouchListener {
    public final /* synthetic */ C321266tq A00;

    public C321326tw(C321266tq r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        if (r5 < 90.0f) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            r13 = this;
            int r0 = r15.getAction()
            if (r0 != 0) goto L_0x002a
            X.6tq r4 = r13.A00
            r0 = 0
            r4.A00 = r0
            X.2cs r0 = r4.A07
            r3 = 1
            r0.A06 = r3
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0.A06(r1)
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0020
            X.2cs r0 = r4.A09
            r0.A06 = r3
            r0.A06(r1)
        L_0x0020:
            X.2cs r0 = r4.A0A
            r0.A06(r1)
            X.2cs r0 = r4.A06
            r0.A06(r1)
        L_0x002a:
            X.6tq r9 = r13.A00
            android.view.GestureDetector r0 = r9.A04
            r0.onTouchEvent(r15)
            int r1 = r15.getAction()
            r0 = 3
            r8 = 1
            if (r1 == r0) goto L_0x003f
            int r0 = r15.getAction()
            if (r0 != r8) goto L_0x0059
        L_0x003f:
            X.2cs r0 = r9.A07
            r1 = 0
            r0.A06 = r1
            r2 = 0
            r0.A06(r2)
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x005a
            X.C321266tq.A01(r9)
            X.2cs r0 = r9.A09
            r0.A06 = r8
            r0.A06(r2)
            r9.A03 = r1
        L_0x0059:
            return r8
        L_0x005a:
            float r0 = r9.A00
            float r1 = java.lang.Math.abs(r0)
            com.instagram.avatars.coinflip.ProfileCoinFlipView r4 = r9.A0C
            int r0 = r4.getWidth()
            int r0 = r0 * 3
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0072
            r1 = 1056964608(0x3f000000, float:0.5)
        L_0x0072:
            float r0 = r9.A00
            float r0 = java.lang.Math.signum(r0)
            float r1 = r1 * r0
            X.2cs r10 = r9.A08
            double r0 = (double) r1
            r10.A07(r0)
            float r5 = r4.getRotationY()
            r4 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 % r4
            r4 = 0
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x008f
            X.C321266tq.A01(r9)
            return r8
        L_0x008f:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x00bf
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00a1
            r1 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bf
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0059
        L_0x00a1:
            X.C321266tq.A00(r9)
            X.2ct r0 = r10.A09
            double r6 = r0.A00
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r6 % r11
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00ba
            double r6 = r6 - r11
        L_0x00b1:
            r10.A06(r6)
            X.0sa r0 = r9.A0E
            r0.invoke()
            return r8
        L_0x00ba:
            double r6 = java.lang.Math.floor(r6)
            goto L_0x00b1
        L_0x00bf:
            X.C321266tq.A00(r9)
            X.2ct r0 = r10.A09
            double r6 = r0.A00
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r6 % r11
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            double r6 = r6 + r11
            goto L_0x00b1
        L_0x00d0:
            double r6 = java.lang.Math.ceil(r6)
            goto L_0x00b1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321326tw.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
