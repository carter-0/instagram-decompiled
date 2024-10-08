package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* renamed from: X.OpA  reason: case insensitive filesystem */
public final class C71690OpA implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ NAY A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAY.A00, 48);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 22);
        this.A02.setNotification(A0u, A002);
        MailboxInstagramMemJNI.dispatchVJOOOOOOO(13, this.A00, accountSession, this.A03, this.A07, this.A06, this.A04, this.A05, A002);
    }

    public C71690OpA(NAY nay, MailboxFutureImpl mailboxFutureImpl, String str, String str2, String str3, List list, List list2, long j) {
        this.A01 = nay;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A03 = str;
        this.A07 = list;
        this.A06 = list2;
        this.A04 = str2;
        this.A05 = str3;
    }
}
