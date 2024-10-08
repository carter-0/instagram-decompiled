package X;

import java.util.Map;

/* renamed from: X.FYz  reason: case insensitive filesystem */
public final class C50342FYz implements 0lm {
    public final 0lg A00;

    public C50342FYz(0lg r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public static final void A00(C50342FYz fYz, String str, String str2, String str3, Map map) {
        1Ln r2 = new 1Ln(AnonymousClass7TE.A0e(AnonymousClass0kN.A02(fYz.A00), "fx_unified_launcher_logging"), 159);
        if (DbT.A1Y(r2)) {
            r2.A0R("fx_unified_launcher_logger_event", str);
            r2.A0R("unified_launcher_error_message", str2);
            r2.A0R("unified_launcher_product_flow", str3);
            r2.A0R("unified_launcher_app_id", "com.bloks.www.fxcal.link.async");
            r2.A00.A9H("debug_test_data", map);
            r2.Cgf();
        }
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00.A03(C50342FYz.class);
    }

    public C50342FYz() {
    }
}
