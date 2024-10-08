package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.Ooy  reason: case insensitive filesystem */
public final class C71679Ooy implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFutureImpl mailboxFutureImpl;
        int i;
        boolean z;
        C71726Opk A002;
        String str;
        String str2;
        int i2 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i3 = this.A01;
        if (i2 != 0) {
            C3030067a.A04("MailboxInstagramSecureMessage", "runInstagramSecureParticipantsRemove", i3);
            mailboxFutureImpl = (MailboxFutureImpl) this.A05;
            i = 0;
            z = false;
            A002 = C71726Opk.A00(this, 34);
            str = "MCAMailboxInstagramSecureMessage";
            str2 = "InstagramSecureParticipantsRemove";
        } else {
            C3030067a.A04("MailboxInstagramSecureMessage", "runInstagramSecureParticipantsAdd", i3);
            mailboxFutureImpl = (MailboxFutureImpl) this.A05;
            i = 0;
            z = false;
            A002 = C71726Opk.A00(this, 33);
            str = "MCAMailboxInstagramSecureMessage";
            str2 = "InstagramSecureParticipantsAdd";
        }
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, z, i, 1, str, str2, A002);
    }

    public C71679Ooy(AnonymousClass67N r1, MailboxFutureImpl mailboxFutureImpl, List list, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = r1;
        this.A01 = i;
        this.A05 = mailboxFutureImpl;
        this.A02 = j;
        this.A04 = list;
    }
}
