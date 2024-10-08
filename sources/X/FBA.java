package X;

import java.util.List;

public final class FBA {
    public static final FBA A00 = new Object();

    public final void A00(0lg r7, String str, String str2, String str3, String str4, List list, int i) {
        double A002 = Dbb.A00(r7);
        double A003 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "ig_aymh_account_disambiguation_outcome");
        DbZ.A1E(A0e);
        DbY.A1D(A0e, A002, A003);
        A0e.AAe(AnonymousClass000.A00(2559), list);
        A0e.A9F("size", DbS.A0j(list.size()));
        A0e.AAJ("account_attempted", str2);
        A0e.A9F("attempt_order", DbV.A0p(A0e, "outcome", str3, i));
        DbY.A1I(A0e, "error", str4, A003);
        FH8.A0E(A0e, "step", str);
        A0e.Cgf();
    }
}
