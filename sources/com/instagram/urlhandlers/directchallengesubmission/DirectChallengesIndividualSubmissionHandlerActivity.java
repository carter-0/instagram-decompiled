package com.instagram.urlhandlers.directchallengesubmission;

import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class DirectChallengesIndividualSubmissionHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.urlhandlers.directchallengesubmission.DirectChallengesIndividualSubmissionHandlerActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = X.DbT.A09(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0n(android.os.Bundle r9, android.os.Bundle r10, com.instagram.common.session.UserSession r11) {
        /*
            r8 = this;
            X.AnonymousClass7TG.A1O(r11, r10)
            java.lang.String r1 = X.DbS.A0m(r10)
            if (r1 == 0) goto L_0x0064
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0064
            android.net.Uri r0 = X.DbT.A09(r1)
            java.lang.String r7 = "thread_id"
            java.lang.String r2 = r0.getQueryParameter(r7)
            if (r2 == 0) goto L_0x0064
            java.lang.String r6 = "collection_id"
            java.lang.String r5 = r0.getQueryParameter(r6)
            if (r5 == 0) goto L_0x0064
            java.lang.String r4 = "collection_type"
            java.lang.String r1 = r0.getQueryParameter(r4)
            if (r1 == 0) goto L_0x0064
            java.lang.String r3 = "submission_id"
            java.lang.String r0 = r0.getQueryParameter(r3)
            if (r0 == 0) goto L_0x0064
            android.os.Bundle r2 = X.DbV.A0C(r7, r2)
            r2.putString(r6, r5)
            r2.putString(r4, r1)
            r2.putString(r3, r0)
            java.lang.String r0 = "DirectChallengesIndividualSubmissionHandlerActivity"
            X.0xG r1 = X.DbS.A0O(r0)
            java.lang.String r0 = "direct_tab"
            X.1pE r1 = X.1pE.A01(r8, r1, r11, r0)
            java.lang.String r0 = r2.getString(r7)
            if (r0 == 0) goto L_0x0068
            X.DbZ.A1Z(r1, r0)
            java.lang.String r0 = r2.getString(r6)
            r1.A0M = r0
            java.lang.String r0 = r2.getString(r3)
            r1.A0N = r0
            r1.A06()
        L_0x0064:
            r8.finish()
            return
        L_0x0068:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.directchallengesubmission.DirectChallengesIndividualSubmissionHandlerActivity.A0n(android.os.Bundle, android.os.Bundle, com.instagram.common.session.UserSession):void");
    }
}
