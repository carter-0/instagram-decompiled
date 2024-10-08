package com.instagram.urlhandlers.achievementsdetailbottomsheet;

import X.08y;
import X.09i;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class IgAchievementsDetailBottomSheetUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.achievementsdetailbottomsheet.IgAchievementsDetailBottomSheetUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.urlhandlers.achievementsdetailbottomsheet.IgAchievementsDetailBottomSheetUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (isDestroyed() == false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = -1209553085(0xffffffffb7e7af43, float:-2.7618958E-5)
            int r2 = X.AnonymousClass0fD.A00(r0)
            super.onCreate(r10)
            if (r10 == 0) goto L_0x0013
            r0 = 1237827041(0x49c7bde1, float:1636284.1)
        L_0x000f:
            X.AnonymousClass0fD.A07(r0, r2)
            return
        L_0x0013:
            android.os.Bundle r3 = X.DbX.A0A(r9)
            if (r3 != 0) goto L_0x0020
            r9.finish()
            r0 = -690845256(0xffffffffd6d289b8, float:-1.1574447E14)
            goto L_0x000f
        L_0x0020:
            java.lang.String r1 = X.DbS.A0m(r3)
            if (r1 != 0) goto L_0x002d
            r9.finish()
            r0 = 1606040989(0x5fba3d9d, float:2.684011E19)
            goto L_0x000f
        L_0x002d:
            X.0wW r5 = r9.getSession()
            boolean r0 = r5 instanceof com.instagram.common.session.UserSession
            if (r0 != 0) goto L_0x003c
            X.FFQ.A01(r9, r3, r5)
        L_0x0038:
            r0 = 541992534(0x204e2656, float:1.7461563E-19)
            goto L_0x000f
        L_0x003c:
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.2ZQ r0 = X.C71172bH.A00()
            if (r0 == 0) goto L_0x007f
            X.2ZQ r4 = X.C71172bH.A00()
            X.DbS.A1X(r4)
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            X.0hq r0 = X.C229102mq.A00(r4)
            boolean r0 = r0.A12()
            if (r0 != 0) goto L_0x0083
            X.0hq r0 = X.C229102mq.A00(r4)
            boolean r0 = r0.A0G
            if (r0 != 0) goto L_0x0083
            r6 = 0
            android.net.Uri r1 = X.DbT.A09(r1)
            java.lang.String r7 = X.DbZ.A0h(r1)
            java.lang.String r0 = "achievement_id"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x007f
            X.1ZU r3 = X.C48794EkH.A00()
            java.util.List r8 = X.AnonymousClass7TE.A1I(r0)
            r3.A04(r4, r5, r6, r7, r8)
        L_0x007f:
            r9.finish()
            goto L_0x0038
        L_0x0083:
            boolean r0 = r9.isFinishing()
            if (r0 != 0) goto L_0x0038
            boolean r0 = r9.isDestroyed()
            if (r0 != 0) goto L_0x0038
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.achievementsdetailbottomsheet.IgAchievementsDetailBottomSheetUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
