package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: X.5zM  reason: invalid class name and case insensitive filesystem */
public final class C301485zM {
    public int A00;
    public int A01;
    public float[] A02;
    public float[] A03;
    public float A04;
    public final Paint A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final int A09;
    public final Paint A0A;
    public final Rect A0B = new Rect();
    public final boolean A0C;

    public static void A00(Canvas canvas, Paint paint, float[] fArr, float f, float f2, float f3, float f4) {
        int i;
        float f5;
        float[] fArr2 = fArr;
        int length = fArr.length;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        float f6 = f;
        float f7 = f2;
        float f8 = f3;
        if (length == 0) {
            f5 = f;
        } else {
            int i2 = 0;
            float f9 = fArr[0] - f4;
            float f10 = f2;
            float f11 = f6;
            float f12 = f6;
            Paint paint3 = paint2;
            while (true) {
                canvas.drawLine(f10, f11, f9, f12, paint3);
                i = length - 1;
                if (i2 >= i) {
                    break;
                }
                f10 = fArr2[i2] + 1.0f;
                i2++;
                f9 = fArr2[i2] - f4;
            }
            f7 = fArr2[i] + 1.0f;
            f5 = f6;
        }
        canvas2.drawLine(f7, f6, f8, f5, paint2);
    }

    public static void A01(Canvas canvas, Paint paint, float[] fArr, float f, float f2, float f3, float f4, int i) {
        int i2;
        int i3;
        float[] fArr2 = fArr;
        int length = fArr.length;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        float f5 = f;
        float f6 = f2;
        float f7 = f3;
        if (length != 0) {
            int i4 = 0;
            float f8 = fArr[0] - f4;
            float f9 = f;
            float f10 = f6;
            Paint paint3 = paint2;
            while (true) {
                canvas.drawLine(f9, f10, f, f8, paint3);
                i2 = length - 1;
                i3 = i;
                if (i4 >= i2) {
                    break;
                }
                f10 = fArr2[i4] + 1.0f + ((float) i3);
                i4++;
                f8 = fArr2[i4] - f4;
            }
            f6 = fArr2[i2] + 1.0f + ((float) i3);
        }
        canvas2.drawLine(f5, f6, f, f7, paint2);
    }

    public final void A02(Canvas canvas) {
        Canvas canvas2;
        if (this.A04 > 0.0f) {
            float[] fArr = this.A02;
            int length = fArr.length;
            int i = 0;
            while (true) {
                canvas2 = canvas;
                if (i >= length) {
                    break;
                }
                float f = fArr[i];
                Rect rect = this.A0B;
                canvas2.drawLine((float) rect.left, f, (float) rect.right, f, this.A05);
                i++;
            }
            for (float A012 : this.A03) {
                float[] fArr2 = this.A02;
                Rect rect2 = this.A0B;
                A01(canvas2, this.A05, fArr2, A012, (float) rect2.top, (float) rect2.bottom, this.A06, 0);
            }
            for (float f2 : this.A02) {
                float[] fArr3 = this.A03;
                float f3 = f2 - this.A07;
                Rect rect3 = this.A0B;
                float f4 = (float) rect3.left;
                float f5 = this.A06;
                Paint paint = this.A0A;
                A00(canvas2, paint, fArr3, f3, f4, (float) rect3.right, f5);
                A00(canvas2, paint, this.A03, f2 + 1.0f, (float) rect3.left, (float) rect3.right, f5);
            }
            for (float f6 : this.A03) {
                float[] fArr4 = this.A02;
                float f7 = this.A07;
                Rect rect4 = this.A0B;
                float f8 = (float) rect4.top;
                Paint paint2 = this.A0A;
                A01(canvas2, paint2, fArr4, f6 - f7, f8, (float) rect4.bottom, f7, 1);
                A01(canvas2, paint2, this.A02, f6 + 1.0f, (float) rect4.top, (float) rect4.bottom, f7, 1);
            }
        }
    }

    public final void A03(Rect rect) {
        int i;
        float f;
        Rect rect2 = this.A0B;
        rect2.set(rect);
        int i2 = rect2.right;
        int i3 = rect2.left;
        int i4 = this.A01;
        float f2 = ((float) (i2 - i3)) / ((float) i4);
        boolean z = this.A0C;
        int i5 = rect2.bottom;
        int i6 = rect2.top;
        float f3 = (float) (i5 - i6);
        if (z) {
            f3 -= this.A07 * 2.0f;
            i = this.A00;
            f = ((float) i) - 2.0f;
        } else {
            i = this.A00;
            f = (float) i;
        }
        float f4 = f3 / f;
        if (i > 1) {
            float[] fArr = this.A02;
            float f5 = this.A07;
            float f6 = ((float) i6) + f5;
            fArr[0] = f6;
            if (!z) {
                fArr[0] = f6 + (f4 - f5);
            }
            for (int i7 = 1; i7 < i - 1; i7++) {
                fArr[i7] = fArr[i7 - 1] + f4;
            }
        }
        if (i4 > 1) {
            float[] fArr2 = this.A03;
            fArr2[0] = ((float) i3) + f2;
            for (int i8 = 1; i8 < i4 - 1; i8++) {
                fArr2[i8] = fArr2[i8 - 1] + f2;
            }
        }
    }

    public final boolean A04(float f) {
        if (this.A04 == f) {
            return false;
        }
        this.A04 = f;
        this.A05.setAlpha((int) (((float) Color.alpha(this.A08)) * f));
        this.A0A.setAlpha((int) (((float) Color.alpha(this.A09)) * f));
        return true;
    }

    public C301485zM(float f, int i, int i2, int i3, int i4, boolean z) {
        Paint paint = new Paint();
        this.A05 = paint;
        Paint paint2 = new Paint();
        this.A0A = paint2;
        if (i < 1 || i2 < 1) {
            throw new IllegalArgumentException("Need at least 1 horizontal and 1 vertical grid");
        }
        this.A08 = i4;
        this.A09 = i3;
        paint.setColor(i4);
        paint.setStrokeWidth(f);
        paint2.setColor(i3);
        paint2.setStrokeWidth(1.0f);
        this.A04 = 1.0f;
        this.A07 = f;
        this.A06 = f - 1.0f;
        this.A0C = z;
        i2 = z ? i2 + 2 : i2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = new float[(i2 - 1)];
        this.A03 = new float[(i - 1)];
    }
}
