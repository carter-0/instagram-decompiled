package com.instagram.newsfeed.followrequests.data;

import X.C47289DuI;
import X.C51949G8s;
import com.instagram.common.session.UserSession;

public final class SpamFollowRequestsNetworkDataSource implements C51949G8s {
    public final UserSession A00;
    public final C47289DuI A01;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AOR(X.AnonymousClass4D7 r9) {
        /*
            r8 = this;
            r6 = 3
            boolean r0 = X.ME6.A02(r6, r9)
            if (r0 == 0) goto L_0x0047
            r5 = r9
            X.ME6 r5 = (X.ME6) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0047
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r5.A01
            X.1Hj r7 = X.1Hj.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 != r4) goto L_0x004f
            X.0eS.A00(r0)
        L_0x0023:
            return r0
        L_0x0024:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1NY r3 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "friendships/remove_all_spam_requests/"
            r3.A0A(r0)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2 = 0
            X.1OC r1 = X.DbU.A0S(r3, r1, r0)
            r5.A00 = r4
            r0 = 28653216(0x1b536a0, float:6.656728E-38)
            java.lang.Object r0 = r1.A02(r5, r0, r6, r2)
            if (r0 != r7) goto L_0x0023
            return r7
        L_0x0047:
            r0 = 42
            X.ME6 r5 = new X.ME6
            r5.<init>(r8, r9, r6, r0)
            goto L_0x0015
        L_0x004f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource.AOR(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AUv(X.AnonymousClass4D7 r11, boolean r12) {
        /*
            r10 = this;
            r3 = 6
            r4 = r11
            boolean r0 = X.C66138MDq.A02(r3, r11)
            if (r0 == 0) goto L_0x0073
            r6 = r4
            X.MDq r6 = (X.C66138MDq) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0073
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r9 = 0
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 != r3) goto L_0x0098
            java.lang.Object r0 = r6.A01
            com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource r0 = (com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource) r0
            X.0eS.A00(r2)
        L_0x002a:
            X.3Ii r2 = (X.C239803Ii) r2
            X.DuI r0 = r0.A01
            X.34p r1 = r0.A00
            r1.A08(r4)
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x009d
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.7dA r0 = (X.C335567dA) r0
            X.7dB r0 = r0.A03
            if (r0 != 0) goto L_0x0079
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0049:
            X.0eS.A00(r2)
            com.instagram.common.session.UserSession r0 = r10.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "friendships/pending_spam/"
            r2.A0A(r0)
            java.lang.String r0 = "response_without_su"
            r2.A0H(r0, r12)
            java.lang.Class<X.7dA> r1 = X.C335567dA.class
            java.lang.Class<X.7d9> r0 = X.C335557d9.class
            X.1OC r1 = X.DbT.A0R(r4, r2, r1, r0, r9)
            r6.A01 = r10
            r6.A00 = r3
            r0 = 28653216(0x1b536a0, float:6.656728E-38)
            java.lang.Object r2 = r1.A00(r0, r6)
            if (r2 == r5) goto L_0x00be
            r0 = r10
            goto L_0x002a
        L_0x0073:
            X.MDq r6 = new X.MDq
            r6.<init>(r10, r11, r3)
            goto L_0x0016
        L_0x0079:
            X.0sn r5 = X.0sn.A00
            java.util.List r4 = r0.A03
            if (r4 != 0) goto L_0x0080
            r4 = r5
        L_0x0080:
            java.lang.Integer r0 = r0.A02
            int r8 = X.C51967G9n.A04(r0, r9)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.ENG r3 = new X.ENG
            r3.<init>(r0)
            int r6 = r4.size()
            r7 = -1
            X.Drl r2 = new X.Drl
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00b6
        L_0x0098:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x009d:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00bf
            X.Drl r2 = new X.Drl
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.ENF r3 = new X.ENF
            r3.<init>(r0)
            X.0sn r4 = X.0sn.A00
            int r6 = r4.size()
            r7 = -1
            r5 = r4
            r8 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L_0x00b6:
            r1.A05()
            X.0rr r5 = new X.0rr
            r5.<init>(r2)
        L_0x00be:
            return r5
        L_0x00bf:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource.AUv(X.4D7, boolean):java.lang.Object");
    }

    public final void CgS() {
    }

    public SpamFollowRequestsNetworkDataSource(UserSession userSession, C47289DuI duI) {
        this.A00 = userSession;
        this.A01 = duI;
    }
}
