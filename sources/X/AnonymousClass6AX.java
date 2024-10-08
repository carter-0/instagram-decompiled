package X;

import com.facebook.instagramuser.mca.MailboxInstagramUserJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.6AX  reason: invalid class name */
public final class AnonymousClass6AX implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass6AW A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) AnonymousClass6AW.A00.A00(0);
        NotificationScope EBU = accountSession.getSessionedNotificationCenterCallbackManager().EBU(new AnonymousClass6AZ(this), str, 1);
        this.A02.setNotification(str, EBU);
        MailboxInstagramUserJNI.dispatchVIIJOOOOOZ(0, 0, 0, this.A00, accountSession, this.A04, (Object) null, this.A03, EBU, true);
    }

    public AnonymousClass6AX(AnonymousClass6AW r1, MailboxFutureImpl mailboxFutureImpl, String str, String str2, long j) {
        this.A01 = r1;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A04 = str;
        this.A03 = str2;
    }
}
