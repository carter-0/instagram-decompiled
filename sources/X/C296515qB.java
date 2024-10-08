package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;

/* renamed from: X.5qB  reason: invalid class name and case insensitive filesystem */
public abstract class C296515qB {
    public static final View A00(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            return null;
        }
        View decorView = window.getDecorView();
        0qQ.A07(decorView);
        View findViewById = decorView.findViewById(16908290);
        if (findViewById == null || findViewById.getRootView() == null) {
            return decorView;
        }
        return findViewById.getRootView();
    }
}
