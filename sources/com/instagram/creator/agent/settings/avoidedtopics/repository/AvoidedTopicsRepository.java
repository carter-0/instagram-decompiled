package com.instagram.creator.agent.settings.avoidedtopics.repository;

import X.0qQ;
import X.1vn;
import X.C252733pa;
import X.C262224Cq;

public final class AvoidedTopicsRepository extends C252733pa {
    public final 1vn A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvoidedTopicsRepository(1vn r2, String str, C262224Cq r4) {
        super("avoided_topics", r4);
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r20) {
        /*
            r19 = this;
            r4 = 2
            r6 = r20
            boolean r0 = X.C66129MDh.A01(r4, r6)
            r5 = r19
            if (r0 == 0) goto L_0x00eb
            r3 = r6
            X.MDh r3 = (X.C66129MDh) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00eb
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0019:
            java.lang.Object r6 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x00ab
            if (r0 != r1) goto L_0x0107
            X.0eS.A00(r6)
        L_0x0027:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00f7
            X.3lr r5 = X.C41846B3n.A0R(r6)
            if (r5 == 0) goto L_0x0100
            java.lang.Class<X.BfY> r3 = X.C42614BfY.class
            r8 = 0
            java.lang.String r2 = "xig_ig_creator_ai_topic_avoidance_topics_query(request:$request)"
            r0 = -239142961(0xfffffffff1bef7cf, float:-1.8912555E30)
            X.3lr r5 = r5.getOptionalTreeField(r8, r2, r3, r0)
            if (r5 == 0) goto L_0x0100
            java.lang.Class<X.BfX> r3 = X.C42613BfX.class
            java.lang.String r2 = "topics"
            r0 = 1154666896(0x44d2d190, float:1686.5488)
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedTreeListField(r8, r2, r3, r0)
            if (r0 == 0) goto L_0x0100
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0056:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00f2
            X.3lr r3 = X.C41845B3m.A0V(r9)
            java.lang.String r0 = "topic"
            java.lang.String r6 = r3.getOptionalStringField(r1, r0)
            java.lang.String r5 = ""
            if (r6 != 0) goto L_0x006b
            r6 = r5
        L_0x006b:
            java.lang.String r0 = "id"
            java.lang.String r0 = r3.getOptionalStringField(r8, r0)
            if (r0 == 0) goto L_0x0074
            r5 = r0
        L_0x0074:
            X.HNE r2 = X.HNE.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "strategy"
            java.lang.Enum r2 = r3.getOptionalEnumField(r4, r0, r2)
            X.HNE r2 = (X.HNE) r2
            r0 = -1
            if (r2 == 0) goto L_0x0098
            int r2 = r2.ordinal()
            if (r2 == r0) goto L_0x0098
            if (r2 == r1) goto L_0x0095
            r0 = 3
            if (r2 == r0) goto L_0x009f
            if (r2 == r4) goto L_0x0098
            if (r2 == r8) goto L_0x0098
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0095:
            java.lang.String r3 = "NO_RESPONSE"
            goto L_0x00a1
        L_0x0098:
            r0 = 2415(0x96f, float:3.384E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            goto L_0x00a1
        L_0x009f:
            java.lang.String r3 = "SHUTDOWN"
        L_0x00a1:
            r2 = 6
            X.Jvb r0 = new X.Jvb
            r0.<init>(r6, r5, r3, r2)
            r7.add(r0)
            goto L_0x0056
        L_0x00ab:
            X.0eS.A00(r6)
            X.1vn r0 = r5.A00
            r14 = 0
            X.2IS r10 = X.C41845B3m.A04()
            X.2IS r9 = X.C41845B3m.A04()
            X.0K0 r8 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r7 = r5.A01
            java.lang.String r6 = "creator_id"
            X.0Df r7 = X.C41845B3m.A03(r8, r7, r6)
            java.lang.String r6 = "request"
            X.1vR r8 = X.C41847B3o.A04(r7, r10, r6)
            java.util.Map r10 = r10.getParamsCopy()
            java.util.Map r11 = r9.getParamsCopy()
            java.lang.Class<X.BfZ> r12 = X.C42615BfZ.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "IGCreatorAITopicAvoidanceItemQuery"
            r13 = 0
            java.lang.String r17 = "xig_ig_creator_ai_topic_avoidance_topics_query"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r6 = X.C41846B3n.A0h(r7, r0, r5, r3)
            if (r6 != r2) goto L_0x0027
            return r2
        L_0x00eb:
            X.MDh r3 = new X.MDh
            r3.<init>(r5, r6, r4)
            goto L_0x0019
        L_0x00f2:
            X.3Ih r2 = X.C41845B3m.A0d(r7)
            return r2
        L_0x00f7:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0100
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0100:
            X.0gF r0 = X.C60340gF.A00
            X.5sO r2 = X.C41845B3m.A0c(r0)
            return r2
        L_0x0107:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository.A02(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C61037Jvb r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, X.AnonymousClass4D7 r22) {
        /*
            r17 = this;
            r3 = 17
            r6 = r22
            boolean r0 = X.C66143MDv.A02(r3, r6)
            r5 = r17
            if (r0 == 0) goto L_0x00a7
            r4 = r6
            X.MDv r4 = (X.C66143MDv) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a7
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r11 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r11) goto L_0x00bd
            X.0eS.A00(r1)
        L_0x0028:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ad
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r3 = X.C41845B3m.A0d(r0)
            return r3
        L_0x0033:
            X.0eS.A00(r1)
            X.0K0 r2 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "creator_id"
            X.0Df r6 = X.C41845B3m.A03(r2, r1, r0)
            java.lang.String r0 = "topic_id"
            r1 = r21
            X.0Df.A00(r6, r1, r0)
            java.lang.String r0 = "strategy"
            r1 = r19
            X.0Df.A00(r6, r1, r0)
            java.lang.String r0 = "topic"
            r1 = r20
            X.0Df.A00(r6, r1, r0)
            r7 = r18
            if (r18 == 0) goto L_0x0075
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "corrected_bot_message_igid"
            X.0Df r2 = X.C41845B3m.A03(r2, r1, r0)
            java.lang.String r1 = r7.A01
            java.lang.String r0 = "otid"
            X.0Df.A00(r2, r1, r0)
            java.lang.String r1 = r7.A02
            java.lang.String r0 = "thread_igid"
            X.0Df.A00(r2, r1, r0)
            java.lang.String r0 = "thread_feedback_message_data"
            r6.A0E(r2, r0)
        L_0x0075:
            X.1vn r2 = r5.A00
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            java.lang.String r0 = "request"
            X.1vR r6 = X.C41847B3o.A04(r6, r5, r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r1.getParamsCopy()
            java.lang.Class<X.BfT> r10 = X.C42609BfT.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "IGCreatorAITopicAvoidanceItemAddOrEditMutation"
            r13 = 0
            java.lang.String r15 = "xig_ig_creator_ai_topic_avoidance_item_add_or_edit_mutation"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.A00 = r11
            java.lang.Object r1 = r2.A04(r5, r4)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x00a7:
            X.MDv r4 = X.C41847B3o.A1H(r5, r6, r3)
            goto L_0x001a
        L_0x00ad:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b8
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = X.C41845B3m.A0c(r0)
            return r3
        L_0x00b8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository.A00(X.Jvb, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r19, java.lang.String r20, java.util.List r21, X.AnonymousClass4D7 r22) {
        /*
            r18 = this;
            r2 = r19
            r4 = 3
            r7 = r22
            boolean r0 = X.C66129MDh.A01(r4, r7)
            r6 = r18
            if (r0 == 0) goto L_0x00d9
            r5 = r7
            X.MDh r5 = (X.C66129MDh) r5
            int r3 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00d9
            int r3 = r3 - r1
            r5.A00 = r3
        L_0x001b:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0082
            if (r0 != r3) goto L_0x00fa
            java.lang.Object r2 = r5.A01
            java.lang.String r2 = (java.lang.String) r2
            X.0eS.A00(r1)
        L_0x002d:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ea
            X.3lr r5 = X.C41846B3n.A0R(r1)
            if (r5 == 0) goto L_0x00f3
            java.lang.Class<X.BfQ> r4 = X.C42606BfQ.class
            java.lang.String r1 = "xig_ig_creator_ai_topic_avoidance_example_query(request:$request)"
            r0 = -1307143810(0xffffffffb216917e, float:-8.76423E-9)
            X.3lr r5 = r5.A03(r4, r1, r0)
            if (r5 == 0) goto L_0x00f3
            java.lang.Class<X.BfP> r4 = X.C42605BfP.class
            java.lang.String r1 = "examples"
            r0 = 1142726030(0x441c9d8e, float:626.4618)
            com.google.common.collect.ImmutableList r0 = X.C41845B3m.A0X(r5, r4, r1, r3, r0)
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x0059:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00e0
            X.3lr r1 = X.C41845B3m.A0V(r6)
            java.lang.String r0 = "prompt"
            java.lang.String r5 = r1.A07(r0)
            java.lang.String r4 = ""
            if (r5 != 0) goto L_0x006e
            r5 = r4
        L_0x006e:
            java.lang.String r0 = "response"
            java.lang.String r0 = r1.getOptionalStringField(r3, r0)
            if (r0 == 0) goto L_0x0077
            r4 = r0
        L_0x0077:
            r1 = 26
            X.N49 r0 = new X.N49
            r0.<init>(r5, r4, r1)
            r7.add(r0)
            goto L_0x0059
        L_0x0082:
            X.0eS.A00(r1)
            X.1vn r1 = r6.A00
            r13 = 0
            X.2IS r9 = X.C41845B3m.A04()
            X.2IS r8 = X.C41845B3m.A04()
            X.2IV r7 = new X.2IV
            r7.<init>()
            java.lang.String r6 = r6.A01
            java.lang.String r0 = "creator_id"
            r7.A09(r6, r0)
            java.lang.String r0 = "strategy"
            r7.A09(r2, r0)
            java.lang.String r0 = "topic"
            r6 = r20
            r7.A09(r6, r0)
            java.lang.String r0 = "message_prompts"
            r6 = r21
            r7.A05(r0, r6)
            java.lang.String r0 = "request"
            r9.A00(r7, r0)
            X.1vR r7 = X.C41845B3m.A05()
            java.util.Map r9 = r9.getParamsCopy()
            java.util.Map r10 = r8.getParamsCopy()
            java.lang.Class<X.BfR> r11 = X.C42607BfR.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGCreatorAIAvoidedTopicExamples"
            r12 = 0
            java.lang.String r16 = "xig_ig_creator_ai_topic_avoidance_example_query"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r1 = X.C41846B3n.A0h(r6, r1, r2, r5)
            if (r1 != r4) goto L_0x002d
            return r4
        L_0x00d9:
            X.MDh r5 = new X.MDh
            r5.<init>(r6, r7, r4)
            goto L_0x001b
        L_0x00e0:
            X.JV7 r0 = new X.JV7
            r0.<init>((java.lang.String) r2, (java.util.List) r7)
            X.3Ih r4 = X.C41845B3m.A0d(r0)
            return r4
        L_0x00ea:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00f3
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f3:
            X.0gF r0 = X.C60340gF.A00
            X.5sO r4 = X.C41845B3m.A0c(r0)
            return r4
        L_0x00fa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.avoidedtopics.repository.AvoidedTopicsRepository.A01(java.lang.String, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }
}
