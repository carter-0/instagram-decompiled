package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.6z2  reason: invalid class name and case insensitive filesystem */
public abstract class C324286z2 {
    public static 2cv A00(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof 2cv)) {
            parent = parent.getParent();
        }
        return (2cv) parent;
    }
}
