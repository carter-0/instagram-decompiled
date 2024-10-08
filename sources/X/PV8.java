package X;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

public final class PV8 implements Runnable {
    public final /* synthetic */ NV0 A00;

    public PV8(NV0 nv0) {
        this.A00 = nv0;
    }

    public final void run() {
        Object obj;
        NV0 nv0 = this.A00;
        if (NV0.A0C(nv0).requestFocus()) {
            Context context = nv0.getContext();
            if (context != null) {
                obj = context.getSystemService("input_method");
            } else {
                obj = null;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) obj;
            ConfirmationCodeEditText A0C = NV0.A0C(nv0);
            if (A0C != null && inputMethodManager != null) {
                inputMethodManager.showSoftInput(A0C, 1);
            }
        }
    }
}
