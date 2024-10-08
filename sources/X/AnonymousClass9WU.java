package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.9WU  reason: invalid class name */
public final class AnonymousClass9WU extends Drawable {
    public final float A00;
    public final int A01;
    public final Paint A02;

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void draw(Canvas canvas) {
        float f = (float) this.A01;
        canvas.drawRect(0.0f, 0.0f, (float) ((int) (this.A00 * f)), f, this.A02);
    }

    public AnonymousClass9WU(Context context, float f, int i) {
        Paint paint = new Paint();
        this.A02 = paint;
        AnonymousClass7TE.A1N(context, paint, 2Yu.A08(context));
        this.A01 = i;
        this.A00 = f;
    }
}
