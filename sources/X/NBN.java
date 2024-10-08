package X;

import com.facebook.msys.mca.MessageSyncService;

public final class NBN extends AnonymousClass45Y {
    public final /* synthetic */ MessageSyncService A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NBN(MessageSyncService messageSyncService) {
        super("messageSyncServiceSetState");
        this.A00 = messageSyncService;
    }

    public final void run() {
        this.A00.setStateNative(1);
    }
}
