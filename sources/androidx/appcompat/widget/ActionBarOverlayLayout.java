package androidx.appcompat.widget;

import X.02M;
import X.04k;
import X.0kz;
import X.0uj;
import X.AnonymousClass03P;
import X.AnonymousClass04f;
import X.AnonymousClass04g;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.AnonymousClass972;
import X.C13990Tnq;
import X.C14714U3f;
import X.C18932WDk;
import X.C19888WhJ;
import X.C19889WhK;
import X.C20820Wzu;
import X.C20936X5e;
import X.C20939X5h;
import X.C51968G9o;
import X.DbS;
import X.DbW;
import X.U0N;
import X.U36;
import X.U5n;
import X.WDU;
import X.WDZ;
import X.X8D;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.instagram.android.R;

public class ActionBarOverlayLayout extends ViewGroup implements X8D, 0uj, 0kz {
    public static final Rect A0W = new Rect();
    public static final 04k A0X;
    public static final int[] A0Y = {R.attr.actionBarSize, 16842841};
    public ViewPropertyAnimator A00;
    public OverScroller A01;
    public ActionBarContainer A02;
    public C20939X5h A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Drawable A0B;
    public C20820Wzu A0C;
    public ContentFrameLayout A0D;
    public 04k A0E;
    public 04k A0F;
    public 04k A0G;
    public 04k A0H;
    public boolean A0I;
    public final AnimatorListenerAdapter A0J;
    public final Rect A0K;
    public final U36 A0L;
    public final Runnable A0M;
    public final Runnable A0N;
    public final Rect A0O;
    public final Rect A0P;
    public final Rect A0Q;
    public final Rect A0R;
    public final Rect A0S;
    public final Rect A0T;
    public final Rect A0U;
    public final AnonymousClass03P A0V;

    static {
        AnonymousClass04f r0 = new AnonymousClass04f();
        02M r1 = new 02M(0, 1, 0, 1);
        AnonymousClass04g r02 = r0.A00;
        r02.A06(r1);
        A0X = r02.A00();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void DTm(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        DTl(view, i, i2, i3, i4, i5);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r16, int r17) {
        /*
            r15 = this;
            r9 = r15
            r15.A02()
            androidx.appcompat.widget.ActionBarContainer r10 = r15.A02
            r12 = 0
            r11 = r16
            r13 = r17
            r14 = r12
            r9.measureChildWithMargins(r10, r11, r12, r13, r14)
            androidx.appcompat.widget.ActionBarContainer r0 = r15.A02
            android.view.ViewGroup$MarginLayoutParams r1 = X.DbS.A0D(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = r15.A02
            int r0 = r0.getMeasuredWidth()
            int r5 = X.C13989Tnp.A0K(r1, r0, r12)
            androidx.appcompat.widget.ActionBarContainer r0 = r15.A02
            int r0 = r0.getMeasuredHeight()
            int r0 = X.C13988Tno.A0B(r1, r0)
            int r6 = java.lang.Math.max(r12, r0)
            androidx.appcompat.widget.ActionBarContainer r0 = r15.A02
            int r3 = X.C13988Tno.A0A(r0, r12)
            int r0 = r15.getWindowSystemUiVisibility()
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0154
            r2 = 1
            int r1 = r15.A07
            boolean r0 = r15.A05
            if (r0 == 0) goto L_0x0049
            androidx.appcompat.widget.ActionBarContainer r0 = r15.A02
            android.view.View r0 = r0.A03
            if (r0 == 0) goto L_0x0049
            int r1 = r1 + r1
        L_0x0049:
            android.graphics.Rect r7 = r15.A0Q
            android.graphics.Rect r0 = r15.A0O
            r7.set(r0)
            X.04k r0 = r15.A0E
            r15.A0F = r0
            boolean r0 = r15.A06
            if (r0 != 0) goto L_0x0119
            if (r2 != 0) goto L_0x0119
            X.U36 r8 = r15.A0L
            X.04k r0 = A0X
            android.graphics.Rect r2 = r15.A0K
            android.view.WindowInsets r0 = r0.A03()
            if (r0 == 0) goto L_0x0114
            android.view.WindowInsets r0 = r8.computeSystemWindowInsets(r0, r2)
            X.04k.A01(r8, r0)
        L_0x006d:
            android.graphics.Rect r0 = A0W
            boolean r0 = r2.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0119
            int r0 = r7.top
            int r0 = r0 + r1
            r7.top = r0
            int r0 = r7.bottom
            r7.bottom = r0
            X.04k r0 = r15.A0F
            X.04h r0 = r0.A00
            X.04k r0 = r0.A0B(r12, r1, r12, r12)
        L_0x0088:
            r15.A0F = r0
            androidx.appcompat.widget.ContentFrameLayout r0 = r15.A0D
            android.view.ViewGroup$MarginLayoutParams r2 = X.DbS.A0D(r0)
            int r1 = r2.leftMargin
            int r0 = r7.left
            if (r1 == r0) goto L_0x0098
            r2.leftMargin = r0
        L_0x0098:
            int r1 = r2.topMargin
            int r0 = r7.top
            if (r1 == r0) goto L_0x00a0
            r2.topMargin = r0
        L_0x00a0:
            int r1 = r2.rightMargin
            int r0 = r7.right
            if (r1 == r0) goto L_0x00a8
            r2.rightMargin = r0
        L_0x00a8:
            int r1 = r2.bottomMargin
            int r0 = r7.bottom
            if (r1 == r0) goto L_0x00b0
            r2.bottomMargin = r0
        L_0x00b0:
            X.04k r1 = r15.A0H
            X.04k r0 = r15.A0F
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c3
            X.04k r1 = r15.A0F
            r15.A0H = r1
            androidx.appcompat.widget.ContentFrameLayout r0 = r15.A0D
            X.03v.A04(r0, r1)
        L_0x00c3:
            androidx.appcompat.widget.ContentFrameLayout r10 = r15.A0D
            r9.measureChildWithMargins(r10, r11, r12, r13, r14)
            androidx.appcompat.widget.ContentFrameLayout r0 = r15.A0D
            android.view.ViewGroup$MarginLayoutParams r1 = X.DbS.A0D(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = r15.A0D
            int r0 = r0.getMeasuredWidth()
            int r4 = X.C13989Tnp.A0K(r1, r0, r5)
            androidx.appcompat.widget.ContentFrameLayout r0 = r15.A0D
            int r0 = r0.getMeasuredHeight()
            int r0 = X.C13988Tno.A0B(r1, r0)
            int r1 = java.lang.Math.max(r6, r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = r15.A0D
            int r3 = X.C13988Tno.A0A(r0, r3)
            int r0 = X.C13989Tnp.A0E(r15)
            int r4 = r4 + r0
            int r0 = X.C13989Tnp.A0H(r15)
            int r1 = r1 + r0
            int r0 = r15.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r1, r0)
            int r0 = r15.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r4, r0)
            int r1 = android.view.View.resolveSizeAndState(r0, r11, r3)
            int r0 = r3 << 16
            int r0 = android.view.View.resolveSizeAndState(r2, r13, r0)
            r15.setMeasuredDimension(r1, r0)
            return
        L_0x0114:
            r2.setEmpty()
            goto L_0x006d
        L_0x0119:
            X.04k r0 = r15.A0F
            X.04h r0 = r0.A00
            X.02M r0 = r0.A03()
            int r8 = r0.A01
            X.04k r0 = r15.A0F
            X.04h r0 = r0.A00
            X.02M r0 = r0.A03()
            int r2 = r0.A03
            int r2 = r2 + r1
            X.04k r0 = r15.A0F
            X.04h r0 = r0.A00
            X.02M r0 = r0.A03()
            int r1 = r0.A02
            X.04k r0 = r15.A0F
            int r0 = r0.A02()
            X.02M r2 = X.02M.A00(r8, r2, r1, r0)
            X.04k r1 = r15.A0F
            X.04f r0 = new X.04f
            r0.<init>(r1)
            X.04g r0 = r0.A00
            r0.A06(r2)
            X.04k r0 = r0.A00()
            goto L_0x0088
        L_0x0154:
            r2 = 0
            androidx.appcompat.widget.ActionBarContainer r0 = r15.A02
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0167
            androidx.appcompat.widget.ActionBarContainer r0 = r15.A02
            int r1 = r0.getMeasuredHeight()
            goto L_0x0049
        L_0x0167:
            r1 = 0
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void A01() {
        removeCallbacks(this.A0N);
        removeCallbacks(this.A0M);
        ViewPropertyAnimator viewPropertyAnimator = this.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void A02() {
        C20939X5h wrapper;
        if (this.A0D == null) {
            this.A0D = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.A02 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof C20939X5h) {
                wrapper = (C20939X5h) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw DbW.A0c("Can't make a decor toolbar out of ", C51968G9o.A16(findViewById));
            }
            this.A03 = wrapper;
        }
    }

    public final void DTl(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final void DTn(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final boolean DmW(View view, View view2, int i, int i2) {
        if (i2 != 0 || !onStartNestedScroll(view, view2, i)) {
            return false;
        }
        return true;
    }

    public final void DnO(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C14714U3f;
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.A02;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        AnonymousClass03P r0 = this.A0V;
        return r0.A01 | r0.A00;
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        Runnable runnable;
        if (!this.A0I || !z) {
            return false;
        }
        this.A01.fling(0, 0, 0, (int) f2, 0, 0, AnonymousClass972.MUTABLE_FLAG_MASK, Integer.MAX_VALUE);
        if (this.A01.getFinalY() > this.A02.getHeight()) {
            A01();
            runnable = this.A0M;
        } else {
            A01();
            runnable = this.A0N;
        }
        runnable.run();
        this.A04 = true;
        return true;
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.A08 + i2;
        this.A08 = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (X.U5n) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedScrollAccepted(android.view.View r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            X.03P r0 = r2.A0V
            r0.A01 = r5
            int r0 = r2.getActionBarHideOffset()
            r2.A08 = r0
            r2.A01()
            X.Wzu r1 = r2.A0C
            if (r1 == 0) goto L_0x001d
            X.U5n r1 = (X.U5n) r1
            X.Vjg r0 = r1.A07
            if (r0 == 0) goto L_0x001d
            r0.A00()
            r0 = 0
            r1.A07 = r0
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.A02.getVisibility() != 0) {
            return false;
        }
        return this.A0I;
    }

    public final void onStopNestedScroll(View view) {
        Runnable runnable;
        if (this.A0I && !this.A04) {
            if (this.A08 <= this.A02.getHeight()) {
                A01();
                runnable = this.A0N;
            } else {
                A01();
                runnable = this.A0M;
            }
            postDelayed(runnable, 600);
        }
    }

    public void setActionBarVisibilityCallback(C20820Wzu wzu) {
        this.A0C = wzu;
        if (getWindowToken() != null) {
            ((U5n) this.A0C).A00 = this.A0A;
            int i = this.A09;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.A05 = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.A0I) {
            this.A0I = z;
            if (!z) {
                A01();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.A06 = z;
    }

    private void A00(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A0Y);
        boolean z = false;
        this.A07 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.A0B = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        this.A01 = new OverScroller(context);
    }

    public final boolean CYl() {
        WDU wdu;
        A02();
        ActionMenuView actionMenuView = ((WDZ) this.A03).A09.A0E;
        if (actionMenuView == null || (wdu = actionMenuView.A04) == null || !wdu.A03()) {
            return false;
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        int i;
        int A032 = AnonymousClass0fD.A03(1732354958);
        super.draw(canvas);
        if (this.A0B != null) {
            if (this.A02.getVisibility() == 0) {
                i = (int) (((float) this.A02.getBottom()) + this.A02.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.A0B.setBounds(0, i, getWidth(), this.A0B.getIntrinsicHeight() + i);
            this.A0B.draw(canvas);
        }
        AnonymousClass0fD.A0A(-664379951, A032);
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public CharSequence getTitle() {
        A02();
        return ((WDZ) this.A03).A09.A0J;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0092, code lost:
        if (r6 != false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r9) {
        /*
            r8 = this;
            r8.A02()
            X.04k r7 = X.04k.A01(r8, r9)
            X.04h r5 = r7.A00
            X.02M r0 = r5.A03()
            int r4 = r0.A01
            X.02M r0 = r5.A03()
            int r2 = r0.A03
            X.02M r0 = r5.A03()
            int r1 = r0.A02
            int r0 = r7.A02()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r4, r2, r1, r0)
            androidx.appcompat.widget.ActionBarContainer r0 = r8.A02
            android.view.ViewGroup$MarginLayoutParams r2 = X.DbS.A0D(r0)
            int r1 = r2.leftMargin
            int r0 = r3.left
            if (r1 == r0) goto L_0x0099
            r2.leftMargin = r0
            r6 = 1
        L_0x0033:
            int r1 = r2.topMargin
            int r0 = r3.top
            if (r1 == r0) goto L_0x003c
            r2.topMargin = r0
            r6 = 1
        L_0x003c:
            int r1 = r2.rightMargin
            int r0 = r3.right
            if (r1 == r0) goto L_0x0045
            r2.rightMargin = r0
            r6 = 1
        L_0x0045:
            android.graphics.Rect r4 = r8.A0O
            android.view.WindowInsets r0 = r7.A03()
            if (r0 == 0) goto L_0x0095
            android.view.WindowInsets r0 = r8.computeSystemWindowInsets(r0, r4)
            X.04k.A01(r8, r0)
        L_0x0054:
            int r3 = r4.left
            int r2 = r4.top
            int r1 = r4.right
            int r0 = r4.bottom
            X.04k r1 = r5.A0B(r3, r2, r1, r0)
            r8.A0E = r1
            X.04k r0 = r8.A0G
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006f
            X.04k r0 = r8.A0E
            r8.A0G = r0
            r6 = 1
        L_0x006f:
            android.graphics.Rect r1 = r8.A0S
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x0092
            r1.set(r4)
        L_0x007a:
            r8.requestLayout()
        L_0x007d:
            X.04k r0 = r5.A08()
            X.04h r0 = r0.A00
            X.04k r0 = r0.A0A()
            X.04h r0 = r0.A00
            X.04k r0 = r0.A09()
            android.view.WindowInsets r0 = r0.A03()
            return r0
        L_0x0092:
            if (r6 == 0) goto L_0x007d
            goto L_0x007a
        L_0x0095:
            r4.setEmpty()
            goto L_0x0054
        L_0x0099:
            r6 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A00(getContext());
        requestApplyInsets();
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(2033358046);
        super.onDetachedFromWindow();
        A01();
        AnonymousClass0fD.A0D(-140243450, A062);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(childAt);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = A0D2.leftMargin + paddingLeft;
                int i7 = A0D2.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        A02();
        int i2 = this.A09 ^ i;
        this.A09 = i;
        boolean z2 = false;
        boolean A1Q = AnonymousClass7TF.A1Q(i & 4);
        if ((i & 256) != 0) {
            z2 = true;
        }
        C20820Wzu wzu = this.A0C;
        if (wzu != null) {
            U5n u5n = (U5n) wzu;
            u5n.A0D = !z2;
            if (A1Q || !z2) {
                if (u5n.A0F) {
                    u5n.A0F = false;
                    z = true;
                }
            } else if (!u5n.A0F) {
                z = true;
                u5n.A0F = true;
            }
            U5n.A01(u5n, z);
        }
        if ((i2 & 256) != 0 && this.A0C != null) {
            requestApplyInsets();
        }
    }

    public final void onWindowVisibilityChanged(int i) {
        int A062 = AnonymousClass0fD.A06(133357578);
        super.onWindowVisibilityChanged(i);
        this.A0A = i;
        C20820Wzu wzu = this.A0C;
        if (wzu != null) {
            ((U5n) wzu).A00 = i;
        }
        AnonymousClass0fD.A0D(2116487754, A062);
    }

    public void setActionBarHideOffset(int i) {
        A01();
        this.A02.setTranslationY((float) (-Math.max(0, Math.min(i, this.A02.getHeight()))));
    }

    public void setIcon(int i) {
        Drawable drawable;
        A02();
        WDZ wdz = (WDZ) this.A03;
        if (i != 0) {
            drawable = C13990Tnq.A0E(wdz.A09, i);
        } else {
            drawable = null;
        }
        wdz.A03 = drawable;
        WDZ.A00(wdz);
    }

    public void setLogo(int i) {
        Drawable drawable;
        A02();
        WDZ wdz = (WDZ) this.A03;
        if (i != 0) {
            drawable = C13990Tnq.A0E(wdz.A09, i);
        } else {
            drawable = null;
        }
        wdz.A04 = drawable;
        WDZ.A00(wdz);
    }

    public void setMenu(Menu menu, C20936X5e x5e) {
        A02();
        WDZ wdz = (WDZ) this.A03;
        WDU wdu = wdz.A08;
        if (wdu == null) {
            wdu = new WDU(wdz.A09.getContext());
            wdz.A08 = wdu;
        }
        wdu.A07 = x5e;
        wdz.A09.setMenu((C18932WDk) menu, wdu);
    }

    public void setWindowCallback(Window.Callback callback) {
        A02();
        ((WDZ) this.A03).A07 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        A02();
        this.A03.setWindowTitle(charSequence);
    }

    public final void DTk(View view, int[] iArr, int i, int i2, int i3) {
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.03P] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View, X.U36] */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0A = 0;
        this.A0O = new Rect();
        this.A0S = new Rect();
        this.A0Q = new Rect();
        this.A0K = new Rect();
        this.A0P = new Rect();
        this.A0T = new Rect();
        this.A0R = new Rect();
        this.A0U = new Rect();
        04k r0 = 04k.A01;
        this.A0E = r0;
        this.A0G = r0;
        this.A0F = r0;
        this.A0H = r0;
        this.A0J = new U0N(this, 0);
        this.A0N = new C19888WhJ(this);
        this.A0M = new C19889WhK(this);
        A00(context);
        this.A0V = new Object();
        ? view = new View(context);
        view.setWillNotDraw(true);
        this.A0L = view;
        addView(view);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A02();
        WDZ wdz = (WDZ) this.A03;
        wdz.A03 = drawable;
        WDZ.A00(wdz);
    }
}
