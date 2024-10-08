package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public final class U1G extends Drawable implements Drawable.Callback {
    public Drawable A00;
    public boolean A01;

    public final void draw(Canvas canvas) {
        if (this.A01) {
            this.A00.draw(canvas);
        }
    }

    public final int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        return this.A00.getCurrent();
    }

    public final int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    public final int getMinimumHeight() {
        return this.A00.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.A00.getMinimumWidth();
    }

    public final int getOpacity() {
        return this.A00.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.A00.getPadding(rect);
    }

    public final int[] getState() {
        return this.A00.getState();
    }

    public final Region getTransparentRegion() {
        return this.A00.getTransparentRegion();
    }

    public final boolean isAutoMirrored() {
        return this.A00.isAutoMirrored();
    }

    public final boolean isStateful() {
        return this.A00.isStateful();
    }

    public final void jumpToCurrentState() {
        this.A00.jumpToCurrentState();
    }

    public final void onBoundsChange(Rect rect) {
        this.A00.setBounds(rect);
    }

    public final boolean onLevelChange(int i) {
        return this.A00.setLevel(i);
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        this.A00.setAutoMirrored(z);
    }

    public final void setChangingConfigurations(int i) {
        this.A00.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    public final void setDither(boolean z) {
        this.A00.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.A00.setFilterBitmap(z);
    }

    public final void setHotspot(float f, float f2) {
        if (this.A01) {
            this.A00.setHotspot(f, f2);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.A01) {
            this.A00.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.A01) {
            return this.A00.setState(iArr);
        }
        return false;
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
        if (!this.A01) {
            return false;
        }
        if (super.setVisible(z, z2) || this.A00.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
