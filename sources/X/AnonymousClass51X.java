package X;

/* renamed from: X.51X  reason: invalid class name */
public abstract class AnonymousClass51X {
    public static final C233162v9 A00(C233162v9 r1) {
        0qQ.A0B(r1, 0);
        int ordinal = r1.ordinal();
        if (ordinal == 10) {
            return C233162v9.SEEN_STATE_PERSISTENT;
        }
        if (ordinal == 2) {
            return C233162v9.CTA_CLICK_PERSISTENT;
        }
        if (ordinal == 5) {
            return C233162v9.LIKE_CLICK_PERSISTENT;
        }
        if (ordinal == 13) {
            return C233162v9.UNLIKE_CLICK_PERSISTENT;
        }
        if (ordinal != 16) {
            return C233162v9.UNKNOWN;
        }
        return C233162v9.XOUT_PERSISTENT;
    }
}
