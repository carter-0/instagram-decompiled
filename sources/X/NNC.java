package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel;

public final class NNC extends C228042kh {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final C70651OEy A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new BroadcastChannelActivityFeedV2ViewModel(AnonymousClass7TF.A0A(this.A01), this.A02, this.A03, this.A00);
    }

    public NNC(Context context, UserSession userSession, C70651OEy oEy, int i) {
        AnonymousClass7TG.A1Q(userSession, oEy);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = oEy;
        this.A00 = i;
    }
}
