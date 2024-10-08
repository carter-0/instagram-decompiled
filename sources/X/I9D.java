package X;

import android.content.DialogInterface;

public final class I9D implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ C315356jl A01;

    public I9D(DialogInterface.OnDismissListener onDismissListener, C315356jl r2) {
        this.A01 = r2;
        this.A00 = onDismissListener;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C315356jl r1 = this.A01;
        r1.A00 = null;
        r1.A01 = false;
        this.A00.onDismiss(dialogInterface);
    }
}
