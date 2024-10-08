package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.KDa  reason: case insensitive filesystem */
public final class C61573KDa extends C228042kh {
    public final Context A00;
    public final UserSession A01;
    public final M0W A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A01;
        C62243Kcd A002 = C63486Kxq.A00(userSession, C313666go.GUEST);
        IgLiveCobroadcastRepository A003 = A002.A00(this.A00, userSession);
        L9O l9o = A002.A00;
        IgLiveBroadcastInfoManager A012 = A002.A01();
        C59720JVe A03 = A002.A03();
        return new C60256JiD(userSession, 0eE.A00(userSession), this.A02, A003, A012, l9o, A03);
    }

    public C61573KDa(Context context, UserSession userSession, M0W m0w) {
        AnonymousClass7TG.A1Q(context, m0w);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = m0w;
    }
}
