package X;

import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;
import java.util.List;

/* renamed from: X.OpL  reason: case insensitive filesystem */
public final class C71701OpL implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ NAY A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ Number A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ byte[] A09;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAY.A00, 53);
        NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(accountSession), this, A0u, 25);
        this.A03.setNotification(A0u, A002);
        MailboxInstagramMemJNI.dispatchVIIIJOOOOOOZZ(0, 0, this.A00, 2, this.A01, accountSession, this.A06, this.A05, this.A09, this.A04, A002, this.A08, this.A07);
    }

    public C71701OpL(NAY nay, MailboxFutureImpl mailboxFutureImpl, Number number, String str, List list, byte[] bArr, int i, long j, boolean z, boolean z2) {
        this.A02 = nay;
        this.A03 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A06 = list;
        this.A05 = str;
        this.A09 = bArr;
        this.A04 = number;
        this.A08 = z;
        this.A07 = z2;
    }
}
