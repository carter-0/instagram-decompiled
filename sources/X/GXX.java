package X;

import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.user.model.User;
import java.util.HashSet;

public final class GXX extends AnonymousClass369 {
    public final GX7 A00;
    public final C14391TvK A01;

    public final void FN9(AnonymousClass345 r2, int i) {
        0qQ.A0B(r2, 0);
    }

    public final Class C9I() {
        return ExploreTopicCluster.class;
    }

    public final /* bridge */ /* synthetic */ void Cs1(Object obj, int i) {
        ExploreTopicCluster exploreTopicCluster = (ExploreTopicCluster) obj;
        0qQ.A0B(exploreTopicCluster, 0);
        GX7 gx7 = this.A00;
        HashSet hashSet = gx7.A05;
        if (!hashSet.contains(exploreTopicCluster.A06)) {
            hashSet.add(exploreTopicCluster.A06);
            UserSession userSession = gx7.A02;
            AnonymousClass4DU r8 = gx7.A03;
            String str = gx7.A04;
            C254523sc A0n = C51965G9l.A0n(r8, "explore_topic_tray_impression");
            A0n.A6t = str;
            0jB A0k = C51965G9l.A0k();
            A0k.A04(C271774jZ.A6W, DbS.A0j(i));
            A0n.A0E(A0k);
            A0n.A7G = exploreTopicCluster.A06;
            A0n.A7H = exploreTopicCluster.A0A;
            A0n.A7I = C296875qn.A00(exploreTopicCluster.A00());
            0jB A0k2 = C51965G9l.A0k();
            A0k2.A04(C271774jZ.A9C, exploreTopicCluster.A05);
            A0n.A0E(A0k2);
            1Xj r6 = exploreTopicCluster.A02;
            String A002 = AnonymousClass000.A00(2936);
            if (r6 != null) {
                0jB A0k3 = C51965G9l.A0k();
                A0k3.A0A("cover_media_id", r6.getId());
                A0n.A0E(A0k3);
                User A2A = r6.A2A(userSession);
                if (A2A != null) {
                    0jB A0k4 = C51965G9l.A0k();
                    A0k4.A0A(A002, A2A.getId());
                    A0n.A0E(A0k4);
                }
            }
            if (!C271764jY.A00(userSession, A0n, r8, AnonymousClass05K.A01)) {
                0xI A003 = 0xI.A00(r8, "explore_topic_tray_impression");
                A003.A07(C271774jZ.A7x, str);
                A003.A08(Integer.valueOf(i), "position");
                C52549GXa.A00(A003, exploreTopicCluster);
                if (r6 != null) {
                    A003.A0C("cover_media_id", r6.getId());
                    User A2A2 = r6.A2A(userSession);
                    if (A2A2 != null) {
                        A003.A0C(A002, A2A2.getId());
                    }
                }
                DbU.A1R(A003, userSession);
            }
        }
    }

    public GXX(C14391TvK tvK, GX7 gx7) {
        this.A01 = tvK;
        this.A00 = gx7;
    }
}
