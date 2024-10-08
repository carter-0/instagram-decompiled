package X;

import android.content.DialogInterface;

public final class I9E implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ C315376jn A01;

    public I9E(DialogInterface.OnDismissListener onDismissListener, C315376jn r2) {
        this.A01 = r2;
        this.A00 = onDismissListener;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C315376jn r1 = this.A01;
        r1.A00 = null;
        r1.A01 = false;
        this.A00.onDismiss(dialogInterface);
    }
}
