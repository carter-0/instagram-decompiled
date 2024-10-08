package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

public final class KDB extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        AnonymousClass6h3 A002 = C313766gy.A00(userSession);
        AnonymousClass0iw r3 = this.A00;
        C313696gr A003 = C313636gl.A00(r3, userSession);
        IgLiveBroadcastInfoManager A012 = A002.A01();
        C313816h4 r10 = A002.A03;
        C59720JVe A03 = A002.A03();
        C313716gt r6 = (C313716gt) A003.A05.getValue();
        return new C60219Jhc(r3, userSession, A003.A00, r6, (C63921LDa) A002.A00.getValue(), (C63885LAo) A002.A04.getValue(), A012, r10, A03);
    }

    public KDB(AnonymousClass0iw r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }
}
