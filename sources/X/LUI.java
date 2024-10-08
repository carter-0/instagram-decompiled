package X;

import android.content.DialogInterface;

public final class LUI implements DialogInterface.OnClickListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C311406cd A01;

    public LUI(C255773uh r1, C311406cd r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C311406cd.A00(this.A00, this.A01, false);
    }
}
