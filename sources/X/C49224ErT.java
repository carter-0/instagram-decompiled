package X;

/* renamed from: X.ErT  reason: case insensitive filesystem */
public abstract class C49224ErT {
    public static final void A00(0lg r7, EXD exd, Integer num, Integer num2, String str) {
        String str2;
        double A00 = Dbb.A00(r7);
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "register_account_request_submitted");
        DbY.A1D(A0e, A00, A002);
        Dbc.A0c(A0e, "containermodule", "waterfall_log_in", A002);
        DbS.A1H(A0e, "done");
        DbS.A1G(A0e, exd.A00);
        FH8.A07(A0e, A00);
        Long l = null;
        if (num != null) {
            str2 = DbY.A0j(C49109EpY.A00(num));
        } else {
            str2 = null;
        }
        A0e.AAJ("chosen_signup_type", str2);
        if (num2 != null) {
            l = DbS.A0j(num2.intValue());
        }
        A0e.A9F("attempt_count", l);
        A0e.AAJ("retry_strategy", str);
        FH8.A0C(A0e, r7);
    }
}
