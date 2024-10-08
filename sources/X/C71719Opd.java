package X;

import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.instagramportabledb.mca.MailboxInstagramPortableDBJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import com.facebook.secureauthplatformpake.mca.MailboxSecureAuthPlatformPakeJNI;

/* renamed from: X.Opd  reason: case insensitive filesystem */
public final class C71719Opd implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj2;
                String A0u = C66580MXl.A0u(NAX.A00, 352);
                NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 15);
                C66580MXl.A1N(A002, this.A03, A0u);
                MailboxEncryptedBackupsJNI.dispatchVOOOO(46, accountSession, this.A02, this.A04, A002);
                return;
            case 1:
                AccountSession accountSession2 = (AccountSession) obj2;
                String A0u2 = C66580MXl.A0u(NAN.A00, 2);
                NotificationScope A003 = C71733Opt.A00(C66580MXl.A0H(accountSession2), this, A0u2, 29);
                C66580MXl.A1N(A003, this.A03, A0u2);
                MailboxInstagramPortableDBJNI.dispatchVOOOO(0, accountSession2, this.A04, this.A02, A003);
                return;
            case 2:
                AccountSession accountSession3 = (AccountSession) obj2;
                String A0u3 = C66580MXl.A0u(NAS.A00, 3);
                NotificationScope A012 = C71734Opu.A01(C66580MXl.A0H(accountSession3), this, A0u3, 38);
                C66580MXl.A1N(A012, this.A03, A0u3);
                MailboxSecureAuthPlatformPakeJNI.dispatchVOOOOO(2, accountSession3, this.A02, this.A04, (Object) null, A012);
                return;
            default:
                MailboxSecureAuthPlatformPakeJNI.dispatchVIOOO(5, 0, obj, this.A02, this.A04);
                ((MailboxObservableImpl) this.A03).setResult((Object) null);
                return;
        }
    }

    public C71719Opd(MailboxFutureImpl mailboxFutureImpl, NAS nas, Number number, String str, int i) {
        this.A00 = i;
        this.A01 = nas;
        if (2 - i != 0) {
            this.A02 = number;
            this.A04 = str;
            this.A03 = mailboxFutureImpl;
        } else {
            this.A03 = mailboxFutureImpl;
            this.A02 = number;
            this.A04 = str;
        }
    }

    public C71719Opd(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = str;
    }
}
