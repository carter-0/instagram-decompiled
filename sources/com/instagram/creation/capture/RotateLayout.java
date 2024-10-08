package com.instagram.creation.capture;

import X.0qQ;
import X.AnonymousClass0fD;
import X.C13988Tno;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public final class RotateLayout extends ViewGroup {
    public int A00;
    public View A01;

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = this.A00;
        if (i7 != 0) {
            if (i7 != 90) {
                if (i7 != 180) {
                    if (i7 != 270) {
                        return;
                    }
                }
            }
            View view = this.A01;
            0qQ.A0A(view);
            view.layout(0, 0, i6, i5);
            return;
        }
        View view2 = this.A01;
        0qQ.A0A(view2);
        view2.layout(0, 0, i5, i6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r1 = r5.A00
            r4 = 0
            if (r1 == 0) goto L_0x0081
            r0 = 90
            if (r1 == r0) goto L_0x0069
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L_0x0081
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L_0x0069
            r3 = 0
        L_0x0012:
            r5.setMeasuredDimension(r4, r3)
            int r1 = r5.A00
            r2 = 0
            if (r1 == 0) goto L_0x0060
            r0 = 90
            if (r1 == r0) goto L_0x004e
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 == r0) goto L_0x0044
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 != r0) goto L_0x0037
            android.view.View r1 = r5.A01
            X.0qQ.A0A(r1)
            float r0 = (float) r4
            r1.setTranslationX(r0)
        L_0x002f:
            android.view.View r0 = r5.A01
            X.0qQ.A0A(r0)
            r0.setTranslationY(r2)
        L_0x0037:
            android.view.View r1 = r5.A01
            X.0qQ.A0A(r1)
            int r0 = r5.A00
            float r0 = (float) r0
            float r0 = -r0
            r1.setRotation(r0)
            return
        L_0x0044:
            android.view.View r1 = r5.A01
            X.0qQ.A0A(r1)
            float r0 = (float) r4
            r1.setTranslationX(r0)
            goto L_0x0056
        L_0x004e:
            android.view.View r0 = r5.A01
            X.0qQ.A0A(r0)
            r0.setTranslationX(r2)
        L_0x0056:
            android.view.View r1 = r5.A01
            X.0qQ.A0A(r1)
            float r0 = (float) r3
            r1.setTranslationY(r0)
            goto L_0x0037
        L_0x0060:
            android.view.View r0 = r5.A01
            X.0qQ.A0A(r0)
            r0.setTranslationX(r2)
            goto L_0x002f
        L_0x0069:
            android.view.View r0 = r5.A01
            r5.measureChild(r0, r7, r6)
            android.view.View r0 = r5.A01
            X.0qQ.A0A(r0)
            int r4 = r0.getMeasuredHeight()
            android.view.View r0 = r5.A01
            X.0qQ.A0A(r0)
            int r3 = r0.getMeasuredWidth()
            goto L_0x0012
        L_0x0081:
            android.view.View r0 = r5.A01
            r5.measureChild(r0, r6, r7)
            android.view.View r0 = r5.A01
            X.0qQ.A0A(r0)
            int r4 = r0.getMeasuredWidth()
            android.view.View r0 = r5.A01
            X.0qQ.A0A(r0)
            int r3 = r0.getMeasuredHeight()
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.RotateLayout.onMeasure(int, int):void");
    }

    public final void setOrientation(int i) {
        int i2 = i % 360;
        if (this.A00 != i2) {
            this.A00 = i2;
            requestLayout();
        }
    }

    public RotateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(17170445);
    }

    public final void onFinishInflate() {
        int A06 = AnonymousClass0fD.A06(-1651369656);
        View A0G = C13988Tno.A0G(this);
        this.A01 = A0G;
        0qQ.A0A(A0G);
        A0G.setPivotX(0.0f);
        View view = this.A01;
        0qQ.A0A(view);
        view.setPivotY(0.0f);
        AnonymousClass0fD.A0D(-561552152, A06);
    }
}
