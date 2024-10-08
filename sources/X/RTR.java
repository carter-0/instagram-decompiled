package X;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public abstract class RTR {
    public static final Boolean A00(C307896Rx r5, AnonymousClass6Tm r6) {
        View A05;
        C276544tV r1 = (C276544tV) DbT.A0p(r6, 0);
        if (r1 == null || (A05 = r1.A05(r5.A03)) == null) {
            return false;
        }
        Object systemService = A05.getContext().getSystemService("input_method");
        0qQ.A0C(systemService, AnonymousClass000.A00(11));
        A05.requestFocus();
        ((InputMethodManager) systemService).showSoftInput(A05, 0);
        return true;
    }
}
