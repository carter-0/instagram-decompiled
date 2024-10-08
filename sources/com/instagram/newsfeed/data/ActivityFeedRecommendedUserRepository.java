package com.instagram.newsfeed.data;

import X.AnonymousClass2f1;
import X.AnonymousClass43D;
import X.C252733pa;
import X.C294705mt;
import X.C333967aR;
import com.instagram.common.session.UserSession;

public final class ActivityFeedRecommendedUserRepository extends C252733pa {
    public final UserSession A00;
    public final AnonymousClass2f1 A01;
    public final C294705mt A02;
    public final C333967aR A03;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.user.model.FollowStatus r8, X.EWA r9, com.instagram.user.model.User r10, X.AnonymousClass4D7 r11) {
        /*
            r7 = this;
            r3 = 8
            boolean r0 = X.ME1.A02(r3, r11)
            if (r0 == 0) goto L_0x009f
            r6 = r11
            X.ME1 r6 = (X.ME1) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009f
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A06
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x006a
            if (r0 != r4) goto L_0x00a6
            java.lang.Object r3 = r6.A05
            X.4ax r3 = (X.C267094ax) r3
            java.lang.Object r9 = r6.A04
            X.EWA r9 = (X.EWA) r9
            java.lang.Object r8 = r6.A03
            com.instagram.user.model.FollowStatus r8 = (com.instagram.user.model.FollowStatus) r8
            java.lang.Object r10 = r6.A02
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.Object r2 = r6.A01
            com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository r2 = (com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository) r2
            X.0eS.A00(r1)
        L_0x0039:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0061
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            X.7aR r0 = r2.A03
            X.EC7 r0 = r0.AM5(r3, r9, r10)
            r0.onSuccess(r1)
        L_0x004c:
            com.instagram.common.session.UserSession r0 = r2.A00
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.String r1 = r10.getId()
            X.3KA r0 = new X.3KA
            r0.<init>(r8, r1)
            r2.A00(r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0061:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x006a:
            X.0eS.A00(r1)
            X.5mt r2 = r7.A02
            r2.A0D(r8, r10, r4)
            boolean r0 = X.C294695ms.A02(r9)
            if (r0 == 0) goto L_0x0083
            X.2f1 r1 = r7.A01
            java.lang.String r0 = new java.lang.String
            r0.<init>()
            X.4ax r3 = r1.A0L(r9, r10, r0)
        L_0x0083:
            X.1OC r1 = r2.A05(r9, r10)
            r6.A01 = r7
            r6.A02 = r10
            r6.A03 = r8
            r6.A04 = r9
            r6.A05 = r3
            r6.A00 = r4
            r0 = 1201781838(0x47a1bc4e, float:82808.61)
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r5) goto L_0x009d
            return r5
        L_0x009d:
            r2 = r7
            goto L_0x0039
        L_0x009f:
            X.ME1 r6 = new X.ME1
            r6.<init>(r7, r11, r3)
            goto L_0x0016
        L_0x00a6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository.A00(com.instagram.user.model.FollowStatus, X.EWA, com.instagram.user.model.User, X.4D7):java.lang.Object");
    }

    public ActivityFeedRecommendedUserRepository(UserSession userSession, AnonymousClass2f1 r4, C294705mt r5, C333967aR r6) {
        super("Activity", AnonymousClass43D.A00(1396732746));
        this.A00 = userSession;
        this.A03 = r6;
        this.A02 = r5;
        this.A01 = r4;
    }
}
