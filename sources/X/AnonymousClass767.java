package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.767  reason: invalid class name */
public abstract class AnonymousClass767 {
    public static final void A00(Drawable.Callback callback, Drawable drawable, AnonymousClass764 r2) {
        AnonymousClass765 r1;
        if (drawable != null) {
            drawable.setCallback(callback);
            if ((drawable instanceof AnonymousClass765) && (r1 = (AnonymousClass765) drawable) != null) {
                r1.Ep9(r2);
            }
        }
    }

    public static final void A01(Drawable drawable, Drawable drawable2) {
        if (drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }
}
