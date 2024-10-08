package X;

import android.view.View;

public final class IBM implements View.OnClickListener {
    public final /* synthetic */ DHK A00;
    public final /* synthetic */ C57247IUi A01;
    public final /* synthetic */ C53157GjT A02;

    public IBM(DHK dhk, C57247IUi iUi, C53157GjT gjT) {
        this.A02 = gjT;
        this.A00 = dhk;
        this.A01 = iUi;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1218327404);
        C2363233h r2 = this.A02.A02;
        if (r2 != null) {
            r2.FIU(this.A00, this.A01);
            AnonymousClass0fD.A0C(1831687054, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(456450342, A05);
        throw A0y;
    }
}
