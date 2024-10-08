package X;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

public final class TDH implements Runnable {
    public final /* synthetic */ C12550Sxb A00;

    public TDH(C12550Sxb sxb) {
        this.A00 = sxb;
    }

    public final void run() {
        Context context = this.A00.A0B;
        if (!GooglePlayServicesUtil.A02.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }
}
