package X;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.Rel  reason: case insensitive filesystem */
public abstract class C9667Rel {
    public static final void A00(View view) {
        Context context;
        if (view != null && (context = view.getContext()) != null) {
            Object systemService = context.getSystemService("input_method");
            0qQ.A0C(systemService, AnonymousClass000.A00(11));
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            IBinder windowToken = view.getWindowToken();
            if (windowToken != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
    }
}
