package X;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: X.VrJ  reason: case insensitive filesystem */
public final class C18414VrJ {
    public final C64721Te A00;

    public static final Drawable A00(Resources resources, Drawable drawable, 1U1 r6) {
        Drawable uix;
        C226672hf r2 = r6.A0J;
        if (r2 != null) {
            if (drawable instanceof BitmapDrawable) {
                drawable = new C14982UIa(resources, ((BitmapDrawable) drawable).getBitmap());
            } else {
                if (drawable instanceof NinePatchDrawable) {
                    uix = new U1X(drawable);
                } else if (drawable instanceof ColorDrawable) {
                    uix = new U1W(((ColorDrawable) drawable).getColor());
                    0qQ.A0C(uix, "null cannot be cast to non-null type T of com.facebook.fresco.vito.drawable.RoundingUtils.getRoundedDrawable");
                } else {
                    uix = new UIX(drawable);
                }
                drawable = uix;
            }
            if (!r2.A02) {
                float[] fArr = r2.A03;
                if (fArr != null) {
                    ((X7S) drawable).Ehg(fArr);
                } else {
                    ((X7S) drawable).Ehh(r2.A00);
                    return drawable;
                }
            } else {
                ((X7S) drawable).ERU(true);
                return drawable;
            }
        }
        return drawable;
    }

    public C18414VrJ(C64721Te r1) {
        this.A00 = r1;
    }
}
