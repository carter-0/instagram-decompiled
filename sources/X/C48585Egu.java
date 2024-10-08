package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.Egu  reason: case insensitive filesystem */
public abstract class C48585Egu {
    public static final Object A00(AnonymousClass6Tm r8) {
        C307786Rm A0L = Dbb.A0L(r8);
        Object A0p = DbT.A0p(r8, 1);
        HashMap A1E = AnonymousClass7TE.A1E();
        if (A0p != null) {
            A1E.put("deeplink_params", A0p);
        }
        A1E.put("should_dismiss", "true");
        HashMap A01 = C359608dC.A01(A1E);
        C49940FFt fFt = new C49940FFt();
        fFt.A02 = C46627Di7.DISABLED;
        fFt.A03 = C46626Di6.FULL_SHEET;
        C46471DfZ A03 = fFt.A03();
        C276534tU r5 = new C276534tU(13784);
        r5.A0P(45, "tyi.home_page");
        C49672F1e f1e = new C49672F1e(C308206Td.A0A(A0L));
        IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
        igBloksScreenConfig.A0R = "com.bloks.www.fx.settings.tyi.home_page";
        f1e.A00(A03);
        C46649DiU diU = new C46649DiU(A01, Collections.emptyMap(), "com.bloks.www.fx.settings.tyi.home_page");
        r5.A0O();
        diU.A03 = r5;
        diU.A06 = "tyi.home_page";
        diU.A0F(A0L.A00, igBloksScreenConfig);
        return null;
    }
}
