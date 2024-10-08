package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.PmM  reason: case insensitive filesystem */
public final class C73942PmM extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73942PmM(long j, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.msys.mca.MailboxFeature, X.67N] */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            return 1aU.A07(new C72132Owr((AnonymousClass6AW) obj, this.A01, this.A02), AnonymousClass6F9.A00("setSupportsE2EESpamdStorage"));
        }
        Mailbox mailbox = (Mailbox) obj;
        0qQ.A0B(mailbox, 0);
        AnonymousClass681 r0 = AnonymousClass67N.A00;
        ? mailboxFeature = new MailboxFeature(new C66794Mcg(mailbox));
        long j = this.A01;
        boolean z = this.A02;
        AnonymousClass68L A0F = C66580MXl.A0F(mailboxFeature, 0);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
        int A002 = C3030067a.A00(A0G);
        TraceInfo A012 = C3030067a.A01(A0G, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateRestrictStatus");
        if (!A0F.EJd(new C71660Oof(mailboxFeature, A0G, A002, j, z))) {
            A0G.cancel(false);
            C3030067a.A02(A002);
            C3030067a.A03(A012, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateRestrictStatus");
        }
        PlatformLogger.platformEventLog(5);
        return C60340gF.A00;
    }
}
