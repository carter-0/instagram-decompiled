package X;

import android.view.View;

public final class IBD implements View.OnClickListener {
    public final /* synthetic */ DHK A00;
    public final /* synthetic */ C57247IUi A01;
    public final /* synthetic */ C2357130x A02;

    public IBD(DHK dhk, C57247IUi iUi, C2357130x r3) {
        this.A02 = r3;
        this.A00 = dhk;
        this.A01 = iUi;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-248641899);
        C2357130x r7 = this.A02;
        DHK dhk = this.A00;
        C57247IUi iUi = this.A01;
        C57214ITb iTb = new C57214ITb(dhk, iUi);
        C227802jw r4 = r7.A0O;
        C46498Dg1 dg1 = new C46498Dg1(r4.requireContext(), r7.A0J);
        dg1.A04(new ID0(37, (Object) iUi, (Object) iTb, (Object) r7), 2131963365);
        new C49945FFy(dg1).A05(r4.requireContext());
        AnonymousClass0fD.A0C(-290837596, A05);
    }
}
