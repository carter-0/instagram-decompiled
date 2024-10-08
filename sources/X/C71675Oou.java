package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Oou  reason: case insensitive filesystem */
public final class C71675Oou implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;
    public final Object A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        int i;
        boolean z;
        MailboxFeature.DbConnectionResolutionCallback A002;
        String str;
        String str2;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i3 = this.A01;
        if (i2 != 0) {
            C3030067a.A04("MailboxTam", "runTamClientMessageRangeLoadMoreBefore", i3);
            mailboxFutureImpl = (MailboxFutureImpl) this.A05;
            i = 0;
            z = false;
            A002 = new C71725Opj(this, 6);
            str = "MCAMailboxTam";
            str2 = "TamClientMessageRangeLoadMoreBefore";
        } else {
            C3030067a.A04("MailboxTam", "runTamTransportHybridThreadMuteUntil", i3);
            mailboxFutureImpl = (MailboxFutureImpl) this.A05;
            i = 0;
            z = false;
            A002 = C71726Opk.A00(this, 69);
            str = "MCAMailboxTam";
            str2 = "TamTransportHybridThreadMuteUntil";
        }
        AnonymousClass681 r0 = C68314NAb.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, z, i, 1, str, str2, A002);
    }

    public C71675Oou(MailboxFutureImpl mailboxFutureImpl, C68314NAb nAb, int i, int i2, long j, long j2) {
        this.A00 = i2;
        this.A04 = nAb;
        this.A01 = i;
        this.A05 = mailboxFutureImpl;
        if (i2 != 0) {
            this.A03 = j;
            this.A02 = j2;
        } else {
            this.A02 = j;
            this.A03 = j2;
        }
    }
}
