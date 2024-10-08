package com.instagram.creator.agent.settings.summary;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.AnonymousClass43D;
import X.AnonymousClass7TG;
import X.C252733pa;
import com.instagram.common.session.UserSession;

public final class BioSummaryRepository extends C252733pa {
    public String A00;
    public final UserSession A01;
    public final 1vn A02;
    public final String A03;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r0 != null) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r19, X.AnonymousClass4D7 r20) {
        /*
            r18 = this;
            r3 = r19
            r6 = 13
            r7 = r20
            boolean r0 = X.C66129MDh.A01(r6, r7)
            r4 = r18
            if (r0 == 0) goto L_0x00b1
            r2 = r7
            X.MDh r2 = (X.C66129MDh) r2
            int r5 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto L_0x00b1
            int r5 = r5 - r1
            r2.A00 = r5
        L_0x001c:
            java.lang.Object r5 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r12 = 1
            if (r0 == 0) goto L_0x006d
            if (r0 != r12) goto L_0x00bd
            java.lang.Object r3 = r2.A01
            X.0eS.A00(r5)
        L_0x002c:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0038
            r0 = 0
        L_0x0033:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x0038:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b8
            X.3lr r4 = X.C41846B3n.A0R(r5)
            if (r4 == 0) goto L_0x0066
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl$XigUpdateBioCreatorAgentPersona> r2 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl.XigUpdateBioCreatorAgentPersona.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = -1931866927(0xffffffff8cda0cd1, float:-3.3595932E-31)
            java.lang.String r0 = "xig_update_bio_creator_agent_persona(data:$data)"
            X.3lr r4 = r4.A03(r2, r0, r1)
            if (r4 == 0) goto L_0x0066
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl$XigUpdateBioCreatorAgentPersona$CreatorAgentPersona> r2 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl.XigUpdateBioCreatorAgentPersona.CreatorAgentPersona.class
            r1 = 260253895(0xf8328c7, float:1.2933304E-29)
            java.lang.String r0 = "creator_agent_persona"
            X.3lr r1 = r4.A03(r2, r0, r1)
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = "bio"
            java.lang.String r0 = r1.getOptionalStringField(r12, r0)
            if (r0 != 0) goto L_0x0068
        L_0x0066:
            java.lang.String r0 = ""
        L_0x0068:
            boolean r0 = r0.equals(r3)
            goto L_0x0033
        L_0x006d:
            X.0eS.A00(r5)
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r13 = 0
            java.lang.String r0 = "bio"
            X.0Df r7 = X.C41845B3m.A03(r5, r3, r0)
            java.lang.String r5 = r4.A00
            java.lang.String r0 = "creator_agent_persona_id"
            X.0Df.A00(r7, r5, r0)
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "data"
            X.1vR r7 = X.C41847B3o.A04(r7, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl> r11 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewMutationResponseImpl.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGCreatorAISummaryViewMutation"
            r14 = 64
            java.lang.String r16 = "xig_update_bio_creator_agent_persona"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = r4.A02
            java.lang.Object r5 = X.C41846B3n.A0h(r6, r0, r3, r2)
            if (r5 != r1) goto L_0x002c
            return r1
        L_0x00b1:
            X.MDh r2 = new X.MDh
            r2.<init>(r4, r7, r6)
            goto L_0x001c
        L_0x00b8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.summary.BioSummaryRepository.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c7, code lost:
        if (r0 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r20) {
        /*
            r19 = this;
            r5 = 12
            r6 = r20
            boolean r0 = X.C66129MDh.A01(r5, r6)
            r4 = r19
            if (r0 == 0) goto L_0x0075
            r3 = r6
            X.MDh r3 = (X.C66129MDh) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0075
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r6 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 != r2) goto L_0x00d5
            java.lang.Object r5 = r3.A01
            com.instagram.creator.agent.settings.summary.BioSummaryRepository r5 = (com.instagram.creator.agent.settings.summary.BioSummaryRepository) r5
            X.0eS.A00(r6)
        L_0x002c:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "network failure"
            X.5sO r1 = X.C41845B3m.A0c(r0)
        L_0x0038:
            return r1
        L_0x0039:
            X.0eS.A00(r6)
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            java.lang.String r5 = r4.A03
            r13 = 0
            java.lang.String r0 = "igid"
            r7.A04(r0, r5)
            X.1vR r8 = X.C41845B3m.A05()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl> r12 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "IGCreatorAISummaryQuery"
            r14 = 0
            java.lang.String r17 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r0 = r4.A02
            java.lang.Object r6 = X.C41846B3n.A0h(r7, r0, r4, r3)
            if (r6 == r1) goto L_0x0038
            r5 = r4
            goto L_0x002c
        L_0x0075:
            X.MDh r3 = new X.MDh
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x007b:
            boolean r0 = r6 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00d0
            X.3lr r4 = X.C41846B3n.A0R(r6)
            if (r4 == 0) goto L_0x00c9
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl$FetchIGUser> r3 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl.FetchIGUser.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = 254180558(0xf267cce, float:8.2084684E-30)
            java.lang.String r0 = "fetch__IGUser(igid:$igid)"
            X.3lr r4 = r4.A03(r3, r0, r1)
            if (r4 == 0) goto L_0x00c9
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl$FetchIGUser$CreatorAi> r3 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl.FetchIGUser.CreatorAi.class
            r1 = 1928901240(0x72f8b278, float:9.851909E30)
            java.lang.String r0 = "creator_ai"
            X.3lr r4 = r4.A03(r3, r0, r1)
            if (r4 == 0) goto L_0x00c9
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl$FetchIGUser$CreatorAi$Ai> r3 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl.FetchIGUser.CreatorAi.Ai.class
            r1 = 1573602634(0x5dcb454a, float:1.83089934E18)
            java.lang.String r0 = "ai"
            X.3lr r4 = r4.A03(r3, r0, r1)
            if (r4 == 0) goto L_0x00c9
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl$FetchIGUser$CreatorAi$Ai$Persona> r3 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryQueryResponseImpl.FetchIGUser.CreatorAi.Ai.Persona.class
            r1 = -1584022921(0xffffffffa195ba77, float:-1.014599E-18)
            java.lang.String r0 = "persona"
            X.3lr r1 = r4.A03(r3, r0, r1)
            if (r1 == 0) goto L_0x00c9
            java.lang.String r0 = X.C41845B3m.A0k(r1)
            r5.A00 = r0
            java.lang.String r0 = "bio"
            java.lang.String r0 = r1.getOptionalStringField(r2, r0)
            if (r0 != 0) goto L_0x00cb
        L_0x00c9:
            java.lang.String r0 = ""
        L_0x00cb:
            X.3Ih r1 = X.C41845B3m.A0d(r0)
            return r1
        L_0x00d0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.summary.BioSummaryRepository.A01(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r20) {
        /*
            r19 = this;
            r3 = 24
            r6 = r20
            boolean r0 = X.C66143MDv.A02(r3, r6)
            r5 = r19
            if (r0 == 0) goto L_0x00b3
            r4 = r6
            X.MDv r4 = (X.C66143MDv) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b3
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0076
            if (r0 != r2) goto L_0x00be
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C297815sO
            r3 = 0
            if (r0 != 0) goto L_0x0075
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b9
            X.3lr r5 = X.C41846B3n.A0R(r1)
            if (r5 == 0) goto L_0x0075
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl$FetchIGUser> r4 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl.FetchIGUser.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = 383887332(0x16e1a7e4, float:3.6456664E-25)
            java.lang.String r0 = "fetch__IGUser(igid:$igid)"
            X.3lr r5 = r5.A03(r4, r0, r1)
            if (r5 == 0) goto L_0x0075
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl$FetchIGUser$CreatorAi> r4 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl.FetchIGUser.CreatorAi.class
            r1 = -10673103(0xffffffffff5d2431, float:-2.939473E38)
            java.lang.String r0 = "creator_ai"
            X.3lr r5 = r5.getOptionalTreeField(r2, r0, r4, r1)
            if (r5 == 0) goto L_0x0075
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl$FetchIGUser$CreatorAi$Ai> r4 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl.FetchIGUser.CreatorAi.Ai.class
            r1 = 938486414(0x37f02a8e, float:2.8630046E-5)
            java.lang.String r0 = "ai"
            X.3lr r5 = r5.A03(r4, r0, r1)
            if (r5 == 0) goto L_0x0075
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl$FetchIGUser$CreatorAi$Ai$Persona> r4 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl.FetchIGUser.CreatorAi.Ai.Persona.class
            r1 = 1211462083(0x483571c3, float:185799.05)
            java.lang.String r0 = "persona"
            X.3lr r1 = r5.A03(r4, r0, r1)
            if (r1 == 0) goto L_0x0075
            java.lang.String r0 = "regenerate_bio"
            java.lang.String r3 = r1.getOptionalStringField(r2, r0)
        L_0x0075:
            return r3
        L_0x0076:
            X.0eS.A00(r1)
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            java.lang.String r1 = r5.A03
            r13 = 0
            java.lang.String r0 = "igid"
            r7.A04(r0, r1)
            X.1vR r8 = X.C41845B3m.A05()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl> r12 = com.instagram.creator.agent.settings.summary.IGCreatorAISummaryViewRegenerateQueryResponseImpl.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "IGCreatorAISummaryViewRegenerateQuery"
            r14 = 0
            java.lang.String r17 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r0 = r5.A02
            r4.A00 = r2
            java.lang.Object r1 = r0.A04(r7, r4)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x00b3:
            X.MDv r4 = X.C41847B3o.A1H(r5, r6, r3)
            goto L_0x001a
        L_0x00b9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.summary.BioSummaryRepository.A02(X.4D7):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BioSummaryRepository(UserSession userSession, String str) {
        super("creator_ai_bio_repo", AnonymousClass43D.A01(245403032, 3));
        1vn A012 = 1vm.A01(userSession);
        AnonymousClass7TG.A1O(str, userSession);
        0qQ.A0B(A012, 3);
        this.A03 = str;
        this.A01 = userSession;
        this.A02 = A012;
    }
}
