package com.instagram.common.ui.touch;

import X.0qQ;
import X.C295205nl;
import X.JTT;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class TouchOverlayView extends View {
    public final C295205nl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = new C295205nl((View) this);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        float f = this.A00.A00;
        if (f != 0.0f) {
            canvas.drawColor(((int) (f * 128.0f)) * 16777216);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TouchOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TouchOverlayView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ TouchOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
