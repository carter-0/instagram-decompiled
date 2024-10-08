package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: X.V5n  reason: case insensitive filesystem */
public abstract class C16780V5n {
    public static final void A00(Drawable drawable, float f) {
        drawable.setLevel(AnonymousClass7TE.A06(f, 10000.0f));
        boolean A1T = Pxg.A1T(drawable.getLevel(), 9990);
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (A1T) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }
}
