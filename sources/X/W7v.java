package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

public final class W7v implements LineHeightSpan, C20838X0n {
    public final int A00;

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5;
        int i6;
        int i7;
        int i8;
        int floor;
        int i9;
        0qQ.A0B(fontMetricsInt, 5);
        if (C18401Vr3.A00.enableAndroidLineHeightCentering()) {
            int i10 = fontMetricsInt.descent;
            i6 = this.A00;
            if (i10 > i6) {
                fontMetricsInt.descent = i6;
                fontMetricsInt.bottom = 0;
                fontMetricsInt.top = 0;
                fontMetricsInt.ascent = 0;
                return;
            }
            int i11 = fontMetricsInt.ascent;
            if ((-i11) + i10 > i6) {
                int i12 = (-((i6 + i11) - i10)) / 2;
                int i13 = i11 + i12;
                fontMetricsInt.ascent = i13;
                floor = (i10 - i12) - (i12 % 2);
                fontMetricsInt.descent = floor;
                fontMetricsInt.top = i13;
            } else {
                i7 = fontMetricsInt.top;
                i5 = fontMetricsInt.bottom;
                i8 = (-i7) + i5;
                if (i8 > i6) {
                    int i14 = (i8 - i6) / 2;
                    fontMetricsInt.top = i7 + i14;
                    floor = i5 - i14;
                }
                float f = (float) i7;
                double A01 = (double) C13988Tno.A01(i6 - i8);
                int ceil = (int) (f - ((float) Math.ceil(A01)));
                floor = (int) (((float) i5) + ((float) Math.floor(A01)));
                fontMetricsInt.top = ceil;
                fontMetricsInt.ascent = ceil;
                fontMetricsInt.descent = floor;
            }
        } else {
            int i15 = fontMetricsInt.descent;
            i6 = this.A00;
            if (i15 > i6) {
                int min = (int) Math.min((double) i6, (double) i15);
                fontMetricsInt.descent = min;
                fontMetricsInt.bottom = min;
                i9 = 0;
            } else {
                int i16 = fontMetricsInt.ascent;
                int i17 = -i16;
                if (i17 + i15 > i6) {
                    fontMetricsInt.bottom = i15;
                    i9 = (-i6) + i15;
                } else {
                    i5 = fontMetricsInt.bottom;
                    if (i17 + i5 > i6) {
                        fontMetricsInt.top = i16;
                        floor = i16 + i6;
                    } else {
                        i7 = fontMetricsInt.top;
                        i8 = (-i7) + i5;
                        if (i8 > i6) {
                            i9 = i5 - i6;
                            fontMetricsInt.top = i9;
                            return;
                        }
                        float f2 = (float) i7;
                        double A012 = (double) C13988Tno.A01(i6 - i8);
                        int ceil2 = (int) (f2 - ((float) Math.ceil(A012)));
                        floor = (int) (((float) i5) + ((float) Math.floor(A012)));
                        fontMetricsInt.top = ceil2;
                        fontMetricsInt.ascent = ceil2;
                        fontMetricsInt.descent = floor;
                    }
                }
            }
            fontMetricsInt.ascent = i9;
            fontMetricsInt.top = i9;
            return;
        }
        fontMetricsInt.bottom = floor;
    }

    public W7v(float f) {
        this.A00 = (int) Math.ceil((double) f);
    }
}
