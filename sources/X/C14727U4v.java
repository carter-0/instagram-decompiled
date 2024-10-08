package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U4v  reason: case insensitive filesystem */
public final class C14727U4v extends HorizontalScrollView implements C20878X2f, ViewGroup.OnHierarchyChangeListener, X7W, X63, X64, X7Z, XBf, View.OnLayoutChangeListener {
    public static Field A0a;
    public static boolean A0b;
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public C16510UwB A03 = C16510UwB.AUTO;
    public C20831X0g A04 = null;
    public Runnable A05;
    public List A06;
    public boolean A07;
    public boolean A08 = false;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = true;
    public boolean A0D;
    public boolean A0E = true;
    public boolean A0F = true;
    public int A0G = 0;
    public int A0H = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A0I = -1;
    public int A0J = -1;
    public long A0K = 0;
    public Rect A0L;
    public Drawable A0M;
    public View A0N;
    public C19058WIk A0O;
    public Integer A0P = AnonymousClass05K.A0C;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0S;
    public final ValueAnimator A0T = ObjectAnimator.ofInt(this, "scrollX", new int[]{0, 0});
    public final Rect A0U = new Rect();
    public final OverScroller A0V;
    public final C17556VaA A0W;
    public final Rect A0X = new Rect();
    public final C17877VhU A0Y = new C17877VhU();
    public final C17819VgY A0Z = new Object();

    private int A00(int i, int i2, int i3, int i4) {
        int i5;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            i5 = (i4 - i3) / 2;
        } else if (i == 3) {
            i5 = i4 - i3;
        } else {
            throw DbW.A0b("Invalid SnapToAlignment value: ", this.A02);
        }
        return i2 - i5;
    }

    public static HorizontalScrollView A01(MotionEvent motionEvent, View view, boolean z) {
        if (view == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            return null;
        }
        if (!z && (view instanceof HorizontalScrollView) && view.isNestedScrollingEnabled() && (view instanceof C14727U4v) && ((C14727U4v) view).A0C) {
            return (HorizontalScrollView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return null;
            }
            HorizontalScrollView A012 = A01(motionEvent, viewGroup.getChildAt(i), false);
            if (A012 != null) {
                return A012;
            }
            i++;
        }
    }

    private void A04(int i, int i2) {
        int i3 = i;
        ValueAnimator valueAnimator = this.A0T;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        OverScroller overScroller = this.A0V;
        if (overScroller != null && !overScroller.isFinished()) {
            int currX = overScroller.getCurrX();
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            overScroller.forceFinished(true);
            if (computeScrollOffset) {
                overScroller.fling(i3, getScrollY(), (int) (overScroller.getCurrVelocity() * Math.signum((float) (overScroller.getFinalX() - overScroller.getStartX()))), 0, 0, i2, 0, 0);
                return;
            }
            scrollTo(i + (overScroller.getCurrX() - currX), getScrollY());
        }
    }

    public final void fling(int i) {
        int i2 = i;
        if (Build.VERSION.SDK_INT == 28) {
            i2 = (int) (((float) Math.abs(i)) * Math.signum(this.A0Y.A00));
        }
        if (this.A0B) {
            A06(this, i2);
        } else {
            OverScroller overScroller = this.A0V;
            if (overScroller != null) {
                overScroller.fling(getScrollX(), getScrollY(), i2, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - getPaddingStart()) - getPaddingEnd()) / 2, 0);
                postInvalidateOnAnimation();
            } else {
                super.fling(i2);
            }
        }
        A03(i2, 0);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OverScroller overScroller;
        int i5 = this.A0H;
        if (!(i5 == Integer.MIN_VALUE || (overScroller = this.A0V) == null || i5 == overScroller.getFinalX() || overScroller.isFinished())) {
            overScroller.startScroll(this.A0H, overScroller.getFinalY(), 0, 0);
            overScroller.forceFinished(true);
            this.A0H = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        View childAt = getChildAt(0);
        if (!(childAt == null || childAt.getWidth() == 0 || childAt.getHeight() == 0)) {
            int i6 = this.A0I;
            if (i6 == -1) {
                i6 = getScrollX();
            }
            int i7 = this.A0J;
            if (i7 == -1) {
                i7 = getScrollY();
            }
            scrollTo(i6, i7);
        }
        Iterator it = W3V.A02.iterator();
        while (it.hasNext()) {
            ((Reference) it.next()).get();
        }
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int max;
        OverScroller overScroller = this.A0V;
        if (overScroller != null && !overScroller.isFinished() && overScroller.getCurrX() != overScroller.getFinalX() && i >= (max = Math.max(computeHorizontalScrollRange() - getWidth(), 0))) {
            overScroller.abortAnimation();
            i = max;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        0fc.A01(8192, "ReactHorizontalScrollView.onScrollChanged", 1254891160);
        try {
            super.onScrollChanged(i, i2, i3, i4);
            this.A07 = true;
            C17877VhU vhU = this.A0Y;
            if (vhU.A00(i, i2)) {
                if (this.A0S) {
                    FJu();
                }
                if (this.A0R) {
                    i5 = -452198833;
                    0fc.A00(8192, i5);
                }
                this.A0R = true;
                float f = vhU.A00;
                float f2 = vhU.A01;
                boolean z = W3V.A01;
                W3V.A06(this, getScrollX(), getScrollY());
                W3V.A07(this, AnonymousClass05K.A0C, f, f2);
                this.A0R = false;
            }
            i5 = -1815570570;
            0fc.A00(8192, i5);
        } catch (Throwable th) {
            0fc.A00(8192, 592338599);
            throw th;
        }
    }

    public void setBorderRadius(float f) {
        C13988Tno.A13(this, C13992Tns.A0A(f), 0);
    }

    private void A03(int i, int i2) {
        if (this.A05 == null) {
            if (this.A0D) {
                W3V.A07(this, AnonymousClass05K.A0N, (float) i, (float) i2);
            }
            this.A07 = false;
            C20276WoR woR = new C20276WoR(this);
            this.A05 = woR;
            postOnAnimationDelayed(woR, 20);
        }
    }

    public static void A06(C14727U4v u4v, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int min;
        int i7;
        int ceil;
        C14727U4v u4v2 = u4v;
        int i8 = i;
        if (u4v2.getChildCount() > 0) {
            if (u4v2.A01 == 0 && u4v2.A06 == null && u4v2.A02 == 0) {
                double snapInterval = (double) u4v2.getSnapInterval();
                double A002 = (double) W3V.A00(u4v2, u4v2.getScrollX(), u4v2.A0W.A04.x, i8);
                double d = (double) W3V.A03(u4v2, i8, 0, Math.max(0, u4v2.computeHorizontalScrollRange() - u4v2.getWidth()), 0).x;
                double d2 = A002 / snapInterval;
                int floor = (int) Math.floor(d2);
                int ceil2 = (int) Math.ceil(d2);
                int round = (int) Math.round(d2);
                int round2 = (int) Math.round(d / snapInterval);
                if (i > 0) {
                    if (ceil2 == floor) {
                        ceil2++;
                    }
                    if (round < ceil2 && round2 > floor) {
                        round = ceil2;
                    }
                } else if (i < 0) {
                    if (floor == ceil2) {
                        floor--;
                    }
                    if (round > floor && round2 < ceil2) {
                        round = floor;
                    }
                }
                double d3 = ((double) round) * snapInterval;
                if (d3 != A002) {
                    u4v2.A07 = true;
                    min = (int) d3;
                } else {
                    return;
                }
            } else {
                int A072 = C13988Tno.A07(u4v2.computeHorizontalScrollRange(), u4v2.getWidth(), 0);
                int i9 = W3V.A03(u4v2, i8, 0, C13988Tno.A07(u4v2.computeHorizontalScrollRange(), u4v2.getWidth(), 0), 0).x;
                if (u4v2.A08) {
                    i9 = u4v2.getScrollX();
                }
                int width = (u4v2.getWidth() - u4v2.getPaddingStart()) - u4v2.getPaddingEnd();
                if (C18401Vr3.A00.setAndroidLayoutDirection()) {
                    i2 = u4v2.getLayoutDirection();
                } else {
                    i2 = u4v2.A0W.A03;
                }
                if (i2 == 1) {
                    i9 = A072 - i9;
                    i8 = -i8;
                }
                List list = u4v2.A06;
                if (list == null || list.isEmpty()) {
                    int i10 = u4v2.A02;
                    if (i10 != 0) {
                        int i11 = u4v2.A01;
                        if (i11 > 0) {
                            double d4 = (double) i11;
                            double d5 = ((double) i9) / d4;
                            i4 = Math.max(u4v2.A00(i10, (int) (Math.floor(d5) * d4), i11, width), 0);
                            ceil = u4v2.A00(i10, (int) (Math.ceil(d5) * d4), i11, width);
                        } else {
                            ViewGroup viewGroup = (ViewGroup) u4v2.getChildAt(0);
                            int i12 = A072;
                            int i13 = A072;
                            int i14 = 0;
                            int i15 = 0;
                            for (int i16 = 0; i16 < viewGroup.getChildCount(); i16++) {
                                View childAt = viewGroup.getChildAt(i16);
                                int A003 = u4v2.A00(u4v2.A02, childAt.getLeft(), childAt.getWidth(), width);
                                if (A003 <= i9 && i9 - A003 < i9 - i14) {
                                    i14 = A003;
                                }
                                if (A003 >= i9 && A003 - i9 < i13 - i9) {
                                    i13 = A003;
                                }
                                i12 = Math.min(i12, A003);
                                i15 = Math.max(i15, A003);
                            }
                            i4 = Math.max(i14, i12);
                            i3 = Math.min(i13, i15);
                            i5 = A072;
                            i6 = 0;
                        }
                    } else {
                        double snapInterval2 = (double) u4v2.getSnapInterval();
                        double d6 = ((double) i9) / snapInterval2;
                        i4 = (int) (Math.floor(d6) * snapInterval2);
                        ceil = (int) (Math.ceil(d6) * snapInterval2);
                    }
                    i3 = Math.min(ceil, A072);
                    i5 = A072;
                    i6 = 0;
                } else {
                    i6 = C51971G9r.A0I(u4v2.A06, 0);
                    List list2 = u4v2.A06;
                    i5 = C51971G9r.A0I(list2, DbT.A02(list2, 1));
                    i3 = A072;
                    i4 = 0;
                    for (int i17 = 0; i17 < u4v2.A06.size(); i17++) {
                        int A0I2 = C51971G9r.A0I(u4v2.A06, i17);
                        if (A0I2 <= i9 && i9 - A0I2 < i9 - i4) {
                            i4 = A0I2;
                        }
                        if (A0I2 >= i9 && A0I2 - i9 < i3 - i9) {
                            i3 = A0I2;
                        }
                    }
                }
                int i18 = i9 - i4;
                int i19 = i3 - i9;
                int i20 = i3;
                if (Math.abs(i18) < Math.abs(i19)) {
                    i20 = i4;
                }
                int scrollX = u4v2.getScrollX();
                if (i2 == 1) {
                    scrollX = A072 - scrollX;
                }
                if (u4v2.A0E || i9 < i5) {
                    if (u4v2.A0F || i9 > i6) {
                        if (i8 > 0) {
                            i8 += (int) (((double) i19) * 10.0d);
                            i9 = i3;
                        } else if (i8 < 0) {
                            i8 -= (int) (((double) i18) * 10.0d);
                            i9 = i4;
                        } else {
                            i9 = i20;
                        }
                    } else if (scrollX > i6) {
                        i9 = i6;
                    }
                } else if (scrollX < i5) {
                    i9 = i5;
                }
                min = Math.min(Math.max(0, i9), A072);
                if (i2 == 1) {
                    min = A072 - min;
                    i8 = -i8;
                }
                OverScroller overScroller = u4v2.A0V;
                if (overScroller != null) {
                    u4v2.A07 = true;
                    int scrollX2 = u4v2.getScrollX();
                    int scrollY = u4v2.getScrollY();
                    if (i8 == 0) {
                        i8 = min - u4v2.getScrollX();
                    }
                    if (min == 0 || min == A072) {
                        i7 = width / 2;
                    } else {
                        i7 = 0;
                    }
                    overScroller.fling(scrollX2, scrollY, i8, 0, min, min, 0, 0, i7, 0);
                    u4v2.postInvalidateOnAnimation();
                    return;
                }
            }
            u4v2.E65(min, u4v2.getScrollY());
        }
    }

    private OverScroller getOverScrollerFromParent() {
        if (!A0b) {
            A0b = true;
            try {
                Field declaredField = HorizontalScrollView.class.getDeclaredField("mScroller");
                A0a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                0I1.A04("ReactHorizontalScrollView", "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = A0a;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            0I1.A04("ReactHorizontalScrollView", "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e);
        }
    }

    private int getSnapInterval() {
        int i = this.A01;
        if (i == 0) {
            return getWidth();
        }
        return i;
    }

    public final boolean A08(View view) {
        Rect rect = this.A0U;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        view.getDrawingRect(rect);
        if (computeScrollDeltaToGetChildRectOnScreen == 0 || Math.abs(computeScrollDeltaToGetChildRectOnScreen) >= rect.width()) {
            return false;
        }
        return true;
    }

    public final void Anq(Rect rect) {
        Rect rect2 = this.A0L;
        0Sd.A00(rect2);
        rect.set(rect2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.widget.OverScroller, X.U5U] */
    public final void Ewz(int i, int i2) {
        ValueAnimator valueAnimator = this.A0T;
        valueAnimator.cancel();
        Context context = getContext();
        if (!W3V.A01) {
            W3V.A01 = true;
            try {
                ? overScroller = new OverScroller(context);
                overScroller.A00 = C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION;
                W3V.A00 = overScroller.A00();
            } catch (Throwable unused) {
            }
        }
        valueAnimator.setDuration((long) W3V.A00).setIntValues(new int[]{i, i2});
        valueAnimator.start();
    }

    public final void FJu() {
        if (this.A0S) {
            0fc.A01(8192, "ReactHorizontalScrollView.updateClippingRect", -578481312);
            try {
                0Sd.A00(this.A0L);
                C18702VyT.A00(this, this.A0L);
                View A0G2 = C13988Tno.A0G(this);
                if (A0G2 instanceof X7W) {
                    ((X7W) A0G2).FJu();
                }
            } finally {
                0fc.A00(8192, 623418389);
            }
        }
    }

    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (!this.A0B || this.A0Q) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i, i2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            View A0H2 = JTO.A0H(it);
            Rect rect = this.A0U;
            A0H2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(A0H2, rect);
            if (computeScrollDeltaToGetChildRectOnScreen(rect) == 0 || A08(A0H2) || A0H2.isFocused()) {
                arrayList.add(A0H2);
            }
        }
    }

    public final boolean arrowScroll(int i) {
        if (!this.A0B) {
            return super.arrowScroll(i);
        }
        boolean z = true;
        this.A0Q = true;
        if (getChildCount() > 0) {
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
            View childAt = getChildAt(0);
            if (childAt == null || findNextFocus == null || findNextFocus.getParent() != childAt) {
                A02(i);
            } else {
                Rect rect = this.A0U;
                findNextFocus.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(findNextFocus, rect);
                if (computeScrollDeltaToGetChildRectOnScreen(rect) != 0) {
                    findNextFocus.getDrawingRect(rect);
                    offsetDescendantRectToMyCoords(findNextFocus, rect);
                    int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
                    findNextFocus.getDrawingRect(rect);
                    if (computeScrollDeltaToGetChildRectOnScreen == 0 || Math.abs(computeScrollDeltaToGetChildRectOnScreen) >= rect.width() / 2) {
                        A02(i);
                    }
                }
                findNextFocus.requestFocus();
            }
        } else {
            z = false;
        }
        this.A0Q = false;
        return z;
    }

    public final boolean canScrollHorizontally(int i) {
        if (!this.A0C || !super.canScrollHorizontally(i)) {
            return false;
        }
        return true;
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!C18669VwS.A01(this.A03)) {
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public ValueAnimator getFlingAnimator() {
        return this.A0T;
    }

    public long getLastScrollDispatchTime() {
        return this.A0K;
    }

    public String getOverflow() {
        return C13992Tns.A0M(this.A0P);
    }

    public Rect getOverflowInset() {
        return this.A0X;
    }

    public C16510UwB getPointerEvents() {
        return this.A03;
    }

    public C17556VaA getReactScrollViewScrollState() {
        return this.A0W;
    }

    public boolean getRemoveClippedSubviews() {
        return this.A0S;
    }

    public boolean getScrollEnabled() {
        return this.A0C;
    }

    public int getScrollEventThrottle() {
        return this.A00;
    }

    public C20831X0g getStateWrapper() {
        return null;
    }

    public final void onChildViewAdded(View view, View view2) {
        this.A0N = view2;
        view2.addOnLayoutChangeListener(this);
    }

    public final void onChildViewRemoved(View view, View view2) {
        View view3 = this.A0N;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
        }
        this.A0N = null;
    }

    public final void onDraw(Canvas canvas) {
        if (this.A0P != AnonymousClass05K.A00) {
            W3s.A03(canvas, this);
        }
        super.onDraw(canvas);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0C && (motionEvent.getAction() != 0 || A01(motionEvent, this, true) == null)) {
            if (!C18669VwS.A01(this.A03)) {
                return true;
            }
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    X61 A002 = C18101VlV.A00(this);
                    if (A002 != null) {
                        A002.D1k(motionEvent, this);
                    }
                    W3V.A07(this, AnonymousClass05K.A00, 0.0f, 0.0f);
                    this.A09 = true;
                    this.A0T.cancel();
                    return true;
                }
            } catch (IllegalArgumentException e) {
                0I1.A06("ReactNative", "Error intercepting touch event.", e);
                return false;
            }
        }
        return false;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        if (this.A0N != null) {
            if (C18401Vr3.A00.setAndroidLayoutDirection()) {
                i9 = view.getLayoutDirection();
            } else {
                i9 = this.A0W.A03;
            }
            if (i9 == 1) {
                ValueAnimator valueAnimator = this.A0T;
                if (valueAnimator.isRunning()) {
                    valueAnimator.end();
                }
                int i10 = i3 - i;
                int scrollX = i10 - (i7 - getScrollX());
                scrollTo(scrollX, getScrollY());
                A04(scrollX, i10 - getWidth());
                return;
            }
            C19058WIk wIk = this.A0O;
            if (wIk != null) {
                wIk.A02();
            }
        }
    }

    public final void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.A0B) {
            Rect rect = this.A0U;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (computeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(computeScrollDeltaToGetChildRectOnScreen, 0);
            }
        }
        super.requestChildFocus(view, view2);
    }

    public void setDecelerationRate(float f) {
        this.A0W.A00 = f;
        OverScroller overScroller = this.A0V;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.A08 = z;
    }

    public void setEnableSyncOnScroll(boolean z) {
        this.A0A = z;
    }

    public void setEndFillColor(int i) {
        if (i != this.A0G) {
            this.A0G = i;
            this.A0M = new ColorDrawable(i);
        }
    }

    public void setLastScrollDispatchTime(long j) {
        this.A0K = j;
    }

    public void setMaintainVisibleContentPosition(C17318VQx vQx) {
        C19058WIk wIk = this.A0O;
        if (vQx != null) {
            if (wIk == null) {
                C19058WIk wIk2 = new C19058WIk(this, true);
                this.A0O = wIk2;
                wIk2.A00();
            }
        } else if (wIk != null) {
            wIk.A01();
            this.A0O = null;
        }
        C19058WIk wIk3 = this.A0O;
        if (wIk3 != null) {
            wIk3.A01 = vQx;
        }
    }

    public void setOverflow(String str) {
        Integer num;
        if (str == null || (num = C18105VlZ.A00(str)) == null) {
            num = AnonymousClass05K.A0C;
        }
        this.A0P = num;
        invalidate();
    }

    public void setPagingEnabled(boolean z) {
        this.A0B = z;
    }

    public void setPointerEvents(C16510UwB uwB) {
        this.A03 = uwB;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.A0L == null) {
            this.A0L = new Rect();
        }
        this.A0S = z;
        FJu();
    }

    public void setScrollEnabled(boolean z) {
        this.A0C = z;
    }

    public void setScrollEventThrottle(int i) {
        this.A00 = i;
    }

    public void setScrollPerfTag(String str) {
    }

    public void setSendMomentumEvents(boolean z) {
        this.A0D = z;
    }

    public void setSnapInterval(int i) {
        this.A01 = i;
    }

    public void setSnapOffsets(List list) {
        this.A06 = list;
    }

    public void setSnapToAlignment(int i) {
        this.A02 = i;
    }

    public void setSnapToEnd(boolean z) {
        this.A0E = z;
    }

    public void setSnapToStart(boolean z) {
        this.A0F = z;
    }

    public void setStateWrapper(C20831X0g x0g) {
        this.A04 = x0g;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.VgY] */
    public C14727U4v(Context context) {
        super(context);
        03v.A0B(this, new 02Z());
        this.A0V = getOverScrollerFromParent();
        this.A0W = new C17556VaA(I18nUtil.A00.A01(context) ? 1 : 0);
        setOnHierarchyChangeListener(this);
        setClipChildren(false);
    }

    private void A02(int i) {
        int width = getWidth();
        int scrollX = getScrollX();
        int i2 = scrollX / width;
        if (scrollX % width != 0) {
            i2++;
        }
        int i3 = i2 + 1;
        if (i == 17) {
            i3 = i2 - 1;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        E65(i3 * width, getScrollY());
        A03(0, 0);
    }

    private void A05(int i, int i2) {
        View A0G2 = C13988Tno.A0G(this);
        if (A0G2 == null || A0G2.getWidth() == 0 || A0G2.getHeight() == 0) {
            this.A0I = i;
            this.A0J = i2;
            return;
        }
        this.A0I = -1;
        this.A0J = -1;
    }

    private View getContentView() {
        return C13988Tno.A0G(this);
    }

    public final void A07() {
        awakenScrollBars();
    }

    public final void E65(int i, int i2) {
        W3V.A05(this, i, i2);
        A05(i, i2);
    }

    public final void EKj(int i, int i2) {
        scrollTo(i, i2);
        A04(i, Integer.MAX_VALUE);
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(-1650577479);
        if (this.A0G != 0) {
            View childAt = getChildAt(0);
            if (!(this.A0M == null || childAt == null || childAt.getRight() >= getWidth())) {
                this.A0M.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.A0M.draw(canvas);
            }
        }
        super.draw(canvas);
        AnonymousClass0fD.A0A(237597778, A032);
    }

    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.A0C || (keyCode != 21 && keyCode != 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-818833530);
        super.onAttachedToWindow();
        if (this.A0S) {
            FJu();
        }
        C19058WIk wIk = this.A0O;
        if (wIk != null) {
            wIk.A00();
        }
        AnonymousClass0fD.A0D(-1295617610, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(478189445);
        super.onDetachedFromWindow();
        C19058WIk wIk = this.A0O;
        if (wIk != null) {
            wIk.A01();
        }
        AnonymousClass0fD.A0D(-725173107, A062);
    }

    public final void onMeasure(int i, int i2) {
        OverScroller overScroller;
        C18100VlU.A00(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean A1O = JTQ.A1O(getMeasuredHeight(), size2);
        setMeasuredDimension(size, size2);
        if (A1O && (overScroller = this.A0V) != null) {
            this.A0H = overScroller.getCurrX();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(40050644);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A0S) {
            FJu();
        }
        AnonymousClass0fD.A0D(-2071627398, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        int i;
        int A052 = AnonymousClass0fD.A05(-1057741643);
        if (!this.A0C) {
            i = 1008481836;
        } else {
            C16510UwB uwB = this.A03;
            0qQ.A0B(uwB, 0);
            if (uwB == C16510UwB.AUTO || uwB == C16510UwB.BOX_ONLY) {
                C17819VgY vgY = this.A0Z;
                vgY.A00(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1) {
                    if (this.A09) {
                        W3V.A04(this);
                        float f = vgY.A00;
                        float f2 = vgY.A01;
                        W3V.A07(this, AnonymousClass05K.A01, f, f2);
                        X61 A002 = C18101VlV.A00(this);
                        if (A002 != null) {
                            A002.D1f(motionEvent, this);
                        }
                        this.A09 = false;
                        A03(Math.round(f), Math.round(f2));
                    }
                } else if (actionMasked == 0 && (runnable = this.A05) != null) {
                    removeCallbacks(runnable);
                    this.A05 = null;
                    this.A0T.cancel();
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                AnonymousClass0fD.A0C(2083609279, A052);
                return onTouchEvent;
            }
            i = 380229871;
        }
        AnonymousClass0fD.A0C(i, A052);
        return false;
    }

    public final boolean pageScroll(int i) {
        boolean pageScroll = super.pageScroll(i);
        if (this.A0B && pageScroll) {
            A03(0, 0);
        }
        return pageScroll;
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        W3V.A04(this);
        A05(i, i2);
    }

    public void setBorderStyle(String str) {
        W3s.A0C(this, C13991Tnr.A0X(str));
    }

    public void setBackgroundColor(int i) {
        C13988Tno.A10(this, i);
    }
}
