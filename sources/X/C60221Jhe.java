package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveNotificationApi;
import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.Jhe  reason: case insensitive filesystem */
public final class C60221Jhe extends 2YL {
    public String A00;
    public final Context A01;
    public final 2Fk A02;
    public final AnonymousClass0iw A03;
    public final 1Z6 A04;
    public final UserSession A05;
    public final IgLiveNotificationApi A06;
    public final L5O A07;
    public final IgLiveExploreRepository A08;
    public final IgLiveBroadcastInfoManager A09;
    public final C59720JVe A0A;
    public final C249513ju A0B;
    public final AnonymousClass0r6 A0C;
    public final boolean A0D;

    public C60221Jhe(Context context, AnonymousClass0iw r8, 1Z6 r9, UserSession userSession, IgLiveNotificationApi igLiveNotificationApi, L5O l5o, IgLiveExploreRepository igLiveExploreRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C59720JVe jVe, boolean z) {
        C51973G9u.A0r(2, context, igLiveBroadcastInfoManager, jVe);
        AnonymousClass7TF.A1G(r8, 8, l5o);
        this.A05 = userSession;
        this.A01 = context;
        this.A08 = igLiveExploreRepository;
        this.A09 = igLiveBroadcastInfoManager;
        this.A0A = jVe;
        this.A06 = igLiveNotificationApi;
        this.A04 = r9;
        this.A03 = r8;
        this.A07 = l5o;
        this.A0D = z;
        this.A02 = DbT.A0G(AnonymousClass10H.A00(new MHs(this, (AnonymousClass4D7) null, 6), igLiveExploreRepository.A09, igLiveExploreRepository.A08, igLiveExploreRepository.A07));
        1HR A0o = JTQ.A0o();
        this.A0B = A0o;
        this.A0C = 0u9.A04(A0o);
    }
}
