package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public final class U1O extends Drawable implements Drawable.Callback, AnonymousClass1MK {
    public float A00;
    public Drawable A01;

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        Bitmap bitmap = r7.A01;
        17k.A0E(AnonymousClass7TF.A1V(bitmap));
        0qQ.A0B(bitmap, 1);
        C240563Lj r0 = new C240563Lj(bitmap, false);
        this.A01 = r0;
        r0.setCallback(this);
        this.A01.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.A01;
        if (drawable != null && this.A00 > 0.0f) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float f = this.A00;
            float max = Math.max(f / ((float) intrinsicWidth), f / ((float) intrinsicHeight));
            canvas.save();
            AnonymousClass7TG.A0z(canvas, this);
            canvas.scale(max, max);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public final int getIntrinsicHeight() {
        return (int) this.A00;
    }

    public final int getIntrinsicWidth() {
        return (int) this.A00;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
