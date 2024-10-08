package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.5ub  reason: invalid class name and case insensitive filesystem */
public abstract class C299115ub {
    public static final C226742hm A00(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            return (C226742hm) drawable;
        }
        throw new IllegalStateException("imageView.drawable is null");
    }
}
