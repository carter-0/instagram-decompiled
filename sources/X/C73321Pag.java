package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.Pag  reason: case insensitive filesystem */
public final class C73321Pag implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C70990OVe A01;
    public final /* synthetic */ C74417PuX A02;

    public C73321Pag(UserSession userSession, C70990OVe oVe, C74417PuX puX) {
        this.A00 = userSession;
        this.A01 = oVe;
        this.A02 = puX;
    }

    public final void run() {
        String str;
        UserSession userSession = this.A00;
        RealtimeClientManager instance = RealtimeClientManager.getInstance(userSession);
        C70990OVe oVe = this.A01;
        if (oVe.A0D.equals("mark_seen")) {
            str = null;
        } else {
            str = oVe.A0L;
        }
        String A002 = oVe.A00();
        C74417PuX puX = this.A02;
        0qQ.A0B(puX, 1);
        instance.sendCommand(str, A002, new MeR(userSession, puX));
    }
}
