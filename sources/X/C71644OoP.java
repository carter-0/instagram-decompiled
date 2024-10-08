package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.standalonedatabase.mca.MailboxStandaloneDatabaseJNI;

/* renamed from: X.OoP  reason: case insensitive filesystem */
public final class C71644OoP implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ StandaloneDatabaseHandle A01;
    public final /* synthetic */ AnonymousClass62t A02;

    public C71644OoP(MailboxFutureImpl mailboxFutureImpl, StandaloneDatabaseHandle standaloneDatabaseHandle, AnonymousClass62t r3) {
        this.A02 = r3;
        this.A00 = mailboxFutureImpl;
        this.A01 = standaloneDatabaseHandle;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(AnonymousClass62t.A00, 0);
        NotificationScope EBU = C66580MXl.A0H(accountSession).EBU(new C71734Opu(this, 41), A0u, 1);
        this.A00.setNotification(A0u, EBU);
        MailboxStandaloneDatabaseJNI.dispatchVOOO(1, accountSession, this.A01, EBU);
    }
}
