package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OoM  reason: case insensitive filesystem */
public final class C71641OoM implements MailboxCallback {
    public final /* synthetic */ AnonymousClass68K A00;
    public final /* synthetic */ NotificationScope A01;
    public final /* synthetic */ String A02;

    public C71641OoM(AnonymousClass68K r1, NotificationScope notificationScope, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = notificationScope;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        ((SlimMailbox) obj).getNotificationCenterCallbackManager().FIs(this.A01, this.A02);
    }
}
