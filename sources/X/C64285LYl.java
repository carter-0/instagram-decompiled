package X;

import android.view.GestureDetector;
import android.view.View;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

/* renamed from: X.LYl  reason: case insensitive filesystem */
public final class C64285LYl implements View.OnTouchListener {
    public Object A00;
    public final int A01 = 1;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C64285LYl(TouchInterceptorFrameLayout touchInterceptorFrameLayout, ClipsStackedTimelineFragment clipsStackedTimelineFragment, 0r1 r4, 0r1 r5) {
        this.A00 = clipsStackedTimelineFragment;
        this.A04 = r4;
        this.A03 = r5;
        this.A02 = touchInterceptorFrameLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            int r0 = r10.A01
            if (r0 == 0) goto L_0x0031
            boolean r1 = X.AnonymousClass7TG.A1Z(r11, r12)
            r10.A00 = r11
            java.lang.Object r0 = r10.A03
            X.JpY r0 = (X.C60687JpY) r0
            android.view.View r2 = r0.A04
            boolean r0 = r11.equals(r2)
            if (r0 != 0) goto L_0x0028
            int r0 = r12.getAction()
            if (r0 == r1) goto L_0x0023
            int r1 = r12.getAction()
            r0 = 3
            if (r1 != r0) goto L_0x0028
        L_0x0023:
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r0)
        L_0x0028:
            java.lang.Object r0 = r10.A04
            android.view.GestureDetector r0 = (android.view.GestureDetector) r0
        L_0x002c:
            boolean r0 = r0.onTouchEvent(r12)
        L_0x0030:
            return r0
        L_0x0031:
            int r1 = r12.getAction()
            r0 = 0
            if (r1 != 0) goto L_0x00e4
            java.lang.Object r4 = r10.A00
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
            X.8RF r1 = r4.A0d
            if (r1 == 0) goto L_0x017b
            X.8RH r7 = r1.A0E()
            boolean r1 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0L(r4)
            java.lang.Object r6 = r10.A04
            X.0r1 r6 = (X.0r1) r6
            if (r1 == 0) goto L_0x0076
            X.KMS r1 = r4.A0E
            if (r1 != 0) goto L_0x005c
            java.lang.String r5 = "videoTrackViewController"
        L_0x0054:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x005c:
            float r2 = r12.getX()
            float r5 = r12.getY()
            android.graphics.Rect r3 = X.AnonymousClass7TE.A0W()
            androidx.recyclerview.widget.RecyclerView r1 = r1.A0A
            r1.getHitRect(r3)
            int r2 = (int) r2
            int r1 = (int) r5
            boolean r1 = r3.contains(r2, r1)
            r6.A00 = r1
            goto L_0x0078
        L_0x0076:
            r6.A00 = r0
        L_0x0078:
            boolean r1 = r7 instanceof X.AnonymousClass8RY
            java.lang.Object r6 = r10.A03
            X.0r1 r6 = (X.0r1) r6
            if (r1 == 0) goto L_0x00d6
            X.LRi r3 = r4.A0B
            if (r3 != 0) goto L_0x0087
            java.lang.String r5 = "audioElementTracksManager"
            goto L_0x0054
        L_0x0087:
            java.lang.Object r9 = r10.A02
            X.8RY r7 = (X.AnonymousClass8RY) r7
            int r2 = r7.A01
            float r8 = r12.getX()
            float r7 = r12.getY()
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r1 = r4.A0F
            if (r1 != 0) goto L_0x009c
            java.lang.String r5 = "viewController"
            goto L_0x0054
        L_0x009c:
            androidx.core.widget.NestedScrollView r1 = r1.nestedScrollView
            if (r1 == 0) goto L_0x00d4
            int r1 = r1.getScrollY()
        L_0x00a4:
            int r5 = -r1
            android.graphics.Rect r4 = X.AnonymousClass7TE.A0W()
            java.util.ArrayList r1 = r3.A0A
            java.lang.Object r1 = X.00k.A0O(r1, r2)
            X.KMU r1 = (X.KMU) r1
            if (r1 == 0) goto L_0x00d9
            com.instagram.common.ui.base.IgFrameLayout r3 = r1.A0A
            if (r3 == 0) goto L_0x00d9
            android.graphics.RectF r1 = X.0nA.A01
            r3.getHitRect(r4)
        L_0x00bc:
            android.view.ViewParent r3 = r3.getParent()
            if (r3 == r9) goto L_0x00d9
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L_0x00d9
            android.view.View r3 = (android.view.View) r3
            int r2 = r3.getLeft()
            int r1 = r3.getTop()
            r4.offset(r2, r1)
            goto L_0x00bc
        L_0x00d4:
            r1 = 0
            goto L_0x00a4
        L_0x00d6:
            r6.A00 = r0
            goto L_0x00e4
        L_0x00d9:
            r4.offset(r0, r5)
            int r2 = (int) r8
            int r1 = (int) r7
            boolean r1 = r4.contains(r2, r1)
            r6.A00 = r1
        L_0x00e4:
            java.lang.Object r2 = r10.A00
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r2
            X.8RF r1 = r2.A0d
            if (r1 == 0) goto L_0x017b
            X.8RH r1 = r1.A0E()
            boolean r1 = r1 instanceof X.KM8
            r4 = 1
            if (r1 != 0) goto L_0x00fd
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r1 = r2.A0L
            if (r1 == 0) goto L_0x00ff
            boolean r1 = r1.A0A
            if (r1 != r4) goto L_0x00ff
        L_0x00fd:
            r0 = 1
            return r0
        L_0x00ff:
            boolean r1 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0L(r2)
            java.lang.String r5 = "horizontalScrollGestureDetector"
            if (r1 != 0) goto L_0x0149
            X.8RF r1 = r2.A0d
            if (r1 == 0) goto L_0x017b
            X.8RH r1 = r1.A0E()
            boolean r1 = r1 instanceof X.AnonymousClass8RY
            if (r1 != 0) goto L_0x0149
            boolean r1 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0K(r2)
            if (r1 != 0) goto L_0x0149
            X.Jfo r1 = r2.A0h
            if (r1 != 0) goto L_0x0121
            java.lang.String r5 = "stackedTimelineViewModel"
            goto L_0x0054
        L_0x0121:
            boolean r1 = r1.A0X()
            if (r1 != 0) goto L_0x0149
            int r3 = r12.getPointerCount()
            r1 = 2
            if (r3 < r1) goto L_0x016d
            X.8RF r1 = r2.A0d
            if (r1 == 0) goto L_0x017b
            X.8RH r1 = r1.A0E()
            boolean r1 = r1 instanceof X.AnonymousClass8RR
            if (r1 != 0) goto L_0x00fd
            X.3rc r1 = r2.A0k
            if (r1 != 0) goto L_0x0142
            java.lang.String r5 = "scaleGestureDetector"
            goto L_0x0054
        L_0x0142:
            boolean r1 = r1.A01(r12)
            if (r1 == 0) goto L_0x0030
            goto L_0x00fd
        L_0x0149:
            boolean r1 = com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment.A0L(r2)
            if (r1 == 0) goto L_0x0158
            java.lang.Object r1 = r10.A04
            X.0r1 r1 = (X.0r1) r1
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x0158
            goto L_0x0173
        L_0x0158:
            X.8RF r1 = r2.A0d
            if (r1 == 0) goto L_0x017b
            X.8RH r1 = r1.A0E()
            boolean r1 = r1 instanceof X.AnonymousClass8RY
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r10.A03
            X.0r1 r1 = (X.0r1) r1
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x0030
            goto L_0x0173
        L_0x016d:
            int r1 = r12.getPointerCount()
            if (r1 != r4) goto L_0x0030
        L_0x0173:
            X.030 r0 = r2.A06
            if (r0 == 0) goto L_0x0054
            android.view.GestureDetector r0 = r0.A00
            goto L_0x002c
        L_0x017b:
            java.lang.String r5 = "clipsTimelineEditorViewModel"
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64285LYl.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public C64285LYl(MVW mvw, MVX mvx, C60687JpY jpY) {
        this.A03 = jpY;
        this.A02 = mvw;
        this.A04 = new GestureDetector(jpY.A07.getContext(), new C60026Jdc(this, mvw, mvx, jpY));
    }
}
