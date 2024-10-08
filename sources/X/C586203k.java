package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.03k  reason: invalid class name and case insensitive filesystem */
public abstract class C586203k {
    public static 04k A00(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        04k r2 = new 04k(rootWindowInsets);
        04h r1 = r2.A00;
        r1.A0E(r2);
        r1.A0C(view.getRootView());
        return r2;
    }
}
