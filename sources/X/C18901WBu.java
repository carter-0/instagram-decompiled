package X;

import android.view.GestureDetector;
import android.view.View;

/* renamed from: X.WBu  reason: case insensitive filesystem */
public final class C18901WBu implements View.OnTouchListener {
    public float A00;
    public float A01;
    public final /* synthetic */ GestureDetector A02;
    public final /* synthetic */ C14980UHy A03;
    public final /* synthetic */ C309646Zb A04;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r1 != 3) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            r2 = 1
            X.0qQ.A0B(r7, r2)
            android.view.GestureDetector r0 = r5.A02
            boolean r4 = r0.onTouchEvent(r7)
            int r1 = r7.getActionMasked()
            if (r1 == 0) goto L_0x0045
            if (r1 == r2) goto L_0x0034
            r0 = 2
            if (r1 == r0) goto L_0x0019
            r0 = 3
            if (r1 == r0) goto L_0x0034
        L_0x0018:
            return r4
        L_0x0019:
            X.UHy r0 = r5.A03
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0018
            float r2 = r7.getRawX()
            float r0 = r5.A00
            float r2 = r2 - r0
            float r1 = r7.getRawY()
            float r0 = r5.A01
            float r1 = r1 - r0
            X.6Zb r0 = r5.A04
            boolean r4 = r0.DPM(r2, r1)
            return r4
        L_0x0034:
            X.6Zb r0 = r5.A04
            r3 = 0
            r0.DvB(r3)
            X.UHy r2 = r5.A03
            X.U1q r1 = r2.A01
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            r2.A00 = r3
            return r4
        L_0x0045:
            float r0 = r7.getRawX()
            r5.A00 = r0
            float r0 = r7.getRawY()
            r5.A01 = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18901WBu.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C18901WBu(GestureDetector gestureDetector, C14980UHy uHy, C309646Zb r3) {
        this.A02 = gestureDetector;
        this.A03 = uHy;
        this.A04 = r3;
    }
}
