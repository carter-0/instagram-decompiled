package X;

import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* renamed from: X.VpA  reason: case insensitive filesystem */
public abstract class C18287VpA {
    public static WeakReference A00 = new WeakReference((Object) null);

    public static void A00(C14720U4e u4e, float f) {
        ViewGroup.LayoutParams layoutParams = u4e.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            layoutParams2.verticalMargin = f;
            ViewManager viewManager = (ViewManager) u4e.getContext().getSystemService("window");
            if (viewManager != null) {
                viewManager.updateViewLayout(u4e, layoutParams2);
                return;
            }
            throw new IllegalStateException("Window manager required but not found.");
        }
    }
}
