package X;

import android.view.MotionEvent;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.7HS  reason: invalid class name */
public final class AnonymousClass7HS implements C317956o7 {
    public boolean A00;
    public final /* synthetic */ AnonymousClass7H6 A01;

    public final boolean DL9(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A00) {
            return false;
        }
        ReboundViewPager reboundViewPager = this.A01.A0C;
        if (reboundViewPager == null) {
            0qQ.A0F("viewPager");
            throw AnonymousClass00P.createAndThrow();
        }
        reboundViewPager.onInterceptTouchEvent(motionEvent);
        return DsV(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ce, code lost:
        if (X.OZ0.A00(r5.A0C, r5.A0A, r13.getX(), r13.getY(), 0) != false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r13.getAction() == 1) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DsV(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r6 = 0
            X.0qQ.A0B(r13, r6)
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x0009
            return r6
        L_0x0009:
            int r0 = r13.getAction()
            r4 = 3
            r1 = 1
            if (r0 == r4) goto L_0x0018
            int r0 = r13.getAction()
            r5 = 0
            if (r0 != r1) goto L_0x0019
        L_0x0018:
            r5 = 1
        L_0x0019:
            X.7H6 r3 = r12.A01
            boolean r0 = r3.A0f
            if (r0 == 0) goto L_0x0030
            X.Pw3 r0 = r3.A0L
            if (r0 == 0) goto L_0x0031
            boolean r0 = r0.CW1()
            if (r0 != r1) goto L_0x0031
            if (r5 == 0) goto L_0x0030
            androidx.fragment.app.FragmentActivity r0 = r3.A0t
            X.0nA.A0J(r0)
        L_0x0030:
            return r1
        L_0x0031:
            java.lang.String r2 = "viewPager"
            if (r5 == 0) goto L_0x004f
            boolean r0 = X.AnonymousClass7H6.A0d(r13, r3)
            if (r0 != 0) goto L_0x008a
            X.7HQ r0 = r3.A17
            r0.A01(r13)
            X.We2 r0 = r3.A0Q
            if (r0 == 0) goto L_0x0047
            r0.DsV(r13)
        L_0x0047:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r3.A0C
            if (r0 == 0) goto L_0x010d
            r0.onTouchEvent(r13)
            return r1
        L_0x004f:
            int r0 = r13.getPointerCount()
            if (r0 <= r1) goto L_0x005b
            X.7HQ r0 = r3.A17
            r0.A01(r13)
            return r1
        L_0x005b:
            boolean r0 = X.AnonymousClass7H6.A0d(r13, r3)
            if (r0 != 0) goto L_0x008a
            X.7HQ r0 = r3.A17
            r0.A01(r13)
            X.We2 r0 = r3.A0Q
            if (r0 == 0) goto L_0x0082
            X.We3 r0 = r0.A02
            boolean r0 = r0.A00
            if (r0 != r1) goto L_0x0082
        L_0x0070:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r3.A0C
            if (r0 == 0) goto L_0x010d
            X.3TF r2 = r0.A0O
            X.3TF r0 = X.AnonymousClass3TF.IDLE
            if (r2 != r0) goto L_0x0030
            X.We2 r0 = r3.A0Q
            if (r0 == 0) goto L_0x0030
            r0.DsV(r13)
            return r1
        L_0x0082:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r3.A0C
            if (r0 == 0) goto L_0x010d
            r0.onTouchEvent(r13)
            goto L_0x0070
        L_0x008a:
            X.OIL r0 = X.AnonymousClass7H6.A03(r3)
            if (r0 == 0) goto L_0x0030
            X.Nhg r5 = r0.A0A
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x00ba
            int r0 = r13.getAction()
            if (r0 == r4) goto L_0x00a2
            int r0 = r13.getAction()
            if (r0 != r1) goto L_0x00ba
        L_0x00a2:
            com.instagram.common.ui.base.IgSimpleImageView r7 = r5.A0D
            float r4 = r13.getX()
            float r3 = r13.getY()
            android.view.View r2 = r5.A0A
            int r0 = r5.A06
            boolean r0 = X.OZ0.A00(r7, r2, r4, r3, r0)
            if (r0 == 0) goto L_0x00ba
            r7.performClick()
            return r1
        L_0x00ba:
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x00d0
            android.widget.SeekBar r4 = r5.A0C
            float r3 = r13.getX()
            float r2 = r13.getY()
            android.view.View r0 = r5.A0A
            boolean r0 = X.OZ0.A00(r4, r0, r3, r2, r6)
            if (r0 == 0) goto L_0x0030
        L_0x00d0:
            android.widget.SeekBar r3 = r5.A0C
            float r9 = r13.getX()
            int r2 = r3.getLeft()
            android.view.View r4 = r5.A09
            int r0 = r4.getLeft()
            int r2 = r2 - r0
            float r0 = (float) r2
            float r9 = r9 - r0
            float r10 = r13.getY()
            int r2 = r3.getTop()
            int r0 = r4.getTop()
            int r2 = r2 - r0
            float r0 = (float) r2
            float r10 = r10 - r0
            long r4 = r13.getDownTime()
            long r6 = r13.getEventTime()
            int r8 = r13.getAction()
            int r11 = r13.getMetaState()
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            X.0qQ.A07(r0)
            r3.onTouchEvent(r0)
            return r1
        L_0x010d:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HS.DsV(android.view.MotionEvent):boolean");
    }

    public final void EHq(float f, float f2) {
    }

    public final void destroy() {
        this.A00 = true;
    }

    public AnonymousClass7HS(AnonymousClass7H6 r1) {
        this.A01 = r1;
    }
}
