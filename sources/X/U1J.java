package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class U1J extends Drawable implements Drawable.Callback {
    public U0V A00;

    public final void draw(Canvas canvas) {
        U0V u0v = this.A00;
        if (u0v.A01.getLevel() != 0) {
            u0v.A01.draw(canvas);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        U0V u0v = this.A00;
        if (!u0v.A03) {
            u0v.A02 = AnonymousClass7TF.A1V(u0v.A01.getConstantState());
            u0v.A03 = true;
        }
        if (!u0v.A02) {
            return null;
        }
        u0v.A00 = getChangingConfigurations();
        return u0v;
    }

    public final int getIntrinsicHeight() {
        return this.A00.A01.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A00.A01.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return this.A00.A01.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        return this.A00.A01.getPadding(rect);
    }

    public final boolean isStateful() {
        return this.A00.A01.isStateful();
    }

    public final boolean onLevelChange(int i) {
        this.A00.A01.setLevel(i);
        A00();
        invalidateSelf();
        return true;
    }

    public final boolean onStateChange(int[] iArr) {
        return this.A00.A01.setState(iArr);
    }

    public final void setAlpha(int i) {
        this.A00.A01.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.A01.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        this.A00.A01.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$ConstantState, X.U0V] */
    public U1J(Resources resources, U0V u0v) {
        Drawable newDrawable;
        ? constantState = new Drawable.ConstantState();
        if (u0v != null) {
            Drawable.ConstantState constantState2 = u0v.A01.getConstantState();
            constantState2.getClass();
            if (resources != null) {
                newDrawable = constantState2.newDrawable(resources);
            } else {
                newDrawable = constantState2.newDrawable();
            }
            constantState.A01 = newDrawable;
            newDrawable.setCallback(this);
            constantState.A02 = true;
            constantState.A03 = true;
        }
        this.A00 = constantState;
    }

    public void A00() {
        Rect bounds = getBounds();
        U0V u0v = this.A00;
        int width = (int) (((double) (bounds.width() * u0v.A01.getLevel())) / 10000.0d);
        int intrinsicWidth = u0v.A01.getIntrinsicWidth();
        if (((double) width) < ((double) intrinsicWidth) / 2.0d) {
            width = 0;
        } else if (width < intrinsicWidth) {
            width = intrinsicWidth;
        }
        Drawable drawable = u0v.A01;
        int i = bounds.left;
        drawable.setBounds(i, bounds.top, i + width, bounds.bottom);
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        U0V u0v = this.A00;
        return changingConfigurations | u0v.A00 | u0v.A01.getChangingConfigurations();
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void onBoundsChange(Rect rect) {
        A00();
    }
}
