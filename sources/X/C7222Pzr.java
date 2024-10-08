package X;

import android.view.GestureDetector;
import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.Pzr  reason: case insensitive filesystem */
public final class C7222Pzr implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ AnonymousClass37F A02;

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        if (r9.getY() <= ((float) (X.C7218Pzn.A06(r4) + r5))) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00aa, code lost:
        if (r9.getY() < ((float) r5)) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c0, code lost:
        if (r9.getY() <= ((float) (X.C7218Pzn.A06(r4) + r5))) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r5 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r5, r8, r9)
            X.37F r2 = r7.A02
            X.Pzn r1 = r2.A0D
            r6 = 0
            if (r1 != 0) goto L_0x000d
            return r5
        L_0x000d:
            boolean r0 = r2.A0P
            if (r0 == 0) goto L_0x001f
            boolean r0 = r2.A0O
            if (r0 == 0) goto L_0x001f
            int r1 = r1.A09
            r0 = 2
            if (r1 == r0) goto L_0x001f
            android.view.GestureDetector r0 = r7.A00
            r0.onTouchEvent(r9)
        L_0x001f:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L_0x002e
            android.view.ViewParent r0 = r8.getParent()
            if (r0 == 0) goto L_0x00fe
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x002e:
            r2.A0D()
            androidx.fragment.app.Fragment r0 = r7.A01
            boolean r0 = X.AnonymousClass37F.A07(r9, r0, r2)
            if (r0 == 0) goto L_0x005c
            X.Pzn r4 = r2.A0D
            if (r4 == 0) goto L_0x005c
            boolean r0 = X.C7218Pzn.A0C(r4)
            if (r0 == 0) goto L_0x005c
            int r1 = r9.getActionMasked()
            if (r1 == 0) goto L_0x005d
            r0 = 2
            if (r1 == r0) goto L_0x00c3
            r0 = 3
            if (r1 != r0) goto L_0x005c
            r0 = 0
            r4.A04 = r0
            r4.A0M = r3
            r4.A0H = r5
            r4.A00 = r0
            r4.A01 = r0
            r4.A0O = r5
        L_0x005c:
            return r6
        L_0x005d:
            int r5 = r8.getHeight()
            int r0 = r4.A0F()
            int r5 = r5 - r0
            X.4df r1 = r4.A0X
            boolean r0 = r1.ANU()
            if (r0 == 0) goto L_0x00ad
            int r0 = r4.A06
            if (r0 == r3) goto L_0x0074
            if (r0 != 0) goto L_0x00b3
        L_0x0074:
            r1 = 1
        L_0x0075:
            r4.A0Q = r1
            boolean r0 = r4.A0J
            if (r0 != 0) goto L_0x0085
            X.4mg r0 = r4.A0D
            if (r0 == 0) goto L_0x0094
            boolean r0 = r0.isScrolledToBottom()
            if (r0 != 0) goto L_0x0094
        L_0x0085:
            float r1 = r9.getY()
            int r0 = X.C7218Pzn.A06(r4)
            int r0 = r0 + r5
            float r0 = (float) r0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x0095
        L_0x0094:
            r0 = 1
        L_0x0095:
            r4.A0R = r0
            android.view.GestureDetector r0 = r4.A0T
            r0.onTouchEvent(r9)
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L_0x00a3
            X.C7218Pzn.A08(r9, r4)
        L_0x00a3:
            float r1 = r9.getY()
            float r0 = (float) r5
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x005c
            goto L_0x00f7
        L_0x00ad:
            boolean r0 = r1.isScrolledToTop()
            if (r0 != 0) goto L_0x0074
        L_0x00b3:
            float r1 = r9.getY()
            int r0 = X.C7218Pzn.A06(r4)
            int r0 = r0 + r5
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L_0x0075
            goto L_0x0074
        L_0x00c3:
            X.C7218Pzn.A08(r9, r4)
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x005c
            float r1 = r4.A01
            float r0 = r9.getRawY()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00de
            boolean r0 = X.C7218Pzn.A0D(r4)
            if (r0 != 0) goto L_0x00de
            boolean r0 = r4.A0R
            if (r0 != 0) goto L_0x00ec
        L_0x00de:
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L_0x005c
            float r1 = r4.A01
            float r0 = r9.getRawY()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x005c
        L_0x00ec:
            android.view.GestureDetector r0 = r4.A0T
            r0.onTouchEvent(r9)
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x00f7
            r4.A0O = r3
        L_0x00f7:
            r6 = 1
            android.app.Activity r0 = r2.A0r
            X.0nA.A0J(r0)
            return r6
        L_0x00fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7222Pzr.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C7222Pzr(GestureDetector gestureDetector, Fragment fragment, AnonymousClass37F r3) {
        this.A02 = r3;
        this.A00 = gestureDetector;
        this.A01 = fragment;
    }
}
