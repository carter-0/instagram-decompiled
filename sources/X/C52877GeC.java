package X;

import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;

/* renamed from: X.GeC  reason: case insensitive filesystem */
public final class C52877GeC extends ProgressBar {
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        super.setIndeterminateDrawable(drawable);
    }
}
