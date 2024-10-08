package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.util.NotificationScope;
import com.facebook.tam.mca.MailboxTamJNI;

/* renamed from: X.Ope  reason: case insensitive filesystem */
public final class C71720Ope implements MailboxCallback {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.DbConnectionResolutionCallback dbConnectionResolutionCallback;
        String str;
        String str2;
        int i;
        boolean z;
        MailboxFutureImpl mailboxFutureImpl;
        Mailbox mailbox = (Mailbox) obj;
        switch (this.A00) {
            case 0:
                MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, (MailboxFutureImpl) this.A04, C66581MXm.A0K(), 0, 1, "MCAMailboxFTS", "MessengerFTSACTQueryMessagesOfAllThreads", C71726Opk.A00(this, 12));
                return;
            case 1:
                C3030067a.A04("MailboxTam", "runTamClientThreadSaveDraftMessage", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                z = false;
                dbConnectionResolutionCallback = C71726Opk.A00(this, 64);
                str2 = "MCAMailboxTam";
                str = "TamClientThreadSaveDraftMessage";
                break;
            case 2:
                C3030067a.A04("MailboxTam", "runTamClientThreadSessionInsert", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                z = false;
                dbConnectionResolutionCallback = C71726Opk.A00(this, 65);
                str2 = "MCAMailboxTam";
                str = "TamClientThreadSessionInsert";
                break;
            case 3:
                C3030067a.A04("MailboxTam", "runTamClientThreadSessionActivate", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                z = false;
                dbConnectionResolutionCallback = new C71725Opj(this, 7);
                str2 = "MCAMailboxTam";
                str = "TamClientThreadSessionActivate";
                break;
            case 4:
                C3030067a.A04("MailboxTam", "runTamClientThreadSessionDeactivate", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                z = false;
                dbConnectionResolutionCallback = new C71725Opj(this, 8);
                str2 = "MCAMailboxTam";
                str = "TamClientThreadSessionDeactivate";
                break;
            case 5:
                C3030067a.A04("MailboxTam", "runTamClientThreadUpdateName", this.A01);
                mailboxFutureImpl = (MailboxFutureImpl) this.A04;
                i = 0;
                z = false;
                dbConnectionResolutionCallback = new C71725Opj(this, 10);
                str2 = "MCAMailboxTam";
                str = "TamClientThreadUpdateName";
                break;
            default:
                C3030067a.A04("MailboxTam", "mCATamAttachmentManagerResolveContentToken", this.A01);
                String A0u = C66580MXl.A0u(C68314NAb.A00, 37);
                NotificationScope A002 = C71733Opt.A00(C66580MXl.A0H(mailbox.getAccountSession()), this, A0u, 54);
                C66580MXl.A1N(A002, this.A04, A0u);
                MailboxTamJNI.dispatchVIJOOOOZZ(6, 2, this.A02, mailbox, this.A05, (Object) null, A002, true, false);
                return;
        }
        AnonymousClass681 r0 = C68314NAb.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve(mailbox, mailboxFutureImpl, z, i, 1, str2, str, dbConnectionResolutionCallback);
    }

    public C71720Ope(MailboxFutureImpl mailboxFutureImpl, C68314NAb nAb, String str, int i, int i2, long j) {
        this.A00 = i2;
        this.A03 = nAb;
        this.A01 = i;
        this.A04 = mailboxFutureImpl;
        this.A02 = j;
        this.A05 = str;
    }

    public C71720Ope(NAC nac, MailboxFutureImpl mailboxFutureImpl, String str, int i, long j) {
        this.A00 = 0;
        this.A03 = nac;
        this.A04 = mailboxFutureImpl;
        this.A01 = i;
        this.A02 = j;
        this.A05 = str;
    }
}
