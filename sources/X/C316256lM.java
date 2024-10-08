package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.6lM  reason: invalid class name and case insensitive filesystem */
public final class C316256lM extends Drawable {
    public Path A00;
    public final Paint A01;
    public final float A02;
    public final int A03;
    public final RectF A04 = new RectF();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        int i = this.A03;
        if ((i & 15) == 15) {
            RectF rectF = this.A04;
            float f = this.A02;
            canvas.drawRoundRect(rectF, f, f, this.A01);
            return;
        }
        Path path = this.A00;
        if (path == null) {
            float f2 = this.A02;
            RectF rectF2 = this.A04;
            path = C63118Krm.A00(f2, 0.0f, 0.0f, rectF2.width(), rectF2.height(), i);
            this.A00 = path;
        }
        canvas.drawPath(path, this.A01);
    }

    @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "PixelFormat.TRANSLUCENT", imports = {"android.graphics.PixelFormat"}))
    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A04.set(rect);
        this.A00 = null;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setAlpha(int i) {
        Paint paint = this.A01;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public C316256lM(float f, int i, int i2, int i3) {
        this.A02 = f;
        this.A03 = i3;
        Paint paint = new Paint(1);
        paint.setColor(i2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) i);
        this.A01 = paint;
    }
}
