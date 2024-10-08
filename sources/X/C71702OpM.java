package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OpM  reason: case insensitive filesystem */
public final class C71702OpM implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ NAY A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ Number A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ byte[] A09;

    public C71702OpM(NAY nay, MailboxFutureImpl mailboxFutureImpl, Number number, String str, byte[] bArr, int i, int i2, long j, boolean z, boolean z2) {
        this.A03 = nay;
        this.A04 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
        this.A06 = str;
        this.A09 = bArr;
        this.A05 = number;
        this.A08 = z;
        this.A07 = z2;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAY.A00, 54);
        NotificationScope EBU = C66580MXl.A0H(accountSession).EBU(new C71733Opt(A0u, this, 26), A0u, 1);
        this.A04.setNotification(A0u, EBU);
        MailboxInstagramMemJNI.dispatchVIIIIJOOOOOZZ(1, this.A00, 0, this.A01, 2, this.A02, accountSession, this.A06, this.A09, this.A05, EBU, this.A08, this.A07);
    }
}
