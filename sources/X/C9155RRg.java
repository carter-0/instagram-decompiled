package X;

import android.app.Notification;
import android.app.Service;

/* renamed from: X.RRg  reason: case insensitive filesystem */
public abstract class C9155RRg {
    public static void A00(Notification notification, Service service, int i) {
        if (i != 0) {
            i = 1;
        }
        service.startForeground(20030, notification, i);
    }
}
