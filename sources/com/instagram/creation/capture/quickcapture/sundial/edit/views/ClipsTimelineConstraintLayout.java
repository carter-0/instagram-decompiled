package com.instagram.creation.capture.quickcapture.sundial.edit.views;

import X.0qQ;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ClipsTimelineConstraintLayout extends ConstraintLayout {
    public boolean A00;

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.A00) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getAllowTouchEvents() {
        return this.A00;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A00) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public /* synthetic */ ClipsTimelineConstraintLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    public final void setAllowTouchEvents(boolean z) {
        this.A00 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsTimelineConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A00 = true;
    }
}
