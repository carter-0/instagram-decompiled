package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8al  reason: invalid class name and case insensitive filesystem */
public enum C358348al {
    VIDEO_CALL("video_call"),
    LIVE("live"),
    PRECAPTURE_PHOTO("precapture_photo"),
    PRECAPTURE_VIDEO("precapture_video"),
    POSTCAPTURE_PHOTO("postcapture_photo"),
    POSTCAPTURE_VIDEO("postcapture_video");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C358348al[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C358348al r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C358348al(String str) {
        this.A00 = str;
    }
}
