package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.HashSet;

public final class GX7 {
    public ExploreTopicCluster A00;
    public final int A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final String A04;
    public final HashSet A05 = AnonymousClass7TE.A1F();

    public GX7(UserSession userSession, AnonymousClass4DU r3, String str, int i) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = r3;
        this.A01 = i;
        this.A04 = str;
    }

    public static final void A00(GX7 gx7) {
        ExploreTopicCluster exploreTopicCluster = gx7.A00;
        if (exploreTopicCluster != null) {
            UserSession userSession = gx7.A02;
            2cc A002 = C71342cb.A00(userSession);
            AnonymousClass4DU r3 = gx7.A03;
            if (Systrace.A0E(1)) {
                0fS.A01("NavigationTracker.reportStartNavigation", -1148048430);
            }
            try {
                C51965G9l.A13();
                A002.A00 = AwakeTimeSinceBootClock.INSTANCE.now();
                0xI A003 = 0xI.A00(r3, "navigation");
                A003.A0C("click_point", "explore_topic_load");
                A003.A08(0, "nav_depth");
                A002.A03 = A003;
                A002.A01 = new C3018560i(r3, "explore_topic_load", A002.A00);
                0xI r2 = A002.A03;
                if (r2 != null) {
                    String str = gx7.A04;
                    GXZ.A00(str);
                    C52549GXa.A00(r2, exploreTopicCluster);
                    r2.A0C("topic_cluster_session_id", str);
                    r2.A08(0, "topic_nav_order");
                }
                if (A002.A0G) {
                    A002.A0I.A00(r3, "explore_topic_load", 0);
                }
                1Jk.A08.A0E(r3, A002.A0J.A02.A00, "explore_topic_load");
                C71342cb.A00(userSession).A0E("intentional_double_logging", r3);
            } finally {
                if (Systrace.A0E(1)) {
                    0fS.A00(-168180057);
                }
            }
        }
    }
}
