package com.instagram.tagging.widget;

import X.AnonymousClass0fD;
import X.C65930M4t;
import X.MQ1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class PhotoScrollView extends ScrollView {
    public float A00;
    public MQ1 A01;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setScrollTarget(float f) {
        this.A00 = f;
        A00(this, f);
    }

    public PhotoScrollView(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    public static void A00(PhotoScrollView photoScrollView, float f) {
        int childCount = photoScrollView.getChildCount();
        if (childCount != 0) {
            photoScrollView.smoothScrollTo(0, (int) ((((float) (photoScrollView.getChildAt(childCount - 1).getBottom() + photoScrollView.getPaddingBottom())) * f) - ((float) (photoScrollView.getHeight() / 2))));
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(674608206);
        super.onSizeChanged(i, i2, i3, i4);
        postDelayed(new C65930M4t(this), 500);
        AnonymousClass0fD.A0D(1217616503, A06);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0fD.A0C(1512504232, AnonymousClass0fD.A05(-1070831124));
        return false;
    }

    public void setOnMeasureListener(MQ1 mq1) {
        this.A01 = mq1;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public PhotoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    public PhotoScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }
}
