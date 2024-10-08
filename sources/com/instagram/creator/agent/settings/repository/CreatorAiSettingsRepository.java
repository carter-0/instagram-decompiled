package com.instagram.creator.agent.settings.repository;

import X.1vn;
import X.AnonymousClass43D;
import X.AnonymousClass7TG;
import X.C252733pa;
import com.instagram.common.session.UserSession;

public final class CreatorAiSettingsRepository extends C252733pa {
    public final UserSession A00;
    public final 1vn A01;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ad, code lost:
        if (r21 != null) goto L_0x01af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r32, X.AnonymousClass4D7 r33, int r34) {
        /*
            r31 = this;
            r3 = 23
            r6 = r33
            boolean r0 = X.C66143MDv.A02(r3, r6)
            r5 = r31
            if (r0 == 0) goto L_0x019e
            r4 = r6
            X.MDv r4 = (X.C66143MDv) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x019e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r2 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0153
            if (r1 != r0) goto L_0x01f2
            X.0eS.A00(r2)
        L_0x0028:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r1 = r2 instanceof X.C297815sO
            r15 = 0
            if (r1 != 0) goto L_0x01ee
            boolean r1 = r2 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x01a4
            X.3lr r4 = X.C41846B3n.A0R(r2)
            if (r4 == 0) goto L_0x01ee
            java.lang.Class<X.BgQ> r3 = X.C42667BgQ.class
            java.lang.String r2 = "fetch__IGUser(igid:$igid)"
            r1 = 1329824896(0x4f438480, float:3.28024064E9)
            X.3lr r1 = r4.A03(r3, r2, r1)
            if (r1 == 0) goto L_0x01ee
            java.lang.Class<X.BgP> r5 = X.C42666BgP.class
            r4 = 4
            java.lang.String r3 = "creator_ai"
            r2 = 1573541956(0x5dca5844, float:1.82255982E18)
            X.3lr r5 = r1.getOptionalTreeField(r4, r3, r5, r2)
            if (r5 == 0) goto L_0x01ee
            java.lang.Class<X.BgN> r4 = X.C42664BgN.class
            java.lang.String r3 = "ai"
            r2 = 1524499238(0x5ade0326, float:3.12454533E16)
            X.3lr r8 = r5.A03(r4, r3, r2)
            if (r8 == 0) goto L_0x01ee
            java.lang.Class<X.BgO> r4 = X.C42665BgO.class
            java.lang.String r3 = "creator_onboarding"
            r2 = 1825309643(0x6ccc03cb, float:1.9731102E27)
            X.3lr r6 = r5.getOptionalTreeField(r0, r3, r4, r2)
            if (r6 == 0) goto L_0x01ee
            java.lang.String r2 = "name"
            java.lang.String r28 = r1.getOptionalStringField(r0, r2)
            r7 = 0
            if (r28 == 0) goto L_0x007d
            int r2 = r28.length()
            if (r2 != 0) goto L_0x0085
        L_0x007d:
            java.lang.String r2 = X.AnonymousClass9PN.A00()
            java.lang.String r28 = r1.A09(r2)
        L_0x0085:
            java.lang.Class<X.BgM> r5 = X.C42663BgM.class
            r4 = 3
            java.lang.String r3 = "flag_content"
            r2 = -803933520(0xffffffffd014f2b0, float:-9.9957309E9)
            com.google.common.collect.ImmutableList r2 = X.C41845B3m.A0X(r8, r5, r3, r4, r2)
            java.lang.Object r3 = X.00k.A0J(r2)
            X.3lr r3 = (X.C250663lr) r3
            java.lang.String r9 = "strong_id__"
            java.lang.String r27 = r8.getOptionalStringField(r7, r9)
            if (r27 == 0) goto L_0x01ee
            java.lang.String r13 = ""
            if (r28 != 0) goto L_0x00a5
            r28 = r13
        L_0x00a5:
            java.lang.String r2 = "profile_image_uri(size:$size)"
            java.lang.String r29 = r1.A0A(r2)
            if (r29 != 0) goto L_0x00af
            r29 = r13
        L_0x00af:
            java.lang.String r2 = "is_auto_reply_enabled"
            boolean r25 = r8.getCoercedBooleanField(r0, r2)
            X.HNK r5 = X.HNK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r4 = 2
            java.lang.String r2 = "auto_reply_audience"
            java.lang.Enum r22 = r8.getOptionalEnumField(r4, r2, r5)
            java.lang.String r2 = "has_creator_onboarded"
            boolean r26 = r6.getCoercedBooleanField(r7, r2)
            if (r3 == 0) goto L_0x01d4
            java.lang.Class<X.BgL> r6 = X.C42662BgL.class
            r5 = 5
            java.lang.String r4 = "content"
            r2 = -1331725913(0xffffffffb09f79a7, float:-1.1603348E-9)
            X.3lr r8 = r3.getOptionalTreeField(r5, r4, r6, r2)
            if (r8 == 0) goto L_0x00da
            java.lang.String r16 = X.C41845B3m.A0l(r8, r7)
            if (r16 != 0) goto L_0x00dc
        L_0x00da:
            r16 = r13
        L_0x00dc:
            X.3lr r6 = r3.getOptionalTreeField(r5, r4, r6, r2)
            if (r6 == 0) goto L_0x01ef
            java.lang.Class<X.BgK> r5 = X.C42661BgK.class
            java.lang.String r4 = "ranges"
            r2 = 916929169(0x36a73a91, float:4.983806E-6)
            com.google.common.collect.ImmutableList r2 = r6.getRequiredCompactedTreeListField(r0, r4, r5, r2)
            if (r2 == 0) goto L_0x01ef
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r2.iterator()
        L_0x00f7:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x01a9
            java.lang.Object r8 = r15.next()
            int r14 = r7 + 1
            if (r7 >= 0) goto L_0x010d
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x010d:
            X.3lr r8 = (X.C250663lr) r8
            r6 = 0
            java.lang.String r2 = "offset"
            int r11 = r8.getCoercedIntField(r6, r2)
            java.lang.String r2 = "length"
            int r10 = r8.getCoercedIntField(r0, r2)
            java.lang.Class<X.BgJ> r5 = X.C42660BgJ.class
            java.lang.String r4 = "entity"
            r2 = 1626427326(0x60f14fbe, float:1.39106605E20)
            X.3lr r4 = r8.A04(r5, r4, r2)
            if (r4 == 0) goto L_0x0131
            java.lang.String r2 = "url"
            java.lang.String r5 = r4.A07(r2)
            if (r5 != 0) goto L_0x0132
        L_0x0131:
            r5 = r13
        L_0x0132:
            X.Kij r4 = X.C62612Kij.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "flag"
            java.lang.Enum r2 = r3.getOptionalEnumField(r6, r2, r4)
            X.Kij r2 = (X.C62612Kij) r2
            if (r2 == 0) goto L_0x0144
            java.lang.String r2 = r2.name()
            if (r2 != 0) goto L_0x0145
        L_0x0144:
            r2 = r13
        L_0x0145:
            java.lang.String r4 = X.002.A0O(r2, r7)
            X.GlM r2 = new X.GlM
            r2.<init>(r11, r10, r5, r4)
            r12.add(r2)
            r7 = r14
            goto L_0x00f7
        L_0x0153:
            X.0eS.A00(r2)
            r15 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.String r1 = "igid"
            r2 = r32
            boolean r6 = X.C41848B3p.A1Z(r8, r1, r2)
            java.lang.Integer r2 = new java.lang.Integer
            r1 = r34
            r2.<init>(r1)
            java.lang.String r1 = "size"
            r8.A03(r1, r2)
            X.1vR r9 = X.C41845B3m.A06(r6)
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.BgR> r13 = X.C42668BgR.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "IGCreatorAIAutoReplyStatus"
            r14 = 0
            java.lang.String r18 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1vn r1 = r5.A01
            r4.A00 = r0
            java.lang.Object r2 = r1.A04(r8, r4)
            if (r2 != r3) goto L_0x0028
            return r3
        L_0x019e:
            X.MDv r4 = X.C41847B3o.A1H(r5, r6, r3)
            goto L_0x001a
        L_0x01a4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01a9:
            X.62O r21 = X.AnonymousClass62Q.A03(r12)
            if (r21 == 0) goto L_0x01ef
        L_0x01af:
            java.lang.String r2 = "alert_title"
            java.lang.String r17 = r3.getOptionalStringField(r0, r2)
            if (r17 != 0) goto L_0x01b9
            r17 = r13
        L_0x01b9:
            java.lang.String r0 = "alert_body"
            java.lang.String r18 = r3.A09(r0)
            if (r18 != 0) goto L_0x01c3
            r18 = r13
        L_0x01c3:
            java.lang.String r0 = "alert_button"
            java.lang.String r19 = r3.A0A(r0)
            java.lang.String r0 = "alert_url"
            java.lang.String r20 = r3.A0B(r0)
            X.Gn5 r15 = new X.Gn5
            r15.<init>((java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (X.AnonymousClass62O) r21)
        L_0x01d4:
            r24 = 2
            X.Jw5 r21 = new X.Jw5
            r23 = r15
            r21.<init>(r22, r23, r24, r25, r26)
            java.lang.String r30 = r1.A07(r9)
            if (r30 != 0) goto L_0x01e5
            r30 = r13
        L_0x01e5:
            X.QP8 r15 = new X.QP8
            r25 = r15
            r26 = r21
            r25.<init>((X.C61067Jw5) r26, (java.lang.String) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30)
        L_0x01ee:
            return r15
        L_0x01ef:
            X.62M r21 = X.AnonymousClass62M.A01
            goto L_0x01af
        L_0x01f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository.A00(java.lang.String, X.4D7, int):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.DIT, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r1.getCoercedBooleanField(0, "is_auto_reply_enabled") == r3) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r19, X.AnonymousClass4D7 r20, boolean r21) {
        /*
            r18 = this;
            r3 = r21
            r6 = r20
            boolean r0 = r6 instanceof X.DIT
            r4 = r18
            if (r0 == 0) goto L_0x00b2
            r2 = r6
            X.DIT r2 = (X.DIT) r2
            int r5 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto L_0x00b2
            int r5 = r5 - r1
            r2.A00 = r5
        L_0x0018:
            java.lang.Object r5 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r12 = 1
            if (r0 == 0) goto L_0x0062
            if (r0 != r12) goto L_0x00be
            boolean r3 = r2.A01
            X.0eS.A00(r5)
        L_0x0028:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0060
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b9
            X.3lr r4 = X.C41846B3n.A0R(r5)
            if (r4 == 0) goto L_0x0060
            java.lang.Class<X.BgT> r2 = X.C42670BgT.class
            r5 = 0
            java.lang.String r1 = "xig_set_is_auto_reply_enabled_creator_ai_audience_control(data:$data)"
            r0 = 2069742900(0x7b5dc534, float:1.15149736E36)
            X.3lr r4 = r4.getOptionalTreeField(r5, r1, r2, r0)
            if (r4 == 0) goto L_0x0060
            java.lang.Class<X.BgS> r2 = X.C42669BgS.class
            java.lang.String r1 = "creator_ai_audience_control"
            r0 = 1162206276(0x4545dc44, float:3165.7666)
            X.3lr r1 = r4.getOptionalTreeField(r5, r1, r2, r0)
            if (r1 == 0) goto L_0x0060
            java.lang.String r0 = "is_auto_reply_enabled"
            boolean r0 = r1.getCoercedBooleanField(r5, r0)
            if (r0 != r3) goto L_0x0060
        L_0x005b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            return r0
        L_0x0060:
            r12 = 0
            goto L_0x005b
        L_0x0062:
            X.0eS.A00(r5)
            X.0K0 r6 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r13 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "is_enabled"
            X.0Df r7 = X.C41845B3m.A03(r6, r5, r0)
            r0 = 741(0x2e5, float:1.038E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r5 = r19
            X.0Df.A00(r7, r5, r0)
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r0 = "data"
            X.1vR r7 = X.C41847B3o.A04(r7, r6, r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.BgU> r11 = X.C42671BgU.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGCreatorAISetAutoReplyEnabledMutation"
            r14 = 64
            java.lang.String r16 = "xig_set_is_auto_reply_enabled_creator_ai_audience_control"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r0 = r4.A01
            r2.A01 = r3
            r2.A00 = r12
            java.lang.Object r5 = r0.A04(r6, r2)
            if (r5 != r1) goto L_0x0028
            return r1
        L_0x00b2:
            X.DIT r2 = new X.DIT
            r2.<init>(r4, r6)
            goto L_0x0018
        L_0x00b9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00be:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository.A01(java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r3.getCoercedBooleanField(0, "xig_creator_ai_agent_delete") == true) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r16) {
        /*
            r15 = this;
            r4 = 11
            r5 = r16
            boolean r0 = X.C66129MDh.A01(r4, r5)
            if (r0 == 0) goto L_0x0088
            r2 = r5
            X.MDh r2 = (X.C66129MDh) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0088
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0018:
            java.lang.Object r3 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L_0x0055
            if (r0 != r9) goto L_0x0093
            java.lang.Object r4 = r2.A01
            com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository r4 = (com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository) r4
            X.0eS.A00(r3)
        L_0x002a:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0053
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x008e
            X.3lr r3 = X.C41846B3n.A0R(r3)
            if (r3 == 0) goto L_0x0053
            r2 = 0
            java.lang.String r1 = "xig_creator_ai_agent_delete"
            boolean r0 = r3.getCoercedBooleanField(r2, r1)
            if (r0 != r9) goto L_0x0048
            com.instagram.common.session.UserSession r0 = r4.A00
            X.C71041OaE.A00(r0, r2)
        L_0x0048:
            boolean r0 = r3.getCoercedBooleanField(r2, r1)
            if (r0 != r9) goto L_0x0053
        L_0x004e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
        L_0x0052:
            return r1
        L_0x0053:
            r9 = 0
            goto L_0x004e
        L_0x0055:
            X.0eS.A00(r3)
            r10 = 0
            X.2IS r3 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r4 = X.C41845B3m.A05()
            java.util.Map r6 = r3.getParamsCopy()
            java.util.Map r7 = r0.getParamsCopy()
            java.lang.Class<X.BgI> r8 = X.C42659BgI.class
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.lang.String r5 = "IGCreatorAIAgentDeleteMutation"
            r11 = 0
            java.lang.String r13 = "xig_creator_ai_agent_delete"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.1vn r0 = r15.A01
            java.lang.Object r3 = X.C41846B3n.A0h(r3, r0, r15, r2)
            if (r3 == r1) goto L_0x0052
            r4 = r15
            goto L_0x002a
        L_0x0088:
            X.MDh r2 = new X.MDh
            r2.<init>(r15, r5, r4)
            goto L_0x0018
        L_0x008e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0093:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository.A02(X.4D7):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatorAiSettingsRepository(UserSession userSession, 1vn r4) {
        super("settings_repository", AnonymousClass43D.A00(245403032));
        AnonymousClass7TG.A1O(userSession, r4);
        this.A00 = userSession;
        this.A01 = r4;
    }
}
