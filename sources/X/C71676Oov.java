package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Oov  reason: case insensitive filesystem */
public final class C71676Oov implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Object A04;
    public final Object A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        C71726Opk opk;
        String str;
        String str2;
        int i;
        boolean z;
        MailboxFutureImpl mailboxFutureImpl;
        int i2;
        int i3 = this.A00;
        Mailbox mailbox = (Mailbox) obj;
        int i4 = this.A02;
        switch (i3) {
            case 0:
                C3030067a.A04("MailboxInstagramSecureMessage", "runInstagramSecureParticipantsUpdateBlockStatus", i4);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                i = 0;
                z = false;
                opk = C71726Opk.A00(this, 31);
                str2 = "MCAMailboxInstagramSecureMessage";
                str = "InstagramSecureParticipantsUpdateBlockStatus";
                break;
            case 1:
                C3030067a.A04("MailboxInstagramSecureMessage", "runUpdateThreadEphemeralSettings", i4);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                i = 0;
                z = false;
                opk = C71726Opk.A00(this, 39);
                str2 = "MCAMailboxInstagramSecureMessage";
                str = "UpdateThreadEphemeralSettings";
                break;
            default:
                C3030067a.A04("MailboxTam", "runTamClientThreadUpdateGroupMemberAddMode", i4);
                mailboxFutureImpl = (MailboxFutureImpl) this.A05;
                i = 0;
                z = false;
                opk = C71726Opk.A00(this, 63);
                str2 = "MCAMailboxTam";
                str = "TamClientThreadUpdateGroupMemberAddMode";
                i2 = 1;
                AnonymousClass681 r0 = C68314NAb.A00;
                break;
        }
        i2 = 1;
        AnonymousClass681 r02 = AnonymousClass67N.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, z, i, i2, str2, str, opk);
    }

    public C71676Oov(int i, int i2, int i3, long j, Object obj, Object obj2) {
        this.A00 = i3;
        this.A04 = obj;
        this.A02 = i;
        this.A05 = obj2;
        this.A01 = i2;
        this.A03 = j;
    }
}
