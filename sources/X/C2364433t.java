package X;

import android.widget.TextView;

/* renamed from: X.33t  reason: invalid class name and case insensitive filesystem */
public abstract class C2364433t {
    public static final CharSequence A00(TextView textView, CharSequence charSequence) {
        boolean z = false;
        if (textView.getText() == charSequence) {
            z = true;
        }
        if (charSequence == null) {
            return null;
        }
        if (!z) {
            return C70572Rz.A00().Cmk(-1, charSequence);
        }
        return charSequence;
    }
}
