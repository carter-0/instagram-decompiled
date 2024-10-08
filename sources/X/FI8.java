package X;

import android.content.DialogInterface;

public final class FI8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C226062fZ A00;
    public final /* synthetic */ 0BQ A01;

    public FI8(C226062fZ r1, 0BQ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        0BQ r3 = this.A01;
        C226062fZ r0 = this.A00;
        r3.CIe(r0.A02, r0.A07, "double_tap_tab_bar");
        r3.Clm();
    }
}
