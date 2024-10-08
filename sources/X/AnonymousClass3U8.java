package X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* renamed from: X.3U8  reason: invalid class name */
public final class AnonymousClass3U8 implements TransformationMethod {
    public final TransformationMethod A00;

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.A00;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }

    public AnonymousClass3U8(TransformationMethod transformationMethod) {
        this.A00 = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.A00;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C13993Tnu.A00().A01() != 1) {
            return charSequence;
        }
        return C13993Tnu.A00().A02(charSequence, 0, charSequence.length());
    }
}
