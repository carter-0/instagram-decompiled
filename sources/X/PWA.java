package X;

import com.instagram.direct.notifications.armadillo.service.IgSecureMessageOverWANotificationService;

public final class PWA implements Runnable {
    public final /* synthetic */ IgSecureMessageOverWANotificationService A00;

    public PWA(IgSecureMessageOverWANotificationService igSecureMessageOverWANotificationService) {
        this.A00 = igSecureMessageOverWANotificationService;
    }

    public final void run() {
        IgSecureMessageOverWANotificationService igSecureMessageOverWANotificationService = this.A00;
        igSecureMessageOverWANotificationService.A02 = true;
        igSecureMessageOverWANotificationService.stopSelf();
    }
}
