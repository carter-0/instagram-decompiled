package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Khk  reason: case insensitive filesystem */
public enum C62554Khk {
    EMOJIS_AND_STICKER_SET("emojis_and_sticker_set"),
    RECENT_EMOJIS_AND_STICKER_SET("recent_emojis_and_sticker_set"),
    RECENT_NAMETAG_EMOJIS_SET("recent_nametag_emojis_set");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62554Khk[] khkArr;
        A02 = 0oU.A00(khkArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62554Khk khk : values()) {
            A0x.put(khk.A00, khk);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62554Khk(String str) {
        this.A00 = str;
    }
}
