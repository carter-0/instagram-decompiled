package X;

import com.facebook.msys.util.NotificationScope;

/* renamed from: X.NBp  reason: case insensitive filesystem */
public final class C68353NBp extends AnonymousClass45Y {
    public final /* synthetic */ C67357MmZ A00;
    public final /* synthetic */ NotificationScope A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68353NBp(C67357MmZ mmZ, NotificationScope notificationScope, String str) {
        super("StandaloneDatabaseHandle.cancelNotificationCallback");
        this.A00 = mmZ;
        this.A02 = str;
        this.A01 = notificationScope;
    }

    public final void run() {
        this.A00.A00.getNotificationCenterCallbackManager().FIs(this.A01, this.A02);
    }
}
