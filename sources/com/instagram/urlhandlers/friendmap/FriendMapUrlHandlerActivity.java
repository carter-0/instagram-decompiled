package com.instagram.urlhandlers.friendmap;

import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class FriendMapUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.urlhandlers.friendmap.FriendMapUrlHandlerActivity, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r2.equals("friend_map_location_shared") != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (r2.equals("friend_map") == false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = -767683731(0xffffffffd23e136d, float:-2.04092424E11)
            int r4 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r8)
            android.os.Bundle r2 = X.DbX.A0A(r7)
            if (r2 == 0) goto L_0x0061
            java.lang.String r1 = X.DbS.A0m(r2)
            if (r1 == 0) goto L_0x0061
            X.0wW r5 = X.DbS.A0S(r7)
            boolean r0 = r5 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0098
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            android.net.Uri r6 = X.DbT.A09(r1)
            java.lang.String r2 = r6.getHost()
            if (r2 == 0) goto L_0x0061
            int r1 = r2.hashCode()
            r0 = -1756340165(0xffffffff9750603b, float:-6.7329885E-25)
            if (r1 == r0) goto L_0x008f
            r0 = -1100097286(0xffffffffbe6dd8fa, float:-0.23227301)
            if (r1 == r0) goto L_0x0085
            r0 = -145701845(0xfffffffff750c42b, float:-4.2342832E33)
            if (r1 != r0) goto L_0x0061
            java.lang.String r0 = "friend_map_location_shared"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0061
        L_0x0045:
            r3 = 0
        L_0x0046:
            boolean r0 = X.C324536zU.A00(r5)
            if (r0 == 0) goto L_0x006b
            r1 = 0
            java.lang.String r0 = "friends_map"
            X.3GP r0 = X.FFO.A00(r7, r5, r0, r1)
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.Frr r2 = new X.Frr
            r2.<init>(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
        L_0x0061:
            r7.finish()
        L_0x0064:
            r0 = 1268940502(0x4ba27ed6, float:2.1298604E7)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x006b:
            X.2ZQ r0 = X.C71172bH.A00()
            if (r0 == 0) goto L_0x0081
            X.1q6 r2 = X.AnonymousClass3HE.A00()
            X.FAr r1 = com.instagram.friendmap.configs.FriendMapLaunchConfig.A0C
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            com.instagram.friendmap.configs.FriendMapLaunchConfig r0 = r1.A01(r6, r5, r0, r3)
            r2.A02(r7, r5, r0)
            goto L_0x0061
        L_0x0081:
            X.DbZ.A0v(r7, r6)
            goto L_0x0061
        L_0x0085:
            java.lang.String r0 = "friend_map_audience_settings"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0061
            r3 = 1
            goto L_0x0046
        L_0x008f:
            java.lang.String r0 = "friend_map"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0045
            goto L_0x0061
        L_0x0098:
            X.FFQ.A01(r7, r2, r5)
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.friendmap.FriendMapUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
