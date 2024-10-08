package X;

import android.content.DialogInterface;

public final class AL2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C357128Wq A00;

    public AL2(C357128Wq r1) {
        this.A00 = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C357128Wq r2 = this.A00;
        AGt aGt = r2.A00;
        if (aGt != null) {
            aGt.A03 = false;
        }
        r2.A0A.E09();
    }
}
