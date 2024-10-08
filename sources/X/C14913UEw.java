package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.UEw  reason: case insensitive filesystem */
public final class C14913UEw extends SwipeRefreshLayout {
    public float A00;
    public float A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public void setProgressViewOffset(float f) {
        this.A01 = f;
        if (this.A03) {
            int i = this.A01;
            A08(Math.round(W2U.A01(f)) - i, Math.round(W2U.A01(f + 64.0f) - ((float) i)));
        }
    }

    public void setRefreshing(boolean z) {
        this.A06 = z;
        if (this.A03) {
            C14913UEw.super.setRefreshing(z);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, X.UEw] */
    public final boolean A0A() {
        View A0G = C13988Tno.A0G(this);
        if (A0G != null) {
            return JTP.A1Y(A0G);
        }
        return C14913UEw.super.A0A();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View, X.UEw] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getAction()
            r1 = 0
            r2 = 1
            if (r3 == 0) goto L_0x0024
            r0 = 2
            if (r3 != r0) goto L_0x002c
            float r1 = r5.getX()
            float r0 = r4.A00
            float r1 = X.AnonymousClass7TE.A00(r1, r0)
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0020
            int r0 = r4.A02
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002c
        L_0x0020:
            r4.A04 = r2
        L_0x0022:
            r1 = 0
        L_0x0023:
            return r1
        L_0x0024:
            float r0 = r5.getX()
            r4.A00 = r0
            r4.A04 = r1
        L_0x002c:
            boolean r0 = X.C14913UEw.super.onInterceptTouchEvent(r5)
            if (r0 == 0) goto L_0x0022
            X.X61 r0 = X.C18101VlV.A00(r4)
            if (r0 == 0) goto L_0x003b
            r0.D1k(r5, r4)
        L_0x003b:
            r1 = 1
            r4.A05 = r2
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L_0x0023
            X.JTP.A15(r4, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14913UEw.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C14913UEw.super.onLayout(z, i, i2, i3, i4);
        if (!this.A03) {
            this.A03 = true;
            setProgressViewOffset(this.A01);
            setRefreshing(this.A06);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View, X.UEw] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(1471655419);
        if (motionEvent.getActionMasked() == 1 && this.A05) {
            X61 A002 = C18101VlV.A00(this);
            if (A002 != null) {
                A002.D1f(motionEvent, this);
            }
            this.A05 = false;
        }
        boolean onTouchEvent = C14913UEw.super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(-2134075328, A052);
        return onTouchEvent;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, X.UEw] */
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            JTP.A15(this, z);
        }
    }
}
