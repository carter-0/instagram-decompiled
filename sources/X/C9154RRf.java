package X;

import android.app.Notification;
import android.app.Service;

/* renamed from: X.RRf  reason: case insensitive filesystem */
public abstract class C9154RRf {
    public static void A00(Notification notification, Service service, int i) {
        if (i != 0) {
            i = 1;
        }
        service.startForeground(20030, notification, i);
    }
}
