package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.9so  reason: invalid class name and case insensitive filesystem */
public enum C391389so {
    NORMAL("normal"),
    TEXT("text"),
    LIVE("live"),
    FEED("feed"),
    BOOMERANG("boomerang"),
    HANDS_FREE("hands_free"),
    IGTV_CAMERA("igtv"),
    FOCUS("focus"),
    MUSIC("music"),
    CLOSE_FRIENDS("closefriends"),
    STOPMOTION("stopmotion"),
    MULTICAPTURE("multicapture");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391389so[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C391389so r1 : values()) {
            linkedHashMap.put(AnonymousClass7TF.A0j(r1.A00), r1);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C391389so(String str) {
        this.A00 = str;
    }
}
