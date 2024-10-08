package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Ooo  reason: case insensitive filesystem */
public final class C71669Ooo implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AnonymousClass632 A02;
    public final /* synthetic */ MailboxFutureImpl A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ byte[] A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A03;
        C71726Opk A002 = C71726Opk.A00(this, 3);
        AnonymousClass681 r0 = AnonymousClass632.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, "MCAMailboxAdvancedCryptoTransport", "SecureMessageUpsertICDCMetadata", A002);
    }

    public C71669Ooo(AnonymousClass632 r1, MailboxFutureImpl mailboxFutureImpl, byte[] bArr, int i, long j, boolean z) {
        this.A02 = r1;
        this.A03 = mailboxFutureImpl;
        this.A00 = i;
        this.A01 = j;
        this.A05 = bArr;
        this.A04 = z;
    }
}
