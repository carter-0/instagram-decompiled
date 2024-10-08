package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureauthplatformpake.mca.MailboxSecureAuthPlatformPakeJNI;

/* renamed from: X.Op0  reason: case insensitive filesystem */
public final class C71681Op0 implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        if (this.A00 != 0) {
            String A0u = C66580MXl.A0u(NAS.A00, 1);
            NotificationScope EBU = C66580MXl.A0H(accountSession).EBU(new C71733Opt(A0u, this, 46), A0u, 1);
            C66580MXl.A1N(EBU, this.A03, A0u);
            MailboxSecureAuthPlatformPakeJNI.dispatchVOOOOO(3, accountSession, this.A05, this.A02, this.A04, EBU);
            return;
        }
        String A0u2 = C66580MXl.A0u(NAY.A00, 51);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u2, 24);
        C66580MXl.A1N(A002, this.A02, A0u2);
        MailboxInstagramMemJNI.dispatchVOOOOOO(15, accountSession, this.A05, this.A03, this.A04, "logid", A002);
    }

    public C71681Op0(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = str;
        this.A03 = obj3;
        this.A04 = str2;
    }
}
