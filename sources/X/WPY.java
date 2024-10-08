package X;

public final class WPY implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "AnalyticsInfoUseCaseImpl$analyticsModule$1";
    public final /* synthetic */ VX7 A00;

    public WPY(VX7 vx7) {
        this.A00 = vx7;
    }

    public final String getModuleName() {
        String str;
        UOF uof;
        C255773uh r2;
        VX7 vx7 = this.A00;
        Object value = vx7.A01.A02.getValue();
        if (!(!(value instanceof UOF) || (uof = (UOF) value) == null || (r2 = uof.A01) == null)) {
            if (r2.A17()) {
                str = "live_";
            } else if (r2.A0f != null) {
                str = C273654mx.A00(3369);
            }
            return 002.A0R(str, vx7.A02);
        }
        str = "reel_";
        return 002.A0R(str, vx7.A02);
    }
}
