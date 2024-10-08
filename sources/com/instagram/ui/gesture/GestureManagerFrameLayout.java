package com.instagram.ui.gesture;

import X.0qQ;
import X.C14060Tp8;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GestureManagerFrameLayout extends FrameLayout {
    public C14060Tp8 A00;
    public boolean A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GestureManagerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        boolean z = false;
        if (motionEvent.getActionMasked() == 0) {
            this.A01 = false;
            this.A02 = false;
        }
        if (super.dispatchTouchEvent(motionEvent) || this.A02) {
            z = true;
        }
        C14060Tp8 tp8 = this.A00;
        if (tp8 != null) {
            Iterator it = tp8.A04.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("isEnabled");
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r0.DL9(r6) == true) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.Tp8 r4 = r5.A00
            r3 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0028
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0028
            int r0 = r6.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r0 = 0
            r4.A00 = r0
        L_0x0017:
            com.instagram.ui.gesture.GestureManagerFrameLayout r0 = r4.A02
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0028
            X.6o7 r0 = r4.A00
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.DL9(r6)
            if (r0 != r1) goto L_0x0028
        L_0x0027:
            r3 = 1
        L_0x0028:
            r5.A02 = r3
            return r3
        L_0x002b:
            java.util.List r0 = r4.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x0031:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r1 = r2.next()
            X.6o7 r1 = (X.C317956o7) r1
            boolean r0 = r1.DL9(r6)
            if (r0 == 0) goto L_0x0031
            r4.A00 = r1
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.gesture.GestureManagerFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setGestureManager(C14060Tp8 tp8) {
        0qQ.A0B(tp8, 0);
        this.A00 = tp8;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.A01 = z;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0.DsV(r7) == true) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 794679445(0x2f5dd895, float:2.0176778E-10)
            int r5 = X.DbX.A03(r7, r0)
            X.Tp8 r4 = r6.A00
            r3 = 1
            if (r4 == 0) goto L_0x0041
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0041
            r7.getActionMasked()
            X.6o7 r0 = r4.A00
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.DsV(r7)
            if (r0 != r3) goto L_0x0041
        L_0x001d:
            r6.A02 = r3
            r0 = 523358011(0x1f31cf3b, float:3.7652625E-20)
            X.AnonymousClass0fD.A0C(r0, r5)
            return r3
        L_0x0026:
            java.util.List r0 = r4.A03
            java.util.Iterator r2 = r0.iterator()
        L_0x002c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r1 = r2.next()
            X.6o7 r1 = (X.C317956o7) r1
            boolean r0 = r1.DsV(r7)
            if (r0 == 0) goto L_0x002c
            r4.A00 = r1
            goto L_0x001d
        L_0x0041:
            r3 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.gesture.GestureManagerFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GestureManagerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GestureManagerFrameLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ GestureManagerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
