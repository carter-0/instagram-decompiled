package X;

/* renamed from: X.ErL  reason: case insensitive filesystem */
public abstract class C49216ErL {
    public static final void A00(0lg r6, C49922FEx fEx, String str, String str2, String str3, String str4, String str5) {
        Boolean bool;
        String str6;
        Long l = null;
        AnonymousClass7TG.A1N(r6, str);
        double A01 = DbS.A01();
        double A00 = DbS.A00();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r6), "log_in");
        DbT.A1O(A0e);
        A0e.AAJ("tracking_enabled", (String) null);
        A0e.AAJ("advertising_id", (String) null);
        DbY.A1D(A0e, A01, A00);
        DbW.A11(A0e);
        DbY.A1I(A0e, "instagram_id", str2, A00);
        DbW.A13(A0e, A01);
        if (fEx != null) {
            bool = DbU.A0g(fEx.A00, DbX.A0s(C48071EUp.A0C));
        } else {
            bool = null;
        }
        A0e.A7p("was_from_recovery_flow", bool);
        if (fEx != null) {
            str6 = fEx.A00.getString(DbX.A0s(C48071EUp.A0B));
        } else {
            str6 = null;
        }
        A0e.AAJ("recovery_type", str6);
        DbS.A1G(A0e, str3);
        A0e.AAJ("reg_type", str4);
        if (str5 != null) {
            l = AnonymousClass7TE.A10(str5);
        }
        A0e.A9F("actor_id", l);
        FH8.A05(A0e);
        FH8.A04(A0e);
        DbS.A1H(A0e, str);
        A0e.Cgf();
    }
}
