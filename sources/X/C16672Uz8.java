package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uz8  reason: case insensitive filesystem */
public enum C16672Uz8 {
    UNSPECIFIED("unspecified"),
    TOP("top"),
    TOP_RECENT("top_w_recent_filter"),
    RECENT("recent"),
    CLIPS("clips"),
    IGTV("igtv"),
    ACCOUNT("account");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C16672Uz8[] uz8Arr;
        A02 = 0oU.A00(uz8Arr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (C16672Uz8 uz8 : values()) {
            linkedHashMap.put(uz8.A00, uz8);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C16672Uz8(String str) {
        this.A00 = str;
    }
}
