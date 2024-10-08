package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.7kj  reason: invalid class name and case insensitive filesystem */
public abstract class C340117kj {
    public static final void A00(View view, float f) {
        Drawable mutate;
        Drawable background = view.getBackground();
        if (background != null && (mutate = background.mutate()) != null) {
            mutate.setAlpha((int) (255.0f * f));
        }
    }
}
