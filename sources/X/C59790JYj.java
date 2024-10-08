package X;

import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager;

/* renamed from: X.JYj  reason: case insensitive filesystem */
public final class C59790JYj extends C62948Kp0 {
    public static final WearablesAppAttributionType A00 = WearablesAppAttributionType.STELLA;
    public static final C59790JYj A01 = new Object();

    public static final boolean A00(String str) {
        if (str != null) {
            return 00l.A0d(str, "Facebook View", false) || 00l.A0d(str, "com.facebook.stella", false) || 00l.A0d(str, WearableMediaDownloadManager.MODEL_FIELD_STELLA_PHOTO, false) || 00l.A0d(str, "Stella", false) || 00l.A0d(str, "Starfish", true);
        }
        return false;
    }
}
