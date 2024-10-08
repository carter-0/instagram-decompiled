package X;

public final class EBL extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EDT A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public EBL(EDT edt, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = edt;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void onFailInBackground(C268654dm r8) {
        int A0D = AnonymousClass7TG.A0D(r8, -2018700106);
        EBL.super.onFailInBackground(r8);
        int i = this.A00;
        if (i < 11) {
            0no.A00().A01(new EIF(this.A01, this.A03, this.A02, i + 1), 3600000);
        }
        AnonymousClass0fD.A0A(488485038, A0D);
    }
}
