package androidx.appcompat.widget;

import X.002;
import X.03v;
import X.AnonymousClass2Z3;
import X.C13988Tno;
import X.C13989Tnp;
import X.C323656xt;
import X.DbS;
import X.U51;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

public class LinearLayoutCompat extends ViewGroup {
    public float A00;
    public int A01 = -1;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05 = 8388659;
    public int A06;
    public int A07;
    public Drawable A08;
    public boolean A09 = true;
    public boolean A0A;
    public int[] A0B;
    public int[] A0C;
    public int A0D;
    public int A0E;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        int[] iArr = AnonymousClass2Z3.A0D;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        03v.A06(context, obtainStyledAttributes, attributeSet, this, iArr, i, 0);
        int i2 = obtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!obtainStyledAttributes.getBoolean(2, true)) {
            this.A09 = false;
        }
        this.A00 = obtainStyledAttributes.getFloat(4, -1.0f);
        this.A01 = obtainStyledAttributes.getInt(3, -1);
        this.A0A = obtainStyledAttributes.getBoolean(7, false);
        if (!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(5);
        } else {
            drawable = C323656xt.A00(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.A0E = obtainStyledAttributes.getInt(8, 0);
        this.A0D = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    public final boolean A07(int i) {
        int i2;
        if (i == 0) {
            i2 = this.A0E & 1;
        } else if (i == getChildCount()) {
            i2 = this.A0E & 4;
        } else if ((this.A0E & 2) == 0) {
            return false;
        } else {
            int i3 = i - 1;
            while (i3 >= 0) {
                if (getChildAt(i3).getVisibility() == 8) {
                    i3--;
                }
            }
            return false;
        }
        return i2 != 0;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (this instanceof ActionMenuView) {
            return ((ActionMenuView) this).generateLayoutParams(layoutParams);
        }
        if ((layoutParams instanceof U51) || (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public void setWeightSum(float f) {
        this.A00 = Math.max(0.0f, f);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void A05(Canvas canvas, int i) {
        this.A08.setBounds(getPaddingLeft() + this.A0D, i, C13989Tnp.A0G(this) - this.A0D, this.A03 + i);
        this.A08.draw(canvas);
    }

    public final void A06(Canvas canvas, int i) {
        this.A08.setBounds(i, getPaddingTop() + this.A0D, this.A04 + i, C13989Tnp.A0F(this) - this.A0D);
        this.A08.draw(canvas);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof U51;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.U6Q, android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams] */
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (this instanceof ActionMenuView) {
            ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.A04 = false;
            layoutParams.gravity = 16;
            return layoutParams;
        }
        int i = this.A06;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    public int getBaseline() {
        int i;
        if (this.A01 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.A01;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.A02;
                if (this.A06 == 1 && (i = this.A05 & 112) != 48) {
                    if (i == 16) {
                        i3 += (C13989Tnp.A0I(this, getBottom() - getTop()) - this.A07) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.A07;
                    }
                }
                return i3 + DbS.A0D(childAt).topMargin + baseline;
            } else if (this.A01 == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.A01;
    }

    public Drawable getDividerDrawable() {
        return this.A08;
    }

    public int getDividerPadding() {
        return this.A0D;
    }

    public int getDividerWidth() {
        return this.A04;
    }

    public int getGravity() {
        return this.A05;
    }

    public int getOrientation() {
        return this.A06;
    }

    public int getShowDividers() {
        return this.A0E;
    }

    public float getWeightSum() {
        return this.A00;
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int left;
        int bottom;
        if (this.A08 == null) {
            return;
        }
        if (this.A06 == 1) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!(childAt == null || childAt.getVisibility() == 8 || !A07(i4))) {
                    A05(canvas, (childAt.getTop() - DbS.A0D(childAt).topMargin) - this.A03);
                }
            }
            if (A07(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                if (childAt2 == null) {
                    bottom = C13989Tnp.A0F(this) - this.A03;
                } else {
                    bottom = childAt2.getBottom() + DbS.A0D(childAt2).bottomMargin;
                }
                A05(canvas, bottom);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean A1W = C13988Tno.A1W(getLayoutDirection(), 1);
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt3 = getChildAt(i5);
            if (!(childAt3 == null || childAt3.getVisibility() == 8 || !A07(i5))) {
                ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(childAt3);
                if (A1W) {
                    left = childAt3.getRight() + A0D2.rightMargin;
                } else {
                    left = (childAt3.getLeft() - A0D2.leftMargin) - this.A04;
                }
                A06(canvas, left);
            }
        }
        if (A07(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                ViewGroup.MarginLayoutParams A0D3 = DbS.A0D(childAt4);
                if (A1W) {
                    i = childAt4.getLeft();
                    i2 = A0D3.leftMargin;
                    i3 = (i - i2) - this.A04;
                } else {
                    i3 = childAt4.getRight() + A0D3.rightMargin;
                }
            } else if (A1W) {
                i3 = getPaddingLeft();
            } else {
                i = getWidth();
                i2 = getPaddingRight();
                i3 = (i - i2) - this.A04;
            }
            A06(canvas, i3);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        if (this.A06 == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i10 = i3 - i;
            int paddingRight = i10 - getPaddingRight();
            int paddingRight2 = (i10 - paddingLeft2) - getPaddingRight();
            int childCount = getChildCount();
            int i11 = this.A05;
            int i12 = i11 & 112;
            int i13 = i11 & 8388615;
            if (i12 != 16) {
                paddingTop = getPaddingTop();
                if (i12 == 80) {
                    paddingTop = ((paddingTop + i4) - i2) - this.A07;
                }
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.A07) / 2);
            }
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (!(childAt == null || childAt.getVisibility() == 8)) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    int i15 = layoutParams.gravity;
                    if (i15 < 0) {
                        i15 = i13;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i15, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + layoutParams.leftMargin;
                        i9 = i8 - layoutParams.rightMargin;
                    } else if (absoluteGravity != 5) {
                        i9 = layoutParams.leftMargin + paddingLeft2;
                    } else {
                        i8 = paddingRight - measuredWidth;
                        i9 = i8 - layoutParams.rightMargin;
                    }
                    if (A07(i14)) {
                        paddingTop += this.A03;
                    }
                    int i16 = paddingTop + layoutParams.topMargin;
                    childAt.layout(i9, i16, measuredWidth + i9, measuredHeight + i16);
                    paddingTop = i16 + measuredHeight + layoutParams.bottomMargin;
                }
            }
            return;
        }
        boolean A1W = C13988Tno.A1W(getLayoutDirection(), 1);
        int paddingTop2 = getPaddingTop();
        int i17 = i4 - i2;
        int paddingBottom = i17 - getPaddingBottom();
        int paddingBottom2 = (i17 - paddingTop2) - getPaddingBottom();
        int childCount2 = getChildCount();
        int i18 = this.A05;
        int i19 = i18 & 112;
        boolean z2 = this.A09;
        int[] iArr = this.A0B;
        int[] iArr2 = this.A0C;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(8388615 & i18, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = getPaddingLeft();
            if (absoluteGravity2 == 5) {
                paddingLeft = ((paddingLeft + i3) - i) - this.A07;
            }
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.A07) / 2);
        }
        int i20 = 0;
        int i21 = 1;
        if (A1W) {
            i20 = childCount2 - 1;
            i21 = -1;
        }
        for (int i22 = 0; i22 < childCount2; i22++) {
            int i23 = i20 + (i21 * i22);
            View childAt2 = getChildAt(i23);
            if (!(childAt2 == null || childAt2.getVisibility() == 8)) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                if (!z2 || layoutParams2.height == -1) {
                    i5 = -1;
                } else {
                    i5 = childAt2.getBaseline();
                }
                int i24 = layoutParams2.gravity;
                if (i24 < 0) {
                    i24 = i19;
                }
                int i25 = i24 & 112;
                if (i25 == 16) {
                    i6 = ((paddingBottom2 - measuredHeight2) / 2) + paddingTop2 + layoutParams2.topMargin;
                    i7 = layoutParams2.bottomMargin;
                    i6 -= i7;
                } else if (i25 == 48) {
                    i6 = layoutParams2.topMargin + paddingTop2;
                    if (i5 != -1) {
                        i6 += iArr[1] - i5;
                    }
                } else if (i25 != 80) {
                    i6 = paddingTop2;
                } else {
                    i6 = (paddingBottom - measuredHeight2) - layoutParams2.bottomMargin;
                    if (i5 != -1) {
                        i7 = iArr2[2] - (childAt2.getMeasuredHeight() - i5);
                        i6 -= i7;
                    }
                }
                if (A07(i23)) {
                    paddingLeft += this.A04;
                }
                int i26 = layoutParams2.leftMargin + paddingLeft;
                childAt2.layout(i26, i6, measuredWidth2 + i26, measuredHeight2 + i6);
                paddingLeft = i26 + measuredWidth2 + layoutParams2.rightMargin;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f9, code lost:
        if (r11.width == -1) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0205, code lost:
        if (r11.width != r8) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03bc, code lost:
        if (r11.height != -1) goto L_0x03be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x057c, code lost:
        if (r11.height != -1) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x059a, code lost:
        if (r11.height != -1) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        if (r5.width != -1) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r40, int r41) {
        /*
            r39 = this;
            r1 = r39
            int r0 = r1.A06
            r10 = 1
            r35 = r40
            r37 = r41
            if (r0 != r10) goto L_0x02bd
            r0 = 0
            r1.A07 = r0
            int r4 = r1.getChildCount()
            int r22 = android.view.View.MeasureSpec.getMode(r35)
            int r9 = android.view.View.MeasureSpec.getMode(r37)
            int r12 = r1.A01
            boolean r11 = r1.A0A
            r21 = 0
            r20 = 0
            r2 = 0
            r3 = 0
            r10 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r19 = 0
            r16 = 1
            r18 = 0
        L_0x002e:
            r13 = 8
            if (r6 >= r4) goto L_0x0123
            android.view.View r15 = r1.getChildAt(r6)
            if (r15 != 0) goto L_0x003f
            int r0 = r1.A07
            r1.A07 = r0
        L_0x003c:
            int r6 = r6 + 1
            goto L_0x002e
        L_0x003f:
            int r0 = r15.getVisibility()
            if (r0 == r13) goto L_0x003c
            boolean r0 = r1.A07(r6)
            if (r0 == 0) goto L_0x0052
            int r5 = r1.A07
            int r0 = r1.A03
            int r5 = r5 + r0
            r1.A07 = r5
        L_0x0052:
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            float r0 = r5.weight
            float r20 = r20 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r9 != r0) goto L_0x0094
            int r0 = r5.height
            if (r0 != 0) goto L_0x0094
            float r0 = r5.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0094
            int r13 = r1.A07
            int r9 = r5.topMargin
            int r9 = r9 + r13
            int r0 = r5.bottomMargin
            int r9 = r9 + r0
            int r13 = java.lang.Math.max(r13, r9)
            r1.A07 = r13
            r19 = 1
            r9 = 1073741824(0x40000000, float:2.0)
        L_0x007c:
            if (r12 < 0) goto L_0x0084
            int r0 = r6 + 1
            if (r12 != r0) goto L_0x0084
            r1.A02 = r13
        L_0x0084:
            if (r6 >= r12) goto L_0x00db
            float r0 = r5.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x00db
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0094:
            int r0 = r5.height
            if (r0 != 0) goto L_0x00d8
            float r0 = r5.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            r0 = -2
            r5.height = r0
            r13 = 0
        L_0x00a2:
            int r0 = (r20 > r21 ? 1 : (r20 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x00d6
            int r0 = r1.A07
        L_0x00a8:
            r26 = 0
            r23 = r1
            r24 = r15
            r25 = r35
            r27 = r37
            r28 = r0
            r23.measureChildWithMargins(r24, r25, r26, r27, r28)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x00bd
            r5.height = r13
        L_0x00bd:
            int r14 = r15.getMeasuredHeight()
            int r13 = r1.A07
            int r0 = r13 + r14
            int r0 = X.C13988Tno.A0B(r5, r0)
            int r13 = java.lang.Math.max(r13, r0)
            r1.A07 = r13
            if (r11 == 0) goto L_0x007c
            int r10 = java.lang.Math.max(r14, r10)
            goto L_0x007c
        L_0x00d6:
            r0 = 0
            goto L_0x00a8
        L_0x00d8:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00a2
        L_0x00db:
            r13 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r13) goto L_0x0117
            int r13 = r5.width
            r0 = -1
            if (r13 != r0) goto L_0x0117
            r17 = 1
            r18 = 1
        L_0x00ea:
            int r14 = r5.leftMargin
            int r0 = r5.rightMargin
            int r14 = r14 + r0
            int r13 = r15.getMeasuredWidth()
            int r13 = r13 + r14
            int r3 = java.lang.Math.max(r3, r13)
            int r2 = X.C13988Tno.A0A(r15, r2)
            if (r16 == 0) goto L_0x0106
            int r0 = r5.width
            r15 = r0
            r0 = -1
            r16 = 1
            if (r15 == r0) goto L_0x0108
        L_0x0106:
            r16 = 0
        L_0x0108:
            float r0 = r5.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x011a
            if (r17 != 0) goto L_0x0111
            r14 = r13
        L_0x0111:
            int r8 = java.lang.Math.max(r8, r14)
            goto L_0x003c
        L_0x0117:
            r17 = 0
            goto L_0x00ea
        L_0x011a:
            if (r17 != 0) goto L_0x011d
            r14 = r13
        L_0x011d:
            int r7 = java.lang.Math.max(r7, r14)
            goto L_0x003c
        L_0x0123:
            int r0 = r1.A07
            if (r0 <= 0) goto L_0x0134
            boolean r0 = r1.A07(r4)
            if (r0 == 0) goto L_0x0134
            int r5 = r1.A07
            int r0 = r1.A03
            int r5 = r5 + r0
            r1.A07 = r5
        L_0x0134:
            if (r11 == 0) goto L_0x0165
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r0) goto L_0x013c
            if (r9 != 0) goto L_0x0165
        L_0x013c:
            r12 = 0
            r1.A07 = r12
        L_0x013f:
            if (r12 >= r4) goto L_0x0165
            android.view.View r5 = r1.getChildAt(r12)
            if (r5 != 0) goto L_0x014e
            int r0 = r1.A07
        L_0x0149:
            r1.A07 = r0
        L_0x014b:
            int r12 = r12 + 1
            goto L_0x013f
        L_0x014e:
            int r0 = r5.getVisibility()
            if (r0 == r13) goto L_0x014b
            android.view.ViewGroup$MarginLayoutParams r6 = X.DbS.A0D(r5)
            int r5 = r1.A07
            int r0 = r5 + r10
            int r0 = X.C13988Tno.A0B(r6, r0)
            int r0 = java.lang.Math.max(r5, r0)
            goto L_0x0149
        L_0x0165:
            int r5 = r1.A07
            int r0 = X.C13989Tnp.A0H(r1)
            int r5 = r5 + r0
            r1.A07 = r5
            int r0 = r1.getSuggestedMinimumHeight()
            int r5 = java.lang.Math.max(r5, r0)
            r12 = 0
            r0 = r37
            int r5 = android.view.View.resolveSizeAndState(r5, r0, r12)
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r6 = r6 & r5
            int r0 = r1.A07
            int r6 = r6 - r0
            if (r19 != 0) goto L_0x018c
            if (r6 == 0) goto L_0x022a
            int r0 = (r20 > r21 ? 1 : (r20 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x022a
        L_0x018c:
            float r8 = r1.A00
            int r0 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0194
            r20 = r8
        L_0x0194:
            r1.A07 = r12
            r10 = 0
        L_0x0197:
            if (r10 >= r4) goto L_0x025d
            android.view.View r12 = r1.getChildAt(r10)
            int r8 = r12.getVisibility()
            r0 = 8
            if (r8 == r0) goto L_0x021a
            android.view.ViewGroup$LayoutParams r11 = r12.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r11 = (android.widget.LinearLayout.LayoutParams) r11
            float r8 = r11.weight
            int r0 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x01e2
            float r0 = (float) r6
            float r0 = r0 * r8
            float r0 = r0 / r20
            int r13 = (int) r0
            float r20 = r20 - r8
            int r6 = r6 - r13
            int r14 = X.C13989Tnp.A0E(r1)
            int r0 = r11.leftMargin
            int r14 = r14 + r0
            int r0 = r11.rightMargin
            int r14 = r14 + r0
            int r8 = r11.width
            r0 = r35
            int r14 = android.view.ViewGroup.getChildMeasureSpec(r0, r14, r8)
            int r0 = r11.height
            r8 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x0221
            if (r9 != r8) goto L_0x0221
            if (r13 <= 0) goto L_0x0228
        L_0x01d5:
            X.C13988Tno.A11(r12, r13, r8, r14)
            int r0 = r12.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r2 = android.view.View.combineMeasuredStates(r2, r0)
        L_0x01e2:
            int r14 = r11.leftMargin
            int r0 = r11.rightMargin
            int r14 = r14 + r0
            int r13 = r12.getMeasuredWidth()
            int r13 = r13 + r14
            int r3 = java.lang.Math.max(r3, r13)
            r8 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r8) goto L_0x021e
            int r0 = r11.width
            r8 = -1
            if (r0 != r8) goto L_0x021f
        L_0x01fb:
            int r7 = java.lang.Math.max(r7, r14)
            if (r16 == 0) goto L_0x0207
            int r0 = r11.width
            r16 = 1
            if (r0 == r8) goto L_0x0209
        L_0x0207:
            r16 = 0
        L_0x0209:
            int r8 = r1.A07
            int r0 = r12.getMeasuredHeight()
            int r0 = r0 + r8
            int r0 = X.C13988Tno.A0B(r11, r0)
            int r0 = java.lang.Math.max(r8, r0)
            r1.A07 = r0
        L_0x021a:
            int r10 = r10 + 1
            goto L_0x0197
        L_0x021e:
            r8 = -1
        L_0x021f:
            r14 = r13
            goto L_0x01fb
        L_0x0221:
            int r0 = r12.getMeasuredHeight()
            int r13 = r13 + r0
            if (r13 >= 0) goto L_0x01d5
        L_0x0228:
            r13 = 0
            goto L_0x01d5
        L_0x022a:
            int r7 = java.lang.Math.max(r7, r8)
            if (r11 == 0) goto L_0x0266
            r8 = 1073741824(0x40000000, float:2.0)
            if (r9 == r8) goto L_0x0266
            r9 = 0
        L_0x0235:
            if (r9 >= r4) goto L_0x0266
            android.view.View r6 = r1.getChildAt(r9)
            if (r6 == 0) goto L_0x025a
            int r11 = r6.getVisibility()
            if (r11 == r13) goto L_0x025a
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            float r0 = r0.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x025a
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r8)
            X.C13988Tno.A11(r6, r10, r8, r0)
        L_0x025a:
            int r9 = r9 + 1
            goto L_0x0235
        L_0x025d:
            int r6 = r1.A07
            int r0 = X.C13989Tnp.A0H(r1)
            int r6 = r6 + r0
            r1.A07 = r6
        L_0x0266:
            if (r16 != 0) goto L_0x02bb
            r6 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r6) goto L_0x02bb
        L_0x026e:
            int r0 = X.C13989Tnp.A0E(r1)
            int r7 = r7 + r0
            int r0 = r1.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r7, r0)
            r0 = r35
            int r0 = android.view.View.resolveSizeAndState(r3, r0, r2)
            r1.setMeasuredDimension(r0, r5)
            if (r18 == 0) goto L_0x06bf
            int r0 = r1.getMeasuredWidth()
            int r8 = X.C13988Tno.A04(r0)
            r5 = 0
        L_0x028f:
            if (r5 >= r4) goto L_0x06bf
            android.view.View r7 = r1.getChildAt(r5)
            int r2 = r7.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x02b8
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            int r2 = r3.width
            r0 = -1
            if (r2 != r0) goto L_0x02b8
            int r2 = r3.height
            int r0 = r7.getMeasuredHeight()
            r3.height = r0
            r9 = 0
            r6 = r1
            r10 = r37
            r11 = r9
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            r3.height = r2
        L_0x02b8:
            int r5 = r5 + 1
            goto L_0x028f
        L_0x02bb:
            r7 = r3
            goto L_0x026e
        L_0x02bd:
            r5 = 0
            r1.A07 = r5
            int r32 = r1.getChildCount()
            int r31 = android.view.View.MeasureSpec.getMode(r35)
            int r30 = android.view.View.MeasureSpec.getMode(r37)
            int[] r9 = r1.A0B
            r29 = 4
            if (r9 == 0) goto L_0x02d6
            int[] r8 = r1.A0C
            if (r8 != 0) goto L_0x02e0
        L_0x02d6:
            r0 = r29
            int[] r9 = new int[r0]
            r1.A0B = r9
            int[] r8 = new int[r0]
            r1.A0C = r8
        L_0x02e0:
            r28 = 3
            r0 = -1
            r9[r28] = r0
            r27 = 2
            r9[r27] = r0
            r9[r10] = r0
            r9[r5] = r0
            r8[r28] = r0
            r8[r27] = r0
            r8[r10] = r0
            r8[r5] = r0
            boolean r0 = r1.A09
            r26 = r0
            boolean r0 = r1.A0A
            r25 = r0
            r20 = 1073741824(0x40000000, float:2.0)
            r2 = r31
            r0 = r20
            boolean r24 = X.AnonymousClass7TF.A1S(r2, r0)
            r23 = 0
            r22 = 0
            r12 = 0
            r3 = 0
            r7 = 0
            r2 = 0
            r19 = 0
            r18 = 0
            r6 = 0
            r16 = 1
            r21 = 0
        L_0x0318:
            r4 = 8
            r0 = r32
            if (r12 >= r0) goto L_0x043b
            android.view.View r13 = r1.getChildAt(r12)
            if (r13 != 0) goto L_0x032b
            int r0 = r1.A07
            r1.A07 = r0
        L_0x0328:
            int r12 = r12 + 1
            goto L_0x0318
        L_0x032b:
            int r0 = r13.getVisibility()
            if (r0 == r4) goto L_0x0328
            boolean r0 = r1.A07(r12)
            if (r0 == 0) goto L_0x033e
            int r4 = r1.A07
            int r0 = r1.A04
            int r4 = r4 + r0
            r1.A07 = r4
        L_0x033e:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r11 = (android.widget.LinearLayout.LayoutParams) r11
            float r0 = r11.weight
            float r22 = r22 + r0
            r4 = r31
            r0 = r20
            if (r4 != r0) goto L_0x03e6
            int r0 = r11.width
            if (r0 != 0) goto L_0x03e6
            float r0 = r11.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x03e6
            int r14 = r1.A07
            int r4 = r11.leftMargin
            if (r24 == 0) goto L_0x03dc
            int r0 = r11.rightMargin
            int r4 = r4 + r0
            int r14 = r14 + r4
        L_0x0362:
            r1.A07 = r14
            if (r26 == 0) goto L_0x03d7
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r13.measure(r0, r0)
        L_0x036d:
            r4 = r30
            r0 = r20
            if (r4 == r0) goto L_0x03d4
            int r4 = r11.height
            r0 = -1
            if (r4 != r0) goto L_0x03d4
            r17 = 1
            r21 = 1
        L_0x037c:
            int r4 = r11.topMargin
            int r0 = r11.bottomMargin
            int r4 = r4 + r0
            int r14 = r13.getMeasuredHeight()
            int r14 = r14 + r4
            int r6 = X.C13988Tno.A0A(r13, r6)
            if (r26 == 0) goto L_0x03b1
            int r13 = r13.getBaseline()
            r0 = -1
            if (r13 == r0) goto L_0x03b1
            int r0 = r11.gravity
            if (r0 >= 0) goto L_0x03d1
            int r0 = r1.A05
        L_0x0399:
            r0 = r0 & 112(0x70, float:1.57E-43)
            int r0 = r0 >> r29
            r0 = r0 & -2
            int r15 = r0 >> 1
            r0 = r9[r15]
            int r0 = java.lang.Math.max(r0, r13)
            r9[r15] = r0
            r0 = r8[r15]
            int r0 = X.C13988Tno.A07(r14, r13, r0)
            r8[r15] = r0
        L_0x03b1:
            int r7 = java.lang.Math.max(r7, r14)
            if (r16 == 0) goto L_0x03be
            int r13 = r11.height
            r0 = -1
            r16 = 1
            if (r13 == r0) goto L_0x03c0
        L_0x03be:
            r16 = 0
        L_0x03c0:
            float r0 = r11.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0432
            if (r17 != 0) goto L_0x03c9
            r4 = r14
        L_0x03c9:
            r0 = r19
            int r19 = java.lang.Math.max(r0, r4)
            goto L_0x0328
        L_0x03d1:
            int r0 = r11.gravity
            goto L_0x0399
        L_0x03d4:
            r17 = 0
            goto L_0x037c
        L_0x03d7:
            r26 = 0
            r18 = 1
            goto L_0x036d
        L_0x03dc:
            int r4 = r4 + r14
            int r0 = r11.rightMargin
            int r4 = r4 + r0
            int r14 = java.lang.Math.max(r14, r4)
            goto L_0x0362
        L_0x03e6:
            int r0 = r11.width
            if (r0 != 0) goto L_0x042f
            float r0 = r11.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x042f
            r0 = -2
            r11.width = r0
            r14 = 0
        L_0x03f4:
            int r0 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x042d
            int r4 = r1.A07
        L_0x03fa:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r33 = r1
            r34 = r13
            r36 = r4
            r38 = r5
            r33.measureChildWithMargins(r34, r35, r36, r37, r38)
            if (r14 == r0) goto L_0x040b
            r11.width = r14
        L_0x040b:
            int r15 = r13.getMeasuredWidth()
            if (r24 == 0) goto L_0x0424
            int r14 = r1.A07
            int r4 = r11.leftMargin
            int r4 = r4 + r15
            int r0 = r11.rightMargin
            int r4 = r4 + r0
            int r14 = r14 + r4
        L_0x041a:
            r1.A07 = r14
            if (r25 == 0) goto L_0x036d
            int r3 = java.lang.Math.max(r15, r3)
            goto L_0x036d
        L_0x0424:
            int r4 = r1.A07
            int r0 = r4 + r15
            int r14 = X.C13989Tnp.A0K(r11, r0, r4)
            goto L_0x041a
        L_0x042d:
            r4 = 0
            goto L_0x03fa
        L_0x042f:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x03f4
        L_0x0432:
            if (r17 != 0) goto L_0x0435
            r4 = r14
        L_0x0435:
            int r2 = java.lang.Math.max(r2, r4)
            goto L_0x0328
        L_0x043b:
            int r0 = r1.A07
            if (r0 <= 0) goto L_0x044e
            r0 = r32
            boolean r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x044e
            int r4 = r1.A07
            int r0 = r1.A04
            int r4 = r4 + r0
            r1.A07 = r4
        L_0x044e:
            r13 = r9[r10]
            r4 = -1
            if (r13 != r4) goto L_0x045f
            r0 = r9[r5]
            if (r0 != r4) goto L_0x045f
            r0 = r9[r27]
            if (r0 != r4) goto L_0x045f
            r0 = r9[r28]
            if (r0 == r4) goto L_0x048a
        L_0x045f:
            r12 = r9[r28]
            r11 = r9[r5]
            r0 = r9[r27]
            int r0 = java.lang.Math.max(r13, r0)
            int r0 = java.lang.Math.max(r11, r0)
            int r11 = java.lang.Math.max(r12, r0)
            r12 = r8[r28]
            r13 = r8[r5]
            r14 = r8[r10]
            r0 = r8[r27]
            int r0 = java.lang.Math.max(r14, r0)
            int r0 = java.lang.Math.max(r13, r0)
            int r0 = java.lang.Math.max(r12, r0)
            int r11 = r11 + r0
            int r7 = java.lang.Math.max(r7, r11)
        L_0x048a:
            if (r25 == 0) goto L_0x04c7
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r31
            if (r0 == r11) goto L_0x0494
            if (r31 != 0) goto L_0x04c7
        L_0x0494:
            r12 = 0
            r1.A07 = r5
        L_0x0497:
            r0 = r32
            if (r12 >= r0) goto L_0x04c7
            android.view.View r13 = r1.getChildAt(r12)
            if (r13 != 0) goto L_0x04a8
            int r13 = r1.A07
        L_0x04a3:
            r1.A07 = r13
        L_0x04a5:
            int r12 = r12 + 1
            goto L_0x0497
        L_0x04a8:
            int r11 = r13.getVisibility()
            r0 = 8
            if (r11 == r0) goto L_0x04a5
            android.view.ViewGroup$MarginLayoutParams r14 = X.DbS.A0D(r13)
            int r13 = r1.A07
            if (r24 == 0) goto L_0x04c0
            int r11 = r14.leftMargin
            int r11 = r11 + r3
            int r0 = r14.rightMargin
            int r11 = r11 + r0
            int r13 = r13 + r11
            goto L_0x04a3
        L_0x04c0:
            int r0 = r13 + r3
            int r13 = X.C13989Tnp.A0K(r14, r0, r13)
            goto L_0x04a3
        L_0x04c7:
            int r11 = r1.A07
            int r0 = X.C13989Tnp.A0E(r1)
            int r11 = r11 + r0
            r1.A07 = r11
            int r0 = r1.getSuggestedMinimumWidth()
            int r11 = java.lang.Math.max(r11, r0)
            r0 = r35
            int r20 = android.view.View.resolveSizeAndState(r11, r0, r5)
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r20
            int r0 = r1.A07
            int r13 = r13 - r0
            if (r18 != 0) goto L_0x04ee
            if (r13 == 0) goto L_0x05df
            int r0 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x05df
        L_0x04ee:
            float r3 = r1.A00
            int r0 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x04f6
            r22 = r3
        L_0x04f6:
            r9[r28] = r4
            r9[r27] = r4
            r9[r10] = r4
            r9[r5] = r4
            r8[r28] = r4
            r8[r27] = r4
            r8[r10] = r4
            r8[r5] = r4
            r1.A07 = r5
            r7 = -1
            r12 = 0
        L_0x050a:
            r0 = r32
            if (r12 >= r0) goto L_0x061a
            android.view.View r19 = r1.getChildAt(r12)
            if (r19 == 0) goto L_0x05c4
            int r3 = r19.getVisibility()
            r0 = 8
            if (r3 == r0) goto L_0x05c4
            android.view.ViewGroup$LayoutParams r11 = r19.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r11 = (android.widget.LinearLayout.LayoutParams) r11
            float r14 = r11.weight
            int r0 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0562
            float r0 = (float) r13
            float r0 = r0 * r14
            float r0 = r0 / r22
            int r3 = (int) r0
            float r22 = r22 - r14
            int r13 = r13 - r3
            int r0 = X.C13989Tnp.A0H(r1)
            int r0 = X.C13988Tno.A0B(r11, r0)
            int r15 = r11.height
            r14 = r37
            int r18 = android.view.ViewGroup.getChildMeasureSpec(r14, r0, r15)
            int r0 = r11.width
            r17 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x05d5
            r14 = r31
            r0 = r17
            if (r14 != r0) goto L_0x05d5
            if (r3 <= 0) goto L_0x05dc
        L_0x054e:
            r15 = r19
            r14 = r18
            r0 = r17
            X.C13990Tnq.A0u(r15, r3, r0, r14)
            int r3 = r19.getMeasuredState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 & r0
            int r6 = android.view.View.combineMeasuredStates(r6, r3)
        L_0x0562:
            int r3 = r1.A07
            if (r24 == 0) goto L_0x05cb
            int r14 = r19.getMeasuredWidth()
            int r0 = r11.leftMargin
            int r14 = r14 + r0
            int r0 = r11.rightMargin
            int r14 = r14 + r0
            int r3 = r3 + r14
        L_0x0571:
            r1.A07 = r3
            r3 = 1073741824(0x40000000, float:2.0)
            r0 = r30
            if (r0 == r3) goto L_0x057e
            int r0 = r11.height
            r15 = 1
            if (r0 == r4) goto L_0x057f
        L_0x057e:
            r15 = 0
        L_0x057f:
            int r3 = r11.topMargin
            int r0 = r11.bottomMargin
            int r3 = r3 + r0
            int r14 = r19.getMeasuredHeight()
            int r14 = r14 + r3
            int r7 = java.lang.Math.max(r7, r14)
            if (r15 != 0) goto L_0x0590
            r3 = r14
        L_0x0590:
            int r2 = java.lang.Math.max(r2, r3)
            if (r16 == 0) goto L_0x059c
            int r0 = r11.height
            r16 = 1
            if (r0 == r4) goto L_0x059e
        L_0x059c:
            r16 = 0
        L_0x059e:
            if (r26 == 0) goto L_0x05c4
            int r3 = r19.getBaseline()
            if (r3 == r4) goto L_0x05c4
            int r0 = r11.gravity
            if (r0 >= 0) goto L_0x05c8
            int r0 = r1.A05
        L_0x05ac:
            r0 = r0 & 112(0x70, float:1.57E-43)
            int r0 = r0 >> r29
            r0 = r0 & -2
            int r11 = r0 >> 1
            r0 = r9[r11]
            int r0 = java.lang.Math.max(r0, r3)
            r9[r11] = r0
            r0 = r8[r11]
            int r0 = X.C13988Tno.A07(r14, r3, r0)
            r8[r11] = r0
        L_0x05c4:
            int r12 = r12 + 1
            goto L_0x050a
        L_0x05c8:
            int r0 = r11.gravity
            goto L_0x05ac
        L_0x05cb:
            int r0 = r19.getMeasuredWidth()
            int r0 = r0 + r3
            int r3 = X.C13989Tnp.A0K(r11, r0, r3)
            goto L_0x0571
        L_0x05d5:
            int r0 = r19.getMeasuredWidth()
            int r3 = r3 + r0
            if (r3 >= 0) goto L_0x054e
        L_0x05dc:
            r3 = 0
            goto L_0x054e
        L_0x05df:
            r0 = r19
            int r2 = java.lang.Math.max(r2, r0)
            if (r25 == 0) goto L_0x065e
            r9 = 1073741824(0x40000000, float:2.0)
            r0 = r31
            if (r0 == r9) goto L_0x065e
            r10 = 0
        L_0x05ee:
            r0 = r32
            if (r10 >= r0) goto L_0x065e
            android.view.View r11 = r1.getChildAt(r10)
            if (r11 == 0) goto L_0x0617
            int r8 = r11.getVisibility()
            r0 = 8
            if (r8 == r0) goto L_0x0617
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            float r0 = r0.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0617
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r9)
            int r0 = r11.getMeasuredHeight()
            X.C13988Tno.A11(r11, r0, r9, r8)
        L_0x0617:
            int r10 = r10 + 1
            goto L_0x05ee
        L_0x061a:
            int r3 = r1.A07
            int r0 = X.C13989Tnp.A0E(r1)
            int r3 = r3 + r0
            r1.A07 = r3
            r12 = r9[r10]
            if (r12 != r4) goto L_0x0633
            r0 = r9[r5]
            if (r0 != r4) goto L_0x0633
            r0 = r9[r27]
            if (r0 != r4) goto L_0x0633
            r0 = r9[r28]
            if (r0 == r4) goto L_0x065e
        L_0x0633:
            r11 = r9[r28]
            r3 = r9[r5]
            r0 = r9[r27]
            int r0 = java.lang.Math.max(r12, r0)
            int r0 = java.lang.Math.max(r3, r0)
            int r12 = java.lang.Math.max(r11, r0)
            r11 = r8[r28]
            r9 = r8[r5]
            r3 = r8[r10]
            r0 = r8[r27]
            int r0 = java.lang.Math.max(r3, r0)
            int r0 = java.lang.Math.max(r9, r0)
            int r0 = java.lang.Math.max(r11, r0)
            int r12 = r12 + r0
            int r7 = java.lang.Math.max(r7, r12)
        L_0x065e:
            if (r16 != 0) goto L_0x06bd
            r3 = 1073741824(0x40000000, float:2.0)
            r0 = r30
            if (r0 == r3) goto L_0x06bd
        L_0x0666:
            int r0 = X.C13989Tnp.A0H(r1)
            int r2 = r2 + r0
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r2, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r6
            r20 = r20 | r0
            int r2 = r6 << 16
            r0 = r37
            int r2 = android.view.View.resolveSizeAndState(r3, r0, r2)
            r0 = r20
            r1.setMeasuredDimension(r0, r2)
            if (r21 == 0) goto L_0x06bf
            int r0 = r1.getMeasuredHeight()
            int r11 = X.C13988Tno.A04(r0)
            r6 = 0
        L_0x0690:
            r0 = r32
            if (r6 >= r0) goto L_0x06bf
            android.view.View r8 = r1.getChildAt(r6)
            int r2 = r8.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x06ba
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            int r0 = r3.height
            if (r0 != r4) goto L_0x06ba
            int r2 = r3.width
            int r0 = r8.getMeasuredWidth()
            r3.width = r0
            r7 = r1
            r9 = r35
            r10 = r5
            r12 = r5
            r7.measureChildWithMargins(r8, r9, r10, r11, r12)
            r3.width = r2
        L_0x06ba:
            int r6 = r6 + 1
            goto L_0x0690
        L_0x06bd:
            r2 = r7
            goto L_0x0666
        L_0x06bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.A09 = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException(002.A0c("base aligned child index out of range (0, ", ")", getChildCount()));
        }
        this.A01 = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.A08) {
            this.A08 = drawable;
            boolean z = false;
            if (drawable != null) {
                this.A04 = drawable.getIntrinsicWidth();
                this.A03 = drawable.getIntrinsicHeight();
            } else {
                this.A04 = 0;
                this.A03 = 0;
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.A0D = i;
    }

    public void setGravity(int i) {
        if (this.A05 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A05 = i;
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.A0A = z;
    }

    public void setOrientation(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.A0E) {
            requestLayout();
        }
        this.A0E = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.A05;
        if ((i3 & 112) != i2) {
            this.A05 = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.A05;
        if ((8388615 & i3) != i2) {
            this.A05 = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        boolean z = this instanceof ActionMenuView;
        Context context = getContext();
        if (z) {
            return new LinearLayout.LayoutParams(context, attributeSet);
        }
        return new LinearLayout.LayoutParams(context, attributeSet);
    }
}
