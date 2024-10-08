package X;

import com.facebook.messengerencryptedbackupsdirect.mca.MailboxMessengerEncryptedBackupsDirectJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* renamed from: X.Oot  reason: case insensitive filesystem */
public final class C71674Oot implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NAP A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAP.A00, 6);
        NotificationScope A012 = C71734Opu.A01(C66580MXl.A0H(accountSession), this, A0u, 31);
        this.A02.setNotification(A0u, A012);
        MailboxMessengerEncryptedBackupsDirectJNI.dispatchVIOOOOZ(6, this.A00, accountSession, this.A04, this.A03, A012, this.A05);
    }

    public C71674Oot(NAP nap, MailboxFutureImpl mailboxFutureImpl, List list, List list2, int i, boolean z) {
        this.A01 = nap;
        this.A02 = mailboxFutureImpl;
        this.A00 = i;
        this.A04 = list;
        this.A03 = list2;
        this.A05 = z;
    }
}
