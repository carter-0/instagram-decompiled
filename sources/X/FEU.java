package X;

import com.instagram.common.session.UserSession;

public final class FEU {
    public final 0wc A00;
    public final String A01;

    public static 0Aj A00(FEU feu) {
        0wc r2 = feu.A00;
        return r2.A00(r2.A00, "auto_confirm_action");
    }

    public static void A01(0Aj r2, FEU feu) {
        r2.AAJ("module", feu.A01);
        r2.Cgf();
    }

    public FEU(AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
        this.A01 = r2.getModuleName();
    }
}
