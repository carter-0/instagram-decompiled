package X;

import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.PZB  reason: case insensitive filesystem */
public final class C73232PZB implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C72201OyQ A01;

    public C73232PZB(C72201OyQ oyQ, long j) {
        this.A01 = oyQ;
        this.A00 = j;
    }

    public final void run() {
        C70985OUz A002 = C70144Nxy.A00(this.A01.A02);
        long j = this.A00;
        MailboxFeature mailboxFeature = new MailboxFeature(C66845Mdd.A00.A00(A002.A00));
        AnonymousClass68L A0I = C66581MXm.A0I(mailboxFeature);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
        C66582MXn.A1D(A0I, new C71718Opc(j, (Object) mailboxFeature, 7, (Object) A0G), A0G);
        A0G.addResultCallback(new C71721Opf((Object) A002, 34));
    }
}
