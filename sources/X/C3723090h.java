package X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;

/* renamed from: X.90h  reason: invalid class name and case insensitive filesystem */
public abstract class C3723090h {
    public static final C3723390k A00(Integer num) {
        return new C3723390k(new C3723190i((ExploreTopicCluster) null, (String) null, 0), num, "", "explore_popular", (String) null, (String) null, 64192, false, true, false, false, false, false);
    }

    public static final String A01(C3723190i r3) {
        String str;
        int i = r3.A01;
        if (i == 0) {
            str = "EXPLORE_ALL";
        } else if (i != 2) {
            ExploreTopicCluster exploreTopicCluster = r3.A00;
            if (exploreTopicCluster != null) {
                str = exploreTopicCluster.A06;
            } else {
                throw new IllegalStateException("Topic Channels must have a Topic Cluster set.");
            }
        } else {
            str = 002.A0R("EXPLORE_ALL_", r3.A02);
        }
        return 002.A0R("explore:topic_cluster_id:", str);
    }
}
