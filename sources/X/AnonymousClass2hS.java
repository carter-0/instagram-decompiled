package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2hS  reason: invalid class name */
public enum AnonymousClass2hS {
    INAPPLICABLE("-2"),
    UNKNOWN("-1"),
    EVERSTORE_IGPHOTO_BLOB("2885"),
    EVERSTORE_IGVIDEO_BLOB("2886"),
    EVERSTORE_PRODUCT_IMAGE_BLOB("5328"),
    EVERSTORE_IG_REEL_PHOTO("9792"),
    EVERSTORE_IG_REEL_VIDEO("9793"),
    EVERSTORE_IG_REEL_VIDEO_PERM("12441"),
    EVERSTORE_IG_REEL_PHOTO_PERM("12442");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        AnonymousClass2hS[] r0;
        A02 = 0oU.A00(r0);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (AnonymousClass2hS r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    AnonymousClass2hS(String str) {
        this.A00 = str;
    }
}
