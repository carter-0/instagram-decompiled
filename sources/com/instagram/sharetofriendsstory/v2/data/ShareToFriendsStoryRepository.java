package com.instagram.sharetofriendsstory.v2.data;

import X.AnonymousClass43D;
import X.C252733pa;
import X.LRl;
import com.instagram.common.session.UserSession;

public final class ShareToFriendsStoryRepository extends C252733pa {
    public final LRl A00;
    public final UserSession A01;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 35
            boolean r0 = X.MEB.A03(r3, r7)
            if (r0 == 0) goto L_0x0064
            r5 = r7
            X.MEB r5 = (X.MEB) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0064
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r3) goto L_0x0077
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0069
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.CFe r0 = (X.C43838CFe) r0
            java.util.List r0 = r0.A00
            X.3Ih r4 = X.C41845B3m.A0d(r0)
            return r4
        L_0x0037:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A01
            X.1NY r2 = X.DbZ.A0M(r0)
            java.lang.String r0 = "friendships/share_to_friends_story_suggested_users/"
            r2.A0A(r0)
            r0 = 41
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.String r0 = "share_to_friends_story_share_sheet"
            r2.A9m(r1, r0)
            java.lang.Class<X.CFe> r1 = X.C43838CFe.class
            java.lang.Class<X.D2W> r0 = X.D2W.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r5.A00 = r3
            r0 = 1006961414(0x3c050306, float:0.008118397)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0064:
            X.MEB r5 = X.MEB.A00(r6, r7, r3)
            goto L_0x0016
        L_0x0069:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0072
            X.5sO r4 = X.DbU.A0f()
            return r4
        L_0x0072:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.sharetofriendsstory.v2.data.ShareToFriendsStoryRepository.A00(X.4D7):java.lang.Object");
    }

    public ShareToFriendsStoryRepository(UserSession userSession, LRl lRl) {
        super("ShareToFriendsStory", AnonymousClass43D.A00(1006961414));
        this.A01 = userSession;
        this.A00 = lRl;
    }
}
