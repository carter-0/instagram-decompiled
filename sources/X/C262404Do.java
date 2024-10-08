package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;

/* renamed from: X.4Do  reason: invalid class name and case insensitive filesystem */
public abstract class C262404Do extends Drawable implements Drawable.Callback, C262414Dp {
    public Drawable A00;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    public final boolean getPadding(Rect rect) {
        0qQ.A0B(rect, 0);
        return this.A00.getPadding(rect);
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A00.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final boolean setState(int[] iArr) {
        0qQ.A0B(iArr, 0);
        return this.A00.setState(iArr);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public final int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public final Drawable getCurrent() {
        Drawable current = this.A00.getCurrent();
        0qQ.A07(current);
        return current;
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

    @Deprecated(message = "Deprecated API")
    public final int getOpacity() {
        return this.A00.getOpacity();
    }

    public final int[] getState() {
        int[] state = this.A00.getState();
        0qQ.A07(state);
        return state;
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

    @Deprecated(message = "Deprecated API")
    public final void setDither(boolean z) {
        this.A00.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.A00.setFilterBitmap(z);
    }

    public final void setHotspot(float f, float f2) {
        this.A00.setHotspot(f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.A00.setHotspotBounds(i, i2, i3, i4);
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
        if (super.setVisible(z, z2) || this.A00.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
