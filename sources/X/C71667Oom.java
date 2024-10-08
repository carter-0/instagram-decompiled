package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureconsentframeworkstandalone.mca.MailboxSecureConsentFrameworkStandaloneJNI;

/* renamed from: X.Oom  reason: case insensitive filesystem */
public final class C71667Oom implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ NAT A03;
    public final /* synthetic */ String A04;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) obj;
        String A0u = C66580MXl.A0u(NAT.A00, 17);
        NotificationScope A002 = C71733Opt.A00((C295115nb) standaloneDatabaseHandle.getNotificationCenterCallbackManager(), this, A0u, 50);
        this.A02.setNotification(A0u, A002);
        MailboxSecureConsentFrameworkStandaloneJNI.dispatchVIIOOO(16, this.A00, this.A01, standaloneDatabaseHandle, this.A04, A002);
    }

    public C71667Oom(MailboxFutureImpl mailboxFutureImpl, NAT nat, String str, int i, int i2) {
        this.A03 = nat;
        this.A02 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = str;
    }
}
