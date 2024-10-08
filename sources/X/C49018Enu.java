package X;

import android.util.TypedValue;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Enu  reason: case insensitive filesystem */
public abstract class C49018Enu {
    public static final void A00(TextView textView, String str) {
        boolean A1Z = AnonymousClass7TG.A1Z(textView, str);
        if (textView.getBackground() != null) {
            TypedValue typedValue = new TypedValue();
            textView.getContext().getTheme().resolveAttribute(R.attr.backgroundColorHighlight, typedValue, A1Z);
            AnonymousClass7TE.A1R(textView.getBackground(), typedValue.data);
        }
        textView.setText(str);
        DbT.A1A(textView.getResources(), textView, 2131968665);
    }
}
