package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OoN  reason: case insensitive filesystem */
public final class C71642OoN implements MailboxCallback {
    public final /* synthetic */ AnonymousClass68M A00;
    public final /* synthetic */ NotificationScope A01;
    public final /* synthetic */ String A02;

    public C71642OoN(AnonymousClass68M r1, NotificationScope notificationScope, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = notificationScope;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        ((SlimMailbox) obj).getNotificationCenterCallbackManager().FIs(this.A01, this.A02);
    }
}
