package X;

import android.content.DialogInterface;

public final class AKS implements DialogInterface.OnClickListener {
    public final /* synthetic */ C357128Wq A00;
    public final /* synthetic */ String A01;

    public AKS(C357128Wq r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C357128Wq.A02(this.A00, this.A01);
    }
}
