package X;

/* renamed from: X.3p9  reason: invalid class name and case insensitive filesystem */
public enum C252463p9 {
    UNKNOWN(-1, "UNKNOWN"),
    DASH_VIDEO(2, "DASH_VIDEO"),
    DASH_AUDIO(1, "DASH_AUDIO"),
    DASH_TEXT(3, "DASH_TEXT"),
    DASH_UNKNOWN(0, "DASH_UNKNOWN"),
    PROGRESSIVE(10, "PROGRESSIVE"),
    LIVE_VIDEO(11, "LIVE_VIDEO"),
    LIVE_AUDIO(12, "LIVE_AUDIO"),
    LIVE_MANIFEST(13, "LIVE_MANIFEST"),
    LIVE_TEXT(14, "LIVE_TEXT");
    
    public final int A00;
    public final String A01;

    public static boolean A01(C252463p9 r2) {
        if (r2 == LIVE_VIDEO || r2 == LIVE_AUDIO || r2 == LIVE_MANIFEST || r2 == LIVE_TEXT) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: public */
    C252463p9(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public static C252463p9 A00(int i) {
        for (C252463p9 r1 : values()) {
            if (r1.A00 == i) {
                return r1;
            }
        }
        return UNKNOWN;
    }
}
