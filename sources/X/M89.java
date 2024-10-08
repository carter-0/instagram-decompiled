package X;

import com.instagram.common.session.UserSession;

public final class M89 implements Runnable {
    public final /* synthetic */ 0lg A00;
    public final /* synthetic */ String A01;

    public M89(0lg r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public final void run() {
        C2601144i.A00();
        String str = this.A01;
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 1);
        C239403Gi.A03(userSession, str);
    }
}
