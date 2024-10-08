package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

public final class TIQ implements Runnable {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ View A02;

    public TIQ(Dialog dialog, Context context, View view) {
        this.A02 = view;
        this.A01 = context;
        this.A00 = dialog;
    }

    public final void run() {
        Object obj;
        Window window;
        View view = this.A02;
        Context context = this.A01;
        if (context != null) {
            obj = context.getSystemService("input_method");
        } else {
            obj = null;
        }
        0qQ.A0C(obj, AnonymousClass000.A00(11));
        ((InputMethodManager) obj).showSoftInput(view, 1);
        Dialog dialog = this.A00;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
    }
}
