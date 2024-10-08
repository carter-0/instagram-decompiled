package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveWaveApi;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.LAo  reason: case insensitive filesystem */
public final class C63885LAo {
    public AnonymousClass1EO A00;
    public String A01;
    public final UserSession A02;
    public final IgLiveWaveApi A03;
    public final IgLiveBroadcastInfoManager A04;
    public final C249513ju A05;
    public final AnonymousClass0r6 A06;
    public final C313816h4 A07;

    public C63885LAo(UserSession userSession, IgLiveWaveApi igLiveWaveApi, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C313816h4 r5) {
        AnonymousClass7TG.A1U(userSession, r5, igLiveBroadcastInfoManager);
        this.A02 = userSession;
        this.A07 = r5;
        this.A04 = igLiveBroadcastInfoManager;
        this.A03 = igLiveWaveApi;
        1HR A0w = G9w.A0w();
        this.A05 = A0w;
        this.A06 = 0u9.A04(A0w);
    }
}
