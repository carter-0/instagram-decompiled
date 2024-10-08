package com.instagram.igds.components.shimmer.placeholder;

import X.0qQ;
import X.AnonymousClass3O7;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SimpleShimmerPlaceholderView extends AnonymousClass3O7 {
    public int A00;
    public int A01;
    public Paint A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleShimmerPlaceholderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A02 = new Paint();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A2A);
            0qQ.A07(obtainStyledAttributes);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.A01 = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
        }
        this.A02.setColor(this.A01);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        float f = (float) this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A02);
    }

    public final void setFillColor(int i) {
        this.A01 = i;
        this.A02.setColor(i);
    }

    public final void setCornerRadius(int i) {
        this.A00 = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleShimmerPlaceholderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
