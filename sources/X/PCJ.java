package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.instagram.common.session.UserSession;

public final class PCJ implements C3031367n {
    public C3027465c A00;
    public C72212Oyd A01;

    public final /* bridge */ /* synthetic */ void EpW(Object obj) {
        C3031167l r5 = (C3031167l) obj;
        0qQ.A0B(r5, 0);
        AnonymousClass1aS r0 = 1aD.A06;
        Mailbox mailbox = r5.A01;
        C3027465c r02 = new C3027465c(mailbox);
        this.A00 = r02;
        14i.A05(r02.A03);
        UserSession userSession = r5.A02;
        C72212Oyd oyd = (C72212Oyd) userSession.A01(C72212Oyd.class, C73911Plm.A00(userSession, 32));
        this.A01 = oyd;
        if (oyd == null) {
            throw AnonymousClass7TE.A0y();
        } else if (oyd.integrator == null) {
            Execution.executeAsync(new C68349NBl(mailbox, oyd), (AccountSession) null, 1);
        }
    }

    public final void Ezd() {
        AnonymousClass1aS r0 = 1aD.A06;
        C72212Oyd oyd = this.A01;
        if (oyd != null) {
            oyd.integrator = null;
            C3027465c r02 = this.A00;
            if (r02 != null) {
                14i.A06(r02.A03);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
