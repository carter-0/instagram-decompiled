package X;

public final class ECk extends 1P0 {
    public final /* synthetic */ ESN A00;

    public ECk(ESN esn) {
        this.A00 = esn;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-1566376291);
        ECk.super.onFail(r3);
        C49952FGh.A01(this.A00.getContext());
        AnonymousClass0fD.A0A(-1986269646, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(523113438);
        ESN esn = this.A00;
        esn.A06 = false;
        Dbb.A0u(esn);
        AnonymousClass0fD.A0A(-1510055510, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1576833148);
        this.A00.A06 = true;
        AnonymousClass0fD.A0A(346729131, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1864025641);
        int A032 = AnonymousClass0fD.A03(439635299);
        ESN.A06((DwU) obj, this.A00);
        AnonymousClass0fD.A0A(1658957792, A032);
        AnonymousClass0fD.A0A(628067210, A03);
    }
}
