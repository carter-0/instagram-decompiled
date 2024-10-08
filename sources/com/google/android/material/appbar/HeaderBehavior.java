package com.google.android.material.appbar;

import X.AnonymousClass972;
import X.C324096yd;
import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public abstract class HeaderBehavior extends ViewOffsetBehavior {
    public VelocityTracker A00;
    public OverScroller A01;
    public Runnable A02;
    public int A03 = -1;
    public int A04;
    public int A05 = -1;
    public boolean A06;

    public final int A0S() {
        int i;
        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
        C324096yd r0 = baseBehavior.A01;
        if (r0 != null) {
            i = r0.A02;
        } else {
            i = 0;
        }
        return i + baseBehavior.A01;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000e: MOVE  (r0v0 int) = (r16v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final int A0T(android.view.View r12, androidx.coordinatorlayout.widget.CoordinatorLayout r13, int r14, int r15, int r16) {
        /*
            r11 = this;
            r3 = r11
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r3 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r3
            com.google.android.material.appbar.AppBarLayout r12 = (com.google.android.material.appbar.AppBarLayout) r12
            int r4 = r3.A0S()
            r5 = 0
            if (r15 == 0) goto L_0x00b4
            if (r4 < r15) goto L_0x00b4
            r0 = r16
            if (r4 > r0) goto L_0x00b4
            if (r14 < r15) goto L_0x0018
            r15 = r14
            if (r14 <= r0) goto L_0x0018
            r15 = r0
        L_0x0018:
            if (r4 == r15) goto L_0x00aa
            boolean r0 = r12.A0A
            r2 = r15
            if (r0 == 0) goto L_0x0086
            int r6 = java.lang.Math.abs(r15)
            int r10 = r12.getChildCount()
            r1 = 0
            r7 = 0
        L_0x0029:
            if (r7 >= r10) goto L_0x0086
            android.view.View r9 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
            X.5sn r8 = (X.C298055sn) r8
            android.view.animation.Interpolator r5 = r8.A01
            int r0 = r9.getTop()
            if (r6 < r0) goto L_0x00b0
            int r0 = r9.getBottom()
            if (r6 > r0) goto L_0x00b0
            if (r5 == 0) goto L_0x0086
            int r7 = r8.A00
            r0 = r7 & 1
            if (r0 == 0) goto L_0x005e
            int r1 = r9.getHeight()
            int r0 = r8.topMargin
            int r1 = r1 + r0
            int r0 = r8.bottomMargin
            int r1 = r1 + r0
            r0 = r7 & 2
            if (r0 == 0) goto L_0x005e
            int r0 = r9.getMinimumHeight()
            int r1 = r1 - r0
        L_0x005e:
            boolean r0 = r9.getFitsSystemWindows()
            if (r0 == 0) goto L_0x0069
            int r0 = r12.getTopInset()
            int r1 = r1 - r0
        L_0x0069:
            if (r1 <= 0) goto L_0x0086
            int r0 = r9.getTop()
            int r6 = r6 - r0
            float r1 = (float) r1
            float r0 = (float) r6
            float r0 = r0 / r1
            float r0 = r5.getInterpolation(r0)
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r2 = java.lang.Integer.signum(r15)
            int r0 = r9.getTop()
            int r0 = r0 + r1
            int r2 = r2 * r0
        L_0x0086:
            boolean r1 = r3.A0R(r2)
            int r5 = r4 - r15
            int r0 = r15 - r2
            r3.A01 = r0
            if (r1 != 0) goto L_0x0099
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x0099
            r13.A0D(r12)
        L_0x0099:
            X.6yd r0 = r3.A01
            if (r0 == 0) goto L_0x00ae
            int r0 = r0.A02
        L_0x009f:
            r12.A01(r0)
            r1 = 1
            if (r15 >= r4) goto L_0x00a6
            r1 = -1
        L_0x00a6:
            r0 = 0
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.A08(r13, r12, r15, r1, r0)
        L_0x00aa:
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.A06(r13, r3, r12)
            return r5
        L_0x00ae:
            r0 = 0
            goto L_0x009f
        L_0x00b0:
            int r7 = r7 + 1
            goto L_0x0029
        L_0x00b4:
            r3.A01 = r5
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0T(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int, int, int):int");
    }

    public final void A0U(View view, CoordinatorLayout coordinatorLayout) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        AppBarLayout.BaseBehavior.A05(coordinatorLayout, (AppBarLayout.BaseBehavior) this, appBarLayout);
        if (appBarLayout.A0B) {
            appBarLayout.A05(appBarLayout.A04(AppBarLayout.BaseBehavior.A04(coordinatorLayout)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r10.A0G(r9, r5, r2) == false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(android.view.MotionEvent r8, android.view.View r9, androidx.coordinatorlayout.widget.CoordinatorLayout r10) {
        /*
            r7 = this;
            int r0 = r7.A05
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r10.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.A05 = r0
        L_0x0012:
            int r1 = r8.getActionMasked()
            r0 = 2
            r6 = 1
            r4 = -1
            r3 = 0
            if (r1 != r0) goto L_0x003e
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x003e
            int r0 = r7.A03
            if (r0 == r4) goto L_0x00a0
            int r0 = r8.findPointerIndex(r0)
            if (r0 == r4) goto L_0x00a0
            float r0 = r8.getY(r0)
            int r2 = (int) r0
            int r0 = r7.A04
            int r0 = r2 - r0
            int r1 = java.lang.Math.abs(r0)
            int r0 = r7.A05
            if (r1 <= r0) goto L_0x003e
            r7.A04 = r2
            return r6
        L_0x003e:
            int r0 = r8.getActionMasked()
            if (r0 != 0) goto L_0x0099
            r7.A03 = r4
            float r0 = r8.getX()
            int r5 = (int) r0
            float r0 = r8.getY()
            int r2 = (int) r0
            r0 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            java.lang.ref.WeakReference r0 = r0.A04
            if (r0 == 0) goto L_0x006b
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0072
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L_0x0072
            boolean r0 = r1.canScrollVertically(r4)
            if (r0 != 0) goto L_0x0072
        L_0x006b:
            boolean r1 = r10.A0G(r9, r5, r2)
            r0 = 1
            if (r1 != 0) goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            r7.A06 = r0
            if (r0 == 0) goto L_0x0099
            r7.A04 = r2
            int r0 = r8.getPointerId(r3)
            r7.A03 = r0
            android.view.VelocityTracker r0 = r7.A00
            if (r0 != 0) goto L_0x0089
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.A00 = r0
        L_0x0089:
            android.widget.OverScroller r0 = r7.A01
            if (r0 == 0) goto L_0x0099
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0099
            android.widget.OverScroller r0 = r7.A01
            r0.abortAnimation()
            return r6
        L_0x0099:
            android.view.VelocityTracker r0 = r7.A00
            if (r0 == 0) goto L_0x00a0
            r0.addMovement(r8)
        L_0x00a0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0L(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(android.view.MotionEvent r18, android.view.View r19, androidx.coordinatorlayout.widget.CoordinatorLayout r20) {
        /*
            r17 = this;
            r2 = r18
            int r7 = r2.getActionMasked()
            r6 = -1
            r1 = 1
            r9 = 0
            r3 = r17
            r5 = r19
            r4 = r20
            if (r7 == r1) goto L_0x0069
            r0 = 2
            if (r7 == r0) goto L_0x0042
            r0 = 3
            if (r7 == r0) goto L_0x00db
            r0 = 6
            if (r7 != r0) goto L_0x0032
            int r0 = r2.getActionIndex()
            r4 = 0
            if (r0 != 0) goto L_0x0022
            r4 = 1
        L_0x0022:
            int r0 = r2.getPointerId(r4)
            r3.A03 = r0
            float r4 = r2.getY(r4)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r0 = (int) r4
            r3.A04 = r0
        L_0x0032:
            r4 = 0
        L_0x0033:
            android.view.VelocityTracker r0 = r3.A00
            if (r0 == 0) goto L_0x003a
            r0.addMovement(r2)
        L_0x003a:
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0041
            if (r4 != 0) goto L_0x0041
            r1 = 0
        L_0x0041:
            return r1
        L_0x0042:
            int r0 = r3.A03
            int r0 = r2.findPointerIndex(r0)
            if (r0 != r6) goto L_0x004b
            return r9
        L_0x004b:
            float r0 = r2.getY(r0)
            int r0 = (int) r0
            int r6 = r3.A04
            int r6 = r6 - r0
            r3.A04 = r0
            r0 = r5
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getDownNestedScrollRange()
            int r0 = -r0
            int r7 = r3.A0S()
            int r7 = r7 - r6
            r8 = r0
            r6 = r4
            r4 = r3
            r4.A0T(r5, r6, r7, r8, r9)
            goto L_0x0032
        L_0x0069:
            android.view.VelocityTracker r0 = r3.A00
            if (r0 == 0) goto L_0x00db
            r0.addMovement(r2)
            android.view.VelocityTracker r7 = r3.A00
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r3.A00
            int r0 = r3.A03
            float r7 = r7.getYVelocity(r0)
            r0 = r5
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getTotalScrollRange()
            int r15 = -r0
            java.lang.Runnable r0 = r3.A02
            if (r0 == 0) goto L_0x0091
            r5.removeCallbacks(r0)
            r0 = 0
            r3.A02 = r0
        L_0x0091:
            android.widget.OverScroller r8 = r3.A01
            if (r8 != 0) goto L_0x00a0
            android.content.Context r0 = r5.getContext()
            android.widget.OverScroller r8 = new android.widget.OverScroller
            r8.<init>(r0)
            r3.A01 = r8
        L_0x00a0:
            X.6yd r0 = r3.A01
            if (r0 == 0) goto L_0x00d9
            int r10 = r0.A02
        L_0x00a6:
            int r12 = java.lang.Math.round(r7)
            r11 = r9
            r13 = r9
            r14 = r9
            r16 = r9
            r8.fling(r9, r10, r11, r12, r13, r14, r15, r16)
            android.widget.OverScroller r0 = r3.A01
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00d5
            X.ToM r0 = new X.ToM
            r0.<init>(r5, r4, r3)
            r3.A02 = r0
            r5.postOnAnimation(r0)
        L_0x00c4:
            r4 = 1
        L_0x00c5:
            r3.A06 = r9
            r3.A03 = r6
            android.view.VelocityTracker r0 = r3.A00
            if (r0 == 0) goto L_0x0033
            r0.recycle()
            r0 = 0
            r3.A00 = r0
            goto L_0x0033
        L_0x00d5:
            r3.A0U(r5, r4)
            goto L_0x00c4
        L_0x00d9:
            r10 = 0
            goto L_0x00a6
        L_0x00db:
            r4 = 0
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.A0M(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public final void A0V(View view, CoordinatorLayout coordinatorLayout, int i) {
        A0T(view, coordinatorLayout, i, AnonymousClass972.MUTABLE_FLAG_MASK, Integer.MAX_VALUE);
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        this.A00 = 0;
    }

    public HeaderBehavior() {
    }
}
