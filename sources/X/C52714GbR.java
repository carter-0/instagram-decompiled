package X;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: X.GbR  reason: case insensitive filesystem */
public abstract class C52714GbR {
    public static final void A00(Drawable drawable, TextView textView) {
        if (textView.getTextCursorDrawable() != drawable) {
            textView.setTextCursorDrawable(drawable);
        }
    }
}
