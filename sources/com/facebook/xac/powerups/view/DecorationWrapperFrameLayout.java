package com.facebook.xac.powerups.view;

import X.0qQ;
import X.AnonymousClass000;
import X.C13988Tno;
import X.C13989Tnp;
import X.C66582MXn;
import X.C71382cm;
import X.DbX;
import X.JTT;
import X.SN3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DecorationWrapperFrameLayout extends FrameLayout {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecorationWrapperFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        int[] iArr = C71382cm.A1n;
        0qQ.A08(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        this.A00 = resourceId;
    }

    public final void onMeasure(int i, int i2) {
        View view;
        int i3;
        int i4;
        int i5;
        int childMeasureSpec;
        int childMeasureSpec2;
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                view = null;
                break;
            }
            view = getChildAt(i6);
            if (view.getId() == this.A00) {
                break;
            }
            i6++;
        }
        int i7 = i;
        int i8 = i2;
        if (view == null || (!getMeasureAllChildren() && view.getVisibility() == 8)) {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        } else {
            measureChildWithMargins(view, i7, 0, i8, 0);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            0qQ.A0C(layoutParams, AnonymousClass000.A00(1));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i4 = C13989Tnp.A0K(marginLayoutParams, view.getMeasuredWidth(), 0);
            i3 = Math.max(0, C13988Tno.A0B(marginLayoutParams, view.getMeasuredHeight()));
            i5 = C13988Tno.A0A(view, 0);
        }
        int A0E = i4 + C13989Tnp.A0E(this);
        int max = Math.max(i3 + C13989Tnp.A0H(this), getSuggestedMinimumHeight());
        int max2 = Math.max(A0E, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            max = Math.max(max, foreground.getMinimumHeight());
            max2 = Math.max(max2, foreground.getMinimumWidth());
        }
        setMeasuredDimension(View.resolveSizeAndState(max2, i7, i5), View.resolveSizeAndState(max, i8, i5 << 16));
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            View childAt = getChildAt(i9);
            if (childAt != view) {
                ViewGroup.MarginLayoutParams A0G = DbX.A0G(childAt);
                if (A0G.width == -1) {
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(C13988Tno.A07(C66582MXn.A04(this, getMeasuredWidth()) - A0G.leftMargin, A0G.rightMargin, 0), SN3.MAX_SIGNED_POWER_OF_TWO);
                } else {
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, C13989Tnp.A0E(this) + A0G.leftMargin + A0G.rightMargin, A0G.width);
                }
                if (A0G.height == -1) {
                    childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(C13988Tno.A07(C13989Tnp.A0I(this, getMeasuredHeight()) - A0G.topMargin, A0G.bottomMargin, 0), SN3.MAX_SIGNED_POWER_OF_TWO);
                } else {
                    childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, C13988Tno.A0B(A0G, C13989Tnp.A0H(this)), A0G.height);
                }
                childAt.measure(childMeasureSpec, childMeasureSpec2);
            }
        }
    }

    public final int getMessageBubbleXmlResId() {
        return this.A00;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DecorationWrapperFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DecorationWrapperFrameLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ DecorationWrapperFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
