package X;

import android.content.DialogInterface;

public final /* synthetic */ class AKM implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ AKM(AnonymousClass8BA r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        AnonymousClass8BA r4 = this.A00;
        Runnable runnable = this.A01;
        AnonymousClass82Y r2 = r4.A14.A01;
        C352218Cl A03 = r2.A03();
        27r A012 = 27p.A01(r4.A0v);
        String A05 = r2.A05();
        C371088xY r6 = C371088xY.DIALOG;
        if (A03 != null) {
            str = A03.A0g;
            str2 = A03.A0e;
        } else {
            str = null;
            str2 = null;
        }
        A012.A1D(r6, (C59725JVj) null, A05, (String) null, str, str2, false);
        r4.A0l(runnable);
    }
}
