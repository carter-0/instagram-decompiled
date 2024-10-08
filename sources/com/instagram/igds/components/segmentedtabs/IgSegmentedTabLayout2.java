package com.instagram.igds.components.segmentedtabs;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C46720Djx;
import X.C60061Jec;
import X.C60066Jeq;
import X.C60731JqK;
import X.C62445Kfv;
import X.C63285KuU;
import X.C71382cm;
import X.DbY;
import X.JTS;
import X.JTT;
import X.JTU;
import X.LYE;
import X.SN3;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.instagram.android.R;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Deprecated(message = "Please use IgSegmentedTabLayout instead, it now supports ViewPager2")
public final class IgSegmentedTabLayout2 extends C60061Jec {
    public int A00;
    public int A01;
    public int A02;
    public ViewPager2 A03;
    public C60066Jeq A04;
    public C62445Kfv A05;
    public boolean A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgSegmentedTabLayout2(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void setViewPager(ViewPager2 viewPager2) {
        0qQ.A0B(viewPager2, 0);
        this.A03 = viewPager2;
        viewPager2.A05(new C60731JqK(this, 5));
    }

    private final void setTabOnClickListener(View view) {
        view.setOnClickListener(new LYE((Object) this, 70));
        int childCount = getChildCount();
        int i = this.A00;
        if (childCount == i + 1) {
            this.A04.A02(i, this.A06);
        }
    }

    public final void addView(View view) {
        if (view instanceof C46720Djx) {
            C63285KuU.A00(this.A05, (C46720Djx) view);
            C60066Jeq jeq = this.A04;
            jeq.addView(view);
            setTabOnClickListener(view);
            jeq.A01();
            return;
        }
        throw AnonymousClass7TE.A0w("TabContainer supports children only of TabView type.");
    }

    public final int getSelectedIndex() {
        ViewPager2 viewPager2 = this.A03;
        if (viewPager2 != null) {
            return viewPager2.A00;
        }
        return this.A04.A01;
    }

    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size), SN3.MAX_SIGNED_POWER_OF_TWO);
        super.onMeasure(i, makeMeasureSpec);
        JTU.A0n(this, this.A05, C62445Kfv.FIXED, makeMeasureSpec);
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.A04.invalidate();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSegmentedTabLayout2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A05 = C62445Kfv.FIXED;
        this.A04 = new C60066Jeq(context);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1G);
            0qQ.A07(obtainStyledAttributes);
            this.A05 = C62445Kfv.values()[obtainStyledAttributes.getInt(0, 0)];
            obtainStyledAttributes.recycle();
        }
        C60066Jeq jeq = new C60066Jeq(context);
        this.A04 = jeq;
        super.addView(jeq, 0, JTS.A0D());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setWillNotDraw(false);
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        DbY.A1S(view, layoutParams);
        if (view instanceof C46720Djx) {
            C63285KuU.A00(this.A05, (C46720Djx) view);
            C60066Jeq jeq = this.A04;
            jeq.addView(view, i, layoutParams);
            setTabOnClickListener(view);
            jeq.A01();
            return;
        }
        throw AnonymousClass7TE.A0w("TabContainer supports children only of TabView type.");
    }

    public /* synthetic */ IgSegmentedTabLayout2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    public final void addView(View view, int i) {
        if (view instanceof C46720Djx) {
            C63285KuU.A00(this.A05, (C46720Djx) view);
            C60066Jeq jeq = this.A04;
            jeq.addView(view, i);
            setTabOnClickListener(view);
            jeq.A01();
            return;
        }
        throw AnonymousClass7TE.A0w("TabContainer supports children only of TabView type.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgSegmentedTabLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof C46720Djx) {
            C63285KuU.A00(this.A05, (C46720Djx) view);
            C60066Jeq jeq = this.A04;
            jeq.addView(view, layoutParams);
            setTabOnClickListener(view);
            jeq.A01();
            return;
        }
        throw AnonymousClass7TE.A0w("TabContainer supports children only of TabView type.");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgSegmentedTabLayout2(Context context, C62445Kfv kfv) {
        super(context, (AttributeSet) null, 0);
        AnonymousClass7TG.A1O(context, kfv);
        this.A05 = C62445Kfv.FIXED;
        this.A04 = new C60066Jeq(context);
        this.A05 = kfv;
        C60066Jeq jeq = new C60066Jeq(context);
        this.A04 = jeq;
        super.addView(jeq, 0, JTS.A0D());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setWillNotDraw(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgSegmentedTabLayout2(Context context, C62445Kfv kfv, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? C62445Kfv.FIXED : kfv);
    }
}
