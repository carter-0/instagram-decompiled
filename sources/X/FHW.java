package X;

import android.content.DialogInterface;

public final class FHW implements DialogInterface.OnCancelListener {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ DwR A01;

    public FHW(1P0 r1, DwR dwR) {
        this.A00 = r1;
        this.A01 = dwR;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        1P0 r2 = this.A00;
        if (r2 != null) {
            r2.onFail(new C268674do(this.A01));
        }
    }
}
