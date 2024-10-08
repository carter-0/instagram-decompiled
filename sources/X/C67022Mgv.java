package X;

import com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Mgv  reason: case insensitive filesystem */
public final class C67022Mgv implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ AnonymousClass67N A06;
    public final /* synthetic */ MailboxFutureImpl A07;
    public final /* synthetic */ LoggingOption A08;
    public final /* synthetic */ Number A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public C67022Mgv(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, LoggingOption loggingOption, Number number, int i, int i2, int i3, int i4, int i5, long j, boolean z, boolean z2) {
        this.A06 = r1;
        this.A01 = i;
        this.A07 = mailboxFutureImpl;
        this.A02 = i2;
        this.A00 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = j;
        this.A09 = number;
        this.A08 = loggingOption;
        this.A0A = z;
        this.A0B = z2;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        C3030067a.A04("MailboxInstagramSecureMessage", "loadThreadListData", this.A01);
        String A0u = C66580MXl.A0u(AnonymousClass67N.A00, 6);
        NotificationScope EBU = C66580MXl.A0H(accountSession).EBU(new C71734Opu(this, 23), A0u, 1);
        this.A07.setNotification(A0u, EBU);
        MailboxInstagramSecureMessageJNI.dispatchVIIIIJOOOOZZZZZZ(1, this.A02, this.A00, this.A04, this.A03, this.A05, accountSession, this.A09, this.A08, EBU, this.A0A, false, this.A0B, false, false, false);
    }
}
