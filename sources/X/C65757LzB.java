package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.LzB  reason: case insensitive filesystem */
public final class C65757LzB implements C317956o7 {
    public float A00 = -1.0f;
    public boolean A01;
    public final C63656L1s A02;
    public final C65759LzD A03 = new C65759LzD(this);
    public final GC9 A04;
    public final GestureDetector A05;

    public C65757LzB(Context context, C63656L1s l1s) {
        0qQ.A0B(l1s, 2);
        this.A02 = l1s;
        this.A04 = new GC9(context);
        this.A05 = new GestureDetector(context, new C60799JrU(this, 0));
    }

    public final boolean DL9(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A05.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            this.A00 = motionEvent.getRawY();
            this.A01 = false;
        } else if (actionMasked == 2) {
            if (this.A00 - motionEvent.getRawY() < 0.0f) {
                z = true;
            }
            this.A01 = z;
        }
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r1 = r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DsV(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            int r1 = r5.getActionMasked()
            r0 = 2
            if (r1 != r0) goto L_0x0034
            X.L1s r1 = r4.A02
            float r3 = r4.A00
            float r0 = r5.getRawY()
            float r3 = r3 - r0
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x002d
            X.LZk r1 = r1.A00
            android.view.View r0 = X.C64310LZk.A00(r1)
            if (r0 == 0) goto L_0x002d
            X.2cs r2 = r1.A01
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.JTP.A00(r3, r0)
            float r1 = r1 + r0
            X.JTP.A1K(r2, r1)
        L_0x002d:
            android.view.GestureDetector r0 = r4.A05
            boolean r0 = r0.onTouchEvent(r5)
            return r0
        L_0x0034:
            r3 = 1
            if (r1 != r3) goto L_0x002d
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x002d
            X.L1s r0 = r4.A02
            X.LZk r0 = r0.A00
            X.2cs r2 = r0.A01
            X.2ct r0 = r2.A09
            double r0 = r0.A00
            r2.A08(r0, r3)
            r2.A03()
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65757LzB.DsV(android.view.MotionEvent):boolean");
    }

    public final void EHq(float f, float f2) {
    }

    public final void destroy() {
    }
}
