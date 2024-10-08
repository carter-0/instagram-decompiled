package X;

import android.app.Notification;
import android.app.Service;

public abstract class RSE {
    public static void A00(Notification notification, Service service, int i, int i2) {
        service.startForeground(i, notification, i2);
    }
}
