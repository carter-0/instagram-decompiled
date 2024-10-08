package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveViewerListApi;

public final class LB1 {
    public int A00 = 1;
    public String A01;
    public final UserSession A02;
    public final IgLiveJoinRequestsApi A03;
    public final IgLiveViewerListApi A04;
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;

    public /* synthetic */ LB1(UserSession userSession) {
        IgLiveJoinRequestsApi igLiveJoinRequestsApi = new IgLiveJoinRequestsApi(userSession);
        IgLiveViewerListApi igLiveViewerListApi = new IgLiveViewerListApi(userSession);
        this.A02 = userSession;
        this.A03 = igLiveJoinRequestsApi;
        this.A04 = igLiveViewerListApi;
        C59702JUj jUj = C59702JUj.A00;
        02z A012 = 106.A01(jUj);
        this.A05 = A012;
        this.A07 = 10b.A03(A012);
        02z A013 = 106.A01(jUj);
        this.A06 = A013;
        this.A08 = 10b.A03(A013);
    }
}
