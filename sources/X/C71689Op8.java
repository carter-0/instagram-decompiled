package X;

import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureauthplatformpake.mca.MailboxSecureAuthPlatformPakeJNI;

/* renamed from: X.Op8  reason: case insensitive filesystem */
public final class C71689Op8 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        if (this.A00 != 0) {
            String A0u = C66580MXl.A0u(NAS.A00, 6);
            NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 47);
            C66580MXl.A1N(A002, this.A03, A0u);
            MailboxSecureAuthPlatformPakeJNI.dispatchVOOOOOOO(4, accountSession, this.A02, this.A04, this.A06, this.A05, (Object) null, A002);
            return;
        }
        String A0u2 = C66580MXl.A0u(NAX.A00, 322);
        NotificationScope A003 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u2, 6);
        C66580MXl.A1N(A003, this.A02, A0u2);
        MailboxEncryptedBackupsJNI.dispatchVOOOOOO(23, accountSession, this.A06, this.A05, this.A04, this.A03, A003);
    }

    public C71689Op8(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = obj3;
        this.A03 = obj4;
    }
}
