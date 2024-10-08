package X;

import android.content.DialogInterface;

public final class LUF implements DialogInterface.OnClickListener {
    public final /* synthetic */ LMQ A00;
    public final /* synthetic */ C63765L5x A01;

    public LUF(LMQ lmq, C63765L5x l5x) {
        this.A00 = lmq;
        this.A01 = l5x;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LMQ.A00(C368278sM.ACCEPT, this.A00, (String) null);
        C63765L5x l5x = this.A01;
        C246353eS.A00.A0C(l5x.A00, l5x.A01, l5x.A02, false);
    }
}
