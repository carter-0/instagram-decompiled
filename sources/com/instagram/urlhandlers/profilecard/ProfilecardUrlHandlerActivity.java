package com.instagram.urlhandlers.profilecard;

import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ProfilecardUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "profilecard_url_handler";
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.profilecard.ProfilecardUrlHandlerActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = 1698534338(0x653d93c2, float:5.5953307E22)
            int r3 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r11)
            android.os.Bundle r4 = X.DbX.A0A(r10)
            if (r4 != 0) goto L_0x001a
            r10.finish()
            r0 = 1849006467(0x6e359983, float:1.4050593E28)
        L_0x0016:
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x001a:
            java.lang.String r7 = X.DbS.A0m(r4)
            if (r7 != 0) goto L_0x0027
            r10.finish()
            r0 = -998690368(0xffffffffc47931c0, float:-996.77734)
            goto L_0x0016
        L_0x0027:
            X.08y r6 = X.09i.A0A
            X.0wW r0 = r6.A05(r10)
            boolean r0 = r0 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x003b
            X.FFQ.A02(r10, r4, r6)
            r10.finish()
            r0 = 1145096651(0x4440c9cb, float:771.153)
            goto L_0x0016
        L_0x003b:
            X.0wW r9 = r6.A05(r10)
            X.DbS.A1Z(r9)
            com.instagram.common.session.UserSession r9 = (com.instagram.common.session.UserSession) r9
            android.net.Uri r5 = X.DbT.A09(r7)
            r8 = 0
            X.0Tu r2 = X.DbS.A0J(r9, r8)
            r0 = 36327426095200680(0x810f9a000239a8, double:3.036948769184086E-306)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x00a6
            android.net.Uri r0 = X.DbT.A09(r7)
            java.util.List r7 = r0.getPathSegments()
            java.lang.String r1 = X.AnonymousClass7TE.A19(r7, r8)
            java.lang.String r0 = "myprofilecard"
            boolean r0 = r1.equals(r0)
            java.lang.String r2 = "InstagramUrlLaunchConstants.EXTRA_USER_NAME"
            if (r0 == 0) goto L_0x009a
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r9)
            java.lang.String r0 = r0.getUsername()
        L_0x0076:
            r4.putString(r2, r0)
        L_0x0079:
            X.2ZQ r0 = X.C71172bH.A00()
            if (r0 == 0) goto L_0x008a
            X.0wW r0 = r6.A05(r10)
            X.FHB.A0A(r4, r10, r0)
        L_0x0086:
            r0 = -234572270(0xfffffffff204b612, float:-2.6286164E30)
            goto L_0x0016
        L_0x008a:
            android.net.Uri$Builder r0 = r5.buildUpon()
            android.net.Uri$Builder r0 = r0.clearQuery()
            android.net.Uri r0 = r0.build()
            X.DbZ.A0v(r10, r0)
            goto L_0x0086
        L_0x009a:
            int r1 = r7.size()
            r0 = 2
            if (r1 < r0) goto L_0x0079
            java.lang.String r0 = X.AnonymousClass7TE.A19(r7, r8)
            goto L_0x0076
        L_0x00a6:
            java.lang.String r0 = "mainfeed"
            X.DbZ.A11(r5, r4, r0)
            X.FHB.A03(r10, r4)
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.profilecard.ProfilecardUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
