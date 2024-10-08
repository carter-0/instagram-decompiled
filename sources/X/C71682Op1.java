package X;

import com.facebook.instagramreverb.mca.MailboxInstagramReverbJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Op1  reason: case insensitive filesystem */
public final class C71682Op1 implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NAZ A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        C3030067a.A04("MailboxInstagramReverb", "loadMessagesForReporting", this.A00);
        String A0u = C66580MXl.A0u(NAZ.A00, 13);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 31);
        this.A02.setNotification(A0u, A002);
        MailboxInstagramReverbJNI.dispatchVOOOOOOZ(8, accountSession, this.A05, this.A04, this.A03, (Object) null, A002, this.A06);
    }

    public C71682Op1(NAZ naz, MailboxFutureImpl mailboxFutureImpl, Number number, Number number2, String str, int i, boolean z) {
        this.A01 = naz;
        this.A00 = i;
        this.A02 = mailboxFutureImpl;
        this.A05 = str;
        this.A04 = number;
        this.A03 = number2;
        this.A06 = z;
    }
}
