package X;

import android.view.View;

public final class LXP implements View.OnClickListener {
    public final /* synthetic */ MVB A00;
    public final /* synthetic */ Dc2 A01;
    public final /* synthetic */ AnonymousClass3M8 A02;

    public LXP(MVB mvb, Dc2 dc2, AnonymousClass3M8 r3) {
        this.A00 = mvb;
        this.A02 = r3;
        this.A01 = dc2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1582178086);
        MVB mvb = this.A00;
        0qQ.A0A(view);
        mvb.onButtonClick(view);
        AnonymousClass3M8 r3 = this.A02;
        AnonymousClass3M8.A03(r3, true);
        Dc2 dc2 = this.A01;
        int i = dc2.A00;
        if (i == 0) {
            i = Dc5.A01();
        }
        if (i == -1) {
            r3.A0K.remove(dc2);
        }
        AnonymousClass0fD.A0C(1045739836, A05);
    }
}
