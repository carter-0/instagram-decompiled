package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.2hK  reason: invalid class name and case insensitive filesystem */
public final class C226582hK extends Drawable {
    public final Paint A00;
    public final int A01;
    public final RectF A02 = new RectF();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.drawOval(this.A02, this.A00);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A02;
        rectF.set(rect);
        float f = (float) this.A01;
        rectF.inset(f, f);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setAlpha(int i) {
        Paint paint = this.A00;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public C226582hK(int i, int i2) {
        Paint paint = new Paint(1);
        this.A00 = paint;
        float f = (float) i;
        this.A01 = (int) (f / 2.0f);
        paint.setColor(i2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
    }
}
