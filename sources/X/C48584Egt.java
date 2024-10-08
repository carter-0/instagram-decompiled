package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.Egt  reason: case insensitive filesystem */
public abstract class C48584Egt {
    public static final Object A00(AnonymousClass6Tm r7) {
        C307786Rm A0L = Dbb.A0L(r7);
        0lg A0A = C308206Td.A0A(A0L);
        DbS.A1Z(A0A);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("dyi_ui_source", "standalone");
        A1E.put("should_dismiss", "true");
        HashMap A01 = C359608dC.A01(A1E);
        C49940FFt fFt = new C49940FFt();
        fFt.A02 = C46627Di7.DISABLED;
        fFt.A03 = C46626Di6.FULL_SHEET;
        C46471DfZ A03 = fFt.A03();
        C276534tU r5 = new C276534tU(13784);
        r5.A0P(45, "unified_dyi.landing_page");
        C49672F1e f1e = new C49672F1e(A0A);
        IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
        igBloksScreenConfig.A0R = "com.bloks.www.fx.settings.unified_dyi.landing_page";
        f1e.A00(A03);
        C46649DiU diU = new C46649DiU(A01, Collections.emptyMap(), "com.bloks.www.fx.settings.unified_dyi.landing_page");
        r5.A0O();
        diU.A03 = r5;
        diU.A06 = "unified_dyi.landing_page";
        diU.A0F(A0L.A00, igBloksScreenConfig);
        return null;
    }
}
