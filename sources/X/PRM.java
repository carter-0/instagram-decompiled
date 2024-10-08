package X;

public final class PRM implements MT4 {
    public final /* synthetic */ NJ7 A00;

    public PRM(NJ7 nj7) {
        this.A00 = nj7;
    }

    public final void DgT() {
        String str;
        NJ7 nj7 = this.A00;
        C313756gx A002 = C313746gw.A00(AnonymousClass7TE.A0l(nj7.A0G));
        int A03 = C66583MXo.A03(nj7);
        String A07 = C300965yF.A07(NJ7.A00(nj7));
        String A02 = NJ7.A02(nj7);
        boolean A08 = NJ7.A08(nj7);
        1Ln A0J = DbT.A0J(A002);
        if (DbT.A1Y(A0J)) {
            DbW.A17(A0J, A002);
            DbV.A1M(A0J, "save_qr_code");
            A0J.A0p("save_qr_code_button");
            if (A08) {
                str = "creator_qr_code_sheet";
            } else {
                str = "fan_qr_code_sheet";
            }
            A0J.A0i(DbZ.A0b(A0J, str, A07, A02, A03));
            A0J.Cgf();
        }
    }
}
