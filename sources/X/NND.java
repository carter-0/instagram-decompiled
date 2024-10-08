package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;
import com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel;

public final class NND extends C228042kh {
    public final UserSession A00;
    public final C69263NiP A01;
    public final boolean A02;
    public final boolean A03;

    public NND(UserSession userSession, C69263NiP niP, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = niP;
        this.A02 = z;
        this.A03 = z2;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        ChannelDiscoveryViewModel channelDirectoryInboxViewModel;
        C69263NiP niP;
        boolean z = this.A02;
        if (!z || !this.A03 || (niP = this.A01) != C69263NiP.ACTIVITY_FEED) {
            channelDirectoryInboxViewModel = new ChannelDirectoryInboxViewModel(this.A00, this.A01);
        } else {
            channelDirectoryInboxViewModel = new NVP(this.A00, niP);
        }
        channelDirectoryInboxViewModel.A02 = this.A03;
        channelDirectoryInboxViewModel.A01 = z;
        return channelDirectoryInboxViewModel;
    }
}
