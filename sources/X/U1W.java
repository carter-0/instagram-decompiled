package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

public final class U1W extends Drawable implements X7S {
    public int A00 = 0;
    public int A01 = 255;
    public boolean A02 = false;
    public final Paint A03 = JTP.A0D();
    public final Path A04 = new Path();
    public final Path A05 = new Path();
    public final float[] A06 = new float[8];
    public final RectF A07 = new RectF();
    public final float[] A08 = new float[8];

    public final void ERU(boolean z) {
        this.A02 = true;
        A00();
        invalidateSelf();
    }

    public final void Ehg(float[] fArr) {
        0He.A01(AnonymousClass7TF.A1S(fArr.length, 8), "radii should have exactly 8 values");
        System.arraycopy(fArr, 0, this.A08, 0, 8);
        A00();
        invalidateSelf();
    }

    public final void Ehh(float f) {
        0He.A01(Pxf.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))), "radius should be non negative");
        Arrays.fill(this.A08, f);
        A00();
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private void A00() {
        float[] fArr;
        Path path = this.A05;
        path.reset();
        Path path2 = this.A04;
        path2.reset();
        RectF rectF = this.A07;
        C13988Tno.A0v(rectF, this);
        float f = 0.0f / 2.0f;
        rectF.inset(f, f);
        if (this.A02) {
            C13992Tns.A0X(path2, rectF);
        } else {
            int i = 0;
            while (true) {
                fArr = this.A06;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.A08[i] + 0.0f) - f;
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f2 = -0.0f / 2.0f;
        rectF.inset(f2, f2);
        float f3 = 0.0f + 0.0f;
        rectF.inset(f3, f3);
        if (this.A02) {
            C13992Tns.A0X(path, rectF);
        } else {
            path.addRoundRect(rectF, this.A08, Path.Direction.CW);
        }
        float f4 = -f3;
        rectF.inset(f4, f4);
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.A03;
        int i = this.A00;
        C13988Tno.A0p(C13990Tnq.A05(this.A01, i, i), paint);
        paint.setFilterBitmap(false);
        canvas.drawPath(this.A05, paint);
    }

    public final int getAlpha() {
        return this.A01;
    }

    public final int getOpacity() {
        int i = this.A00;
        int A052 = C13990Tnq.A05(this.A01, i, i) >>> 24;
        if (A052 == 0) {
            return -2;
        }
        if (A052 != 255) {
            return -3;
        }
        return -1;
    }

    public final void setAlpha(int i) {
        if (i != this.A01) {
            this.A01 = i;
            invalidateSelf();
        }
    }

    public U1W(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            invalidateSelf();
        }
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00();
    }
}
