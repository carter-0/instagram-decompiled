package X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.EjW  reason: case insensitive filesystem */
public abstract class C48747EjW {
    public static final void A00(View view, String str, String str2, boolean z) {
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.primary_text);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.secondary_text);
        if (str != null) {
            A0R.setText(str);
            A0R.setVisibility(0);
            if (z) {
                A0R.setTypeface(Typeface.defaultFromStyle(1));
            }
        } else {
            A0R.setVisibility(8);
        }
        if (str2 != null) {
            A0R2.setText(str2);
            A0R2.setVisibility(0);
            return;
        }
        A0R2.setVisibility(8);
    }
}
