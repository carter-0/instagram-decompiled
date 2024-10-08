package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9WY  reason: invalid class name */
public final class AnonymousClass9WY extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public final Matrix A05 = AnonymousClass7TE.A0U();
    public final Paint A06 = new Paint();
    public final Path A07 = new Path();

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        Path path = this.A07;
        path.reset();
        path.moveTo(this.A02 + this.A00, 0.0f);
        path.rLineTo(-this.A02, 0.0f);
        float f = this.A00;
        float f2 = -f;
        path.rQuadTo(f2, 0.0f, f2, f);
        path.rLineTo(0.0f, this.A02);
        float f3 = this.A03 / 2.0f;
        path.offset(f3, f3);
        float f4 = this.A04 / 2.0f;
        float f5 = this.A01 / 2.0f;
        Matrix matrix = this.A05;
        matrix.reset();
        int i = 0;
        do {
            matrix.setRotate(90.0f, f4, f5);
            path.addPath(path, matrix);
            i++;
        } while (i < 3);
        canvas.drawPath(path, this.A06);
    }

    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    public final void onBoundsChange(Rect rect) {
        this.A04 = (float) rect.width();
        this.A01 = (float) rect.height();
        float f = this.A04;
        this.A02 = 0.033f * f;
        this.A00 = 0.041f * f;
        this.A03 = f * 0.015f;
        Paint paint = this.A06;
        int alpha = paint.getAlpha();
        paint.setColor(-1);
        paint.setAlpha(alpha);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(this.A03);
        paint.setAntiAlias(true);
    }
}
