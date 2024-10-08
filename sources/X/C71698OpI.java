package X;

import android.net.Uri;
import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OpI  reason: case insensitive filesystem */
public final class C71698OpI implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Uri A02;
    public final /* synthetic */ NAY A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;
    public final /* synthetic */ byte[] A07;
    public final /* synthetic */ byte[] A08;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAY.A00, 31);
        NotificationScope A012 = C71734Opu.A01(C66580MXl.A0H(accountSession), this, A0u, 21);
        this.A04.setNotification(A0u, A012);
        MailboxInstagramMemJNI.dispatchVIJOOOOOOO(6, this.A00, this.A01, accountSession, this.A07, this.A06, this.A08, this.A05, this.A02, A012);
    }

    public C71698OpI(Uri uri, NAY nay, MailboxFutureImpl mailboxFutureImpl, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, long j) {
        this.A03 = nay;
        this.A04 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A07 = bArr;
        this.A06 = bArr2;
        this.A08 = bArr3;
        this.A05 = str;
        this.A02 = uri;
    }
}
