package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* renamed from: X.Jcj  reason: case insensitive filesystem */
public abstract class C59974Jcj extends Drawable {
    public final Drawable A00;

    public void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return 0;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Gravity.apply(17, bounds.width(), bounds.height(), rect, bounds);
        }
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public C59974Jcj(Drawable drawable) {
        this.A00 = drawable;
    }
}
