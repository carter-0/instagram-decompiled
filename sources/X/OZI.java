package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

public final class OZI {
    public 1xN A00;
    public final O5P A01;
    public final NAX A02;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.NAX, com.facebook.msys.mca.MailboxFeature] */
    public OZI(O5P o5p, AnonymousClass68I r3) {
        this.A02 = new MailboxFeature(r3);
        this.A01 = o5p;
    }

    public static final void A01(C71087ObS obS) {
        N0J.A01(obS, new Exception("api disabled by GK"));
        0KC.A0C("EncryptedBackupsManagerApi", "api disabled by GK");
    }

    public static final C71087ObS A00(OZI ozi, int i) {
        C71087ObS A002 = C71087ObS.A00();
        if (!C51971G9r.A1b(ozi.A01.A00)) {
            A01(A002);
            return A002;
        }
        NAX nax = ozi.A02;
        Integer valueOf = Integer.valueOf(i);
        C71722Opg A003 = C71722Opg.A00(A002, 3);
        AnonymousClass68L A0I = C66581MXm.A0I(nax);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0I, A003);
        C66582MXn.A1D(A0I, new C71651OoW(7, valueOf, A0J, nax), A0J);
        return A002;
    }

    public final C71087ObS A02(Integer num) {
        C71087ObS A002 = C71087ObS.A00();
        if (!C51971G9r.A1b(this.A01.A00)) {
            A01(A002);
            return A002;
        }
        NAX nax = this.A02;
        C71723Oph oph = new C71723Oph(this, A002, 3);
        AnonymousClass68L A0I = C66581MXm.A0I(nax);
        MailboxFutureImpl A0J = C66581MXm.A0J(A0I, oph);
        C66582MXn.A1D(A0I, new C71651OoW(4, num, A0J, nax), A0J);
        return A002;
    }
}
