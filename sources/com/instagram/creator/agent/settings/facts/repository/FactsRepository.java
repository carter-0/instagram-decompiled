package com.instagram.creator.agent.settings.facts.repository;

import X.0qQ;
import X.1vn;
import X.BBV;
import X.C252733pa;
import X.C262224Cq;
import com.instagram.repository.common.FeedPagedData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FactsRepository extends C252733pa {
    public final FeedPagedData A00;
    public final 1vn A01;
    public final String A02;
    public final String A03;

    public final class FactPagedData extends FeedPagedData {
        public final 1vn A00;
        public final String A01;
        public final String A02;

        public FactPagedData(1vn r5, String str, String str2) {
            super(new BBV((String) null, 1, 15, (DefaultConstructorMarker) null));
            this.A00 = r5;
            this.A02 = str;
            this.A01 = str2;
        }

        /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
        /* JADX WARNING: type inference failed for: r4v8 */
        /* JADX WARNING: type inference failed for: r4v9 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0148  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
        /* renamed from: A03 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object A02(X.BBV r21, X.AnonymousClass4D7 r22) {
            /*
                r20 = this;
                r3 = r21
                r6 = 4
                r7 = r22
                boolean r0 = X.C66145MDx.A02(r6, r7)
                r5 = r20
                if (r0 == 0) goto L_0x0127
                r4 = r7
                X.MDx r4 = (X.C66145MDx) r4
                int r2 = r4.A00
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L_0x0127
                int r2 = r2 - r1
                r4.A00 = r2
            L_0x001b:
                java.lang.Object r6 = r4.A03
                X.1Hj r1 = X.1Hj.A02
                int r0 = r4.A00
                r2 = 1
                r15 = 0
                if (r0 == 0) goto L_0x00c3
                if (r0 != r2) goto L_0x015e
                java.lang.Object r3 = r4.A02
                java.lang.Object r7 = r4.A01
                com.instagram.creator.agent.settings.facts.repository.FactsRepository$FactPagedData r7 = (com.instagram.creator.agent.settings.facts.repository.FactsRepository.FactPagedData) r7
                X.0eS.A00(r6)
            L_0x0030:
                X.3Ii r6 = (X.C239803Ii) r6
                boolean r0 = r6 instanceof X.C239793Ih
                if (r0 == 0) goto L_0x0148
                X.3lr r11 = X.C41846B3n.A0R(r6)
                if (r11 == 0) goto L_0x013b
                java.lang.Class<X.Bfq> r10 = X.C42632Bfq.class
                java.lang.String r9 = "xig_ig_creator_ai_fact_query(after:$cursor,first:20,request:$request)"
                r6 = -1192134489(0xffffffffb8f178a7, float:-1.1514249E-4)
                X.3lr r5 = r11.A03(r10, r9, r6)
                if (r5 == 0) goto L_0x0065
                java.lang.Class<X.Bfp> r4 = X.C42631Bfp.class
                java.lang.String r1 = "page_info"
                r0 = 1774852659(0x69ca1a33, float:3.0540842E25)
                X.3lr r1 = r5.A04(r4, r1, r0)
                if (r1 == 0) goto L_0x0065
                java.lang.String r0 = "end_cursor"
                java.lang.String r1 = r1.getOptionalStringField(r2, r0)
                if (r1 == 0) goto L_0x0065
                r0 = 15
                X.BBV r15 = new X.BBV
                r15.<init>(r1, r0)
            L_0x0065:
                X.3lr r5 = r11.A03(r10, r9, r6)
                if (r5 == 0) goto L_0x013b
                java.lang.Class<X.Bfo> r4 = X.C42630Bfo.class
                java.lang.String r1 = "nodes"
                r0 = 1888407353(0x708ecf39, float:3.535791E29)
                com.google.common.collect.ImmutableList r4 = r5.getRequiredCompactedTreeListField(r2, r1, r4, r0)
                if (r4 == 0) goto L_0x013b
                r8 = 0
                X.3lr r1 = r11.getOptionalTreeField(r8, r9, r10, r6)
                if (r1 == 0) goto L_0x00c1
                java.lang.String r0 = "count"
                int r6 = r1.getCoercedIntField(r8, r0)
            L_0x0085:
                java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
                java.util.Iterator r10 = r4.iterator()
            L_0x008d:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x012e
                X.3lr r9 = X.C41845B3m.A0V(r10)
                java.lang.String r0 = "id"
                java.lang.String r4 = r9.getOptionalStringField(r8, r0)
                if (r4 == 0) goto L_0x008d
                java.lang.String r0 = "question"
                java.lang.String r3 = X.C41846B3n.A0i(r9, r0, r2)
                r1 = 2
                java.lang.String r0 = "answer"
                com.google.common.collect.ImmutableList r0 = r9.getRequiredCompactedStringListField(r1, r0)
                X.0qQ.A07(r0)
                java.lang.Object r1 = X.00k.A0J(r0)
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L_0x008d
                java.lang.String r0 = r7.A02
                X.GlE r0 = X.HZH.A00(r0, r4, r3, r1)
                r5.add(r0)
                goto L_0x008d
            L_0x00c1:
                r6 = 0
                goto L_0x0085
            L_0x00c3:
                X.0eS.A00(r6)
                X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
                java.lang.String r6 = r5.A02
                java.lang.String r0 = "content_type"
                X.0Df r9 = X.C41845B3m.A03(r7, r6, r0)
                java.lang.String r6 = r5.A01
                java.lang.String r0 = "creator_id"
                X.0Df.A00(r9, r6, r0)
                X.2IS r8 = X.C41845B3m.A04()
                X.2IS r7 = X.C41845B3m.A04()
                java.lang.String r6 = "request"
                X.2IV r0 = r8.A00
                X.0Df r0 = r0.A02()
                r0.A0E(r9, r6)
                if (r21 == 0) goto L_0x0122
                java.lang.String r6 = r3.A00
            L_0x00ee:
                java.lang.String r0 = "cursor"
                r8.A04(r0, r6)
                X.1vR r9 = X.C41845B3m.A05()
                java.util.Map r11 = r8.getParamsCopy()
                java.util.Map r12 = r7.getParamsCopy()
                java.lang.Class<X.Bfr> r13 = X.C42633Bfr.class
                java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
                java.lang.String r10 = "IGCreatorAgentFacts"
                r14 = 0
                java.lang.String r18 = "xig_ig_creator_ai_fact_query"
                com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
                r16 = r14
                r17 = r15
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                X.1vn r0 = r5.A00
                r4.A01 = r5
                r4.A02 = r3
                r4.A00 = r2
                java.lang.Object r6 = r0.A04(r8, r4)
                if (r6 != r1) goto L_0x0124
                return r1
            L_0x0122:
                r6 = r15
                goto L_0x00ee
            L_0x0124:
                r7 = r5
                goto L_0x0030
            L_0x0127:
                X.MDx r4 = new X.MDx
                r4.<init>(r5, r7, r6)
                goto L_0x001b
            L_0x012e:
                r1 = 14
                X.Iwi r0 = new X.Iwi
                r0.<init>(r6, r1, r5)
                X.JZo r1 = new X.JZo
                r1.<init>(r0, r15)
                return r1
            L_0x013b:
                java.lang.Throwable r2 = new java.lang.Throwable
                r2.<init>()
                X.DNY r1 = X.DNY.A00
                X.JzO r0 = new X.JzO
                r0.<init>(r3, r2, r1)
                return r0
            L_0x0148:
                boolean r0 = r6 instanceof X.C297815sO
                if (r0 == 0) goto L_0x0159
                java.lang.Throwable r2 = new java.lang.Throwable
                r2.<init>()
                X.DNX r0 = X.DNX.A00
                X.JzO r1 = new X.JzO
                r1.<init>(r3, r2, r0)
                return r1
            L_0x0159:
                X.Wub r0 = X.AnonymousClass7TE.A1K()
                throw r0
            L_0x015e:
                java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.repository.FactsRepository.FactPagedData.A02(X.BBV, X.4D7):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FactsRepository(1vn r2, String str, String str2, C262224Cq r5) {
        super("facts_repository", r5);
        0qQ.A0B(r2, 2);
        this.A03 = str;
        this.A01 = r2;
        this.A02 = str2;
        this.A00 = new FactPagedData(r2, str, str2);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C53266GlE r21, X.AnonymousClass4D7 r22) {
        /*
            r20 = this;
            r1 = r21
            r5 = 5
            r6 = r22
            boolean r0 = X.C66145MDx.A02(r5, r6)
            r9 = r20
            if (r0 == 0) goto L_0x0034
            r4 = r6
            X.MDx r4 = (X.C66145MDx) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0034
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x001b:
            java.lang.Object r8 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 4
            r5 = 3
            r2 = 2
            r14 = 1
            if (r0 == 0) goto L_0x003f
            if (r0 == r14) goto L_0x0056
            if (r0 == r2) goto L_0x00a4
            if (r0 == r5) goto L_0x003a
            if (r0 == r6) goto L_0x003a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0034:
            X.MDx r4 = new X.MDx
            r4.<init>(r9, r6, r5)
            goto L_0x001b
        L_0x003a:
            X.0eS.A00(r8)
            goto L_0x00fd
        L_0x003f:
            X.0eS.A00(r8)
            com.instagram.repository.common.FeedPagedData r8 = r9.A00
            r7 = 33
            X.MP9 r0 = new X.MP9
            r0.<init>(r1, r7)
            r4.A01 = r9
            r4.A02 = r1
            r4.A00 = r14
            com.instagram.repository.common.FeedPagedData.A01(r8, r0)
            r0 = r9
            goto L_0x0061
        L_0x0056:
            java.lang.Object r1 = r4.A02
            X.GlE r1 = (X.C53266GlE) r1
            java.lang.Object r0 = r4.A01
            com.instagram.creator.agent.settings.facts.repository.FactsRepository r0 = (com.instagram.creator.agent.settings.facts.repository.FactsRepository) r0
            X.0eS.A00(r8)
        L_0x0061:
            X.1vn r7 = r0.A01
            r15 = 0
            X.2IS r10 = X.C41845B3m.A04()
            X.2IS r12 = X.C41845B3m.A04()
            X.0K0 r11 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r9 = r1.A00
            java.lang.String r8 = "fact_id"
            X.0Df r9 = X.C41845B3m.A03(r11, r9, r8)
            java.lang.String r8 = "request"
            X.1vR r9 = X.C41847B3o.A04(r9, r10, r8)
            java.util.Map r11 = r10.getParamsCopy()
            java.util.Map r12 = r12.getParamsCopy()
            java.lang.Class<X.Bfj> r13 = X.C42625Bfj.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "IGCreatorAIDeleteFactMutation"
            r16 = 0
            java.lang.String r18 = "xig_creator_ai_free_form_fact_delete_mutation"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.A01 = r0
            r4.A02 = r1
            r4.A00 = r2
            java.lang.Object r8 = r7.A04(r8, r4)
            if (r8 != r3) goto L_0x00ad
            return r3
        L_0x00a4:
            java.lang.Object r1 = r4.A02
            java.lang.Object r0 = r4.A01
            com.instagram.creator.agent.settings.facts.repository.FactsRepository r0 = (com.instagram.creator.agent.settings.facts.repository.FactsRepository) r0
            X.0eS.A00(r8)
        L_0x00ad:
            X.3Ii r8 = (X.C239803Ii) r8
            boolean r2 = r8 instanceof X.C239793Ih
            r7 = 0
            if (r2 == 0) goto L_0x00e7
            X.3lr r9 = X.C41846B3n.A0R(r8)
            if (r9 == 0) goto L_0x00d7
            java.lang.Class<X.Bfi> r8 = X.C42624Bfi.class
            r6 = 0
            java.lang.String r3 = "xig_creator_ai_free_form_fact_delete_mutation(data:$request)"
            r2 = 1369458680(0x51a047f8, float:8.6050275E10)
            X.3lr r3 = r9.getOptionalTreeField(r6, r3, r8, r2)
            if (r3 == 0) goto L_0x00d7
            java.lang.String r2 = "success"
            boolean r2 = r3.getCoercedBooleanField(r6, r2)
            if (r2 == 0) goto L_0x00d7
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r3 = X.C41845B3m.A0d(r0)
            return r3
        L_0x00d7:
            com.instagram.repository.common.FeedPagedData r3 = r0.A00
            r0 = 34
            X.MP9 r2 = new X.MP9
            r2.<init>(r1, r0)
            r4.A01 = r7
            r4.A02 = r7
            r4.A00 = r5
            goto L_0x00fa
        L_0x00e7:
            boolean r2 = r8 instanceof X.C297815sO
            if (r2 == 0) goto L_0x0104
            com.instagram.repository.common.FeedPagedData r3 = r0.A00
            r0 = 35
            X.MP9 r2 = new X.MP9
            r2.<init>(r1, r0)
            r4.A01 = r7
            r4.A02 = r7
            r4.A00 = r6
        L_0x00fa:
            com.instagram.repository.common.FeedPagedData.A01(r3, r2)
        L_0x00fd:
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = X.C41845B3m.A0c(r0)
            return r3
        L_0x0104:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.repository.FactsRepository.A01(X.GlE, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r21, java.lang.String r22, java.lang.String r23, X.AnonymousClass4D7 r24) {
        /*
            r20 = this;
            r3 = 19
            r5 = r24
            boolean r0 = X.C66143MDv.A02(r3, r5)
            r9 = r20
            if (r0 == 0) goto L_0x00df
            r4 = r5
            X.MDv r4 = (X.C66143MDv) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00df
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0080
            if (r0 != r2) goto L_0x00fc
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ec
            X.3lr r4 = X.C41846B3n.A0R(r1)
            if (r4 == 0) goto L_0x00e5
            java.lang.Class<X.Bfm> r3 = X.C42628Bfm.class
            r7 = 0
            java.lang.String r1 = "xig_creator_ai_fact_preview_query(request:$request)"
            r0 = -244373840(0xfffffffff16f26b0, float:-1.184219E30)
            X.3lr r4 = r4.getOptionalTreeField(r7, r1, r3, r0)
            if (r4 == 0) goto L_0x00e5
            java.lang.Class<X.Bfl> r3 = X.C42627Bfl.class
            java.lang.String r1 = "examples"
            r0 = -694846178(0xffffffffd6957d1e, float:-8.2182303E13)
            com.google.common.collect.ImmutableList r1 = r4.getRequiredCompactedTreeListField(r7, r1, r3, r0)
            if (r1 == 0) goto L_0x00e5
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r6 = r1.iterator()
        L_0x0057:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x00e7
            X.3lr r3 = X.C41845B3m.A0V(r6)
            java.lang.String r1 = "prompt"
            java.lang.String r5 = r3.getOptionalStringField(r7, r1)
            java.lang.String r4 = ""
            if (r5 != 0) goto L_0x006c
            r5 = r4
        L_0x006c:
            java.lang.String r1 = "response"
            java.lang.String r1 = r3.getOptionalStringField(r2, r1)
            if (r1 == 0) goto L_0x0075
            r4 = r1
        L_0x0075:
            r3 = 26
            X.N49 r1 = new X.N49
            r1.<init>(r5, r4, r3)
            r0.add(r1)
            goto L_0x0057
        L_0x0080:
            X.0eS.A00(r1)
            X.1vn r1 = r9.A01
            r15 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r8 = X.C41845B3m.A04()
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r5 = "DEFAULT"
            java.lang.String r0 = "response_type"
            X.0Df r6 = X.C41845B3m.A03(r6, r5, r0)
            java.lang.String r0 = "prompt"
            r5 = r21
            X.0Df.A00(r6, r5, r0)
            java.lang.String r0 = "response"
            r5 = r22
            X.0Df.A00(r6, r5, r0)
            java.lang.String r5 = r9.A02
            java.lang.String r0 = "creator_id"
            X.0Df.A00(r6, r5, r0)
            java.lang.String r0 = "fact_id"
            r5 = r23
            X.0Df.A00(r6, r5, r0)
            java.lang.String r0 = "request"
            X.1vR r9 = X.C41847B3o.A04(r6, r7, r0)
            java.util.Map r11 = r7.getParamsCopy()
            java.util.Map r12 = r8.getParamsCopy()
            java.lang.Class<X.Bfn> r13 = X.C42629Bfn.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "IGCreatorAIFactPreviewQuery"
            r14 = 0
            java.lang.String r18 = "xig_creator_ai_fact_preview_query"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r4.A00 = r2
            java.lang.Object r1 = r1.A04(r8, r4)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x00df:
            X.MDv r4 = X.C41847B3o.A1H(r9, r5, r3)
            goto L_0x001a
        L_0x00e5:
            X.0sn r0 = X.0sn.A00
        L_0x00e7:
            X.3Ih r3 = X.C41845B3m.A0d(r0)
            return r3
        L_0x00ec:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00f7
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = X.C41845B3m.A0c(r0)
            return r3
        L_0x00f7:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00fc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.repository.FactsRepository.A02(java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (r2.length() == 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        if (r1.length() == 0) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.lang.String r19, java.lang.String r20, X.AnonymousClass4D7 r21) {
        /*
            r18 = this;
            r0 = r19
            r4 = 5
            r6 = r21
            boolean r1 = X.C66129MDh.A01(r4, r6)
            r10 = r18
            if (r1 == 0) goto L_0x0125
            r5 = r6
            X.MDh r5 = (X.C66129MDh) r5
            int r3 = r5.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x0125
            int r3 = r3 - r2
            r5.A00 = r3
        L_0x001b:
            java.lang.Object r6 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r2 = r5.A00
            java.lang.String r1 = ""
            r3 = 1
            if (r2 == 0) goto L_0x00c9
            if (r2 != r3) goto L_0x0136
            java.lang.Object r0 = r5.A01
            java.lang.String r0 = (java.lang.String) r0
            X.0eS.A00(r6)
        L_0x002f:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r2 = r6 instanceof X.C239793Ih
            r10 = 0
            if (r2 == 0) goto L_0x012c
            X.3lr r6 = X.C41846B3n.A0R(r6)
            if (r6 == 0) goto L_0x0135
            java.lang.Class<X.Bfm> r5 = X.C42628Bfm.class
            r7 = 0
            java.lang.String r4 = "xig_creator_ai_fact_preview_query(request:$request)"
            r2 = -244373840(0xfffffffff16f26b0, float:-1.184219E30)
            X.3lr r6 = r6.getOptionalTreeField(r7, r4, r5, r2)
            if (r6 == 0) goto L_0x0135
            java.lang.Class<X.Bfl> r5 = X.C42627Bfl.class
            java.lang.String r4 = "examples"
            r2 = -694846178(0xffffffffd6957d1e, float:-8.2182303E13)
            com.google.common.collect.ImmutableList r2 = r6.getRequiredCompactedTreeListField(r7, r4, r5, r2)
            if (r2 == 0) goto L_0x0135
            java.lang.Object r7 = X.00k.A0J(r2)
            X.3lr r7 = (X.C250663lr) r7
            if (r7 == 0) goto L_0x0135
            java.lang.Class<X.Bfk> r6 = X.C42626Bfk.class
            r5 = 2
            java.lang.String r4 = "link_preview"
            r2 = -1452875699(0xffffffffa966e04d, float:-5.126481E-14)
            X.3lr r4 = r7.getOptionalTreeField(r5, r4, r6, r2)
            if (r4 == 0) goto L_0x0135
            java.lang.String r6 = "preview_title"
            java.lang.String r2 = r4.getOptionalStringField(r3, r6)
            if (r2 == 0) goto L_0x008a
            int r2 = r2.length()
            if (r2 == 0) goto L_0x008a
            java.lang.String r2 = "preview_description"
            java.lang.String r2 = r4.A07(r2)
            if (r2 == 0) goto L_0x008a
            int r2 = r2.length()
            r14 = 1
            if (r2 != 0) goto L_0x008b
        L_0x008a:
            r14 = 0
        L_0x008b:
            java.lang.String r7 = r4.getOptionalStringField(r3, r6)
            if (r7 != 0) goto L_0x0092
            r7 = r1
        L_0x0092:
            java.lang.String r2 = "preview_description"
            java.lang.String r8 = r4.A07(r2)
            if (r8 != 0) goto L_0x009b
            r8 = r1
        L_0x009b:
            java.lang.String r2 = "preview_image_url"
            java.lang.String r6 = r4.getOptionalStringField(r5, r2)
            if (r6 != 0) goto L_0x00a4
            r6 = r1
        L_0x00a4:
            if (r14 == 0) goto L_0x00b3
            java.lang.String r1 = r4.getOptionalStringField(r5, r2)
            if (r1 == 0) goto L_0x00b3
            int r1 = r1.length()
            r13 = 1
            if (r1 != 0) goto L_0x00b4
        L_0x00b3:
            r13 = 0
        L_0x00b4:
            r2 = 3
            java.lang.String r1 = "preview_image_height"
            int r12 = r4.getCoercedIntField(r2, r1)
            r2 = 4
            java.lang.String r1 = "preview_image_width"
            int r11 = r4.getCoercedIntField(r2, r1)
            X.Gq1 r5 = new X.Gq1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r5
        L_0x00c9:
            X.0eS.A00(r6)
            X.1vn r2 = r10.A01
            r13 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r11 = X.C41845B3m.A04()
            X.0K0 r7 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r6 = "prompt"
            X.0Df r9 = X.C41845B3m.A03(r7, r1, r6)
            java.lang.String r6 = "response"
            X.0Df.A00(r9, r1, r6)
            java.lang.String r6 = "link"
            X.0Df.A00(r9, r0, r6)
            java.lang.String r7 = "LINK_ONLY"
            java.lang.String r6 = "response_type"
            X.0Df.A00(r9, r7, r6)
            java.lang.String r7 = r10.A02
            java.lang.String r6 = "creator_id"
            X.0Df.A00(r9, r7, r6)
            java.lang.String r6 = "fact_id"
            r7 = r20
            X.0Df.A00(r9, r7, r6)
            java.lang.String r6 = "request"
            X.1vR r7 = X.C41847B3o.A04(r9, r8, r6)
            java.util.Map r9 = r8.getParamsCopy()
            java.util.Map r10 = r11.getParamsCopy()
            java.lang.Class<X.Bfn> r11 = X.C42629Bfn.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGCreatorAIFactPreviewQuery"
            r12 = 0
            java.lang.String r16 = "xig_creator_ai_fact_preview_query"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r6 = X.C41846B3n.A0h(r6, r2, r0, r5)
            if (r6 != r4) goto L_0x002f
            return r4
        L_0x0125:
            X.MDh r5 = new X.MDh
            r5.<init>(r10, r6, r4)
            goto L_0x001b
        L_0x012c:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0135
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0135:
            return r10
        L_0x0136:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.repository.FactsRepository.A03(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C61037Jvb r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, X.AnonymousClass4D7 r29) {
        /*
            r23 = this;
            r0 = r25
            r1 = r26
            r6 = r27
            r8 = 14
            r9 = r29
            boolean r2 = X.ME0.A02(r8, r9)
            r5 = r23
            if (r2 == 0) goto L_0x0132
            r4 = r9
            X.ME0 r4 = (X.ME0) r4
            int r7 = r4.A00
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r7 & r3
            if (r2 == 0) goto L_0x0132
            int r7 = r7 - r3
            r4.A00 = r7
        L_0x0020:
            java.lang.Object r9 = r4.A05
            X.1Hj r3 = X.1Hj.A02
            int r8 = r4.A00
            r7 = 2
            r2 = 1
            if (r8 == 0) goto L_0x004d
            if (r8 == r2) goto L_0x0038
            if (r8 != r7) goto L_0x0139
            X.0eS.A00(r9)
        L_0x0031:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x0037:
            return r3
        L_0x0038:
            java.lang.Object r6 = r4.A04
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r4.A03
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r4.A02
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r8 = r4.A01
            com.instagram.creator.agent.settings.facts.repository.FactsRepository r8 = (com.instagram.creator.agent.settings.facts.repository.FactsRepository) r8
            X.0eS.A00(r9)
            goto L_0x00d6
        L_0x004d:
            X.0eS.A00(r9)
            X.0K0 r10 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r18 = 0
            java.lang.String r8 = "fact_id"
            X.0Df r12 = X.C41845B3m.A03(r10, r6, r8)
            java.lang.String r8 = "question"
            X.0Df.A00(r12, r0, r8)
            java.lang.String r8 = "answer"
            X.0Df.A00(r12, r1, r8)
            java.lang.String r9 = r5.A03
            java.lang.String r8 = "content_type"
            X.0Df.A00(r12, r9, r8)
            java.lang.String r9 = r5.A02
            java.lang.String r8 = "creator_id"
            X.0Df.A00(r12, r9, r8)
            java.lang.String r8 = "entrypoint"
            r9 = r28
            X.0Df.A00(r12, r9, r8)
            r11 = r24
            if (r24 == 0) goto L_0x0098
            java.lang.String r9 = r11.A00
            java.lang.String r8 = "corrected_bot_message_igid"
            X.0Df r10 = X.C41845B3m.A03(r10, r9, r8)
            java.lang.String r9 = r11.A01
            java.lang.String r8 = "otid"
            X.0Df.A00(r10, r9, r8)
            java.lang.String r9 = r11.A02
            java.lang.String r8 = "thread_igid"
            X.0Df.A00(r10, r9, r8)
            java.lang.String r8 = "thread_feedback_message_data"
            r12.A0E(r10, r8)
        L_0x0098:
            X.1vn r8 = r5.A01
            X.2IS r11 = X.C41845B3m.A04()
            X.2IS r10 = X.C41845B3m.A04()
            java.lang.String r9 = "request"
            X.1vR r12 = X.C41847B3o.A04(r12, r11, r9)
            java.util.Map r14 = r11.getParamsCopy()
            java.util.Map r15 = r10.getParamsCopy()
            java.lang.Class<X.Bfh> r16 = X.C42623Bfh.class
            java.util.ArrayList r22 = X.AnonymousClass7TE.A1C()
            java.lang.String r13 = "IGCreatorAIAddFactMutation"
            r19 = 0
            java.lang.String r21 = "xig_ig_creator_ai_free_form_fact_save_mutation"
            com.facebook.pando.PandoGraphQLRequest r11 = new com.facebook.pando.PandoGraphQLRequest
            r20 = r18
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r4.A01 = r5
            r4.A02 = r0
            r4.A03 = r1
            r4.A04 = r6
            r4.A00 = r2
            java.lang.Object r9 = r8.A04(r11, r4)
            if (r9 == r3) goto L_0x0037
            r8 = r5
        L_0x00d6:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r3 = r9 instanceof X.C239793Ih
            if (r3 == 0) goto L_0x013e
            X.3lr r11 = X.C41846B3n.A0R(r9)
            r10 = 0
            if (r11 == 0) goto L_0x0147
            java.lang.Class<X.Bfg> r9 = X.C42622Bfg.class
            java.lang.String r5 = "xig_ig_creator_ai_free_form_fact_save_mutation(request:$request)"
            r3 = -382752681(0xffffffffe92fa857, float:-1.3272311E25)
            X.3lr r11 = r11.A03(r9, r5, r3)
            if (r11 == 0) goto L_0x0147
            java.lang.Class<X.Bff> r9 = X.C42621Bff.class
            java.lang.String r5 = "fact"
            r3 = 416980443(0x18da9ddb, float:5.6511073E-24)
            X.3lr r3 = r11.getOptionalTreeField(r2, r5, r9, r3)
            if (r3 == 0) goto L_0x0130
            java.lang.String r9 = X.C41845B3m.A0k(r3)
        L_0x0101:
            r5 = 0
            java.lang.String r3 = "success"
            boolean r3 = r11.getCoercedBooleanField(r5, r3)
            if (r3 != r2) goto L_0x0147
            if (r9 == 0) goto L_0x0147
            java.lang.String r2 = r8.A03
            X.GlE r9 = X.HZH.A00(r2, r9, r0, r1)
            com.instagram.repository.common.FeedPagedData r1 = r8.A00
            r4.A01 = r10
            r4.A02 = r10
            r4.A03 = r10
            r4.A04 = r10
            r4.A00 = r7
            boolean r12 = X.AnonymousClass7TF.A1V(r6)
            r11 = 9
            X.IxI r0 = new X.IxI
            r7 = r0
            r10 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            com.instagram.repository.common.FeedPagedData.A01(r1, r0)
            goto L_0x0031
        L_0x0130:
            r9 = r10
            goto L_0x0101
        L_0x0132:
            X.ME0 r4 = new X.ME0
            r4.<init>(r5, r9, r8)
            goto L_0x0020
        L_0x0139:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x013e:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0147
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0147:
            X.0gF r0 = X.C60340gF.A00
            X.5sO r3 = X.C41845B3m.A0c(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.facts.repository.FactsRepository.A00(X.Jvb, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }
}
