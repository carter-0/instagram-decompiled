package X;

import android.content.DialogInterface;

public final class LUC implements DialogInterface.OnClickListener {
    public final /* synthetic */ 1Yh A00;
    public final /* synthetic */ C17945Via A01;

    public LUC(1Yh r1, C17945Via via) {
        this.A00 = r1;
        this.A01 = via;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        1Yh.A03(this.A00, new C17744VdD(this.A01));
    }
}
