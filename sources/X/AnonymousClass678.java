package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.678  reason: invalid class name */
public final class AnonymousClass678 implements MailboxCallback {
    public final /* synthetic */ AnonymousClass66t A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ String A02;

    public AnonymousClass678(AnonymousClass66t r1, MailboxFutureImpl mailboxFutureImpl, String str) {
        this.A00 = r1;
        this.A01 = mailboxFutureImpl;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) AnonymousClass66t.A00.A00(45);
        NotificationScope EBU = accountSession.getSessionedNotificationCenterCallbackManager().EBU(new AnonymousClass679(this, str), str, 1);
        this.A01.setNotification(str, EBU);
        MailboxCoreJNI.dispatchVOOO(1, accountSession, this.A02, EBU);
    }
}
