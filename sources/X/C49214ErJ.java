package X;

/* renamed from: X.ErJ  reason: case insensitive filesystem */
public abstract class C49214ErJ {
    public static final void A00(0lg r2, Boolean bool, Boolean bool2, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r2), "igts_defaults");
        if (A0e.isSampled()) {
            A0e.AAJ("event_type", str2);
            A0e.AAJ("client_userid", str);
            if (bool != null) {
                A0e.A7p("is_set_to_private", Boolean.valueOf(bool.booleanValue()));
            }
            if (bool2 != null) {
                A0e.A7p("should_set_teen_users_as_private", Boolean.valueOf(bool2.booleanValue()));
            }
            A0e.Cgf();
        }
    }
}
