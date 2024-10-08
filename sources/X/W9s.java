package X;

import android.view.View;

public final class W9s implements View.OnClickListener {
    public final /* synthetic */ C268364dG A00;
    public final /* synthetic */ C17391VTs A01;
    public final /* synthetic */ C231172qz A02;

    public W9s(C268364dG r1, C17391VTs vTs, C231172qz r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = vTs;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-907561513);
        C231172qz r2 = this.A02;
        C268364dG r1 = this.A00;
        Integer num = this.A01.A01;
        if (num != null) {
            r2.APZ(r1, num.intValue());
            AnonymousClass0fD.A0C(1813637171, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(486147480, A05);
        throw A0y;
    }
}
