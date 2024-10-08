package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.ErR  reason: case insensitive filesystem */
public abstract class C49222ErR {
    public static final 1Ln A00(0lg r7, Integer num, String str, String str2, String str3, String str4) {
        String str5;
        AnonymousClass7TG.A1N(r7, str);
        double A01 = DbS.A01();
        double A00 = DbS.A00();
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "register_account_created"), 372);
        r2.A0R("waterfall_id", 1Q0.A01());
        r2.A0R("containermodule", "waterfall_log_in");
        r2.A0P("elapsed_time", Double.valueOf(A01 - A00));
        r2.A0P(TraceFieldType.StartTime, Double.valueOf(A00));
        r2.A0R("step", "done");
        r2.A0R("guid", FH8.A00());
        r2.A0R("instagram_id", str3);
        r2.A0R("flow", str);
        r2.A0R("reg_type", str2);
        r2.A0R("actor_id", str4);
        if (num != null) {
            str5 = DbY.A0j(C49109EpY.A00(num));
        } else {
            str5 = null;
        }
        r2.A0R("chosen_signup_type", str5);
        0qQ.A0B(r7, 0);
        r2.A0p(DbZ.A0m(r7));
        return r2;
    }
}
