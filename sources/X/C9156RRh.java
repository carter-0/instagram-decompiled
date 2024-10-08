package X;

import android.app.Notification;
import android.app.Service;
import android.os.Build;

/* renamed from: X.RRh  reason: case insensitive filesystem */
public abstract class C9156RRh {
    public static void A00(Notification notification, Service service, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            C9155RRg.A00(notification, service, i);
        } else if (i2 >= 29) {
            C9154RRf.A00(notification, service, i);
        } else {
            service.startForeground(20030, notification);
        }
    }
}
