package X;

import com.facebook.core.mca.MailboxCoreJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Mq8  reason: case insensitive filesystem */
public final class C67574Mq8 implements MailboxCallback {
    public final /* synthetic */ AnonymousClass66t A00;
    public final /* synthetic */ MailboxFutureImpl A01;
    public final /* synthetic */ String A02;

    public C67574Mq8(AnonymousClass66t r1, MailboxFutureImpl mailboxFutureImpl, String str) {
        this.A00 = r1;
        this.A01 = mailboxFutureImpl;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(AnonymousClass66t.A00, 5);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 2);
        this.A01.setNotification(A0u, A002);
        MailboxCoreJNI.dispatchVOOO(55, accountSession, this.A02, A002);
    }
}
