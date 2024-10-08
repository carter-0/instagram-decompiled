package X;

/* renamed from: X.GTf  reason: case insensitive filesystem */
public abstract class C52453GTf {
    public static final boolean A00(1Xj r3) {
        C54659HMq hMq;
        C54659HMq hMq2 = null;
        if (r3 != null) {
            hMq = r3.A1s();
        } else {
            hMq = null;
        }
        if (hMq != C54659HMq.TOP_MAIN_BOTTOM_SCROLLABLE_THUMBNAILS) {
            if (r3 != null) {
                hMq2 = r3.A1s();
            }
            if (hMq2 == C54659HMq.TOP_MAIN_BOTTOM_THREE_TAPPABLE_THUMBNAILS) {
                return true;
            }
            return false;
        }
        return true;
    }
}
