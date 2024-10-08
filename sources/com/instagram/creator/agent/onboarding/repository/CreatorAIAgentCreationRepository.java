package com.instagram.creator.agent.onboarding.repository;

import X.05G;
import X.1vn;
import X.AnonymousClass0Ud;
import X.AnonymousClass1EO;
import X.C252733pa;
import X.C52369GPq;
import X.C65363Ls4;
import com.instagram.common.session.UserSession;

public final class CreatorAIAgentCreationRepository extends C252733pa {
    public AnonymousClass1EO A00;
    public C65363Ls4 A01;
    public final UserSession A02;
    public final C52369GPq A03;
    public final 1vn A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r20, X.AnonymousClass4D7 r21) {
        /*
            r19 = this;
            r1 = r20
            r6 = 2
            r7 = r21
            boolean r0 = X.C66145MDx.A02(r6, r7)
            r4 = r19
            if (r0 == 0) goto L_0x00a8
            r3 = r7
            X.MDx r3 = (X.C66145MDx) r3
            int r5 = r3.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r2
            if (r0 == 0) goto L_0x00a8
            int r5 = r5 - r2
            r3.A00 = r5
        L_0x001b:
            java.lang.Object r6 = r3.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r13 = 1
            if (r0 == 0) goto L_0x0063
            if (r0 != r13) goto L_0x00f0
            java.lang.Object r1 = r3.A02
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r3.A01
            com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository r5 = (com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository) r5
            X.0eS.A00(r6)
        L_0x0031:
            X.3Ii r6 = (X.C239803Ii) r6
            boolean r0 = r6 instanceof X.C239793Ih
            r4 = 0
            if (r0 == 0) goto L_0x00af
            com.instagram.common.session.UserSession r0 = r5.A02
            X.C71041OaE.A00(r0, r13)
            X.3lr r3 = X.C41846B3n.A0R(r6)
            if (r3 == 0) goto L_0x0060
            java.lang.Class<X.BfB> r2 = X.C42591BfB.class
            r0 = 4274(0x10b2, float:5.989E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1647189863(0xffffffff9dd1e099, float:-5.5554068E-21)
            X.3lr r1 = r3.A03(r2, r1, r0)
            if (r1 == 0) goto L_0x0060
            r0 = 1887(0x75f, float:2.644E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r4 = r1.getOptionalStringField(r13, r0)
            if (r4 != 0) goto L_0x0062
        L_0x0060:
            java.lang.String r4 = ""
        L_0x0062:
            return r4
        L_0x0063:
            X.0eS.A00(r6)
            r14 = 0
            X.2IS r7 = X.C41845B3m.A04()
            X.2IS r6 = X.C41845B3m.A04()
            X.0K0 r5 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "source"
            X.0Df r5 = X.C41845B3m.A03(r5, r1, r0)
            java.lang.String r0 = "request"
            X.1vR r8 = X.C41847B3o.A04(r5, r7, r0)
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.BfC> r12 = X.C42592BfC.class
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()
            java.lang.String r9 = "CreatorAIAgentCreation"
            r15 = 0
            java.lang.String r17 = "xig_creator_ai_agent_create"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r0 = r4.A04
            r3.A01 = r4
            r3.A02 = r1
            r3.A00 = r13
            java.lang.Object r6 = r0.A04(r7, r3)
            if (r6 != r2) goto L_0x00a6
            return r2
        L_0x00a6:
            r5 = r4
            goto L_0x0031
        L_0x00a8:
            X.MDx r3 = new X.MDx
            r3.<init>(r4, r7, r6)
            goto L_0x001b
        L_0x00af:
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00eb
            com.instagram.common.session.UserSession r0 = r5.A02
            android.content.Context r3 = X.C51966G9m.A0P(r0)
            r0 = 32
            X.Phi r2 = new X.Phi
            r2.<init>(r1, r5, r0)
            java.lang.String r0 = "creator_ai_agent_creation_error"
            X.6ap r1 = X.DbV.A0X()
            r1.A0H = r0
            r0 = 2131974093(0x7f1357cd, float:1.958524E38)
            X.DbS.A19(r3, r1, r0)
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            r1.A07(r0)
            r0 = 2131972372(0x7f135114, float:1.958175E38)
            X.DbW.A0q(r3, r1, r0)
            r1.A0L = r13
            r0 = -1
            r1.A01 = r0
            X.IVR r0 = new X.IVR
            r0.<init>(r13, r5, r2)
            r1.A0A(r0)
            X.DbY.A1N(r1)
            return r4
        L_0x00eb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00f0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CreatorAIAgentCreationRepository(com.instagram.common.session.UserSession r6) {
        /*
            r5 = this;
            X.1vn r4 = X.1vm.A01(r6)
            r3 = 0
            r0 = 245403032(0xea08d98, float:3.9579395E-30)
            X.19S r2 = X.AnonymousClass43D.A00(r0)
            X.GPq r1 = new X.GPq
            r1.<init>(r6, r3)
            java.lang.String r0 = "creator_ai_agent_creation"
            r5.<init>(r0, r2)
            r5.A02 = r6
            r5.A04 = r4
            r5.A03 = r1
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            X.02z r0 = X.DbS.A10(r0)
            r5.A05 = r0
            X.05F r0 = X.10b.A03(r0)
            r5.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository.<init>(com.instagram.common.session.UserSession):void");
    }
}
