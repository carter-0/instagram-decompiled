package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.675  reason: invalid class name */
public final class AnonymousClass675 implements MailboxCallback {
    public final /* synthetic */ AnonymousClass66t A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ Number A02;
    public final /* synthetic */ Number A03;

    public AnonymousClass675(AnonymousClass66t r1, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2) {
        this.A00 = r1;
        this.A01 = mailboxFutureImpl;
        this.A03 = number;
        this.A02 = number2;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) AnonymousClass66t.A00.A00(48);
        NotificationScope EBU = accountSession.getSessionedNotificationCenterCallbackManager().EBU(new AnonymousClass676(this, str), str, 1);
        this.A01.setNotification(str, EBU);
        MailboxCoreJNI.dispatchVOOOO(4, accountSession, this.A03, this.A02, EBU);
    }
}
