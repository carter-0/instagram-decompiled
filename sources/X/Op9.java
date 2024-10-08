package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.util.NotificationScope;
import com.facebook.urlblackholestandalone.mca.MailboxUrlBlackholeStandaloneJNI;

public final class Op9 implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ NAV A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) obj;
        String A0u = C66580MXl.A0u(NAV.A00, 4);
        NotificationScope EBU = ((C295115nb) standaloneDatabaseHandle.getNotificationCenterCallbackManager()).EBU(new C71733Opt(A0u, this, 55), A0u, 1);
        this.A00.setNotification(A0u, EBU);
        MailboxUrlBlackholeStandaloneJNI.dispatchVOOOOOOO(1, standaloneDatabaseHandle, this.A02, this.A03, this.A04, this.A05, this.A06, EBU);
    }

    public Op9(MailboxFutureImpl mailboxFutureImpl, NAV nav, String str, String str2, String str3, String str4, String str5) {
        this.A01 = nav;
        this.A00 = mailboxFutureImpl;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }
}
