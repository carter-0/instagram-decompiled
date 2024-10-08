package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;

/* renamed from: X.Gcb  reason: case insensitive filesystem */
public final class C52784Gcb extends Drawable {
    public final Paint A00 = new Paint();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.drawRect(getBounds(), this.A00);
    }

    @Deprecated(message = "Deprecated in superclass")
    public final int getOpacity() {
        return this.A00.getAlpha();
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }
}
