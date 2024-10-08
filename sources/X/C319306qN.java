package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.instagram.android.R;
import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.6qN  reason: invalid class name and case insensitive filesystem */
public final class C319306qN {
    public static final C319306qN A00 = new Object();

    public final void A00(Context context, SpannableStringBuilder spannableStringBuilder, boolean z) {
        Drawable mutate;
        if (z) {
            boolean A02 = 0mk.A02(context);
            if (A02) {
                spannableStringBuilder.append(" ");
            } else {
                spannableStringBuilder.insert(0, " ");
            }
            Drawable drawable = context.getDrawable(R.drawable.instagram_lock_pano_outline_16);
            if (drawable == null || (mutate = drawable.mutate()) == null) {
                throw new IllegalStateException("Required value was null.");
            }
            mutate.setColorFilter(AnonymousClass37O.A00(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_icon))));
            int i = 0;
            mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
            C2606346l r2 = new C2606346l(mutate);
            if (A02) {
                i = spannableStringBuilder.length() - 1;
                spannableStringBuilder.append(" ");
            } else {
                spannableStringBuilder.insert(0, " ");
            }
            spannableStringBuilder.setSpan(r2, i, i + 1, 33);
        }
    }
}
