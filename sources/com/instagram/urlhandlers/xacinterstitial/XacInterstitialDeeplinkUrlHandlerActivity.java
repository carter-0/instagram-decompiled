package com.instagram.urlhandlers.xacinterstitial;

import X.0cp;
import X.1WK;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public class XacInterstitialDeeplinkUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.urlhandlers.xacinterstitial.XacInterstitialDeeplinkUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(225117045);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -1325885367;
        } else {
            this.A00 = DbT.A0W(A0A);
            String A0m = DbS.A0m(A0A);
            if (TextUtils.isEmpty(A0m)) {
                finish();
                i = -215932218;
            } else {
                Bundle bundle2 = null;
                try {
                    Uri A03 = 0cp.A03(A0m);
                    if ("instagram".equalsIgnoreCase(A03.getScheme())) {
                        String A003 = AnonymousClass000.A00(1266);
                        String queryParameter = A03.getQueryParameter(A003);
                        String A004 = AnonymousClass000.A00(1264);
                        String queryParameter2 = A03.getQueryParameter(A004);
                        if (!(queryParameter == null || queryParameter2 == null)) {
                            bundle2 = DbV.A0C(A003, queryParameter);
                            bundle2.putString(A004, queryParameter2);
                        }
                    }
                } catch (SecurityException unused) {
                }
                bundle2.getClass();
                A0A.putAll(bundle2);
                if (!(this.A00 instanceof UserSession)) {
                    1WK A005 = FFQ.A00();
                    AnonymousClass0wW r0 = this.A00;
                    r0.getClass();
                    A005.A00(this, A0A, r0);
                }
                i = -768411249;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
