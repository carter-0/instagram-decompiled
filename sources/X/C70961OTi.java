package X;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;

/* renamed from: X.OTi  reason: case insensitive filesystem */
public final class C70961OTi {
    public final NotificationManager A00;
    public final C333547Zj A01;
    public final 2J9 A02;
    public final 1Xc A03;
    public final 0sP A04;
    public final C61410nE A05;

    public C70961OTi(NotificationManager notificationManager, C61410nE r3, C333547Zj r4, 2J9 r5, 1Xc r6, 0sP r7) {
        AnonymousClass7TG.A0w(1, r4, r7, r3);
        0qQ.A0B(notificationManager, 6);
        this.A01 = r4;
        this.A02 = r5;
        this.A04 = r7;
        this.A05 = r3;
        this.A03 = r6;
        this.A00 = notificationManager;
    }

    public static final StatusBarNotification A00(C70961OTi oTi, String str, String str2) {
        String A0T = 002.A0T(str2, str, '|');
        StatusBarNotification[] activeNotifications = oTi.A00.getActiveNotifications();
        if (activeNotifications == null || activeNotifications.length == 0) {
            return null;
        }
        0sC r2 = new 0sC(activeNotifications);
        while (r2.hasNext()) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) r2.next();
            if (0qQ.A0K(A0T, statusBarNotification.getTag())) {
                return statusBarNotification;
            }
        }
        return null;
    }
}
