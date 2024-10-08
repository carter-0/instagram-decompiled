package X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class W7r implements TransformationMethod {
    public Locale A00;

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.A00);
        }
        return null;
    }
}
