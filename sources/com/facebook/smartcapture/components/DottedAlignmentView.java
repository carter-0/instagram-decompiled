package com.facebook.smartcapture.components;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11408SSf;
import X.C11435SUp;
import X.JTO;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public final class DottedAlignmentView extends View {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public Bitmap A06;
    public float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final Paint A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DottedAlignmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A0B = A0V;
        A0V.setColor(C11408SSf.A01(context, R.attr.sc_always_white));
        Resources resources = getResources();
        float dimension = resources.getDimension(R.dimen.abc_button_inset_vertical_material);
        this.A09 = dimension;
        this.A0A = dimension / 2.0f;
        this.A08 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
    }

    public final void onDraw(Canvas canvas) {
        int i;
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        int i2 = (int) this.A07;
        int i3 = this.A04;
        for (int i4 = 0; i4 < i3; i4++) {
            Paint paint = this.A0B;
            int i5 = this.A02;
            if (i5 <= i4) {
                i5 += this.A04;
            }
            int i6 = i5 - i4;
            if (i6 >= this.A04 / 2) {
                i = 127;
            } else {
                i = 255 - ((int) (((float) i6) * this.A00));
            }
            paint.setAlpha(i);
            Bitmap bitmap = this.A06;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, (float) i2, paint);
                i2 += bitmap.getHeight();
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(715410182);
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.A09;
        float f2 = this.A08;
        float f3 = f + (2.0f * f2);
        int i5 = (int) f3;
        int i6 = i / i5;
        this.A03 = i6;
        int i7 = i2 / i5;
        this.A04 = i7;
        float f4 = (float) i7;
        this.A00 = 127.5f / (f4 / 2.0f);
        this.A01 = (((float) i) - (((float) i6) * f3)) / 2.0f;
        this.A07 = (((float) i2) - (f4 * f3)) / 2.0f;
        Bitmap A0B2 = AnonymousClass7TF.A0B(i, i5);
        Canvas A0B3 = JTO.A0B(A0B2);
        this.A06 = A0B2;
        float f5 = this.A0A;
        float f6 = this.A01 + f2 + f5;
        float f7 = f2 + f5;
        Paint A0V = AnonymousClass7TE.A0V(1);
        A0V.setColor(-1);
        int i8 = this.A03;
        for (int i9 = 0; i9 < i8; i9++) {
            A0B3.drawCircle(f6, f7, f5, A0V);
            f6 += f3;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(700);
        valueAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("animation_property", new int[]{0, this.A04 + 1})});
        valueAnimator.addUpdateListener(new C11435SUp((Object) this, 5));
        this.A05 = valueAnimator;
        AnonymousClass0fD.A0D(-2002386928, A062);
    }
}
