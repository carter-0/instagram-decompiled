package X;

import com.facebook.messenger.notification.engine.MSGNotificationEngineInstagramSyncPathIntegrator;
import com.facebook.msys.mca.Mailbox;
import com.instagram.direct.notifications.sync.NotificationEngineInstagramSyncIntegrator;

/* renamed from: X.NBm  reason: case insensitive filesystem */
public final class C68350NBm extends AnonymousClass45Y {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ NotificationEngineInstagramSyncIntegrator A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68350NBm(Mailbox mailbox, NotificationEngineInstagramSyncIntegrator notificationEngineInstagramSyncIntegrator) {
        super("Instagram Integrator Start");
        this.A01 = notificationEngineInstagramSyncIntegrator;
        this.A00 = mailbox;
    }

    public final void run() {
        NotificationEngineInstagramSyncIntegrator notificationEngineInstagramSyncIntegrator = this.A01;
        notificationEngineInstagramSyncIntegrator.valueProviderRegister.A00(notificationEngineInstagramSyncIntegrator.valueProvider);
        OX0 ox0 = MSGNotificationEngineInstagramSyncPathIntegrator.Companion;
        notificationEngineInstagramSyncIntegrator.integrator = new MSGNotificationEngineInstagramSyncPathIntegrator(notificationEngineInstagramSyncIntegrator.valueProvider, this.A00, notificationEngineInstagramSyncIntegrator.notificationEngineInstagramIntegratorCallback, true, DbY.A1Y(0Tu.A05, notificationEngineInstagramSyncIntegrator.userSession, 36314863316831077L));
    }
}
