package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveViewerListApi;

public final class KD2 extends C228042kh {
    public final UserSession A00;
    public final C313666go A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        C313786h0 r1 = C313776gz.A0K;
        UserSession userSession = this.A00;
        return new C62302Kda(userSession, new IgLiveViewerListApi(userSession), r1.A00(userSession, this.A01).A01());
    }

    public KD2(UserSession userSession, C313666go r2) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A00 = userSession;
        this.A01 = r2;
    }
}
