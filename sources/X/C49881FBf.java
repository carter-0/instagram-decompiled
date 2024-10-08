package X;

/* renamed from: X.FBf  reason: case insensitive filesystem */
public final class C49881FBf {
    public static final C49881FBf A00 = new Object();

    public final void A01(0lg r8, EXD exd, Boolean bool, Boolean bool2, Integer num, String str, String str2) {
        String str3;
        0qQ.A0B(r8, 0);
        0BQ A002 = AnonymousClass0BO.A00(r8);
        double A01 = DbS.A01();
        double A003 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r8), "next_button_tapped");
        DbZ.A1H(A0e, A01, A003);
        FH8.A0E(A0e, "step", str);
        String str4 = null;
        if (exd != null) {
            str3 = exd.A00;
        } else {
            str3 = null;
        }
        DbS.A1G(A0e, str3);
        if (num != null) {
            str4 = DbY.A0j(C49109EpY.A00(num));
        }
        A0e.AAJ("cp_type_given", str4);
        A0e.A7p("keyboard", bool);
        A0e.A7p(AnonymousClass000.A00(3450), bool2);
        A0e.AAJ("instagram_id", str2);
        A0e.AAe("logged_in_accounts", AnonymousClass7TE.A1D(A002.BNz()));
        FH8.A0C(A0e, r8);
    }

    public final void A02(0lg r9, String str) {
        0qQ.A0B(r9, 0);
        A01(r9, (EXD) null, (Boolean) null, (Boolean) null, (Integer) null, str, (String) null);
    }

    public final void A00(0lg r7, C49922FEx fEx, String str) {
        String str2;
        double A002 = Dbb.A00(r7);
        double A003 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "next_button_tapped");
        DbZ.A1H(A0e, A002, A003);
        FH8.A0E(A0e, "step", str);
        if (fEx != null) {
            str2 = fEx.A00.getString(DbX.A0s(C48071EUp.A06));
        } else {
            str2 = null;
        }
        A0e.AAJ("cp_type_given", str2);
        A0e.Cgf();
    }
}
