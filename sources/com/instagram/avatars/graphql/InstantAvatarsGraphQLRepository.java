package com.instagram.avatars.graphql;

import com.instagram.common.session.UserSession;

public final class InstantAvatarsGraphQLRepository {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME4, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r19) {
        /*
            r18 = this;
            r3 = 28
            r4 = r19
            boolean r0 = X.ME4.A03(r3, r4)
            r6 = r18
            if (r0 == 0) goto L_0x0099
            r5 = r4
            X.ME4 r5 = (X.ME4) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0099
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 != r3) goto L_0x009f
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0057
            X.3lr r4 = X.C41846B3n.A0R(r1)
            if (r4 == 0) goto L_0x0055
            java.lang.Class<X.Bqi> r3 = X.C43018Bqi.class
            r2 = 0
            r0 = 4255(0x109f, float:5.963E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -196949188(0xfffffffff442cb3c, float:-6.1732646E31)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x0055
            r0 = 163(0xa3, float:2.28E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Boolean r0 = X.C41846B3n.A0d(r1, r0, r2)
        L_0x0050:
            X.3Ih r1 = X.C41845B3m.A0d(r0)
        L_0x0054:
            return r1
        L_0x0055:
            r0 = 0
            goto L_0x0050
        L_0x0057:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0054
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0060:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1vn r2 = X.1vm.A01(r0)
            r13 = 0
            X.2IS r1 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r7 = X.C41845B3m.A05()
            java.util.Map r9 = r1.getParamsCopy()
            java.util.Map r10 = r0.getParamsCopy()
            java.lang.Class<X.Bqj> r11 = X.C43019Bqj.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "InstantAvatarsOnDemandEligibility"
            r12 = 0
            java.lang.String r16 = "xfb_avatar_editor_instant_avatar_ondemand_eligibility"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5.A00 = r3
            java.lang.Object r1 = r2.A04(r6, r5)
            if (r1 != r4) goto L_0x0028
            return r4
        L_0x0099:
            X.ME4 r5 = X.ME4.A00(r6, r4, r3)
            goto L_0x001a
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.InstantAvatarsGraphQLRepository.A00(X.4D7):java.lang.Object");
    }

    public InstantAvatarsGraphQLRepository(UserSession userSession) {
        this.A00 = userSession;
    }
}
