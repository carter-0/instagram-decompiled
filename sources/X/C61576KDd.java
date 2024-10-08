package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveNotificationApi;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.KDd  reason: case insensitive filesystem */
public final class C61576KDd extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public C61576KDd(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        AnonymousClass6h3 A002 = C313766gy.A00(userSession);
        AnonymousClass0iw r4 = this.A01;
        C313696gr A003 = C313636gl.A00(r4, userSession);
        Context context = this.A00;
        IgLiveExploreRepository igLiveExploreRepository = new IgLiveExploreRepository(userSession);
        IgLiveBroadcastInfoManager A012 = A002.A01();
        C59720JVe A03 = A002.A03();
        return new C60221Jhe(context, r4, AnonymousClass2MF.A00(), userSession, new IgLiveNotificationApi(userSession), (L5O) A003.A03.getValue(), igLiveExploreRepository, A012, A03, 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36325347330962316L));
    }
}
