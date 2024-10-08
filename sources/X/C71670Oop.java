package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* renamed from: X.Oop  reason: case insensitive filesystem */
public final class C71670Oop implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ NAY A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAY.A00, 48);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 23);
        this.A02.setNotification(A0u, A002);
        MailboxInstagramMemJNI.dispatchVJOOOOO(14, this.A00, accountSession, this.A03, this.A05, this.A04, A002);
    }

    public C71670Oop(NAY nay, MailboxFutureImpl mailboxFutureImpl, String str, String str2, List list, long j) {
        this.A01 = nay;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A03 = str;
        this.A05 = list;
        this.A04 = str2;
    }
}
