package X;

import android.widget.TextView;

/* renamed from: X.9Ty  reason: invalid class name and case insensitive filesystem */
public abstract class C379449Ty {
    public static final void A00(TextView textView, String str, int i) {
        if ((str == null || str.length() == 0) && (i == 0 || (str = textView.getContext().getString(i)) == null)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
        textView.requestLayout();
    }
}
