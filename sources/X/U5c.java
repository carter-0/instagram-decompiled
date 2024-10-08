package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.android.R;
import java.lang.ref.Reference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public final class U5c extends ScrollView implements C20878X2f, ViewGroup.OnHierarchyChangeListener, X7W, X63, X64, X7Z, XBf, View.OnLayoutChangeListener {
    public static Field A0Z;
    public static boolean A0a;
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = -1;
    public int A04 = -1;
    public C16510UwB A05 = C16510UwB.AUTO;
    public C20831X0g A06 = null;
    public Runnable A07;
    public List A08;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public boolean A0E = true;
    public boolean A0F;
    public boolean A0G = true;
    public boolean A0H = true;
    public int A0I = 0;
    public long A0J = 0;
    public Rect A0K;
    public Drawable A0L;
    public View A0M;
    public ReadableMap A0N = null;
    public C19058WIk A0O = null;
    public Integer A0P = AnonymousClass05K.A0C;
    public boolean A0Q = false;
    public boolean A0R;
    public final ValueAnimator A0S = ObjectAnimator.ofInt(this, "scrollY", new int[]{0, 0});
    public final Rect A0T = new Rect();
    public final OverScroller A0U = getOverScrollerFromParent();
    public final C17877VhU A0V = new C17877VhU();
    public final C17556VaA A0W = new C17556VaA(0);
    public final Rect A0X = new Rect();
    public final C17819VgY A0Y = new Object();

    public final void EKj(int i, int i2) {
        int i3 = i2;
        scrollTo(i, i2);
        ValueAnimator valueAnimator = this.A0S;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        OverScroller overScroller = this.A0U;
        if (overScroller != null && !overScroller.isFinished()) {
            int currY = overScroller.getCurrY();
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            overScroller.forceFinished(true);
            if (computeScrollOffset) {
                overScroller.fling(getScrollX(), i3, 0, (int) (overScroller.getCurrVelocity() * Math.signum((float) (overScroller.getFinalY() - overScroller.getStartY()))), 0, 0, 0, Integer.MAX_VALUE);
                return;
            }
            scrollTo(getScrollX(), i2 + (overScroller.getCurrX() - currY));
        }
    }

    public final void fling(int i) {
        int i2 = i;
        if (Build.VERSION.SDK_INT == 28) {
            float signum = Math.signum(this.A0V.A01);
            if (signum == 0.0f) {
                signum = Math.signum((float) i);
            }
            i2 = (int) (((float) Math.abs(i)) * signum);
        }
        if (this.A0D) {
            A01(this, i2);
        } else {
            OverScroller overScroller = this.A0U;
            if (overScroller != null) {
                overScroller.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, 0, Integer.MAX_VALUE, 0, (C13989Tnp.A0F(this) - getPaddingTop()) / 2);
                postInvalidateOnAnimation();
            } else {
                super.fling(i2);
            }
        }
        A00(0, i2);
    }

    public void setBorderRadius(float f) {
        C13988Tno.A13(this, C13992Tns.A0A(f), 0);
    }

    private void A00(int i, int i2) {
        if (this.A07 == null) {
            if (this.A0F) {
                W3V.A07(this, AnonymousClass05K.A0N, (float) i, (float) i2);
            }
            this.A09 = false;
            C20277WoS woS = new C20277WoS(this);
            this.A07 = woS;
            postOnAnimationDelayed(woS, 20);
        }
    }

    public static void A01(U5c u5c, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int ceil;
        int top;
        int top2;
        int height;
        int i6;
        U5c u5c2 = u5c;
        int i7 = i;
        if (u5c2.getChildCount() <= 0) {
            return;
        }
        if (u5c2.A01 == 0 && u5c2.A08 == null && u5c2.A02 == 0) {
            double snapInterval = (double) u5c2.getSnapInterval();
            double A002 = (double) W3V.A00(u5c2, u5c2.getScrollY(), u5c2.A0W.A04.y, i7);
            double d = (double) W3V.A03(u5c2, 0, i7, 0, u5c2.getMaxScrollY()).y;
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
                u5c2.A09 = true;
                u5c2.E65(u5c2.getScrollX(), (int) d3);
                return;
            }
            return;
        }
        int i8 = 0;
        int maxScrollY = u5c2.getMaxScrollY();
        int i9 = W3V.A03(u5c2, 0, i7, 0, u5c2.getMaxScrollY()).y;
        if (u5c2.A0A) {
            i9 = u5c2.getScrollY();
        }
        int A0F2 = C13989Tnp.A0F(u5c2) - u5c2.getPaddingTop();
        List list = u5c2.A08;
        if (list != null) {
            i5 = C51971G9r.A0I(list, 0);
            List list2 = u5c2.A08;
            i4 = C51971G9r.A0I(list2, DbT.A02(list2, 1));
            i2 = maxScrollY;
            i3 = 0;
            for (int i10 = 0; i10 < u5c2.A08.size(); i10++) {
                int A0I2 = C51971G9r.A0I(u5c2.A08, i10);
                if (A0I2 <= i9 && i9 - A0I2 < i9 - i3) {
                    i3 = A0I2;
                }
                if (A0I2 >= i9 && A0I2 - i9 < i2 - i9) {
                    i2 = A0I2;
                }
            }
        } else {
            int i11 = u5c2.A02;
            if (i11 != 0) {
                int i12 = u5c2.A01;
                if (i12 > 0) {
                    double d4 = (double) i12;
                    double d5 = ((double) i9) / d4;
                    int floor2 = (int) (Math.floor(d5) * d4);
                    if (i11 != 1) {
                        if (i11 == 2) {
                            i6 = (A0F2 - i12) / 2;
                        } else if (i11 == 3) {
                            i6 = A0F2 - i12;
                        } else {
                            throw DbW.A0b("Invalid SnapToAlignment value: ", i11);
                        }
                        floor2 -= i6;
                    }
                    i3 = Math.max(floor2, 0);
                    ceil = (int) (Math.ceil(d5) * d4);
                    if (i11 != 1) {
                        int i13 = A0F2 - i12;
                        if (i11 == 2) {
                            i13 /= 2;
                        }
                        ceil -= i13;
                    }
                } else {
                    ViewGroup viewGroup = (ViewGroup) u5c2.getChildAt(0);
                    int i14 = maxScrollY;
                    int i15 = maxScrollY;
                    int i16 = 0;
                    int i17 = 0;
                    for (int i18 = 0; i18 < viewGroup.getChildCount(); i18++) {
                        View childAt = viewGroup.getChildAt(i18);
                        int i19 = u5c2.A02;
                        if (i19 != 1) {
                            if (i19 == 2) {
                                top2 = childAt.getTop();
                                height = (A0F2 - childAt.getHeight()) / 2;
                            } else if (i19 == 3) {
                                top2 = childAt.getTop();
                                height = A0F2 - childAt.getHeight();
                            } else {
                                throw DbW.A0b("Invalid SnapToAlignment value: ", i19);
                            }
                            top = top2 - height;
                        } else {
                            top = childAt.getTop();
                        }
                        if (top <= i9 && i9 - top < i9 - i16) {
                            i16 = top;
                        }
                        if (top >= i9 && top - i9 < i15 - i9) {
                            i15 = top;
                        }
                        i14 = Math.min(i14, top);
                        i17 = Math.max(i17, top);
                    }
                    i3 = Math.max(i16, i14);
                    i2 = Math.min(i15, i17);
                    i4 = maxScrollY;
                    i5 = 0;
                }
            } else {
                double snapInterval2 = (double) u5c2.getSnapInterval();
                double d6 = ((double) i9) / snapInterval2;
                i3 = (int) (Math.floor(d6) * snapInterval2);
                ceil = (int) (Math.ceil(d6) * snapInterval2);
            }
            i2 = Math.min(ceil, maxScrollY);
            i4 = maxScrollY;
            i5 = 0;
        }
        int i20 = i9 - i3;
        int i21 = i2 - i9;
        int i22 = i2;
        if (Math.abs(i20) < Math.abs(i21)) {
            i22 = i3;
        }
        if (u5c2.A0G || i9 < i4) {
            if (u5c2.A0H || i9 > i5) {
                if (i > 0) {
                    i7 = i + ((int) (((double) i21) * 10.0d));
                    i9 = i2;
                } else if (i < 0) {
                    i7 = i - ((int) (((double) i20) * 10.0d));
                    i9 = i3;
                } else {
                    i7 = 0;
                    i9 = i22;
                }
            } else if (u5c2.getScrollY() > i5) {
                i9 = i5;
            }
        } else if (u5c2.getScrollY() < i4) {
            i9 = i4;
        }
        int min = Math.min(Math.max(0, i9), maxScrollY);
        OverScroller overScroller = u5c2.A0U;
        if (overScroller == null) {
            u5c2.E65(u5c2.getScrollX(), min);
            return;
        }
        u5c2.A09 = true;
        int scrollX = u5c2.getScrollX();
        int scrollY = u5c2.getScrollY();
        if (i7 == 0) {
            i7 = min - u5c2.getScrollY();
        }
        if (min == 0 || min == maxScrollY) {
            i8 = A0F2 / 2;
        }
        overScroller.fling(scrollX, scrollY, 0, i7, 0, 0, min, min, 0, i8);
        u5c2.postInvalidateOnAnimation();
    }

    private int getMaxScrollY() {
        int height;
        View view = this.A0M;
        if (view == null) {
            height = 0;
        } else {
            height = view.getHeight();
        }
        return C13988Tno.A07(height, C13989Tnp.A0F(this) - getPaddingTop(), 0);
    }

    private OverScroller getOverScrollerFromParent() {
        if (!A0a) {
            A0a = true;
            try {
                Field declaredField = ScrollView.class.getDeclaredField("mScroller");
                A0Z = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                0I1.A04("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = A0Z;
        if (field == null) {
            return null;
        }
        try {
            Object obj = field.get(this);
            if (obj instanceof OverScroller) {
                return (OverScroller) obj;
            }
            0I1.A04("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
        }
    }

    private int getSnapInterval() {
        int i = this.A01;
        if (i == 0) {
            return getHeight();
        }
        return i;
    }

    public final boolean A04(View view) {
        Rect rect = this.A0T;
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
        Rect rect2 = this.A0K;
        0Sd.A00(rect2);
        rect.set(rect2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.widget.OverScroller, X.U5U] */
    public final void Ewz(int i, int i2) {
        ValueAnimator valueAnimator = this.A0S;
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
        if (this.A0R) {
            0fc.A01(8192, "ReactScrollView.updateClippingRect", 1256216962);
            try {
                0Sd.A00(this.A0K);
                C18702VyT.A00(this, this.A0K);
                View A0G2 = C13988Tno.A0G(this);
                if (A0G2 instanceof X7W) {
                    ((X7W) A0G2).FJu();
                }
            } finally {
                0fc.A00(8192, 1284963853);
            }
        }
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (!C18669VwS.A01(this.A05)) {
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public ValueAnimator getFlingAnimator() {
        return this.A0S;
    }

    public long getLastScrollDispatchTime() {
        return this.A0J;
    }

    public String getOverflow() {
        return C13992Tns.A0M(this.A0P);
    }

    public Rect getOverflowInset() {
        return this.A0X;
    }

    public C16510UwB getPointerEvents() {
        return this.A05;
    }

    public C17556VaA getReactScrollViewScrollState() {
        return this.A0W;
    }

    public boolean getRemoveClippedSubviews() {
        return this.A0R;
    }

    public boolean getScrollEnabled() {
        return this.A0E;
    }

    public int getScrollEventThrottle() {
        return this.A00;
    }

    public C20831X0g getStateWrapper() {
        return null;
    }

    public final void onChildViewAdded(View view, View view2) {
        this.A0M = view2;
        view2.addOnLayoutChangeListener(this);
    }

    public final void onChildViewRemoved(View view, View view2) {
        View view3 = this.A0M;
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(this);
            this.A0M = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        if (this.A0P != AnonymousClass05K.A00) {
            W3s.A03(canvas, this);
        }
        super.onDraw(canvas);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A0E) {
            if (!C18669VwS.A01(this.A05)) {
                return true;
            }
            try {
                if (super.onInterceptTouchEvent(motionEvent)) {
                    0qQ.A0B(motionEvent, 1);
                    X61 A002 = C18101VlV.A00(this);
                    if (A002 != null) {
                        A002.D1k(motionEvent, this);
                    }
                    W3V.A07(this, AnonymousClass05K.A00, 0.0f, 0.0f);
                    this.A0B = true;
                    this.A0S.cancel();
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
        int maxScrollY;
        if (this.A0M != null) {
            C19058WIk wIk = this.A0O;
            if (wIk != null) {
                wIk.A02();
            }
            if (isShown() && A02() && getScrollY() > (maxScrollY = getMaxScrollY())) {
                scrollTo(getScrollX(), maxScrollY);
            }
        }
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        OverScroller overScroller = this.A0U;
        if (!(overScroller == null || this.A0M == null || overScroller.isFinished() || overScroller.getCurrY() == overScroller.getFinalY() || i2 < (maxScrollY = getMaxScrollY()))) {
            overScroller.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        int i5;
        0fc.A01(8192, "ReactScrollView.onScrollChanged", -968357496);
        try {
            super.onScrollChanged(i, i2, i3, i4);
            this.A09 = true;
            C17877VhU vhU = this.A0V;
            if (vhU.A00(i, i2)) {
                if (this.A0R) {
                    FJu();
                }
                if (this.A0Q) {
                    i5 = -199250657;
                    0fc.A00(8192, i5);
                }
                this.A0Q = true;
                float f = vhU.A00;
                float f2 = vhU.A01;
                boolean z = W3V.A01;
                W3V.A06(this, getScrollX(), getScrollY());
                W3V.A07(this, AnonymousClass05K.A0C, f, f2);
                this.A0Q = false;
            }
            i5 = -585604467;
            0fc.A00(8192, i5);
        } catch (Throwable th) {
            0fc.A00(8192, -1515390765);
            throw th;
        }
    }

    public final void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            Rect rect = new Rect();
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (computeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
            }
        }
        super.requestChildFocus(view, view2);
    }

    public void setContentOffset(ReadableMap readableMap) {
        double d;
        ReadableMap readableMap2 = this.A0N;
        if (readableMap2 == null || !readableMap2.equals(readableMap)) {
            this.A0N = readableMap;
            if (readableMap != null) {
                double d2 = 0.0d;
                if (readableMap.hasKey("x")) {
                    d = readableMap.getDouble("x");
                } else {
                    d = 0.0d;
                }
                if (readableMap.hasKey("y")) {
                    d2 = readableMap.getDouble("y");
                }
                scrollTo((int) W2U.A01((float) d), (int) W2U.A01((float) d2));
                return;
            }
            scrollTo(0, 0);
        }
    }

    public void setDecelerationRate(float f) {
        this.A0W.A00 = f;
        OverScroller overScroller = this.A0U;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - f);
        }
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.A0A = z;
    }

    public void setEnableSyncOnScroll(boolean z) {
        this.A0C = z;
    }

    public void setEndFillColor(int i) {
        if (i != this.A0I) {
            this.A0I = i;
            this.A0L = new ColorDrawable(i);
        }
    }

    public void setLastScrollDispatchTime(long j) {
        this.A0J = j;
    }

    public void setMaintainVisibleContentPosition(C17318VQx vQx) {
        C19058WIk wIk = this.A0O;
        if (vQx != null) {
            if (wIk == null) {
                C19058WIk wIk2 = new C19058WIk(this, false);
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
        this.A0D = z;
    }

    public void setPointerEvents(C16510UwB uwB) {
        this.A05 = uwB;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.A0K == null) {
            this.A0K = new Rect();
        }
        this.A0R = z;
        FJu();
    }

    public void setScrollEnabled(boolean z) {
        this.A0E = z;
    }

    public void setScrollEventThrottle(int i) {
        this.A00 = i;
    }

    public void setScrollPerfTag(String str) {
    }

    public void setSendMomentumEvents(boolean z) {
        this.A0F = z;
    }

    public void setSnapInterval(int i) {
        this.A01 = i;
    }

    public void setSnapOffsets(List list) {
        this.A08 = list;
    }

    public void setSnapToAlignment(int i) {
        this.A02 = i;
    }

    public void setSnapToEnd(boolean z) {
        this.A0G = z;
    }

    public void setSnapToStart(boolean z) {
        this.A0H = z;
    }

    public void setStateWrapper(C20831X0g x0g) {
        this.A06 = x0g;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.VgY] */
    public U5c(Context context) {
        super(context);
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
        setClipChildren(false);
        03v.A0B(this, new 02Z());
    }

    private boolean A02() {
        View A0G2 = C13988Tno.A0G(this);
        if (A0G2 == null || A0G2.getWidth() == 0 || A0G2.getHeight() == 0) {
            return false;
        }
        return true;
    }

    private View getContentView() {
        return C13988Tno.A0G(this);
    }

    public final void A03() {
        awakenScrollBars();
    }

    public final void E65(int i, int i2) {
        W3V.A05(this, i, i2);
        if (A02()) {
            this.A03 = -1;
            this.A04 = -1;
            return;
        }
        this.A03 = i;
        this.A04 = i2;
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0fD.A03(739393162);
        if (this.A0I != 0) {
            View childAt = getChildAt(0);
            if (!(this.A0L == null || childAt == null || childAt.getBottom() >= getHeight())) {
                this.A0L.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.A0L.draw(canvas);
            }
        }
        super.draw(canvas);
        AnonymousClass0fD.A0A(360257451, A032);
    }

    public final boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.A0E || (keyCode != 19 && keyCode != 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(670490985);
        super.onAttachedToWindow();
        if (this.A0R) {
            FJu();
        }
        C19058WIk wIk = this.A0O;
        if (wIk != null) {
            wIk.A00();
        }
        AnonymousClass0fD.A0D(1464318912, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(566405053);
        super.onDetachedFromWindow();
        C19058WIk wIk = this.A0O;
        if (wIk != null) {
            wIk.A01();
        }
        AnonymousClass0fD.A0D(890576182, A062);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(R.id.react_test_id);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (A02()) {
            int i5 = this.A03;
            if (i5 == -1) {
                i5 = getScrollX();
            }
            int i6 = this.A04;
            if (i6 == -1) {
                i6 = getScrollY();
            }
            scrollTo(i5, i6);
        }
        Iterator it = W3V.A02.iterator();
        while (it.hasNext()) {
            ((Reference) it.next()).get();
        }
    }

    public final void onMeasure(int i, int i2) {
        C18100VlU.A00(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-1625298251);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A0R) {
            FJu();
        }
        AnonymousClass0fD.A0D(1270583747, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        int i;
        int A052 = AnonymousClass0fD.A05(1393234498);
        if (!this.A0E) {
            i = 631435889;
        } else {
            C16510UwB uwB = this.A05;
            0qQ.A0B(uwB, 0);
            if (uwB == C16510UwB.AUTO || uwB == C16510UwB.BOX_ONLY) {
                C17819VgY vgY = this.A0Y;
                vgY.A00(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 1) {
                    if (this.A0B) {
                        W3V.A04(this);
                        float f = vgY.A00;
                        float f2 = vgY.A01;
                        W3V.A07(this, AnonymousClass05K.A01, f, f2);
                        X61 A002 = C18101VlV.A00(this);
                        if (A002 != null) {
                            A002.D1f(motionEvent, this);
                        }
                        this.A0B = false;
                        A00(Math.round(f), Math.round(f2));
                    }
                } else if (actionMasked == 0 && (runnable = this.A07) != null) {
                    removeCallbacks(runnable);
                    this.A07 = null;
                    this.A0S.cancel();
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                AnonymousClass0fD.A0C(-247293733, A052);
                return onTouchEvent;
            }
            i = -1648213983;
        }
        AnonymousClass0fD.A0C(i, A052);
        return false;
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        W3V.A04(this);
        if (A02()) {
            this.A03 = -1;
            this.A04 = -1;
            return;
        }
        this.A03 = i;
        this.A04 = i2;
    }

    public void setBorderStyle(String str) {
        W3s.A0C(this, C13991Tnr.A0X(str));
    }

    public void setScrollAwayTopPaddingEnabledUnstable(int i) {
        int childCount = getChildCount();
        boolean z = true;
        if (childCount > 1) {
            z = false;
        }
        0Sd.A03(z, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View");
        if (childCount > 0) {
            int i2 = 0;
            do {
                getChildAt(i2).setTranslationY((float) i);
                i2++;
            } while (i2 < childCount);
            setPadding(0, 0, 0, i);
        }
        boolean z2 = W3V.A01;
        if (getReactScrollViewScrollState().A03 == 1) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.getWidth();
            }
            getWidth();
        }
        setRemoveClippedSubviews(this.A0R);
    }

    public void setBackgroundColor(int i) {
        C13988Tno.A10(this, i);
    }
}
