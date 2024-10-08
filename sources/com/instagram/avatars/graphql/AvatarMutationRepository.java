package com.instagram.avatars.graphql;

import X.AnonymousClass7TG;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;

public final class AvatarMutationRepository {
    public final AvatarStore A00;
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r16) {
        /*
            r15 = this;
            r4 = 3
            r5 = r16
            boolean r0 = X.C66128MDg.A01(r4, r5)
            if (r0 == 0) goto L_0x00a2
            r2 = r5
            X.MDg r2 = (X.C66128MDg) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00a2
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0017:
            java.lang.Object r3 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r9) goto L_0x00a9
            java.lang.Object r1 = r2.A01
            com.instagram.avatars.graphql.AvatarMutationRepository r1 = (com.instagram.avatars.graphql.AvatarMutationRepository) r1
            X.0eS.A00(r3)
        L_0x0029:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0033
            com.instagram.avatars.store.AvatarStore r0 = r1.A00
            r0.A03()
        L_0x0032:
            return r3
        L_0x0033:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0032
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x003c:
            X.0eS.A00(r3)
            r10 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            X.0K0 r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r3 = "IG_EDIT_PROFILE"
            java.lang.String r0 = "referrer_surface"
            X.0Df r5 = X.C41845B3m.A03(r4, r3, r0)
            r0 = 899(0x383, float:1.26E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "referrer_mechanism"
            X.0Df.A00(r5, r3, r0)
            java.lang.String r0 = "logging_data"
            X.0Df r4 = r4.A02()
            r4.A0E(r5, r0)
            java.lang.String r3 = X.AnonymousClass7TF.A0b()
            java.lang.String r0 = "client_mutation_id"
            X.0Df.A00(r4, r3, r0)
            java.lang.String r0 = "input"
            X.1vR r4 = X.C41847B3o.A04(r4, r6, r0)
            java.util.Map r6 = r6.getParamsCopy()
            java.util.Map r7 = r7.getParamsCopy()
            java.lang.Class<X.Bnv> r8 = X.C42953Bnv.class
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.lang.String r5 = "IGAvatarDeleteMutation"
            r11 = 96
            java.lang.String r13 = "avatar_delete"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            com.instagram.common.session.UserSession r0 = r15.A01
            X.1vn r0 = X.1vm.A01(r0)
            r2.A01 = r15
            r2.A00 = r9
            java.lang.Object r3 = r0.A04(r3, r2)
            if (r3 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r1 = r15
            goto L_0x0029
        L_0x00a2:
            X.MDg r2 = new X.MDg
            r2.<init>(r15, r5, r4)
            goto L_0x0017
        L_0x00a9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarMutationRepository.A00(X.4D7):java.lang.Object");
    }

    public AvatarMutationRepository(AvatarStore avatarStore, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, avatarStore);
        this.A01 = userSession;
        this.A00 = avatarStore;
    }
}
