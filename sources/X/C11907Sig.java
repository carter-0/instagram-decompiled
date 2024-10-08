package X;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Sig  reason: case insensitive filesystem */
public final class C11907Sig implements C13796ThF {
    public final AnimatedImageDrawable A00;

    public final Class Bne() {
        return Drawable.class;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.A00;
    }

    public final int getSize() {
        AnimatedImageDrawable animatedImageDrawable = this.A00;
        int intrinsicWidth = animatedImageDrawable.getIntrinsicWidth() * animatedImageDrawable.getIntrinsicHeight();
        int A08 = Pxe.A08(Bitmap.Config.ARGB_8888, C9911RjQ.A00);
        int i = 4;
        if (A08 == 1) {
            i = 1;
        } else if (A08 == 2 || A08 == 3) {
            i = 2;
        } else if (A08 == 4) {
            i = 8;
        }
        return intrinsicWidth * i * 2;
    }

    public final void recycle() {
        AnimatedImageDrawable animatedImageDrawable = this.A00;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }

    public C11907Sig(AnimatedImageDrawable animatedImageDrawable) {
        this.A00 = animatedImageDrawable;
    }
}
