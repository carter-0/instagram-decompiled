package X;

import android.app.NotificationManager;
import android.content.Context;

public abstract class OOY {
    public static final boolean A01(Context context) {
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
            int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
            return (currentInterruptionFilter == 0 || currentInterruptionFilter == 1 || (currentInterruptionFilter != 2 && currentInterruptionFilter != 3 && currentInterruptionFilter != 4)) ? false : true;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (android.app.NotificationManager) r5.getSystemService("notification");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.content.Context r5) {
        /*
            java.lang.String r2 = "ig_direct_video_chat"
            r4 = 1
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r5.getSystemService(r1)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            boolean r0 = r0.areNotificationsEnabled()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r5.getSystemService(r1)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            r3 = 0
            android.app.NotificationChannel r2 = r1.getNotificationChannel(r2)
            if (r2 == 0) goto L_0x003a
            java.lang.String r0 = r2.getGroup()
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = r2.getGroup()
            android.app.NotificationChannelGroup r1 = r1.getNotificationChannelGroup(r0)
        L_0x002c:
            int r0 = r2.getImportance()
            if (r0 < r4) goto L_0x003a
            if (r1 == 0) goto L_0x003b
            boolean r0 = r1.isBlocked()
            if (r0 == 0) goto L_0x003b
        L_0x003a:
            r3 = 1
        L_0x003b:
            return r3
        L_0x003c:
            r1 = 0
            goto L_0x002c
        L_0x003e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OOY.A00(android.content.Context):boolean");
    }
}
