package X;

import com.instagram.explore.topiccluster.ExploreTopicCluster;

public final class GXI implements C20908X3z {
    public final /* synthetic */ 0wc A00;
    public final /* synthetic */ AnonymousClass32L A01;

    public final void DIq(VZS vzs) {
        String str;
        String str2;
        0qQ.A0B(vzs, 0);
        C298795u2 r0 = vzs.A01;
        if (r0 != null) {
            0wc r1 = this.A00;
            Long l = null;
            String str3 = r0.A03;
            String A002 = C296875qn.A00(r0.A01());
            AnonymousClass32L r5 = this.A01;
            GT0 gt0 = r5.A0E;
            if (gt0 == null) {
                str2 = "dataStore";
            } else {
                ExploreTopicCluster exploreTopicCluster = gt0.A02;
                if (exploreTopicCluster != null) {
                    str = exploreTopicCluster.A05;
                } else {
                    str = null;
                }
                String str4 = vzs.A02;
                String moduleName = r5.getModuleName();
                Integer num = vzs.A00;
                if (num != null) {
                    l = C51969G9p.A0r(num);
                }
                0qQ.A0B(r1, 0);
                0Aj A0e = AnonymousClass7TE.A0e(r1, "explore_container_header_click");
                DbS.A1O(A0e, moduleName);
                A0e.AAJ("topic_cluster_id", str3);
                A0e.AAJ("topic_cluster_debug_info", str);
                A0e.AAJ("topic_cluster_type", A002);
                A0e.AAJ("topic_cluster_title", str4);
                A0e.A9F("page_num", l);
                A0e.Cgf();
                C52530GWh gWh = r5.A0C;
                if (gWh == null) {
                    str2 = "exploreGridDelegate";
                } else {
                    gWh.A0P(str4);
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public GXI(0wc r1, AnonymousClass32L r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
