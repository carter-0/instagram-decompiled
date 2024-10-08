package com.facebook.oauthaccountlinking;

import X.C58840Ae;
import X.C66582MXn;
import X.SGW;
import X.T9K;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.LinkedHashMap;

public abstract class OAuthAccountLinkingActivityBase extends FragmentActivity {
    public Bundle A00 = new Bundle(0);
    public C58840Ae A01;
    public T9K A02;
    public String A03 = "";

    public static final void A00(OAuthAccountLinkingActivityBase oAuthAccountLinkingActivityBase, Integer num, Long l, String str, String str2) {
        long j;
        String string = oAuthAccountLinkingActivityBase.A00.getString("source");
        String str3 = "";
        if (string == null) {
            string = str3;
        }
        LinkedHashMap A0y = C66582MXn.A0y("source", string);
        String string2 = oAuthAccountLinkingActivityBase.A00.getString("token_source");
        if (string2 == null) {
            string2 = str3;
        }
        A0y.put("token_source", string2);
        String string3 = oAuthAccountLinkingActivityBase.A00.getString("ad_id");
        if (string3 != null) {
            str3 = string3;
        }
        A0y.put("ad_id", str3);
        A0y.put("app_session_id", String.valueOf(oAuthAccountLinkingActivityBase.A00.getString("app_session_id")));
        if (l != null) {
            j = l.longValue();
        } else {
            j = oAuthAccountLinkingActivityBase.A00.getLong("expiry_time", 0);
        }
        SGW.A00.A00(oAuthAccountLinkingActivityBase.A01, num, oAuthAccountLinkingActivityBase.A03, str, str2, A0y, j);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if ((r1 instanceof X.T9K) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r5 = this;
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "oauth_account_linking_provider"
            r2 = 0
            r0 = 33
            android.content.Intent r1 = r5.getIntent()
            if (r4 < r0) goto L_0x001c
            if (r1 == 0) goto L_0x0019
            java.lang.Class<X.T9K> r0 = X.T9K.class
            java.io.Serializable r1 = r1.getSerializableExtra(r3, r0)
        L_0x0016:
            r2 = r1
            X.T9K r2 = (X.T9K) r2
        L_0x0019:
            r5.A02 = r2
            return
        L_0x001c:
            if (r1 == 0) goto L_0x0027
            java.io.Serializable r1 = r1.getSerializableExtra(r3)
        L_0x0022:
            boolean r0 = r1 instanceof X.T9K
            if (r0 == 0) goto L_0x0019
            goto L_0x0016
        L_0x0027:
            r1 = r2
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.oauthaccountlinking.OAuthAccountLinkingActivityBase.A01():void");
    }
}
