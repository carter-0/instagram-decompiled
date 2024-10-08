package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JrV  reason: case insensitive filesystem */
public final class C60800JrV extends C283285Gy {
    public boolean A00 = true;
    public final /* synthetic */ RecyclerView A01;
    public final /* synthetic */ C64340LaF A02;

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C64340LaF.A00(motionEvent, this.A01, this.A02);
        return super.onDoubleTap(motionEvent);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C64340LaF laF = this.A02;
        int A0A = JTO.A0A(C64340LaF.A00(motionEvent, this.A01, laF), 1);
        if (A0A != -1) {
            laF.A03.DsR(A0A);
        }
        this.A00 = true;
        return super.onDown(motionEvent);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        C64340LaF laF = this.A02;
        RecyclerView recyclerView = this.A01;
        Integer[] A002 = C64340LaF.A00(motionEvent, recyclerView, laF);
        int intValue = laF.A00.intValue();
        if (intValue != 1 && intValue != 2) {
            laF.A03.DrT(JTO.A0A(A002, 1));
        } else if (JTO.A0A(A002, 0) == -1) {
            laF.A01(motionEvent, recyclerView);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r10 >= 0.0f) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r10 <= 0.0f) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (java.lang.Math.abs(r11) > java.lang.Math.abs(r10)) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScroll(android.view.MotionEvent r8, android.view.MotionEvent r9, float r10, float r11) {
        /*
            r7 = this;
            r1 = 1
            X.0qQ.A0B(r9, r1)
            boolean r0 = r7.A00
            if (r0 == 0) goto L_0x002e
            X.LaF r5 = r7.A02
            java.lang.Integer r6 = r5.A00
            androidx.recyclerview.widget.RecyclerView r4 = r7.A01
            r0 = -1
            boolean r3 = r4.canScrollHorizontally(r0)
            boolean r2 = r4.canScrollHorizontally(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r6 != r1) goto L_0x003d
            if (r3 == 0) goto L_0x003d
            if (r2 == 0) goto L_0x003d
        L_0x001f:
            float r1 = java.lang.Math.abs(r11)
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
        L_0x002b:
            r5.A01(r9, r4)
        L_0x002e:
            X.LaF r0 = r7.A02
            X.MVk r0 = r0.A03
            r0.DhE()
            r0 = 0
            r7.A00 = r0
            boolean r0 = super.onScroll(r8, r9, r10, r11)
            return r0
        L_0x003d:
            r0 = 0
            if (r6 != r1) goto L_0x002e
            if (r3 != 0) goto L_0x0049
            if (r2 == 0) goto L_0x002b
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x002b
            goto L_0x001f
        L_0x0049:
            if (r2 != 0) goto L_0x002e
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x002b
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60800JrV.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z;
        0qQ.A0B(motionEvent, 0);
        C64340LaF laF = this.A02;
        if (!laF.A01) {
            return false;
        }
        RecyclerView recyclerView = this.A01;
        View A0B = JTS.A0B(motionEvent, recyclerView);
        if (A0B == null) {
            z = false;
        } else {
            z = recyclerView.A0Z(A0B) instanceof C60497JmU;
        }
        if (z) {
            laF.A03.Cu4();
        } else {
            Integer[] A002 = C64340LaF.A00(motionEvent, recyclerView, laF);
            if (JTO.A0A(A002, 0) != -1) {
                MVk mVk = laF.A03;
                if (mVk.EsN(JTO.A0A(A002, 1))) {
                    recyclerView.performHapticFeedback(1);
                    mVk.Dtq(JTO.A0A(A002, 0));
                    return true;
                }
            }
            int A0A = JTO.A0A(A002, 1);
            if (A0A != -1) {
                laF.A03.DrV(A0A);
                return true;
            }
        }
        return true;
    }

    public C60800JrV(RecyclerView recyclerView, C64340LaF laF) {
        this.A02 = laF;
        this.A01 = recyclerView;
    }
}
