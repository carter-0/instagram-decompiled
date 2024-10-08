package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

public final class U1K extends Drawable implements Drawable.Callback {
    public int A00;
    public int A01;
    public final Drawable A02;
    public final Drawable A03;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A03.draw(canvas);
        this.A02.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public U1K(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.hero_carousel_scrollbar_track);
        if (drawable != null) {
            this.A03 = drawable;
            drawable.setCallback(this);
            Drawable drawable2 = context.getDrawable(R.drawable.hero_carousel_scrollbar_thumb);
            if (drawable2 != null) {
                this.A02 = drawable2;
                drawable2.setCallback(this);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A00(U1K u1k) {
        Rect A0X = AnonymousClass7TE.A0X(u1k);
        u1k.A03.setBounds(A0X);
        Drawable drawable = u1k.A02;
        int i = A0X.left + u1k.A01;
        drawable.setBounds(i, A0X.top, i + u1k.A00, A0X.bottom);
        u1k.invalidateSelf();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        A00(this);
    }
}
