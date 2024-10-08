package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.util.NotificationScope;

public final class NBY extends AnonymousClass45Y {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ NotificationScope A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NBY(Mailbox mailbox, NotificationScope notificationScope) {
        super("shutdownAndDelete");
        this.A00 = mailbox;
        this.A01 = notificationScope;
    }

    public final void run() {
        this.A00.shutdownAndDeleteNative(this.A01);
    }
}
