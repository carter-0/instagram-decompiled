package X;

import android.view.View;

public final class IBN implements View.OnClickListener {
    public final /* synthetic */ C274594oe A00;
    public final /* synthetic */ AnonymousClass5O4 A01;
    public final /* synthetic */ C53157GjT A02;

    public IBN(C274594oe r1, AnonymousClass5O4 r2, C53157GjT gjT) {
        this.A02 = gjT;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(443348905);
        C2363233h r2 = this.A02.A02;
        if (r2 != null) {
            r2.FIV(this.A00, this.A01);
            AnonymousClass0fD.A0C(-1150218153, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(1333789338, A05);
        throw A0y;
    }
}
