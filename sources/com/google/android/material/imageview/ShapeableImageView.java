package com.google.android.material.imageview;

import X.02K;
import X.AnonymousClass0fD;
import X.AnonymousClass972;
import X.C13990Tnq;
import X.C297835sR;
import X.C297865sU;
import X.C297875sV;
import X.C297885sW;
import X.C297895sX;
import X.C297985sg;
import X.C298015sj;
import X.C3021161q;
import X.C309286Xr;
import X.C323636xp;
import X.JTO;
import X.JTT;
import X.Pxi;
import X.U3t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;

public class ShapeableImageView extends C3021161q implements C297885sW {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public C297875sV A06;
    public C297895sX A07;
    public int A08;
    public int A09;
    public Path A0A;
    public boolean A0B;
    public final Paint A0C;
    public final Path A0D;
    public final RectF A0E;
    public final Paint A0F;
    public final RectF A0G;
    public final C297985sg A0H;

    private void A00(int i, int i2) {
        RectF rectF = this.A0E;
        rectF.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        C297985sg r2 = this.A0H;
        C297895sX r5 = this.A07;
        Path path = this.A0D;
        r2.A01(path, rectF, r5, (C298015sj) null, 1.0f);
        Path path2 = this.A0A;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.A0G;
        C13990Tnq.A0q(rectF2, (float) i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.A01;
    }

    public final int getContentPaddingEnd() {
        int i = this.A02;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (getLayoutDirection() == 1) {
            return this.A08;
        }
        return this.A09;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2 = this.A03;
        if (!(i2 == Integer.MIN_VALUE && this.A02 == Integer.MIN_VALUE)) {
            if (getLayoutDirection() == 1 && (i = this.A02) != Integer.MIN_VALUE) {
                return i;
            }
            if (getLayoutDirection() != 1) {
                int i3 = i2;
                if (i2 != Integer.MIN_VALUE) {
                    return i3;
                }
            }
        }
        return this.A08;
    }

    public int getContentPaddingRight() {
        int i;
        int i2 = this.A03;
        if (!(i2 == Integer.MIN_VALUE && this.A02 == Integer.MIN_VALUE)) {
            if (getLayoutDirection() == 1 && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!(getLayoutDirection() == 1 || (i = this.A02) == Integer.MIN_VALUE)) {
                return i;
            }
        }
        return this.A09;
    }

    public final int getContentPaddingStart() {
        int i = this.A03;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (getLayoutDirection() == 1) {
            return this.A09;
        }
        return this.A08;
    }

    public int getContentPaddingTop() {
        return this.A04;
    }

    public C297895sX getShapeAppearanceModel() {
        return this.A07;
    }

    public ColorStateList getStrokeColor() {
        return this.A05;
    }

    public float getStrokeWidth() {
        return this.A00;
    }

    public void setShapeAppearanceModel(C297895sX r3) {
        this.A07 = r3;
        C297875sV r0 = this.A06;
        if (r0 != null) {
            r0.setShapeAppearanceModel(r3);
        }
        A00(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.A05 = colorStateList;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            invalidate();
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(C297835sR.A00(context, attributeSet, i, 2132018560), attributeSet, i);
        this.A0H = C323636xp.A00;
        this.A0D = new Path();
        this.A0B = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.A0F = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        Pxi.A0v(paint, PorterDuff.Mode.DST_OUT);
        this.A0E = new RectF();
        this.A0G = new RectF();
        this.A0A = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C297865sU.A0X, i, 2132018560);
        this.A05 = C309286Xr.A01(context2, obtainStyledAttributes, 9);
        this.A00 = (float) obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A08 = dimensionPixelSize;
        this.A04 = dimensionPixelSize;
        this.A09 = dimensionPixelSize;
        this.A01 = dimensionPixelSize;
        this.A08 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.A09 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(5, AnonymousClass972.MUTABLE_FLAG_MASK);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, AnonymousClass972.MUTABLE_FLAG_MASK);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.A0C = paint2;
        JTO.A1N(paint2);
        paint2.setAntiAlias(true);
        this.A07 = new C297895sX(C297895sX.A01(context2, attributeSet, i, 2132018560));
        setOutlineProvider(new U3t(this));
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - this.A01;
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - this.A04;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1905031501);
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
        AnonymousClass0fD.A0D(351787479, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1470768796);
        setLayerType(0, (Paint) null);
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(-516473186, A062);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.A0A, this.A0F);
        if (this.A05 != null) {
            Paint paint = this.A0C;
            paint.setStrokeWidth(this.A00);
            int colorForState = this.A05.getColorForState(getDrawableState(), this.A05.getDefaultColor());
            if (this.A00 > 0.0f && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.A0D, paint);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.A0B && isLayoutDirectionResolved()) {
            this.A0B = true;
            if (!isPaddingRelative() && this.A03 == Integer.MIN_VALUE && this.A02 == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1974459717);
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
        AnonymousClass0fD.A0D(-1142943637, A062);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + this.A04, i3 + getContentPaddingRight(), i4 + this.A01);
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + this.A04, i3 + getContentPaddingEnd(), i4 + this.A01);
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(02K.A02(getContext(), i));
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth((float) JTT.A05(this, i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }
}
