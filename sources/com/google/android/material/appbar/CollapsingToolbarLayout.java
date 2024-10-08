package com.google.android.material.appbar;

import X.04k;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C14129TqO;
import X.C14130TqP;
import X.C297865sU;
import X.C298025sk;
import X.C324096yd;
import X.C324246ys;
import X.C66581MXm;
import X.SN3;
import X.U4L;
import X.UWQ;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.instagram.android.R;

public class CollapsingToolbarLayout extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public ValueAnimator A04;
    public Drawable A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public 04k A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public Drawable A0K;
    public C324246ys A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final Rect A0Q;
    public final C298025sk A0R;
    public final C14129TqO A0S;

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3;
        int i6 = i4;
        super.onLayout(z, i, i2, i5, i6);
        04k r0 = this.A09;
        if (r0 != null) {
            int i7 = r0.A00.A03().A03;
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < i7) {
                    childAt.offsetTopAndBottom(i7);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            C324096yd A002 = A00(getChildAt(i9));
            View view = A002.A03;
            A002.A01 = view.getTop();
            A002.A00 = view.getLeft();
        }
        A04(i, i2, i5, i6, false);
        A03();
        A05();
        int childCount3 = getChildCount();
        for (int i10 = 0; i10 < childCount3; i10++) {
            A00(getChildAt(i10)).A00();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int measuredHeight2;
        int lineCount;
        A01();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        04k r0 = this.A09;
        if (r0 != null) {
            i3 = r0.A00.A03().A03;
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.A0O) && i3 > 0) {
            this.A0J = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, SN3.MAX_SIGNED_POWER_OF_TWO));
        }
        if (this.A0N) {
            C14129TqO tqO = this.A0S;
            if (tqO.A0T > 1) {
                A03();
                A04(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                StaticLayout staticLayout = tqO.A0c;
                if (staticLayout != null && (lineCount = staticLayout.getLineCount()) > 1) {
                    TextPaint textPaint = tqO.A0u;
                    textPaint.setTextSize(tqO.A0K);
                    textPaint.setTypeface(tqO.A0b);
                    textPaint.setLetterSpacing(tqO.A0F);
                    this.A0G = Math.round((-textPaint.ascent()) + textPaint.descent()) * (lineCount - 1);
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.A0G, SN3.MAX_SIGNED_POWER_OF_TWO));
                }
            }
        }
        ViewGroup viewGroup = this.A08;
        if (viewGroup != null) {
            View view = this.A07;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight2 = viewGroup.getMeasuredHeight();
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                    setMinimumHeight(measuredHeight);
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    measuredHeight2 = view.getMeasuredHeight();
                } else {
                    measuredHeight = view.getMeasuredHeight();
                    setMinimumHeight(measuredHeight);
                }
            }
            measuredHeight = C13988Tno.A0B(marginLayoutParams, measuredHeight2);
            setMinimumHeight(measuredHeight);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r6 = this;
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x0053
            r5 = 0
            r6.A08 = r5
            r6.A07 = r5
            int r1 = r6.A0I
            r0 = -1
            if (r1 == r0) goto L_0x002e
            android.view.View r2 = r6.findViewById(r1)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6.A08 = r2
            if (r2 == 0) goto L_0x002e
            android.view.ViewParent r1 = r2.getParent()
        L_0x001c:
            if (r1 == r6) goto L_0x002c
            if (r1 == 0) goto L_0x002c
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0027
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        L_0x0027:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x001c
        L_0x002c:
            r6.A07 = r2
        L_0x002e:
            android.view.ViewGroup r0 = r6.A08
            r4 = 0
            if (r0 != 0) goto L_0x004e
            int r3 = r6.getChildCount()
            r2 = 0
        L_0x0038:
            if (r2 >= r3) goto L_0x004c
            android.view.View r1 = r6.getChildAt(r2)
            boolean r0 = r1 instanceof androidx.appcompat.widget.Toolbar
            if (r0 != 0) goto L_0x0049
            boolean r0 = r1 instanceof android.widget.Toolbar
            if (r0 != 0) goto L_0x0049
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0049:
            r5 = r1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x004c:
            r6.A08 = r5
        L_0x004e:
            r6.A02()
            r6.A0P = r4
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.A01():void");
    }

    private void A02() {
        View view;
        if (!this.A0A && (view = this.A06) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A06);
            }
        }
        if (this.A0A && this.A08 != null) {
            View view2 = this.A06;
            if (view2 == null) {
                view2 = new View(getContext());
                this.A06 = view2;
            }
            if (view2.getParent() == null) {
                this.A08.addView(this.A06, -1, -1);
            }
        }
    }

    private void A03() {
        CharSequence charSequence;
        if (this.A08 != null && this.A0A && TextUtils.isEmpty(this.A0S.A0f)) {
            ViewGroup viewGroup = this.A08;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).A0J;
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r14.A06.getVisibility() != 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            boolean r0 = r14.A0A
            if (r0 == 0) goto L_0x0093
            android.view.View r0 = r14.A06
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.isAttachedToWindow()
            r13 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0019
            android.view.View r0 = r14.A06
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r14.A0M = r0
            r3 = r19
            if (r0 != 0) goto L_0x0022
            if (r19 == 0) goto L_0x0093
        L_0x0022:
            int r0 = r14.getLayoutDirection()
            if (r0 != r2) goto L_0x0029
            r13 = 1
        L_0x0029:
            android.view.View r2 = r14.A07
            if (r2 != 0) goto L_0x002f
            android.view.ViewGroup r2 = r14.A08
        L_0x002f:
            X.6yd r0 = A00(r2)
            android.view.ViewGroup$MarginLayoutParams r1 = X.DbS.A0D(r2)
            int r12 = r14.getHeight()
            int r0 = r0.A01
            int r12 = r12 - r0
            int r0 = r2.getHeight()
            int r12 = r12 - r0
            int r0 = r1.bottomMargin
            int r12 = r12 - r0
            android.view.View r0 = r14.A06
            android.graphics.Rect r9 = r14.A0Q
            X.C18717Vyn.A01(r9, r0, r14)
            android.view.ViewGroup r2 = r14.A08
            boolean r0 = r2 instanceof androidx.appcompat.widget.Toolbar
            r10 = 0
            if (r0 == 0) goto L_0x009a
            androidx.appcompat.widget.Toolbar r2 = (androidx.appcompat.widget.Toolbar) r2
            int r10 = r2.A05
            int r11 = r2.A04
            int r1 = r2.A06
            int r8 = r2.A03
        L_0x005e:
            X.TqO r6 = r14.A0S
            int r7 = r9.left
            r0 = r10
            if (r13 == 0) goto L_0x0066
            r0 = r11
        L_0x0066:
            int r7 = r7 + r0
            int r2 = r9.top
            int r2 = r2 + r12
            int r2 = r2 + r1
            int r1 = r9.right
            if (r13 != 0) goto L_0x0070
            r10 = r11
        L_0x0070:
            int r1 = r1 - r10
            int r0 = r9.bottom
            int r0 = r0 + r12
            int r0 = r0 - r8
            r6.A0B(r7, r2, r1, r0)
            if (r13 == 0) goto L_0x0097
            int r2 = r14.A0D
        L_0x007c:
            int r1 = r9.top
            int r0 = r14.A0F
            int r1 = r1 + r0
            int r5 = r17 - r15
            if (r13 == 0) goto L_0x0094
            int r0 = r14.A0E
        L_0x0087:
            int r5 = r5 - r0
            int r4 = r18 - r16
            int r0 = r14.A0C
            int r4 = r4 - r0
            r6.A0C(r2, r1, r5, r4)
            r6.A0G(r3)
        L_0x0093:
            return
        L_0x0094:
            int r0 = r14.A0D
            goto L_0x0087
        L_0x0097:
            int r2 = r14.A0E
            goto L_0x007c
        L_0x009a:
            boolean r0 = r2 instanceof android.widget.Toolbar
            if (r0 == 0) goto L_0x00b1
            android.widget.Toolbar r2 = (android.widget.Toolbar) r2
            int r10 = r2.getTitleMarginStart()
            int r11 = r2.getTitleMarginEnd()
            int r1 = r2.getTitleMarginTop()
            int r8 = r2.getTitleMarginBottom()
            goto L_0x005e
        L_0x00b1:
            r8 = 0
            r11 = 0
            r1 = 0
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.A04(int, int, int, int, boolean):void");
    }

    public final void A05() {
        if (this.A0K != null || this.A05 != null) {
            setScrimsShown(AnonymousClass7TF.A1T(getHeight() + this.A00, getScrimVisibleHeightTrigger()));
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof U4L;
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        Drawable drawable = this.A0K;
        if (drawable != null && this.A01 > 0) {
            View view2 = this.A07;
            if (view2 == null || view2 == this) {
                view2 = this.A08;
            }
            if (view == view2) {
                int width = getWidth();
                int height = getHeight();
                if (this.A02 == 1 && view != null && this.A0A) {
                    height = view.getBottom();
                }
                drawable.setBounds(0, 0, width, height);
                this.A0K.mutate().setAlpha(this.A01);
                this.A0K.draw(canvas);
                z = true;
                if (super.drawChild(canvas, view, j) && !z) {
                    return false;
                }
            }
        }
        z = false;
        return super.drawChild(canvas, view, j) ? true : true;
    }

    public int getCollapsedTitleGravity() {
        return this.A0S.A0P;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.A0S.A0a;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public Drawable getContentScrim() {
        return this.A0K;
    }

    public int getExpandedTitleGravity() {
        return this.A0S.A0R;
    }

    public int getExpandedTitleMarginBottom() {
        return this.A0C;
    }

    public int getExpandedTitleMarginEnd() {
        return this.A0D;
    }

    public int getExpandedTitleMarginStart() {
        return this.A0E;
    }

    public int getExpandedTitleMarginTop() {
        return this.A0F;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.A0S.A0b;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getHyphenationFrequency() {
        return this.A0S.A0S;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.A0S.A0c;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.A0S.A0c.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.A0S.A0c.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.A0S.A0T;
    }

    public int getScrimAlpha() {
        return this.A01;
    }

    public long getScrimAnimationDuration() {
        return this.A03;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.A0H;
        if (i2 >= 0) {
            return i2 + this.A0J + this.A0G;
        }
        04k r0 = this.A09;
        if (r0 != null) {
            i = r0.A00.A03().A03;
        } else {
            i = 0;
        }
        int minimumHeight = getMinimumHeight();
        if (minimumHeight > 0) {
            return Math.min((minimumHeight * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.A05;
    }

    public CharSequence getTitle() {
        if (this.A0A) {
            return this.A0S.A0f;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.A02;
    }

    public void setCollapsedTitleGravity(int i) {
        this.A0S.A09(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.A0S.A08(i);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C14129TqO tqO = this.A0S;
        UWQ uwq = tqO.A0d;
        if (uwq != null) {
            uwq.A00 = true;
        }
        if (tqO.A0a != typeface) {
            tqO.A0a = typeface;
            tqO.A0G(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.A0K;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0K = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.A08;
                if (this.A02 == 1 && viewGroup != null && this.A0A) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.A0K.setCallback(this);
                this.A0K.setAlpha(this.A01);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setExpandedTitleGravity(int i) {
        C14129TqO tqO = this.A0S;
        if (tqO.A0R != i) {
            tqO.A0R = i;
            tqO.A0G(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.A0C = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.A0D = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.A0E = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.A0F = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.A0S.A0A(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C14129TqO tqO = this.A0S;
        if (tqO.A0Z != colorStateList) {
            tqO.A0Z = colorStateList;
            tqO.A0G(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C14129TqO tqO = this.A0S;
        UWQ uwq = tqO.A0e;
        if (uwq != null) {
            uwq.A00 = true;
        }
        if (tqO.A0b != typeface) {
            tqO.A0b = typeface;
            tqO.A0G(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.A0N = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.A0O = z;
    }

    public void setHyphenationFrequency(int i) {
        this.A0S.A0S = i;
    }

    public void setLineSpacingAdd(float f) {
        this.A0S.A0N = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.A0S.A0O = f;
    }

    public void setMaxLines(int i) {
        C14129TqO tqO = this.A0S;
        if (i != tqO.A0T) {
            tqO.A0T = i;
            tqO.A0G(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.A0S.A0k = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.A01) {
            if (!(this.A0K == null || (viewGroup = this.A08) == null)) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.A01 = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.A03 = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.A0H != i) {
            this.A0H = i;
            A05();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.A05;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A05 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    C13988Tno.A0x(this.A05, this);
                }
                this.A05.setLayoutDirection(getLayoutDirection());
                this.A05.setVisible(AnonymousClass7TF.A1Q(getVisibility()), false);
                this.A05.setCallback(this);
                this.A05.setAlpha(this.A01);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setTitle(CharSequence charSequence) {
        C14129TqO tqO = this.A0S;
        if (charSequence == null || !TextUtils.equals(tqO.A0f, charSequence)) {
            tqO.A0f = charSequence;
            tqO.A0g = null;
            tqO.A0G(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.A02 = i;
        boolean A1V = C66581MXm.A1V(i);
        this.A0S.A0i = A1V;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A02 == 1) {
                appBarLayout.A0B = false;
            }
        }
        if (A1V && this.A0K == null) {
            float dimension = getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
            C298025sk r1 = this.A0R;
            setContentScrimColor(r1.A00(r1.A01, dimension));
        }
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.A0A) {
            this.A0A = z;
            setContentDescription(getTitle());
            A02();
            requestLayout();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r12 = 2132018487(0x7f140537, float:1.9675282E38)
            r8 = r15
            r11 = r16
            android.content.Context r0 = X.C297835sR.A00(r14, r15, r11, r12)
            r13.<init>(r0, r15, r11)
            r6 = 1
            r13.A0P = r6
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r13.A0Q = r0
            r2 = -1
            r13.A0H = r2
            r1 = 0
            r13.A0J = r1
            r13.A0G = r1
            android.content.Context r7 = r13.getContext()
            X.TqO r5 = new X.TqO
            r5.<init>(r13)
            r13.A0S = r5
            android.animation.TimeInterpolator r0 = X.AnonymousClass6Y2.A00
            r5.A0V = r0
            r5.A0G(r1)
            r5.A0k = r1
            X.5sk r0 = new X.5sk
            r0.<init>(r7)
            r13.A0R = r0
            int[] r9 = X.C297865sU.A0B
            int[] r10 = new int[r1]
            android.content.res.TypedArray r3 = X.C297855sT.A00(r7, r8, r9, r10, r11, r12)
            r4 = 3
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r4 = r3.getInt(r4, r0)
            int r0 = r5.A0R
            if (r0 == r4) goto L_0x0053
            r5.A0R = r4
            r5.A0G(r1)
        L_0x0053:
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r0 = r3.getInt(r1, r0)
            r5.A09(r0)
            r0 = 4
            int r0 = r3.getDimensionPixelSize(r0, r1)
            r13.A0C = r0
            r13.A0D = r0
            r13.A0F = r0
            r13.A0E = r0
            r4 = 7
            boolean r0 = r3.hasValue(r4)
            if (r0 == 0) goto L_0x0077
            int r0 = r3.getDimensionPixelSize(r4, r1)
            r13.A0E = r0
        L_0x0077:
            r4 = 6
            boolean r0 = r3.hasValue(r4)
            if (r0 == 0) goto L_0x0084
            int r0 = r3.getDimensionPixelSize(r4, r1)
            r13.A0D = r0
        L_0x0084:
            r4 = 8
            boolean r0 = r3.hasValue(r4)
            if (r0 == 0) goto L_0x0092
            int r0 = r3.getDimensionPixelSize(r4, r1)
            r13.A0F = r0
        L_0x0092:
            r4 = 5
            boolean r0 = r3.hasValue(r4)
            if (r0 == 0) goto L_0x009f
            int r0 = r3.getDimensionPixelSize(r4, r1)
            r13.A0C = r0
        L_0x009f:
            r0 = 18
            boolean r0 = r3.getBoolean(r0, r6)
            r13.A0A = r0
            r0 = 16
            java.lang.CharSequence r0 = r3.getText(r0)
            r13.setTitle(r0)
            r0 = 2132018256(0x7f140450, float:1.9674814E38)
            r5.A0A(r0)
            r0 = 2132018242(0x7f140442, float:1.9674785E38)
            r5.A08(r0)
            r4 = 9
            boolean r0 = r3.hasValue(r4)
            if (r0 == 0) goto L_0x00cb
            int r0 = r3.getResourceId(r4, r1)
            r5.A0A(r0)
        L_0x00cb:
            boolean r0 = r3.hasValue(r6)
            if (r0 == 0) goto L_0x00d8
            int r0 = r3.getResourceId(r6, r1)
            r5.A08(r0)
        L_0x00d8:
            r0 = 14
            int r0 = r3.getDimensionPixelSize(r0, r2)
            r13.A0H = r0
            r4 = 12
            boolean r0 = r3.hasValue(r4)
            if (r0 == 0) goto L_0x00f5
            int r4 = r3.getInt(r4, r6)
            int r0 = r5.A0T
            if (r4 == r0) goto L_0x00f5
            r5.A0T = r4
            r5.A0G(r1)
        L_0x00f5:
            r4 = 13
            r0 = 600(0x258, float:8.41E-43)
            int r0 = r3.getInt(r4, r0)
            long r4 = (long) r0
            r13.A03 = r4
            r0 = 2
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r13.setContentScrim(r0)
            r0 = 15
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r13.setStatusBarScrim(r0)
            r0 = 17
            int r0 = r3.getInt(r0, r1)
            r13.setTitleCollapseMode(r0)
            r0 = 19
            int r0 = r3.getResourceId(r0, r2)
            r13.A0I = r0
            r0 = 11
            boolean r0 = r3.getBoolean(r0, r1)
            r13.A0O = r0
            r0 = 10
            boolean r0 = r3.getBoolean(r0, r1)
            r13.A0N = r0
            r3.recycle()
            r13.setWillNotDraw(r1)
            X.Ttj r0 = new X.Ttj
            r0.<init>(r13, r1)
            X.AnonymousClass03j.A00(r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static C324096yd A00(View view) {
        C324096yd r0 = (C324096yd) view.getTag(R.id.view_offset_helper);
        if (r0 != null) {
            return r0;
        }
        C324096yd r02 = new C324096yd(view);
        view.setTag(R.id.view_offset_helper, r02);
        return r02;
    }

    public final void draw(Canvas canvas) {
        04k r0;
        int i;
        Drawable drawable;
        int A032 = AnonymousClass0fD.A03(-1218945545);
        super.draw(canvas);
        A01();
        if (this.A08 == null && (drawable = this.A0K) != null && this.A01 > 0) {
            drawable.mutate().setAlpha(this.A01);
            this.A0K.draw(canvas);
        }
        if (this.A0A && this.A0M) {
            if (this.A08 != null && this.A0K != null && this.A01 > 0 && this.A02 == 1) {
                C14129TqO tqO = this.A0S;
                if (tqO.A0E < tqO.A0M) {
                    int save = canvas.save();
                    canvas.clipRect(this.A0K.getBounds(), Region.Op.DIFFERENCE);
                    tqO.A0E(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.A0S.A0E(canvas);
        }
        if (this.A05 != null && this.A01 > 0 && (r0 = this.A09) != null && (i = r0.A00.A03().A03) > 0) {
            this.A05.setBounds(0, -this.A00, getWidth(), i - this.A00);
            this.A05.mutate().setAlpha(this.A01);
            this.A05.draw(canvas);
        }
        AnonymousClass0fD.A0A(2050445218, A032);
    }

    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A05;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0K;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        C14129TqO tqO = this.A0S;
        if (tqO != null) {
            tqO.A0l = drawableState;
            ColorStateList colorStateList2 = tqO.A0X;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = tqO.A0Z) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                tqO.A0G(false);
                z = true;
            }
            z2 |= z;
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.U4L, android.widget.FrameLayout$LayoutParams] */
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? layoutParams = new FrameLayout.LayoutParams(context, attributeSet);
        layoutParams.A01 = 0;
        layoutParams.A00 = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C297865sU.A0C);
        layoutParams.A01 = obtainStyledAttributes.getInt(0, 0);
        layoutParams.A00 = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1659027699);
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A02 == 1) {
                appBarLayout.A0B = false;
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            C324246ys r0 = this.A0L;
            if (r0 == null) {
                r0 = new C14130TqP(this);
                this.A0L = r0;
            }
            appBarLayout.A02(r0);
            requestApplyInsets();
        }
        AnonymousClass0fD.A0D(-1811480091, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-530617280);
        ViewParent parent = getParent();
        C324246ys r1 = this.A0L;
        if (r1 != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).A03(r1);
        }
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(599195892, A062);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(631055892);
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A0K;
        if (drawable != null) {
            ViewGroup viewGroup = this.A08;
            if (this.A02 == 1 && viewGroup != null && this.A0A) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
        AnonymousClass0fD.A0D(1110234369, A062);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (isInEditMode() != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScrimsShown(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.isLaidOut()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r4.isInEditMode()
            r1 = 1
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            boolean r0 = r4.A0B
            if (r0 == r5) goto L_0x004f
            r3 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x005f
            if (r5 != 0) goto L_0x0019
            r3 = 0
        L_0x0019:
            r4.A01()
            android.animation.ValueAnimator r0 = r4.A04
            if (r0 != 0) goto L_0x0053
            android.animation.ValueAnimator r2 = new android.animation.ValueAnimator
            r2.<init>()
            r4.A04 = r2
            long r0 = r4.A03
            r2.setDuration(r0)
            android.animation.ValueAnimator r1 = r4.A04
            int r0 = r4.A01
            if (r3 <= r0) goto L_0x0050
            android.animation.TimeInterpolator r0 = X.AnonymousClass6Y2.A01
        L_0x0034:
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r4.A04
            r0 = 2
            X.W4Q.A00(r1, r4, r0)
        L_0x003d:
            android.animation.ValueAnimator r1 = r4.A04
            int r0 = r4.A01
            int[] r0 = new int[]{r0, r3}
            r1.setIntValues(r0)
            android.animation.ValueAnimator r0 = r4.A04
            r0.start()
        L_0x004d:
            r4.A0B = r5
        L_0x004f:
            return
        L_0x0050:
            android.animation.TimeInterpolator r0 = X.AnonymousClass6Y2.A04
            goto L_0x0034
        L_0x0053:
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x003d
            android.animation.ValueAnimator r0 = r4.A04
            r0.cancel()
            goto L_0x003d
        L_0x005f:
            if (r5 != 0) goto L_0x0062
            r3 = 0
        L_0x0062:
            r4.setScrimAlpha(r3)
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.setScrimsShown(boolean):void");
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1Q = AnonymousClass7TF.A1Q(i);
        Drawable drawable = this.A05;
        if (!(drawable == null || drawable.isVisible() == A1Q)) {
            this.A05.setVisible(A1Q, false);
        }
        Drawable drawable2 = this.A0K;
        if (drawable2 != null && drawable2.isVisible() != A1Q) {
            this.A0K.setVisible(A1Q, false);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0K || drawable == this.A05) {
            return true;
        }
        return false;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.ViewGroup$LayoutParams, X.U4L, android.widget.FrameLayout$LayoutParams] */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.A01 = 0;
        layoutParams2.A00 = 0.5f;
        return layoutParams2;
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.A0S.A0D(colorStateList);
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
