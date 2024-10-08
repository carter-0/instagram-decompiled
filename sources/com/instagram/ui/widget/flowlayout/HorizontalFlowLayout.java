package com.instagram.ui.widget.flowlayout;

import X.00k;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66582MXn;
import X.Dbb;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class HorizontalFlowLayout extends ViewGroup {
    public int A00 = -1;
    public final Map A01 = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        0qQ.A0B(layoutParams, 0);
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        0qQ.A0B(attributeSet, 0);
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A00(this, i3 - i, true);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = i;
        int A04 = C66582MXn.A04(this, View.MeasureSpec.getSize(i));
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            int i5 = i2;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i3, 0, i5, 0);
            }
            i4++;
        }
        if (View.MeasureSpec.getMode(i) == 0) {
            A04 = -1;
        }
        int[] A002 = A00(this, A04, false);
        setMeasuredDimension(View.resolveSize(A002[0], i), View.resolveSize(A002[1], i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] A00(com.instagram.ui.widget.flowlayout.HorizontalFlowLayout r19, int r20, boolean r21) {
        /*
            r13 = r19
            android.content.Context r0 = r13.getContext()
            boolean r19 = X.0mk.A02(r0)
            int r18 = r13.getPaddingStart()
            int r12 = r13.getPaddingEnd()
            r11 = r18
            if (r19 == 0) goto L_0x0018
            int r11 = r20 - r18
        L_0x0018:
            int r10 = r13.getPaddingTop()
            java.util.Map r15 = r13.A01
            r15.clear()
            int r14 = r13.getChildCount()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 0
            r8 = 0
            r7 = 1
        L_0x002a:
            if (r9 >= r14) goto L_0x006a
            android.view.View r6 = r13.getChildAt(r9)
            int r2 = r6.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x00bc
            android.view.ViewGroup$MarginLayoutParams r2 = X.DbX.A0G(r6)
            int r16 = r2.getMarginStart()
            int r3 = r2.getMarginEnd()
            int r0 = r6.getMeasuredWidth()
            int r17 = r16 + r0
            int r17 = r17 + r3
            int r5 = r2.topMargin
            int r0 = r6.getMeasuredHeight()
            int r5 = r5 + r0
            int r0 = r2.bottomMargin
            int r5 = r5 + r0
            if (r19 != 0) goto L_0x008a
            int r3 = r11 + r17
            int r0 = r18 + r20
            if (r3 <= r0) goto L_0x0064
            r11 = r18
        L_0x0060:
            int r10 = r10 + r8
            int r7 = r7 + 1
            r8 = 0
        L_0x0064:
            int r0 = r13.A00
            if (r0 <= 0) goto L_0x0091
            if (r7 <= r0) goto L_0x0091
        L_0x006a:
            int r0 = r13.getPaddingLeft()
            int r2 = java.lang.Math.max(r0, r1)
            int r0 = r13.getPaddingRight()
            int r2 = r2 + r0
            int r0 = r13.getPaddingTop()
            int r10 = r10 + r8
            int r1 = java.lang.Math.max(r0, r10)
            int r0 = r13.getPaddingBottom()
            int r1 = r1 + r0
            int[] r0 = new int[]{r2, r1}
            return r0
        L_0x008a:
            int r0 = r11 - r17
            if (r0 >= r12) goto L_0x0064
            int r11 = r12 + r20
            goto L_0x0060
        L_0x0091:
            int r0 = r7 + -1
            X.C66580MXl.A1T(r6, r15, r0)
            if (r21 == 0) goto L_0x00b0
            if (r19 != 0) goto L_0x00c3
            int r0 = r16 + r11
            int r4 = r2.topMargin
            int r4 = r4 + r10
            int r3 = r6.getMeasuredWidth()
            int r3 = r3 + r0
            int r2 = r2.topMargin
            int r2 = r2 + r10
            int r16 = r6.getMeasuredHeight()
            int r2 = r2 + r16
        L_0x00ad:
            r6.layout(r0, r4, r3, r2)
        L_0x00b0:
            int r8 = java.lang.Math.max(r8, r5)
            if (r19 != 0) goto L_0x00c0
            int r11 = r11 + r17
        L_0x00b8:
            int r1 = java.lang.Math.max(r1, r11)
        L_0x00bc:
            int r9 = r9 + 1
            goto L_0x002a
        L_0x00c0:
            int r11 = r11 - r17
            goto L_0x00b8
        L_0x00c3:
            int r0 = r6.getMeasuredWidth()
            int r0 = r11 - r0
            int r0 = r0 - r16
            int r4 = r2.topMargin
            int r4 = r4 + r10
            int r3 = r11 - r16
            int r2 = r6.getMeasuredHeight()
            int r2 = r2 + r4
            goto L_0x00ad
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.flowlayout.HorizontalFlowLayout.A00(com.instagram.ui.widget.flowlayout.HorizontalFlowLayout, int, boolean):int[]");
    }

    public final int getMaxRows() {
        return this.A00;
    }

    public final void setMaxRows(int i) {
        this.A00 = i;
    }

    public final List A01(int i, int i2) {
        A00(this, getWidth(), false);
        Map map = this.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            int A08 = C66582MXn.A08(A1J);
            if (i <= A08 && A08 <= i2) {
                Dbb.A1V(A1J, linkedHashMap);
            }
        }
        return 00k.A0a(linkedHashMap.keySet());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        0qQ.A0B(layoutParams, 0);
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalFlowLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }
}
