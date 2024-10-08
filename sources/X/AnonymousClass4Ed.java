package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.4Ed  reason: invalid class name */
public abstract class AnonymousClass4Ed {
    public static final TypedValue A00 = new TypedValue();

    public static final Drawable A01(Context context, int i, int i2) {
        0qQ.A0B(context, 0);
        int color = context.getColor(i2);
        try {
            Drawable drawable = context.getDrawable(i);
            if (drawable == null) {
                return null;
            }
            Drawable mutate = drawable.mutate();
            0qQ.A07(mutate);
            mutate.setColorFilter(AnonymousClass37O.A00(color));
            return mutate;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static final void A02(Context context, Drawable drawable, int i) {
        0qQ.A0B(context, 0);
        0qQ.A0B(drawable, 1);
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = A00;
        theme.resolveAttribute(i, typedValue, true);
        drawable.setColorFilter(AnonymousClass37O.A00(typedValue.data));
    }

    public static final void A03(Context context, ImageView imageView, int i) {
        0qQ.A0B(imageView, 1);
        imageView.setColorFilter(AnonymousClass37O.A00(context.getColor(i)));
    }

    public static final void A04(TextView textView) {
        0qQ.A0B(textView, 0);
        int currentTextColor = textView.getCurrentTextColor();
        for (Drawable drawable : textView.getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(currentTextColor, PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public static final Drawable A00(Context context, int i) {
        Drawable drawable;
        0qQ.A0B(context, 0);
        if (i == 0 || (drawable = context.getDrawable(i)) == null) {
            return null;
        }
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = A00;
        theme.resolveAttribute(R.attr.glyphColorPrimary, typedValue, true);
        drawable.setColorFilter(AnonymousClass37O.A00(typedValue.data));
        return drawable;
    }
}
