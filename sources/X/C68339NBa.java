package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.NBa  reason: case insensitive filesystem */
public final class C68339NBa extends AnonymousClass45Y {
    public final /* synthetic */ Mailbox A00;
    public final /* synthetic */ NotificationScope A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68339NBa(Mailbox mailbox, NotificationScope notificationScope) {
        super("delete");
        this.A00 = mailbox;
        this.A01 = notificationScope;
    }

    public final void run() {
        this.A00.logoutAndDeleteNative(this.A01);
    }
}
