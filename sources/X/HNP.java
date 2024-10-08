package X;

import java.util.HashMap;
import java.util.Map;

public enum HNP {
    CENTER_BUTTON("CENTER_BUTTON"),
    BOTTOM_BUTTON("BOTTOM_BUTTON"),
    POST_REVEAL_SECONDARY_CTA("POST_REVEAL_SECONDARY_CTA"),
    OVERFLOW_MENU("OVERFLOW_MENU"),
    MEDIA_GRID("MEDIA_GRID"),
    BANNER("BANNER"),
    COMMENT_INFORM("BANNER"),
    OTHER("OTHER");
    
    public static final Map A01 = null;
    public String A00;

    /* access modifiers changed from: public */
    static {
        HNP hnp;
        HNP hnp2;
        HNP hnp3;
        HNP hnp4;
        HNP hnp5;
        HNP hnp6;
        HashMap A1E = AnonymousClass7TE.A1E();
        A01 = A1E;
        A1E.put(hnp, "center_button");
        A1E.put(hnp2, "bottom_button");
        A1E.put(hnp3, "post_reveal_cta");
        A1E.put(hnp4, "overflow_menu");
        A1E.put(hnp5, "media_grid");
        A1E.put(hnp6, "banner");
    }

    /* access modifiers changed from: public */
    HNP(String str) {
        this.A00 = str;
    }

    public static HNP A00(C278014w6 r1) {
        Integer A022 = I2I.A02(r1);
        if (A022 != null) {
            int intValue = A022.intValue();
            if (intValue == 3) {
                return CENTER_BUTTON;
            }
            if (intValue == 2) {
                return BOTTOM_BUTTON;
            }
            if (intValue == 1) {
                return POST_REVEAL_SECONDARY_CTA;
            }
            if (intValue == 0) {
                return BANNER;
            }
        }
        return OTHER;
    }
}
