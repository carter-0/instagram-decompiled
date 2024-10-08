package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.UxL  reason: case insensitive filesystem */
public enum C16568UxL {
    LEGACY(""),
    JOIN_CHAT_STICKER("join_chat_sticker"),
    MESSAGE_STICKER("message_sticker"),
    CLIPS_JOIN_CHAT_STICKER("clips_join_chat_sticker"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16568UxL[] uxLArr;
        A02 = 0oU.A00(uxLArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16568UxL uxL : values()) {
            linkedHashMap.put(uxL.A00, uxL);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16568UxL(String str) {
        this.A00 = str;
    }
}
