package com.instagram.ui.igeditseekbar;

import X.0mi;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C13988Tno;
import X.C14724U4o;
import X.C71382cm;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.instagram.android.R;

public final class IgVerticalChunkySlider extends C14724U4o {
    public int A00;
    public int A01;
    public Paint A02;
    public Integer A03;
    public boolean A04;
    public final Paint A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;
    public final Path A09;
    public final Rect A0A;
    public final RectF A0B;
    public final RectF A0C;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgVerticalChunkySlider(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: finally extract failed */
    private final void setSliderProperties(Context context, TypedArray typedArray) {
        try {
            this.A00 = typedArray.getDimensionPixelSize(0, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            Paint paint = this.A05;
            Context context2 = getContext();
            int i = R.attr.seekBarActiveColor;
            paint.setColor(typedArray.getColor(2, 2Yu.A0F(context2, R.attr.seekBarActiveColor)));
            Paint paint2 = this.A06;
            paint2.setColor(typedArray.getColor(3, 2Yu.A0F(context2, R.attr.seekBarInactiveColor)));
            this.A04 = typedArray.getBoolean(1, false);
            typedArray.recycle();
            Resources resources = context.getResources();
            Paint paint3 = this.A07;
            paint3.setColor(-1);
            paint3.setShadowLayer((float) this.A00, this.A0C.left, 0.0f, -12303292);
            Paint.Style style = Paint.Style.FILL;
            paint3.setStyle(style);
            paint.setStyle(style);
            paint2.setStyle(style);
            Paint paint4 = new Paint();
            this.A02 = paint4;
            Integer num = this.A03;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    this.A01 = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
                    paint4 = this.A02;
                    0qQ.A0A(paint4);
                } else if (intValue == 1) {
                    this.A01 = 0;
                    i = R.attr.seekBarTextColor;
                } else if (intValue == 2) {
                    this.A01 = 0;
                }
                paint4.setColor(2Yu.A0F(context2, i));
            }
            Paint paint5 = this.A02;
            0qQ.A0A(paint5);
            C13988Tno.A0t(resources, paint5, R.dimen.auth_title_text_size);
            Paint paint6 = this.A02;
            0qQ.A0A(paint6);
            paint6.setTextAlign(Paint.Align.CENTER);
            Paint paint7 = this.A02;
            0qQ.A0A(paint7);
            paint7.setTypeface(Typeface.DEFAULT_BOLD);
            Paint paint8 = this.A02;
            0qQ.A0A(paint8);
            paint8.setAntiAlias(true);
            setLayerType(1, (Paint) null);
        } catch (Throwable th) {
            typedArray.recycle();
            throw th;
        }
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        int width = getWidth();
        int height = getHeight();
        Integer num = this.A03;
        if (num == AnonymousClass05K.A00) {
            A02(canvas, ((float) width) / 2.0f, (float) this.A0A.height());
        }
        RectF rectF = this.A0B;
        float f = (float) width;
        float f2 = (float) height;
        rectF.set(0.0f, (float) this.A01, f, f2);
        if (this.A04) {
            rectF.inset(0.05f * f, 0.0f);
        } else {
            Path path = this.A08;
            path.reset();
            float f3 = (float) this.A00;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
            path.close();
            canvas.clipPath(path);
        }
        int i = this.A01;
        float f4 = (float) (height - i);
        rectF.bottom = ((float) i) + ((1.0f - this.A00) * f4);
        if (this.A04) {
            Path path2 = this.A09;
            path2.reset();
            path2.moveTo(rectF.left, rectF.bottom);
            path2.lineTo(rectF.left, rectF.top + ((float) this.A00));
            float f5 = rectF.left;
            float f6 = rectF.top;
            path2.quadTo(f5, f6, ((float) this.A00) + f5, f6);
            path2.lineTo(rectF.right - ((float) this.A00), rectF.top);
            float f7 = rectF.right;
            float f8 = rectF.top;
            path2.quadTo(f7, f8, f7, ((float) this.A00) + f8);
            path2.lineTo(rectF.right, rectF.bottom);
            path2.lineTo(rectF.left, rectF.bottom);
            canvas.drawPath(path2, this.A06);
        } else {
            canvas.drawRect(rectF, this.A06);
        }
        rectF.top = ((float) this.A01) + ((1.0f - this.A00) * f4);
        rectF.bottom = f2;
        if (this.A04) {
            Path path3 = this.A09;
            path3.reset();
            path3.moveTo(rectF.left, rectF.top);
            path3.lineTo(rectF.right, rectF.top);
            path3.lineTo(rectF.right, Math.max(rectF.top, rectF.bottom - ((float) this.A00)));
            float f9 = rectF.right;
            float f10 = rectF.bottom;
            path3.quadTo(f9, f10, f9 - ((float) this.A00), f10);
            path3.lineTo(rectF.left + ((float) this.A00), rectF.bottom);
            float f11 = rectF.left;
            float f12 = rectF.bottom;
            path3.quadTo(f11, f12, f11, Math.max(rectF.top, f12 - ((float) this.A00)));
            path3.lineTo(rectF.left, rectF.top);
            canvas.drawPath(path3, this.A05);
        } else {
            canvas.drawRect(rectF, this.A05);
        }
        if (num == AnonymousClass05K.A01) {
            A02(canvas, f / 2.0f, 0.9f * f2);
        }
        if (this.A04) {
            float f13 = f4 * 0.04f;
            RectF rectF2 = this.A0C;
            rectF2.left = 0.0f;
            rectF2.right = f;
            float A002 = 0mi.A00(((float) ((int) rectF.top)) - (f13 / 2.0f), 0.0f, f2 - f13);
            rectF2.top = A002;
            rectF2.bottom = A002 + f13;
            float f14 = (float) this.A00;
            canvas.drawRoundRect(rectF2, f14, f14, this.A07);
        }
    }

    public int getCurrentPositionAsValue() {
        return AnonymousClass7TE.A05(this.A00, (float) this.A02);
    }

    public final void setActivePaint(int i) {
        AnonymousClass7TE.A1N(getContext(), this.A05, i);
    }

    public final void setThumbPaint(int i) {
        AnonymousClass7TE.A1N(getContext(), this.A07, i);
    }

    private final void A02(Canvas canvas, float f, float f2) {
        String valueOf = String.valueOf(getCurrentPositionAsValue());
        Paint paint = this.A02;
        0qQ.A0A(paint);
        paint.getTextBounds(valueOf, 0, valueOf.length(), this.A0A);
        Paint paint2 = this.A02;
        0qQ.A0A(paint2);
        canvas.drawText(valueOf, f, f2, paint2);
        invalidate();
    }

    public int getLengthPx() {
        return getHeight();
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgVerticalChunkySlider(Context context, AttributeSet attributeSet) {
        super(2Yu.A0I(context, R.attr.seekBarStyle), attributeSet);
        int i;
        0qQ.A0B(context, 1);
        this.A0B = new RectF();
        this.A0C = new RectF();
        this.A08 = new Path();
        this.A06 = new Paint(1);
        this.A05 = new Paint(1);
        this.A07 = new Paint(1);
        this.A0A = new Rect();
        this.A09 = new Path();
        Context context2 = getContext();
        int[] iArr = C71382cm.A13;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr);
        0qQ.A07(obtainStyledAttributes);
        try {
            int i2 = obtainStyledAttributes.getInt(4, 0);
            for (Integer num : AnonymousClass05K.A00(3)) {
                switch (num.intValue()) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == i2) {
                    this.A03 = num;
                    obtainStyledAttributes.recycle();
                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                    0qQ.A07(obtainStyledAttributes2);
                    setSliderProperties(context, obtainStyledAttributes2);
                    return;
                }
            }
            throw new IllegalArgumentException();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
