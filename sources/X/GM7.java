package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ThumbnailInteractionType;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class GM7 {
    public static long A00;

    public static final 1Ln A00(C295805ow r18, 0wc r19, C296995qz r20, C296905qq r21, C298795u2 r22, ExploreTopicCluster exploreTopicCluster, 1Xj r24, Long l, Long l2, String str, String str2, String str3) {
        String str4;
        String str5;
        C300145wb r11;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        List list;
        ArrayList arrayList;
        ThumbnailInteractionType C70;
        List<String> BRs;
        0wc r15 = r19;
        0qQ.A0B(r15, 0);
        ArrayList arrayList2 = null;
        1Xj r5 = r24;
        if (r24 != null) {
            str4 = r5.getId();
        } else {
            str4 = null;
        }
        ExploreTopicCluster exploreTopicCluster2 = exploreTopicCluster;
        if (exploreTopicCluster != null) {
            str5 = exploreTopicCluster2.A06;
        } else {
            str5 = null;
        }
        if (r24 != null) {
            r11 = r5.BR7().A00();
        } else {
            r11 = C300145wb.UNKNOWN;
        }
        if (exploreTopicCluster != null) {
            str6 = C296875qn.A00(exploreTopicCluster2.A00());
            str7 = exploreTopicCluster2.A0A;
        } else {
            str6 = null;
            str7 = null;
        }
        if (r24 != null) {
            str8 = r5.A0C.getMezqlToken();
        } else {
            str8 = null;
        }
        if (r24 != null) {
            str9 = r5.A0C.getAlgorithm();
        } else {
            str9 = null;
        }
        if (r24 != null) {
            str10 = r5.A0C.getConnectionId();
        } else {
            str10 = null;
        }
        C296995qz r0 = r20;
        String A01 = C320166rs.A01(r0.A01, r0.A00);
        if (r24 != null) {
            str11 = r5.A0C.getLoggingInfoToken();
        } else {
            str11 = null;
        }
        C296905qq r02 = r21;
        String A012 = C320166rs.A01(r02.A01, r02.A03);
        if (r24 != null) {
            list = r5.A3g();
        } else {
            list = null;
        }
        if (!(r24 == null || (BRs = r5.BRs()) == null)) {
            arrayList2 = new ArrayList(0Yv.A1E(BRs, 10));
            for (String A002 : BRs) {
                arrayList2.add(C263944Ny.A00(A002));
            }
        }
        C298795u2 r2 = r22;
        if (r22 != null) {
            str5 = r2.A03;
            str6 = C296875qn.A00(r2.A01());
            str7 = r2.A00().A04;
        }
        1Ln r23 = new 1Ln(r15.A00(r15.A00, "explore_home_impression"), 151);
        r23.A0R("position", A01);
        r23.A0v(str);
        r23.A0m(str4);
        r23.A0M(r18, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        r23.A0R("topic_cluster_id", str5);
        r23.A0R("size", A012);
        r23.A0M(r11, "media_type");
        r23.A0R("topic_cluster_type", str6);
        r23.A0R("topic_cluster_title", str7);
        r23.A0R("inventory_source", str3);
        r23.A0R("mezql_token", str8);
        r23.A0R("algorithm", str9);
        r23.A0R("connection_id", str10);
        r23.A0R("ranking_info_token", str11);
        r23.A0S("product_ids", list);
        String str12 = null;
        if (arrayList2 != null) {
            arrayList = new ArrayList(0Yv.A1E(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C263944Ny) it.next()).A00);
            }
        } else {
            arrayList = null;
        }
        r23.A0S("merchant_ids", arrayList);
        r23.A0Q("playlist_id", l);
        r23.A0Q("page_num", l2);
        r23.A0R("content_source_type", str2);
        if (!(r24 == null || (C70 = r5.A0C.C70()) == null)) {
            int ordinal = C70.ordinal();
            if (ordinal == 1) {
                str12 = "likes";
            } else if (ordinal == 2) {
                str12 = "reshares";
            }
        }
        r23.A0R("social_proof_interaction_type", str12);
        return r23;
    }

    public static final void A01(AnonymousClass0iw r7, UserSession userSession, ExploreTopicCluster exploreTopicCluster, String str, String str2) {
        0qQ.A0B(userSession, 0);
        if (exploreTopicCluster != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = A00;
            if (1 <= j && j < currentTimeMillis) {
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "explore_home_pull_to_refresh");
                if (A0e.isSampled()) {
                    A0e.AAJ("topic_cluster_id", exploreTopicCluster.A06);
                    A0e.AAJ("topic_cluster_title", exploreTopicCluster.A0A);
                    A0e.AAJ("topic_cluster_type", C296875qn.A00(exploreTopicCluster.A03));
                    A0e.AAJ("topic_cluster_debug_info", exploreTopicCluster.A05);
                    C51967G9n.A18(A0e, str);
                    A0e.A9F("time_spent", Long.valueOf(currentTimeMillis - A00));
                    A0e.AAJ("event_outcome", str2);
                    A0e.Cgf();
                }
                A00 = 0;
            }
        }
    }
}
