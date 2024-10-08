package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum EWG {
    A04("email"),
    MONETIZATION_INBOX("monetization_inbox"),
    NOTIFICATION("notification"),
    POST_LIVE("post_live"),
    PRO_HOME("pro_home"),
    QP("qp"),
    SETTINGS("settings"),
    UNKNOWN("unknown"),
    MONETIZATION_ELIGIBILITY_SCREEN("monetization_eligibility_screen"),
    PAYOUT_HUB("payout_hub"),
    PROFILE("profile"),
    NATIVE_PROMO_DIALOG("native_promo_dialog");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        EWG[] ewgArr;
        A02 = 0oU.A00(ewgArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (EWG ewg : values()) {
            A0x.put(ewg.A00, ewg);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    EWG(String str) {
        this.A00 = str;
    }
}
