package X;

import com.instagram.api.schemas.WearablesAppAttributionType;

/* renamed from: X.JYh  reason: case insensitive filesystem */
public final class C59788JYh extends C62948Kp0 {
    public static final WearablesAppAttributionType A00 = WearablesAppAttributionType.HAMMERHEAD;
    public static final C391429sz A01 = C391429sz.A0L;
    public static final C59788JYh A02 = new Object();

    public static final boolean A00(0lg r6, String str) {
        if (str == null) {
            return false;
        }
        if (00l.A0d(str, "Hammerhead", true) || 00l.A0d(str, "com.facebook.hammerhead", false) || 00l.A0d(str, "Ray-Ban | Meta", false) || 00l.A0d(str, 182.A04(0Tu.A05, r6, 36880652242583895L), false)) {
            return true;
        }
        return false;
    }
}
