package X;

import com.instagram.common.session.UserSession;

public final class LCC {
    public final UserSession A00;

    public final 1OC A00(String str, String str2) {
        0qQ.A0B(str, 0);
        1NY r2 = new 1NY(this.A00, 729);
        r2.A04();
        r2.A0A("creators/partner_program/set_igtv_account_level_toggle/");
        r2.A9m("toggle_value", str);
        r2.A0Q(CG3.class, D21.class);
        if (str2 != null) {
            r2.A9m("product_type", str2);
        }
        return r2.A0M();
    }

    public LCC(UserSession userSession) {
        this.A00 = userSession;
    }
}
