package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Uz3  reason: case insensitive filesystem */
public enum C16667Uz3 {
    IMAGE("image"),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND),
    API_RESPONSE("api_response"),
    UNKNOWN_ITEM_TYPE("unknown_type");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16667Uz3[] uz3Arr;
        A02 = 0oU.A00(uz3Arr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16667Uz3 uz3 : values()) {
            linkedHashMap.put(uz3.A00, uz3);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C16667Uz3(String str) {
        this.A00 = str;
    }
}
