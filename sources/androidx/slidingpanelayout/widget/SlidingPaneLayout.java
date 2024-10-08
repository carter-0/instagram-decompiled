package androidx.slidingpanelayout.widget;

import X.02M;
import X.03v;
import X.04k;
import X.0qQ;
import X.19B;
import X.19E;
import X.1Eo;
import X.AnonymousClass0fD;
import X.AnonymousClass19S;
import X.AnonymousClass4D7;
import X.AnonymousClass4W8;
import X.AnonymousClass7TF;
import X.C13989Tnp;
import X.C14161Tqz;
import X.C14715U3i;
import X.C14753U7k;
import X.C18947WEa;
import X.C262204Co;
import X.C265534Vd;
import X.C55285HfE;
import X.C586203k;
import X.C66581MXm;
import X.DbS;
import X.JTQ;
import X.MH2;
import X.U4N;
import X.U7P;
import X.V50;
import X.VXT;
import X.W3p;
import X.X0E;
import X.X0F;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;

public class SlidingPaneLayout extends ViewGroup {
    public static boolean A0O = JTQ.A1P(Build.VERSION.SDK_INT, 29);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public Drawable A05;
    public View A06;
    public AnonymousClass4W8 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public int A0F;
    public int A0G;
    public X0E A0H;
    public VXT A0I;
    public X0F A0J;
    public final W3p A0K;
    public final ArrayList A0L;
    public final List A0M;
    public final Rect A0N;

    public final boolean A04(View view) {
        if (view == null) {
            return false;
        }
        return this.A08 && ((C14715U3i) view.getLayoutParams()).A01 && this.A00 > 0.0f;
    }

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C14161Tqz(3);
        public int A00;
        public boolean A01;

        public final void writeToParcel(Parcel parcel, int i) {
            SlidingPaneLayout.super.writeToParcel(parcel, i);
            parcel.writeInt(this.A01 ? 1 : 0);
            parcel.writeInt(this.A00);
        }
    }

    public static void A00(SlidingPaneLayout slidingPaneLayout) {
        if (!slidingPaneLayout.A08) {
            slidingPaneLayout.A0B = false;
        }
        if (slidingPaneLayout.A09 || slidingPaneLayout.A03(1.0f)) {
            slidingPaneLayout.A0B = false;
        }
    }

    private 02M getSystemGestureInsets() {
        04k A002;
        if (!A0O || (A002 = C586203k.A00(this)) == null) {
            return null;
        }
        return A002.A00.A02();
    }

    private void setFoldingFeatureObserver(VXT vxt) {
        this.A0I = vxt;
        X0E x0e = this.A0H;
        0qQ.A0B(x0e, 0);
        vxt.A00 = x0e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r1 > r7) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.view.View r20) {
        /*
            r19 = this;
            r14 = r19
            int r0 = r14.getLayoutDirection()
            boolean r18 = X.C66581MXm.A1V(r0)
            if (r18 == 0) goto L_0x008c
            int r17 = X.C13989Tnp.A0G(r14)
            int r16 = r14.getPaddingLeft()
        L_0x0014:
            int r12 = r14.getPaddingTop()
            int r11 = X.C13989Tnp.A0F(r14)
            r13 = r20
            if (r20 == 0) goto L_0x0087
            boolean r0 = r13.isOpaque()
            if (r0 == 0) goto L_0x0087
            int r10 = r13.getLeft()
            int r9 = r13.getRight()
            int r8 = r13.getTop()
            int r7 = r13.getBottom()
        L_0x0036:
            int r6 = r14.getChildCount()
            r5 = 0
        L_0x003b:
            if (r5 >= r6) goto L_0x0095
            android.view.View r4 = r14.getChildAt(r5)
            if (r4 == r13) goto L_0x0095
            int r1 = r4.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0084
            r1 = r17
            if (r18 == 0) goto L_0x0051
            r1 = r16
        L_0x0051:
            int r0 = r4.getLeft()
            int r15 = java.lang.Math.max(r1, r0)
            int r0 = r4.getTop()
            int r3 = java.lang.Math.max(r12, r0)
            r1 = r16
            if (r18 == 0) goto L_0x0067
            r1 = r17
        L_0x0067:
            int r0 = r4.getRight()
            int r2 = java.lang.Math.min(r1, r0)
            int r0 = r4.getBottom()
            int r1 = java.lang.Math.min(r11, r0)
            if (r15 < r10) goto L_0x0080
            if (r3 < r8) goto L_0x0080
            if (r2 > r9) goto L_0x0080
            r0 = 4
            if (r1 <= r7) goto L_0x0081
        L_0x0080:
            r0 = 0
        L_0x0081:
            r4.setVisibility(r0)
        L_0x0084:
            int r5 = r5 + 1
            goto L_0x003b
        L_0x0087:
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            goto L_0x0036
        L_0x008c:
            int r17 = r14.getPaddingLeft()
            int r16 = X.C13989Tnp.A0G(r14)
            goto L_0x0014
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.A02(android.view.View):void");
    }

    public final boolean A03(float f) {
        float paddingLeft;
        if (this.A08) {
            boolean A1V = C66581MXm.A1V(getLayoutDirection());
            ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(this.A06);
            if (A1V) {
                paddingLeft = ((float) getWidth()) - ((((float) (getPaddingRight() + A0D2.rightMargin)) + (f * ((float) this.A03))) + ((float) this.A06.getWidth()));
            } else {
                paddingLeft = ((float) (getPaddingLeft() + A0D2.leftMargin)) + (f * ((float) this.A03));
            }
            int i = (int) paddingLeft;
            W3p w3p = this.A0K;
            View view = this.A06;
            int top = view.getTop();
            w3p.A08 = view;
            w3p.A02 = -1;
            if (W3p.A0B(w3p, i, top, 0, 0)) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                postInvalidateOnAnimation();
                return true;
            } else if (w3p.A03 == 0 && w3p.A08 != null) {
                w3p.A08 = null;
            }
        }
        return false;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C14715U3i) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public final void computeScroll() {
        W3p w3p = this.A0K;
        if (!w3p.A0I()) {
            return;
        }
        if (!this.A08) {
            w3p.A0D();
        } else {
            postInvalidateOnAnimation();
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C14715U3i();
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.A0F;
    }

    public final int getLockMode() {
        return this.A01;
    }

    public int getParallaxDistance() {
        return this.A02;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.A0G;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.A00);
        if (savedState.A01) {
            if (!this.A08) {
                this.A0B = true;
            }
            if (this.A09 || A03(0.0f)) {
                this.A0B = true;
            }
        } else {
            A00(this);
        }
        this.A0B = savedState.A01;
        this.A01 = savedState.A00;
    }

    @Deprecated
    public void setCoveredFadeColor(int i) {
        this.A0F = i;
    }

    public final void setLockMode(int i) {
        this.A01 = i;
    }

    @Deprecated
    public void setPanelSlideListener(X0F x0f) {
        if (x0f != null) {
            this.A0M.add(x0f);
        }
        this.A0J = x0f;
    }

    public void setParallaxDistance(int i) {
        this.A02 = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        this.A04 = drawable;
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.A04 = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.A05 = drawable;
    }

    @Deprecated
    public void setSliderFadeColor(int i) {
        this.A0G = i;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0G = 0;
        this.A00 = 1.0f;
        this.A0M = new CopyOnWriteArrayList();
        this.A09 = true;
        this.A0N = new Rect();
        this.A0L = new ArrayList();
        this.A0H = new C18947WEa(this);
        float A032 = C13989Tnp.A03(context);
        setWillNotDraw(false);
        03v.A0B(this, new U7P(this));
        setImportantForAccessibility(1);
        W3p w3p = new W3p(getContext(), this, new C14753U7k(this));
        w3p.A06 = (int) (((float) w3p.A06) * (1.0f / 0.5f));
        this.A0K = w3p;
        w3p.A01 = A032 * 400.0f;
        V50 v50 = V50.$redex_init_class;
        setFoldingFeatureObserver(new VXT(C265534Vd.A00.A00(context), context.getMainExecutor()));
    }

    public static void A01(SlidingPaneLayout slidingPaneLayout, float f) {
        boolean A1V = C66581MXm.A1V(slidingPaneLayout.getLayoutDirection());
        int childCount = slidingPaneLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = slidingPaneLayout.getChildAt(i);
            if (childAt != slidingPaneLayout.A06) {
                float f2 = 1.0f - slidingPaneLayout.A0E;
                float f3 = (float) slidingPaneLayout.A02;
                slidingPaneLayout.A0E = f;
                int i2 = ((int) (f2 * f3)) - ((int) ((1.0f - f) * f3));
                if (A1V) {
                    i2 = -i2;
                }
                childAt.offsetLeftAndRight(i2);
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.addView(view);
            super.addView(frameLayout, i, layoutParams);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        View childAt;
        int i2;
        int i3;
        int A032 = AnonymousClass0fD.A03(-1304541287);
        super.draw(canvas);
        if (getLayoutDirection() == 1) {
            drawable = this.A05;
        } else {
            drawable = this.A04;
        }
        if (getChildCount() <= 1 || (childAt = getChildAt(1)) == null || drawable == null) {
            i = -799628688;
        } else {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (getLayoutDirection() == 1) {
                i2 = childAt.getRight();
                i3 = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                i2 = left - intrinsicWidth;
                i3 = left;
            }
            drawable.setBounds(i2, top, i3, bottom);
            drawable.draw(canvas);
            i = 1750185459;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r4.A00 == 0.0f) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean drawChild(android.graphics.Canvas r5, android.view.View r6, long r7) {
        /*
            r4 = this;
            int r0 = r4.getLayoutDirection()
            boolean r3 = X.C66581MXm.A1V(r0)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0014
            float r1 = r4.A00
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            r3 = r3 ^ r0
            X.W3p r2 = r4.A0K
            if (r3 == 0) goto L_0x0077
            r0 = 1
            r2.A07 = r0
            X.02M r0 = r4.getSystemGestureInsets()
            if (r0 == 0) goto L_0x002d
            int r1 = r2.A0J
            int r0 = r0.A01
        L_0x0027:
            int r0 = java.lang.Math.max(r1, r0)
            r2.A04 = r0
        L_0x002d:
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            X.U3i r1 = (X.C14715U3i) r1
            int r2 = r5.save()
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0060
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0060
            android.view.View r0 = r4.A06
            if (r0 == 0) goto L_0x0060
            android.graphics.Rect r3 = r4.A0N
            r5.getClipBounds(r3)
            int r1 = r4.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0068
            int r1 = r3.left
            android.view.View r0 = r4.A06
            int r0 = r0.getRight()
            int r0 = java.lang.Math.max(r1, r0)
            r3.left = r0
        L_0x005d:
            r5.clipRect(r3)
        L_0x0060:
            boolean r0 = super.drawChild(r5, r6, r7)
            r5.restoreToCount(r2)
            return r0
        L_0x0068:
            int r1 = r3.right
            android.view.View r0 = r4.A06
            int r0 = r0.getLeft()
            int r0 = java.lang.Math.min(r1, r0)
            r3.right = r0
            goto L_0x005d
        L_0x0077:
            r0 = 2
            r2.A07 = r0
            X.02M r0 = r4.getSystemGestureInsets()
            if (r0 == 0) goto L_0x002d
            int r1 = r2.A0J
            int r0 = r0.A02
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, X.U3i] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.A00 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14715U3i.A03);
        marginLayoutParams.A00 = obtainStyledAttributes.getFloat(0, 0.0f);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-125872570);
        super.onAttachedToWindow();
        this.A09 = true;
        if (this.A0I != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (!(context instanceof Activity)) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else if (context != null) {
                    VXT vxt = this.A0I;
                    C262204Co r0 = vxt.A01;
                    if (r0 != null) {
                        r0.AG7((CancellationException) null);
                    }
                    AnonymousClass19S A022 = 19E.A02(C55285HfE.A00(vxt.A03));
                    vxt.A01 = 1Eo.A04(19B.A00, new MH2((Object) vxt, (Object) context, (AnonymousClass4D7) null, 38), A022);
                }
            }
        }
        AnonymousClass0fD.A0D(1997144091, A062);
    }

    public final void onDetachedFromWindow() {
        C262204Co r1;
        int A062 = AnonymousClass0fD.A06(-906024903);
        super.onDetachedFromWindow();
        this.A09 = true;
        VXT vxt = this.A0I;
        if (!(vxt == null || (r1 = vxt.A01) == null)) {
            r1.AG7((CancellationException) null);
        }
        ArrayList arrayList = this.A0L;
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw new NullPointerException("run");
        }
        arrayList.clear();
        AnonymousClass0fD.A0D(1849583139, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (A04(r6.A06) == false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r4 = r7.getActionMasked()
            boolean r0 = r6.A08
            r3 = 1
            if (r0 != 0) goto L_0x0027
            if (r4 != 0) goto L_0x0027
            int r0 = r6.getChildCount()
            if (r0 <= r3) goto L_0x0027
            android.view.View r2 = r6.getChildAt(r3)
            if (r2 == 0) goto L_0x0027
            float r0 = r7.getX()
            int r1 = (int) r0
            float r0 = r7.getY()
            int r0 = (int) r0
            boolean r0 = X.W3p.A0A(r2, r1, r0)
            r6.A0B = r0
        L_0x0027:
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0031
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x003b
            if (r4 == 0) goto L_0x003b
        L_0x0031:
            X.W3p r0 = r6.A0K
            r0.A0E()
            boolean r0 = super.onInterceptTouchEvent(r7)
            return r0
        L_0x003b:
            r0 = 3
            r5 = 0
            if (r4 == r0) goto L_0x009b
            if (r4 == r3) goto L_0x009b
            if (r4 == 0) goto L_0x006d
            r0 = 2
            if (r4 != r0) goto L_0x008e
            float r2 = r7.getX()
            float r1 = r7.getY()
            float r0 = r6.A0C
            float r4 = X.AnonymousClass7TE.A00(r2, r0)
            float r0 = r6.A0D
            float r2 = X.AnonymousClass7TE.A00(r1, r0)
            X.W3p r1 = r6.A0K
            int r0 = r1.A06
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            r1.A0E()
            r6.A0A = r3
            return r5
        L_0x006d:
            r6.A0A = r5
            float r1 = r7.getX()
            float r0 = r7.getY()
            r6.A0C = r1
            r6.A0D = r0
            android.view.View r2 = r6.A06
            int r1 = (int) r1
            int r0 = (int) r0
            boolean r0 = X.W3p.A0A(r2, r1, r0)
            if (r0 == 0) goto L_0x008e
            android.view.View r0 = r6.A06
            boolean r0 = r6.A04(r0)
            r1 = 1
            if (r0 != 0) goto L_0x008f
        L_0x008e:
            r1 = 0
        L_0x008f:
            X.W3p r0 = r6.A0K
            boolean r0 = r0.A0K(r7)
            if (r0 != 0) goto L_0x009a
            if (r1 != 0) goto L_0x009a
            r3 = 0
        L_0x009a:
            return r3
        L_0x009b:
            X.W3p r0 = r6.A0K
            r0.A0E()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (r15.A0B == false) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
        /*
            r15 = this;
            int r0 = r15.getLayoutDirection()
            boolean r14 = X.C66581MXm.A1V(r0)
            int r19 = r19 - r17
            if (r14 == 0) goto L_0x00e4
            int r7 = r15.getPaddingRight()
            int r13 = r15.getPaddingLeft()
        L_0x0014:
            int r6 = r15.getPaddingTop()
            int r5 = r15.getChildCount()
            boolean r0 = r15.A09
            if (r0 == 0) goto L_0x002d
            boolean r0 = r15.A08
            if (r0 == 0) goto L_0x0029
            boolean r1 = r15.A0B
            r0 = 0
            if (r1 != 0) goto L_0x002b
        L_0x0029:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x002b:
            r15.A00 = r0
        L_0x002d:
            r12 = r7
            r4 = 0
        L_0x002f:
            if (r4 >= r5) goto L_0x00ee
            android.view.View r3 = r15.getChildAt(r4)
            int r1 = r3.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x00c7
            android.view.ViewGroup$LayoutParams r10 = r3.getLayoutParams()
            X.U3i r10 = (X.C14715U3i) r10
            int r11 = r3.getMeasuredWidth()
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x00d0
            int r1 = r10.leftMargin
            int r0 = r10.rightMargin
            int r1 = r1 + r0
            int r9 = r19 - r13
            int r8 = java.lang.Math.min(r7, r9)
            int r8 = r8 - r12
            int r8 = r8 - r1
            r15.A03 = r8
            if (r14 == 0) goto L_0x00cd
            int r2 = r10.rightMargin
        L_0x005e:
            int r1 = r12 + r2
            int r1 = r1 + r8
            int r0 = r11 / 2
            int r1 = r1 + r0
            boolean r0 = X.C51970G9q.A1W(r1, r9)
            r10.A01 = r0
            float r1 = (float) r8
            float r0 = r15.A00
            float r0 = r0 * r1
            int r0 = (int) r0
            int r2 = r2 + r0
            int r12 = r12 + r2
            float r0 = (float) r0
            float r0 = r0 / r1
            r15.A00 = r0
        L_0x0075:
            r0 = 0
        L_0x0076:
            int r2 = r12 - r0
            int r1 = r2 + r11
            if (r14 == 0) goto L_0x0081
            int r1 = r19 - r12
            int r1 = r1 + r0
            int r2 = r1 - r11
        L_0x0081:
            int r0 = r3.getMeasuredHeight()
            int r0 = r0 + r6
            r3.layout(r2, r6, r1, r0)
            X.4W8 r2 = r15.A07
            if (r2 == 0) goto L_0x00cb
            X.Vtx r1 = r2.BYt()
            X.Vtx r0 = X.C18545Vtx.A02
            if (r1 != r0) goto L_0x00cb
            X.WEl r2 = (X.C18958WEl) r2
            X.Vtz r1 = r2.A01
            X.Vtz r0 = X.C18547Vtz.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00b3
            X.Vtz r0 = X.C18547Vtz.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00cb
            X.Vty r1 = r2.A00
            X.Vty r0 = X.C18546Vty.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00cb
        L_0x00b3:
            X.4W8 r0 = r15.A07
            android.graphics.Rect r0 = r0.AhW()
            int r0 = r0.width()
        L_0x00bd:
            int r1 = r3.getWidth()
            int r0 = java.lang.Math.abs(r0)
            int r1 = r1 + r0
            int r7 = r7 + r1
        L_0x00c7:
            int r4 = r4 + 1
            goto L_0x002f
        L_0x00cb:
            r0 = 0
            goto L_0x00bd
        L_0x00cd:
            int r2 = r10.leftMargin
            goto L_0x005e
        L_0x00d0:
            boolean r0 = r15.A08
            if (r0 == 0) goto L_0x00e2
            int r2 = r15.A02
            if (r2 == 0) goto L_0x00e2
            float r0 = r15.A00
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            float r0 = (float) r2
            float r1 = r1 * r0
            int r0 = (int) r1
            r12 = r7
            goto L_0x0076
        L_0x00e2:
            r12 = r7
            goto L_0x0075
        L_0x00e4:
            int r7 = r15.getPaddingLeft()
            int r13 = r15.getPaddingRight()
            goto L_0x0014
        L_0x00ee:
            boolean r0 = r15.A09
            if (r0 == 0) goto L_0x0104
            boolean r0 = r15.A08
            if (r0 == 0) goto L_0x00ff
            int r0 = r15.A02
            if (r0 == 0) goto L_0x00ff
            float r0 = r15.A00
            A01(r15, r0)
        L_0x00ff:
            android.view.View r0 = r15.A06
            r15.A02(r0)
        L_0x0104:
            r0 = 0
            r15.A09 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0278, code lost:
        if (r16 < r2.getMinimumWidth()) goto L_0x027a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0137 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r24, int r25) {
        /*
            r23 = this;
            int r16 = android.view.View.MeasureSpec.getMode(r24)
            int r21 = android.view.View.MeasureSpec.getSize(r24)
            r22 = r25
            int r11 = android.view.View.MeasureSpec.getMode(r22)
            int r1 = android.view.View.MeasureSpec.getSize(r22)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 1073741824(0x40000000, float:2.0)
            r13 = 0
            r10 = r23
            if (r11 == r9) goto L_0x00cb
            if (r11 == r0) goto L_0x00c4
            r8 = 0
            r2 = 0
        L_0x001f:
            r0 = r21
            int r0 = X.C66582MXn.A04(r10, r0)
            int r20 = java.lang.Math.max(r0, r13)
            int r7 = r10.getChildCount()
            r19 = 2
            r0 = r19
            if (r7 <= r0) goto L_0x003a
            java.lang.String r1 = "SlidingPaneLayout"
            java.lang.String r0 = "onMeasure: More than two child views are not supported."
            android.util.Log.e(r1, r0)
        L_0x003a:
            r0 = 0
            r10.A06 = r0
            r6 = r20
            r12 = 0
            r5 = 0
            r18 = 0
        L_0x0043:
            r1 = 8
            if (r12 >= r7) goto L_0x00d2
            android.view.View r4 = r10.getChildAt(r12)
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            X.U3i r3 = (X.C14715U3i) r3
            int r0 = r4.getVisibility()
            if (r0 != r1) goto L_0x005c
            r3.A01 = r13
        L_0x0059:
            int r12 = r12 + 1
            goto L_0x0043
        L_0x005c:
            float r1 = r3.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            float r0 = r3.A00
            float r18 = r18 + r0
            int r0 = r3.width
            if (r0 != 0) goto L_0x006c
            goto L_0x0059
        L_0x006c:
            int r1 = r3.leftMargin
            int r0 = r3.rightMargin
            int r1 = r1 + r0
            int r0 = r20 - r1
            int r14 = java.lang.Math.max(r0, r13)
            int r1 = r3.width
            r0 = -2
            if (r1 != r0) goto L_0x00b7
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r16 != 0) goto L_0x0081
            r0 = 0
        L_0x0081:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
            int r1 = X.C13989Tnp.A0H(r10)
            int r0 = r3.height
            r15 = r22
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r15, r1, r0)
            r4.measure(r14, r0)
            int r1 = r4.getMeasuredWidth()
            int r0 = r4.getMeasuredHeight()
            if (r0 <= r8) goto L_0x00a4
            if (r11 != r9) goto L_0x00b3
            int r8 = java.lang.Math.min(r0, r2)
        L_0x00a4:
            int r6 = r6 - r1
            if (r12 == 0) goto L_0x0059
            boolean r0 = X.C51970G9q.A1T(r6)
            r3.A02 = r0
            r5 = r5 | r0
            if (r0 == 0) goto L_0x0059
            r10.A06 = r4
            goto L_0x0059
        L_0x00b3:
            if (r11 != 0) goto L_0x00a4
            r8 = r0
            goto L_0x00a4
        L_0x00b7:
            int r1 = r3.width
            r0 = -1
            if (r1 != r0) goto L_0x00bf
            r0 = r16
            goto L_0x0081
        L_0x00bf:
            int r14 = r3.width
            r0 = 1073741824(0x40000000, float:2.0)
            goto L_0x0081
        L_0x00c4:
            int r8 = X.C13989Tnp.A0I(r10, r1)
            r2 = r8
            goto L_0x001f
        L_0x00cb:
            int r2 = X.C13989Tnp.A0I(r10, r1)
            r8 = 0
            goto L_0x001f
        L_0x00d2:
            if (r5 != 0) goto L_0x00d9
            r0 = 0
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0164
        L_0x00d9:
            r4 = 0
        L_0x00da:
            if (r4 >= r7) goto L_0x0164
            android.view.View r17 = r10.getChildAt(r4)
            int r0 = r17.getVisibility()
            if (r0 == r1) goto L_0x0137
            android.view.ViewGroup$LayoutParams r3 = r17.getLayoutParams()
            X.U3i r3 = (X.C14715U3i) r3
            int r0 = r3.width
            if (r0 != 0) goto L_0x015f
            float r12 = r3.A00
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x015f
            r12 = 0
        L_0x00f8:
            if (r5 == 0) goto L_0x0146
            int r13 = r3.leftMargin
            int r0 = r3.rightMargin
            int r13 = r13 + r0
            int r14 = r20 - r13
        L_0x0101:
            int r13 = X.C13988Tno.A04(r14)
        L_0x0105:
            int r15 = X.C13989Tnp.A0H(r10)
            android.view.ViewGroup$LayoutParams r3 = r17.getLayoutParams()
            X.U3i r3 = (X.C14715U3i) r3
            int r0 = r3.width
            if (r0 != 0) goto L_0x013d
            float r0 = r3.A00
            r16 = 0
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x013d
            int r3 = r3.height
            r0 = r22
            int r3 = android.view.ViewGroup.getChildMeasureSpec(r0, r15, r3)
        L_0x0123:
            if (r12 == r14) goto L_0x0137
            r0 = r17
            r0.measure(r13, r3)
            int r0 = r17.getMeasuredHeight()
            if (r0 <= r8) goto L_0x0137
            if (r11 != r9) goto L_0x013a
            int r0 = java.lang.Math.min(r0, r2)
        L_0x0136:
            r8 = r0
        L_0x0137:
            int r4 = r4 + 1
            goto L_0x00da
        L_0x013a:
            if (r11 != 0) goto L_0x0137
            goto L_0x0136
        L_0x013d:
            int r0 = r17.getMeasuredHeight()
            int r3 = X.C13988Tno.A04(r0)
            goto L_0x0123
        L_0x0146:
            float r13 = r3.A00
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x015c
            r0 = 0
            int r0 = java.lang.Math.max(r0, r6)
            float r3 = r3.A00
            float r0 = (float) r0
            float r3 = r3 * r0
            float r3 = r3 / r18
            int r0 = (int) r3
            int r14 = r12 + r0
            goto L_0x0101
        L_0x015c:
            r14 = r12
            r13 = 0
            goto L_0x0105
        L_0x015f:
            int r12 = r17.getMeasuredWidth()
            goto L_0x00f8
        L_0x0164:
            X.4W8 r3 = r10.A07
            if (r3 == 0) goto L_0x0295
            X.WEl r3 = (X.C18958WEl) r3
            X.Vtz r2 = r3.A01
            X.Vtz r0 = X.C18547Vtz.A02
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0186
            X.Vtz r0 = X.C18547Vtz.A01
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0295
            X.Vty r2 = r3.A00
            X.Vty r0 = X.C18546Vty.A02
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0295
        L_0x0186:
            X.4W8 r0 = r10.A07
            android.graphics.Rect r0 = r0.AhW()
            int r0 = r0.left
            if (r0 == 0) goto L_0x0295
            X.4W8 r0 = r10.A07
            android.graphics.Rect r0 = r0.AhW()
            int r0 = r0.top
            if (r0 != 0) goto L_0x0295
            X.4W8 r14 = r10.A07
            r0 = r19
            int[] r3 = new int[r0]
            r10.getLocationInWindow(r3)
            r11 = 0
            r15 = r3[r11]
            r6 = 1
            r13 = r3[r6]
            int r12 = r10.getWidth()
            int r12 = r12 + r15
            r4 = r3[r6]
            int r0 = r10.getWidth()
            int r4 = r4 + r0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r15, r13, r12, r4)
            android.graphics.Rect r0 = r14.AhW()
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r0)
            boolean r2 = r4.intersect(r2)
            int r0 = r4.width()
            if (r0 != 0) goto L_0x01d3
            int r0 = r4.height()
            if (r0 == 0) goto L_0x0295
        L_0x01d3:
            if (r2 == 0) goto L_0x0295
            r0 = r3[r11]
            int r2 = -r0
            r0 = r3[r6]
            int r0 = -r0
            r4.offset(r2, r0)
            int r12 = r10.getPaddingLeft()
            int r3 = r10.getPaddingTop()
            int r2 = r10.getPaddingLeft()
            int r0 = r4.left
            int r2 = java.lang.Math.max(r2, r0)
            int r0 = X.C13989Tnp.A0F(r10)
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>(r12, r3, r2, r0)
            int r12 = X.C13989Tnp.A0G(r10)
            int r0 = r4.right
            int r4 = java.lang.Math.min(r12, r0)
            int r3 = r10.getPaddingTop()
            int r2 = X.C13989Tnp.A0F(r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r3, r12, r2)
            android.graphics.Rect[] r0 = new android.graphics.Rect[]{r13, r0}
            java.util.ArrayList r17 = X.Pxf.A0q(r0)
            if (r5 != 0) goto L_0x0295
            r4 = 0
        L_0x021b:
            if (r4 >= r7) goto L_0x0295
            android.view.View r3 = r10.getChildAt(r4)
            int r0 = r3.getVisibility()
            if (r0 == r1) goto L_0x0288
            r0 = r17
            java.lang.Object r15 = r0.get(r4)
            android.graphics.Rect r15 = (android.graphics.Rect) r15
            android.view.ViewGroup$LayoutParams r13 = r3.getLayoutParams()
            X.U3i r13 = (X.C14715U3i) r13
            int r14 = r13.leftMargin
            int r0 = r13.rightMargin
            int r14 = r14 + r0
            int r0 = r3.getMeasuredHeight()
            int r12 = X.C13988Tno.A04(r0)
            int r0 = r15.width()
            X.C13990Tnq.A0u(r3, r0, r9, r12)
            int r2 = r3.getMeasuredWidthAndState()
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 & r0
            if (r2 == r6) goto L_0x027a
            r2 = r3
            boolean r0 = r3 instanceof X.U4N
            if (r0 == 0) goto L_0x025d
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r2 = r2.getChildAt(r11)
        L_0x025d:
            int r0 = r2.getMinimumWidth()
            if (r0 == 0) goto L_0x028b
            int r16 = r15.width()
            r2 = r3
            boolean r0 = r3 instanceof X.U4N
            if (r0 == 0) goto L_0x0272
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r2 = r2.getChildAt(r11)
        L_0x0272:
            int r2 = r2.getMinimumWidth()
            r0 = r16
            if (r0 >= r2) goto L_0x028b
        L_0x027a:
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = r20 - r14
            X.C13990Tnq.A0u(r3, r0, r2, r12)
            if (r4 == 0) goto L_0x0288
            r13.A02 = r6
            r10.A06 = r3
            r5 = 1
        L_0x0288:
            int r4 = r4 + 1
            goto L_0x021b
        L_0x028b:
            int r2 = r15.width()
            r0 = 1073741824(0x40000000, float:2.0)
            X.C13990Tnq.A0u(r3, r2, r0, r12)
            goto L_0x0288
        L_0x0295:
            int r0 = r10.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r10.getPaddingBottom()
            int r8 = r8 + r0
            r0 = r21
            r10.setMeasuredDimension(r0, r8)
            r10.A08 = r5
            X.W3p r1 = r10.A0K
            int r0 = r1.A03
            if (r0 == 0) goto L_0x02b1
            if (r5 != 0) goto L_0x02b1
            r1.A0D()
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    public final Parcelable onSaveInstanceState() {
        boolean z;
        AbsSavedState absSavedState = new AbsSavedState(super.onSaveInstanceState());
        if (this.A08) {
            z = AnonymousClass7TF.A1Q((this.A00 > 0.0f ? 1 : (this.A00 == 0.0f ? 0 : -1)));
        } else {
            z = this.A0B;
        }
        absSavedState.A01 = z;
        absSavedState.A00 = this.A01;
        return absSavedState;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1971404977);
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.A09 = true;
        }
        AnonymousClass0fD.A0D(-1958711379, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        int A052 = AnonymousClass0fD.A05(-1865059337);
        if (!this.A08) {
            z = super.onTouchEvent(motionEvent);
            i = 122966178;
        } else {
            W3p w3p = this.A0K;
            w3p.A0G(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            z = true;
            if (actionMasked == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.A0C = x;
                this.A0D = y;
            } else if (actionMasked == 1 && A04(this.A06)) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f = x2 - this.A0C;
                float f2 = y2 - this.A0D;
                int i2 = w3p.A06;
                if ((f * f) + (f2 * f2) < ((float) (i2 * i2)) && W3p.A0A(this.A06, (int) x2, (int) y2)) {
                    A00(this);
                }
            }
            i = 1498577546;
        }
        AnonymousClass0fD.A0C(i, A052);
        return z;
    }

    public final void removeView(View view) {
        if (view.getParent() instanceof U4N) {
            view = (View) view.getParent();
        }
        super.removeView(view);
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.A08) {
            this.A0B = AnonymousClass7TF.A1W(view, this.A06);
        }
    }

    @Deprecated
    public void setShadowResource(int i) {
        this.A04 = getResources().getDrawable(i);
    }

    public void setShadowResourceLeft(int i) {
        this.A04 = getContext().getDrawable(i);
    }

    public void setShadowResourceRight(int i) {
        this.A05 = getContext().getDrawable(i);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.view.ViewGroup$MarginLayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.U3i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.view.ViewGroup$MarginLayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.U3i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.U3i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x000f
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            X.U3i r1 = new X.U3i
            r1.<init>(r3)
        L_0x000b:
            r0 = 0
            r1.A00 = r0
            return r1
        L_0x000f:
            X.U3i r1 = new X.U3i
            r1.<init>(r3)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.generateLayoutParams(android.view.ViewGroup$LayoutParams):android.view.ViewGroup$LayoutParams");
    }

    public SlidingPaneLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
