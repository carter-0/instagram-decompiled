package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.PmB  reason: case insensitive filesystem */
public final class C73931PmB extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73931PmB(long j, int i) {
        super(1);
        this.A01 = j;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Mailbox mailbox = (Mailbox) obj;
        0qQ.A0B(mailbox, 0);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        MailboxFeature mailboxFeature = new MailboxFeature(new C66794Mcg(mailbox));
        long j = this.A01;
        int i = this.A00;
        AnonymousClass68L A0F = C66580MXl.A0F(mailboxFeature, 0);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A012 = C3030067a.A01(A0G, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateBlockStatus");
        if (!A0F.EJd(new C71676Oov(A002, i, 0, j, mailboxFeature, A0G))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A012, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateBlockStatus");
        }
        PlatformLogger.platformEventLog(5);
        return C60340gF.A00;
    }
}
