package X;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: X.I4k  reason: case insensitive filesystem */
public abstract class C56610I4k {
    public static final IEK A00(C62320sa r1) {
        return new IEK(r1);
    }

    public static final void A01(View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
        }
    }

    public static final void A02(View view, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    public static /* synthetic */ void A03(C62320sa r0) {
        if (r0 != null) {
            r0.invoke();
        }
    }
}
