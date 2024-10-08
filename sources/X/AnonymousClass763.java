package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.763  reason: invalid class name */
public class AnonymousClass763 extends Drawable implements Drawable.Callback, AnonymousClass764, AnonymousClass765 {
    public static final Matrix A03 = new Matrix();
    public Drawable A00;
    public AnonymousClass764 A01;
    public final AnonymousClass766 A02 = new AnonymousClass766();

    public Drawable A01(Drawable drawable) {
        Drawable drawable2 = this.A00;
        AnonymousClass767.A00((Drawable.Callback) null, drawable2, (AnonymousClass764) null);
        AnonymousClass767.A00((Drawable.Callback) null, drawable, (AnonymousClass764) null);
        AnonymousClass766 r0 = this.A02;
        if (!(drawable == null || r0 == null)) {
            r0.A01(drawable);
        }
        AnonymousClass767.A01(drawable, this);
        AnonymousClass767.A00(this, drawable, this);
        this.A00 = drawable;
        invalidateSelf();
        return drawable2;
    }

    public final void Bob(RectF rectF) {
        AnonymousClass764 r0 = this.A01;
        if (r0 != null) {
            r0.Bob(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void C9Q(Matrix matrix) {
        AnonymousClass764 r0 = this.A01;
        if (r0 != null) {
            r0.C9Q(matrix);
        } else {
            matrix.reset();
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    public final Drawable getCurrent() {
        return this.A00;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    public final boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return super.onLevelChange(i);
        }
        return drawable.setLevel(i);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    public final void setAlpha(int i) {
        this.A02.A00 = i;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.A00(colorFilter);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public final void setDither(boolean z) {
        this.A02.A01 = z ? 1 : 0;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public final void setFilterBitmap(boolean z) {
        this.A02.A02 = z ? 1 : 0;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public AnonymousClass763(Drawable drawable) {
        this.A00 = drawable;
        AnonymousClass767.A00(this, drawable, this);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return visible;
    }

    public final void Ep9(AnonymousClass764 r1) {
        this.A01 = r1;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
