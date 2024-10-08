package com.instagram.arlink.ui;

import X.AnonymousClass0fD;
import X.C13988Tno;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

public class GradientOverlay extends View {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final Paint A05 = new Paint();

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, (float) this.A04, (float) this.A02, this.A05);
    }

    public void setAlpha(float f) {
        C13988Tno.A0o(f, 255.0f, this.A05);
        invalidate();
    }

    public GradientOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }

    private void A00(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0t);
        this.A03 = obtainStyledAttributes.getColor(2, 0);
        this.A00 = obtainStyledAttributes.getColor(0, 0);
        this.A01 = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(571548991);
        int i5 = i2;
        int i6 = i;
        super.onSizeChanged(i6, i5, i3, i4);
        this.A04 = i6;
        this.A02 = i5;
        Paint paint = this.A05;
        paint.setShader(new LinearGradient((float) i6, 0.0f, 0.0f, (float) i5, new int[]{this.A03, this.A00, this.A01}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        paint.setDither(true);
        AnonymousClass0fD.A0D(406477006, A06);
    }

    public GradientOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
    }

    public GradientOverlay(Context context) {
        super(context);
    }
}
