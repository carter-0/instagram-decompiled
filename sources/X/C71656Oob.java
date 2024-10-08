package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Oob  reason: case insensitive filesystem */
public final class C71656Oob implements MailboxCallback {
    public final /* synthetic */ long A00;
    public final /* synthetic */ NAC A01;
    public final /* synthetic */ MailboxFutureImpl A02;
    public final /* synthetic */ Number A03;
    public final /* synthetic */ String A04;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj, this.A02, C66581MXm.A0K(), 0, 1, "MCAMailboxFTS", "MessengerFTSACTQueryMessages", C71726Opk.A00(this, 11));
    }

    public C71656Oob(NAC nac, MailboxFutureImpl mailboxFutureImpl, Number number, String str, long j) {
        this.A01 = nac;
        this.A02 = mailboxFutureImpl;
        this.A00 = j;
        this.A04 = str;
        this.A03 = number;
    }
}
