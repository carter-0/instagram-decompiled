package X;

import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.Set;

public final class GXK implements AnonymousClass2lD {
    public final UserSession A00;
    public final C230372pW A01;
    public final 2el A02;
    public final GWX A03;
    public final GXM A04;
    public final GWT A05;
    public final C52535GWm A06;
    public final GWU A07;
    public final Set A08;
    public final AnonymousClass2pP A09;

    public final void A8h(C233612w1 r2) {
        0qQ.A0B(r2, 0);
        this.A08.add(r2);
    }

    public final void EDk(C233612w1 r2) {
        0qQ.A0B(r2, 0);
        this.A08.remove(r2);
    }

    public GXK(0wc r9, UserSession userSession, 2el r11, C59630JQy jQy, ExploreTopicCluster exploreTopicCluster, C52526GWd gWd, AnonymousClass4DU r15, C231002qi r16, String str, boolean z) {
        GWX gwx;
        this.A02 = r11;
        this.A00 = userSession;
        this.A05 = new GWT(userSession, exploreTopicCluster, gWd, r15, r16, str);
        this.A01 = new C52540GWr(userSession, gWd, r15);
        AnonymousClass2pP A0f = C51972G9s.A0f(userSession);
        this.A09 = A0f;
        this.A06 = new C52535GWm(r9, userSession, r15, A0f);
        GWU gwu = null;
        if (jQy != null) {
            gwx = new GWX(jQy);
        } else {
            gwx = null;
        }
        this.A03 = gwx;
        this.A07 = z ? new GWU(userSession) : gwu;
        this.A08 = DbS.A0y();
        this.A04 = new GXM(userSession, r15);
    }
}
