package X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;

public final class ILC implements C267664bz {
    public final /* synthetic */ AnonymousClass32L A00;

    public ILC(AnonymousClass32L r1) {
        this.A00 = r1;
    }

    public final void A8T(0xI r5) {
        String str;
        0qQ.A0B(r5, 0);
        AnonymousClass32L r1 = this.A00;
        GT0 gt0 = r1.A0E;
        if (gt0 == null) {
            str = "dataStore";
        } else {
            ExploreTopicCluster exploreTopicCluster = gt0.A02;
            if (exploreTopicCluster != null) {
                String str2 = r1.A0V;
                str = "exploreSessionId";
                if (str2 != null) {
                    GXZ.A00(str2);
                    C52549GXa.A00(r5, exploreTopicCluster);
                    r5.A0C("topic_cluster_session_id", str2);
                    r5.A08(0, "topic_nav_order");
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
