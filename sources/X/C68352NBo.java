package X;

import com.facebook.msys.util.NotificationScope;

/* renamed from: X.NBo  reason: case insensitive filesystem */
public final class C68352NBo extends AnonymousClass45Y {
    public final /* synthetic */ C3023762v A00;
    public final /* synthetic */ NotificationScope A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68352NBo(C3023762v r2, NotificationScope notificationScope, String str) {
        super("AccountSessionMailboxApiHandleMetaProvider.cancelNotificationCallback");
        this.A00 = r2;
        this.A02 = str;
        this.A01 = notificationScope;
    }

    public final void run() {
        this.A00.A00.A01.getNotificationCenterCallbackManager().FIs(this.A01, this.A02);
    }
}
