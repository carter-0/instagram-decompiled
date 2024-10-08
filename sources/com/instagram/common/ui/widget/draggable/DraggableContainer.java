package com.instagram.common.ui.widget.draggable;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C51965G9l;
import X.C63515KyQ;
import X.JTT;
import X.LPC;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DraggableContainer extends FrameLayout implements Animation.AnimationListener {
    public float A00;
    public float A01;
    public Rect A02;
    public RoundedCornerImageView A03;
    public float A04;
    public float A05;
    public final Rect A06;
    public final Rect A07;
    public final int[] A08;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DraggableContainer(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        boolean A062 = C63515KyQ.A00.A06();
        if (A062) {
            this.A04 = motionEvent.getRawX();
            this.A05 = motionEvent.getRawY();
            if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                onAnimationEnd((Animation) null);
            }
        }
        return A062;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public static final void A02(DraggableContainer draggableContainer) {
        ? r2 = draggableContainer.A03;
        if (r2 == 0) {
            0qQ.A0F("draggableView");
            throw AnonymousClass00P.createAndThrow();
        }
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = (int) draggableContainer.A00;
        marginLayoutParams.topMargin = (int) draggableContainer.A01;
        r2.setLayoutParams(marginLayoutParams);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* access modifiers changed from: private */
    public final float getDragCenterX() {
        float f = ((float) this.A06.left) + this.A00;
        ? r0 = this.A03;
        if (r0 != 0) {
            return f + ((float) (r0.getWidth() / 2));
        }
        0qQ.A0F("draggableView");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* access modifiers changed from: private */
    public final float getDragCenterY() {
        float f = ((float) this.A06.top) + this.A01;
        ? r0 = this.A03;
        if (r0 != 0) {
            return f + ((float) (r0.getHeight() / 2));
        }
        0qQ.A0F("draggableView");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void onAnimationEnd(Animation animation) {
        ? r1 = this.A03;
        if (r1 == 0) {
            0qQ.A0F("draggableView");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.setVisibility(4);
        LPC lpc = C63515KyQ.A00;
        lpc.A05(A03());
        lpc.A00 = null;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    private final boolean A03() {
        View findViewById = findViewById(R.id.drag_target);
        if (findViewById == null || !findViewById.isShown()) {
            return false;
        }
        if (this.A02.isEmpty()) {
            findViewById.getGlobalVisibleRect(this.A02);
        }
        ? r0 = this.A03;
        if (r0 == 0) {
            0qQ.A0F("draggableView");
            throw AnonymousClass00P.createAndThrow();
        }
        Rect rect = this.A07;
        r0.getGlobalVisibleRect(rect);
        return this.A02.contains(rect);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1671160262);
        super.onAttachedToWindow();
        C63515KyQ.A00.A01 = C51965G9l.A0v(this);
        AnonymousClass0fD.A0D(-1598039035, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1001398252);
        super.onDetachedFromWindow();
        C63515KyQ.A00.A00 = null;
        AnonymousClass0fD.A0D(-652822441, A062);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v2, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005c, code lost:
        if (r6 != 3) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r0 = -1042661076(0xffffffffc1da412c, float:-27.281822)
            int r3 = X.AnonymousClass0fD.A05(r0)
            r7 = 0
            X.0qQ.A0B(r13, r7)
            X.LPC r4 = X.C63515KyQ.A00
            boolean r0 = r4.A06()
            if (r0 != 0) goto L_0x001a
            r0 = -144497518(0xfffffffff7632492, float:-4.6070044E33)
            X.AnonymousClass0fD.A0C(r0, r3)
            return r7
        L_0x001a:
            int r6 = r13.getAction()
            float r2 = r12.A00
            float r1 = r13.getRawX()
            float r0 = r12.A04
            float r1 = r1 - r0
            float r2 = r2 + r1
            r12.A00 = r2
            float r2 = r12.A01
            float r1 = r13.getRawY()
            float r0 = r12.A05
            float r1 = r1 - r0
            float r2 = r2 + r1
            r12.A01 = r2
            float r1 = r12.A00
            int r0 = r12.getMeasuredWidth()
            r2 = 1
            int r0 = r0 - r2
            float r0 = (float) r0
            float r0 = java.lang.Math.min(r1, r0)
            r12.A00 = r0
            float r1 = r12.A01
            int r0 = r12.getMeasuredHeight()
            int r0 = r0 - r2
            float r0 = (float) r0
            float r0 = java.lang.Math.min(r1, r0)
            r12.A01 = r0
            java.lang.String r5 = "draggableView"
            r1 = 0
            if (r6 == r2) goto L_0x00d6
            r0 = 2
            if (r6 == r0) goto L_0x0071
            r0 = 3
            if (r6 == r0) goto L_0x00d6
        L_0x005e:
            float r0 = r13.getRawX()
            r12.A04 = r0
            float r0 = r13.getRawY()
            r12.A05 = r0
            r0 = 1080396345(0x40658a39, float:3.5865614)
            X.AnonymousClass0fD.A0C(r0, r3)
            return r2
        L_0x0071:
            A02(r12)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r7 = r12.A03
            if (r7 == 0) goto L_0x0174
            float r8 = r12.getDragCenterX()
            float r9 = r12.getDragCenterY()
            boolean r10 = r12.A03()
            float r0 = r13.getX()
            int r5 = (int) r0
            float r0 = r13.getY()
            int r1 = (int) r0
            r0 = 2131432064(0x7f0b1280, float:1.8485875E38)
            android.view.View r6 = r12.findViewById(r0)
            if (r6 == 0) goto L_0x00b2
            boolean r0 = r6.isShown()
            if (r0 == 0) goto L_0x00b2
            android.graphics.Rect r0 = r12.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00aa
            android.graphics.Rect r0 = r12.A02
            r6.getGlobalVisibleRect(r0)
        L_0x00aa:
            android.graphics.Rect r0 = r12.A02
            boolean r11 = r0.contains(r5, r1)
        L_0x00b0:
            monitor-enter(r4)
            goto L_0x00b4
        L_0x00b2:
            r11 = 0
            goto L_0x00b0
        L_0x00b4:
            X.LD1 r0 = r4.A00     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x00d4
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0171 }
            java.util.Set r0 = X.LPC.A00(r4, r0)     // Catch:{ all -> 0x0171 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0171 }
        L_0x00c4:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0171 }
            if (r0 == 0) goto L_0x00d4
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0171 }
            X.MV0 r6 = (X.MV0) r6     // Catch:{ all -> 0x0171 }
            r6.DAj(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0171 }
            goto L_0x00c4
        L_0x00d4:
            monitor-exit(r4)
            goto L_0x005e
        L_0x00d6:
            r4.A01()
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r6 = r12.A03
            if (r6 == 0) goto L_0x0174
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L_0x016c
            X.LD1 r0 = r4.A00
            r0.getClass()
            java.lang.ref.WeakReference r0 = r0.A00()
            java.lang.Object r5 = r0.get()
            r5.getClass()
            android.view.View r5 = (android.view.View) r5
            android.graphics.Rect r4 = X.AnonymousClass7TE.A0W()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            boolean r0 = r5.getGlobalVisibleRect(r4, r1)
            if (r0 == 0) goto L_0x015e
            int r0 = r1.y
            r4.top = r0
            int r0 = r1.x
            r4.left = r0
        L_0x010c:
            boolean r0 = r12.A03()
            if (r0 == 0) goto L_0x0152
            android.graphics.Rect r0 = r12.A02
            int r0 = r0.centerX()
            float r1 = (float) r0
            float r0 = r12.getDragCenterX()
        L_0x011d:
            float r1 = r1 - r0
            boolean r0 = r12.A03()
            if (r0 == 0) goto L_0x0146
            android.graphics.Rect r0 = r12.A02
            int r0 = r0.centerY()
            float r4 = (float) r0
            float r0 = r12.getDragCenterY()
        L_0x012f:
            float r4 = r4 - r0
            r0 = 0
            android.view.animation.TranslateAnimation r7 = new android.view.animation.TranslateAnimation
            r7.<init>(r0, r1, r0, r4)
            double r4 = X.JTR.A00(r1, r4)
            long r0 = (long) r4
            r7.setDuration(r0)
            r7.setAnimationListener(r12)
            r6.startAnimation(r7)
            goto L_0x005e
        L_0x0146:
            int r0 = r4.top
            float r4 = (float) r0
            float r0 = r12.A01
            float r4 = r4 - r0
            android.graphics.Rect r0 = r12.A06
            int r0 = r0.top
            float r0 = (float) r0
            goto L_0x012f
        L_0x0152:
            int r0 = r4.left
            float r1 = (float) r0
            float r0 = r12.A00
            float r1 = r1 - r0
            android.graphics.Rect r0 = r12.A06
            int r0 = r0.left
            float r0 = (float) r0
            goto L_0x011d
        L_0x015e:
            int[] r1 = r12.A08
            r5.getLocationInWindow(r1)
            r0 = r1[r2]
            r4.top = r0
            r0 = r1[r7]
            r4.left = r0
            goto L_0x010c
        L_0x016c:
            r12.onAnimationEnd(r1)
            goto L_0x005e
        L_0x0171:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0174:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.draggable.DraggableContainer.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A08 = new int[2];
        this.A06 = AnonymousClass7TE.A0W();
        this.A07 = AnonymousClass7TE.A0W();
        this.A02 = AnonymousClass7TE.A0W();
        ? roundedCornerImageView = new RoundedCornerImageView(AnonymousClass7TE.A0S(this));
        this.A03 = roundedCornerImageView;
        roundedCornerImageView.setVisibility(4);
        ? r0 = this.A03;
        if (r0 == 0) {
            0qQ.A0F("draggableView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            addView(r0);
        }
    }

    public /* synthetic */ DraggableContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DraggableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
