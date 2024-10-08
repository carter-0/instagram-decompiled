package com.instagram.common.ui.widget.reboundhorizontalscrollview;

import X.0mk;
import X.0qQ;
import X.2cs;
import X.AnonymousClass0fD;
import X.AnonymousClass37Q;
import X.C252203oj;
import X.C301495zP;
import X.C301525zS;
import X.C3506085j;
import X.C3506185k;
import X.C376419Hx;
import X.C61340me;
import X.C71392co;
import X.C71412ct;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReboundHorizontalScrollView extends LinearLayout implements C252203oj, GestureDetector.OnGestureListener {
    public static final C71392co A0P = C71392co.A04(0.0d, 5.0d);
    public static final C71392co A0Q = C71392co.A04(50.0d, 10.2d);
    public static final C71392co A0R = C71392co.A04(20.0d, 10.0d);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public C71392co A04;
    public C71392co A05;
    public C71392co A06;
    public C301495zP A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final 2cs A0I;
    public final List A0J;
    public final boolean A0K;
    public final float A0L;
    public final int A0M;
    public final int A0N;
    public final GestureDetector A0O;

    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C376419Hx(78);
        public int A00;

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReboundHorizontalScrollView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void A07(float f) {
        this.A0H = false;
        int i = (Math.abs(f) > ((float) this.A0N) ? 1 : (Math.abs(f) == ((float) this.A0N) ? 0 : -1));
        2cs r5 = this.A0I;
        if (i < 0) {
            C71392co r2 = this.A06;
            r5.A09(r2);
            if (this.A03 == -1) {
                r5.A09(r2);
                r5.A06((double) getNearestRestPoint());
                r5.A07(0.0d);
            }
        } else {
            r5.A09(this.A05);
            r5.A07(-((double) f));
            A00(getScrollX());
            List list = this.A0J;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2);
            }
        }
        List list2 = this.A0J;
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((C301525zS) list2.get(i3)).DsU(this);
        }
        setScrollState(C301495zP.SETTLING);
    }

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r4) {
        0qQ.A0B(r4, 0);
        if (this.A07 == C301495zP.SETTLING) {
            r4.A05(r4.A01);
            setScrollX((int) Math.round(this.A0I.A09.A00));
            setScrollState(C301495zP.IDLE);
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        0qQ.A0B(view, 0);
        0qQ.A0B(layoutParams, 2);
        super.addView(view, i, layoutParams);
        view.setClickable(true);
        view.setOnTouchListener(new C3506185k(new GestureDetector(getContext(), new C3506085j(view, this), new Handler(Looper.getMainLooper())), this));
    }

    public final void measureChild(View view, int i, int i2) {
        0qQ.A0B(view, 0);
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height));
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r1 != 3) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r3 = 0
            X.0qQ.A0B(r5, r3)
            boolean r0 = r4.isEnabled()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            int r1 = r5.getActionMasked()
            if (r1 == 0) goto L_0x002c
            if (r1 == r2) goto L_0x0026
            r0 = 2
            if (r1 == r0) goto L_0x001b
            r0 = 3
            if (r1 == r0) goto L_0x0026
        L_0x0019:
            r2 = 0
        L_0x001a:
            return r2
        L_0x001b:
            r4.A03(r5)
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x0019
            r4.A02()
            return r2
        L_0x0026:
            float r0 = r4.A0D
            r4.A07(r0)
            goto L_0x0019
        L_0x002c:
            r4.A0E = r3
            r4.A0G = r3
            r0 = 0
            r4.A0D = r0
            float r0 = r5.getRawX()
            r4.A0B = r0
            float r0 = r5.getRawY()
            r4.A0C = r0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        0qQ.A0B(view, 0);
        0qQ.A0B(accessibilityEvent, 1);
        if (accessibilityEvent.getEventType() == 32768 && this.A0F) {
            scrollTo(A01(indexOfChild(view)), 0);
        } else if (accessibilityEvent.getEventType() == 1) {
            A04(view, this);
        }
        return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void setPagingSpringConfig(C71392co r2) {
        0qQ.A0B(r2, 0);
        this.A04 = r2;
    }

    public final void setScrollingSpringConfig(C71392co r2) {
        0qQ.A0B(r2, 0);
        this.A05 = r2;
    }

    public final void setSnappingSpringConfig(C71392co r2) {
        0qQ.A0B(r2, 0);
        this.A06 = r2;
    }

    private final void A02() {
        if (!this.A0H) {
            this.A0H = true;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            setSeekingIndex(-1);
            List list = this.A0J;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C301525zS) list.get(i)).Dse(this);
            }
            setScrollState(C301495zP.IDLE);
            this.A08 = false;
            this.A01 = 0.0f;
            this.A0I.A01();
        }
    }

    private final void A03(MotionEvent motionEvent) {
        if (!this.A0E) {
            float rawX = this.A0B - motionEvent.getRawX();
            float rawY = this.A0C - motionEvent.getRawY();
            boolean z = false;
            if (Math.sqrt((double) ((rawX * rawX) + (rawY * rawY))) > ((double) this.A0L)) {
                z = true;
            }
            double degrees = Math.toDegrees(Math.atan((double) Math.abs(rawY / rawX)));
            if (z && degrees < 45.0d) {
                this.A0E = true;
            }
        }
    }

    private final void setScrollState(C301495zP r5) {
        C301495zP r3 = this.A07;
        if (r3 != r5) {
            this.A07 = r5;
            for (C301525zS DhW : this.A0J) {
                DhW.DhW(r3, this.A07, this);
            }
        }
    }

    private final void setSeekingIndex(int i) {
        View childAt = getChildAt(this.A03);
        if (childAt != null) {
            childAt.setSelected(false);
        }
        View childAt2 = getChildAt(i);
        if (childAt2 != null) {
            childAt2.setSelected(true);
        }
        this.A03 = i;
    }

    public final void A08(int i) {
        this.A0I.A05((double) A01(i));
    }

    public final void A0A(C301525zS r3) {
        List list = this.A0J;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public final void DmE(2cs r18) {
        int endScrollBound;
        int scrollX = getScrollX();
        int A002 = A00(getScrollX());
        2cs r11 = this.A0I;
        C71412ct r10 = r11.A09;
        setScrollX((int) Math.round(r10.A00));
        int scrollX2 = getScrollX();
        int A003 = A00(getScrollX());
        List list = this.A0J;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C301525zS r4 = (C301525zS) list.get(i);
            if (scrollX2 != scrollX) {
                float progress = getProgress();
                double d = (double) progress;
                int floor = (int) Math.floor(d);
                r4.DhI(this, progress - ((float) floor), floor, (int) Math.ceil(d));
            }
            if (A003 != A002) {
                r4.DKQ(this, A003, A002);
            }
        }
        if (this.A07 == C301495zP.SETTLING) {
            if (this.A03 == -1) {
                if (getChildCount() != 0) {
                    boolean z = this.A0K;
                    int scrollX3 = getScrollX();
                    int startScrollBound = getStartScrollBound();
                    if (!z ? scrollX3 < startScrollBound : scrollX3 > startScrollBound) {
                        r11.A09(this.A04);
                        endScrollBound = getStartScrollBound();
                        r11.A06((double) endScrollBound);
                    }
                }
                if (getChildCount() != 0) {
                    boolean z2 = this.A0K;
                    int endScrollBound2 = getEndScrollBound();
                    int scrollX4 = getScrollX();
                    if (!z2 ? endScrollBound2 < scrollX4 : endScrollBound2 > scrollX4) {
                        r11.A09(this.A04);
                        endScrollBound = getEndScrollBound();
                        r11.A06((double) endScrollBound);
                    }
                }
            }
            double d2 = r10.A01;
            float abs = (float) Math.abs(d2);
            if (!this.A08 && abs < this.A01 && r11.A05 == this.A05 && abs < this.A00) {
                this.A08 = true;
                float f = (float) d2;
                C71392co r1 = this.A06;
                r11.A09(r1);
                if (this.A03 == -1) {
                    r11.A09(r1);
                    r11.A06((double) getNearestRestPoint());
                    r11.A07((double) f);
                }
            }
            this.A01 = abs;
        }
    }

    public final C301495zP getScrollState() {
        return this.A07;
    }

    public final int getSeekingIndex() {
        return this.A03;
    }

    public final float getVelocity() {
        return (float) this.A0I.A09.A01;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A09) {
            return false;
        }
        float f3 = (float) this.A0M;
        this.A0D = Math.min(Math.max(f, -f3), f3);
        return true;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable == null || !0qQ.A0K(parcelable.getClass(), SavedState.class)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A02 = savedState.A00;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        if (!this.A0G) {
            this.A0G = true;
        } else if (this.A09) {
            A02();
            setScrollState(C301495zP.DRAGGING);
            if (getChildCount() != 0) {
                boolean z2 = this.A0K;
                int scrollX = getScrollX();
                int startScrollBound = getStartScrollBound();
                z = true;
                if (!z2) {
                }
            }
            z = false;
            if (z && f < 0.0f) {
                f *= 0.25f;
            }
            if (getChildCount() != 0) {
                boolean z3 = this.A0K;
                int endScrollBound = getEndScrollBound();
                int scrollX2 = getScrollX();
                if (!z3 ? endScrollBound < scrollX2 : endScrollBound > scrollX2) {
                    if (f > 0.0f) {
                        f *= 0.25f;
                    }
                }
            }
            2cs r5 = this.A0I;
            r5.A05(r5.A09.A00 + ((double) f));
            return true;
        }
        return true;
    }

    public final void setSpringConfig(C71392co r2) {
        this.A0I.A09(r2);
    }

    private final int A00(int i) {
        int childCount = getChildCount();
        int i2 = 0;
        if (childCount <= 1) {
            return 0;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        do {
            getChildAt(i2);
            int abs = Math.abs(i - A01(i2));
            if (i2 == 0 || abs < i3) {
                i4 = i2;
                i3 = abs;
            }
            i2++;
        } while (i2 < childCount);
        return i4;
    }

    private final int A01(int i) {
        View childAt;
        int childCount = getChildCount() - 1;
        if (i > childCount || (i == 0 && this.A0A)) {
            return 0;
        }
        if (i != childCount || !this.A0A) {
            int i2 = 0;
            if (i <= getChildCount() - 1 && (childAt = getChildAt(i)) != null) {
                i2 = Math.round(((float) childAt.getRight()) - (((float) childAt.getMeasuredWidth()) / 2.0f));
            }
            int round = Math.round((float) (i2 - getSelectionPoint()));
            if (!this.A0A) {
                return round;
            }
            if (round < getStartScrollBound()) {
                return getStartScrollBound();
            }
            if (round > getEndScrollBound()) {
                return getEndScrollBound();
            }
            return round;
        }
        View childAt2 = getChildAt(i);
        if (this.A0K) {
            return childAt2.getLeft();
        }
        return childAt2.getRight() - getWidth();
    }

    public static final void A04(View view, ReboundHorizontalScrollView reboundHorizontalScrollView) {
        int indexOfChild = reboundHorizontalScrollView.indexOfChild(view);
        reboundHorizontalScrollView.A09(indexOfChild, 0.0f);
        for (C301525zS r0 : reboundHorizontalScrollView.A0J) {
            r0.Dse(reboundHorizontalScrollView);
            r0.Dqc(view, indexOfChild);
        }
    }

    private final int getNearestRestPoint() {
        return A01(A00(getScrollX()));
    }

    private final int getNextRestPoint() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            int A012 = A01(i);
            if (A012 > getScrollX()) {
                return A012;
            }
        }
        return A01(0);
    }

    private final int getPriorRestPoint() {
        int A012;
        int childCount = getChildCount();
        do {
            childCount--;
            if (-1 >= childCount) {
                return A01(getChildCount() - 1);
            }
            A012 = A01(childCount);
        } while (A012 >= getScrollX());
        return A012;
    }

    private final float getProgress() {
        int i;
        int A002 = A00(getScrollX());
        int A012 = A01(A002);
        int scrollX = getScrollX();
        if (!this.A0K ? A012 >= scrollX : A012 <= scrollX) {
            i = A002;
            A002 = Math.max(A002 - 1, 0);
        } else {
            i = Math.min(A002 + 1, getChildCount() - 1);
        }
        int A013 = A01(A002);
        int A014 = A01(i);
        if (A002 == i) {
            return (float) A002;
        }
        return ((float) A002) + ((float) AnonymousClass37Q.A04((double) scrollX, (double) A013, (double) A014, 0.0d, 1.0d));
    }

    private final int getSelectionPoint() {
        return Math.round(((float) getWidth()) / 2.0f);
    }

    public final void A05(float f) {
        int nextRestPoint = getNextRestPoint();
        setSeekingIndex(A00(nextRestPoint));
        2cs r2 = this.A0I;
        r2.A09(this.A04);
        r2.A06((double) nextRestPoint);
        r2.A07((double) f);
    }

    public final void A06(float f) {
        int priorRestPoint = getPriorRestPoint();
        setSeekingIndex(A00(priorRestPoint));
        2cs r2 = this.A0I;
        r2.A09(this.A04);
        r2.A06((double) priorRestPoint);
        r2.A07((double) f);
    }

    public final void A09(int i, float f) {
        setSeekingIndex(i);
        2cs r2 = this.A0I;
        r2.A09(this.A04);
        r2.A06((double) A01(i));
        r2.A07((double) f);
        setScrollState(C301495zP.SETTLING);
    }

    public final boolean canScrollHorizontally(int i) {
        return isEnabled();
    }

    public final int getCurrentChildIndex() {
        return A00(getScrollX());
    }

    public final int getEndScrollBound() {
        if (getChildCount() == 0) {
            return 0;
        }
        return A01(getChildCount() - 1);
    }

    public float getLeftFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        return 1.0f;
    }

    public float getRightFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        return 1.0f;
    }

    public final int getStartScrollBound() {
        if (getChildCount() != 0) {
            return A01(0);
        }
        return 0;
    }

    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(138461262);
        0qQ.A0B(view, 0);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        view.measure(View.MeasureSpec.makeMeasureSpec(marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, 0), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        AnonymousClass0fD.A0D(2110364612, A062);
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-242426367);
        super.onAttachedToWindow();
        this.A0I.A0A(this);
        setScrollState(C301495zP.IDLE);
        AnonymousClass0fD.A0D(981107593, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1386624774);
        super.onDetachedFromWindow();
        this.A0I.A0B(this);
        AnonymousClass0fD.A0D(805118939, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.A02;
        if (i5 != -1) {
            this.A0I.A05((double) A01(A00(i5)));
            this.A02 = -1;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View$BaseSavedState, com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView$SavedState, android.os.Parcelable] */
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        ? baseSavedState = new View.BaseSavedState(onSaveInstanceState);
        baseSavedState.A00 = getScrollX();
        return baseSavedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1 != 3) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r5.A0E != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = -1012567740(0xffffffffc3a57144, float:-330.8849)
            int r4 = X.AnonymousClass0fD.A05(r0)
            r1 = 0
            X.0qQ.A0B(r6, r1)
            boolean r0 = r5.isEnabled()
            r3 = 0
            if (r0 != 0) goto L_0x0019
            r0 = -1917522511(0xffffffff8db4edb1, float:-1.1150579E-30)
            X.AnonymousClass0fD.A0C(r0, r4)
            return r1
        L_0x0019:
            boolean r0 = super.onTouchEvent(r6)
            r2 = 1
            if (r0 != 0) goto L_0x0028
            android.view.GestureDetector r0 = r5.A0O
            boolean r0 = r0.onTouchEvent(r6)
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            r3 = 1
        L_0x0029:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x004d
            if (r1 == r2) goto L_0x0047
            r0 = 2
            if (r1 == r0) goto L_0x003f
            r0 = 3
            if (r1 == r0) goto L_0x0047
        L_0x0037:
            r2 = r3
        L_0x0038:
            r0 = -1227879531(0xffffffffb6d00b95, float:-6.2002314E-6)
            X.AnonymousClass0fD.A0C(r0, r4)
            return r2
        L_0x003f:
            r5.A03(r6)
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0047:
            float r0 = r5.A0D
            r5.A07(r0)
            goto L_0x0037
        L_0x004d:
            r5.A02()
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDeceleratingVelocity(float f) {
        this.A00 = f;
    }

    public final void setExplorableByAccessibility(boolean z) {
        this.A0F = z;
    }

    public final void setSnapToEdges(boolean z) {
        this.A0A = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReboundHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0F = true;
        this.A07 = C301495zP.IDLE;
        this.A02 = -1;
        this.A09 = true;
        setClipChildren(false);
        setSaveEnabled(false);
        this.A04 = A0Q;
        this.A06 = A0R;
        this.A05 = A0P;
        this.A0K = 0mk.A02(getContext());
        2cs A022 = C61340me.A00().A02();
        A022.A09(this.A05);
        A022.A00 = 0.001d;
        A022.A02 = 1.0d;
        this.A0I = A022;
        this.A0O = new GestureDetector(context, this, new Handler(Looper.getMainLooper()));
        this.A0J = new CopyOnWriteArrayList();
        this.A0L = TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        int scaledMinimumFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.A0N = scaledMinimumFlingVelocity;
        this.A00 = (float) (scaledMinimumFlingVelocity * 3);
        this.A0M = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReboundHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReboundHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
