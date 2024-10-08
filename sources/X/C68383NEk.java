package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.NEk  reason: case insensitive filesystem */
public abstract class C68383NEk extends C71278OhJ {
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Spanned spanned;
        float f;
        float f2;
        float f3;
        float f4;
        String A01;
        CharSequence charSequence2 = charSequence;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        int i8 = i;
        int i9 = i2;
        int i10 = i6;
        if (this instanceof C68382NEj) {
            C68382NEj nEj = (C68382NEj) this;
            if (((Spanned) charSequence2).getSpanStart(nEj) == i10) {
                nEj.A00(paint2);
                if (nEj.A01 < 10) {
                    A01 = 002.A0R(" ", nEj.A01());
                } else {
                    A01 = nEj.A01();
                }
                canvas2.drawText(A01, ((float) i8) + (((float) i9) * (nEj.A00 - nEj.A00)), (float) i4, nEj.A02);
                return;
            }
            return;
        }
        C68381NEi nEi = (C68381NEi) this;
        0qQ.A0B(canvas2, 0);
        AnonymousClass7TF.A1E(paint2, 1, charSequence2);
        if ((charSequence2 instanceof Spanned) && (spanned = (Spanned) charSequence2) != null && spanned.getSpanStart(nEi) == i10) {
            nEi.A00(paint2);
            if (nEi.A00 == null) {
                Paint paint3 = new Paint(paint2);
                nEi.A00 = paint3;
                paint3.setColor(nEi.A01);
                Paint paint4 = nEi.A00;
                if (paint4 != null) {
                    paint4.setStyle(Paint.Style.STROKE);
                }
            }
            float f5 = nEi.A01;
            float f6 = ((float) i8) + (((float) i9) * (nEi.A00 - nEi.A02));
            float f7 = f5;
            if (f5 < f6) {
                f7 = f6;
            }
            int intValue = nEi.A03.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    float f8 = ((float) (i3 + i5)) / 2.0f;
                    f = f7 - f5;
                    float f9 = f5 / 3.0f;
                    f2 = f8 - f9;
                    f3 = f7 + f5;
                    f4 = f8 + f9;
                } else if (intValue == 2) {
                    Paint paint5 = nEi.A00;
                    if (paint5 != null) {
                        canvas2.drawCircle(f7, ((float) (i3 + i5)) / 2.0f, f5, paint5);
                        return;
                    }
                    return;
                } else if (intValue == 3) {
                    float f10 = ((float) (i3 + i5)) / 2.0f;
                    f = f7 - f5;
                    f2 = f10 - f5;
                    f3 = f7 + f5;
                    f4 = f10 + f5;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                canvas2.drawRect(f, f2, f3, f4, nEi.A02);
                return;
            }
            canvas2.drawCircle(f7, ((float) (i3 + i5)) / 2.0f, f5, nEi.A02);
        }
    }

    public C68383NEk(DisplayMetrics displayMetrics, int i) {
        float applyDimension;
        this.A01 = -16777216;
        this.A00 = TypedValue.applyDimension(2, 20.0f, displayMetrics);
        if (i == 0) {
            applyDimension = 0.0f;
        } else {
            applyDimension = TypedValue.applyDimension(2, 22.0f, displayMetrics) + (((float) i) * TypedValue.applyDimension(2, 19.0f, displayMetrics));
        }
        this.A00 = applyDimension;
    }
}
