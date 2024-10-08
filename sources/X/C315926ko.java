package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* renamed from: X.6ko  reason: invalid class name and case insensitive filesystem */
public abstract class C315926ko {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final VelocityTracker A08 = VelocityTracker.obtain();
    public final C315906km A09;
    public final C315886kk A0A;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(android.view.MotionEvent r13) {
        /*
            r12 = this;
            boolean r0 = r12.A07
            r0 = r0 ^ 1
            r2 = 2
            r10 = 0
            if (r0 == 0) goto L_0x0015
            int r0 = r13.getAction()
            if (r0 != r2) goto L_0x0015
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r13)
            r13.setAction(r10)
        L_0x0015:
            int r0 = r13.getAction()
            r1 = r0 & 255(0xff, float:3.57E-43)
            r7 = 1
            if (r1 == 0) goto L_0x0051
            if (r1 == r7) goto L_0x00b3
            if (r1 == r2) goto L_0x0082
            r0 = 3
            if (r1 == r0) goto L_0x00b1
            r0 = 6
            if (r1 != r0) goto L_0x0135
            int r0 = r13.getPointerCount()
            if (r0 != r2) goto L_0x004f
            int r0 = r13.getActionIndex()
            r1 = 0
            if (r0 != 0) goto L_0x0036
            r1 = 1
        L_0x0036:
            int r0 = r13.getPointerId(r1)
            r12.A04 = r0
            float r0 = r13.getX(r1)
            r12.A00 = r0
            float r0 = r13.getY(r1)
            r12.A01 = r0
            android.view.VelocityTracker r0 = r12.A08
            r0.clear()
            r12.A06 = r7
        L_0x004f:
            r0 = 0
            return r0
        L_0x0051:
            X.6km r0 = r12.A09
            r0.A00(r13)
            r12.A07 = r7
            int r0 = r13.getPointerId(r10)
            r12.A04 = r0
            r12.A06 = r10
            android.view.VelocityTracker r0 = r12.A08
            r0.clear()
            r12.A00(r13)
            int r0 = r12.A04
            int r1 = r13.findPointerIndex(r0)
            if (r1 < 0) goto L_0x0082
            int r0 = r13.getPointerCount()
            if (r1 >= r0) goto L_0x0082
            float r0 = r13.getX(r1)
            r12.A00 = r0
            float r0 = r13.getY(r1)
            r12.A01 = r0
        L_0x0082:
            X.6km r2 = r12.A09
            r2.A00(r13)
            r12.A00(r13)
            int r0 = r12.A04
            int r1 = r13.findPointerIndex(r0)
            if (r1 < 0) goto L_0x0135
            int r0 = r13.getPointerCount()
            if (r1 >= r0) goto L_0x0135
            float r6 = r13.getX(r1)
            float r5 = r13.getY(r1)
            float r0 = r12.A00
            float r4 = r6 - r0
            float r0 = r12.A01
            float r3 = r5 - r0
            boolean r1 = r12.A05
            if (r1 != 0) goto L_0x00ed
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x00ed
            goto L_0x00b3
        L_0x00b1:
            r12.A06 = r7
        L_0x00b3:
            r12.A07 = r10
            r12.A00(r13)
            r0 = -1
            r12.A04 = r0
            boolean r0 = r12.A05
            if (r0 == 0) goto L_0x00e2
            android.view.VelocityTracker r1 = r12.A08
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)
            float r0 = r1.getXVelocity()
            r12.A02 = r0
            float r2 = r1.getYVelocity()
            r12.A03 = r2
            X.6kk r1 = r12.A0A
            float r0 = r12.A02
            r1.A00(r0, r2)
        L_0x00d9:
            r12.A05 = r10
            X.6km r0 = r12.A09
            r0.A00(r13)
            goto L_0x004f
        L_0x00e2:
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x00d9
            X.6kk r1 = r12.A0A
            r0 = 0
            r1.A00(r0, r0)
            goto L_0x00d9
        L_0x00ed:
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x00f5
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0131
        L_0x00f5:
            if (r1 != 0) goto L_0x0129
            X.6kk r11 = r12.A0A
            X.6kj r0 = r11.A07
            X.6kZ r9 = r0.A00
            X.RBw r8 = r9.A04
            if (r8 == 0) goto L_0x0116
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r1 = 0
            X.Rwp r0 = new X.Rwp
            r0.<init>(r2, r1, r1, r1)
            r8.A05(r0)
            X.6kT r0 = r9.A06
            if (r0 == 0) goto L_0x0116
            boolean r0 = r9.A0G
            if (r0 != 0) goto L_0x0116
            r9.A0G = r7
        L_0x0116:
            X.0JP r0 = r11.A06
            long r8 = r0.now()
            long r0 = r11.A03
            long r8 = r8 - r0
            r1 = 200(0xc8, double:9.9E-322)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0127
            r11.A04 = r7
        L_0x0127:
            r12.A05 = r7
        L_0x0129:
            X.6kk r9 = r12.A0A
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0137
            r9.A04 = r10
        L_0x0131:
            r12.A00 = r6
            r12.A01 = r5
        L_0x0135:
            r0 = 1
            return r0
        L_0x0137:
            X.6kj r0 = r9.A07
            boolean r11 = r9.A05
            X.6kZ r1 = r0.A00
            X.RBw r8 = r1.A04
            if (r8 == 0) goto L_0x0131
            float r2 = java.lang.Math.abs(r4)
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0158
            if (r11 != 0) goto L_0x0158
            X.6kY r0 = r1.A0L
            com.instagram.xme.threed.view.IgGltfSceneTextureView r0 = r0.A00
            android.view.ViewParent r0 = r0.getParent()
            r0.requestDisallowInterceptTouchEvent(r7)
            r10 = 1
        L_0x0158:
            int r0 = r1.A01
            float r0 = (float) r0
            float r4 = r4 / r0
            int r0 = r1.A00
            float r0 = (float) r0
            float r3 = r3 / r0
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1 = 1065353216(0x3f800000, float:1.0)
            X.Rwp r0 = new X.Rwp
            r0.<init>(r2, r1, r4, r3)
            r8.A05(r0)
            if (r10 == 0) goto L_0x0131
            r9.A05 = r7
            goto L_0x0131
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C315926ko.A01(android.view.MotionEvent):boolean");
    }

    public C315926ko(C315906km r2, C315886kk r3) {
        this.A09 = r2;
        this.A0A = r3;
    }

    public final void A00(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        this.A08.addMovement(obtain);
    }
}
