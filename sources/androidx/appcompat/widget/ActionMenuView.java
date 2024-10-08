package androidx.appcompat.widget;

import X.AnonymousClass0fD;
import X.AnonymousClass2X5;
import X.C13988Tno;
import X.C13989Tnp;
import X.C18932WDk;
import X.C20821Wzv;
import X.C20868X1u;
import X.C20869X1v;
import X.C20936X5e;
import X.C20938X5g;
import X.C66581MXm;
import X.U69;
import X.U6Q;
import X.WDU;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;

public class ActionMenuView extends LinearLayoutCompat implements C20868X1u, C20869X1v {
    public int A00;
    public int A01;
    public AnonymousClass2X5 A02;
    public C18932WDk A03;
    public WDU A04;
    public C20821Wzv A05;
    public boolean A06;
    public int A07;
    public int A08;
    public Context A09;
    public C20936X5e A0A;
    public boolean A0B;

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final boolean A09(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C20938X5g)) {
            z = false | ((C20938X5g) childAt).Cqt();
        }
        if (i <= 0 || !(childAt2 instanceof C20938X5g)) {
            return z;
        }
        return z | ((C20938X5g) childAt2).Cqu();
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.U6Q, android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams] */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.A04 = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.U6Q, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.U6Q, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 <= 0) goto L_0x0015;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A08 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.U6Q generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0020
            boolean r0 = r3 instanceof X.U6Q
            if (r0 == 0) goto L_0x001a
            X.U6Q r3 = (X.U6Q) r3
            X.U6Q r1 = new X.U6Q
            r1.<init>(r3)
            boolean r0 = r3.A04
            r1.A04 = r0
        L_0x0011:
            int r0 = r1.gravity
            if (r0 > 0) goto L_0x0019
        L_0x0015:
            r0 = 16
            r1.gravity = r0
        L_0x0019:
            return r1
        L_0x001a:
            X.U6Q r1 = new X.U6Q
            r1.<init>(r3)
            goto L_0x0011
        L_0x0020:
            r0 = -2
            X.U6Q r1 = new X.U6Q
            r1.<init>(r0, r0)
            r0 = 0
            r1.A04 = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams):X.U6Q");
    }

    public final void CN4(C18932WDk wDk) {
        this.A03 = wDk;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.WDm, android.view.MenuItem] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CNz(X.C18934WDm r4) {
        /*
            r3 = this;
            X.WDk r2 = r3.A03
            r1 = 0
            r0 = 0
            boolean r0 = r2.A0I(r4, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.CNz(X.WDm):boolean");
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof U6Q;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.X5e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.X5e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.X5e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.Menu getMenu() {
        /*
            r4 = this;
            X.WDk r0 = r4.A03
            if (r0 != 0) goto L_0x003c
            android.content.Context r3 = r4.getContext()
            X.WDk r1 = new X.WDk
            r1.<init>(r3)
            r4.A03 = r1
            X.WDL r0 = new X.WDL
            r0.<init>(r4)
            r1.A03 = r0
            X.WDU r2 = new X.WDU
            r2.<init>(r3)
            r4.A04 = r2
            r0 = 1
            r2.A0G = r0
            r2.A0H = r0
            X.X5e r0 = r4.A0A
            if (r0 != 0) goto L_0x002b
            X.WDN r0 = new X.WDN
            r0.<init>()
        L_0x002b:
            r2.A07 = r0
            X.WDk r1 = r4.A03
            android.content.Context r0 = r4.A09
            r1.A07(r0, r2)
            X.WDU r0 = r4.A04
            r0.A08 = r4
            X.WDk r0 = r0.A06
            r4.A03 = r0
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.getMenu():android.view.Menu");
    }

    public int getPopupTheme() {
        return this.A08;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int A0G;
        int i6;
        if (!this.A0B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int i8 = this.A04;
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean A1V = C66581MXm.A1V(getLayoutDirection());
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                U6Q u6q = (U6Q) childAt.getLayoutParams();
                if (u6q.A04) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (A09(i12)) {
                        measuredWidth += i8;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (A1V) {
                        i6 = getPaddingLeft() + u6q.leftMargin;
                        A0G = i6 + measuredWidth;
                    } else {
                        A0G = C13989Tnp.A0G(this) - u6q.rightMargin;
                        i6 = A0G - measuredWidth;
                    }
                    int i13 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i13, A0G, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + u6q.leftMargin) + u6q.rightMargin;
                    A09(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View A0G2 = C13988Tno.A0G(this);
            int measuredWidth2 = A0G2.getMeasuredWidth();
            int measuredHeight2 = A0G2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i7 - (measuredHeight2 / 2);
            A0G2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (A1V) {
            int A0G3 = C13989Tnp.A0G(this);
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt2 = getChildAt(i17);
                U6Q u6q2 = (U6Q) childAt2.getLayoutParams();
                if (childAt2.getVisibility() != 8 && !u6q2.A04) {
                    int i18 = A0G3 - u6q2.rightMargin;
                    int measuredWidth3 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    int i19 = i7 - (measuredHeight3 / 2);
                    childAt2.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    A0G3 = i18 - ((measuredWidth3 + u6q2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt3 = getChildAt(i20);
            U6Q u6q3 = (U6Q) childAt3.getLayoutParams();
            if (childAt3.getVisibility() != 8 && !u6q3.A04) {
                int i21 = paddingLeft + u6q3.leftMargin;
                int measuredWidth4 = childAt3.getMeasuredWidth();
                int measuredHeight4 = childAt3.getMeasuredHeight();
                int i22 = i7 - (measuredHeight4 / 2);
                childAt3.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + u6q3.rightMargin + max;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d2, code lost:
        if (r9 != 1) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (X.C13990Tnq.A1a(((X.AnonymousClass3Tj) r13).getText()) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e2, code lost:
        if (X.C13990Tnq.A1a(r0.getText()) == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0150, code lost:
        if (r9 != 2) goto L_0x0152;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r32, int r33) {
        /*
            r31 = this;
            r3 = r31
            boolean r2 = r3.A0B
            r4 = r32
            int r1 = android.view.View.MeasureSpec.getMode(r4)
            r6 = 1
            r8 = 0
            r30 = 1073741824(0x40000000, float:2.0)
            r0 = r30
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            r3.A0B = r0
            if (r2 == r0) goto L_0x001a
            r3.A07 = r8
        L_0x001a:
            int r2 = android.view.View.MeasureSpec.getSize(r4)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x002f
            X.WDk r1 = r3.A03
            if (r1 == 0) goto L_0x002f
            int r0 = r3.A07
            if (r2 == r0) goto L_0x002f
            r3.A07 = r2
            r1.A0D(r6)
        L_0x002f:
            int r2 = r3.getChildCount()
            boolean r0 = r3.A0B
            r5 = r33
            if (r0 == 0) goto L_0x02aa
            if (r2 <= 0) goto L_0x02bc
            int r29 = android.view.View.MeasureSpec.getMode(r5)
            int r2 = android.view.View.MeasureSpec.getSize(r4)
            int r28 = android.view.View.MeasureSpec.getSize(r5)
            int r4 = X.C13989Tnp.A0E(r3)
            int r22 = X.C13989Tnp.A0H(r3)
            r1 = -2
            r0 = r22
            int r27 = android.view.ViewGroup.getChildMeasureSpec(r5, r0, r1)
            int r2 = r2 - r4
            int r5 = r3.A01
            int r7 = r2 / r5
            int r0 = r2 % r5
            if (r7 != 0) goto L_0x0063
            r3.setMeasuredDimension(r2, r8)
            return
        L_0x0063:
            int r0 = r0 / r7
            int r5 = r5 + r0
            int r4 = r3.getChildCount()
            r26 = 0
            r10 = 0
            r25 = 0
            r9 = 0
            r24 = 0
            r21 = 0
            r19 = 0
        L_0x0075:
            if (r10 >= r4) goto L_0x014b
            android.view.View r13 = r3.getChildAt(r10)
            int r1 = r13.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x013e
            boolean r1 = r13 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r9 = r9 + 1
            if (r1 == 0) goto L_0x008e
            int r0 = r3.A00
            r13.setPadding(r0, r8, r0, r8)
        L_0x008e:
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            X.U6Q r12 = (X.U6Q) r12
            r12.A03 = r8
            r12.A01 = r8
            r12.A00 = r8
            r12.A02 = r8
            r12.leftMargin = r8
            r12.rightMargin = r8
            if (r1 == 0) goto L_0x00b0
            r0 = r13
            X.3Tj r0 = (X.AnonymousClass3Tj) r0
            java.lang.CharSequence r0 = r0.getText()
            boolean r1 = X.C13990Tnq.A1a(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            r12.A05 = r0
            boolean r0 = r12.A04
            r15 = r7
            if (r0 == 0) goto L_0x00b9
            r15 = 1
        L_0x00b9:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            X.U6Q r14 = (X.U6Q) r14
            int r1 = android.view.View.MeasureSpec.getSize(r27)
            int r1 = r1 - r22
            int r0 = android.view.View.MeasureSpec.getMode(r27)
            int r18 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            boolean r0 = r13 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r0 == 0) goto L_0x0149
            r0 = r13
            X.3Tj r0 = (X.AnonymousClass3Tj) r0
        L_0x00d4:
            r17 = 1
            if (r0 == 0) goto L_0x00e4
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = X.C13990Tnq.A1a(r0)
            r16 = 1
            if (r0 != 0) goto L_0x00e6
        L_0x00e4:
            r16 = 0
        L_0x00e6:
            r11 = 2
            if (r15 <= 0) goto L_0x0147
            if (r16 == 0) goto L_0x00ed
            if (r15 < r11) goto L_0x0147
        L_0x00ed:
            int r15 = r15 * r5
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r0
            r0 = r18
            X.C13990Tnq.A0u(r13, r15, r1, r0)
            int r1 = r13.getMeasuredWidth()
            int r0 = r1 / r5
            int r1 = r1 % r5
            if (r1 == 0) goto L_0x0101
            int r0 = r0 + 1
        L_0x0101:
            if (r16 == 0) goto L_0x0145
            if (r0 >= r11) goto L_0x0145
        L_0x0105:
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x0142
            if (r16 == 0) goto L_0x0142
        L_0x010b:
            r0 = r17
            r14.A02 = r0
            r14.A00 = r11
            int r14 = r5 * r11
            r1 = r18
            r0 = r30
            X.C13990Tnq.A0u(r13, r14, r0, r1)
            r0 = r24
            int r24 = java.lang.Math.max(r0, r11)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0126
            int r21 = r21 + 1
        L_0x0126:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x012c
            r25 = 1
        L_0x012c:
            int r7 = r7 - r11
            int r1 = r13.getMeasuredHeight()
            r0 = r26
            int r26 = java.lang.Math.max(r0, r1)
            if (r11 != r6) goto L_0x013e
            int r0 = r6 << r10
            long r0 = (long) r0
            long r19 = r19 | r0
        L_0x013e:
            int r10 = r10 + 1
            goto L_0x0075
        L_0x0142:
            r17 = 0
            goto L_0x010b
        L_0x0145:
            r11 = r0
            goto L_0x0105
        L_0x0147:
            r11 = 0
            goto L_0x0105
        L_0x0149:
            r0 = 0
            goto L_0x00d4
        L_0x014b:
            r0 = 2
            if (r25 == 0) goto L_0x0152
            r23 = 1
            if (r9 == r0) goto L_0x0154
        L_0x0152:
            r23 = 0
        L_0x0154:
            r15 = 0
            if (r21 <= 0) goto L_0x01cf
        L_0x0157:
            if (r7 <= 0) goto L_0x01cf
            r13 = 0
            r12 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r21 = 0
        L_0x0160:
            if (r12 >= r4) goto L_0x018a
            android.view.View r0 = r3.getChildAt(r12)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.U6Q r0 = (X.U6Q) r0
            boolean r10 = r0.A02
            if (r10 == 0) goto L_0x017b
            int r10 = r0.A00
            if (r10 >= r1) goto L_0x017e
            int r1 = r0.A00
            r21 = 1
            long r21 = r21 << r12
            r13 = 1
        L_0x017b:
            int r12 = r12 + 1
            goto L_0x0160
        L_0x017e:
            r10 = 1
            int r0 = r0.A00
            if (r0 != r1) goto L_0x017b
            long r10 = r10 << r12
            long r21 = r21 | r10
            int r13 = r13 + 1
            goto L_0x017b
        L_0x018a:
            long r19 = r19 | r21
            if (r13 > r7) goto L_0x01cf
            int r12 = r1 + 1
            r11 = 0
        L_0x0191:
            if (r11 >= r4) goto L_0x01cd
            android.view.View r13 = r3.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r10 = r13.getLayoutParams()
            X.U6Q r10 = (X.U6Q) r10
            int r0 = r6 << r11
            long r0 = (long) r0
            long r17 = r21 & r0
            r15 = 0
            int r14 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r14 != 0) goto L_0x01b1
            int r10 = r10.A00
            if (r10 != r12) goto L_0x01ae
            long r19 = r19 | r0
        L_0x01ae:
            int r11 = r11 + 1
            goto L_0x0191
        L_0x01b1:
            if (r23 == 0) goto L_0x01c2
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x01c2
            if (r7 != r6) goto L_0x01c2
            int r1 = r3.A00
            int r0 = r1 + r5
            r23 = 1
            r13.setPadding(r0, r8, r1, r8)
        L_0x01c2:
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            r10.A03 = r6
            int r7 = r7 + -1
            goto L_0x01ae
        L_0x01cd:
            r15 = 1
            goto L_0x0157
        L_0x01cf:
            if (r25 != 0) goto L_0x01d4
            r1 = 1
            if (r9 == r6) goto L_0x01d5
        L_0x01d4:
            r1 = 0
        L_0x01d5:
            if (r7 <= 0) goto L_0x0279
            r12 = 0
            int r0 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0279
            int r9 = r9 - r6
            if (r7 < r9) goto L_0x01e6
            if (r1 != 0) goto L_0x01e6
            r0 = r24
            if (r0 <= r6) goto L_0x0279
        L_0x01e6:
            int r0 = java.lang.Long.bitCount(r19)
            float r9 = (float) r0
            if (r1 != 0) goto L_0x0222
            r0 = 1
            long r10 = r19 & r0
            r14 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0206
            android.view.View r0 = r3.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.U6Q r0 = (X.U6Q) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0206
            float r9 = r9 - r14
        L_0x0206:
            int r8 = r4 + -1
            int r0 = r6 << r8
            long r0 = (long) r0
            long r12 = r19 & r0
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0222
            android.view.View r0 = r3.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.U6Q r0 = (X.U6Q) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0222
            float r9 = r9 - r14
        L_0x0222:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0277
            int r7 = r7 * r5
            float r0 = (float) r7
            float r0 = r0 / r9
            int r8 = (int) r0
        L_0x022b:
            r7 = 0
        L_0x022c:
            if (r7 >= r4) goto L_0x0279
            int r0 = r6 << r7
            long r0 = (long) r0
            long r11 = r19 & r0
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0257
            android.view.View r0 = r3.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            X.U6Q r9 = (X.U6Q) r9
            boolean r0 = r0 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r0 == 0) goto L_0x025a
            r9.A01 = r8
            r9.A03 = r6
            if (r7 != 0) goto L_0x0256
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x0256
            int r1 = -r8
            r0 = 2
            int r1 = r1 / r0
            r9.leftMargin = r1
        L_0x0256:
            r15 = 1
        L_0x0257:
            int r7 = r7 + 1
            goto L_0x022c
        L_0x025a:
            r1 = 2
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0268
            r9.A01 = r8
            r9.A03 = r6
            int r0 = -r8
            int r0 = r0 / r1
            r9.rightMargin = r0
            goto L_0x0256
        L_0x0268:
            if (r7 == 0) goto L_0x026e
            int r0 = r8 / 2
            r9.leftMargin = r0
        L_0x026e:
            int r0 = r4 + -1
            if (r7 == r0) goto L_0x0257
            int r0 = r8 / 2
            r9.rightMargin = r0
            goto L_0x0257
        L_0x0277:
            r8 = 0
            goto L_0x022b
        L_0x0279:
            if (r15 == 0) goto L_0x029c
            r8 = 0
        L_0x027c:
            if (r8 >= r4) goto L_0x029c
            android.view.View r7 = r3.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            X.U6Q r1 = (X.U6Q) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0299
            int r6 = r1.A00
            int r6 = r6 * r5
            int r0 = r1.A01
            int r6 = r6 + r0
            r1 = r27
            r0 = r30
            X.C13990Tnq.A0u(r7, r6, r0, r1)
        L_0x0299:
            int r8 = r8 + 1
            goto L_0x027c
        L_0x029c:
            r1 = r29
            r0 = r30
            if (r1 == r0) goto L_0x02a4
            r28 = r26
        L_0x02a4:
            r0 = r28
            r3.setMeasuredDimension(r2, r0)
            return
        L_0x02aa:
            r1 = 0
        L_0x02ab:
            if (r1 >= r2) goto L_0x02bc
            android.view.View r0 = r3.getChildAt(r1)
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbS.A0D(r0)
            r0.rightMargin = r8
            r0.leftMargin = r8
            int r1 = r1 + 1
            goto L_0x02ab
        L_0x02bc:
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.A04.A0E = z;
    }

    public void setMenuCallbacks(C20936X5e x5e, AnonymousClass2X5 r2) {
        this.A0A = x5e;
        this.A02 = r2;
    }

    public void setOnMenuItemClickListener(C20821Wzv wzv) {
        this.A05 = wzv;
    }

    public void setOverflowReserved(boolean z) {
        this.A06 = z;
    }

    public void setPopupTheme(int i) {
        Context contextThemeWrapper;
        if (this.A08 != i) {
            this.A08 = i;
            if (i == 0) {
                contextThemeWrapper = getContext();
            } else {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
            this.A09 = contextThemeWrapper;
        }
    }

    public void setPresenter(WDU wdu) {
        this.A04 = wdu;
        wdu.A08 = this;
        this.A03 = wdu.A06;
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        WDU wdu = this.A04;
        U69 u69 = wdu.A0C;
        if (u69 != null) {
            return u69.getDrawable();
        }
        if (wdu.A0F) {
            return wdu.A03;
        }
        return null;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WDU wdu = this.A04;
        if (wdu != null) {
            wdu.FKm(false);
            if (this.A04.A03()) {
                this.A04.A02();
                this.A04.A04();
            }
        }
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-1251837996);
        super.onDetachedFromWindow();
        WDU wdu = this.A04;
        if (wdu != null) {
            wdu.A01();
        }
        AnonymousClass0fD.A0D(-1776569546, A062);
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        WDU wdu = this.A04;
        U69 u69 = wdu.A0C;
        if (u69 != null) {
            u69.setImageDrawable(drawable);
            return;
        }
        wdu.A0F = true;
        wdu.A03 = drawable;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A09 = false;
        float A032 = C13989Tnp.A03(context);
        this.A01 = (int) (56.0f * A032);
        this.A00 = (int) (A032 * 4.0f);
        this.A09 = context;
        this.A08 = 0;
    }
}
