package com.instagram.common.ui.widget.filmstriptimeline;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C17949Vig;
import X.C18899WBr;
import X.C19990WjB;
import X.C355428Py;
import X.C71382cm;
import X.JTT;
import X.LZ5;
import X.WTE;
import X.WTG;
import X.X1I;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ScrollingTimelineView extends FrameLayout {
    public boolean A00;
    public C17949Vig A01;
    public X1I A02;
    public final HorizontalScrollView A03;
    public final LinearLayout A04;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Vig, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.widget.HorizontalScrollView, X.U4t, android.view.View, java.lang.Object, android.view.ViewGroup] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingTimelineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A02 = new WTE();
        this.A01 = new Object();
        Resources resources = getResources();
        int i2 = resources.getDisplayMetrics().widthPixels;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C71382cm.A24);
        0qQ.A07(obtainStyledAttributes);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(2, AnonymousClass7TE.A0C(resources));
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        LinearLayout linearLayout = new LinearLayout(context2);
        this.A04 = linearLayout;
        int i3 = i2 / 2;
        linearLayout.setPadding(i3, 0, i3, 0);
        linearLayout.setClipToPadding(false);
        ? horizontalScrollView = new HorizontalScrollView(context2);
        horizontalScrollView.A02 = new C19990WjB(horizontalScrollView);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setOnTouchListener(new C18899WBr(4, horizontalScrollView, this));
        horizontalScrollView.getViewTreeObserver().addOnScrollChangedListener(new LZ5(this, 1));
        horizontalScrollView.A01 = new WTG(this);
        horizontalScrollView.requestDisallowInterceptTouchEvent(true);
        this.A03 = horizontalScrollView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (dimensionPixelSize > 0) {
            layoutParams.height = dimensionPixelSize;
            layoutParams.gravity = 16;
        }
        addView(horizontalScrollView, layoutParams);
        horizontalScrollView.addView(linearLayout, new ViewGroup.LayoutParams(-2, -1));
        C355428Py r1 = new C355428Py(context2);
        r1.setSeekerWidth(dimensionPixelSize3);
        r1.A03 = dimensionPixelSize2;
        r1.A06 = false;
        r1.A08 = false;
        r1.A07 = false;
        r1.setSeekbarValue(0.5f);
        addView(r1, new ViewGroup.LayoutParams(-2, dimensionPixelSize4 <= 0 ? -1 : dimensionPixelSize4));
    }

    public final void setListener(X1I x1i) {
        0qQ.A0B(x1i, 0);
        this.A02 = x1i;
    }

    public final void setScrollingTimelineState(C17949Vig vig) {
        0qQ.A0B(vig, 0);
        this.A01 = vig;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollingTimelineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollingTimelineView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ ScrollingTimelineView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
