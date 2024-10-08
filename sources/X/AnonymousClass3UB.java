package X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: X.3UB  reason: invalid class name */
public final class AnonymousClass3UB implements TransformationMethod {
    public static AnonymousClass3UB A01;
    public final Locale A00;

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.A00);
        }
        return null;
    }

    public AnonymousClass3UB(Locale locale) {
        this.A00 = locale;
    }
}
