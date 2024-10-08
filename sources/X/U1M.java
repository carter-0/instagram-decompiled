package X;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public abstract class U1M extends Drawable implements Drawable.Callback, AnonymousClass764, AnonymousClass765 {
    public AnonymousClass764 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Drawable[] A04;
    public final Rect A05 = new Rect();
    public final AnonymousClass766 A06 = new AnonymousClass766();

    public final Drawable A02(int i) {
        boolean z = true;
        Pxe.A1Z(Pxf.A1R(i));
        Drawable[] drawableArr = this.A04;
        if (i >= drawableArr.length) {
            z = false;
        }
        Pxe.A1Z(z);
        return drawableArr[i];
    }

    public final void A03(Drawable drawable, int i) {
        boolean z = true;
        Pxe.A1Z(Pxf.A1R(i));
        Drawable[] drawableArr = this.A04;
        if (i >= drawableArr.length) {
            z = false;
        }
        Pxe.A1Z(z);
        if (drawable != drawableArr[i]) {
            if (drawable != null && this.A01) {
                drawable.mutate();
            }
            AnonymousClass767.A00((Drawable.Callback) null, drawableArr[i], (AnonymousClass764) null);
            AnonymousClass767.A00((Drawable.Callback) null, drawable, (AnonymousClass764) null);
            AnonymousClass766 r0 = this.A06;
            if (!(drawable == null || r0 == null)) {
                r0.A01(drawable);
            }
            AnonymousClass767.A01(drawable, this);
            AnonymousClass767.A00(this, drawable, this);
            this.A03 = false;
            drawableArr[i] = drawable;
            invalidateSelf();
        }
    }

    public int getIntrinsicHeight() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i = 0;
        int i2 = -1;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                i2 = Math.max(i2, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (i2 > 0) {
            return i2;
        }
        return -1;
    }

    public final boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.A05;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    public final Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.mutate();
                }
                i++;
            } else {
                this.A01 = true;
                return this;
            }
        }
    }

    public final void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setBounds(rect);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    public final boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    public final void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void Bob(RectF rectF) {
        AnonymousClass764 r0 = this.A00;
        if (r0 != null) {
            r0.Bob(rectF);
        } else {
            C13988Tno.A0v(rectF, this);
        }
    }

    public final void C9Q(Matrix matrix) {
        AnonymousClass764 r0 = this.A00;
        if (r0 != null) {
            r0.C9Q(matrix);
        } else {
            matrix.reset();
        }
    }

    public final void Ep9(AnonymousClass764 r1) {
        this.A00 = r1;
    }

    public final int getOpacity() {
        Drawable[] drawableArr = this.A04;
        int length = drawableArr.length;
        int i = -2;
        if (length != 0) {
            i = -1;
            for (int i2 = 1; i2 < length; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    i = Drawable.resolveOpacity(i, drawable.getOpacity());
                }
            }
        }
        return i;
    }

    public final boolean isStateful() {
        if (!this.A03) {
            this.A02 = false;
            boolean z = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.A04;
                boolean z2 = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                if (drawable == null || !drawable.isStateful()) {
                    z2 = false;
                }
                z |= z2;
                this.A02 = z;
                i++;
            }
            this.A03 = true;
        }
        return this.A02;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.A00(colorFilter);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void setDither(boolean z) {
        this.A06.A01 = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setDither(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void setFilterBitmap(boolean z) {
        this.A06.A02 = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i < drawableArr.length) {
                Drawable drawable = drawableArr[i];
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public U1M(Drawable[] drawableArr) {
        int i = 0;
        this.A02 = false;
        this.A03 = false;
        this.A01 = false;
        this.A04 = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.A04;
            if (i < drawableArr2.length) {
                AnonymousClass767.A00(this, drawableArr2[i], this);
                i++;
            } else {
                return;
            }
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.A04;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
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
