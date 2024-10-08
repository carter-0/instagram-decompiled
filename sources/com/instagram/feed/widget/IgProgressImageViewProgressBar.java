package com.instagram.feed.widget;

import X.0qQ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public final class IgProgressImageViewProgressBar extends ProgressBar {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgProgressImageViewProgressBar(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    public final synchronized void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.save();
        canvas.rotate(270.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    public final synchronized void onMeasure(int i, int i2) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            setMeasuredDimension(progressDrawable.getIntrinsicWidth(), progressDrawable.getIntrinsicHeight());
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgProgressImageViewProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgProgressImageViewProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }
}
