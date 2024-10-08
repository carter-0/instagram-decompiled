package X;

import android.app.Activity;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.Wlm  reason: case insensitive filesystem */
public final class C20126Wlm implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C62320sa A01;

    public C20126Wlm(Context context, C62320sa r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void run() {
        InputMethodManager inputMethodManager;
        Context context = this.A00;
        Object systemService = context.getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        } else {
            inputMethodManager = null;
        }
        Activity A002 = C46604Dhk.A00(context);
        if (!(A002 == null || A002.getWindow() == null || inputMethodManager == null)) {
            C13989Tnp.A1A(C66581MXm.A0A(A002), inputMethodManager);
        }
        this.A01.invoke();
    }
}
