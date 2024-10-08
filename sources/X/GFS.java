package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;

public final class GFS {
    public final long A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final 2V5 A02;
    public final 2V5 A03;
    public final UserSession A04;

    public GFS(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        Boolean A0u = AnonymousClass7TE.A0u();
        this.A02 = new 2V5(A0u);
        this.A03 = new 2V5(A0u);
        this.A00 = 182.A01(0Tu.A05, userSession, 36604434306176052L);
    }
}
