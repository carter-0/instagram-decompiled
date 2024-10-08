package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.8pj  reason: invalid class name and case insensitive filesystem */
public final class C366818pj implements Drawable.Callback {
    public final /* synthetic */ C366808pi A00;

    public C366818pj(C366808pi r1) {
        this.A00 = r1;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.A00.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.A00.scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.A00.unscheduleSelf(runnable);
    }
}
