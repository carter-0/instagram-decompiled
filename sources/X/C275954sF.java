package X;

import android.app.NotificationManager;
import android.os.Build;

/* renamed from: X.4sF  reason: invalid class name and case insensitive filesystem */
public final class C275954sF {
    public NotificationManager A00;

    public final boolean A00() {
        NotificationManager notificationManager;
        if (Build.VERSION.SDK_INT < 29 || (notificationManager = this.A00) == null) {
            return false;
        }
        return notificationManager.areNotificationsPaused();
    }
}
