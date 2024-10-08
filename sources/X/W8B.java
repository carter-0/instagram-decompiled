package X;

import android.graphics.PointF;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class W8B implements ScaleGestureDetector.OnScaleGestureListener {
    public final /* synthetic */ WJo A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006a, code lost:
        if (r5 < r1) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006c, code lost:
        r5 = ((r5 - r1) * 0.5f) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005e, code lost:
        if (r5 <= r1) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onScale(android.view.ScaleGestureDetector r10) {
        /*
            r9 = this;
            r0 = 0
            X.0qQ.A0B(r10, r0)
            X.WJo r4 = r9.A00
            java.lang.Integer r1 = r4.A0L
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3 = 1
            if (r1 == r0) goto L_0x0011
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x008e
        L_0x0011:
            float r7 = r10.getFocusX()
            float r6 = r10.getFocusY()
            android.graphics.PointF r5 = r4.A0T
            float r0 = r5.x
            float r8 = r7 - r0
            float r0 = r5.y
            float r2 = r6 - r0
            float r1 = r4.A04
            float r1 = r1 + r8
            r4.A04 = r1
            float r0 = r4.A05
            float r0 = r0 + r2
            r4.A05 = r0
            X.2cs r2 = r4.A0H
            double r0 = (double) r1
            r2.A08(r0, r3)
            X.2cs r2 = r4.A0I
            float r0 = r4.A05
            double r0 = (double) r0
            r2.A08(r0, r3)
            float r2 = r4.A04
            float r1 = r4.A05
            android.view.View r0 = X.WJo.A00(r4)
            r0.setTranslationX(r2)
            r0.setTranslationY(r1)
            r5.x = r7
            r5.y = r6
            float r5 = r4.A02
            float r0 = r10.getScaleFactor()
            float r5 = r5 * r0
            float r0 = r4.A07
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0060
            float r1 = r4.A02
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x006c
        L_0x0060:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0071
            float r1 = r4.A02
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0071
        L_0x006c:
            float r5 = r5 - r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r0
            float r5 = r5 + r1
        L_0x0071:
            r4.A07(r5)
            X.2cs r2 = r4.A0J
            double r0 = (double) r5
            r2.A08(r0, r3)
            float r2 = r4.A02
            android.view.View r1 = X.WJo.A00(r4)
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto L_0x0088
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0088:
            r1.setScaleX(r2)
            r1.setScaleY(r2)
        L_0x008e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W8B.onScale(android.view.ScaleGestureDetector):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [X.U4O, android.widget.FrameLayout, android.view.View] */
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        WJo wJo = this.A00;
        Integer num = wJo.A0L;
        if (num == AnonymousClass05K.A00 || num == AnonymousClass05K.A0Y) {
            if (wJo.A0Q) {
                View view = wJo.A0V;
                wJo.A06 = view.getTranslationY();
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                wJo.A0B = iArr[0];
                wJo.A0C = iArr[1];
                ? frameLayout = new FrameLayout(wJo.A0S);
                FrameLayout.LayoutParams layoutParams = WJo.A0c;
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.setBackground(wJo.A0D);
                frameLayout.setVisibility(8);
                ((ViewGroup) wJo.A0X.getValue()).addView(frameLayout);
                wJo.A0K = frameLayout;
                wJo.A08(AnonymousClass05K.A0C);
                wJo.A0P = true;
                C15173UTy uTy = wJo.A0G;
                if (uTy != null) {
                    U4O u4o = wJo.A0K;
                    if (u4o != null) {
                        wJo.A08 = uTy.indexOfChild(view);
                        wJo.A0F = view.getLayoutParams();
                        uTy.detachViewFromParent(view);
                        u4o.attachViewToParent(view, 0, layoutParams);
                        u4o.bringToFront();
                        uTy.requestLayout();
                        uTy.invalidate();
                        u4o.setVisibility(0);
                        wJo.A0E = view;
                        JTP.A15(uTy, true);
                        uTy.requestDisallowInterceptTouchEvent(true);
                        JTP.A15(u4o, true);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                wJo.A08(AnonymousClass05K.A0N);
            }
            WJo.A00(wJo).setHasTransientState(true);
            PointF pointF = wJo.A0T;
            boolean z = wJo.A0P;
            float focusX = scaleGestureDetector.getFocusX();
            if (z) {
                focusX -= (float) wJo.A0B;
            }
            pointF.x = focusX;
            boolean z2 = wJo.A0P;
            float focusY = scaleGestureDetector.getFocusY();
            if (z2) {
                focusY -= (float) wJo.A0C;
            }
            pointF.y = focusY;
        }
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public W8B(WJo wJo) {
        this.A00 = wJo;
    }
}
