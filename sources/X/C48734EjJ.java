package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.EjJ  reason: case insensitive filesystem */
public abstract class C48734EjJ {
    public static void A00(0wc r6, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(r6, "instagram_insights_action");
        long A00 = 1Q0.A00();
        long currentTimeMillis = System.currentTimeMillis();
        if (A0e.isSampled()) {
            DbS.A1J(A0e, "tap");
            A0e.AAJ("unit", str2);
            A0e.AAJ("unit_state", "appeared");
            A0e.AAJ("parent_unit", (String) null);
            A0e.AAJ("component", str);
            DbW.A14(A0e, currentTimeMillis);
            A0e.A9F(TraceFieldType.StartTime, Long.valueOf(A00));
            A0e.A9F("elapsed_time", Long.valueOf(currentTimeMillis - A00));
            DbW.A11(A0e);
            DbW.A10(A0e);
            A0e.Cgf();
        }
    }
}
