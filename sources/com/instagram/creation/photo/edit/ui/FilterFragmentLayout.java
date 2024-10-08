package com.instagram.creation.photo.edit.ui;

import X.0qQ;
import X.C357318Xk;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FilterFragmentLayout extends ConstraintLayout {
    public C357318Xk A00;

    public final C357318Xk getCameraStickyToastController() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r3 <= (r1 + r5.getHeight())) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            X.8Xk r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.A05()
            if (r0 != r6) goto L_0x003c
            X.8Xk r0 = r7.A00
            if (r0 == 0) goto L_0x0041
            android.view.View r5 = r0.A00
            r1 = 0
            if (r5 == 0) goto L_0x0041
            if (r8 == 0) goto L_0x0041
            float r0 = r8.getRawX()
            int r4 = (int) r0
            float r0 = r8.getRawY()
            int r3 = (int) r0
            r0 = 2
            int[] r0 = new int[r0]
            r5.getLocationOnScreen(r0)
            r2 = r0[r1]
            r1 = r0[r6]
            if (r4 < r2) goto L_0x0041
            int r0 = r5.getWidth()
            int r2 = r2 + r0
            if (r4 > r2) goto L_0x0041
            if (r3 < r1) goto L_0x0041
            int r0 = r5.getHeight()
            int r1 = r1 + r0
            if (r3 > r1) goto L_0x0041
        L_0x003c:
            boolean r0 = super.onInterceptTouchEvent(r8)
            return r0
        L_0x0041:
            X.8Xk r0 = r7.A00
            if (r0 == 0) goto L_0x003c
            r0.A04(r6)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.photo.edit.ui.FilterFragmentLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public /* synthetic */ FilterFragmentLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    public final void setCameraStickyToastController(C357318Xk r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterFragmentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
