package com.instagram.clips.template.browser.helper;

import X.0qQ;
import X.AnonymousClass0fD;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class TemplateBrowserViewPager extends ViewPager {
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public /* synthetic */ TemplateBrowserViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0fD.A0C(-1237493160, AnonymousClass0fD.A05(-1816970226));
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TemplateBrowserViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
