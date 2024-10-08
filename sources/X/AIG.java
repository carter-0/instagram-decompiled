package X;

import java.util.HashMap;
import java.util.Map;

public abstract class AIG {
    public static void A03(0Aj r2, String str, Map map) {
        r2.A7p("is_offensive", true);
        r2.AAJ(AnonymousClass9NE.A00(), str);
        r2.A9H("extra_values", map);
        r2.Cgf();
    }

    public static final void A00(C58840Ae r3, String str, String str2, String str3) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0Aj A0e = AnonymousClass7TE.A0e((0wc) r3, AnonymousClass000.A00(3384));
        A0e.AAJ("source_of_action", str);
        A0e.AAJ("text_language", str2);
        A03(A0e, str3, A1E);
    }

    public static final void A01(C58840Ae r3, String str, String str2, String str3) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0Aj A0e = AnonymousClass7TE.A0e((0wc) r3, "instagram_wellbeing_warning_system_tiered_warning");
        A0e.AAJ("source_of_action", str2);
        A0e.AAJ("step", str);
        A03(A0e, str3, A1E);
    }

    public static final void A02(C58840Ae r3, String str, String str2, String str3) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0Aj A0e = AnonymousClass7TE.A0e((0wc) r3, "instagram_wellbeing_warning_system_undo");
        A0e.AAJ("source_of_action", str);
        A0e.AAJ("text_language", str2);
        A03(A0e, str3, A1E);
    }
}
