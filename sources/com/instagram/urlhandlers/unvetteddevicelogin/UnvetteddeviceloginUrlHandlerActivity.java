package com.instagram.urlhandlers.unvetteddevicelogin;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0aP;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C46649DiU;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dba;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

public final class UnvetteddeviceloginUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.unvetteddevicelogin.UnvetteddeviceloginUrlHandlerActivity, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        IllegalArgumentException illegalArgumentException;
        int A00 = AnonymousClass0fD.A00(-450290565);
        super.onCreate(bundle);
        08y r1 = 09i.A0A;
        if (!(r1.A05(this) instanceof AnonymousClass0aP)) {
            finish();
            i = -1614041078;
        } else {
            Bundle A0A = DbX.A0A(this);
            if (!(A0A == null || (A0m = DbS.A0m(A0A)) == null)) {
                try {
                    Uri A09 = DbT.A09(A0m);
                    String queryParameter = A09.getQueryParameter("contact_point");
                    if (queryParameter != null) {
                        String queryParameter2 = A09.getQueryParameter("token");
                        if (queryParameter2 != null) {
                            AnonymousClass0wW A05 = r1.A05(this);
                            0qQ.A0C(A05, AnonymousClass000.A00(36));
                            0qQ.A0B(A05, 1);
                            HashMap A0f = Dba.A0f("contact_point", queryParameter);
                            A0f.put("token", queryParameter2);
                            IgBloksScreenConfig A0N = DbS.A0N(A05);
                            A0N.A0R = "com.bloks.www.caa.ar.shared_phone_cp_recovery_link";
                            C46649DiU.A08(this, A0N, "com.bloks.www.caa.ar.shared_phone_cp_recovery_link", A0f, AnonymousClass7TE.A1E());
                        } else {
                            illegalArgumentException = AnonymousClass7TE.A0w("Nonce is null!");
                        }
                    } else {
                        illegalArgumentException = AnonymousClass7TE.A0w("Contact point is null!");
                    }
                    throw illegalArgumentException;
                } catch (SecurityException unused) {
                    finish();
                    i = 1687303109;
                } catch (IllegalArgumentException unused2) {
                    finish();
                    i = 1921312405;
                }
            }
            i = -224800954;
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
