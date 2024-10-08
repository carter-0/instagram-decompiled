package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.4kJ  reason: invalid class name and case insensitive filesystem */
public abstract class C272204kJ {
    public static final void A01(Window window, boolean z) {
        int systemUiVisibility;
        window.clearFlags(201326592);
        window.addFlags(AnonymousClass972.MUTABLE_FLAG_MASK);
        View decorView = window.getDecorView();
        0qQ.A07(decorView);
        decorView.setSystemUiVisibility(1792 | decorView.getSystemUiVisibility());
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        View decorView2 = window.getDecorView();
        if (z) {
            0qQ.A07(decorView2);
            systemUiVisibility = -8209 & decorView2.getSystemUiVisibility();
        } else {
            0qQ.A07(decorView2);
            systemUiVisibility = 8208 | decorView2.getSystemUiVisibility();
        }
        decorView2.setSystemUiVisibility(systemUiVisibility);
    }

    public static final void A00(Activity activity, View view, boolean z) {
        int systemUiVisibility;
        view.setSystemUiVisibility(1792 | view.getSystemUiVisibility());
        if (z) {
            systemUiVisibility = -8209 & view.getSystemUiVisibility();
        } else {
            systemUiVisibility = 8208 | view.getSystemUiVisibility();
        }
        view.setSystemUiVisibility(systemUiVisibility);
        activity.getWindowManager().addView(view, new WindowManager.LayoutParams(-1, -1, 1, -2147417832, -2));
    }
}
