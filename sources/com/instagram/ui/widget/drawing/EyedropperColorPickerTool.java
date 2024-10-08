package com.instagram.ui.widget.drawing;

import X.0nH;
import X.2cs;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass37O;
import X.C232922uf;
import X.C294765n0;
import X.C300705xg;
import X.C71382cm;
import X.SN3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public class EyedropperColorPickerTool extends View {
    public float A00;
    public float A01;
    public Drawable A02;
    public Drawable A03;
    public AnonymousClass0eM A04;
    public float A05;
    public boolean A06;
    public final C232922uf A07;
    public final float A08;
    public final float A09;
    public final Paint A0A;
    public final Paint A0B;

    public EyedropperColorPickerTool(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setColor(int i) {
        this.A0A.setColor(i);
        ColorFilter A002 = AnonymousClass37O.A00(0nH.A08(i, 1.0f));
        Drawable drawable = this.A03;
        if (drawable != null) {
            drawable.setColorFilter(A002);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setColorFilter(A002);
        }
        invalidate();
    }

    public void setIsRectangular(boolean z) {
        this.A06 = z;
        invalidate();
    }

    private float getButtonRadius() {
        return (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) / 2.0f) + this.A08;
    }

    private void setIconBounds(Drawable drawable) {
        float buttonRadius = getButtonRadius() * 2.0f;
        float min = Math.min(((float) Math.sqrt((double) ((buttonRadius * buttonRadius) / 2.0f))) - this.A05, ((float) drawable.getIntrinsicWidth()) / 2.0f);
        float f = this.A01;
        float f2 = this.A00;
        drawable.setBounds((int) (f - min), (int) (f2 - min), (int) (f + min), (int) (f2 + min));
    }

    public final void onDraw(Canvas canvas) {
        float buttonRadius = getButtonRadius() - this.A08;
        if (this.A06) {
            float f = this.A01;
            float f2 = this.A00;
            RectF rectF = new RectF(f - buttonRadius, f2 - buttonRadius, f + buttonRadius, f2 + buttonRadius);
            float dimension = getContext().getResources().getDimension(R.dimen.abc_button_padding_horizontal_material);
            canvas.drawRoundRect(rectF, dimension, dimension, this.A0A);
            canvas.drawRoundRect(rectF, dimension, dimension, this.A0B);
        } else {
            canvas.drawCircle(this.A01, this.A00, buttonRadius, this.A0A);
            canvas.drawCircle(this.A01, this.A00, buttonRadius, this.A0B);
        }
        float f3 = (float) ((2cs) this.A04.getValue()).A09.A00;
        Drawable drawable = this.A03;
        if (drawable != null) {
            canvas.save();
            canvas.rotate(-45.0f * f3, this.A01, this.A00);
            drawable.setAlpha((int) ((1.0f - f3) * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            canvas.save();
            canvas.rotate((1.0f - f3) * 45.0f, this.A01, this.A00);
            drawable2.setAlpha((int) (f3 * 255.0f));
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A01 = ((float) getWidth()) / 2.0f;
        this.A00 = (((float) getHeight()) - this.A01) - ((float) getPaddingBottom());
        Drawable drawable = this.A03;
        if (drawable != null) {
            setIconBounds(drawable);
            drawable.setAlpha(255);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            setIconBounds(drawable2);
            drawable2.setAlpha(0);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((float) getResources().getDisplayMetrics().widthPixels) * this.A09), SN3.MAX_SIGNED_POWER_OF_TWO), i2);
    }

    public EyedropperColorPickerTool(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A07 = new C294765n0(this);
        this.A06 = false;
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A0a);
            this.A09 = Math.max(0.0f, Math.min(obtainStyledAttributes.getFloat(3, -1.0f), 1.0f));
            float dimension = obtainStyledAttributes.getDimension(5, 3.0f);
            this.A08 = dimension;
            this.A05 = obtainStyledAttributes.getDimension(4, 0.0f);
            this.A03 = obtainStyledAttributes.getDrawable(2);
            this.A02 = obtainStyledAttributes.getDrawable(1);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setContentDescription(context.getString(resourceId));
            }
            obtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.A0B = paint;
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(dimension);
            Paint paint2 = new Paint(1);
            this.A0A = paint2;
            paint2.setStyle(Paint.Style.FILL);
            setColor(-1);
            this.A04 = AnonymousClass0eN.A01(new C300705xg(this));
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    public EyedropperColorPickerTool(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
