package X;

/* renamed from: X.FEv  reason: case insensitive filesystem */
public final class C49920FEv {
    public static final C49920FEv A00 = new Object();

    public final void A02(0lg r2, String str) {
        0qQ.A0B(r2, 0);
        A00(r2, (EXD) null, (Boolean) null, (Integer) null, str);
    }

    public static final void A00(0lg r6, EXD exd, Boolean bool, Integer num, String str) {
        String str2;
        AnonymousClass7TG.A1N(r6, str);
        double A01 = DbS.A01();
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "back_button_tapped");
        DbT.A1P(A0e);
        DbW.A11(A0e);
        DbS.A1H(A0e, str);
        DbY.A1D(A0e, A01, A002);
        DbW.A12(A0e, A002);
        DbW.A13(A0e, A01);
        FH8.A09(A0e, r6);
        String str3 = null;
        if (exd != null) {
            str2 = exd.A00;
        } else {
            str2 = null;
        }
        DbS.A1G(A0e, str2);
        if (num != null) {
            str3 = DbY.A0j(C49109EpY.A00(num));
        }
        A0e.AAJ("chosen_signup_type", str3);
        A0e.A7p("is_standalone", bool);
        A0e.Cgf();
    }

    public final void A01(0lg r2, EXD exd, String str) {
        AnonymousClass7TG.A1N(r2, str);
        A00(r2, exd, (Boolean) null, (Integer) null, str);
    }
}
