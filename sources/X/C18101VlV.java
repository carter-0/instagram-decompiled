package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.VlV  reason: case insensitive filesystem */
public final class C18101VlV {
    public static final X61 A00(View view) {
        while (!(view instanceof X61)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            0Sd.A02(parent instanceof View);
            view = (View) parent;
        }
        return (X61) view;
    }
}
