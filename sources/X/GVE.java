package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public final class GVE extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final float A04;
    public final Paint A05;
    public final Paint A06;
    public final RectF A07;

    private void A00(Canvas canvas, float f) {
        float f2 = this.A04;
        canvas.drawRect(0.0f, 0.0f, f, f2, this.A06);
        canvas.translate(f - f2, 0.0f);
        canvas.drawArc(this.A07, -90.0f, 90.0f, true, this.A05);
        canvas.translate(2.0f * f2, f2);
    }

    public final int getOpacity() {
        return -2;
    }

    public GVE(int i, float f, float f2) {
        float f3 = f + f2;
        this.A04 = f3;
        int[] iArr = {0, i, 0};
        float f4 = f2 / f3;
        float[] fArr = {f4 - 0.02f, f4, 1.0f};
        float f5 = f3 * 2.0f;
        this.A07 = new RectF(0.0f, 0.0f, f5, f5);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A05 = A0V;
        AnonymousClass7TE.A1Q(A0V);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        A0V.setShader(new RadialGradient(f3, f3, f3, iArr, fArr, tileMode));
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A06 = A0V2;
        A0V2.setShader(new LinearGradient(0.0f, f3, 0.0f, 0.0f, iArr, fArr, tileMode));
    }

    public final void onBoundsChange(Rect rect) {
        this.A01 = (float) rect.left;
        this.A02 = (float) rect.top;
        float f = this.A04 * 2.0f;
        this.A00 = ((float) rect.width()) - f;
        this.A03 = ((float) rect.height()) - f;
    }

    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
        this.A06.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
        this.A06.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.A01 + this.A04, this.A02);
        A00(canvas, this.A00);
        canvas.rotate(90.0f);
        A00(canvas, this.A03);
        canvas.rotate(90.0f);
        A00(canvas, this.A00);
        canvas.rotate(90.0f);
        A00(canvas, this.A03);
        canvas.restore();
    }
}
