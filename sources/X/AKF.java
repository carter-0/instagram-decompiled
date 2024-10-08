package X;

import android.content.DialogInterface;

public final /* synthetic */ class AKF implements DialogInterface.OnClickListener {
    public final /* synthetic */ B2A A00;

    public /* synthetic */ AKF(B2A b2a) {
        this.A00 = b2a;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.D9Q();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
