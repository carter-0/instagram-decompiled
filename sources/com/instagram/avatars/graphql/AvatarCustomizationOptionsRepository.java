package com.instagram.avatars.graphql;

import X.02z;
import X.05G;
import X.1vm;
import X.1vn;
import X.AnonymousClass0r6;
import X.C51967G9n;
import com.instagram.common.session.UserSession;

public final class AvatarCustomizationOptionsRepository {
    public final UserSession A00;
    public final 1vn A01;
    public final String A02;
    public final AnonymousClass0r6 A03;
    public final 05G A04;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.Boolean r11, X.AnonymousClass4D7 r12, boolean r13) {
        /*
            r10 = this;
            r3 = 2
            boolean r0 = X.C66128MDg.A01(r3, r12)
            if (r0 == 0) goto L_0x00d3
            r7 = r12
            X.MDg r7 = (X.C66128MDg) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00d3
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r7.A02
            X.1Hj r8 = X.1Hj.A02
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L_0x0079
            if (r0 != r6) goto L_0x00da
            java.lang.Object r1 = r7.A01
            com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository r1 = (com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository) r1
            X.0eS.A00(r2)
        L_0x0027:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0070
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            X.05G r4 = r1.A04
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x006e
            java.lang.Class<X.Bns> r2 = X.C42950Bns.class
            r0 = 698(0x2ba, float:9.78E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            r0 = 2139629613(0x7f88282d, float:NaN)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x006e
            java.lang.Class<X.Bnr> r2 = X.C42949Bnr.class
            java.lang.String r1 = "user_avatar"
            r0 = 936972892(0x37d9125c, float:2.5876965E-5)
            X.3lr r3 = r3.A03(r2, r1, r0)
            if (r3 == 0) goto L_0x006e
            java.lang.Class<X.Bnq> r2 = X.C42948Bnq.class
            r0 = 1436(0x59c, float:2.012E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1914548677(0xffffffff8de24e3b, float:-1.3947159E-30)
            X.3lr r0 = r3.A03(r2, r1, r0)
        L_0x0068:
            r4.Epw(r0)
        L_0x006b:
            X.0gF r8 = X.C60340gF.A00
        L_0x006d:
            return r8
        L_0x006e:
            r0 = 0
            goto L_0x0068
        L_0x0070:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x006b
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0079:
            X.0eS.A00(r2)
            X.2IS r4 = X.C41845B3m.A04()
            X.2IS r3 = X.C41845B3m.A04()
            com.instagram.common.session.UserSession r0 = r10.A00
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "user_id"
            r4.A04(r0, r1)
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r0 = "refresh_only"
            X.0Df r2 = X.C41845B3m.A03(r1, r11, r0)
            java.lang.String r1 = r10.A02
            java.lang.String r0 = "sticker_pack_id"
            X.0Df.A00(r2, r1, r0)
            java.lang.String r0 = "query_params"
            X.DbW.A18(r2, r4, r0)
            com.facebook.pando.PandoGraphQLRequest r9 = X.C64404LbL.A00(r4, r3)
            r2 = 3
            r4 = 0
            if (r13 == 0) goto L_0x00d0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r0 = r0.toMillis(r2)
        L_0x00b1:
            X.1Ef r1 = r9.setFreshCacheAgeMs(r0)
            if (r13 == 0) goto L_0x00bd
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r4 = r0.toMillis(r2)
        L_0x00bd:
            X.1Ef r1 = r1.setMaxToleratedCacheAgeMs(r4)
            X.1vn r0 = r10.A01
            r7.A01 = r10
            r7.A00 = r6
            java.lang.Object r2 = r0.A04(r1, r7)
            if (r2 == r8) goto L_0x006d
            r1 = r10
            goto L_0x0027
        L_0x00d0:
            r0 = 0
            goto L_0x00b1
        L_0x00d3:
            X.MDg r7 = new X.MDg
            r7.<init>(r10, r12, r3)
            goto L_0x0015
        L_0x00da:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.graphql.AvatarCustomizationOptionsRepository.A00(java.lang.Boolean, X.4D7, boolean):java.lang.Object");
    }

    public AvatarCustomizationOptionsRepository(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = 1vm.A01(userSession);
        02z A0u = C51967G9n.A0u();
        this.A04 = A0u;
        this.A03 = A0u;
    }
}
