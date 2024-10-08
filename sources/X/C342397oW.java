package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7oW  reason: invalid class name and case insensitive filesystem */
public final class C342397oW implements View.OnTouchListener {
    public View A00;
    public float A01;
    public final View A02;
    public final View A03;
    public final int A04;
    public final Runnable A05 = new C342407oX(this);
    public final List A06 = new ArrayList();
    public final /* synthetic */ C342377oU A07;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r6 != 3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            r3 = 1
            X.0qQ.A0B(r10, r3)
            X.7oU r0 = r8.A07
            boolean r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L_0x0084
            android.view.View r2 = r8.A03
            if (r2 == 0) goto L_0x0084
            int r6 = r10.getActionMasked()
            android.view.View r0 = r8.A00
            r5 = 0
            r7 = 3
            if (r0 == 0) goto L_0x0021
            r0.dispatchTouchEvent(r10)
            if (r6 == r3) goto L_0x0081
            if (r6 == r7) goto L_0x0081
        L_0x0020:
            return r3
        L_0x0021:
            if (r6 != 0) goto L_0x0038
            java.util.List r0 = r8.A06
            r0.clear()
            float r0 = r10.getRawX()
            r8.A01 = r0
            java.lang.Runnable r4 = r8.A05
            r2.removeCallbacks(r4)
            r0 = 150(0x96, double:7.4E-322)
            r2.postDelayed(r4, r0)
        L_0x0038:
            java.util.List r1 = r8.A06
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r10)
            X.0qQ.A07(r0)
            r1.add(r0)
            if (r6 == r3) goto L_0x0071
            r0 = 2
            if (r6 == r0) goto L_0x004c
            if (r6 == r7) goto L_0x0071
            return r3
        L_0x004c:
            float r1 = r8.A01
            float r0 = r10.getRawX()
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r8.A04
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            android.view.View r1 = r8.A02
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0020
            r8.A00 = r1
            java.lang.Runnable r0 = r8.A05
            r2.removeCallbacks(r0)
            A00(r8)
            return r3
        L_0x0071:
            java.lang.Runnable r0 = r8.A05
            r2.removeCallbacks(r0)
            android.view.View r0 = r8.A00
            if (r0 != 0) goto L_0x007c
            r8.A00 = r2
        L_0x007c:
            if (r6 != r3) goto L_0x0081
            A00(r8)
        L_0x0081:
            r8.A00 = r5
            return r3
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C342397oW.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C342397oW(Context context, View view, View view2, C342377oU r5) {
        this.A07 = r5;
        this.A03 = view;
        this.A02 = view2;
        this.A04 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static final void A00(C342397oW r4) {
        if (r4.A00 != null) {
            List<MotionEvent> list = r4.A06;
            for (MotionEvent motionEvent : list) {
                View view = r4.A00;
                if (view != null) {
                    view.dispatchTouchEvent(motionEvent);
                }
                motionEvent.recycle();
            }
            list.clear();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
