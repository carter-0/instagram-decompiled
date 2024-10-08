package com.instagram.ui.widget.textview;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass37O;
import X.C71382cm;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.ui.text.TitleTextView;

public class ImageWithTitleTextView extends TitleTextView {
    public int A00;
    public Drawable A01;
    public boolean A02;
    public float A03 = 1.0f;
    public float A04 = 1.0f;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public boolean A0A = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageWithTitleTextView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
    }

    private final void setupDrawable(int i) {
        Drawable drawable = null;
        if (i == 0) {
            this.A08 = 0;
            this.A09 = 0;
            this.A0A = false;
        } else {
            Drawable drawable2 = getContext().getDrawable(i);
            if (drawable2 != null) {
                drawable2.setColorFilter(AnonymousClass37O.A00(this.A07));
                this.A09 = drawable2.getIntrinsicWidth();
                int intrinsicHeight = drawable2.getIntrinsicHeight();
                this.A08 = intrinsicHeight;
                drawable2.setBounds(0, 0, this.A09, intrinsicHeight);
                this.A0A = true;
                drawable = drawable2;
            }
        }
        this.A01 = drawable;
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A0A) {
            float f = ((float) (this.A09 + this.A00)) / 2.0f;
            if (this.A02) {
                canvas.save();
                f = -f;
            } else {
                A02(canvas);
                canvas.save();
            }
            canvas.translate(f, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A0A) {
            canvas.restore();
            if (this.A02) {
                canvas.translate(getLayout().getLineWidth(0) + ((float) this.A00), 0.0f);
                A02(canvas);
            }
        }
    }

    private final void A00(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1a, i, 0);
        0qQ.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.A07 = obtainStyledAttributes.getColor(1, -1);
        if (resourceId != 0) {
            setupDrawable(resourceId);
        }
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.A02 = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
    }

    private final void A02(Canvas canvas) {
        if (this.A01 != null) {
            canvas.save();
            canvas.translate(((float) getScrollX()) + this.A05, ((float) getScrollY()) + this.A06);
            canvas.scale(this.A03, this.A04, ((float) this.A09) / 2.0f, ((float) this.A08) / 2.0f);
            Drawable drawable = this.A01;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.restore();
        }
    }

    public final Drawable getDrawable() {
        return this.A01;
    }

    public final float getImageScaleX() {
        return this.A03;
    }

    public final float getImageScaleY() {
        return this.A04;
    }

    public final int getInnerSpacing() {
        return this.A00;
    }

    public final boolean getShowDrawableOnRightSide() {
        return this.A02;
    }

    public final void setImageScaleX(float f) {
        if (Float.compare(this.A03, f) != 0) {
            this.A03 = f;
            invalidate();
        }
    }

    public final void setImageScaleY(float f) {
        if (Float.compare(this.A04, f) != 0) {
            this.A04 = f;
            invalidate();
        }
    }

    public final void onMeasure(int i, int i2) {
        int A062 = AnonymousClass0fD.A06(-2128207003);
        if (this.A0A) {
            i = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - this.A09) - this.A00, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        if (this.A0A) {
            int max = Math.max(this.A08, getMeasuredHeight());
            int measuredWidth = this.A09 + this.A00 + getMeasuredWidth();
            setMeasuredDimension(measuredWidth, max);
            this.A05 = (((float) measuredWidth) - (((float) (this.A09 + this.A00)) + getLayout().getLineWidth(0))) / 2.0f;
            this.A06 = ((float) (max - this.A08)) / 2.0f;
        }
        AnonymousClass0fD.A0D(605537102, A062);
    }

    public final void setImageResource(int i) {
        setupDrawable(i);
        requestLayout();
    }

    public final void setInnerSpacing(int i) {
        this.A00 = i;
    }

    public final void setShowDrawableOnRightSide(boolean z) {
        this.A02 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageWithTitleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context, attributeSet, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageWithTitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context, attributeSet, 0);
    }
}
