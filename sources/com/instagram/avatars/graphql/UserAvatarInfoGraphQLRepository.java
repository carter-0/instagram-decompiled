package com.instagram.avatars.graphql;

import X.0qQ;
import X.1vm;
import X.1vn;
import com.instagram.common.session.UserSession;

public final class UserAvatarInfoGraphQLRepository {
    public final UserSession A00;
    public final 1vn A01;

    public UserAvatarInfoGraphQLRepository(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 1vm.A01(userSession);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JU, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r23, X.AnonymousClass4D7 r24) {
        /*
            r22 = this;
            r5 = 10
            r6 = r24
            boolean r0 = X.AnonymousClass9JU.A00(r5, r6)
            r1 = r22
            if (r0 == 0) goto L_0x00eb
            r4 = r6
            X.9JU r4 = (X.AnonymousClass9JU) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x00eb
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x001a:
            java.lang.Object r5 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0073
            if (r0 != r2) goto L_0x00f4
            X.0eS.A00(r5)
        L_0x0028:
            r3 = r5
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0069
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x0067
            java.lang.Class<X.7fl> r2 = X.C337137fl.class
            r4 = 0
            java.lang.String r1 = "fetch__IGUser(igid:$user_id)"
            r0 = 1995449320(0x76f023e8, float:2.4353115E33)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0067
            java.lang.Class<X.7fm> r2 = X.C337147fm.class
            java.lang.String r1 = "user_avatar"
            r0 = 1960712394(0x74de18ca, float:1.4077059E32)
            X.3lr r3 = r3.getOptionalTreeField(r4, r1, r2, r0)
            if (r3 == 0) goto L_0x0067
            java.lang.Class<X.7fn> r2 = X.C337157fn.class
            java.lang.String r1 = "ig_user_avatar_info"
            r0 = 2107668340(0x7da07774, float:2.666209E37)
            X.3lr r0 = r3.getOptionalTreeField(r4, r1, r2, r0)
        L_0x0061:
            X.3Ih r3 = new X.3Ih
            r3.<init>(r0)
        L_0x0066:
            return r3
        L_0x0067:
            r0 = 0
            goto L_0x0061
        L_0x0069:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0066
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0073:
            X.0eS.A00(r5)
            X.1vn r5 = r1.A01
            r17 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r0 = "user_id"
            r8 = r23
            r7.A04(r0, r8)
            r0 = 0
            if (r23 == 0) goto L_0x008f
            r0 = 1
        L_0x008f:
            X.17k.A0E(r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r11 = X.AnonymousClass1vS.A00()
            java.util.Map r13 = r7.getParamsCopy()
            java.util.Map r14 = r6.getParamsCopy()
            java.lang.Class<X.6o4> r15 = X.C317926o4.class
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            java.lang.String r12 = "IGAvatarInfoQuery"
            r16 = 0
            java.lang.String r20 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r10 = new com.facebook.pando.PandoGraphQLRequest
            r18 = r16
            r19 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            com.instagram.common.session.UserSession r7 = r1.A00
            X.0Tu r6 = X.0Tu.A05
            r0 = 36324737445933357(0x810d280006312d, double:3.0352484565611095E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x00e2
            r0 = 36606212422571365(0x820d2800051565, double:3.213254365195743E-306)
            long r0 = X.182.A01(r6, r7, r0)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MINUTES
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x00d8
            r0 = 60
        L_0x00d8:
            long r0 = r9.toMillis(r0)
            r10.setFreshCacheAgeMs(r0)
            r10.setMaxToleratedCacheAgeMs(r0)
        L_0x00e2:
            r4.A00 = r2
            java.lang.Object r5 = r5.A04(r10, r4)
            if (r5 != r3) goto L_0x0028
            return r3
        L_0x00eb:
            r0 = 42
            X.9JU r4 = new X.9JU
            r4.<init>(r1, r6, r5, r0)
            goto L_0x001a
        L_0x00f4:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.UserAvatarInfoGraphQLRepository.A00(java.lang.String, X.4D7):java.lang.Object");
    }
}
