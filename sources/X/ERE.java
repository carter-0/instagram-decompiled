package X;

import com.instagram.common.session.UserSession;

public final class ERE extends C48206Eam {
    public final UserSession A00;
    public final 0xa A01;

    public ERE(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 1Al.A01(userSession).A03(1An.A2s);
    }

    public static final EyN A00(ERE ere, String str) {
        if (!2R8.A00(ere.A00)) {
            return null;
        }
        0xa r5 = ere.A01;
        String string = r5.getString(DbU.A0s("deep_link_launch:%s:%s:%s", "product_details_page", str, "merchant_id"), (String) null);
        String string2 = r5.getString(DbU.A0s("deep_link_launch:%s:%s:%s", "product_details_page", str, "merchant_username"), (String) null);
        String string3 = r5.getString(DbU.A0s("deep_link_launch:%s:%s:%s", "product_details_page", str, "product_id"), (String) null);
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        return new EyN(string, string2, string3);
    }

    public static final void A01(EyN eyN, ERE ere, String str) {
        if (2R8.A00(ere.A00)) {
            0xY AR4 = ere.A01.AR4();
            AR4.E5g(DbU.A0s("deep_link_launch:%s:%s:%s", "product_details_page", str, "merchant_id"), eyN.A00);
            AR4.E5g(DbU.A0s("deep_link_launch:%s:%s:%s", "product_details_page", str, "merchant_username"), eyN.A01);
            AR4.E5g(DbU.A0s("deep_link_launch:%s:%s:%s", "product_details_page", str, "product_id"), eyN.A02);
            AR4.apply();
        }
    }
}
