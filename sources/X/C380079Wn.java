package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.9Wn  reason: invalid class name and case insensitive filesystem */
public final class C380079Wn extends Drawable implements Drawable.Callback {
    public final Drawable A00;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        Drawable drawable = this.A00;
        Rect rect2 = new Rect(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float exactCenterX = rect2.exactCenterX();
        float exactCenterY = rect2.exactCenterY();
        rect2.offset((int) (rect.exactCenterX() - exactCenterX), (int) (rect.exactCenterY() - exactCenterY));
        drawable.setBounds(rect2);
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    public final void setTint(int i) {
        this.A00.setTint(i);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.A00.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.A00.setTintMode(mode);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return this.A00.setVisible(z, z2);
    }

    public C380079Wn(Drawable drawable) {
        this.A00 = drawable;
        drawable.setCallback(this);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass7TH.A0L(this, runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass7TH.A0M(this, runnable, j);
    }
}
