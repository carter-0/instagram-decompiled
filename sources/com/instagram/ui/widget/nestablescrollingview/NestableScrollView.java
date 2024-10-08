package com.instagram.ui.widget.nestablescrollingview;

import X.AnonymousClass0fD;
import X.C363518jr;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class NestableScrollView extends ScrollView {
    public final C363518jr A00 = new C363518jr(getContext());

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A00.A01(motionEvent, this, false);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setPassThroughEdge(int i) {
        C363518jr r1 = this.A00;
        r1.A00 = i;
        r1.A01 = false;
    }

    public void setPassThroughOnOverScroll(boolean z) {
        this.A00.A02 = z;
        setOverScrollMode(2);
    }

    public NestableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0fD.A05(-1263435863);
        this.A00.A00(motionEvent, this);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(-100652460, A05);
        return onTouchEvent;
    }

    public NestableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public NestableScrollView(Context context) {
        super(context);
    }
}
