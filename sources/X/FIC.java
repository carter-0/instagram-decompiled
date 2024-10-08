package X;

import android.content.DialogInterface;

public final class FIC implements DialogInterface.OnClickListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C315416jr A01;

    public FIC(C255773uh r1, C315416jr r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C46447Df9.A03();
        String str = this.A00.A0k;
        0qQ.A07(str);
        E5G A002 = C49076Eou.A00(str);
        C315416jr r0 = this.A01;
        DbY.A14(A002, r0.A02, r0.A03);
    }
}
