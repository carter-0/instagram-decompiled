package X;

import android.content.DialogInterface;

public final class W5X implements DialogInterface.OnDismissListener {
    public final /* synthetic */ VYH A00;

    public W5X(VYH vyh) {
        this.A00 = vyh;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        VYH vyh = this.A00;
        vyh.A00 = false;
        vyh.A03.A00.A0U.EHd();
    }
}
