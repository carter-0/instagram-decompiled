package X;

/* renamed from: X.ErN  reason: case insensitive filesystem */
public abstract class C49218ErN {
    public static final void A00(0lg r5, String str, String str2, String str3, String str4) {
        double A00 = Dbb.A00(r5);
        double A002 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r5), "nux_step_error");
        if (A0e.isSampled()) {
            DbY.A1D(A0e, A00, A002);
            DbS.A1L(A0e, str2);
            DbZ.A1J(A0e, str);
            DbW.A13(A0e, A00);
            DbY.A1I(A0e, "module", "waterfall_log_in", A002);
            FH8.A05(A0e);
            A0e.AAJ("error", str3);
            A0e.AAJ("extra", str4);
            A0e.Cgf();
        }
    }
}
