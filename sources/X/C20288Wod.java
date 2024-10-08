package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Wod  reason: case insensitive filesystem */
public final /* synthetic */ class C20288Wod implements Runnable {
    public final /* synthetic */ C18574VuQ A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C20288Wod(C18574VuQ vuQ, 1Xj r2, String str) {
        this.A00 = vuQ;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void run() {
        C18574VuQ vuQ = this.A00;
        String str = this.A02;
        1Xj r3 = this.A01;
        vuQ.A04 = str;
        UserSession userSession = vuQ.A00;
        if (r3.A2A(userSession) != null) {
            String id = r3.getId();
            if (id != null) {
                vuQ.A03 = C18574VuQ.A01(id.split("_")[0]);
            }
            User A2A = r3.A2A(userSession);
            A2A.getClass();
            String id2 = A2A.getId();
            String A07 = C231122qu.A07(userSession, r3);
            vuQ.A01 = C18574VuQ.A01(id2);
            vuQ.A02 = C18574VuQ.A01(A07);
        }
    }
}
