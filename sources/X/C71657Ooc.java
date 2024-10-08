package X;

import android.net.Uri;
import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Ooc  reason: case insensitive filesystem */
public final class C71657Ooc implements MailboxCallback {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ NAY A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ String A04;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAY.A00, 43);
        NotificationScope A012 = C71734Opu.A01(C66580MXl.A0H(accountSession), this, A0u, 20);
        this.A03.setNotification(A0u, A012);
        MailboxInstagramMemJNI.dispatchVOOOOO(4, accountSession, this.A00, this.A01, this.A04, A012);
    }

    public C71657Ooc(Uri uri, Uri uri2, NAY nay, MailboxFutureImpl mailboxFutureImpl, String str) {
        this.A02 = nay;
        this.A03 = mailboxFutureImpl;
        this.A00 = uri;
        this.A01 = uri2;
        this.A04 = str;
    }
}
