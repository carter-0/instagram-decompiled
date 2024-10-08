package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uxk  reason: case insensitive filesystem */
public enum C16590Uxk {
    UNDEFINED(0),
    WEBSITE(1),
    APP(2),
    MESSENGER(3),
    APPLINKS_AUTOMATIC(4),
    WHATSAPP(5),
    INSTAGRAM_DIRECT(6),
    FACEBOOK(7),
    MESSAGING_MESSENGER_WHATSAPP(8),
    SHOP(9),
    MESSAGING_INSTAGRAM_DIRECT_MESSENGER(10),
    MESSAGING_INSTAGRAM_DIRECT_MESSENGER_WHATSAPP(11),
    MESSAGING_INSTAGRAM_DIRECT_WHATSAPP(12),
    SHOP_AUTOMATIC(13),
    PHONE_CALL(14),
    ON_AD(15),
    ON_POST(16),
    ON_EVENT(17),
    ON_VIDEO(18),
    ON_PAGE(19);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16590Uxk[] uxkArr;
        A02 = 0oU.A00(uxkArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r3));
        for (C16590Uxk uxk : values()) {
            C51967G9n.A1O(uxk, linkedHashMap, uxk.A00);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16590Uxk(int i) {
        this.A00 = i;
    }
}
