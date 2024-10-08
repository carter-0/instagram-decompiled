package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.5Er  reason: invalid class name and case insensitive filesystem */
public enum C282775Er {
    A07("IMAGE", "not_animated"),
    A06("GIF", "animated"),
    A08("STICKER", "sticker"),
    A05("CUTOUT_VIDEO", "cutout_video"),
    A09("VIDEO", MediaStreamTrack.VIDEO_TRACK_KIND);
    
    public static final Map A02 = null;
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        C282775Er[] r0;
        A03 = 0oU.A00(r0);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (C282775Er r1 : values()) {
            linkedHashMap.put(r1.A01, r1);
        }
        A02 = linkedHashMap;
    }

    public final String toString() {
        return this.A01;
    }

    /* access modifiers changed from: public */
    C282775Er(String str, String str2) {
        this.A01 = str2;
        this.A00 = r2;
    }
}
