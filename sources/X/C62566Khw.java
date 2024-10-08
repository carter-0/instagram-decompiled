package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Khw  reason: case insensitive filesystem */
public enum C62566Khw {
    PHOTO_BLOCK_GLOBAL("photo_block_global"),
    PHOTO_BLOCK_ALLOWLIST("photo_block_allowlist"),
    PHOTO_BLOCK_BLOCKLIST("photo_block_blocklist"),
    SEGMENTED_VIDEO_BLOCK_GLOBAL("segmented_video_block_global"),
    SEGMENTED_VIDEO_BLOCK_ALLOWLIST("segmented_video_block_whitelist");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C62566Khw[] khwArr;
        A02 = 0oU.A00(khwArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C62566Khw khw : values()) {
            A0x.put(khw.A00, khw);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    C62566Khw(String str) {
        this.A00 = str;
    }
}
