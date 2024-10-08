package com.instagram.common.ui.touch;

import X.0qQ;
import X.AnonymousClass0fD;
import X.DbX;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DisableableOnTouchView extends View {
    public boolean A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisableableOnTouchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    public final boolean getTouchDisabled() {
        return this.A00;
    }

    public final void setTouchDisabled(boolean z) {
        this.A00 = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int A03 = DbX.A03(motionEvent, 1609424830);
        if (this.A00) {
            onTouchEvent = false;
        } else {
            onTouchEvent = super.onTouchEvent(motionEvent);
        }
        AnonymousClass0fD.A0C(1500194073, A03);
        return onTouchEvent;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DisableableOnTouchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DisableableOnTouchView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ DisableableOnTouchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
