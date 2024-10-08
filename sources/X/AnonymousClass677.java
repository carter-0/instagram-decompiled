package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.677  reason: invalid class name */
public final class AnonymousClass677 implements MailboxCallback {
    public final /* synthetic */ AnonymousClass66t A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ String A03;

    public AnonymousClass677(AnonymousClass66t r1, MailboxFutureImpl mailboxFutureImpl, Number number, String str) {
        this.A00 = r1;
        this.A01 = mailboxFutureImpl;
        this.A02 = number;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) AnonymousClass66t.A00.A00(50);
        NotificationScope EBU = accountSession.getSessionedNotificationCenterCallbackManager().EBU(new C71730Opq(this, str), str, 1);
        this.A01.setNotification(str, EBU);
        MailboxCoreJNI.dispatchVOOOO(29, accountSession, this.A02, this.A03, EBU);
    }
}
