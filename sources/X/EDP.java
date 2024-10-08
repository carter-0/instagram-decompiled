package X;

public final class EDP extends 1P0 {
    public final 0lg A00;
    public final String A01;
    public final String A02;

    private final void A00(boolean z, String str) {
        0lg r6 = this.A00;
        0wc A022 = AnonymousClass0kN.A02(r6);
        long currentTimeMillis = System.currentTimeMillis();
        String A0m = DbZ.A0m(r6);
        0Aj A0e = AnonymousClass7TE.A0e(A022, "phone_id_response_received");
        DbW.A14(A0e, currentTimeMillis);
        DbY.A1E(A0e, currentTimeMillis, 1Q0.A00());
        A0e.A7p("prefill_available", Boolean.valueOf(z));
        DbW.A11(A0e);
        DbW.A12(A0e, DbS.A00());
        DbY.A1A(A0e);
        FH8.A0A(A0e, r6);
        DbS.A1H(A0e, this.A02);
        A0e.AAJ("prefill_type", str);
        DbS.A1K(A0e, this.A01);
        DbV.A1H(A0e, A0m);
    }

    public EDP(0lg r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-212460487);
        0qQ.A0B(r4, 0);
        EDP.super.onFail(r4);
        A00(false, (String) null);
        AnonymousClass0fD.A0A(1556787418, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        int A03 = AnonymousClass0fD.A03(1421642919);
        Dw1 dw1 = (Dw1) obj;
        int A0D = AnonymousClass7TG.A0D(dw1, -84819245);
        String str3 = dw1.A00;
        boolean z = false;
        if (str3 == null || str3.length() == 0 || (str2 = dw1.A01) == null || str2.length() == 0) {
            String str4 = dw1.A01;
            if (str4 != null && str4.length() != 0) {
                C49315Esy.A01 = str4;
                str = "phone";
            } else if (str3 == null || str3.length() == 0) {
                str = null;
                A00(z, str);
                AnonymousClass0fD.A0A(1708604872, A0D);
                AnonymousClass0fD.A0A(1821568030, A03);
            } else {
                C49315Esy.A00 = str3;
                str = "email";
            }
        } else {
            C49315Esy.A01 = str2;
            C49315Esy.A00 = dw1.A00;
            str = "both";
        }
        z = true;
        A00(z, str);
        AnonymousClass0fD.A0A(1708604872, A0D);
        AnonymousClass0fD.A0A(1821568030, A03);
    }
}
