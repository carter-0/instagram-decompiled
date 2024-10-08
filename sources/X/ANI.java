package X;

import android.view.View;

public final class ANI implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ Runnable A01;

    public ANI(AnonymousClass8BA r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        int A05 = AnonymousClass0fD.A05(-1356023076);
        AnonymousClass8BA r3 = this.A00;
        AnonymousClass82Y r2 = r3.A14.A01;
        C352218Cl A03 = r2.A03();
        27r A012 = 27p.A01(r3.A0v);
        String A052 = r2.A05();
        C371088xY r6 = C371088xY.DIALOG;
        if (A03 != null) {
            str = A03.A0g;
            str2 = A03.A0e;
        } else {
            str = null;
            str2 = null;
        }
        A012.A1D(r6, (C59725JVj) null, A052, (String) null, str, str2, false);
        r3.A0l(this.A01);
        AnonymousClass0fD.A0C(-357969657, A05);
    }
}
