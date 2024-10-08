package X;

import com.facebook.messengerencryptedbackupsdirect.mca.MailboxMessengerEncryptedBackupsDirectJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OoC  reason: case insensitive filesystem */
public final class C71631OoC implements MailboxCallback {
    public final /* synthetic */ NAP A00;
    public final /* synthetic */ MailboxFutureImpl A01;

    public C71631OoC(NAP nap, MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = nap;
        this.A01 = mailboxFutureImpl;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAP.A00, 1);
        NotificationScope EBU = C66580MXl.A0H(accountSession).EBU(new C71734Opu(this, 29), A0u, 1);
        this.A01.setNotification(A0u, EBU);
        MailboxMessengerEncryptedBackupsDirectJNI.dispatchVOO(11, accountSession, EBU);
    }
}
