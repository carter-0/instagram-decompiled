package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureconsentframeworkstandalone.mca.MailboxSecureConsentFrameworkStandaloneJNI;

/* renamed from: X.Op7  reason: case insensitive filesystem */
public final class C71688Op7 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) obj;
        if (this.A00 != 0) {
            String A0u = C66580MXl.A0u(NAT.A00, 16);
            NotificationScope A002 = C71733Opt.A00((C295115nb) standaloneDatabaseHandle.getNotificationCenterCallbackManager(), this, A0u, 51);
            C66580MXl.A1N(A002, this.A02, A0u);
            MailboxSecureConsentFrameworkStandaloneJNI.dispatchVOOOOOO(17, standaloneDatabaseHandle, this.A03, this.A06, this.A04, this.A05, A002);
            return;
        }
        String A0u2 = C66580MXl.A0u(NAT.A00, 15);
        NotificationScope A003 = C71733Opt.A00((C295115nb) standaloneDatabaseHandle.getNotificationCenterCallbackManager(), this, A0u2, 49);
        C66580MXl.A1N(A003, this.A02, A0u2);
        MailboxSecureConsentFrameworkStandaloneJNI.dispatchVOOOOOO(15, standaloneDatabaseHandle, this.A03, this.A06, this.A04, this.A05, A003);
    }

    public C71688Op7(MailboxFutureImpl mailboxFutureImpl, NAT nat, Boolean bool, Boolean bool2, Boolean bool3, String str, int i) {
        this.A00 = i;
        this.A01 = nat;
        this.A02 = mailboxFutureImpl;
        this.A03 = bool;
        this.A06 = str;
        this.A04 = bool2;
        this.A05 = bool3;
    }
}
