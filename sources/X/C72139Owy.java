package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.Owy  reason: case insensitive filesystem */
public final class C72139Owy implements AnonymousClass67Q {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Mailbox A01;
    public final /* synthetic */ String A02;

    public C72139Owy(Mailbox mailbox, String str, int i) {
        this.A01 = mailbox;
        this.A02 = str;
        this.A00 = i;
    }

    public final void Eyr(AnonymousClass67Z r9) {
        Mailbox mailbox = this.A01;
        if (!mailbox.isValid()) {
            r9.A02(C69306Nj7.INVALID_MAILBOX);
            r9.A00();
            return;
        }
        AnonymousClass681 r0 = NAR.A00;
        MailboxFeature mailboxFeature = new MailboxFeature(new C66794Mcg(mailbox));
        String str = this.A02;
        int i = this.A00;
        C71721Opf opf = new C71721Opf(r9, 41);
        AnonymousClass68L ASa = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0J = C66581MXm.A0J(ASa, opf);
        C66582MXn.A1E(ASa, new C71665Ook(mailboxFeature, A0J, str, i, 1), A0J);
    }
}
