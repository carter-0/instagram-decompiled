package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.Jct  reason: case insensitive filesystem */
public final class C59984Jct extends Drawable {
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final RectF A03 = AnonymousClass7TE.A0Y();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.drawOval(this.A03, this.A02);
    }

    @Deprecated(message = "Deprecated in Java", replaceWith = @ReplaceWith(expression = "PixelFormat.TRANSLUCENT", imports = {"android.graphics.PixelFormat"}))
    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A03.set(rect);
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        Paint paint = this.A02;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public C59984Jct(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A00 = i2;
        Paint A0D = JTP.A0D();
        A0D.setColor(i3);
        A0D.setStyle(Paint.Style.FILL_AND_STROKE);
        A0D.setStrokeWidth((float) i4);
        this.A02 = A0D;
    }
}
