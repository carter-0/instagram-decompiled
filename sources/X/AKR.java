package X;

import android.content.DialogInterface;

public final class AKR implements DialogInterface.OnClickListener {
    public final /* synthetic */ C357128Wq A00;
    public final /* synthetic */ String A01;

    public AKR(C357128Wq r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C357128Wq r0 = this.A00;
        0wc r4 = r0.A06;
        AnonymousClass8Wm r3 = r0.A0A;
        AIG.A02(r4, r3.AbO(), this.A01, r0.A03);
        r3.DuW();
    }
}
