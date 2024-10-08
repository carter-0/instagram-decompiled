package X;

import com.facebook.instagramuser.mca.MailboxInstagramUserJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OoV  reason: case insensitive filesystem */
public final class C71650OoV implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass6AW A02;
    public final /* synthetic */ MailboxFutureImpl A03;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(AnonymousClass6AW.A00, 1);
        NotificationScope EBU = C66580MXl.A0H(accountSession).EBU(new C71731Opr(this, A0u), A0u, 1);
        this.A03.setNotification(A0u, EBU);
        MailboxInstagramUserJNI.dispatchVIJOO(1, this.A00, this.A01, accountSession, EBU);
    }

    public C71650OoV(AnonymousClass6AW r1, MailboxFutureImpl mailboxFutureImpl, int i, long j) {
        this.A02 = r1;
        this.A03 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
    }
}
