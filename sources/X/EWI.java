package X;

import java.util.Map;

public enum EWI {
    COMMENT_FRICTION("comment_friction"),
    COMMENT_INFORM_TREATMENT("comment_inform_treatment"),
    CONTEXTUAL_FEED("contextual_feed"),
    DEEPLINK("deeplink"),
    DIRECT_SHARE("direct_share"),
    HOUSE_AD("house_ad"),
    MAIN_FEED_BANNER("main_feed_banner"),
    NOTIFICATION("notification"),
    POLITICAL_AD("political_ad"),
    PROFILE_SETTINGS("profile_settings"),
    QUICK_PROMOTION("quick_promotion"),
    STICKER("sticker"),
    STORY_SHARE("story_share"),
    UNKNOWN("unknown");
    
    public static Map A01;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        EWI[] ewiArr;
        A02 = 0oU.A00(ewiArr);
        A01 = AnonymousClass7TE.A1E();
        EWI[] values = values();
        int length = values.length;
        while (i < length) {
            EWI ewi = values[i];
            Map map = A01;
            if (map == null) {
                0qQ.A0F("reverseMap");
                throw AnonymousClass00P.createAndThrow();
            } else {
                map.put(ewi.A00, ewi);
                i++;
            }
        }
    }

    /* access modifiers changed from: public */
    EWI(String str) {
        this.A00 = str;
    }
}
