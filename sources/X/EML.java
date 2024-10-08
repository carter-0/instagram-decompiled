package X;

import androidx.fragment.app.Fragment;

public final class EML extends C47659EBt {
    public final /* synthetic */ C47476E4a A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EML(Fragment fragment, 0lg r2, C47476E4a e4a, C46634DiE diE) {
        super(fragment, r2, diE);
        this.A00 = e4a;
    }

    public final void A00(DwY dwY) {
        int A03 = AnonymousClass0fD.A03(-1506729460);
        super.A00(dwY);
        C47476E4a.A02(this.A00, "whatsapp");
        AnonymousClass0fD.A0A(613027393, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(2138589656);
        Dba.A0m(this.A00.requireActivity(), 2dZ.A0t);
        AnonymousClass0fD.A0A(666637891, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1259090238);
        Dba.A0n(this.A00.requireActivity(), 2dZ.A0t);
        AnonymousClass0fD.A0A(1933758392, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(908037996);
        A00((DwY) obj);
        AnonymousClass0fD.A0A(1347875188, A03);
    }
}
