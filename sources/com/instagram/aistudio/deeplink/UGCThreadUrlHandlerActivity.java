package com.instagram.aistudio.deeplink;

import X.AnonymousClass0iw;
import android.os.Bundle;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class UGCThreadUrlHandlerActivity extends UserSessionUrlHandlerActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, com.instagram.aistudio.deeplink.UGCThreadUrlHandlerActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = X.DbT.A09(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0n(android.os.Bundle r9, android.os.Bundle r10, com.instagram.common.session.UserSession r11) {
        /*
            r8 = this;
            r7 = 1
            r2 = r11
            X.AnonymousClass7TF.A1B(r11, r7, r10)
            X.0eE r0 = X.AnonymousClass0t1.A01
            r0.A01(r11)
            java.lang.String r0 = X.DbS.A0m(r10)
            r3 = r8
            if (r0 == 0) goto L_0x0035
            r6 = 0
            android.net.Uri r1 = X.DbT.A09(r0)
            java.lang.String r0 = "bot_id"
            java.lang.String r4 = r1.getQueryParameter(r0)
            if (r4 == 0) goto L_0x0035
            java.lang.String r0 = "entry_point"
            java.lang.String r5 = r1.getQueryParameter(r0)
            if (r5 != 0) goto L_0x0028
            java.lang.String r5 = "unknown"
        L_0x0028:
            X.0xx r0 = X.DbW.A0E(r8)
            X.Pfh r1 = new X.Pfh
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r1, r0)
            return
        L_0x0035:
            r8.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.aistudio.deeplink.UGCThreadUrlHandlerActivity.A0n(android.os.Bundle, android.os.Bundle, com.instagram.common.session.UserSession):void");
    }

    public final String getModuleName() {
        return "UGCThreadUrlHandlerActivity";
    }
}
