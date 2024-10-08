package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.U0b  reason: case insensitive filesystem */
public final class C14655U0b extends Drawable {
    public final Paint A00;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = new RectF(getBounds());
        float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
        canvas.drawRoundRect(rectF, min, min, this.A00);
    }

    public final int getOpacity() {
        return this.A00.getAlpha();
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    public C14655U0b(int i, float f) {
        Paint A0D = JTP.A0D();
        JTO.A1N(A0D);
        A0D.setColor(i);
        A0D.setStrokeWidth(f);
        this.A00 = A0D;
    }
}
