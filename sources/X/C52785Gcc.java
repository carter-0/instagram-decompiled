package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gcc  reason: case insensitive filesystem */
public final class C52785Gcc extends Drawable {
    public final Paint A00 = new Paint();
    public final Rect A01 = AnonymousClass7TE.A0W();

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.clipOutRect(this.A01);
        canvas.drawRect(getBounds(), this.A00);
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
}
