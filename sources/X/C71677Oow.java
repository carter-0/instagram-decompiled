package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.StandaloneDatabaseHandle;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureconsentframeworkstandalone.mca.MailboxSecureConsentFrameworkStandaloneJNI;

/* renamed from: X.Oow  reason: case insensitive filesystem */
public final class C71677Oow implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            StandaloneDatabaseHandle standaloneDatabaseHandle = (StandaloneDatabaseHandle) obj2;
            String A0u = C66580MXl.A0u(NAT.A00, 11);
            NotificationScope A002 = C71733Opt.A00((C295115nb) standaloneDatabaseHandle.getNotificationCenterCallbackManager(), this, A0u, 48);
            C66580MXl.A1N(A002, this.A04, A0u);
            MailboxSecureConsentFrameworkStandaloneJNI.dispatchVIIOOZ(10, this.A01, this.A02, standaloneDatabaseHandle, A002, this.A05);
            return;
        }
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj2, (MailboxFutureImpl) this.A04, false, 0, 1, "MCAMailboxSecureConsentFramework", "SecureConsentFrameworkUpsertBoolValue", C71726Opk.A00(this, 48));
    }

    public C71677Oow(int i, int i2, int i3, Object obj, Object obj2, boolean z) {
        this.A00 = i3;
        this.A03 = obj2;
        this.A04 = obj;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = z;
    }
}
