package X;

import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.Set;

public final class GWT implements C250603lj {
    public ExploreTopicCluster A00;
    public Set A01;
    public final 0wc A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C231002qi A05;
    public final String A06;
    public final C52526GWd A07;

    /* JADX WARNING: type inference failed for: r6v9, types: [java.lang.Object, X.5tu] */
    /* JADX WARNING: type inference failed for: r1v64, types: [X.HnB, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r29, X.C252093oY r30) {
        /*
            r28 = this;
            r7 = 0
            r4 = r29
            X.0qQ.A0B(r4, r7)
            r6 = 1
            r8 = r30
            X.0qQ.A0B(r8, r6)
            java.lang.Object r5 = r4.A03
            X.0qQ.A06(r5)
            X.5qt r5 = (X.C296935qt) r5
            java.lang.Integer r2 = r8.CEk(r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r0 = r28
            if (r2 != r1) goto L_0x00c7
            boolean r1 = r5 instanceof X.C296925qs
            if (r1 == 0) goto L_0x0392
            r1 = r5
            X.5qs r1 = (X.C296925qs) r1
            X.5oy r1 = r1.A01
            X.4bN r1 = r1.A00()
            X.1Xj r11 = r1.A02
        L_0x002c:
            java.lang.Object r1 = r4.A04
            X.0qQ.A06(r1)
            X.GWf r1 = (X.C52528GWf) r1
            long r15 = r8.B0M(r4)
            X.0wc r3 = r0.A02
            X.5qz r14 = r1.A00
            com.instagram.common.session.UserSession r10 = r0.A03
            java.lang.String r12 = r0.A06
            X.4DU r1 = r0.A04
            java.lang.String r13 = r1.getModuleName()
            X.0qQ.A0B(r3, r7)
            r1 = 5
            X.0qQ.A0B(r13, r1)
            X.HnB r1 = new X.HnB
            r1.<init>()
            r1.A03 = r11
            r1.A00 = r14
            com.instagram.explore.topiccluster.ExploreTopicCluster r2 = r1.A02
            X.5qq r1 = r1.A01
            X.GWl r9 = new X.GWl
            r9.<init>(r14, r1, r2, r11)
            java.lang.String r2 = "instagram_clips_animated_grid_unit_impression"
            X.0kJ r1 = r3.A00
            X.0Aj r3 = r3.A00(r1, r2)
            java.lang.String r1 = "containermodule"
            r3.AAJ(r1, r13)
            java.lang.String r1 = "tray_session_id"
            r3.AAJ(r1, r12)
            java.lang.String r1 = r9.A05
            if (r1 == 0) goto L_0x038f
            java.lang.Integer r1 = X.00y.A0l(r1)
            if (r1 == 0) goto L_0x038f
            int r1 = r1.intValue()
        L_0x007e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "client_position"
            r3.A8k(r1, r2)
            com.instagram.common.typedurl.SimpleImageUrl r1 = com.instagram.user.model.User.A08
            if (r11 == 0) goto L_0x038c
            com.instagram.user.model.User r1 = r11.A2A(r10)
            if (r1 == 0) goto L_0x038c
            com.instagram.user.model.FollowStatus r1 = r1.B6o()
        L_0x0095:
            java.lang.String r2 = X.1aC.A06(r1)
            java.lang.String r1 = "follow_status"
            r3.AAJ(r1, r2)
            java.lang.String r2 = r9.A04
            if (r2 != 0) goto L_0x00a4
            java.lang.String r2 = ""
        L_0x00a4:
            java.lang.String r1 = "m_pk"
            r3.AAJ(r1, r2)
            java.lang.String r2 = r9.A06
            java.lang.String r1 = "ranking_info_token"
            r3.AAJ(r1, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            java.lang.String r1 = "timespent"
            r3.A9F(r1, r2)
            X.1QJ r1 = X.AnonymousClass1QI.A00
            X.1QM r1 = r1.A02
            java.lang.String r2 = r1.A00
            java.lang.String r1 = "nav_chain"
            r3.AAJ(r1, r2)
            r3.Cgf()
        L_0x00c7:
            java.lang.Integer r2 = r8.CEk(r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x016f
            java.util.Set r2 = r0.A01
            java.lang.String r1 = r5.getKey()
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L_0x016f
            java.lang.Object r4 = r4.A04
            X.0qQ.A06(r4)
            X.GWf r4 = (X.C52528GWf) r4
            boolean r3 = r5 instanceof X.C296985qy
            r8 = 0
            if (r3 == 0) goto L_0x037e
            r1 = r5
            X.5qy r1 = (X.C296985qy) r1
            long r1 = r1.A00
        L_0x00ec:
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
        L_0x00f0:
            X.VZS r1 = r5.A00
            if (r1 == 0) goto L_0x014d
            X.5u2 r2 = r1.A01
            if (r2 == 0) goto L_0x014d
            X.0wc r14 = r0.A02
            java.lang.String r12 = r2.A03
            java.lang.Integer r1 = r2.A01()
            java.lang.String r11 = X.C296875qn.A00(r1)
            com.instagram.model.keyword.Keyword r1 = r2.A00()
            java.lang.String r10 = r1.A04
            com.instagram.explore.topiccluster.ExploreTopicCluster r1 = r0.A00
            if (r1 == 0) goto L_0x0110
            java.lang.String r8 = r1.A05
        L_0x0110:
            X.4DU r1 = r0.A04
            java.lang.String r13 = r1.getModuleName()
            X.0qQ.A0B(r14, r7)
            X.0qQ.A0B(r12, r6)
            r1 = 3
            X.0qQ.A0B(r10, r1)
            r1 = 5
            X.0qQ.A0B(r13, r1)
            java.lang.String r2 = "explore_container_header_impression"
            X.0kJ r1 = r14.A00
            X.0Aj r2 = r14.A00(r1, r2)
            java.lang.String r1 = "container_module"
            r2.AAJ(r1, r13)
            java.lang.String r1 = "topic_cluster_id"
            r2.AAJ(r1, r12)
            java.lang.String r1 = "topic_cluster_debug_info"
            r2.AAJ(r1, r8)
            java.lang.String r1 = "topic_cluster_type"
            r2.AAJ(r1, r11)
            java.lang.String r1 = "topic_cluster_title"
            r2.AAJ(r1, r10)
            java.lang.String r1 = "page_num"
            r2.A9F(r1, r9)
            r2.Cgf()
        L_0x014d:
            X.5ov r2 = r5.A03
            r1 = 0
            if (r2 == 0) goto L_0x037b
            X.5u2 r15 = r2.A06
        L_0x0154:
            if (r3 == 0) goto L_0x0170
            X.GWd r2 = r0.A07
            X.4DU r1 = r0.A04
            java.lang.String r1 = r1.getModuleName()
            X.5qy r5 = (X.C296985qy) r5
            X.1Xj r3 = r5.A01
            r2.A03(r3, r1)
            long r1 = r5.A00
            r5 = r0
            r6 = r15
            r7 = r4
            r8 = r3
            r9 = r1
            r5.A00(r6, r7, r8, r9)
        L_0x016f:
            return
        L_0x0170:
            boolean r2 = r5 instanceof X.HAS
            if (r2 == 0) goto L_0x01c0
            X.HAS r5 = (X.HAS) r5
            java.lang.Integer r2 = r5.A02
            int r2 = r2.intValue()
            if (r2 == r7) goto L_0x03ae
            java.lang.String r8 = r5.A03
            java.lang.String r3 = r5.A05
            java.lang.String r2 = r5.A04
            X.1Xj r7 = r5.A01
            X.5tu r6 = new X.5tu
            r6.<init>()
            r6.A01 = r8
            r6.A03 = r3
            r6.A02 = r2
            r6.A00 = r7
            long r2 = r5.A00
            X.0wc r12 = r0.A02
            X.5qz r13 = r4.A00
            X.5qq r14 = r4.A01
            X.5ow r11 = X.C295805ow.CHANNEL
            com.instagram.explore.topiccluster.ExploreTopicCluster r4 = r0.A00
            java.lang.String r0 = r0.A06
            java.lang.Long r19 = java.lang.Long.valueOf(r2)
            r21 = r1
            r22 = r1
            r20 = r0
            r18 = r1
            r17 = r7
            r16 = r4
            X.1Ln r2 = X.GM7.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = r6.A03
            java.lang.String r0 = "endpoint_type"
        L_0x01b9:
            r2.A0R(r0, r1)
        L_0x01bc:
            r2.Cgf()
            return
        L_0x01c0:
            boolean r2 = r5 instanceof X.HAR
            if (r2 == 0) goto L_0x01ec
            X.HAR r5 = (X.HAR) r5
            X.5tx r6 = r5.A01
            long r2 = r5.A00
            X.0wc r9 = r0.A02
            X.1Xj r6 = r6.A00
            X.5qz r10 = r4.A00
            X.5qq r5 = r4.A01
            X.5ow r8 = X.C295805ow.IGTV_MEDIA
            com.instagram.explore.topiccluster.ExploreTopicCluster r4 = r0.A00
            java.lang.String r0 = r0.A06
            java.lang.Long r16 = java.lang.Long.valueOf(r2)
            r11 = r5
            r12 = r15
            r13 = r4
            r14 = r6
            r15 = r1
            r17 = r0
            r18 = r1
            r19 = r1
            X.1Ln r2 = X.GM7.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x01bc
        L_0x01ec:
            boolean r2 = r5 instanceof X.HAT
            if (r2 == 0) goto L_0x0213
            X.HAT r5 = (X.HAT) r5
            long r2 = r5.A00
            X.0wc r7 = r0.A02
            X.5qz r8 = r4.A00
            X.5qq r5 = r4.A01
            X.5ow r6 = X.C295805ow.SHOPPING
            com.instagram.explore.topiccluster.ExploreTopicCluster r4 = r0.A00
            java.lang.String r0 = r0.A06
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
            r9 = r5
            r10 = r15
            r11 = r4
            r12 = r1
            r13 = r1
            r15 = r0
            r16 = r1
            r17 = r1
            X.1Ln r2 = X.GM7.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01bc
        L_0x0213:
            boolean r2 = r5 instanceof X.C296925qs
            if (r2 == 0) goto L_0x02ad
            X.GWd r3 = r0.A07
            X.4DU r1 = r0.A04
            java.lang.String r2 = r1.getModuleName()
            X.5qs r5 = (X.C296925qs) r5
            X.1Xj r1 = r5.BPf()
            X.5qz r14 = r4.A00
            r3.A03(r1, r2)
            X.5oy r8 = r5.A01
            long r1 = r5.A00
            X.4bN r9 = r8.A00()
            X.5j7 r3 = r8.A01()
            java.lang.String r5 = r3.A00
            X.0wc r11 = r0.A02
            X.1Xj r10 = r9.A02
            X.5qq r4 = r4.A01
            X.5ow r16 = X.C295805ow.CLIPS
            com.instagram.explore.topiccluster.ExploreTopicCluster r3 = r0.A00
            java.lang.String r0 = r0.A06
            X.9JG r12 = r8.A02
            if (r12 == 0) goto L_0x02aa
            java.lang.String r13 = r12.A02
            if (r13 == 0) goto L_0x02aa
            r12 = 10
            java.lang.Long r23 = X.00y.A0n(r12, r13)
        L_0x0252:
            java.lang.Long r24 = java.lang.Long.valueOf(r1)
            X.5oz r2 = r8.A05
            X.5oz r1 = X.C295835oz.NEARBY
            if (r2 != r1) goto L_0x02a7
            java.lang.String r26 = "nearby"
        L_0x025e:
            X.1Xj r1 = r9.A02
            if (r1 == 0) goto L_0x02a4
            X.1Xy r1 = r1.A0C
            java.lang.String r27 = r1.BIl()
        L_0x0268:
            r20 = r15
            r21 = r3
            r22 = r10
            r25 = r0
            r19 = r4
            r18 = r14
            r17 = r11
            X.1Ln r2 = X.GM7.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r0 = "subtype"
            r2.A0R(r0, r5)
            X.5oz r0 = r8.A05
            int r1 = r0.ordinal()
            if (r1 == r7) goto L_0x02a1
            if (r1 == r6) goto L_0x029e
            r0 = 2
            if (r1 == r0) goto L_0x029b
            r0 = 3
            if (r1 == r0) goto L_0x0298
            r0 = 4
            if (r1 != r0) goto L_0x03c6
            java.lang.String r1 = "feed_creation_inspiration"
        L_0x0294:
            java.lang.String r0 = "action_source"
            goto L_0x01b9
        L_0x0298:
            java.lang.String r1 = "feed_nearby"
            goto L_0x0294
        L_0x029b:
            java.lang.String r1 = "feed_templates"
            goto L_0x0294
        L_0x029e:
            java.lang.String r1 = "feed_trending"
            goto L_0x0294
        L_0x02a1:
            java.lang.String r1 = "feed_suggested"
            goto L_0x0294
        L_0x02a4:
            r27 = 0
            goto L_0x0268
        L_0x02a7:
            r26 = 0
            goto L_0x025e
        L_0x02aa:
            r23 = 0
            goto L_0x0252
        L_0x02ad:
            boolean r2 = r5 instanceof X.C297035r4
            if (r2 == 0) goto L_0x02f7
            X.5r4 r5 = (X.C297035r4) r5
            X.5u1 r7 = r5.A01
            long r2 = r5.A00
            java.lang.String r6 = r7.A07
            X.0qQ.A07(r6)
            com.instagram.common.session.UserSession r5 = r0.A03
            X.90f r5 = X.C3722790e.A00(r5)
            java.util.Map r5 = r5.A00
            java.lang.Object r6 = r5.get(r6)
            X.4UE r6 = (X.AnonymousClass4UE) r6
            if (r6 == 0) goto L_0x02d1
            X.2qi r5 = r0.A05
            r5.DbK(r6)
        L_0x02d1:
            X.0wc r9 = r0.A02
            X.BIR r5 = r7.A00
            X.1Xj r14 = X.C44742CkB.A00(r5)
            X.5qz r10 = r4.A00
            X.5qq r5 = r4.A01
            X.5ow r8 = X.C295805ow.GUIDES
            com.instagram.explore.topiccluster.ExploreTopicCluster r4 = r0.A00
            java.lang.String r0 = r0.A06
            java.lang.Long r16 = java.lang.Long.valueOf(r2)
            r11 = r5
            r12 = r15
            r13 = r4
            r15 = r1
            r17 = r0
            r18 = r1
            r19 = r1
            X.1Ln r2 = X.GM7.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x01bc
        L_0x02f7:
            boolean r2 = r5 instanceof X.HAV
            if (r2 == 0) goto L_0x016f
            X.HAV r5 = (X.HAV) r5
            X.CsU r2 = r5.A01
            if (r2 == 0) goto L_0x0303
            X.Ctl r1 = r2.A00
        L_0x0303:
            java.lang.String r3 = "Required value was null."
            if (r1 == 0) goto L_0x03d2
            long r8 = r5.A00
            X.1Xj r2 = r5.A02
            java.lang.String r2 = r2.A2n()
            if (r2 == 0) goto L_0x03cc
            X.0wc r4 = r0.A02
            java.lang.String r10 = r1.A00
            java.lang.String r6 = "interest_keyword"
            java.lang.String r5 = r1.A01
            com.instagram.explore.topiccluster.ExploreTopicCluster r1 = r0.A00
            if (r1 == 0) goto L_0x0379
            java.lang.String r3 = r1.A05
        L_0x031f:
            X.4DU r0 = r0.A04
            java.lang.String r11 = r0.getModuleName()
            long r12 = java.lang.Long.parseLong(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            X.0qQ.A0B(r4, r7)
            r0 = 5
            X.0qQ.A0B(r11, r0)
            java.lang.String r1 = "explore_topic_tile_impression"
            X.0kJ r0 = r4.A00
            X.0Aj r4 = r4.A00(r0, r1)
            java.lang.String r0 = "container_module"
            r4.AAJ(r0, r11)
            java.lang.String r0 = "topic_cluster_id"
            r4.AAJ(r0, r10)
            java.lang.String r0 = "topic_cluster_type"
            r4.AAJ(r0, r6)
            java.lang.String r0 = "topic_cluster_title"
            r4.AAJ(r0, r5)
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "media_type"
            r4.A9F(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            java.lang.String r0 = "media_igid"
            r4.A9F(r0, r1)
            java.lang.String r1 = ""
            java.lang.String r0 = "nav_chain"
            r4.AAJ(r0, r1)
            java.lang.String r0 = "topic_cluster_debug_info"
            r4.AAJ(r0, r3)
            java.lang.String r0 = "page_num"
            r4.A9F(r0, r2)
            r4.Cgf()
            return
        L_0x0379:
            r3 = 0
            goto L_0x031f
        L_0x037b:
            r15 = r1
            goto L_0x0154
        L_0x037e:
            boolean r1 = r5 instanceof X.HAS
            if (r1 == 0) goto L_0x0389
            r1 = r5
            X.HAS r1 = (X.HAS) r1
            long r1 = r1.A00
            goto L_0x00ec
        L_0x0389:
            r9 = r8
            goto L_0x00f0
        L_0x038c:
            r1 = 0
            goto L_0x0095
        L_0x038f:
            r1 = -1
            goto L_0x007e
        L_0x0392:
            boolean r1 = r5 instanceof X.C296985qy
            if (r1 == 0) goto L_0x039d
            r1 = r5
            X.5qy r1 = (X.C296985qy) r1
            X.1Xj r11 = r1.A01
            goto L_0x002c
        L_0x039d:
            boolean r1 = r5 instanceof X.HAS
            if (r1 == 0) goto L_0x00c7
            r3 = r5
            X.HAS r3 = (X.HAS) r3
            java.lang.Integer r2 = r3.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x00c7
            X.1Xj r11 = r3.A01
            goto L_0x002c
        L_0x03ae:
            X.1Xj r3 = r5.A01
            long r1 = r5.A00
            r5 = r0
            r6 = r15
            r7 = r4
            r8 = r3
            r9 = r1
            r5.A00(r6, r7, r8, r9)
            X.GWd r1 = r0.A07
            X.4DU r0 = r0.A04
            java.lang.String r0 = r0.getModuleName()
            r1.A03(r3, r0)
            return
        L_0x03c6:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x03cc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x03d2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GWT.ATF(X.30Y, X.3oY):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C298795u2 r18, X.C52528GWf r19, X.1Xj r20, long r21) {
        /*
            r17 = this;
            r4 = r19
            X.5qq r8 = r4.A01
            int r0 = r8.A04
            r2 = 2
            if (r0 != r2) goto L_0x004a
            int r0 = r8.A02
            r1 = 1
            if (r0 != r2) goto L_0x004a
            X.5ow r5 = X.C295805ow.CHANNEL
        L_0x0010:
            r3 = r17
            X.0wc r6 = r3.A02
            X.5qz r7 = r4.A00
            com.instagram.explore.topiccluster.ExploreTopicCluster r10 = r3.A00
            java.lang.String r14 = r3.A06
            r12 = 0
            java.lang.Long r13 = java.lang.Long.valueOf(r21)
            r11 = r20
            X.1Xy r0 = r11.A0C
            java.lang.String r16 = r0.BIl()
            r9 = r18
            r15 = r12
            X.1Ln r2 = X.GM7.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x003b
            r0 = 3474(0xd92, float:4.868E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "endpoint_type"
            r2.A0R(r0, r1)
        L_0x003b:
            com.instagram.explore.topiccluster.ExploreTopicCluster r0 = r3.A00
            if (r0 == 0) goto L_0x0046
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "topic_cluster_debug_info"
            r2.A0R(r0, r1)
        L_0x0046:
            r2.Cgf()
            return
        L_0x004a:
            r1 = 0
            X.5ow r5 = X.C295805ow.MEDIA
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GWT.A00(X.5u2, X.GWf, X.1Xj, long):void");
    }

    public GWT(UserSession userSession, ExploreTopicCluster exploreTopicCluster, C52526GWd gWd, AnonymousClass4DU r6, C231002qi r7, String str) {
        String str2;
        this.A03 = userSession;
        this.A04 = r6;
        this.A06 = str;
        this.A00 = exploreTopicCluster;
        this.A05 = r7;
        this.A07 = gWd;
        this.A02 = AnonymousClass0kN.A01(r6, userSession);
        GXL gxl = (GXL) userSession.A01(GXL.class, C52559GXk.A00);
        ExploreTopicCluster exploreTopicCluster2 = this.A00;
        if (exploreTopicCluster2 != null) {
            str2 = exploreTopicCluster2.A06;
        } else {
            str2 = "";
        }
        this.A01 = gxl.A00(str, str2);
    }
}
