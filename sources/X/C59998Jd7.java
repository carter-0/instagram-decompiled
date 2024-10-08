package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jd7  reason: case insensitive filesystem */
public final class C59998Jd7 extends Drawable implements Drawable.Callback {
    public Drawable A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C64617Lf3 A04;
    public final C262364Dk A05;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A00;
        if (drawable != null) {
            int i = this.A03;
            int i2 = this.A01;
            int i3 = (i - i2) / 2;
            int i4 = this.A02;
            int i5 = (int) (((double) i4) * 0.4d);
            drawable.setBounds(i3, i5, i2 + i3, i2 + i5);
            drawable.draw(canvas);
            C262364Dk r0 = this.A05;
            if (r0 != null) {
                r0.setBounds(0, 0, i, i4);
                r0.draw(canvas);
            }
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return ((int) (((double) this.A02) * 0.4d)) + this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public C59998Jd7(Context context, ImageUrl imageUrl) {
        C262364Dk r3;
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_width);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        Drawable A002 = AnonymousClass2dd.A00(context.getResources(), R.drawable.wave_hands_nux_asset_hands_multiple_nux);
        if (A002 instanceof C262364Dk) {
            r3 = (C262364Dk) A002;
        } else {
            r3 = null;
        }
        this.A05 = r3;
        C64617Lf3 lf3 = new C64617Lf3(1, context, this);
        this.A04 = lf3;
        1OO A0J = 1NK.A00().A0J(imageUrl, "profile_poke_nux");
        A0J.A02(lf3);
        A0J.A01();
        if (r3 != null) {
            r3.A01(new AZK(this, 0));
        }
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
