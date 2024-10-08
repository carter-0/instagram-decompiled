package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: X.5i9  reason: invalid class name and case insensitive filesystem */
public final class C291955i9 implements LineHeightSpan {
    public int A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A02 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A03;
    public int A04 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A05;
    public final float A06;
    public final float A07;
    public final boolean A08;
    public final boolean A09;
    public final int A0A;

    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5;
        float f;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        int i6 = fontMetricsInt2.descent;
        int i7 = fontMetricsInt2.ascent;
        int i8 = i6 - i7;
        if (i8 > 0) {
            boolean z = true;
            boolean z2 = false;
            if (i == 0) {
                z2 = true;
            }
            if (i2 != this.A0A) {
                z = false;
            }
            if (!z2 || !z || !this.A08 || !this.A09) {
                int i9 = this.A02;
                if (i9 == Integer.MIN_VALUE) {
                    int ceil = (int) ((float) Math.ceil((double) this.A06));
                    int i10 = ceil - i8;
                    float f2 = this.A07;
                    if (f2 == -1.0f) {
                        f2 = Math.abs((float) i7) / ((float) i8);
                    }
                    float f3 = (float) i10;
                    if (i10 <= 0) {
                        f = f3 * f2;
                    } else {
                        f = f3 * (1.0f - f2);
                    }
                    int ceil2 = i6 + ((int) ((float) Math.ceil((double) f)));
                    this.A01 = ceil2;
                    i9 = ceil2 - ceil;
                    this.A00 = i9;
                    if (this.A08) {
                        i9 = i7;
                    }
                    this.A02 = i9;
                    if (this.A09) {
                        ceil2 = i6;
                    }
                    this.A04 = ceil2;
                    this.A03 = i7 - i9;
                    this.A05 = ceil2 - i6;
                }
                if (!z2) {
                    i9 = this.A00;
                }
                fontMetricsInt2.ascent = i9;
                if (z) {
                    i5 = this.A04;
                } else {
                    i5 = this.A01;
                }
                fontMetricsInt2.descent = i5;
            }
        }
    }

    public C291955i9(float f, float f2, int i, boolean z, boolean z2) {
        this.A06 = f;
        this.A0A = i;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = f2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }
}
