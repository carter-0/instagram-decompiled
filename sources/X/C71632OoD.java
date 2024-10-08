package X;

import com.facebook.messengerencryptedbackupsmemris.mca.MailboxMessengerEncryptedBackupsMemrisJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OoD  reason: case insensitive filesystem */
public final class C71632OoD implements MailboxCallback {
    public final /* synthetic */ NAQ A00;
    public final /* synthetic */ MailboxFutureImpl A01;

    public C71632OoD(NAQ naq, MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = naq;
        this.A01 = mailboxFutureImpl;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAQ.A00, 0);
        NotificationScope A012 = C71734Opu.A01(C66580MXl.A0H(accountSession), this, A0u, 34);
        this.A01.setNotification(A0u, A012);
        MailboxMessengerEncryptedBackupsMemrisJNI.dispatchVOO(3, accountSession, A012);
    }
}
