package X;

import android.view.View;

public final class IBO implements View.OnClickListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C53157GjT A01;
    public final /* synthetic */ AnonymousClass3W1 A02;

    public IBO(1Xj r1, C53157GjT gjT, AnonymousClass3W1 r3) {
        this.A01 = gjT;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1416599070);
        C2363233h r3 = this.A01.A02;
        if (r3 != null) {
            r3.DkW(this.A00, this.A02, (String) null, false, false);
            AnonymousClass0fD.A0C(823081537, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(-1098983586, A05);
        throw A0y;
    }
}
