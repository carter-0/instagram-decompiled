package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.standalonedatabase.mca.MailboxStandaloneDatabase$SchemaDeployerCallback;
import com.facebook.standalonedatabase.mca.MailboxStandaloneDatabaseJNI;

/* renamed from: X.5z5  reason: invalid class name and case insensitive filesystem */
public final class C301375z5 implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ MailboxStandaloneDatabase$SchemaDeployerCallback A01;
    public final /* synthetic */ AnonymousClass62t A02;
    public final /* synthetic */ String A03;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String str = (String) AnonymousClass62t.A00.A00(1);
        NotificationScope EBU = accountSession.getSessionedNotificationCenterCallbackManager().EBU(new C71729Opp(this), str, 1);
        this.A00.setNotification(str, EBU);
        MailboxStandaloneDatabaseJNI.dispatchVOOOOO(0, accountSession, "IGDWellbeingDatabase", this.A03, this.A01, EBU);
    }

    public C301375z5(MailboxFutureImpl mailboxFutureImpl, MailboxStandaloneDatabase$SchemaDeployerCallback mailboxStandaloneDatabase$SchemaDeployerCallback, AnonymousClass62t r3, String str) {
        this.A02 = r3;
        this.A00 = mailboxFutureImpl;
        this.A03 = str;
        this.A01 = mailboxStandaloneDatabase$SchemaDeployerCallback;
    }
}
