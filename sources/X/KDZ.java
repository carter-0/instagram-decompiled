package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

public final class KDZ extends C228042kh {
    public final Context A00;
    public final UserSession A01;
    public final C313666go A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        C70599OCw oCw;
        W0T w0t;
        AnonymousClass6h3 r0;
        C62242Kcc kcc;
        C313786h0 r02 = C313776gz.A0K;
        UserSession userSession = this.A01;
        C313666go r5 = this.A02;
        C313776gz A002 = r02.A00(userSession, r5);
        IgLiveBroadcastInfoManager A012 = A002.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A002.A04;
        LES A022 = A002.A02();
        IgLiveModerationRepository A0f = JTP.A0f(A002);
        C313816h4 r10 = A002.A03;
        L5Q l5q = null;
        if (!(A002 instanceof C62242Kcc) || (kcc = (C62242Kcc) A002) == null) {
            oCw = null;
        } else {
            oCw = (C70599OCw) kcc.A01.getValue();
        }
        if (r5 == C313666go.BROADCASTER) {
            w0t = C357488Yc.A03.A00(this.A00, userSession).A00();
        } else {
            w0t = null;
        }
        if ((A002 instanceof AnonymousClass6h3) && (r0 = (AnonymousClass6h3) A002) != null) {
            l5q = (L5Q) r0.A03.getValue();
        }
        C59720JVe A03 = A002.A03();
        boolean A032 = C278264wZ.A03(userSession);
        0Tu A0H = AnonymousClass7TF.A0H(userSession);
        return new C60248Ji5(w0t, r5, oCw, A0f, l5q, A012, r10, igLiveHeartbeatManager, A022, A03, A032, 182.A06(A0H, userSession, 36325347331224464L), 182.A06(A0H, userSession, 36325347331290001L));
    }

    public KDZ(Context context, UserSession userSession, C313666go r3) {
        AnonymousClass7TG.A1Q(userSession, r3);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
    }
}
