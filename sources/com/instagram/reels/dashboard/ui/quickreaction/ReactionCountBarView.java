package com.instagram.reels.dashboard.ui.quickreaction;

import X.0qQ;
import X.C71382cm;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.instagram.android.R;

public final class ReactionCountBarView extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final Paint A06 = new Paint();
    public final Path A07 = new Path();
    public final RectF A08 = new RectF();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionCountBarView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context, (AttributeSet) null);
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        Paint paint = this.A06;
        paint.setAntiAlias(true);
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        theme.resolveAttribute(R.attr.igds_color_primary_background, typedValue, true);
        int i = typedValue.data;
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(R.attr.igds_color_primary_background, typedValue2, true);
        int i2 = typedValue2.data;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A1t);
            0qQ.A07(obtainStyledAttributes);
            this.A01 = obtainStyledAttributes.getColor(0, i);
            this.A03 = obtainStyledAttributes.getColor(2, i2);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A00 = obtainStyledAttributes.getFloat(3, 0.0f);
            obtainStyledAttributes.recycle();
        } else {
            this.A01 = i;
            this.A03 = i2;
            this.A02 = 0;
            this.A00 = 0.0f;
        }
        paint.setColor(this.A03);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Path path = this.A07;
        RectF rectF = this.A08;
        float f = (float) this.A02;
        path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        canvas.clipPath(path);
        canvas.drawColor(this.A01);
        canvas.save();
        float f2 = ((float) this.A04) * (1.0f - this.A00);
        canvas.translate(0.0f, f2);
        canvas.drawRect(0.0f, 0.0f, (float) this.A05, ((float) this.A04) - f2, this.A06);
        canvas.restore();
    }

    public final void setFillPercentage(float f) {
        this.A00 = f;
        postInvalidate();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A05 = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.A04 = size;
        RectF rectF = this.A08;
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.right = (float) this.A05;
        rectF.bottom = (float) size;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReactionCountBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context, attributeSet);
    }
}
