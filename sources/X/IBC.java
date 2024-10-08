package X;

import android.view.View;

public final class IBC implements View.OnClickListener {
    public final /* synthetic */ C57246IUh A00;
    public final /* synthetic */ WWQ A01;
    public final /* synthetic */ C2357130x A02;

    public IBC(C57246IUh iUh, WWQ wwq, C2357130x r3) {
        this.A02 = r3;
        this.A01 = wwq;
        this.A00 = iUh;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-671995898);
        C2357130x r7 = this.A02;
        WWQ wwq = this.A01;
        C57246IUh iUh = this.A00;
        0qQ.A0B(iUh, 1);
        C227802jw r4 = r7.A0O;
        C46498Dg1 dg1 = new C46498Dg1(r4.requireContext(), r7.A0J);
        dg1.A02(new ID0(36, (Object) wwq, (Object) iUh, (Object) r7), 2131964225);
        new C49945FFy(dg1).A05(r4.requireContext());
        AnonymousClass0fD.A0C(-1104753634, A05);
    }
}
