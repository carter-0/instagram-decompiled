package com.instagram.ui.viewpager;

import X.0qQ;
import X.AnonymousClass0fD;
import X.DbX;
import X.JTT;
import X.UFQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ScrollingOptionalViewPager extends UFQ {
    public boolean A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollingOptionalViewPager(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (this.A00) {
            return ScrollingOptionalViewPager.super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public final boolean getScrollingEnabled() {
        return this.A00;
    }

    public void setCurrentItem(int i) {
        if (this.A00) {
            ScrollingOptionalViewPager.super.setCurrentItem(i);
        } else {
            A0I(i, false);
        }
    }

    public final void setScrollingEnabled(boolean z) {
        this.A00 = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int A03 = DbX.A03(motionEvent, -23641839);
        if (this.A00) {
            z = ScrollingOptionalViewPager.super.onTouchEvent(motionEvent);
        } else {
            z = false;
        }
        AnonymousClass0fD.A0C(-1181352443, A03);
        return z;
    }

    public /* synthetic */ ScrollingOptionalViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingOptionalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A00 = true;
    }
}
