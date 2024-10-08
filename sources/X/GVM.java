package X;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

public abstract class GVM {
    public static final void A00(Drawable drawable, GVO gvo, String str, boolean z, boolean z2) {
        Drawable drawable2;
        boolean z3 = false;
        0qQ.A0B(gvo, 0);
        if (str == null || str.length() == 0) {
            z3 = true;
        }
        if (z3) {
            TextView textView = gvo.A01;
            textView.setText((CharSequence) null);
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (z2) {
            str = 002.A0R(str, " [L]");
        }
        TextView textView2 = gvo.A01;
        textView2.setText(str);
        if (z) {
            drawable2 = gvo.A00;
        } else {
            drawable2 = null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
        if (z) {
            textView2.setContentDescription(DbW.A0h(textView2.getContext(), str, 2131967891));
        }
    }
}
