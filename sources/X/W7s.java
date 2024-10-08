package X;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;

public final class W7s implements LineHeightSpan.WithDensity {
    public final float A00;

    public final void A00(Paint.FontMetricsInt fontMetricsInt, float f) {
        int i;
        float f2 = this.A00;
        int A02 = C13988Tno.A02(f2, f);
        int i2 = fontMetricsInt.descent;
        if (((float) i2) > f2) {
            int min = Math.min(A02, i2);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            i = 0;
        } else {
            int i3 = fontMetricsInt.ascent;
            int i4 = -i3;
            if (i4 + i2 > A02) {
                fontMetricsInt.bottom = i2;
                i = (-A02) + i2;
            } else {
                int i5 = fontMetricsInt.bottom;
                if (i4 + i5 > A02) {
                    fontMetricsInt.top = i3;
                    fontMetricsInt.bottom = i3 + A02;
                    return;
                }
                int i6 = fontMetricsInt.top;
                int i7 = (-i6) + i5;
                if (i7 > A02) {
                    i = i5 - A02;
                    fontMetricsInt.top = i;
                }
                double A01 = (double) C13988Tno.A01(A02 - i7);
                int ceil = (int) (((double) i6) - Math.ceil(A01));
                fontMetricsInt.top = ceil;
                int floor = (int) (((double) i5) + Math.floor(A01));
                fontMetricsInt.bottom = floor;
                fontMetricsInt.ascent = ceil;
                fontMetricsInt.descent = floor;
                return;
            }
        }
        fontMetricsInt.ascent = i;
        fontMetricsInt.top = i;
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        A00(fontMetricsInt, 1.0f);
    }

    public W7s(float f) {
        this.A00 = f;
    }

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        A00(fontMetricsInt, textPaint.density);
    }
}
