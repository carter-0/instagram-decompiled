package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;

/* renamed from: X.6Km  reason: invalid class name and case insensitive filesystem */
public final class C306026Km {
    public static C306036Kn A00;
    public static C306036Kn A01;
    public static final C306026Km A02 = new Object();

    public static final Drawable A00(Context context) {
        C306036Kn r1;
        if (0mk.A02(context)) {
            r1 = A01;
            if (r1 == null) {
                Context applicationContext = context.getApplicationContext();
                0qQ.A07(applicationContext);
                r1 = new C306036Kn(applicationContext);
                A01 = r1;
            }
        } else {
            r1 = A00;
            if (r1 == null) {
                Context applicationContext2 = context.getApplicationContext();
                0qQ.A07(applicationContext2);
                r1 = new C306036Kn(applicationContext2);
                A00 = r1;
            }
        }
        Object value = r1.A00.getValue();
        0qQ.A07(value);
        return (Drawable) value;
    }

    public static final void A01(Context context, Drawable drawable, SpannableStringBuilder spannableStringBuilder) {
        int length;
        byte directionality;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        if (!0mk.A02(context) || (directionality = Character.getDirectionality(spannableStringBuilder.charAt(0))) == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
            length = spannableStringBuilder.length();
        } else {
            length = 0;
        }
        C263324Kh.A02(drawable, spannableStringBuilder, length, dimensionPixelSize, 0);
    }
}
