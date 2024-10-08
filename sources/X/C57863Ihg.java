package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ihg  reason: case insensitive filesystem */
public final class C57863Ihg implements Runnable {
    public final /* synthetic */ C321736uf A00;
    public final /* synthetic */ C321916ux A01;

    public C57863Ihg(C321736uf r1, C321916ux r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C321736uf r1 = this.A00;
        UserSession userSession = r1.A02;
        C321916ux r0 = this.A01;
        String str = r0.A01;
        String str2 = r0.A02;
        C54672HOd hOd = r0.A00;
        Activity activity = r1.A00;
        0qQ.A0B(str, 1);
        C72956PQo pQo = new C72956PQo(hOd, userSession, str2, 2);
        C331127Pr A0W = DbS.A0W(userSession);
        A0W.A0U = pQo;
        C331157Pu A002 = A0W.A00();
        C58685Ivu ivu = new C58685Ivu(A002, 31);
        C54121Gzq gzq = new C54121Gzq();
        gzq.A01 = str;
        gzq.A03 = ivu;
        gzq.A02 = str2;
        gzq.A00 = hOd;
        A002.A02(activity, gzq);
    }
}
