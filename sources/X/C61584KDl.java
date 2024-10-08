package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.KDl  reason: case insensitive filesystem */
public final class C61584KDl extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public C61584KDl(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        C62242Kcc A012 = LKG.A01(userSession);
        C62176KbY A013 = C64139LPo.A01(this.A01, userSession);
        IgLiveBroadcastInfoManager A014 = A012.A01();
        C313816h4 r8 = A012.A03;
        C59720JVe A03 = A012.A03();
        IgLiveExploreRepository igLiveExploreRepository = new IgLiveExploreRepository(userSession);
        return new C60220Jhd(userSession, 1Au.A00(userSession), A013.A01(this.A00), igLiveExploreRepository, A014, r8, A03, 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36325347330962316L));
    }
}
