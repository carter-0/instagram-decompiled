package X;

import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OpE  reason: case insensitive filesystem */
public final class C71694OpE implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ AnonymousClass67N A06;
    public final /* synthetic */ MailboxFutureImpl A07;

    public C71694OpE(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, int i, int i2, int i3, long j, long j2, long j3) {
        this.A06 = r1;
        this.A00 = i;
        this.A07 = mailboxFutureImpl;
        this.A02 = i2;
        this.A01 = i3;
        this.A05 = j;
        this.A04 = j2;
        this.A03 = j3;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        C3030067a.A04("MailboxInstagramSecureMessage", "loadThreadViewDataWithOptions", this.A00);
        String A0u = C66580MXl.A0u(AnonymousClass67N.A00, 7);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 41);
        this.A07.setNotification(A0u, A002);
        MailboxInstagramSecureMessageJNI.dispatchVIIJJJOOZZZZZZ(0, this.A02, this.A01, this.A05, this.A04, this.A03, accountSession, A002, true, false, false, true, true, false);
    }
}
