package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

public final class OMK {
    public final NAX A00;
    public final NAS A01;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.NAS, com.facebook.msys.mca.MailboxFeature] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.NAX, com.facebook.msys.mca.MailboxFeature] */
    public OMK(Mailbox mailbox) {
        0qQ.A0B(mailbox, 1);
        AnonymousClass681 r0 = NAS.A00;
        ? mailboxFeature = new MailboxFeature(new C66794Mcg(mailbox));
        AnonymousClass681 r02 = NAX.A00;
        ? mailboxFeature2 = new MailboxFeature(new C66794Mcg(mailbox));
        this.A01 = mailboxFeature;
        this.A00 = mailboxFeature2;
    }

    public final C71087ObS A00(String str) {
        C71087ObS A002 = C71087ObS.A00();
        NAX nax = this.A00;
        C71722Opg A003 = C71722Opg.A00(A002, 16);
        AnonymousClass68L A0I = C66581MXm.A0I(nax);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0I, A003);
        C66582MXn.A1D(A0I, new C71652OoX(nax, A0J, str, 4), A0J);
        return A002;
    }

    public final C71087ObS A01(String str, List list) {
        C71087ObS A002 = C71087ObS.A00();
        NAX nax = this.A00;
        C71722Opg A003 = C71722Opg.A00(A002, 20);
        AnonymousClass68L A0I = C66581MXm.A0I(nax);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0I, A003);
        C66582MXn.A1E(A0I, new C71719Opd((Object) nax, (Object) A0J, (Object) list, str, 0), A0J);
        return A002;
    }
}
