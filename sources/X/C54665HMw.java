package X;

import com.facebook.location.platform.api.Location;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HMw  reason: case insensitive filesystem */
public enum C54665HMw {
    ALL_MEDIA_AUTO_COLLECTION("All Posts", 0),
    PRODUCT_AUTO_COLLECTION("Shopping", 1),
    EMPTY_PRODUCT_AUTO_COLLECTION("Empty Wishlist", 2),
    MEDIA("Media", 3),
    AUDIO_AUTO_COLLECTION("Audio", 4),
    LOCATIONS_AUTO_COLLECTION(Location.TAG, 5),
    NEW_COLLECTION("New", 6),
    LIKED_COLLECTIONS("Liked collections", 7),
    SAVED_ENTRYPOINT_COLLECTION("Saved", 8);
    
    public static final Map A02 = null;
    public final String A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        C54665HMw[] hMwArr;
        A03 = 0oU.A00(hMwArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (C54665HMw hMw : values()) {
            A0x.put(hMw.A01, hMw);
        }
        A02 = A0x;
    }

    /* access modifiers changed from: public */
    C54665HMw(String str, int i) {
        this.A01 = r2;
        this.A00 = str;
    }
}
