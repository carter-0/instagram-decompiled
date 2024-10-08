package X;

import android.content.DialogInterface;

public final class LUG implements DialogInterface.OnClickListener {
    public final /* synthetic */ C64180LSl A00;
    public final /* synthetic */ C62320sa A01;

    public LUG(C64180LSl lSl, C62320sa r2) {
        this.A00 = lSl;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C64180LSl lSl = this.A00;
        if (lSl.A00) {
            this.A01.invoke();
        } else {
            C64180LSl.A01(lSl);
        }
    }
}
