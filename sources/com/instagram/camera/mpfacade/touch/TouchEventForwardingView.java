package com.instagram.camera.mpfacade.touch;

import X.0qQ;
import X.C353078Ge;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public final class TouchEventForwardingView extends View {
    public View A00;
    public C353078Ge A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchEventForwardingView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C353078Ge r3;
        MotionEvent motionEvent2 = motionEvent;
        0qQ.A0B(motionEvent2, 0);
        if (this.A00 == null || (r3 = this.A01) == null || !r3.EsK(motionEvent2)) {
            return false;
        }
        if (motionEvent2.getActionMasked() == 0) {
            motionEvent2 = MotionEvent.obtain(motionEvent2.getEventTime(), motionEvent2.getEventTime(), motionEvent2.getAction(), motionEvent2.getX(), motionEvent2.getY(), motionEvent2.getPressure(), motionEvent2.getSize(), motionEvent2.getMetaState(), motionEvent2.getXPrecision(), motionEvent2.getYPrecision(), motionEvent2.getDeviceId(), motionEvent2.getEdgeFlags());
        }
        View view = this.A00;
        if (view != null) {
            view.dispatchTouchEvent(motionEvent2);
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchEventForwardingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchEventForwardingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        0qQ.A0B(attributeSet, 2);
    }
}
