package X;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

public abstract class W0U {
    public static WDG A01(Runnable runnable) {
        return new WDG(runnable);
    }

    public static void A02(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void A03(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedDispatcher A00(View view) {
        return view.findOnBackInvokedDispatcher();
    }
}
