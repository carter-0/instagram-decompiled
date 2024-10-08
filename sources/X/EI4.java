package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

public final class EI4 extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1Xc A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EI4(UserSession userSession, 1Xc r3) {
        super(340);
        this.A01 = r3;
        this.A00 = userSession;
    }

    public final void run() {
        Iterator A0v = AnonymousClass7TF.A0v(this.A01.A01);
        while (A0v.hasNext()) {
            UserSession userSession = this.A00;
            C239473Gp A002 = ((AnonymousClass1Y0) A0v.next()).A00(userSession);
            A002.ASb();
            A002.EDH(userSession);
        }
    }
}
