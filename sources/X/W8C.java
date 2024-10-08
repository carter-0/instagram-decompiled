package X;

import android.graphics.PointF;
import android.view.ScaleGestureDetector;
import android.widget.FrameLayout;

public final class W8C implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ WJn A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r3 < r1) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r3 = ((r3 - r1) * 0.5f) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r3 <= r1) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScale(android.view.ScaleGestureDetector r7) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.WJn r5 = r6.A00
            java.lang.Integer r1 = r5.A0J
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r4 = 1
            if (r1 == r0) goto L_0x0011
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x004b
        L_0x0011:
            float r1 = r7.getFocusX()
            float r0 = r7.getFocusY()
            X.WJn.A03(r5, r1, r0)
            float r3 = r5.A02
            float r0 = r7.getScaleFactor()
            float r3 = r3 * r0
            r0 = 1082130432(0x40800000, float:4.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
            float r1 = r5.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x003b
        L_0x002f:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
            float r1 = r5.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
        L_0x003b:
            float r3 = r3 - r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r0
            float r3 = r3 + r1
        L_0x0040:
            X.2cs r2 = r5.A0G
            if (r2 == 0) goto L_0x004c
            double r0 = (double) r3
            r2.A08(r0, r4)
            X.WJn.A02(r5, r3)
        L_0x004b:
            return r4
        L_0x004c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W8C.onScale(android.view.ScaleGestureDetector):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.GrK, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.GrK, android.view.View] */
    /* JADX WARNING: type inference failed for: r6v0, types: [X.U4O, android.widget.FrameLayout, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.GrK, android.view.View] */
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        WJn wJn = this.A00;
        if (wJn.A0J == AnonymousClass05K.A00) {
            U4O u4o = wJn.A0I;
            if (u4o != null) {
                wJn.A05 = ((C54019Gy1) u4o).A00.getTranslationY();
                int[] iArr = new int[2];
                U4O u4o2 = wJn.A0I;
                if (u4o2 != null) {
                    ((C54019Gy1) u4o2).A00.getLocationInWindow(iArr);
                    wJn.A0B = iArr[0];
                    wJn.A0C = iArr[1];
                    ? frameLayout = new FrameLayout(wJn.A0M);
                    FrameLayout.LayoutParams layoutParams = WJn.A0V;
                    frameLayout.setLayoutParams(layoutParams);
                    frameLayout.setBackground(wJn.A0P);
                    frameLayout.setVisibility(8);
                    wJn.A0R.addView(frameLayout);
                    wJn.A0H = frameLayout;
                    wJn.A0J = AnonymousClass05K.A0C;
                    wJn.A0K = true;
                    U4O u4o3 = wJn.A0I;
                    if (u4o3 != null) {
                        ? r1 = ((C54019Gy1) u4o3).A00;
                        wJn.A0A = u4o3.indexOfChild(r1);
                        wJn.A0E = r1.getLayoutParams();
                        u4o3.detachViewFromParent(r1);
                        frameLayout.attachViewToParent(r1, 0, layoutParams);
                        frameLayout.bringToFront();
                        u4o3.requestLayout();
                        u4o3.invalidate();
                        frameLayout.setVisibility(0);
                        wJn.A0D = r1;
                        JTP.A15(u4o3, true);
                        u4o3.requestDisallowInterceptTouchEvent(true);
                        JTP.A15(frameLayout, true);
                        WJn.A00(wJn).setHasTransientState(true);
                        2cs r0 = wJn.A0G;
                        if (r0 != null) {
                            r0.A02();
                            r0.A0A(wJn);
                            PointF pointF = wJn.A0N;
                            boolean z = wJn.A0K;
                            float focusX = scaleGestureDetector.getFocusX();
                            if (z) {
                                focusX -= (float) wJn.A0B;
                            }
                            pointF.x = focusX;
                            boolean z2 = wJn.A0K;
                            float focusY = scaleGestureDetector.getFocusY();
                            if (z2) {
                                focusY -= (float) wJn.A0C;
                            }
                            pointF.y = focusY;
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public W8C(WJn wJn) {
        this.A00 = wJn;
    }
}
