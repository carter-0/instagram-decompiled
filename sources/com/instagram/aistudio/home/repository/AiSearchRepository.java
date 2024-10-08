package com.instagram.aistudio.home.repository;

import X.0qQ;
import X.1vm;
import X.1vn;
import com.instagram.common.session.UserSession;

public final class AiSearchRepository {
    public UserSession A00;
    public final 1vn A01;

    public AiSearchRepository(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        1vn A012 = 1vm.A01(userSession);
        0qQ.A0B(A012, 1);
        this.A01 = A012;
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v40 */
    /* JADX WARNING: type inference failed for: r3v41 */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r25, X.AnonymousClass4D7 r26) {
        /*
            r24 = this;
            r5 = 31
            r6 = r26
            boolean r0 = X.C66144MDw.A02(r5, r6)
            r4 = r24
            if (r0 == 0) goto L_0x01f0
            r3 = r6
            X.MDw r3 = (X.C66144MDw) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01f0
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r5 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L_0x01af
            if (r1 != r0) goto L_0x0218
            java.lang.Object r2 = r3.A01
            com.instagram.aistudio.home.repository.AiSearchRepository r2 = (com.instagram.aistudio.home.repository.AiSearchRepository) r2
            X.0eS.A00(r5)
        L_0x002c:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r1 = r5 instanceof X.C297815sO
            if (r1 != 0) goto L_0x021d
            boolean r1 = r5 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0213
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r1 = r5.A00
            X.3JC r1 = (X.AnonymousClass3JC) r1
            if (r1 == 0) goto L_0x021d
            java.lang.Object r5 = r1.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x021d
            java.lang.Class<X.Bto> r4 = X.C43164Bto.class
            r1 = 4260(0x10a4, float:5.97E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r1)
            r1 = -55019795(0xfffffffffcb876ed, float:-7.662358E36)
            X.3lr r5 = r5.A03(r4, r3, r1)
            if (r5 == 0) goto L_0x021d
            java.lang.Class<X.C80> r4 = X.C80.class
            java.lang.String r3 = "edges"
            r1 = 28845550(0x1b825ee, float:6.764535E-38)
            com.google.common.collect.ImmutableList r3 = r5.A06(r4, r3, r1)
            if (r3 == 0) goto L_0x021d
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r3.iterator()
        L_0x006a:
            boolean r3 = r10.hasNext()
            r20 = 0
            if (r3 == 0) goto L_0x01f7
            java.lang.Object r4 = r10.next()
            X.C80 r4 = (X.C80) r4
            if (r4 == 0) goto L_0x006a
            X.C7z r3 = r4.A0E()
            if (r3 == 0) goto L_0x006a
            X.C8R r3 = r3.A0E()
            if (r3 == 0) goto L_0x006a
            X.BuP r3 = r3.A0G()
            if (r3 == 0) goto L_0x006a
            java.lang.String r5 = "name"
            java.lang.String r13 = r3.getOptionalStringField(r0, r5)
            if (r13 == 0) goto L_0x006a
            X.C7z r3 = r4.A0E()
            if (r3 == 0) goto L_0x006a
            X.C8R r3 = r3.A0E()
            if (r3 == 0) goto L_0x006a
            X.BuP r7 = r3.A0G()
            if (r7 == 0) goto L_0x006a
            r6 = 7
            java.lang.String r3 = "profile_image_url"
            java.lang.String r15 = r7.getOptionalStringField(r6, r3)
            if (r15 == 0) goto L_0x006a
            X.C7z r3 = r4.A0E()
            if (r3 == 0) goto L_0x006a
            X.C8R r6 = r3.A0E()
            if (r6 == 0) goto L_0x006a
            java.lang.String r3 = "id"
            java.lang.String r14 = r6.A07(r3)
            if (r14 == 0) goto L_0x006a
            X.C7z r3 = r4.A0E()
            if (r3 == 0) goto L_0x01ab
            X.C8R r3 = r3.A0E()
            if (r3 == 0) goto L_0x01ab
            X.BuP r6 = r3.A0G()
            if (r6 == 0) goto L_0x01ab
            java.lang.String r3 = "tagline"
            java.lang.String r16 = r6.A0C(r3)
        L_0x00db:
            X.C7z r3 = r4.A0E()
            if (r3 == 0) goto L_0x01a7
            X.C8R r9 = r3.A0E()
            if (r9 == 0) goto L_0x01a7
            java.lang.Class<X.BuO> r8 = X.C43200BuO.class
            r7 = 6
            java.lang.String r6 = "XIGGenAIIGCreatorPersona"
            r3 = 1101160865(0x41a261a1, float:20.29767)
            X.3lr r6 = r9.reinterpretIfFulfillsType(r7, r6, r8, r3)
            if (r6 == 0) goto L_0x01a7
            java.lang.String r3 = "creator_igid"
            java.lang.String r18 = r6.getOptionalStringField(r0, r3)
        L_0x00fb:
            X.C7z r3 = r4.A0E()
            if (r3 == 0) goto L_0x0115
            X.C8R r3 = r3.A0E()
            if (r3 == 0) goto L_0x0115
            X.BuN r6 = r3.A0F()
            if (r6 == 0) goto L_0x0115
            java.lang.String r3 = "bot_id"
            java.lang.String r17 = r6.A07(r3)
            if (r17 != 0) goto L_0x0119
        L_0x0115:
            if (r18 == 0) goto L_0x006a
            r17 = r18
        L_0x0119:
            X.C7z r3 = r4.A0E()
            if (r3 == 0) goto L_0x01a4
            X.C8R r3 = r3.A0E()
            if (r3 == 0) goto L_0x01a4
            X.BuM r3 = r3.A0E()
            if (r3 == 0) goto L_0x01a4
            java.lang.String r19 = r3.A07(r5)
        L_0x012f:
            X.C7z r3 = r4.A0E()
            if (r3 == 0) goto L_0x01a1
            X.C8R r5 = r3.A0E()
            if (r5 == 0) goto L_0x01a1
            java.lang.String r3 = "is_meta_created"
            boolean r22 = r5.getCoercedBooleanField(r0, r3)
        L_0x0141:
            X.C7z r3 = r4.A0E()
            if (r3 == 0) goto L_0x019e
            X.C8R r6 = r3.A0E()
            if (r6 == 0) goto L_0x019e
            r5 = 2
            java.lang.String r3 = "is_verified"
            boolean r23 = r6.getCoercedBooleanField(r5, r3)
        L_0x0154:
            X.C7z r3 = r4.A0E()
            if (r3 == 0) goto L_0x019b
            X.C8R r3 = r3.A0E()
            if (r3 == 0) goto L_0x019b
            X.BuP r5 = r3.A0G()
            if (r5 == 0) goto L_0x019b
            java.lang.String r3 = "icebreaker_short"
            java.lang.String r21 = r5.A0A(r3)
        L_0x016c:
            X.C7z r3 = r4.A0E()
            if (r3 == 0) goto L_0x0185
            X.C8R r3 = r3.A0E()
            if (r3 == 0) goto L_0x0185
            X.BuP r4 = r3.A0G()
            if (r4 == 0) goto L_0x0185
            r5 = 6
            java.lang.String r3 = "welcome_message"
            java.lang.String r20 = r4.getOptionalStringField(r5, r3)
        L_0x0185:
            if (r18 == 0) goto L_0x0193
            com.instagram.api.schemas.IGAIAgentType r12 = com.instagram.api.schemas.IGAIAgentType.A04
        L_0x0189:
            X.JuV r11 = new X.JuV
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1.add(r11)
            goto L_0x006a
        L_0x0193:
            if (r22 == 0) goto L_0x0198
            com.instagram.api.schemas.IGAIAgentType r12 = com.instagram.api.schemas.IGAIAgentType.A05
            goto L_0x0189
        L_0x0198:
            com.instagram.api.schemas.IGAIAgentType r12 = com.instagram.api.schemas.IGAIAgentType.A08
            goto L_0x0189
        L_0x019b:
            r21 = r20
            goto L_0x016c
        L_0x019e:
            r23 = 0
            goto L_0x0154
        L_0x01a1:
            r22 = 0
            goto L_0x0141
        L_0x01a4:
            r19 = r20
            goto L_0x012f
        L_0x01a7:
            r18 = r20
            goto L_0x00fb
        L_0x01ab:
            r16 = r20
            goto L_0x00db
        L_0x01af:
            X.0eS.A00(r5)
            r13 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            java.lang.String r1 = "search_query"
            r7 = r25
            boolean r1 = X.C41848B3p.A1Z(r6, r1, r7)
            X.1vR r7 = X.C41845B3m.A06(r1)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.Btp> r11 = X.C43165Btp.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "AiSearchQuery"
            r12 = 0
            java.lang.String r16 = "xfb_genai_search_persona"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1vn r1 = r4.A01
            r3.A01 = r4
            r3.A00 = r0
            java.lang.Object r5 = r1.A04(r6, r3)
            if (r5 == r2) goto L_0x0225
            r2 = r4
            goto L_0x002c
        L_0x01f0:
            X.MDw r3 = new X.MDw
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x01f7:
            com.instagram.common.session.UserSession r5 = r2.A00
            X.0Tu r4 = X.0Tu.A05
            r2 = 36606620444792289(0x820d87000a15e1, double:3.213512400091229E-306)
            int r2 = X.DbS.A04(r4, r5, r2)
            java.util.List r1 = X.00k.A0X(r1)
            java.util.List r3 = X.00k.A0d(r1, r2)
            r1 = 5
            X.JwK r2 = new X.JwK
            r2.<init>((java.util.List) r3, (int) r0, (int) r1)
            return r2
        L_0x0213:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0218:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x021d:
            X.0sn r3 = X.0sn.A00
            r1 = 5
            X.JwK r2 = new X.JwK
            r2.<init>((boolean) r0, (java.util.List) r3, (int) r1)
        L_0x0225:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.aistudio.home.repository.AiSearchRepository.A00(java.lang.String, X.4D7):java.lang.Object");
    }
}
