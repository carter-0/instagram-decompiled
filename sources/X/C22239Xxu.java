package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Xxu  reason: case insensitive filesystem */
public final class C22239Xxu implements MailboxCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass632 A03;
    public final /* synthetic */ MailboxFutureImpl A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl = this.A04;
        C22251Xy7 xy7 = new C22251Xy7(this, 0);
        String A002 = C66579MXk.A00(583);
        AnonymousClass681 r0 = AnonymousClass632.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, mailboxFutureImpl, false, 0, 1, A002, "ActParticipantDeviceChangeShared", xy7);
    }

    public C22239Xxu(AnonymousClass632 r1, MailboxFutureImpl mailboxFutureImpl, String str, int i, long j, long j2, boolean z, boolean z2) {
        this.A03 = r1;
        this.A04 = mailboxFutureImpl;
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
        this.A05 = str;
        this.A07 = z;
        this.A06 = z2;
    }
}
