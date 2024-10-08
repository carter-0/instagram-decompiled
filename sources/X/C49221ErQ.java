package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.ErQ  reason: case insensitive filesystem */
public abstract class C49221ErQ {
    public static final 1Ln A00(0lg r7, EXD exd, String str) {
        String str2;
        double A01 = DbS.A01();
        double A00 = DbS.A00();
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "reg_username_suggested"), 371);
        r2.A0P("elapsed_time", Double.valueOf(A01 - A00));
        if (exd == null || (str2 = exd.A00) == null) {
            str2 = "null";
        }
        r2.A0R("flow", str2);
        r2.A0R("containermodule", "waterfall_log_in");
        r2.A0R("step", str);
        r2.A0R("waterfall_id", 1Q0.A01());
        r2.A0P(TraceFieldType.StartTime, Double.valueOf(A00));
        0qQ.A0B(r7, 0);
        r2.A0p(DbZ.A0m(r7));
        return r2;
    }
}
