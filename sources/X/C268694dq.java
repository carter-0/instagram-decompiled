package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.4dq  reason: invalid class name and case insensitive filesystem */
public abstract class C268694dq extends Drawable implements Drawable.Callback {
    public abstract List A07();

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public void setAlpha(int i) {
        for (Drawable drawable : A07()) {
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        for (Drawable drawable : A07()) {
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
