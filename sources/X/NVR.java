package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel;

public abstract class NVR extends ChannelDiscoveryViewModel {
    public final 05G A00 = DbS.A10(C69374NkE.A06);
    public final UserSession A01;

    public NVR(UserSession userSession, C69263NiP niP) {
        super(userSession, niP, true);
        this.A01 = userSession;
    }

    public void A0F(C69374NkE nkE) {
        0qQ.A0B(nkE, 0);
        this.A00.Epw(nkE);
        A0D();
    }
}
