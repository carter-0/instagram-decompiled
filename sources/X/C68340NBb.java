package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.NBb  reason: case insensitive filesystem */
public final class C68340NBb extends AnonymousClass45Y {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ NotificationScope A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68340NBb(Mailbox mailbox, NotificationScope notificationScope) {
        super("logoutAndEncrypt");
        this.A00 = mailbox;
        this.A01 = notificationScope;
    }

    public final void run() {
        this.A00.logoutAndEncryptNative(this.A01);
    }
}
