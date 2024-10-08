package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Kho  reason: case insensitive filesystem */
public enum C62558Kho {
    STORY_MEDIA("story_media"),
    FEED_MEDIA("feed_media"),
    FRIENDSHIP_CREATION("friendship_creation");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62558Kho[] khoArr;
        A02 = 0oU.A00(khoArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62558Kho kho : values()) {
            A0x.put(kho.A00, kho);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62558Kho(String str) {
        this.A00 = str;
    }
}
