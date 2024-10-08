package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;

/* renamed from: X.Pae  reason: case insensitive filesystem */
public final class C73319Pae implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MailboxCallback A01;
    public final /* synthetic */ UserSession A02;

    public C73319Pae(MailboxCallback mailboxCallback, UserSession userSession, long j) {
        this.A02 = userSession;
        this.A00 = j;
        this.A01 = mailboxCallback;
    }

    public final void run() {
        UserSession userSession = this.A02;
        NAB nab = ((C70473O7y) 1y0.A00(userSession).A01(C70473O7y.class, C73911Plm.A00(userSession, 11))).A00;
        long j = this.A00;
        MailboxCallback mailboxCallback = this.A01;
        AnonymousClass68L ASa = nab.mMailboxApiHandleMetaProvider.ASa(0);
        MailboxFutureImpl A0J = C66581MXm.A0J(ASa, mailboxCallback);
        C66582MXn.A1E(ASa, new C71718Opc(j, (Object) nab, 4, (Object) A0J), A0J);
    }
}
