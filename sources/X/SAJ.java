package X;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

public abstract class SAJ {
    public static final void A00(View view, LD2 ld2) {
        if (Build.VERSION.SDK_INT >= 30 && A01(view)) {
            AnonymousClass03j.A00(view, new C71490Olf(3, view, ld2));
        }
    }

    public static final boolean A01(View view) {
        Insets insets;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets != null) {
            insets = rootWindowInsets.getInsets(WindowInsets.Type.systemGestures());
        } else {
            insets = null;
        }
        if (insets == null) {
            return false;
        }
        int i = insets.left;
        int i2 = insets.right;
        if (i > 0 || i2 > 0) {
            return true;
        }
        return false;
    }
}
