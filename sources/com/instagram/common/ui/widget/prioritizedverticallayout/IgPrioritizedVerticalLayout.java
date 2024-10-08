package com.instagram.common.ui.widget.prioritizedverticallayout;

import X.0qQ;
import X.AnonymousClass909;
import X.AnonymousClass972;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgPrioritizedVerticalLayout extends ViewGroup {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgPrioritizedVerticalLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.909, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.A00 = 1;
        return marginLayoutParams;
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = AnonymousClass972.MUTABLE_FLAG_MASK;
        do {
            int childCount = getChildCount();
            i3 = Integer.MAX_VALUE;
            int i10 = 0;
            while (true) {
                i4 = i;
                i5 = i2;
                if (i10 < childCount) {
                    View childAt = getChildAt(i10);
                    if (childAt.getVisibility() != 8) {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        0qQ.A0C(layoutParams, "null cannot be cast to non-null type com.instagram.common.ui.widget.prioritizedverticallayout.IgPrioritizedVerticalLayout.LayoutParams");
                        AnonymousClass909 r8 = (AnonymousClass909) layoutParams;
                        if (r8.A00 == i9) {
                            measureChildWithMargins(childAt, i4, 0, i5, i7);
                            i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
                            i6 = Math.max(i6, childAt.getMeasuredWidth() + r8.leftMargin + r8.rightMargin);
                            i7 += childAt.getMeasuredHeight() + r8.topMargin + r8.bottomMargin;
                        } else if (r8.A00 > i9) {
                            i3 = Math.min(i3, r8.A00);
                        }
                    }
                    i10++;
                } else {
                    i9 = i3;
                }
            }
        } while (i3 < Integer.MAX_VALUE);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, i8), View.resolveSizeAndState(Math.max(i7 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, 0));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.909, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        0qQ.A07(context);
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.A00 = 1;
        int[] iArr = C71382cm.A1C;
        0qQ.A08(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        marginLayoutParams.A00 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        return marginLayoutParams;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                0qQ.A0C(layoutParams, "null cannot be cast to non-null type com.instagram.common.ui.widget.prioritizedverticallayout.IgPrioritizedVerticalLayout.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int paddingLeft = getPaddingLeft() + ((width - ((marginLayoutParams.leftMargin + childAt.getMeasuredWidth()) + marginLayoutParams.rightMargin)) / 2) + marginLayoutParams.leftMargin;
                int i6 = paddingTop + marginLayoutParams.topMargin;
                int measuredHeight = childAt.getMeasuredHeight();
                childAt.layout(paddingLeft, i6, childAt.getMeasuredWidth() + paddingLeft, i6 + measuredHeight);
                paddingTop = i6 + measuredHeight + marginLayoutParams.bottomMargin;
            }
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass909;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgPrioritizedVerticalLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.909, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        0qQ.A0B(layoutParams, 0);
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.A00 = 1;
        return marginLayoutParams;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgPrioritizedVerticalLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgPrioritizedVerticalLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
