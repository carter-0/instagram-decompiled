package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.SUw  reason: case insensitive filesystem */
public final class C11437SUw implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;

    public C11437SUw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
                T7B t7b = (T7B) this.A01;
                T7B.A01(t7b, "ctc_confirmation_dialog_cancel");
                14i.A06(t7b);
                return;
            case 1:
                ((Dialog) this.A01).cancel();
                return;
            default:
                ((S1D) this.A01).A00();
                return;
        }
    }
}
