package X;

import android.app.Notification;

/* renamed from: X.9W7  reason: invalid class name */
public abstract class AnonymousClass9W7 {
    public static void A01(Notification.Builder builder) {
        builder.setForegroundServiceBehavior(1);
    }

    public static void A00(Notification.Action.Builder builder, boolean z) {
        builder.setAuthenticationRequired(z);
    }
}
