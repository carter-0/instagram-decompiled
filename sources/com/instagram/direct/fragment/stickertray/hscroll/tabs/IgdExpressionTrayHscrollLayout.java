package com.instagram.direct.fragment.stickertray.hscroll.tabs;

import X.0qQ;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C60062Jek;
import X.C62444Kfu;
import X.C63235Ktg;
import X.C71382cm;
import X.DbY;
import X.JTT;
import X.JTU;
import X.KHK;
import X.LC3;
import X.LYE;
import X.LYG;
import X.SN3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdExpressionTrayHscrollLayout extends HorizontalScrollView {
    public C60062Jek A00;
    public C62444Kfu A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdExpressionTrayHscrollLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.widget.LinearLayout, X.Jek, android.view.View] */
    private final void A00(Context context) {
        ? linearLayout = new LinearLayout(context, (AttributeSet) null, 0);
        linearLayout.A00 = -1;
        linearLayout.setOrientation(0);
        this.A00 = linearLayout;
        super.addView(linearLayout, 0, new FrameLayout.LayoutParams(-1, -2));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setWillNotDraw(false);
    }

    public final void A01(View.OnClickListener onClickListener, AnonymousClass0iw r5, LC3 lc3) {
        0qQ.A0B(lc3, 0);
        KHK khk = new KHK(AnonymousClass7TE.A0S(this), r5, lc3);
        addView(khk);
        khk.setSelected(false);
        khk.setOnClickListener(LYG.A01(this, onClickListener, 69));
    }

    private final void setTabOnClickListener(View view) {
        view.setOnClickListener(new LYE((Object) this, 8));
    }

    public final void addView(View view) {
        if (view instanceof KHK) {
            C63235Ktg.A00((KHK) view, this.A01);
            this.A00.addView(view);
            setTabOnClickListener(view);
            this.A00.A00();
            return;
        }
        throw AnonymousClass7TE.A0w("IgdExpressionTrayHscrollLayout supports children only of IgdExpressionTrayHscrollTabView type.");
    }

    public final void setSelectedIndex(int i) {
        if (i < this.A00.getChildCount()) {
            View childAt = this.A00.getChildAt(i);
            if (childAt == null || !childAt.isSelected()) {
                this.A00.setSelectedIndex(i);
                Rect A0W = AnonymousClass7TE.A0W();
                this.A00.getGlobalVisibleRect(A0W);
                Rect A0W2 = AnonymousClass7TE.A0W();
                View childAt2 = this.A00.getChildAt(i);
                if (childAt2 != null) {
                    childAt2.getGlobalVisibleRect(A0W2);
                }
                if ((A0W2.left <= A0W.left || A0W2.right >= A0W.right) && i < this.A00.getChildCount()) {
                    smoothScrollBy(this.A00.getChildAt(i).getLeft() - getScrollX(), 0);
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), SN3.MAX_SIGNED_POWER_OF_TWO);
        super.onMeasure(i, makeMeasureSpec);
        JTU.A0n(this, this.A01, C62444Kfu.FIXED, makeMeasureSpec);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A00.invalidate();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.LinearLayout, X.Jek] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdExpressionTrayHscrollLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A01 = C62444Kfu.FIXED;
        ? linearLayout = new LinearLayout(context, (AttributeSet) null, 0);
        linearLayout.A00 = -1;
        linearLayout.setOrientation(0);
        this.A00 = linearLayout;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0Z);
            0qQ.A07(obtainStyledAttributes);
            this.A01 = C62444Kfu.values()[obtainStyledAttributes.getInt(0, 0)];
            obtainStyledAttributes.recycle();
        }
        A00(context);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        DbY.A1S(view, layoutParams);
        if (view instanceof KHK) {
            C63235Ktg.A00((KHK) view, this.A01);
            this.A00.addView(view, i, layoutParams);
            setTabOnClickListener(view);
            this.A00.A00();
            return;
        }
        throw AnonymousClass7TE.A0w("IgdExpressionTrayHscrollLayout supports children only of IgdExpressionTrayHscrollTabView type.");
    }

    public /* synthetic */ IgdExpressionTrayHscrollLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    public final void addView(View view, int i) {
        if (view instanceof KHK) {
            C63235Ktg.A00((KHK) view, this.A01);
            this.A00.addView(view, i);
            setTabOnClickListener(view);
            this.A00.A00();
            return;
        }
        throw AnonymousClass7TE.A0w("IgdExpressionTrayHscrollLayout supports children only of IgdExpressionTrayHscrollTabView type.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdExpressionTrayHscrollLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof KHK) {
            C63235Ktg.A00((KHK) view, this.A01);
            this.A00.addView(view, layoutParams);
            setTabOnClickListener(view);
            this.A00.A00();
            return;
        }
        throw AnonymousClass7TE.A0w("IgdExpressionTrayHscrollLayout supports children only of IgdExpressionTrayHscrollTabView type.");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.LinearLayout, X.Jek] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdExpressionTrayHscrollLayout(Context context, C62444Kfu kfu) {
        super(context);
        AnonymousClass7TG.A1O(context, kfu);
        this.A01 = C62444Kfu.FIXED;
        ? linearLayout = new LinearLayout(context, (AttributeSet) null, 0);
        linearLayout.A00 = -1;
        linearLayout.setOrientation(0);
        this.A00 = linearLayout;
        this.A01 = kfu;
        A00(context);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdExpressionTrayHscrollLayout(Context context, C62444Kfu kfu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? C62444Kfu.FIXED : kfu);
    }
}
