package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class TKO implements Runnable {
    public final /* synthetic */ C13919TlL A00;
    public final /* synthetic */ LiveLocationSession A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C327307Ag A03;
    public final /* synthetic */ Long A04;

    public TKO(C13919TlL tlL, LiveLocationSession liveLocationSession, UserSession userSession, C327307Ag r4, Long l) {
        this.A03 = r4;
        this.A00 = tlL;
        this.A01 = liveLocationSession;
        this.A02 = userSession;
        this.A04 = l;
    }

    public final void run() {
        List<C327337Aj> list = this.A03.A01;
        LiveLocationSession liveLocationSession = this.A01;
        UserSession userSession = this.A02;
        Long l = this.A04;
        for (C327337Aj DNu : list) {
            String str = liveLocationSession.A02;
            0qQ.A07(str);
            DNu.DNu(l.longValue(), str, false, userSession.A05);
        }
        this.A00.onSuccess();
    }
}
