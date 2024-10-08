package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OoF  reason: case insensitive filesystem */
public final /* synthetic */ class C71634OoF implements MailboxCallback {
    public final /* synthetic */ NotificationScope A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C71634OoF(NotificationScope notificationScope, String str) {
        this.A01 = str;
        this.A00 = notificationScope;
    }

    public final void onCompletion(Object obj) {
        String str = this.A01;
        ((SlimMailbox) obj).mAccountSession.getNotificationCenterCallbackManager().FIs(this.A00, str);
    }
}
