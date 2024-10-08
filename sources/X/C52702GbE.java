package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.GbE  reason: case insensitive filesystem */
public final class C52702GbE extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final RectF A08 = AnonymousClass7TE.A0Y();

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    public C52702GbE(int i, int i2, float f) {
        Paint paint = new Paint();
        this.A07 = paint;
        paint.setAntiAlias(false);
        paint.setDither(true);
        AnonymousClass7TE.A1Q(paint);
        this.A03 = f;
        this.A06 = i;
        this.A05 = i2;
        this.A04 = ((float) Color.alpha(i)) / 255.0f;
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A07);
        canvas.restoreToCount(save);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A08;
        float f = this.A03;
        rectF.set(((float) rect.left) + f, ((float) rect.top) + f, ((float) rect.right) - f, ((float) rect.bottom) - f);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        float width = ((float) rect.width()) / 2.0f;
        this.A02 = width;
        if (width > 0.0f) {
            float f2 = f / width;
            float f3 = 1.0f - f2;
            float f4 = (f2 * 0.25f) + f3;
            if (f4 > 1.0f) {
                1Kn.A02("CDSCircularShadowDrawable", 002.A0N("Gradient quarter fraction cannot be greater than 1, value is: ", f4));
                return;
            }
            float[] fArr = {0.0f, f3, f3, f4, 1.0f};
            int i = this.A05;
            int i2 = this.A06;
            float f5 = this.A04;
            this.A07.setShader(new RadialGradient(this.A00, this.A01, width, new int[]{i, i, C52686Gay.A00(i2, f5), C52686Gay.A00(i2, f5 * 0.66f), 16777215}, fArr, Shader.TileMode.CLAMP));
        }
    }
}
