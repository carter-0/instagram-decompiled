package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class KEB extends C228042kh {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final boolean A02;
    public final Context A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        AnonymousClass6h3 A002 = C313766gy.A00(userSession);
        C313696gr A003 = C313636gl.A00(this.A00, userSession);
        C59720JVe A032 = A002.A03();
        IgLiveBroadcastInfoManager A012 = A002.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A002.A04;
        LAV lav = (LAV) A003.A01.getValue();
        C313736gv r5 = (C313736gv) A003.A06.getValue();
        C313666go r0 = C313666go.VIEWER;
        boolean z = this.A02;
        AnonymousClass7TG.A1N(userSession, r0);
        return new C60275JiW(userSession, lav, r5, (IgLiveViewerJoinFlowRepository) A002.A02.getValue(), A012, igLiveHeartbeatManager, A032, z);
    }

    public KEB(Context context, AnonymousClass0iw r2, UserSession userSession, boolean z) {
        this.A01 = userSession;
        this.A03 = context;
        this.A00 = r2;
        this.A02 = z;
    }
}
