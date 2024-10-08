package X;

import com.instagram.api.schemas.IGLiveNotificationPreference;

/* renamed from: X.EnW  reason: case insensitive filesystem */
public abstract class C48994EnW {
    public static final String A00(IGLiveNotificationPreference iGLiveNotificationPreference) {
        int A02 = DbU.A02(iGLiveNotificationPreference, 0);
        if (A02 == 1) {
            return "turn_on_all_live_notifications";
        }
        if (A02 == 3) {
            return "turn_off_live_notifications";
        }
        if (A02 == 2) {
            return "turn_on_some_live_notifications";
        }
        if (A02 == 0) {
            return "ig_live_notification_preference_unrecognized";
        }
        throw AnonymousClass7TE.A1K();
    }
}
