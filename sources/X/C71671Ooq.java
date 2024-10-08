package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Ooq  reason: case insensitive filesystem */
public final class C71671Ooq implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NAZ A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        C3030067a.A04("MailboxInstagramReverb", "deleteThread", this.A00);
        String A0u = C66580MXl.A0u(NAZ.A00, 4);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 35);
        this.A02.setNotification(A0u, A002);
        MailboxInstagramReverbJNI.dispatchVOOOOO(2, accountSession, this.A05, this.A03, this.A04, A002);
    }

    public C71671Ooq(NAZ naz, MailboxFutureImpl mailboxFutureImpl, Number number, String str, String str2, int i) {
        this.A01 = naz;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A05 = str;
        this.A03 = number;
        this.A04 = str2;
    }
}
