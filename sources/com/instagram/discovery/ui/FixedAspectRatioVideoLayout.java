package com.instagram.discovery.ui;

import X.0qQ;
import X.AnonymousClass0fD;
import X.C295195nk;
import X.DbT;
import X.DbX;
import X.JTT;
import X.SN3;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FixedAspectRatioVideoLayout extends SimpleVideoLayout {
    public float A00;
    public final C295195nk A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = 1.0f;
        this.A01 = new C295195nk(this);
        setWillNotDraw(false);
    }

    public final void dispatchDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        this.A01.A00(canvas);
    }

    public final void setAspectRatio(float f) {
        if (f > 0.0f) {
            this.A00 = f;
            return;
        }
        throw new IllegalArgumentException("aspect ratio shall be > 0");
    }

    public final void onMeasure(int i, int i2) {
        float f = this.A00;
        if (f > 0.0f) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec((int) (((float) size) / f), SN3.MAX_SIGNED_POWER_OF_TWO));
            return;
        }
        throw DbT.A0m();
    }

    public final void setEnableTouchOverlay(boolean z) {
        this.A01.A00 = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A03 = DbX.A03(motionEvent, 818847099);
        C295195nk r1 = this.A01;
        if (r1.A00) {
            r1.A02.A02(motionEvent);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0fD.A0C(-228208669, A03);
        return onTouchEvent;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioVideoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FixedAspectRatioVideoLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ FixedAspectRatioVideoLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
