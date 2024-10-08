package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.05u  reason: invalid class name and case insensitive filesystem */
public final class C587105u implements DialogInterface.OnDismissListener {
    public final /* synthetic */ 0SM A00;

    public C587105u(0SM r1) {
        this.A00 = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        0SM r1 = this.A00;
        Dialog dialog = r1.A01;
        if (dialog != null) {
            r1.onDismiss(dialog);
        }
    }
}
