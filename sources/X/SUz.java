package X;

import android.content.DialogInterface;

public final class SUz implements DialogInterface.OnClickListener {
    public final /* synthetic */ C3250870z A00;

    public SUz(C3250870z r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C3250870z r0 = this.A00;
        C309516Yo A0M = DbS.A0M(r0.A02, r0.A05);
        A0M.A0D(AnonymousClass2E0.A0E().A03(AnonymousClass7TE.A0a(), "home"));
        A0M.A04();
    }
}
