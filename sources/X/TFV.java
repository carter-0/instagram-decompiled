package X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class TFV implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;

    public TFV(View view, Context context) {
        this.A01 = view;
        this.A00 = context;
    }

    public final void run() {
        Object obj;
        View view = this.A01;
        Context context = this.A00;
        if (context != null) {
            obj = context.getSystemService("input_method");
        } else {
            obj = null;
        }
        0qQ.A0C(obj, AnonymousClass000.A00(11));
        ((InputMethodManager) obj).showSoftInput(view, 1);
    }
}
