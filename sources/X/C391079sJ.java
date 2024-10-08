package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9sJ  reason: invalid class name and case insensitive filesystem */
public enum C391079sJ {
    IMAGE("image"),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND),
    GIF("gif"),
    UNDEFINED("undefined");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C391079sJ[] r0;
        A02 = 0oU.A00(r0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C391079sJ r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C391079sJ(String str) {
        this.A00 = str;
    }
}
