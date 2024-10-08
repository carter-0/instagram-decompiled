package X;

import android.net.Uri;
import com.facebook.instagrammem.mca.MailboxInstagramMem$BytesAvailableHandlerCallback;
import com.facebook.instagrammem.mca.MailboxInstagramMem$StreamingDownloadCompletionHandlerCallback;
import com.facebook.instagrammem.mca.MailboxInstagramMemJNI;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.OpP  reason: case insensitive filesystem */
public final class C71705OpP implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ Uri A04;
    public final /* synthetic */ MailboxInstagramMem$BytesAvailableHandlerCallback A05;
    public final /* synthetic */ MailboxInstagramMem$StreamingDownloadCompletionHandlerCallback A06;
    public final /* synthetic */ NAY A07;
    public final /* synthetic */ MailboxFutureImpl A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ byte[] A0A;
    public final /* synthetic */ byte[] A0B;
    public final /* synthetic */ byte[] A0C;
    public final /* synthetic */ byte[] A0D;

    public C71705OpP(Uri uri, MailboxInstagramMem$BytesAvailableHandlerCallback mailboxInstagramMem$BytesAvailableHandlerCallback, MailboxInstagramMem$StreamingDownloadCompletionHandlerCallback mailboxInstagramMem$StreamingDownloadCompletionHandlerCallback, NAY nay, MailboxFutureImpl mailboxFutureImpl, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, int i2, int i3, long j) {
        this.A07 = nay;
        this.A08 = mailboxFutureImpl;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = j;
        this.A0B = bArr;
        this.A0A = bArr2;
        this.A0C = bArr3;
        this.A09 = str;
        this.A04 = uri;
        this.A0D = bArr4;
        this.A05 = mailboxInstagramMem$BytesAvailableHandlerCallback;
        this.A06 = mailboxInstagramMem$StreamingDownloadCompletionHandlerCallback;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        AccountSession accountSession = (AccountSession) obj;
        String A0u = C66580MXl.A0u(NAY.A00, 56);
        NotificationScope A012 = C71734Opu.A01(C66580MXl.A0H(accountSession), this, A0u, 22);
        this.A08.setNotification(A0u, A012);
        int i = this.A01;
        int i2 = this.A02;
        int i3 = this.A00;
        long j = this.A03;
        byte[] bArr = this.A0B;
        byte[] bArr2 = this.A0A;
        byte[] bArr3 = this.A0C;
        String str = this.A09;
        Uri uri = this.A04;
        byte[] bArr4 = this.A0D;
        MailboxInstagramMem$BytesAvailableHandlerCallback mailboxInstagramMem$BytesAvailableHandlerCallback = this.A05;
        MailboxInstagramMem$BytesAvailableHandlerCallback mailboxInstagramMem$BytesAvailableHandlerCallback2 = mailboxInstagramMem$BytesAvailableHandlerCallback;
        MailboxInstagramMemJNI.dispatchVIIIJOOOOOOOOOOO(7, i, i2, i3, j, accountSession, bArr, bArr2, bArr3, str, uri, bArr4, (Object) null, mailboxInstagramMem$BytesAvailableHandlerCallback2, this.A06, A012);
    }
}
