package com.instagram.creation.base.ui.sliderview;

import X.0nA;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass7TE;
import X.C64951Lkq;
import X.JTO;
import X.JTT;
import X.MQ8;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RulerView extends View {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Rect A08;
    public MQ8 A09;
    public int A0A;
    public boolean A0B;
    public final Paint A0C;
    public final Paint A0D;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RulerView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        float A032 = AnonymousClass7TE.A03(this);
        float f = this.A01;
        float f2 = A032 * f;
        float f3 = A032 * ((1.0f - f) - this.A00);
        float f4 = this.A02;
        float f5 = f2 + ((1.0f - f4) * f3);
        float f6 = f3 * f4;
        int i = this.A0A;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                float f7 = (float) ((this.A03 * i2) + this.A05);
                if (i2 % this.A07 == 0) {
                    Paint paint = this.A0C;
                    paint.setColor(this.A06);
                    float f8 = ((float) this.A04) / 2.0f;
                    canvas2.drawRect(f7 - f8, f2, f7 + f8, f2 + f3, paint);
                    A00(canvas2, f7, f2, i2);
                } else {
                    Paint paint2 = this.A0C;
                    paint2.setColor(this.A06);
                    canvas2.drawRect(f7, f5, f7 + 1.0f, f5 + f6, paint2);
                    A00(canvas2, f7, f5, i2);
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    private final void A00(Canvas canvas, float f, float f2, int i) {
        String str;
        String formatStrLocaleSafe;
        MQ8 mq8 = this.A09;
        if (mq8 != null && i % ((C64951Lkq) mq8).A00 == 0) {
            int i2 = i / 60;
            if (i2 == 0) {
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(":%02d", Integer.valueOf(i % 60));
            } else {
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(i % 60);
                if (i2 < 10) {
                    str = "%01d:%02d";
                } else {
                    str = "%02d:%02d";
                }
                formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, valueOf, valueOf2);
            }
            if (formatStrLocaleSafe != null) {
                Paint paint = this.A0D;
                int length = formatStrLocaleSafe.length();
                Rect rect = this.A08;
                paint.getTextBounds(formatStrLocaleSafe, 0, length, rect);
                0qQ.A0A(rect);
                canvas.drawText(formatStrLocaleSafe, f, f2 + ((float) rect.centerY()), paint);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        if (!this.A0B) {
            int i3 = this.A03;
            this.A0A = (((View.MeasureSpec.getSize(i) - this.A05) + i3) - 1) / i3;
        }
        setMeasuredDimension((this.A0A * this.A03) + (this.A05 * 2), View.MeasureSpec.getSize(i2));
    }

    public final void setNumIncrements(int i) {
        this.A0A = i;
        this.A0B = true;
    }

    public final void setLeftRightMarginRatio(float f) {
        this.A05 = AnonymousClass7TE.A05(f, (float) getResources().getDisplayMetrics().widthPixels);
    }

    public final void setIncrementWidthPx(int i) {
        this.A03 = i;
    }

    public final void setLeftRightMarginPx(int i) {
        this.A05 = i;
    }

    public final void setLineLabeler(MQ8 mq8) {
        this.A09 = mq8;
    }

    public final void setPaddingBottomRatio(float f) {
        this.A00 = f;
    }

    public final void setPaddingTopRatio(float f) {
        this.A01 = f;
    }

    public final void setSmallLineRatio(float f) {
        this.A02 = f;
    }

    public final void setSmallToLargeLineFrequency(int i) {
        this.A07 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RulerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0C = JTO.A0C();
        this.A0D = JTO.A0C();
        this.A06 = getContext().getColor(2Yu.A09(context));
        Resources resources = getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = 0nA.A01;
        this.A03 = Math.round(TypedValue.applyDimension(1, 20.0f, displayMetrics));
        this.A04 = 2;
        this.A07 = 5;
        Paint paint = this.A0D;
        paint.setColor(this.A06);
        paint.setTextSize(AnonymousClass7TE.A01(resources, R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        this.A08 = AnonymousClass7TE.A0W();
        int A0H = AnonymousClass7TE.A0H(resources);
        int i2 = this.A04;
        if (i2 % 2 != A0H % 2) {
            this.A04 = i2 + 1;
        }
    }

    public /* synthetic */ RulerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RulerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
