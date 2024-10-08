package X;

import com.facebook.msys.mca.MessageSyncService;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.NBd  reason: case insensitive filesystem */
public final class C68342NBd extends AnonymousClass45Y {
    public final /* synthetic */ MessageSyncService A00;
    public final /* synthetic */ NotificationScope A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68342NBd(MessageSyncService messageSyncService, NotificationScope notificationScope) {
        super("shutdown");
        this.A00 = messageSyncService;
        this.A01 = notificationScope;
    }

    public final void run() {
        this.A00.shutdownNative(this.A01);
    }
}
