package X;

import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OpF  reason: case insensitive filesystem */
public final class C71695OpF implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass67N A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        C3030067a.A04("MailboxInstagramSecureMessage", "forward", this.A00);
        String A0u = C66580MXl.A0u(AnonymousClass67N.A00, 9);
        NotificationScope A012 = C71734Opu.A01(C66580MXl.A0H(accountSession), this, A0u, 25);
        this.A04.setNotification(A0u, A012);
        MailboxInstagramSecureMessageJNI.dispatchVJJOOOOOO(7, this.A02, this.A01, accountSession, this.A05, this.A06, this.A07, (Object) null, A012);
    }

    public C71695OpF(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, String str, String str2, String str3, int i, long j, long j2) {
        this.A03 = r1;
        this.A00 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
    }
}
