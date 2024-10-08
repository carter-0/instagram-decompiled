package X;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: X.2i5  reason: invalid class name */
public abstract class AnonymousClass2i5 {
    public static final C226902i9 A00(Resources resources, Drawable drawable, Integer num, int i) {
        if (drawable != null) {
            return A01(drawable);
        }
        if (i != 0) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                return A01(resources.getDrawable(i));
            }
            return new AnonymousClass3OK(typedValue.data);
        } else if (num != null) {
            return new AnonymousClass3OK(num.intValue());
        } else {
            return null;
        }
    }

    public static final C226902i9 A01(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof ColorDrawable) {
            return new AnonymousClass3OK(((ColorDrawable) drawable).getColor());
        }
        return new AnonymousClass2i8(drawable);
    }
}
