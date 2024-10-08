package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Mrc  reason: case insensitive filesystem */
public abstract class C67649Mrc extends Drawable implements Drawable.Callback {
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public static int A00(Canvas canvas, Drawable drawable, float f) {
        float centerX = (float) drawable.getBounds().centerX();
        float f2 = (float) drawable.getBounds().top;
        int save = canvas.save();
        canvas.scale(1.0f, f, centerX, f2);
        return save;
    }

    public static void A01(Rect rect, RectF rectF) {
        rectF.set(new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom));
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
