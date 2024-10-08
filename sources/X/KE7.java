package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class KE7 extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        AnonymousClass6h3 A002 = C313766gy.A00(userSession);
        C313696gr A003 = C313636gl.A00(this.A01, userSession);
        IgLiveBroadcastInfoManager A012 = A002.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A002.A04;
        IgLiveCobroadcastRepository A004 = A002.A00(this.A00, userSession);
        C63884LAn lAn = (C63884LAn) A003.A02.getValue();
        C313666go r0 = C313666go.VIEWER;
        boolean z = this.A03;
        AnonymousClass7TG.A1N(userSession, r0);
        return new C60277JiY(userSession, lAn, A004, (IgLiveViewerJoinFlowRepository) A002.A02.getValue(), A012, igLiveHeartbeatManager, z);
    }

    public KE7(Context context, AnonymousClass0iw r2, UserSession userSession, boolean z) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = z;
    }
}
