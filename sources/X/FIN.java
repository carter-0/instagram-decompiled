package X;

import android.content.DialogInterface;

public final class FIN implements DialogInterface.OnClickListener {
    public final /* synthetic */ C227132ih A00;
    public final /* synthetic */ C227112if A01;
    public final /* synthetic */ 0KP A02;

    public FIN(C227132ih r1, C227112if r2, 0KP r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A00 = false;
        dialogInterface.dismiss();
        C227112if.A00(this.A01, this.A02, true);
    }
}
