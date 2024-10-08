package X;

import android.content.DialogInterface;

public final class LV5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ C314496iM A01;

    public LV5(DialogInterface.OnDismissListener onDismissListener, C314496iM r2) {
        this.A01 = r2;
        this.A00 = onDismissListener;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C314496iM r1 = this.A01;
        r1.A01 = null;
        r1.A02 = false;
        this.A00.onDismiss(dialogInterface);
    }
}
