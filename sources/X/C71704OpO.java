package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureconsentframeworkstandalone.mca.MailboxSecureConsentFrameworkStandaloneJNI;

/* renamed from: X.OpO  reason: case insensitive filesystem */
public final class C71704OpO implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ NAT A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Boolean A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) obj;
        String A0u = C66580MXl.A0u(NAT.A00, 9);
        NotificationScope A002 = C71733Opt.A00((C295115nb) standaloneDatabaseHandle.getNotificationCenterCallbackManager(), this, A0u, 52);
        this.A03.setNotification(A0u, A002);
        MailboxSecureConsentFrameworkStandaloneJNI.dispatchVIIIOOOOOOOO(7, this.A01, this.A00, this.A02, standaloneDatabaseHandle, this.A05, this.A06, this.A07, this.A0A, this.A08, this.A09, A002);
    }

    public C71704OpO(MailboxFutureImpl mailboxFutureImpl, NAT nat, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, int i, int i2, int i3) {
        this.A04 = nat;
        this.A03 = mailboxFutureImpl;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = bool;
        this.A06 = bool2;
        this.A07 = bool3;
        this.A0A = str;
        this.A08 = str2;
        this.A09 = str3;
    }
}
