package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.Sad  reason: case insensitive filesystem */
public final class C11474Sad implements View.OnApplyWindowInsetsListener {
    public static final C11474Sad A00 = new C11474Sad();

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        AnonymousClass7TF.A1H(view, windowInsets);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
    }
}
