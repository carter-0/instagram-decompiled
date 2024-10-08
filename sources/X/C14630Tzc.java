package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import kotlin.Deprecated;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.Tzc  reason: case insensitive filesystem */
public final class C14630Tzc extends Drawable implements Drawable.Callback {
    public float A00 = 1.0f;
    public final Drawable A01;
    public final Rect A02 = new Rect();

    public C14630Tzc(Drawable drawable) {
        0qQ.A0B(drawable, 1);
        this.A01 = drawable;
        drawable.setCallback(this);
    }

    public final void applyTheme(Resources.Theme theme) {
        0qQ.A0B(theme, 0);
        this.A01.applyTheme(theme);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
    }

    public final void getHotspotBounds(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A01.getHotspotBounds(rect);
    }

    public final void getOutline(Outline outline) {
        0qQ.A0B(outline, 0);
        this.A01.getOutline(outline);
    }

    public final boolean getPadding(Rect rect) {
        0qQ.A0B(rect, 0);
        return this.A01.getPadding(rect);
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        int A06 = AnonymousClass7TE.A06((float) rect.width(), this.A00);
        int A062 = AnonymousClass7TE.A06((float) rect.height(), this.A00);
        Rect rect2 = this.A02;
        Drawable drawable = this.A01;
        Gravity.apply(17, A06, A062, rect, rect2, drawable.getLayoutDirection());
        drawable.setBounds(rect2);
    }

    public final boolean onStateChange(int[] iArr) {
        0qQ.A0B(iArr, 0);
        boolean state = this.A01.setState(iArr);
        if (state) {
            onBoundsChange(AnonymousClass7TE.A0X(this));
        }
        return state;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        0qQ.A0B(runnable, 0);
        this.A01.scheduleSelf(runnable, j);
    }

    public final boolean setState(int[] iArr) {
        0qQ.A0B(iArr, 0);
        return this.A01.setState(iArr);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void unscheduleSelf(Runnable runnable) {
        0qQ.A0B(runnable, 0);
        this.A01.unscheduleSelf(runnable);
    }

    public final boolean canApplyTheme() {
        return this.A01.canApplyTheme();
    }

    public final void clearColorFilter() {
        this.A01.clearColorFilter();
    }

    public final int getAlpha() {
        return this.A01.getAlpha();
    }

    public final int getChangingConfigurations() {
        return this.A01.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        return this.A01.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        return this.A01.getConstantState();
    }

    public final Drawable getCurrent() {
        Drawable current = this.A01.getCurrent();
        0qQ.A07(current);
        return current;
    }

    public final int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A01.getIntrinsicWidth();
    }

    public final int getLayoutDirection() {
        return this.A01.getLayoutDirection();
    }

    public final int getMinimumHeight() {
        return this.A01.getMinimumHeight();
    }

    public final int getMinimumWidth() {
        return this.A01.getMinimumWidth();
    }

    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        return this.A01.getOpacity();
    }

    public final Insets getOpticalInsets() {
        Insets opticalInsets = this.A01.getOpticalInsets();
        0qQ.A07(opticalInsets);
        return opticalInsets;
    }

    public final int[] getState() {
        int[] state = this.A01.getState();
        0qQ.A07(state);
        return state;
    }

    public final Region getTransparentRegion() {
        return this.A01.getTransparentRegion();
    }

    public final boolean hasFocusStateSpecified() {
        return this.A01.hasFocusStateSpecified();
    }

    public final void invalidateSelf() {
        this.A01.invalidateSelf();
    }

    public final boolean isAutoMirrored() {
        return this.A01.isAutoMirrored();
    }

    public final boolean isFilterBitmap() {
        return this.A01.isFilterBitmap();
    }

    public final boolean isProjected() {
        return this.A01.isProjected();
    }

    public final boolean isStateful() {
        return this.A01.isStateful();
    }

    public final void jumpToCurrentState() {
        this.A01.jumpToCurrentState();
    }

    public final Drawable mutate() {
        this.A01.mutate();
        Drawable mutate = super.mutate();
        0qQ.A07(mutate);
        return mutate;
    }

    public final boolean onLayoutDirectionChanged(int i) {
        return this.A01.onLayoutDirectionChanged(i);
    }

    public final boolean onLevelChange(int i) {
        return this.A01.setLevel(i);
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public final void setAutoMirrored(boolean z) {
        this.A01.setAutoMirrored(z);
    }

    public final void setChangingConfigurations(int i) {
        this.A01.setChangingConfigurations(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    @Deprecated(message = "Deprecated in Java")
    public final void setDither(boolean z) {
        this.A01.setDither(z);
    }

    public final void setFilterBitmap(boolean z) {
        this.A01.setFilterBitmap(z);
    }

    public final void setHotspot(float f, float f2) {
        this.A01.setHotspot(f, f2);
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.A01.setHotspotBounds(i, i2, i3, i4);
    }

    public final void setTintBlendMode(BlendMode blendMode) {
        this.A01.setTintBlendMode(blendMode);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.A01.setTintList(colorStateList);
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        this.A01.setTintMode(mode);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return this.A01.setVisible(z, z2);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        AnonymousClass7TG.A1T(resources, xmlPullParser, attributeSet);
        this.A01.inflate(resources, xmlPullParser, attributeSet);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        AnonymousClass7TG.A1T(resources, xmlPullParser, attributeSet);
        this.A01.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
